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
import java.util.HashMap;
import java.util.Map;

import com.amf.registration.profile.constants.ProfileConstants;
import com.amf.registration.profile.internal.security.permission.resource.CustomActionKeys;
import com.amf.registration.profile.model.GeneralProfile;
import com.amf.registration.profile.model.MovieInterest;
import com.amf.registration.profile.model.UserProfile;
import com.amf.registration.profile.service.GeneralProfileLocalService;
import com.amf.registration.profile.service.GenreLocalService;
import com.amf.registration.profile.service.MovieInterestLocalService;
import com.amf.registration.profile.service.base.UserProfileServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;

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
		
		userProfile.setAboutMe(generalProfile.getAboutMe());
		userProfile.setFavoriteQuotes(generalProfile.getFavoriteQuotes());

		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(user.getUserId(),
				serviceContext);
		userProfile.setFavoriteActor(movieInterest.getFavoriteActor());
		userProfile.setFavoriteGenreId(movieInterest.getFavoriteGenreId());
		userProfile.setFavoriteGenre(genreLocalService.getGenre(movieInterest.getFavoriteGenreId()).getGenreName());
		userProfile.setFavoriteMovie(movieInterest.getFavoriteMovie());
		userProfile.setLeastFavMovie(movieInterest.getLeastFavMovie());
		return userProfile;
	}

	@Override
	public UserProfile updateUserProfile(String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth, int birthDay, String aboutMe, String favoriteQuotes, String favoriteMovie, long favoriteGenreId,
			String leastFavMovie, String favoriteActor, ServiceContext serviceContext) throws PortalException {

		return userProfileLocalService.updateUserProfile(screenName, firstName, lastName, male, birthYear, birthMonth,
				birthDay, aboutMe, favoriteQuotes, favoriteMovie, favoriteGenreId, leastFavMovie, favoriteActor,
				serviceContext);
	}

	@Override
	public Map<String, Boolean> getPermissions(String screenName, ServiceContext serviceContext) throws PortalException {
		HashMap<String, Boolean> viewPermissions = new HashMap<>();
		PermissionChecker permissionChecker = getPermissionChecker();
		User user = UserLocalServiceUtil.getUserByScreenName(serviceContext.getCompanyId(), screenName);
		GeneralProfile generalProfile = generalProfileLocalService.getGeneralProfileByUserId(user.getUserId(), serviceContext);
		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(user.getUserId(), serviceContext);

		// BASIC INFO
		boolean canViewBasicInfo = UserPermissionUtil.contains(permissionChecker, user.getUserId(), ActionKeys.VIEW);
		viewPermissions.put("basicInfo", canViewBasicInfo);
		boolean canViewFirstName = UserPermissionUtil.contains(permissionChecker, user.getUserId(), CustomActionKeys.VIEW_FIRST_NAME);
		viewPermissions.put("firstName", canViewFirstName);
		boolean canViewLastName = UserPermissionUtil.contains(permissionChecker, user.getUserId(), CustomActionKeys.VIEW_LAST_NAME);
		viewPermissions.put("lastName", canViewLastName);
		boolean canViewMale = UserPermissionUtil.contains(permissionChecker, user.getUserId(), CustomActionKeys.VIEW_MALE);
		viewPermissions.put("male", canViewMale);
		boolean canViewBirthday = UserPermissionUtil.contains(permissionChecker, user.getUserId(), CustomActionKeys.VIEW_BIRTHDAY);
		viewPermissions.put("birthday", canViewBirthday);

		// GENERAL PROFILE
		boolean canViewGeneralProfile = generalProfileModelResourcePermission.contains(permissionChecker, generalProfile.getGeneralProfileId(), ActionKeys.VIEW);
		viewPermissions.put("generalProfile", canViewGeneralProfile);
		boolean canViewAboutMe = generalProfileModelResourcePermission.contains(permissionChecker, generalProfile.getGeneralProfileId(), CustomActionKeys.VIEW_ABOUT_ME);
		viewPermissions.put("aboutMe", canViewAboutMe);
		boolean canViewFavQuotes = generalProfileModelResourcePermission.contains(permissionChecker, generalProfile.getGeneralProfileId(), CustomActionKeys.VIEW_FAVORITE_QUOTES);
		viewPermissions.put("favoriteQuotes", canViewFavQuotes);

		// MOVIE INTEREST
		boolean canViewMovieInterest = movieInterestModelResourcePermission.contains(permissionChecker, movieInterest.getMovieInterestId(), ActionKeys.VIEW);
		viewPermissions.put("movieInterest", canViewMovieInterest);
		boolean canViewFavMovie = movieInterestModelResourcePermission.contains(permissionChecker, movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_MOVIE);
		viewPermissions.put("favoriteMovie", canViewFavMovie);
		boolean canViewFavGenre = movieInterestModelResourcePermission.contains(permissionChecker, movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_GENRE);
		viewPermissions.put("favoriteGenre", canViewFavGenre);
		boolean canViewLeastFavMovie = movieInterestModelResourcePermission.contains(permissionChecker, movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_LEAST_FAV_MOVIE);
		viewPermissions.put("leastFavMovie", canViewLeastFavMovie);
		boolean canViewFavActor = movieInterestModelResourcePermission.contains(permissionChecker, movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_ACTOR);
		viewPermissions.put("favoriteActor", canViewFavActor);

		return viewPermissions;
	}

	private void genUserResources(User user) {
		// ModelPermissions
		// ResourceLocalServiceUtil.getResource(companyId, name, scope, primKey)
		// ResourceLocalServiceUtil.addResources(companyId, groupId, name, portletActions);
		// ResourceLocalServiceUtil.hasUserPermissions(userId, resourceId, resources, actionId, roleIds)
		// ResourceLocalServiceUtil.addModelResources(companyId, groupId, userId, name, primKey, modelPermissions);
		// ResourceLocalServiceUtil.updateResources(companyId, groupId, name, primKey, modelPermissions);
	}

	@Reference
	GeneralProfileLocalService generalProfileLocalService;

	@Reference
	MovieInterestLocalService movieInterestLocalService;

	@Reference
	GenreLocalService genreLocalService;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(model.class.name=com.amf.registration.profile.model.GeneralProfile)")
	private volatile ModelResourcePermission<GeneralProfile> generalProfileModelResourcePermission;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(resource.name="
			+ ProfileConstants.RESOURCE_NAME + ")")
	private volatile PortletResourcePermission portletResourcePermission;

	@Reference(policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(model.class.name=com.amf.registration.profile.model.MovieInterest)")
	private volatile ModelResourcePermission<MovieInterest> movieInterestModelResourcePermission;
}