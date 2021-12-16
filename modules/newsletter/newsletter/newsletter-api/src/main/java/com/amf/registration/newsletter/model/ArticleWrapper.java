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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Article}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Article
 * @generated
 */
public class ArticleWrapper
	extends BaseModelWrapper<Article>
	implements Article, ModelWrapper<Article> {

	public ArticleWrapper(Article article) {
		super(article);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("issueNumber", getIssueNumber());
		attributes.put("title", getTitle());
		attributes.put("author", getAuthor());
		attributes.put("order", getOrder());
		attributes.put("content", getContent());

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

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	/**
	 * Returns the author of this article.
	 *
	 * @return the author of this article
	 */
	@Override
	public String getAuthor() {
		return model.getAuthor();
	}

	/**
	 * Returns the content of this article.
	 *
	 * @return the content of this article
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the issue number of this article.
	 *
	 * @return the issue number of this article
	 */
	@Override
	public long getIssueNumber() {
		return model.getIssueNumber();
	}

	/**
	 * Returns the order of this article.
	 *
	 * @return the order of this article
	 */
	@Override
	public int getOrder() {
		return model.getOrder();
	}

	/**
	 * Returns the primary key of this article.
	 *
	 * @return the primary key of this article
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this article.
	 *
	 * @return the title of this article
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
	 * Sets the author of this article.
	 *
	 * @param author the author of this article
	 */
	@Override
	public void setAuthor(String author) {
		model.setAuthor(author);
	}

	/**
	 * Sets the content of this article.
	 *
	 * @param content the content of this article
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the issue number of this article.
	 *
	 * @param issueNumber the issue number of this article
	 */
	@Override
	public void setIssueNumber(long issueNumber) {
		model.setIssueNumber(issueNumber);
	}

	/**
	 * Sets the order of this article.
	 *
	 * @param order the order of this article
	 */
	@Override
	public void setOrder(int order) {
		model.setOrder(order);
	}

	/**
	 * Sets the primary key of this article.
	 *
	 * @param primaryKey the primary key of this article
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this article.
	 *
	 * @param title the title of this article
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	protected ArticleWrapper wrap(Article article) {
		return new ArticleWrapper(article);
	}

}