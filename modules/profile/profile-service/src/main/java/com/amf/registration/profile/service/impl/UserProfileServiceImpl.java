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

package com.amf.registration.profile.service.impl;

import com.amf.registration.profile.model.UserProfile;
import com.amf.registration.profile.service.base.UserProfileServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the user profile remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.registration.profile.service.UserProfileService</code>
 * interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Heise
 * @see UserProfileServiceBaseImpl
 */
@Component(property = {
		"json.web.service.context.name=userprofile",
		"json.web.service.context.path=UserProfile"
}, service = AopService.class)
public class UserProfileServiceImpl extends UserProfileServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.amf.registration.profile.service.UserProfileServiceUtil</code> to
	 * access the user profile remote service.
	 */

	@Override
	public UserProfile getUserProfile(String screenName, ServiceContext serviceContext) throws PortalException {
		return userProfileLocalService.getUserProfile(screenName, serviceContext);
	}

	@Override
	public UserProfile updateUserProfile(String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth,
			int birthDay, String aboutMe, String favoriteQuotes, String favoriteMovie, String favoriteGenre,
			String leastFavMovie, String favoriteActor, ServiceContext serviceContext) throws PortalException {

		return userProfileLocalService.updateUserProfile(screenName, firstName, lastName, male, birthYear, birthMonth,
				birthDay, aboutMe, favoriteQuotes, favoriteMovie, favoriteGenre, leastFavMovie, favoriteActor,
				serviceContext);
	}
}