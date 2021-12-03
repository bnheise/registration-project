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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserProfile service. Represents a row in the &quot;UserProfile_UserProfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.amf.registration.profile.model.impl.UserProfileModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.amf.registration.profile.model.impl.UserProfileImpl</code>.
 * </p>
 *
 * @author Brian Heise
 * @see UserProfile
 * @generated
 */
@ProviderType
public interface UserProfileModel extends BaseModel<UserProfile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user profile model instance should use the {@link UserProfile} interface instead.
	 */

	/**
	 * Returns the primary key of this user profile.
	 *
	 * @return the primary key of this user profile
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user profile.
	 *
	 * @param primaryKey the primary key of this user profile
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user profile.
	 *
	 * @return the uuid of this user profile
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this user profile.
	 *
	 * @param uuid the uuid of this user profile
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the user ID of this user profile.
	 *
	 * @return the user ID of this user profile
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user profile.
	 *
	 * @param userId the user ID of this user profile
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user profile.
	 *
	 * @return the user uuid of this user profile
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user profile.
	 *
	 * @param userUuid the user uuid of this user profile
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the first name of this user profile.
	 *
	 * @return the first name of this user profile
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this user profile.
	 *
	 * @param firstName the first name of this user profile
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this user profile.
	 *
	 * @return the last name of this user profile
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this user profile.
	 *
	 * @param lastName the last name of this user profile
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the male of this user profile.
	 *
	 * @return the male of this user profile
	 */
	public boolean getMale();

	/**
	 * Returns <code>true</code> if this user profile is male.
	 *
	 * @return <code>true</code> if this user profile is male; <code>false</code> otherwise
	 */
	public boolean isMale();

	/**
	 * Sets whether this user profile is male.
	 *
	 * @param male the male of this user profile
	 */
	public void setMale(boolean male);

	/**
	 * Returns the birth year of this user profile.
	 *
	 * @return the birth year of this user profile
	 */
	public int getBirthYear();

	/**
	 * Sets the birth year of this user profile.
	 *
	 * @param birthYear the birth year of this user profile
	 */
	public void setBirthYear(int birthYear);

	/**
	 * Returns the birth month of this user profile.
	 *
	 * @return the birth month of this user profile
	 */
	public int getBirthMonth();

	/**
	 * Sets the birth month of this user profile.
	 *
	 * @param birthMonth the birth month of this user profile
	 */
	public void setBirthMonth(int birthMonth);

	/**
	 * Returns the birth day of this user profile.
	 *
	 * @return the birth day of this user profile
	 */
	public int getBirthDay();

	/**
	 * Sets the birth day of this user profile.
	 *
	 * @param birthDay the birth day of this user profile
	 */
	public void setBirthDay(int birthDay);

	/**
	 * Returns the about me of this user profile.
	 *
	 * @return the about me of this user profile
	 */
	@AutoEscape
	public String getAboutMe();

	/**
	 * Sets the about me of this user profile.
	 *
	 * @param aboutMe the about me of this user profile
	 */
	public void setAboutMe(String aboutMe);

	/**
	 * Returns the favorite quotes of this user profile.
	 *
	 * @return the favorite quotes of this user profile
	 */
	@AutoEscape
	public String getFavoriteQuotes();

	/**
	 * Sets the favorite quotes of this user profile.
	 *
	 * @param favoriteQuotes the favorite quotes of this user profile
	 */
	public void setFavoriteQuotes(String favoriteQuotes);

	/**
	 * Returns the favorite movie of this user profile.
	 *
	 * @return the favorite movie of this user profile
	 */
	@AutoEscape
	public String getFavoriteMovie();

	/**
	 * Sets the favorite movie of this user profile.
	 *
	 * @param favoriteMovie the favorite movie of this user profile
	 */
	public void setFavoriteMovie(String favoriteMovie);

	/**
	 * Returns the favorite genre of this user profile.
	 *
	 * @return the favorite genre of this user profile
	 */
	@AutoEscape
	public String getFavoriteGenre();

	/**
	 * Sets the favorite genre of this user profile.
	 *
	 * @param favoriteGenre the favorite genre of this user profile
	 */
	public void setFavoriteGenre(String favoriteGenre);

	/**
	 * Returns the least fav movie of this user profile.
	 *
	 * @return the least fav movie of this user profile
	 */
	@AutoEscape
	public String getLeastFavMovie();

	/**
	 * Sets the least fav movie of this user profile.
	 *
	 * @param leastFavMovie the least fav movie of this user profile
	 */
	public void setLeastFavMovie(String leastFavMovie);

	/**
	 * Returns the favorite actor of this user profile.
	 *
	 * @return the favorite actor of this user profile
	 */
	@AutoEscape
	public String getFavoriteActor();

	/**
	 * Sets the favorite actor of this user profile.
	 *
	 * @param favoriteActor the favorite actor of this user profile
	 */
	public void setFavoriteActor(String favoriteActor);

}