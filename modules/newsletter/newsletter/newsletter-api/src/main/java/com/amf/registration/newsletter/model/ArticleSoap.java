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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.newsletter.service.http.ArticleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ArticleSoap implements Serializable {

	public static ArticleSoap toSoapModel(Article model) {
		ArticleSoap soapModel = new ArticleSoap();

		soapModel.setIssueNumber(model.getIssueNumber());
		soapModel.setTitle(model.getTitle());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setOrder(model.getOrder());
		soapModel.setContent(model.getContent());

		return soapModel;
	}

	public static ArticleSoap[] toSoapModels(Article[] models) {
		ArticleSoap[] soapModels = new ArticleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ArticleSoap[][] toSoapModels(Article[][] models) {
		ArticleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ArticleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ArticleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ArticleSoap[] toSoapModels(List<Article> models) {
		List<ArticleSoap> soapModels = new ArrayList<ArticleSoap>(
			models.size());

		for (Article model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ArticleSoap[soapModels.size()]);
	}

	public ArticleSoap() {
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

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	private long _issueNumber;
	private String _title;
	private String _author;
	private int _order;
	private String _content;

}