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

import com.amf.registration.profile.model.UserProfile;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.Map;

/**
 * Provides the remote service utility for UserProfile. This utility wraps
 * <code>com.amf.registration.profile.service.impl.UserProfileServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Heise
 * @see UserProfileService
 * @generated
 */
public class UserProfileServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.profile.service.impl.UserProfileServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Map<String, Boolean> getPermissions(
			String screenName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getPermissions(screenName, serviceContext);
	}

	public static Map<String, Boolean> getPermissionsByUserId(
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getPermissionsByUserId(userId, serviceContext);
	}

	public static Map<String, String> getPermissionSettings(
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getPermissionSettings(userId, serviceContext);
	}

	public static UserProfile getUserProfile(
			String screenName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getUserProfile(screenName, serviceContext);
	}

	public static UserProfile getUserProfileById(
			long userId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().getUserProfileById(userId, serviceContext);
	}

	public static UserProfile updateUserProfile(
			String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth, int birthDay, String aboutMe,
			String favoriteQuotes, String favoriteMovie, long favoriteGenreId,
			String leastFavMovie, String favoriteActor,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateUserProfile(
			screenName, firstName, lastName, male, birthYear, birthMonth,
			birthDay, aboutMe, favoriteQuotes, favoriteMovie, favoriteGenreId,
			leastFavMovie, favoriteActor, serviceContext);
	}

	public static UserProfileService getService() {
		return _service;
	}

	private static volatile UserProfileService _service;

}