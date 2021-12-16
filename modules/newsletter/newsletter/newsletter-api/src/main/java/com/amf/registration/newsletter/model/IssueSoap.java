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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.newsletter.service.http.IssueServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class IssueSoap implements Serializable {

	public static IssueSoap toSoapModel(Issue model) {
		IssueSoap soapModel = new IssueSoap();

		soapModel.setIssueNumber(model.getIssueNumber());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setByline(model.getByline());

		return soapModel;
	}

	public static IssueSoap[] toSoapModels(Issue[] models) {
		IssueSoap[] soapModels = new IssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[][] toSoapModels(Issue[][] models) {
		IssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[] toSoapModels(List<Issue> models) {
		List<IssueSoap> soapModels = new ArrayList<IssueSoap>(models.size());

		for (Issue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueSoap[soapModels.size()]);
	}

	public IssueSoap() {
	}

	public long getPrimaryKey() {
		return _issueNumber;
	}

	public void setPrimaryKey(long pk) {
		setIssueNumber(pk);
	}

	public long getIssueNumber() {
		return _issueNumber;
	}

	public void setIssueNumber(long issueNumber) {
		_issueNumber = issueNumber;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public String getByline() {
		return _byline;
	}

	public void setByline(String byline) {
		_byline = byline;
	}

	private long _issueNumber;
	private String _title;
	private String _description;
	private Date _issueDate;
	private String _byline;

}