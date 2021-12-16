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
import com.amf.registration.profile.util.ProfileViewPermissionConstants;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
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

		return userProfileLocalService.getUserProfile(user, serviceContext);
	}

	@Override
	public UserProfile getUserProfileById(long userId, ServiceContext serviceContext) throws PortalException {
		User user = UserLocalServiceUtil.getUser(userId);

		return userProfileLocalService.getUserProfile(user, serviceContext);
	}

	@Override
	public UserProfile updateUserProfile(String screenName, String firstName, String lastName, boolean male,
			int birthYear, int birthMonth, int birthDay, String aboutMe, String favoriteQuotes, String favoriteMovie,
			long favoriteGenreId,
			String leastFavMovie, String favoriteActor, ServiceContext serviceContext) throws PortalException {

		return userProfileLocalService.updateUserProfile(screenName, firstName, lastName, male, birthYear, birthMonth,
				birthDay, aboutMe, favoriteQuotes, favoriteMovie, favoriteGenreId, leastFavMovie, favoriteActor,
				serviceContext);
	}

	@Override
	public Map<String, Boolean> getPermissions(String screenName, ServiceContext serviceContext)
			throws PortalException {
		User user = UserLocalServiceUtil.getUserByScreenName(serviceContext.getCompanyId(), screenName);

		return getPermissions(user, serviceContext);
	}

	@Override
	public Map<String, Boolean> getPermissionsByUserId(long userId, ServiceContext serviceContext)
			throws PortalException {
		User user = UserLocalServiceUtil.getUser(userId);

		return getPermissions(user, serviceContext);
	}

	@Override
	public Map<String, String> updatePermissionSettings(String viewBasicInfo, String viewFirstName, String viewLastName,
			String viewMale, String viewBirthday, String viewGeneralProfile, String viewAboutMe,
			String viewFavoriteQuotes, String viewMovieInterest, String viewFavoriteMovie, String viewFavoriteActor,
			String viewFavoriteGenre, String viewLeastFavMovie, ServiceContext serviceContext) throws PortalException {

		long userId = serviceContext.getUserId();
		long companyId = serviceContext.getCompanyId();
		long guestRoleId = RoleLocalServiceUtil.getRole(companyId, RoleConstants.GUEST).getRoleId();
		long userRoleId = RoleLocalServiceUtil.getRole(companyId, RoleConstants.USER).getRoleId();
		long generalProfileId = generalProfileLocalService.getGeneralProfileByUserId(userId, serviceContext)
				.getGeneralProfileId();
		long movieInterestId = movieInterestLocalService.getMovieInterestByUserId(userId, serviceContext)
				.getMovieInterestId();

		updateUserPermission(viewBasicInfo, userId, companyId, CustomActionKeys.VIEW_BASIC_INFO, guestRoleId,
				userRoleId);
		updateUserPermission(viewFirstName, userId, companyId, CustomActionKeys.VIEW_FIRST_NAME, guestRoleId,
				userRoleId);
		updateUserPermission(viewLastName, userId, companyId, CustomActionKeys.VIEW_LAST_NAME, guestRoleId, userRoleId);
		updateUserPermission(viewMale, userId, companyId, CustomActionKeys.VIEW_MALE, guestRoleId, userRoleId);
		updateUserPermission(viewBirthday, userId, companyId, CustomActionKeys.VIEW_BIRTHDAY, guestRoleId, userRoleId);

		updateGeneralProfilePermission(viewGeneralProfile, generalProfileId, companyId,
				CustomActionKeys.VIEW_GENERAL_PROFILE, guestRoleId, userRoleId);
		updateGeneralProfilePermission(viewAboutMe, generalProfileId, companyId, CustomActionKeys.VIEW_ABOUT_ME,
				guestRoleId, userRoleId);
		updateGeneralProfilePermission(viewFavoriteQuotes, generalProfileId, companyId,
				CustomActionKeys.VIEW_FAVORITE_QUOTES, guestRoleId, userRoleId);

		updateMovieInterestPermission(viewMovieInterest, movieInterestId, companyId,
				CustomActionKeys.VIEW_MOVIE_INTEREST, guestRoleId, userRoleId);
		updateMovieInterestPermission(viewFavoriteMovie, movieInterestId, companyId,
				CustomActionKeys.VIEW_FAVORITE_MOVIE, guestRoleId, userRoleId);
		updateMovieInterestPermission(viewFavoriteActor, movieInterestId, companyId,
				CustomActionKeys.VIEW_FAVORITE_ACTOR, guestRoleId, userRoleId);
		updateMovieInterestPermission(viewFavoriteGenre, movieInterestId, companyId,
				CustomActionKeys.VIEW_FAVORITE_GENRE, guestRoleId, userRoleId);
		updateMovieInterestPermission(viewLeastFavMovie, movieInterestId, companyId,
				CustomActionKeys.VIEW_LEAST_FAV_MOVIE, guestRoleId, userRoleId);

		return getPermissionSettings(serviceContext.getUserId(), serviceContext);
	}

	private void updateUserPermission(String permissionSetting, long userId, long companyId, String actionId,
			long guestRoleId, long userRoleId) throws PortalException {

		updatePermission(permissionSetting, companyId, User.class.getName(), ResourceConstants.SCOPE_GROUP_TEMPLATE,
				String.valueOf(userId), actionId, guestRoleId, userRoleId);
	}

	private void updateGeneralProfilePermission(String permissionSetting, long generalProfileId, long companyId,
			String actionId,
			long guestRoleId, long userRoleId) throws PortalException {

		updatePermission(permissionSetting, companyId, GeneralProfile.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(generalProfileId), actionId, guestRoleId, userRoleId);
	}

	private void updateMovieInterestPermission(String permissionSetting, long movieInterestId, long companyId,
			String actionId,
			long guestRoleId, long userRoleId) throws PortalException {

		updatePermission(permissionSetting, companyId, MovieInterest.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(movieInterestId), actionId, guestRoleId, userRoleId);
	}

	private void updatePermission(String permissionSetting, long companyId, String className, int scopeId,
			String primKey, String actionId, long guestRoleId, long userRoleId) throws PortalException {
		
		ResourcePermission guestPermission = ResourcePermissionLocalServiceUtil
				.fetchResourcePermission(companyId, className, scopeId, primKey, guestRoleId);
		ResourcePermission guestPermission2 = ResourcePermissionLocalServiceUtil
				.fetchResourcePermission(companyId, className, ResourceConstants.SCOPE_INDIVIDUAL, primKey, guestRoleId);
		ResourcePermission userPermission = ResourcePermissionLocalServiceUtil
				.fetchResourcePermission(companyId, className, scopeId, primKey, userRoleId);

		switch (permissionSetting) {
			case ProfileViewPermissionConstants.ANYONE:
				guestPermission.addResourceAction(actionId);
				guestPermission2.addResourceAction(actionId);
				userPermission.addResourceAction(actionId);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission2);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(userPermission);
				break;
			case ProfileViewPermissionConstants.MEMBERS:
				guestPermission.removeResourceAction(actionId);
				guestPermission2.removeResourceAction(actionId);
				userPermission.addResourceAction(actionId);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(userPermission);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission2);
				break;
			case ProfileViewPermissionConstants.PRIVATE:
				guestPermission.removeResourceAction(actionId);
				guestPermission2.removeResourceAction(actionId);
				userPermission.removeResourceAction(actionId);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(userPermission);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission);
				ResourcePermissionLocalServiceUtil.updateResourcePermission(guestPermission2);
				break;
			default:
				throw new IllegalArgumentException("Invalid permission setting: " + permissionSetting);
		}

		
	}

	@Override
	public Map<String, String> getPermissionSettings(long userId, ServiceContext serviceContext)
			throws PortalException {
		User user = UserLocalServiceUtil.getUser(userId);
		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(userId, serviceContext);
		GeneralProfile generalProfile = generalProfileLocalService.getGeneralProfileByUserId(userId, serviceContext);
		Map<String, String> permissionSettings = new HashMap<>();

		Role guestRole = RoleLocalServiceUtil.getRole(user.getCompanyId(), RoleConstants.GUEST);
		Role userRole = RoleLocalServiceUtil.getRole(user.getCompanyId(), RoleConstants.USER);

		// Basic Info
		ResourcePermission basicInfoGuestPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), User.class.getName(), ResourceConstants.SCOPE_GROUP_TEMPLATE, String.valueOf(user.getUserId()), guestRole.getRoleId());

		ResourcePermission basicInfoUserPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), User.class.getName(), ResourceConstants.SCOPE_GROUP_TEMPLATE, String.valueOf(user.getUserId()), userRole.getRoleId());

		if (basicInfoGuestPermissions != null
				&& basicInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_BASIC_INFO)) {
			permissionSettings.put(CustomActionKeys.VIEW_BASIC_INFO, ProfileViewPermissionConstants.ANYONE);
		} else if (basicInfoUserPermissions != null
				&& basicInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_BASIC_INFO)) {
			permissionSettings.put(CustomActionKeys.VIEW_BASIC_INFO, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_BASIC_INFO, ProfileViewPermissionConstants.PRIVATE);
		}

		if (basicInfoGuestPermissions != null
				&& basicInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_FIRST_NAME)) {
			permissionSettings.put(CustomActionKeys.VIEW_FIRST_NAME, ProfileViewPermissionConstants.ANYONE);
		} else if (basicInfoUserPermissions != null
				&& basicInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_FIRST_NAME)) {
			permissionSettings.put(CustomActionKeys.VIEW_FIRST_NAME, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_FIRST_NAME, ProfileViewPermissionConstants.PRIVATE);
		}

		if (basicInfoGuestPermissions != null
				&& basicInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_LAST_NAME)) {
			permissionSettings.put(CustomActionKeys.VIEW_LAST_NAME, ProfileViewPermissionConstants.ANYONE);
		} else if (basicInfoUserPermissions != null
				&& basicInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_LAST_NAME)) {
			permissionSettings.put(CustomActionKeys.VIEW_LAST_NAME, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_LAST_NAME, ProfileViewPermissionConstants.PRIVATE);
		}

		if (basicInfoGuestPermissions != null
				&& basicInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_MALE)) {
			permissionSettings.put(CustomActionKeys.VIEW_MALE, ProfileViewPermissionConstants.ANYONE);
		} else if (basicInfoUserPermissions != null
				&& basicInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_MALE)) {
			permissionSettings.put(CustomActionKeys.VIEW_MALE, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_MALE, ProfileViewPermissionConstants.PRIVATE);
		}

		if (basicInfoGuestPermissions != null
				&& basicInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_BIRTHDAY)) {
			permissionSettings.put(CustomActionKeys.VIEW_BIRTHDAY, ProfileViewPermissionConstants.ANYONE);
		} else if (basicInfoUserPermissions != null
				&& basicInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_BIRTHDAY)) {
			permissionSettings.put(CustomActionKeys.VIEW_BIRTHDAY, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_BIRTHDAY, ProfileViewPermissionConstants.PRIVATE);
		}

		// Movie General Info

		ResourcePermission generalInfoGuestPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), GeneralProfile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(generalProfile.getGeneralProfileId()), guestRole.getRoleId());

		ResourcePermission generalInfoUserPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), GeneralProfile.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(generalProfile.getGeneralProfileId()), userRole.getRoleId());

		if (generalInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_GENERAL_PROFILE)) {
			permissionSettings.put(CustomActionKeys.VIEW_GENERAL_PROFILE, ProfileViewPermissionConstants.ANYONE);
		} else if (generalInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_GENERAL_PROFILE)) {
			permissionSettings.put(CustomActionKeys.VIEW_GENERAL_PROFILE, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_GENERAL_PROFILE, ProfileViewPermissionConstants.PRIVATE);
		}

		if (generalInfoGuestPermissions != null
				&& generalInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_ABOUT_ME)) {
			permissionSettings.put(CustomActionKeys.VIEW_ABOUT_ME, ProfileViewPermissionConstants.ANYONE);
		} else if (generalInfoUserPermissions != null
				&& generalInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_ABOUT_ME)) {
			permissionSettings.put(CustomActionKeys.VIEW_ABOUT_ME, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_ABOUT_ME, ProfileViewPermissionConstants.PRIVATE);
		}

		if (generalInfoGuestPermissions != null
				&& generalInfoGuestPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_QUOTES)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_QUOTES, ProfileViewPermissionConstants.ANYONE);
		} else if (generalInfoUserPermissions != null
				&& generalInfoUserPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_QUOTES)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_QUOTES, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_QUOTES, ProfileViewPermissionConstants.PRIVATE);
		}

		// Movie Interest

		ResourcePermission movieInterestGuestPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), MovieInterest.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(movieInterest.getMovieInterestId()), guestRole.getRoleId());

		ResourcePermission movieInterestUserPermissions = ResourcePermissionLocalServiceUtil.fetchResourcePermission(
				user.getCompanyId(), MovieInterest.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(movieInterest.getMovieInterestId()), userRole.getRoleId());

		if (movieInterestGuestPermissions != null
				&& movieInterestGuestPermissions.hasActionId(CustomActionKeys.VIEW_MOVIE_INTEREST)) {
			permissionSettings.put(CustomActionKeys.VIEW_MOVIE_INTEREST, ProfileViewPermissionConstants.ANYONE);
		} else if (movieInterestUserPermissions != null
				&& movieInterestUserPermissions.hasActionId(CustomActionKeys.VIEW_MOVIE_INTEREST)) {
			permissionSettings.put(CustomActionKeys.VIEW_MOVIE_INTEREST, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_MOVIE_INTEREST, ProfileViewPermissionConstants.PRIVATE);
		}

		if (movieInterestGuestPermissions != null
				&& movieInterestGuestPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_ACTOR)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, ProfileViewPermissionConstants.ANYONE);
		} else if (movieInterestUserPermissions != null
				&& movieInterestUserPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_ACTOR)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_ACTOR, ProfileViewPermissionConstants.PRIVATE);
		}

		if (movieInterestGuestPermissions != null
				&& movieInterestGuestPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_GENRE)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_GENRE, ProfileViewPermissionConstants.ANYONE);
		} else if (movieInterestUserPermissions != null
				&& movieInterestUserPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_GENRE)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_GENRE, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_GENRE, ProfileViewPermissionConstants.PRIVATE);
		}

		if (movieInterestGuestPermissions != null
				&& movieInterestGuestPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_MOVIE)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_MOVIE, ProfileViewPermissionConstants.ANYONE);
		} else if (movieInterestUserPermissions != null
				&& movieInterestUserPermissions.hasActionId(CustomActionKeys.VIEW_FAVORITE_MOVIE)) {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_MOVIE, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_FAVORITE_MOVIE, ProfileViewPermissionConstants.PRIVATE);
		}

		if (movieInterestGuestPermissions != null
				&& movieInterestGuestPermissions.hasActionId(CustomActionKeys.VIEW_LEAST_FAV_MOVIE)) {
			permissionSettings.put(CustomActionKeys.VIEW_LEAST_FAV_MOVIE, ProfileViewPermissionConstants.ANYONE);
		} else if (movieInterestUserPermissions != null
				&& movieInterestUserPermissions.hasActionId(CustomActionKeys.VIEW_LEAST_FAV_MOVIE)) {
			permissionSettings.put(CustomActionKeys.VIEW_LEAST_FAV_MOVIE, ProfileViewPermissionConstants.MEMBERS);
		} else {
			permissionSettings.put(CustomActionKeys.VIEW_LEAST_FAV_MOVIE, ProfileViewPermissionConstants.PRIVATE);
		}

		return permissionSettings;
	}

	private Map<String, Boolean> getPermissions(User user, ServiceContext serviceContext) throws PortalException {
		HashMap<String, Boolean> viewPermissions = new HashMap<>();
		PermissionChecker permissionChecker = getPermissionChecker();
		GeneralProfile generalProfile = generalProfileLocalService.getGeneralProfileByUserId(user.getUserId(),
				serviceContext);
		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(user.getUserId(),
				serviceContext);

		// BASIC INFO

		boolean canViewBasicInfo = UserPermissionUtil.contains(permissionChecker, serviceContext.getGuestOrUserId(),
				CustomActionKeys.VIEW_BASIC_INFO); 

		viewPermissions.put("basicInfo", canViewBasicInfo);
		boolean canViewFirstName = UserPermissionUtil.contains(permissionChecker, serviceContext.getGuestOrUserId(),
				CustomActionKeys.VIEW_FIRST_NAME);
		
		viewPermissions.put("firstName", canViewFirstName);

		boolean canViewLastName = UserPermissionUtil.contains(permissionChecker, serviceContext.getGuestOrUserId(),
				CustomActionKeys.VIEW_LAST_NAME);
		viewPermissions.put("lastName", canViewLastName);
		boolean canViewMale = UserPermissionUtil.contains(permissionChecker, serviceContext.getGuestOrUserId(),
				CustomActionKeys.VIEW_MALE);
		viewPermissions.put("male", canViewMale);
		boolean canViewBirthday = UserPermissionUtil.contains(permissionChecker, serviceContext.getGuestOrUserId(),
				CustomActionKeys.VIEW_BIRTHDAY);
		viewPermissions.put("birthday", canViewBirthday);

		// GENERAL PROFILE
		boolean canViewGeneralProfile = generalProfileModelResourcePermission.contains(permissionChecker,
				generalProfile.getGeneralProfileId(), CustomActionKeys.VIEW_GENERAL_PROFILE);
		viewPermissions.put("generalProfile", canViewGeneralProfile);
		boolean canViewAboutMe = generalProfileModelResourcePermission.contains(permissionChecker,
				generalProfile.getGeneralProfileId(), CustomActionKeys.VIEW_ABOUT_ME);
		viewPermissions.put("aboutMe", canViewAboutMe);
		boolean canViewFavQuotes = generalProfileModelResourcePermission.contains(permissionChecker,
				generalProfile.getGeneralProfileId(), CustomActionKeys.VIEW_FAVORITE_QUOTES);
		viewPermissions.put("favoriteQuotes", canViewFavQuotes);

		// MOVIE INTEREST
		boolean canViewMovieInterest = movieInterestModelResourcePermission.contains(permissionChecker,
				movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_MOVIE_INTEREST);
		viewPermissions.put("movieInterest", canViewMovieInterest);
		boolean canViewFavMovie = movieInterestModelResourcePermission.contains(permissionChecker,
				movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_MOVIE);
		viewPermissions.put("favoriteMovie", canViewFavMovie);
		boolean canViewFavGenre = movieInterestModelResourcePermission.contains(permissionChecker,
				movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_GENRE);
		viewPermissions.put("favoriteGenre", canViewFavGenre);
		boolean canViewLeastFavMovie = movieInterestModelResourcePermission.contains(permissionChecker,
				movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_LEAST_FAV_MOVIE);
		viewPermissions.put("leastFavMovie", canViewLeastFavMovie);
		boolean canViewFavActor = movieInterestModelResourcePermission.contains(permissionChecker,
				movieInterest.getMovieInterestId(), CustomActionKeys.VIEW_FAVORITE_ACTOR);
		viewPermissions.put("favoriteActor", canViewFavActor);

		return viewPermissions;
	}

	private void genUserResources(User user) {
		// ModelPermissions
		// ResourceLocalServiceUtil.getResource(companyId, name, scope, primKey)
		// ResourceLocalServiceUtil.addResources(companyId, groupId, name,
		// portletActions);
		// ResourceLocalServiceUtil.hasUserPermissions(userId, resourceId, resources,
		// actionId, roleIds)
		// ResourceLocalServiceUtil.addModelResources(companyId, groupId, userId, name,
		// primKey, modelPermissions);
		// ResourceLocalServiceUtil.updateResources(companyId, groupId, name, primKey,
		// modelPermissions);
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

// groupid 37693
// companyid 37301
// name com.liferay.portal.kernel.model.User
// primkey 37348
// roleid 37313
// actionid VIEW_FIRST_NAME