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

import com.amf.registration.monitor.model.UserEvent;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserEvent in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserEventCacheModel
	implements CacheModel<UserEvent>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserEventCacheModel)) {
			return false;
		}

		UserEventCacheModel userEventCacheModel = (UserEventCacheModel)object;

		if (userEventId == userEventCacheModel.userEventId) {
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
		StringBundler sb = new StringBundler(19);

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
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserEvent toEntityModel() {
		UserEventImpl userEventImpl = new UserEventImpl();

		if (uuid == null) {
			userEventImpl.setUuid("");
		}
		else {
			userEventImpl.setUuid(uuid);
		}

		userEventImpl.setUserEventId(userEventId);
		userEventImpl.setGroupId(groupId);
		userEventImpl.setCompanyId(companyId);
		userEventImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			userEventImpl.setCreateDate(null);
		}
		else {
			userEventImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userEventImpl.setModifiedDate(null);
		}
		else {
			userEventImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ipAddress == null) {
			userEventImpl.setIpAddress("");
		}
		else {
			userEventImpl.setIpAddress(ipAddress);
		}

		if (type == null) {
			userEventImpl.setType("");
		}
		else {
			userEventImpl.setType(type);
		}

		userEventImpl.resetOriginalValues();

		return userEventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userEventId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ipAddress = objectInput.readUTF();
		type = objectInput.readUTF();
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
	}

	public String uuid;
	public long userEventId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String ipAddress;
	public String type;

}