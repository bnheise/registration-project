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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserEvents}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEvents
 * @generated
 */
public class UserEventsWrapper
	extends BaseModelWrapper<UserEvents>
	implements ModelWrapper<UserEvents>, UserEvents {

	public UserEventsWrapper(UserEvents userEvents) {
		super(userEvents);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userEventId", getUserEventId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("type", getType());
		attributes.put("screenName", getScreenName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userEventId = (Long)attributes.get("userEventId");

		if (userEventId != null) {
			setUserEventId(userEventId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}
	}

	/**
	 * Returns the company ID of this user events.
	 *
	 * @return the company ID of this user events
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this user events.
	 *
	 * @return the create date of this user events
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this user events.
	 *
	 * @return the group ID of this user events
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ip address of this user events.
	 *
	 * @return the ip address of this user events
	 */
	@Override
	public String getIpAddress() {
		return model.getIpAddress();
	}

	/**
	 * Returns the modified date of this user events.
	 *
	 * @return the modified date of this user events
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this user events.
	 *
	 * @return the primary key of this user events
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the screen name of this user events.
	 *
	 * @return the screen name of this user events
	 */
	@Override
	public String getScreenName() {
		return model.getScreenName();
	}

	/**
	 * Returns the type of this user events.
	 *
	 * @return the type of this user events
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the user event ID of this user events.
	 *
	 * @return the user event ID of this user events
	 */
	@Override
	public long getUserEventId() {
		return model.getUserEventId();
	}

	/**
	 * Returns the user ID of this user events.
	 *
	 * @return the user ID of this user events
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this user events.
	 *
	 * @return the user name of this user events
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this user events.
	 *
	 * @return the user uuid of this user events
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user events.
	 *
	 * @return the uuid of this user events
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this user events.
	 *
	 * @param companyId the company ID of this user events
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this user events.
	 *
	 * @param createDate the create date of this user events
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this user events.
	 *
	 * @param groupId the group ID of this user events
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ip address of this user events.
	 *
	 * @param ipAddress the ip address of this user events
	 */
	@Override
	public void setIpAddress(String ipAddress) {
		model.setIpAddress(ipAddress);
	}

	/**
	 * Sets the modified date of this user events.
	 *
	 * @param modifiedDate the modified date of this user events
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this user events.
	 *
	 * @param primaryKey the primary key of this user events
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the screen name of this user events.
	 *
	 * @param screenName the screen name of this user events
	 */
	@Override
	public void setScreenName(String screenName) {
		model.setScreenName(screenName);
	}

	/**
	 * Sets the type of this user events.
	 *
	 * @param type the type of this user events
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the user event ID of this user events.
	 *
	 * @param userEventId the user event ID of this user events
	 */
	@Override
	public void setUserEventId(long userEventId) {
		model.setUserEventId(userEventId);
	}

	/**
	 * Sets the user ID of this user events.
	 *
	 * @param userId the user ID of this user events
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this user events.
	 *
	 * @param userName the user name of this user events
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this user events.
	 *
	 * @param userUuid the user uuid of this user events
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user events.
	 *
	 * @param uuid the uuid of this user events
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected UserEventsWrapper wrap(UserEvents userEvents) {
		return new UserEventsWrapper(userEvents);
	}

}