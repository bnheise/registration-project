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

import com.amf.registration.profile.model.GeneralProfile;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GeneralProfile in entity cache.
 *
 * @author Brian Heise
 * @generated
 */
public class GeneralProfileCacheModel
	implements CacheModel<GeneralProfile>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GeneralProfileCacheModel)) {
			return false;
		}

		GeneralProfileCacheModel generalProfileCacheModel =
			(GeneralProfileCacheModel)object;

		if (generalProfileId == generalProfileCacheModel.generalProfileId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, generalProfileId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", generalProfileId=");
		sb.append(generalProfileId);
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
		sb.append(", aboutMe=");
		sb.append(aboutMe);
		sb.append(", favoriteQuotes=");
		sb.append(favoriteQuotes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GeneralProfile toEntityModel() {
		GeneralProfileImpl generalProfileImpl = new GeneralProfileImpl();

		if (uuid == null) {
			generalProfileImpl.setUuid("");
		}
		else {
			generalProfileImpl.setUuid(uuid);
		}

		generalProfileImpl.setGeneralProfileId(generalProfileId);
		generalProfileImpl.setGroupId(groupId);
		generalProfileImpl.setCompanyId(companyId);
		generalProfileImpl.setUserId(userId);

		if (userName == null) {
			generalProfileImpl.setUserName("");
		}
		else {
			generalProfileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			generalProfileImpl.setCreateDate(null);
		}
		else {
			generalProfileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			generalProfileImpl.setModifiedDate(null);
		}
		else {
			generalProfileImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (aboutMe == null) {
			generalProfileImpl.setAboutMe("");
		}
		else {
			generalProfileImpl.setAboutMe(aboutMe);
		}

		if (favoriteQuotes == null) {
			generalProfileImpl.setFavoriteQuotes("");
		}
		else {
			generalProfileImpl.setFavoriteQuotes(favoriteQuotes);
		}

		generalProfileImpl.resetOriginalValues();

		return generalProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		generalProfileId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		aboutMe = objectInput.readUTF();
		favoriteQuotes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(generalProfileId);

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
	}

	public String uuid;
	public long generalProfileId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String aboutMe;
	public String favoriteQuotes;

}