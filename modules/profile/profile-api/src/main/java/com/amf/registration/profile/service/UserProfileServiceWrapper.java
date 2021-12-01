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

package com.amf.registration.profile.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserProfileService}.
 *
 * @author Brian Heise
 * @see UserProfileService
 * @generated
 */
public class UserProfileServiceWrapper
	implements ServiceWrapper<UserProfileService>, UserProfileService {

	public UserProfileServiceWrapper(UserProfileService userProfileService) {
		_userProfileService = userProfileService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userProfileService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.amf.registration.profile.model.UserProfile>
		getUserProfile(String screenname) {

		return _userProfileService.getUserProfile(screenname);
	}

	@Override
	public UserProfileService getWrappedService() {
		return _userProfileService;
	}

	@Override
	public void setWrappedService(UserProfileService userProfileService) {
		_userProfileService = userProfileService;
	}

	private UserProfileService _userProfileService;

}