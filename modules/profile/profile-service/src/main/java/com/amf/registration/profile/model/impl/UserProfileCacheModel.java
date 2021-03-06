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

package com.amf.registration.profile.model.impl;

import com.amf.registration.profile.model.UserProfile;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserProfile in entity cache.
 *
 * @author Brian Heise
 * @generated
 */
public class UserProfileCacheModel
	implements CacheModel<UserProfile>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserProfileCacheModel)) {
			return false;
		}

		UserProfileCacheModel userProfileCacheModel =
			(UserProfileCacheModel)object;

		if (userId == userProfileCacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", male=");
		sb.append(male);
		sb.append(", birthYear=");
		sb.append(birthYear);
		sb.append(", birthMonth=");
		sb.append(birthMonth);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", aboutMe=");
		sb.append(aboutMe);
		sb.append(", favoriteQuotes=");
		sb.append(favoriteQuotes);
		sb.append(", favoriteMovie=");
		sb.append(favoriteMovie);
		sb.append(", favoriteGenre=");
		sb.append(favoriteGenre);
		sb.append(", favoriteGenreId=");
		sb.append(favoriteGenreId);
		sb.append(", leastFavMovie=");
		sb.append(leastFavMovie);
		sb.append(", favoriteActor=");
		sb.append(favoriteActor);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserProfile toEntityModel() {
		UserProfileImpl userProfileImpl = new UserProfileImpl();

		if (uuid == null) {
			userProfileImpl.setUuid("");
		}
		else {
			userProfileImpl.setUuid(uuid);
		}

		userProfileImpl.setUserId(userId);

		if (firstName == null) {
			userProfileImpl.setFirstName("");
		}
		else {
			userProfileImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			userProfileImpl.setLastName("");
		}
		else {
			userProfileImpl.setLastName(lastName);
		}

		if (screenName == null) {
			userProfileImpl.setScreenName("");
		}
		else {
			userProfileImpl.setScreenName(screenName);
		}

		userProfileImpl.setMale(male);
		userProfileImpl.setBirthYear(birthYear);
		userProfileImpl.setBirthMonth(birthMonth);
		userProfileImpl.setBirthDay(birthDay);

		if (aboutMe == null) {
			userProfileImpl.setAboutMe("");
		}
		else {
			userProfileImpl.setAboutMe(aboutMe);
		}

		if (favoriteQuotes == null) {
			userProfileImpl.setFavoriteQuotes("");
		}
		else {
			userProfileImpl.setFavoriteQuotes(favoriteQuotes);
		}

		if (favoriteMovie == null) {
			userProfileImpl.setFavoriteMovie("");
		}
		else {
			userProfileImpl.setFavoriteMovie(favoriteMovie);
		}

		if (favoriteGenre == null) {
			userProfileImpl.setFavoriteGenre("");
		}
		else {
			userProfileImpl.setFavoriteGenre(favoriteGenre);
		}

		userProfileImpl.setFavoriteGenreId(favoriteGenreId);

		if (leastFavMovie == null) {
			userProfileImpl.setLeastFavMovie("");
		}
		else {
			userProfileImpl.setLeastFavMovie(leastFavMovie);
		}

		if (favoriteActor == null) {
			userProfileImpl.setFavoriteActor("");
		}
		else {
			userProfileImpl.setFavoriteActor(favoriteActor);
		}

		userProfileImpl.resetOriginalValues();

		return userProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		screenName = objectInput.readUTF();

		male = objectInput.readBoolean();

		birthYear = objectInput.readInt();

		birthMonth = objectInput.readInt();

		birthDay = objectInput.readInt();
		aboutMe = objectInput.readUTF();
		favoriteQuotes = objectInput.readUTF();
		favoriteMovie = objectInput.readUTF();
		favoriteGenre = objectInput.readUTF();

		favoriteGenreId = objectInput.readLong();
		leastFavMovie = objectInput.readUTF();
		favoriteActor = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userId);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		objectOutput.writeBoolean(male);

		objectOutput.writeInt(birthYear);

		objectOutput.writeInt(birthMonth);

		objectOutput.writeInt(birthDay);

		if (aboutMe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(aboutMe);
		}

		if (favoriteQuotes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteQuotes);
		}

		if (favoriteMovie == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteMovie);
		}

		if (favoriteGenre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteGenre);
		}

		objectOutput.writeLong(favoriteGenreId);

		if (leastFavMovie == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leastFavMovie);
		}

		if (favoriteActor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteActor);
		}
	}

	public String uuid;
	public long userId;
	public String firstName;
	public String lastName;
	public String screenName;
	public boolean male;
	public int birthYear;
	public int birthMonth;
	public int birthDay;
	public String aboutMe;
	public String favoriteQuotes;
	public String favoriteMovie;
	public String favoriteGenre;
	public long favoriteGenreId;
	public String leastFavMovie;
	public String favoriteActor;

}