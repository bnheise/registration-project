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

package com.amf.registration.profile.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserProfile}.
 * </p>
 *
 * @author Brian Heise
 * @see UserProfile
 * @generated
 */
public class UserProfileWrapper
	extends BaseModelWrapper<UserProfile>
	implements ModelWrapper<UserProfile>, UserProfile {

	public UserProfileWrapper(UserProfile userProfile) {
		super(userProfile);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userId", getUserId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("male", isMale());
		attributes.put("birthYear", getBirthYear());
		attributes.put("birthMonth", getBirthMonth());
		attributes.put("birthDay", getBirthDay());
		attributes.put("basicInfoVisible", isBasicInfoVisible());
		attributes.put("aboutMe", getAboutMe());
		attributes.put("favoriteQuotes", getFavoriteQuotes());
		attributes.put("generalProfileVisible", isGeneralProfileVisible());
		attributes.put("favoriteMovie", getFavoriteMovie());
		attributes.put("favoriteGenre", getFavoriteGenre());
		attributes.put("leastFavMovie", getLeastFavMovie());
		attributes.put("favoriteActor", getFavoriteActor());
		attributes.put("movieInterestsVisible", isMovieInterestsVisible());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Boolean male = (Boolean)attributes.get("male");

		if (male != null) {
			setMale(male);
		}

		Integer birthYear = (Integer)attributes.get("birthYear");

		if (birthYear != null) {
			setBirthYear(birthYear);
		}

		Integer birthMonth = (Integer)attributes.get("birthMonth");

		if (birthMonth != null) {
			setBirthMonth(birthMonth);
		}

		Integer birthDay = (Integer)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		Boolean basicInfoVisible = (Boolean)attributes.get("basicInfoVisible");

		if (basicInfoVisible != null) {
			setBasicInfoVisible(basicInfoVisible);
		}

		String aboutMe = (String)attributes.get("aboutMe");

		if (aboutMe != null) {
			setAboutMe(aboutMe);
		}

		String favoriteQuotes = (String)attributes.get("favoriteQuotes");

		if (favoriteQuotes != null) {
			setFavoriteQuotes(favoriteQuotes);
		}

		Boolean generalProfileVisible = (Boolean)attributes.get(
			"generalProfileVisible");

		if (generalProfileVisible != null) {
			setGeneralProfileVisible(generalProfileVisible);
		}

		String favoriteMovie = (String)attributes.get("favoriteMovie");

		if (favoriteMovie != null) {
			setFavoriteMovie(favoriteMovie);
		}

		String favoriteGenre = (String)attributes.get("favoriteGenre");

		if (favoriteGenre != null) {
			setFavoriteGenre(favoriteGenre);
		}

		String leastFavMovie = (String)attributes.get("leastFavMovie");

		if (leastFavMovie != null) {
			setLeastFavMovie(leastFavMovie);
		}

		String favoriteActor = (String)attributes.get("favoriteActor");

		if (favoriteActor != null) {
			setFavoriteActor(favoriteActor);
		}

		Boolean movieInterestsVisible = (Boolean)attributes.get(
			"movieInterestsVisible");

		if (movieInterestsVisible != null) {
			setMovieInterestsVisible(movieInterestsVisible);
		}
	}

	/**
	 * Returns the about me of this user profile.
	 *
	 * @return the about me of this user profile
	 */
	@Override
	public String getAboutMe() {
		return model.getAboutMe();
	}

	/**
	 * Returns the basic info visible of this user profile.
	 *
	 * @return the basic info visible of this user profile
	 */
	@Override
	public boolean getBasicInfoVisible() {
		return model.getBasicInfoVisible();
	}

	/**
	 * Returns the birth day of this user profile.
	 *
	 * @return the birth day of this user profile
	 */
	@Override
	public int getBirthDay() {
		return model.getBirthDay();
	}

	/**
	 * Returns the birth month of this user profile.
	 *
	 * @return the birth month of this user profile
	 */
	@Override
	public int getBirthMonth() {
		return model.getBirthMonth();
	}

	/**
	 * Returns the birth year of this user profile.
	 *
	 * @return the birth year of this user profile
	 */
	@Override
	public int getBirthYear() {
		return model.getBirthYear();
	}

	/**
	 * Returns the favorite actor of this user profile.
	 *
	 * @return the favorite actor of this user profile
	 */
	@Override
	public String getFavoriteActor() {
		return model.getFavoriteActor();
	}

	/**
	 * Returns the favorite genre of this user profile.
	 *
	 * @return the favorite genre of this user profile
	 */
	@Override
	public String getFavoriteGenre() {
		return model.getFavoriteGenre();
	}

	/**
	 * Returns the favorite movie of this user profile.
	 *
	 * @return the favorite movie of this user profile
	 */
	@Override
	public String getFavoriteMovie() {
		return model.getFavoriteMovie();
	}

	/**
	 * Returns the favorite quotes of this user profile.
	 *
	 * @return the favorite quotes of this user profile
	 */
	@Override
	public String getFavoriteQuotes() {
		return model.getFavoriteQuotes();
	}

	/**
	 * Returns the first name of this user profile.
	 *
	 * @return the first name of this user profile
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the general profile visible of this user profile.
	 *
	 * @return the general profile visible of this user profile
	 */
	@Override
	public boolean getGeneralProfileVisible() {
		return model.getGeneralProfileVisible();
	}

	/**
	 * Returns the last name of this user profile.
	 *
	 * @return the last name of this user profile
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the least fav movie of this user profile.
	 *
	 * @return the least fav movie of this user profile
	 */
	@Override
	public String getLeastFavMovie() {
		return model.getLeastFavMovie();
	}

	/**
	 * Returns the male of this user profile.
	 *
	 * @return the male of this user profile
	 */
	@Override
	public boolean getMale() {
		return model.getMale();
	}

	/**
	 * Returns the movie interests visible of this user profile.
	 *
	 * @return the movie interests visible of this user profile
	 */
	@Override
	public boolean getMovieInterestsVisible() {
		return model.getMovieInterestsVisible();
	}

	/**
	 * Returns the primary key of this user profile.
	 *
	 * @return the primary key of this user profile
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this user profile.
	 *
	 * @return the user ID of this user profile
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this user profile.
	 *
	 * @return the user uuid of this user profile
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user profile.
	 *
	 * @return the uuid of this user profile
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this user profile is basic info visible.
	 *
	 * @return <code>true</code> if this user profile is basic info visible; <code>false</code> otherwise
	 */
	@Override
	public boolean isBasicInfoVisible() {
		return model.isBasicInfoVisible();
	}

	/**
	 * Returns <code>true</code> if this user profile is general profile visible.
	 *
	 * @return <code>true</code> if this user profile is general profile visible; <code>false</code> otherwise
	 */
	@Override
	public boolean isGeneralProfileVisible() {
		return model.isGeneralProfileVisible();
	}

	/**
	 * Returns <code>true</code> if this user profile is male.
	 *
	 * @return <code>true</code> if this user profile is male; <code>false</code> otherwise
	 */
	@Override
	public boolean isMale() {
		return model.isMale();
	}

	/**
	 * Returns <code>true</code> if this user profile is movie interests visible.
	 *
	 * @return <code>true</code> if this user profile is movie interests visible; <code>false</code> otherwise
	 */
	@Override
	public boolean isMovieInterestsVisible() {
		return model.isMovieInterestsVisible();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the about me of this user profile.
	 *
	 * @param aboutMe the about me of this user profile
	 */
	@Override
	public void setAboutMe(String aboutMe) {
		model.setAboutMe(aboutMe);
	}

	/**
	 * Sets whether this user profile is basic info visible.
	 *
	 * @param basicInfoVisible the basic info visible of this user profile
	 */
	@Override
	public void setBasicInfoVisible(boolean basicInfoVisible) {
		model.setBasicInfoVisible(basicInfoVisible);
	}

	/**
	 * Sets the birth day of this user profile.
	 *
	 * @param birthDay the birth day of this user profile
	 */
	@Override
	public void setBirthDay(int birthDay) {
		model.setBirthDay(birthDay);
	}

	/**
	 * Sets the birth month of this user profile.
	 *
	 * @param birthMonth the birth month of this user profile
	 */
	@Override
	public void setBirthMonth(int birthMonth) {
		model.setBirthMonth(birthMonth);
	}

	/**
	 * Sets the birth year of this user profile.
	 *
	 * @param birthYear the birth year of this user profile
	 */
	@Override
	public void setBirthYear(int birthYear) {
		model.setBirthYear(birthYear);
	}

	/**
	 * Sets the favorite actor of this user profile.
	 *
	 * @param favoriteActor the favorite actor of this user profile
	 */
	@Override
	public void setFavoriteActor(String favoriteActor) {
		model.setFavoriteActor(favoriteActor);
	}

	/**
	 * Sets the favorite genre of this user profile.
	 *
	 * @param favoriteGenre the favorite genre of this user profile
	 */
	@Override
	public void setFavoriteGenre(String favoriteGenre) {
		model.setFavoriteGenre(favoriteGenre);
	}

	/**
	 * Sets the favorite movie of this user profile.
	 *
	 * @param favoriteMovie the favorite movie of this user profile
	 */
	@Override
	public void setFavoriteMovie(String favoriteMovie) {
		model.setFavoriteMovie(favoriteMovie);
	}

	/**
	 * Sets the favorite quotes of this user profile.
	 *
	 * @param favoriteQuotes the favorite quotes of this user profile
	 */
	@Override
	public void setFavoriteQuotes(String favoriteQuotes) {
		model.setFavoriteQuotes(favoriteQuotes);
	}

	/**
	 * Sets the first name of this user profile.
	 *
	 * @param firstName the first name of this user profile
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets whether this user profile is general profile visible.
	 *
	 * @param generalProfileVisible the general profile visible of this user profile
	 */
	@Override
	public void setGeneralProfileVisible(boolean generalProfileVisible) {
		model.setGeneralProfileVisible(generalProfileVisible);
	}

	/**
	 * Sets the last name of this user profile.
	 *
	 * @param lastName the last name of this user profile
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the least fav movie of this user profile.
	 *
	 * @param leastFavMovie the least fav movie of this user profile
	 */
	@Override
	public void setLeastFavMovie(String leastFavMovie) {
		model.setLeastFavMovie(leastFavMovie);
	}

	/**
	 * Sets whether this user profile is male.
	 *
	 * @param male the male of this user profile
	 */
	@Override
	public void setMale(boolean male) {
		model.setMale(male);
	}

	/**
	 * Sets whether this user profile is movie interests visible.
	 *
	 * @param movieInterestsVisible the movie interests visible of this user profile
	 */
	@Override
	public void setMovieInterestsVisible(boolean movieInterestsVisible) {
		model.setMovieInterestsVisible(movieInterestsVisible);
	}

	/**
	 * Sets the primary key of this user profile.
	 *
	 * @param primaryKey the primary key of this user profile
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this user profile.
	 *
	 * @param userId the user ID of this user profile
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this user profile.
	 *
	 * @param userUuid the user uuid of this user profile
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user profile.
	 *
	 * @param uuid the uuid of this user profile
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected UserProfileWrapper wrap(UserProfile userProfile) {
		return new UserProfileWrapper(userProfile);
	}

}