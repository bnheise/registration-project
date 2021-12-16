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

package com.amf.registration.newsletter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ArticleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ArticleLocalService
 * @generated
 */
public class ArticleLocalServiceWrapper
	implements ArticleLocalService, ServiceWrapper<ArticleLocalService> {

	public ArticleLocalServiceWrapper(ArticleLocalService articleLocalService) {
		_articleLocalService = articleLocalService;
	}

	/**
	 * Adds the article to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ArticleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param article the article
	 * @return the article that was added
	 */
	@Override
	public com.amf.registration.newsletter.model.Article addArticle(
		com.amf.registration.newsletter.model.Article article) {

		return _articleLocalService.addArticle(article);
	}

	/**
	 * Creates a new article with the primary key. Does not add the article to the database.
	 *
	 * @param issueNumber the primary key for the new article
	 * @return the new article
	 */
	@Override
	public com.amf.registration.newsletter.model.Article createArticle(
		long issueNumber) {

		return _articleLocalService.createArticle(issueNumber);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _articleLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the article from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ArticleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param article the article
	 * @return the article that was removed
	 */
	@Override
	public com.amf.registration.newsletter.model.Article deleteArticle(
		com.amf.registration.newsletter.model.Article article) {

		return _articleLocalService.deleteArticle(article);
	}

	/**
	 * Deletes the article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ArticleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issueNumber the primary key of the article
	 * @return the article that was removed
	 * @throws PortalException if a article with the primary key could not be found
	 */
	@Override
	public com.amf.registration.newsletter.model.Article deleteArticle(
			long issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _articleLocalService.deleteArticle(issueNumber);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _articleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _articleLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _articleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _articleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _articleLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _articleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _articleLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.newsletter.model.Article fetchArticle(
		long issueNumber) {

		return _articleLocalService.fetchArticle(issueNumber);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _articleLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the article with the primary key.
	 *
	 * @param issueNumber the primary key of the article
	 * @return the article
	 * @throws PortalException if a article with the primary key could not be found
	 */
	@Override
	public com.amf.registration.newsletter.model.Article getArticle(
			long issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _articleLocalService.getArticle(issueNumber);
	}

	/**
	 * Returns a range of all the articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of articles
	 * @param end the upper bound of the range of articles (not inclusive)
	 * @return the range of articles
	 */
	@Override
	public java.util.List<com.amf.registration.newsletter.model.Article>
		getArticles(int start, int end) {

		return _articleLocalService.getArticles(start, end);
	}

	/**
	 * Returns the number of articles.
	 *
	 * @return the number of articles
	 */
	@Override
	public int getArticlesCount() {
		return _articleLocalService.getArticlesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _articleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _articleLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _articleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ArticleLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param article the article
	 * @return the article that was updated
	 */
	@Override
	public com.amf.registration.newsletter.model.Article updateArticle(
		com.amf.registration.newsletter.model.Article article) {

		return _articleLocalService.updateArticle(article);
	}

	@Override
	public ArticleLocalService getWrappedService() {
		return _articleLocalService;
	}

	@Override
	public void setWrappedService(ArticleLocalService articleLocalService) {
		_articleLocalService = articleLocalService;
	}

	private ArticleLocalService _articleLocalService;

}