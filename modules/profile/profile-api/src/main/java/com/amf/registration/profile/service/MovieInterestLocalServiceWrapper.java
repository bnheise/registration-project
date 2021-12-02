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
 * Provides a wrapper for {@link MovieInterestLocalService}.
 *
 * @author Brian Heise
 * @see MovieInterestLocalService
 * @generated
 */
public class MovieInterestLocalServiceWrapper
	implements MovieInterestLocalService,
			   ServiceWrapper<MovieInterestLocalService> {

	public MovieInterestLocalServiceWrapper(
		MovieInterestLocalService movieInterestLocalService) {

		_movieInterestLocalService = movieInterestLocalService;
	}

	/**
	 * Adds the movie interest to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MovieInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movieInterest the movie interest
	 * @return the movie interest that was added
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest addMovieInterest(
		com.amf.registration.profile.model.MovieInterest movieInterest) {

		return _movieInterestLocalService.addMovieInterest(movieInterest);
	}

	/**
	 * Creates a new movie interest with the primary key. Does not add the movie interest to the database.
	 *
	 * @param movieInterestId the primary key for the new movie interest
	 * @return the new movie interest
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest createMovieInterest(
		long movieInterestId) {

		return _movieInterestLocalService.createMovieInterest(movieInterestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the movie interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MovieInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest that was removed
	 * @throws PortalException if a movie interest with the primary key could not be found
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest deleteMovieInterest(
			long movieInterestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.deleteMovieInterest(movieInterestId);
	}

	/**
	 * Deletes the movie interest from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MovieInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movieInterest the movie interest
	 * @return the movie interest that was removed
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest deleteMovieInterest(
		com.amf.registration.profile.model.MovieInterest movieInterest) {

		return _movieInterestLocalService.deleteMovieInterest(movieInterest);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _movieInterestLocalService.dynamicQuery();
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

		return _movieInterestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.MovieInterestModelImpl</code>.
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

		return _movieInterestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.MovieInterestModelImpl</code>.
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

		return _movieInterestLocalService.dynamicQuery(
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

		return _movieInterestLocalService.dynamicQueryCount(dynamicQuery);
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

		return _movieInterestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.profile.model.MovieInterest fetchMovieInterest(
		long movieInterestId) {

		return _movieInterestLocalService.fetchMovieInterest(movieInterestId);
	}

	/**
	 * Returns the movie interest matching the UUID and group.
	 *
	 * @param uuid the movie interest's UUID
	 * @param groupId the primary key of the group
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest
		fetchMovieInterestByUuidAndGroupId(String uuid, long groupId) {

		return _movieInterestLocalService.fetchMovieInterestByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _movieInterestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _movieInterestLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _movieInterestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the movie interest with the primary key.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest
	 * @throws PortalException if a movie interest with the primary key could not be found
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest getMovieInterest(
			long movieInterestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.getMovieInterest(movieInterestId);
	}

	@Override
	public com.amf.registration.profile.model.MovieInterest
			getMovieInterestByUserId(
				long userId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.getMovieInterestByUserId(
			userId, serviceContext);
	}

	/**
	 * Returns the movie interest matching the UUID and group.
	 *
	 * @param uuid the movie interest's UUID
	 * @param groupId the primary key of the group
	 * @return the matching movie interest
	 * @throws PortalException if a matching movie interest could not be found
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest
			getMovieInterestByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.getMovieInterestByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the movie interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @return the range of movie interests
	 */
	@Override
	public java.util.List<com.amf.registration.profile.model.MovieInterest>
		getMovieInterests(int start, int end) {

		return _movieInterestLocalService.getMovieInterests(start, end);
	}

	/**
	 * Returns all the movie interests matching the UUID and company.
	 *
	 * @param uuid the UUID of the movie interests
	 * @param companyId the primary key of the company
	 * @return the matching movie interests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.profile.model.MovieInterest>
		getMovieInterestsByUuidAndCompanyId(String uuid, long companyId) {

		return _movieInterestLocalService.getMovieInterestsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of movie interests matching the UUID and company.
	 *
	 * @param uuid the UUID of the movie interests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching movie interests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.profile.model.MovieInterest>
		getMovieInterestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.amf.registration.profile.model.MovieInterest>
					orderByComparator) {

		return _movieInterestLocalService.getMovieInterestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of movie interests.
	 *
	 * @return the number of movie interests
	 */
	@Override
	public int getMovieInterestsCount() {
		return _movieInterestLocalService.getMovieInterestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _movieInterestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _movieInterestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the movie interest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MovieInterestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param movieInterest the movie interest
	 * @return the movie interest that was updated
	 */
	@Override
	public com.amf.registration.profile.model.MovieInterest updateMovieInterest(
		com.amf.registration.profile.model.MovieInterest movieInterest) {

		return _movieInterestLocalService.updateMovieInterest(movieInterest);
	}

	@Override
	public MovieInterestLocalService getWrappedService() {
		return _movieInterestLocalService;
	}

	@Override
	public void setWrappedService(
		MovieInterestLocalService movieInterestLocalService) {

		_movieInterestLocalService = movieInterestLocalService;
	}

	private MovieInterestLocalService _movieInterestLocalService;

}