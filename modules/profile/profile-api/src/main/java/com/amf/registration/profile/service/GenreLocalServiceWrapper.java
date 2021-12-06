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

package com.amf.registration.profile.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GenreLocalService}.
 *
 * @author Brian Heise
 * @see GenreLocalService
 * @generated
 */
public class GenreLocalServiceWrapper
	implements GenreLocalService, ServiceWrapper<GenreLocalService> {

	public GenreLocalServiceWrapper(GenreLocalService genreLocalService) {
		_genreLocalService = genreLocalService;
	}

	/**
	 * Adds the genre to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genre the genre
	 * @return the genre that was added
	 */
	@Override
	public com.amf.registration.profile.model.Genre addGenre(
		com.amf.registration.profile.model.Genre genre) {

		return _genreLocalService.addGenre(genre);
	}

	/**
	 * Creates a new genre with the primary key. Does not add the genre to the database.
	 *
	 * @param genreId the primary key for the new genre
	 * @return the new genre
	 */
	@Override
	public com.amf.registration.profile.model.Genre createGenre(long genreId) {
		return _genreLocalService.createGenre(genreId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genreLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the genre from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genre the genre
	 * @return the genre that was removed
	 */
	@Override
	public com.amf.registration.profile.model.Genre deleteGenre(
		com.amf.registration.profile.model.Genre genre) {

		return _genreLocalService.deleteGenre(genre);
	}

	/**
	 * Deletes the genre with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre that was removed
	 * @throws PortalException if a genre with the primary key could not be found
	 */
	@Override
	public com.amf.registration.profile.model.Genre deleteGenre(long genreId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genreLocalService.deleteGenre(genreId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genreLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _genreLocalService.dynamicQuery();
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

		return _genreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GenreModelImpl</code>.
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

		return _genreLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GenreModelImpl</code>.
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

		return _genreLocalService.dynamicQuery(
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

		return _genreLocalService.dynamicQueryCount(dynamicQuery);
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

		return _genreLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.profile.model.Genre fetchGenre(long genreId) {
		return _genreLocalService.fetchGenre(genreId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _genreLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the genre with the primary key.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre
	 * @throws PortalException if a genre with the primary key could not be found
	 */
	@Override
	public com.amf.registration.profile.model.Genre getGenre(long genreId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genreLocalService.getGenre(genreId);
	}

	/**
	 * Returns a range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of genres
	 */
	@Override
	public java.util.List<com.amf.registration.profile.model.Genre> getGenres(
		int start, int end) {

		return _genreLocalService.getGenres(start, end);
	}

	/**
	 * Returns the number of genres.
	 *
	 * @return the number of genres
	 */
	@Override
	public int getGenresCount() {
		return _genreLocalService.getGenresCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _genreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _genreLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _genreLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the genre in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GenreLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param genre the genre
	 * @return the genre that was updated
	 */
	@Override
	public com.amf.registration.profile.model.Genre updateGenre(
		com.amf.registration.profile.model.Genre genre) {

		return _genreLocalService.updateGenre(genre);
	}

	@Override
	public GenreLocalService getWrappedService() {
		return _genreLocalService;
	}

	@Override
	public void setWrappedService(GenreLocalService genreLocalService) {
		_genreLocalService = genreLocalService;
	}

	private GenreLocalService _genreLocalService;

}