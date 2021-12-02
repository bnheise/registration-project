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
import java.util.Date;

import com.amf.registration.profile.model.GeneralProfile;
import com.amf.registration.profile.model.MovieInterest;
import com.amf.registration.profile.model.UserProfile;
import com.amf.registration.profile.service.GeneralProfileLocalService;
import com.amf.registration.profile.service.MovieInterestLocalService;
import com.amf.registration.profile.service.base.UserProfileLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ContactLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the user profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.registration.profile.service.UserProfileLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Heise
 * @see UserProfileLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.amf.registration.profile.model.UserProfile", service = AopService.class)
public class UserProfileLocalServiceImpl
		extends UserProfileLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.amf.registration.profile.service.UserProfileLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.amf.registration.profile.service.UserProfileLocalServiceUtil</code>
	 * .
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
		userProfile.setFavoriteGenre(movieInterest.getFavoriteGenre());
		userProfile.setFavoriteMovie(movieInterest.getFavoriteMovie());
		userProfile.setLeastFavMovie(movieInterest.getLeastFavMovie());
		return userProfile;
	}

	@Override
	public UserProfile updateUserProfile(String screenName, String firstName, String lastName, boolean male,
			int birthYear,
			int birthMonth, int birthDay, String aboutMe, String favoriteQuotes, String favoriteMovie,
			String favoriteGenre, String leastFavMovie, String favoriteActor, ServiceContext serviceContext)
			throws PortalException {

		User user = UserLocalServiceUtil.getUserByScreenName(serviceContext.getCompanyId(), screenName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		UserLocalServiceUtil.updateUser(user);

		Contact contact = ContactLocalServiceUtil.fetchContact(user.getContactId());

		LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
		contact.setBirthday(Date.from(birthdate.atStartOfDay()
				.atZone(ZoneId.systemDefault())
				.toInstant()));
		contact.setMale(male);
		ContactLocalServiceUtil.updateContact(contact);

		GeneralProfile generalProfile = generalProfileLocalService.getGeneralProfileByUserId(user.getUserId(),
				serviceContext);
		generalProfile.setAboutMe(aboutMe);
		generalProfile.setFavoriteQuotes(favoriteQuotes);
		generalProfile.setUserId(user.getUserId());
		generalProfileLocalService.updateGeneralProfile(generalProfile);
		ResourceLocalServiceUtil.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
				GeneralProfile.class.getName(), generalProfile.getGeneralProfileId(),
				serviceContext.getModelPermissions());

		MovieInterest movieInterest = movieInterestLocalService.getMovieInterestByUserId(user.getUserId(),
				serviceContext);
		movieInterest.setFavoriteMovie(favoriteMovie);
		movieInterest.setFavoriteGenre(favoriteGenre);
		movieInterest.setFavoriteActor(favoriteActor);
		movieInterest.setLeastFavMovie(leastFavMovie);
		movieInterest.setUserId(user.getUserId());
		movieInterestLocalService.updateMovieInterest(movieInterest);
		ResourceLocalServiceUtil.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
				MovieInterest.class.getName(), generalProfile.getGeneralProfileId(),
				serviceContext.getModelPermissions());

		return getUserProfile(screenName, serviceContext);
	}

	@Reference
	GeneralProfileLocalService generalProfileLocalService;

	@Reference
	MovieInterestLocalService movieInterestLocalService;
}