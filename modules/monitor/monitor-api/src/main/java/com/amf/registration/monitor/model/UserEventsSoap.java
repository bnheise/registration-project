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

package com.amf.registration.monitor.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.monitor.service.http.UserEventsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserEventsSoap implements Serializable {

	public static UserEventsSoap toSoapModel(UserEvents model) {
		UserEventsSoap soapModel = new UserEventsSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserEventId(model.getUserEventId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIpAddress(model.getIpAddress());
		soapModel.setType(model.getType());
		soapModel.setScreenName(model.getScreenName());

		return soapModel;
	}

	public static UserEventsSoap[] toSoapModels(UserEvents[] models) {
		UserEventsSoap[] soapModels = new UserEventsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserEventsSoap[][] toSoapModels(UserEvents[][] models) {
		UserEventsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserEventsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserEventsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserEventsSoap[] toSoapModels(List<UserEvents> models) {
		List<UserEventsSoap> soapModels = new ArrayList<UserEventsSoap>(
			models.size());

		for (UserEvents model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserEventsSoap[soapModels.size()]);
	}

	public UserEventsSoap() {
	}

	public long getPrimaryKey() {
		return _userEventId;
	}

	public void setPrimaryKey(long pk) {
		setUserEventId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserEventId() {
		return _userEventId;
	}

	public void setUserEventId(long userEventId) {
		_userEventId = userEventId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	private String _uuid;
	private long _userEventId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ipAddress;
	private String _type;
	private String _screenName;

}