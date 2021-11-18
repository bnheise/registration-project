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

package com.amf.registration.search.model;

import com.amf.registration.search.service.persistence.UserAddressPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.search.service.http.UserAddressServiceSoap}.
 *
 * @author Brian Heise
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserAddressSoap implements Serializable {

	public static UserAddressSoap toSoapModel(UserAddress model) {
		UserAddressSoap soapModel = new UserAddressSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setName(model.getName());
		soapModel.setScreenName(model.getScreenName());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setZip(model.getZip());

		return soapModel;
	}

	public static UserAddressSoap[] toSoapModels(UserAddress[] models) {
		UserAddressSoap[] soapModels = new UserAddressSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserAddressSoap[][] toSoapModels(UserAddress[][] models) {
		UserAddressSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserAddressSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserAddressSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserAddressSoap[] toSoapModels(List<UserAddress> models) {
		List<UserAddressSoap> soapModels = new ArrayList<UserAddressSoap>(
			models.size());

		for (UserAddress model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserAddressSoap[soapModels.size()]);
	}

	public UserAddressSoap() {
	}

	public UserAddressPK getPrimaryKey() {
		return new UserAddressPK(_userId, _companyId);
	}

	public void setPrimaryKey(UserAddressPK pk) {
		setUserId(pk.userId);
		setCompanyId(pk.companyId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getScreenName() {
		return _screenName;
	}

	public void setScreenName(String screenName) {
		_screenName = screenName;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	private long _userId;
	private long _companyId;
	private String _name;
	private String _screenName;
	private String _emailAddress;
	private String _zip;

}