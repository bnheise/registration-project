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

package com.amf.registration.profile.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GeneralProfile}.
 * </p>
 *
 * @author Brian Heise
 * @see GeneralProfile
 * @generated
 */
public class GeneralProfileWrapper
	extends BaseModelWrapper<GeneralProfile>
	implements GeneralProfile, ModelWrapper<GeneralProfile> {

	public GeneralProfileWrapper(GeneralProfile generalProfile) {
		super(generalProfile);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("generalProfileId", getGeneralProfileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("aboutMe", getAboutMe());
		attributes.put("favoriteQuotes", getFavoriteQuotes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long generalProfileId = (Long)attributes.get("generalProfileId");

		if (generalProfileId != null) {
			setGeneralProfileId(generalProfileId);
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

		String aboutMe = (String)attributes.get("aboutMe");

		if (aboutMe != null) {
			setAboutMe(aboutMe);
		}

		String favoriteQuotes = (String)attributes.get("favoriteQuotes");

		if (favoriteQuotes != null) {
			setFavoriteQuotes(favoriteQuotes);
		}
	}

	/**
	 * Returns the about me of this general profile.
	 *
	 * @return the about me of this general profile
	 */
	@Override
	public String getAboutMe() {
		return model.getAboutMe();
	}

	/**
	 * Returns the company ID of this general profile.
	 *
	 * @return the company ID of this general profile
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this general profile.
	 *
	 * @return the create date of this general profile
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the favorite quotes of this general profile.
	 *
	 * @return the favorite quotes of this general profile
	 */
	@Override
	public String getFavoriteQuotes() {
		return model.getFavoriteQuotes();
	}

	/**
	 * Returns the general profile ID of this general profile.
	 *
	 * @return the general profile ID of this general profile
	 */
	@Override
	public long getGeneralProfileId() {
		return model.getGeneralProfileId();
	}

	/**
	 * Returns the group ID of this general profile.
	 *
	 * @return the group ID of this general profile
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this general profile.
	 *
	 * @return the modified date of this general profile
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this general profile.
	 *
	 * @return the primary key of this general profile
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this general profile.
	 *
	 * @return the user ID of this general profile
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this general profile.
	 *
	 * @return the user name of this general profile
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this general profile.
	 *
	 * @return the user uuid of this general profile
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this general profile.
	 *
	 * @return the uuid of this general profile
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
	 * Sets the about me of this general profile.
	 *
	 * @param aboutMe the about me of this general profile
	 */
	@Override
	public void setAboutMe(String aboutMe) {
		model.setAboutMe(aboutMe);
	}

	/**
	 * Sets the company ID of this general profile.
	 *
	 * @param companyId the company ID of this general profile
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this general profile.
	 *
	 * @param createDate the create date of this general profile
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the favorite quotes of this general profile.
	 *
	 * @param favoriteQuotes the favorite quotes of this general profile
	 */
	@Override
	public void setFavoriteQuotes(String favoriteQuotes) {
		model.setFavoriteQuotes(favoriteQuotes);
	}

	/**
	 * Sets the general profile ID of this general profile.
	 *
	 * @param generalProfileId the general profile ID of this general profile
	 */
	@Override
	public void setGeneralProfileId(long generalProfileId) {
		model.setGeneralProfileId(generalProfileId);
	}

	/**
	 * Sets the group ID of this general profile.
	 *
	 * @param groupId the group ID of this general profile
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this general profile.
	 *
	 * @param modifiedDate the modified date of this general profile
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this general profile.
	 *
	 * @param primaryKey the primary key of this general profile
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this general profile.
	 *
	 * @param userId the user ID of this general profile
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this general profile.
	 *
	 * @param userName the user name of this general profile
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this general profile.
	 *
	 * @param userUuid the user uuid of this general profile
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this general profile.
	 *
	 * @param uuid the uuid of this general profile
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
	protected GeneralProfileWrapper wrap(GeneralProfile generalProfile) {
		return new GeneralProfileWrapper(generalProfile);
	}

}