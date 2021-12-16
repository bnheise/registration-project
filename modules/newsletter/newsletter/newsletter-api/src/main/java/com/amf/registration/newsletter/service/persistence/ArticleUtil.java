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

package com.amf.registration.newsletter.service.persistence;

import com.amf.registration.newsletter.model.Article;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the article service. This utility wraps <code>com.amf.registration.newsletter.service.persistence.impl.ArticlePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ArticlePersistence
 * @generated
 */
public class ArticleUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Article article) {
		getPersistence().clearCache(article);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Article> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Article> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Article> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Article> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Article> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Article update(Article article) {
		return getPersistence().update(article);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Article update(
		Article article, ServiceContext serviceContext) {

		return getPersistence().update(article, serviceContext);
	}

	/**
	 * Caches the article in the entity cache if it is enabled.
	 *
	 * @param article the article
	 */
	public static void cacheResult(Article article) {
		getPersistence().cacheResult(article);
	}

	/**
	 * Caches the articles in the entity cache if it is enabled.
	 *
	 * @param articles the articles
	 */
	public static void cacheResult(List<Article> articles) {
		getPersistence().cacheResult(articles);
	}

	/**
	 * Creates a new article with the primary key. Does not add the article to the database.
	 *
	 * @param issueNumber the primary key for the new article
	 * @return the new article
	 */
	public static Article create(long issueNumber) {
		return getPersistence().create(issueNumber);
	}

	/**
	 * Removes the article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issueNumber the primary key of the article
	 * @return the article that was removed
	 * @throws NoSuchArticleException if a article with the primary key could not be found
	 */
	public static Article remove(long issueNumber)
		throws com.amf.registration.newsletter.exception.
			NoSuchArticleException {

		return getPersistence().remove(issueNumber);
	}

	public static Article updateImpl(Article article) {
		return getPersistence().updateImpl(article);
	}

	/**
	 * Returns the article with the primary key or throws a <code>NoSuchArticleException</code> if it could not be found.
	 *
	 * @param issueNumber the primary key of the article
	 * @return the article
	 * @throws NoSuchArticleException if a article with the primary key could not be found
	 */
	public static Article findByPrimaryKey(long issueNumber)
		throws com.amf.registration.newsletter.exception.
			NoSuchArticleException {

		return getPersistence().findByPrimaryKey(issueNumber);
	}

	/**
	 * Returns the article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issueNumber the primary key of the article
	 * @return the article, or <code>null</code> if a article with the primary key could not be found
	 */
	public static Article fetchByPrimaryKey(long issueNumber) {
		return getPersistence().fetchByPrimaryKey(issueNumber);
	}

	/**
	 * Returns all the articles.
	 *
	 * @return the articles
	 */
	public static List<Article> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of articles
	 * @param end the upper bound of the range of articles (not inclusive)
	 * @return the range of articles
	 */
	public static List<Article> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of articles
	 * @param end the upper bound of the range of articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of articles
	 */
	public static List<Article> findAll(
		int start, int end, OrderByComparator<Article> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ArticleModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of articles
	 * @param end the upper bound of the range of articles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of articles
	 */
	public static List<Article> findAll(
		int start, int end, OrderByComparator<Article> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the articles from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of articles.
	 *
	 * @return the number of articles
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ArticlePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ArticlePersistence, ArticlePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ArticlePersistence.class);

		ServiceTracker<ArticlePersistence, ArticlePersistence> serviceTracker =
			new ServiceTracker<ArticlePersistence, ArticlePersistence>(
				bundle.getBundleContext(), ArticlePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}