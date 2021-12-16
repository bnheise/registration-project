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

package com.amf.registration.newsletter.model.impl;

import com.amf.registration.newsletter.model.Article;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Article in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ArticleCacheModel implements CacheModel<Article>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ArticleCacheModel)) {
			return false;
		}

		ArticleCacheModel articleCacheModel = (ArticleCacheModel)object;

		if (issueNumber == articleCacheModel.issueNumber) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, issueNumber);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{issueNumber=");
		sb.append(issueNumber);
		sb.append(", title=");
		sb.append(title);
		sb.append(", author=");
		sb.append(author);
		sb.append(", order=");
		sb.append(order);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Article toEntityModel() {
		ArticleImpl articleImpl = new ArticleImpl();

		articleImpl.setIssueNumber(issueNumber);

		if (title == null) {
			articleImpl.setTitle("");
		}
		else {
			articleImpl.setTitle(title);
		}

		if (author == null) {
			articleImpl.setAuthor("");
		}
		else {
			articleImpl.setAuthor(author);
		}

		articleImpl.setOrder(order);

		if (content == null) {
			articleImpl.setContent("");
		}
		else {
			articleImpl.setContent(content);
		}

		articleImpl.resetOriginalValues();

		return articleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		issueNumber = objectInput.readLong();
		title = objectInput.readUTF();
		author = objectInput.readUTF();

		order = objectInput.readInt();
		content = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(issueNumber);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (author == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(author);
		}

		objectOutput.writeInt(order);

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}
	}

	public long issueNumber;
	public String title;
	public String author;
	public int order;
	public String content;

}