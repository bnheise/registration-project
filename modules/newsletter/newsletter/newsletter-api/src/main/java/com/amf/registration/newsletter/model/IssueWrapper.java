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

package com.amf.registration.newsletter.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Issue}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Issue
 * @generated
 */
public class IssueWrapper
	extends BaseModelWrapper<Issue> implements Issue, ModelWrapper<Issue> {

	public IssueWrapper(Issue issue) {
		super(issue);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("issueDate", getIssueDate());
		attributes.put("byline", getByline());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long issueNumber = (Long)attributes.get("issueNumber");

		if (issueNumber != null) {
			setIssueNumber(issueNumber);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		String byline = (String)attributes.get("byline");

		if (byline != null) {
			setByline(byline);
		}
	}

	/**
	 * Returns the byline of this issue.
	 *
	 * @return the byline of this issue
	 */
	@Override
	public String getByline() {
		return model.getByline();
	}

	/**
	 * Returns the description of this issue.
	 *
	 * @return the description of this issue
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the issue date of this issue.
	 *
	 * @return the issue date of this issue
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the issue number of this issue.
	 *
	 * @return the issue number of this issue
	 */
	@Override
	public long getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the primary key of this issue.
	 *
	 * @return the primary key of this issue
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this issue.
	 *
	 * @return the title of this issue
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the byline of this issue.
	 *
	 * @param byline the byline of this issue
	 */
	@Override
	public void setByline(String byline) {
		model.setByline(byline);
	}

	/**
	 * Sets the description of this issue.
	 *
	 * @param description the description of this issue
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the issue date of this issue.
	 *
	 * @param issueDate the issue date of this issue
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the issue number of this issue.
	 *
	 * @param issueNumber the issue number of this issue
	 */
	@Override
	public void setIssueNumber(long issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the primary key of this issue.
	 *
	 * @param primaryKey the primary key of this issue
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this issue.
	 *
	 * @param title the title of this issue
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected IssueWrapper wrap(Issue issue) {
		return new IssueWrapper(issue);
	}

}