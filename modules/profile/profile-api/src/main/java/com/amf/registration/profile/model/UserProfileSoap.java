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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.profile.service.http.UserProfileServiceSoap}.
 *
 * @author Brian Heise
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserProfileSoap implements Serializable {

	public static UserProfileSoap toSoapModel(UserProfile model) {
		UserProfileSoap soapModel = new UserProfileSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserId(model.getUserId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setMale(model.isMale());
		soapModel.setBirthYear(model.getBirthYear());
		soapModel.setBirthMonth(model.getBirthMonth());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setAboutMe(model.getAboutMe());
		soapModel.setFavoriteQuotes(model.getFavoriteQuotes());
		soapModel.setFavoriteMovie(model.getFavoriteMovie());
		soapModel.setFavoriteGenre(model.getFavoriteGenre());
		soapModel.setFavoriteGenreId(model.getFavoriteGenreId());
		soapModel.setLeastFavMovie(model.getLeastFavMovie());
		soapModel.setFavoriteActor(model.getFavoriteActor());

		return soapModel;
	}

	public static UserProfileSoap[] toSoapModels(UserProfile[] models) {
		UserProfileSoap[] soapModels = new UserProfileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserProfileSoap[][] toSoapModels(UserProfile[][] models) {
		UserProfileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserProfileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserProfileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserProfileSoap[] toSoapModels(List<UserProfile> models) {
		List<UserProfileSoap> soapModels = new ArrayList<UserProfileSoap>(
			models.size());

		for (UserProfile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserProfileSoap[soapModels.size()]);
	}

	public UserProfileSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public boolean getMale() {
		return _male;
	}

	public boolean isMale() {
		return _male;
	}

	public void setMale(boolean male) {
		_male = male;
	}

	public int getBirthYear() {
		return _birthYear;
	}

	public void setBirthYear(int birthYear) {
		_birthYear = birthYear;
	}

	public int getBirthMonth() {
		return _birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		_birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(int birthDay) {
		_birthDay = birthDay;
	}

	public String getAboutMe() {
		return _aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		_aboutMe = aboutMe;
	}

	public String getFavoriteQuotes() {
		return _favoriteQuotes;
	}

	public void setFavoriteQuotes(String favoriteQuotes) {
		_favoriteQuotes = favoriteQuotes;
	}

	public String getFavoriteMovie() {
		return _favoriteMovie;
	}

	public void setFavoriteMovie(String favoriteMovie) {
		_favoriteMovie = favoriteMovie;
	}

	public String getFavoriteGenre() {
		return _favoriteGenre;
	}

	public void setFavoriteGenre(String favoriteGenre) {
		_favoriteGenre = favoriteGenre;
	}

	public long getFavoriteGenreId() {
		return _favoriteGenreId;
	}

	public void setFavoriteGenreId(long favoriteGenreId) {
		_favoriteGenreId = favoriteGenreId;
	}

	public String getLeastFavMovie() {
		return _leastFavMovie;
	}

	public void setLeastFavMovie(String leastFavMovie) {
		_leastFavMovie = leastFavMovie;
	}

	public String getFavoriteActor() {
		return _favoriteActor;
	}

	public void setFavoriteActor(String favoriteActor) {
		_favoriteActor = favoriteActor;
	}

	private String _uuid;
	private long _userId;
	private String _firstName;
	private String _lastName;
	private String _screenName;
	private boolean _male;
	private int _birthYear;
	private int _birthMonth;
	private int _birthDay;
	private String _aboutMe;
	private String _favoriteQuotes;
	private String _favoriteMovie;
	private String _favoriteGenre;
	private long _favoriteGenreId;
	private String _leastFavMovie;
	private String _favoriteActor;

}