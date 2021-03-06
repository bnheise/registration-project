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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for UserProfile. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Heise
 * @see UserProfileServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface UserProfileService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.amf.registration.profile.service.impl.UserProfileServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the user profile remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link UserProfileServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Map<String, Boolean> getPermissions(
			String screenName, ServiceContext serviceContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Map<String, Boolean> getPermissionsByUserId(
			long userId, ServiceContext serviceContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Map<String, String> getPermissionSettings(
			long userId, ServiceContext serviceContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public UserProfile getUserProfile(
			String screenName, ServiceContext serviceContext)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public UserProfile getUserProfileById(
			long userId, ServiceContext serviceContext)
		throws PortalException;

	public Map<String, String> updatePermissionSettings(
			String viewBasicInfo, String viewFirstName, String viewLastName,
			String viewMale, String viewBirthday, String viewGeneralProfile,
			String viewAboutMe, String viewFavoriteQuotes,
			String viewMovieInterest, String viewFavoriteMovie,
			String viewFavoriteActor, String viewFavoriteGenre,
			String viewLeastFavMovie, ServiceContext serviceContext)
		throws PortalException;

	public UserProfile updateUserProfile(
			String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth, int birthDay, String aboutMe,
			String favoriteQuotes, String favoriteMovie, long favoriteGenreId,
			String leastFavMovie, String favoriteActor,
			ServiceContext serviceContext)
		throws PortalException;

}