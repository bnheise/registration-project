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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAddress
 * @generated
 */
public class UserAddressWrapper
	extends BaseModelWrapper<UserAddress>
	implements ModelWrapper<UserAddress>, UserAddress {

	public UserAddressWrapper(UserAddress userAddress) {
		super(userAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("copmanyId", getCopmanyId());
		attributes.put("name", getName());
		attributes.put("screenName", getScreenName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("zip", getZip());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long copmanyId = (Long)attributes.get("copmanyId");

		if (copmanyId != null) {
			setCopmanyId(copmanyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}
	}

	/**
	 * Returns the copmany ID of this user address.
	 *
	 * @return the copmany ID of this user address
	 */
	@Override
	public long getCopmanyId() {
		return model.getCopmanyId();
	}

	/**
	 * Returns the email address of this user address.
	 *
	 * @return the email address of this user address
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the name of this user address.
	 *
	 * @return the name of this user address
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this user address.
	 *
	 * @return the primary key of this user address
	 */
	@Override
	public com.amf.registration.search.service.persistence.UserAddressPK
		getPrimaryKey() {

		return model.getPrimaryKey();
	}

	/**
	 * Returns the screen name of this user address.
	 *
	 * @return the screen name of this user address
	 */
	@Override
	public String getScreenName() {
		return model.getScreenName();
	}

	/**
	 * Returns the user ID of this user address.
	 *
	 * @return the user ID of this user address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this user address.
	 *
	 * @return the user uuid of this user address
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the zip of this user address.
	 *
	 * @return the zip of this user address
	 */
	@Override
	public String getZip() {
		return model.getZip();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the copmany ID of this user address.
	 *
	 * @param copmanyId the copmany ID of this user address
	 */
	@Override
	public void setCopmanyId(long copmanyId) {
		model.setCopmanyId(copmanyId);
	}

	/**
	 * Sets the email address of this user address.
	 *
	 * @param emailAddress the email address of this user address
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the name of this user address.
	 *
	 * @param name the name of this user address
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this user address.
	 *
	 * @param primaryKey the primary key of this user address
	 */
	@Override
	public void setPrimaryKey(
		com.amf.registration.search.service.persistence.UserAddressPK
			primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the screen name of this user address.
	 *
	 * @param screenName the screen name of this user address
	 */
	@Override
	public void setScreenName(String screenName) {
		model.setScreenName(screenName);
	}

	/**
	 * Sets the user ID of this user address.
	 *
	 * @param userId the user ID of this user address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this user address.
	 *
	 * @param userUuid the user uuid of this user address
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the zip of this user address.
	 *
	 * @param zip the zip of this user address
	 */
	@Override
	public void setZip(String zip) {
		model.setZip(zip);
	}

	@Override
	protected UserAddressWrapper wrap(UserAddress userAddress) {
		return new UserAddressWrapper(userAddress);
	}

}