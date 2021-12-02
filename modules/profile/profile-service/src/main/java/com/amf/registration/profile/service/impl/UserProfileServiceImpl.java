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

import java.time.LocalDate;
import java.time.ZoneId;

import com.amf.registration.profile.constants.ProfileConstants;
import com.amf.registration.profile.model.GeneralProfile;
import com.amf.registration.profile.model.MovieInterest;
import com.amf.registration.profile.model.UserProfile;
import com.amf.registration.profile.service.GeneralProfileLocalService;
import com.amf.registration.profile.service.MovieInterestLocalService;
import com.amf.registration.profile.service.base.UserProfileServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

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
		User user = UserLocalServiceUtil.getUserByScreenName(serviceContext.getCompanyId(), screenName);
		UserProfile userProfile = userProfilePersistence.create(user.getUserId());
		userProfile.setFirstName(user.getFirstName());
		userProfile.setLastName(user.getLastName());
		userProfile.setMale(user.getMale());
		LocalDate birthdate = user.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		userProfile.setBirthYear(birthdate.getYear());
		userProfile.setBirthMonth(birthdate.getMonthValue());
		userProfile.setBirthDay(birthdate.getDayOfMonth());

		GeneralProfile generalProfile = generalProfileLocalService.getGeneralProfileByUserId(user.getUserId(),
				serviceContext);
		System.out.println(generalProfileModelResourcePermission.contains(getPermissionChecker(), generalProfile.getGeneralProfileId(), "VIEW_ABOUT_ME"));
		userProfile.setAboutMe(generalProfile.getAboutMe());
		userProfile.setFavoriteQuotes(generalProfile.getFavoriteQuotes());

		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(user.getUserId(),
				serviceContext);
		userProfile.setFavoriteActor(movieInterest.getFavoriteActor());
		userProfile.setFavoriteGenre(movieInterest.getFavoriteGenre());
		userProfile.setFavoriteMovie(movieInterest.getFavoriteMovie());
		userProfile.setLeastFavMovie(movieInterest.getLeastFavMovie());
		return userProfile;
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

	@Reference
	GeneralProfileLocalService generalProfileLocalService;

	@Reference
	MovieInterestLocalService movieInterestLocalService;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(model.class.name=com.amf.registration.profile.model.GeneralProfile)")
	private volatile ModelResourcePermission<GeneralProfile> generalProfileModelResourcePermission;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(resource.name="
			+ ProfileConstants.RESOURCE_NAME + ")")
	private volatile PortletResourcePermission portletResourcePermission;
}