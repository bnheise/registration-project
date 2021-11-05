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

package com.amf.registration.monitor.model.impl;

import com.amf.registration.monitor.model.UserEvents;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserEvents in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserEventsCacheModel
	implements CacheModel<UserEvents>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserEventsCacheModel)) {
			return false;
		}

		UserEventsCacheModel userEventsCacheModel =
			(UserEventsCacheModel)object;

		if (userEventId == userEventsCacheModel.userEventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userEventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userEventId=");
		sb.append(userEventId);
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
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", type=");
		sb.append(type);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserEvents toEntityModel() {
		UserEventsImpl userEventsImpl = new UserEventsImpl();

		if (uuid == null) {
			userEventsImpl.setUuid("");
		}
		else {
			userEventsImpl.setUuid(uuid);
		}

		userEventsImpl.setUserEventId(userEventId);
		userEventsImpl.setGroupId(groupId);
		userEventsImpl.setCompanyId(companyId);
		userEventsImpl.setUserId(userId);

		if (userName == null) {
			userEventsImpl.setUserName("");
		}
		else {
			userEventsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			userEventsImpl.setCreateDate(null);
		}
		else {
			userEventsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userEventsImpl.setModifiedDate(null);
		}
		else {
			userEventsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ipAddress == null) {
			userEventsImpl.setIpAddress("");
		}
		else {
			userEventsImpl.setIpAddress(ipAddress);
		}

		if (type == null) {
			userEventsImpl.setType("");
		}
		else {
			userEventsImpl.setType(type);
		}

		if (screenName == null) {
			userEventsImpl.setScreenName("");
		}
		else {
			userEventsImpl.setScreenName(screenName);
		}

		userEventsImpl.resetOriginalValues();

		return userEventsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userEventId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ipAddress = objectInput.readUTF();
		type = objectInput.readUTF();
		screenName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userEventId);

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

		if (ipAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ipAddress);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}
	}

	public String uuid;
	public long userEventId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ipAddress;
	public String type;
	public String screenName;

}