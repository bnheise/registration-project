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

import com.amf.registration.profile.model.Genre;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Genre in entity cache.
 *
 * @author Brian Heise
 * @generated
 */
public class GenreCacheModel implements CacheModel<Genre>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GenreCacheModel)) {
			return false;
		}

		GenreCacheModel genreCacheModel = (GenreCacheModel)object;

		if (genreId == genreCacheModel.genreId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, genreId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", genreId=");
		sb.append(genreId);
		sb.append(", genreName=");
		sb.append(genreName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Genre toEntityModel() {
		GenreImpl genreImpl = new GenreImpl();

		if (uuid == null) {
			genreImpl.setUuid("");
		}
		else {
			genreImpl.setUuid(uuid);
		}

		genreImpl.setGenreId(genreId);

		if (genreName == null) {
			genreImpl.setGenreName("");
		}
		else {
			genreImpl.setGenreName(genreName);
		}

		genreImpl.resetOriginalValues();

		return genreImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		genreId = objectInput.readLong();
		genreName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(genreId);

		if (genreName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(genreName);
		}
	}

	public String uuid;
	public long genreId;
	public String genreName;

}