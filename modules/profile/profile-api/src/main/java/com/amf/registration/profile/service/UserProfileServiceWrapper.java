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
	public java.util.Map<String, Boolean> getPermissions(
			String screenName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userProfileService.getPermissions(screenName, serviceContext);
	}

	@Override
	public java.util.Map<String, Boolean> getPermissionsByUserId(
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userProfileService.getPermissionsByUserId(
			userId, serviceContext);
	}

	@Override
	public com.amf.registration.profile.model.UserProfile getUserProfile(
			String screenName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userProfileService.getUserProfile(screenName, serviceContext);
	}

	@Override
	public com.amf.registration.profile.model.UserProfile getUserProfileById(
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userProfileService.getUserProfileById(userId, serviceContext);
	}

	@Override
	public com.amf.registration.profile.model.UserProfile updateUserProfile(
			String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth, int birthDay, String aboutMe,
			String favoriteQuotes, String favoriteMovie, long favoriteGenreId,
			String leastFavMovie, String favoriteActor,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userProfileService.updateUserProfile(
			screenName, firstName, lastName, male, birthYear, birthMonth,
			birthDay, aboutMe, favoriteQuotes, favoriteMovie, favoriteGenreId,
			leastFavMovie, favoriteActor, serviceContext);
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