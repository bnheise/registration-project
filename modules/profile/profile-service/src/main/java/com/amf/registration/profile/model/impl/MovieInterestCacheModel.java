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

import com.amf.registration.profile.model.MovieInterest;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MovieInterest in entity cache.
 *
 * @author Brian Heise
 * @generated
 */
public class MovieInterestCacheModel
	implements CacheModel<MovieInterest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MovieInterestCacheModel)) {
			return false;
		}

		MovieInterestCacheModel movieInterestCacheModel =
			(MovieInterestCacheModel)object;

		if (movieInterestId == movieInterestCacheModel.movieInterestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, movieInterestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", movieInterestId=");
		sb.append(movieInterestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", favoriteGenre=");
		sb.append(favoriteGenre);
		sb.append(", favoriteMovie=");
		sb.append(favoriteMovie);
		sb.append(", leastFavMovie=");
		sb.append(leastFavMovie);
		sb.append(", favoriteActor=");
		sb.append(favoriteActor);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MovieInterest toEntityModel() {
		MovieInterestImpl movieInterestImpl = new MovieInterestImpl();

		if (uuid == null) {
			movieInterestImpl.setUuid("");
		}
		else {
			movieInterestImpl.setUuid(uuid);
		}

		movieInterestImpl.setMovieInterestId(movieInterestId);
		movieInterestImpl.setGroupId(groupId);
		movieInterestImpl.setCompanyId(companyId);
		movieInterestImpl.setUserId(userId);

		if (userName == null) {
			movieInterestImpl.setUserName("");
		}
		else {
			movieInterestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			movieInterestImpl.setCreateDate(null);
		}
		else {
			movieInterestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			movieInterestImpl.setModifiedDate(null);
		}
		else {
			movieInterestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (favoriteGenre == null) {
			movieInterestImpl.setFavoriteGenre("");
		}
		else {
			movieInterestImpl.setFavoriteGenre(favoriteGenre);
		}

		if (favoriteMovie == null) {
			movieInterestImpl.setFavoriteMovie("");
		}
		else {
			movieInterestImpl.setFavoriteMovie(favoriteMovie);
		}

		if (leastFavMovie == null) {
			movieInterestImpl.setLeastFavMovie("");
		}
		else {
			movieInterestImpl.setLeastFavMovie(leastFavMovie);
		}

		if (favoriteActor == null) {
			movieInterestImpl.setFavoriteActor("");
		}
		else {
			movieInterestImpl.setFavoriteActor(favoriteActor);
		}

		movieInterestImpl.resetOriginalValues();

		return movieInterestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		movieInterestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		favoriteGenre = objectInput.readUTF();
		favoriteMovie = objectInput.readUTF();
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

		objectOutput.writeLong(movieInterestId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (favoriteGenre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteGenre);
		}

		if (favoriteMovie == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(favoriteMovie);
		}

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
	public long movieInterestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String favoriteGenre;
	public String favoriteMovie;
	public String leastFavMovie;
	public String favoriteActor;

}