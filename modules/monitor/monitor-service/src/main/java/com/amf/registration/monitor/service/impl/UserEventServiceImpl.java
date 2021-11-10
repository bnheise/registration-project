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

import java.util.HashMap;
import java.util.List;

import com.amf.registration.monitor.constants.MonitorConstants;
import com.amf.registration.monitor.model.UserEvent;
import com.amf.registration.monitor.service.base.UserEventServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the user event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.registration.monitor.service.UserEventService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventServiceBaseImpl
 */
@Component(property = {
		"json.web.service.context.name=monitor",
		"json.web.service.context.path=UserEvent"
}, service = AopService.class)
public class UserEventServiceImpl extends UserEventServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.amf.registration.monitor.service.UserEventServiceUtil</code> to
	 * access the user event remote service.
	 */

	@Override
	public List<HashMap<String, Object>> getUserEvents(int start, int end,
			ServiceContext serviceContext)
			throws PortalException {

		if (portletResourcePermission.contains(getPermissionChecker(), serviceContext.getScopeGroup(), "VIEW_ALL")) {
			return userEventLocalService.getUserEventsWithScreenName(start, end);
		} else {
			return userEventLocalService.getUserEventsForCurrentUser(start, end, serviceContext.getUserId());
		}
	}

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(model.class.name=com.amf.registration.monitor.model.UserEvent)")
	private volatile ModelResourcePermission<UserEvent> userEventModelResourcePermission;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(resource.name="
			+ MonitorConstants.RESOURCE_NAME + ")")
	private volatile PortletResourcePermission portletResourcePermission;
}