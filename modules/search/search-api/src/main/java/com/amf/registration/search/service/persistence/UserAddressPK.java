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

package com.amf.registration.search.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserAddressPK implements Comparable<UserAddressPK>, Serializable {

	public long userId;
	public long copmanyId;

	public UserAddressPK() {
	}

	public UserAddressPK(long userId, long copmanyId) {
		this.userId = userId;
		this.copmanyId = copmanyId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCopmanyId() {
		return copmanyId;
	}

	public void setCopmanyId(long copmanyId) {
		this.copmanyId = copmanyId;
	}

	@Override
	public int compareTo(UserAddressPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (userId < pk.userId) {
			value = -1;
		}
		else if (userId > pk.userId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (copmanyId < pk.copmanyId) {
			value = -1;
		}
		else if (copmanyId > pk.copmanyId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserAddressPK)) {
			return false;
		}

		UserAddressPK pk = (UserAddressPK)object;

		if ((userId == pk.userId) && (copmanyId == pk.copmanyId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, userId);
		hashCode = HashUtil.hash(hashCode, copmanyId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("userId=");

		sb.append(userId);
		sb.append(", copmanyId=");

		sb.append(copmanyId);

		sb.append("}");

		return sb.toString();
	}

}