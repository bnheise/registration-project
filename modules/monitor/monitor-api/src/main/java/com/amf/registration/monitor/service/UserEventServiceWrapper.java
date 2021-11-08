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

package com.amf.registration.monitor.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserEventService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventService
 * @generated
 */
public class UserEventServiceWrapper
	implements ServiceWrapper<UserEventService>, UserEventService {

	public UserEventServiceWrapper(UserEventService userEventService) {
		_userEventService = userEventService;
	}

	@Override
	public com.amf.registration.monitor.model.UserEvent addUserEvent(
		String type,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _userEventService.addUserEvent(type, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEventService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<java.util.HashMap<String, Object>> getUserEvents(
		int start, int end) {

		return _userEventService.getUserEvents(start, end);
	}

	@Override
	public UserEventService getWrappedService() {
		return _userEventService;
	}

	@Override
	public void setWrappedService(UserEventService userEventService) {
		_userEventService = userEventService;
	}

	private UserEventService _userEventService;

}