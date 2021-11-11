/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.amf.registration.monitor.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.amf.registration.monitor.model.UserEvent;
import com.amf.registration.monitor.service.base.UserEventLocalServiceBaseImpl;
import com.amf.registration.monitor.service.persistence.impl.constants.UserEventTypes;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the user event local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.registration.monitor.service.UserEventLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventLocalServiceBaseImpl
 */
@Component(immediate = true, property = "model.class.name=com.amf.registration.monitor.model.UserEvent", service = AopService.class)
public class UserEventLocalServiceImpl extends UserEventLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.amf.registration.monitor.service.UserEventLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.amf.registration.monitor.service.UserEventLocalServiceUtil</code>.
	 */
	@Override
	public UserEvent addUserEvent(ServiceContext serviceContext) throws PortalException {
		long userEventId = counterLocalService.increment(UserEvent.class.getName());
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		Date createDate = serviceContext.getCreateDate(new Date());
		Date modifiedDate = serviceContext.getModifiedDate(new Date());

		UserEvent userEvent = createUserEvent(userEventId);
		userEvent.setGroupId(groupId);
		userEvent.setCompanyId(companyId);
		userEvent.setUserId(userId);
		userEvent.setCreateDate(createDate);
		userEvent.setModifiedDate(modifiedDate);
		userEvent.setIpAddress("0.0.0.0");
		userEvent.setType(UserEventTypes.REGISTRATION);
		userEvent = super.addUserEvent(userEvent);
		addPermissions(userEvent);
		return userEvent;
	}

	@Override
	public UserEvent addUserEvent(HttpServletRequest request) throws PortalException {

		_log.info("Attempting to add user event via HttpServletRequest...");
		long userEventId = counterLocalService.increment(UserEvent.class.getName());
		long groupId = PortalUtil.getScopeGroupId(request);
		long companyId = PortalUtil.getCompanyId(request);
		long userId = PortalUtil.getUserId(request);
		Date createDate = new Date();
		Date modifiedDate = new Date();
		String ipAddress = request.getRemoteAddr();

		UserEvent userEvent = createUserEvent(userEventId);
		userEvent.setGroupId(groupId);
		userEvent.setCompanyId(companyId);
		userEvent.setUserId(userId);
		userEvent.setCreateDate(createDate);
		userEvent.setModifiedDate(modifiedDate);
		userEvent.setIpAddress(ipAddress);
		userEvent.setType(UserEventTypes.LOGIN);
		userEvent = super.addUserEvent(userEvent);
		addPermissions(userEvent);
		_log.info("Success: new login event created for user " + userEvent.getUserId());
		return userEvent;

	}

	@Override
	public List<HashMap<String, Object>> getAllUserEvents(int start, int end) {

		return userEventFinder.findAll(start, end);
	}

	@Override
	public long countAllUserEvents() {

		return userEventFinder.countAll();
	}

	@Override
	public List<HashMap<String, Object>> getAllRegistrationEvents(int start, int end) {

		return userEventFinder.findType(start, end, UserEventTypes.REGISTRATION);
	}

	@Override
	public long countAllRegistrationEvents() {

		return userEventFinder.countType(UserEventTypes.REGISTRATION);
	}

	@Override
	public List<HashMap<String, Object>> getAllLoginEvents(int start, int end) {

		return userEventFinder.findType(start, end, UserEventTypes.LOGIN);
	}

	@Override
	public long countAllLoginEvents() {

		return userEventFinder.countType(UserEventTypes.LOGIN);
	}

	@Override
	public List<HashMap<String, Object>> getUserEventsForUser(int start, int end, long userId) {
		return userEventFinder.findAllForUser(start, end, userId);
	}

	@Override
	public long countUserEventsForUser(long userId) {
		return userEventFinder.countAllForUser(userId);
	}

	@Override
	public List<HashMap<String, Object>> getRegistrationEventsForUser(int start, int end, long userId) {
		return userEventFinder.findTypeForUser(start, end, userId, UserEventTypes.REGISTRATION);
	}

	@Override
	public long countRegistrationEventsForUser(long userId) {
		return userEventFinder.countTypeForUser(userId, UserEventTypes.REGISTRATION);
	}

	@Override
	public List<HashMap<String, Object>> getLoginEventsForUser(int start, int end, long userId) {
		return userEventFinder.findTypeForUser(start, end, userId, UserEventTypes.LOGIN);
	}

	@Override
	public long countLoginEventsForUser(long userId) {
		return userEventFinder.countTypeForUser(userId, UserEventTypes.LOGIN);
	}

	@Override
	public UserEvent deleteUserEvent(UserEvent userEvent) throws PortalException {
		resourceLocalService.deleteResource(userEvent.getCompanyId(), UserEvent.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, userEvent.getUserEventId());

		return super.deleteUserEvent(userEvent);
	}

	private void addPermissions(UserEvent userEvent) throws PortalException {
		boolean portletActions = true;
		boolean addGroupPermissions = true;
		boolean addGuestPermissions = true;
		resourceLocalService.addResources(userEvent.getCompanyId(), userEvent.getGroupId(), userEvent.getUserId(),
				UserEvent.class.getName(), userEvent.getUserEventId(), portletActions, addGroupPermissions,
				addGuestPermissions);
	}

	private static final Log _log = LogFactoryUtil.getLog(UserEventLocalServiceImpl.class);
}