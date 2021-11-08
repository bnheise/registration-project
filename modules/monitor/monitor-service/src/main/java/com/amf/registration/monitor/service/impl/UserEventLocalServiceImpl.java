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

import com.amf.registration.monitor.model.UserEvent;
import com.amf.registration.monitor.service.base.UserEventLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.service.ServiceContext;

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
@Component(property = "model.class.name=com.amf.registration.monitor.model.UserEvent", service = AopService.class)
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
	public UserEvent addUserEvent(String type, ServiceContext serviceContext) {
		long userEventId = counterLocalService.increment(UserEvent.class.getName());
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		Date createDate = serviceContext.getCreateDate(new Date());
		Date modifiedDate = serviceContext.getModifiedDate(new Date());
		String ipAddress = serviceContext.getRemoteAddr();

		UserEvent userEvent = createUserEvent(userEventId);
		userEvent.setGroupId(groupId);
		userEvent.setCompanyId(companyId);
		userEvent.setUserId(userId);
		userEvent.setCreateDate(createDate);
		userEvent.setModifiedDate(modifiedDate);
		userEvent.setIpAddress(ipAddress);
		userEvent.setType(type);
		return super.addUserEvent(userEvent);
	}

	// @Override
	// public List<UserEvent> findAll(int start, int end) {
	// }
}