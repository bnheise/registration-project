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

package com.amf.registration.search.model.impl;

import com.amf.registration.search.model.UserAddress;
import com.amf.registration.search.service.persistence.UserAddressPK;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserAddressCacheModel
	implements CacheModel<UserAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserAddressCacheModel)) {
			return false;
		}

		UserAddressCacheModel userAddressCacheModel =
			(UserAddressCacheModel)object;

		if (userAddressPK.equals(userAddressCacheModel.userAddressPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userAddressPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", copmanyId=");
		sb.append(copmanyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", zip=");
		sb.append(zip);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserAddress toEntityModel() {
		UserAddressImpl userAddressImpl = new UserAddressImpl();

		userAddressImpl.setUserId(userId);
		userAddressImpl.setCopmanyId(copmanyId);

		if (name == null) {
			userAddressImpl.setName("");
		}
		else {
			userAddressImpl.setName(name);
		}

		if (screenName == null) {
			userAddressImpl.setScreenName("");
		}
		else {
			userAddressImpl.setScreenName(screenName);
		}

		if (emailAddress == null) {
			userAddressImpl.setEmailAddress("");
		}
		else {
			userAddressImpl.setEmailAddress(emailAddress);
		}

		if (zip == null) {
			userAddressImpl.setZip("");
		}
		else {
			userAddressImpl.setZip(zip);
		}

		userAddressImpl.resetOriginalValues();

		return userAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();

		copmanyId = objectInput.readLong();
		name = objectInput.readUTF();
		screenName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		zip = objectInput.readUTF();

		userAddressPK = new UserAddressPK(userId, copmanyId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(userId);

		objectOutput.writeLong(copmanyId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (zip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zip);
		}
	}

	public long userId;
	public long copmanyId;
	public String name;
	public String screenName;
	public String emailAddress;
	public String zip;
	public transient UserAddressPK userAddressPK;

}