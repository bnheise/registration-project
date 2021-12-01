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

import com.amf.registration.profile.model.MovieInterest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MovieInterest. This utility wraps
 * <code>com.amf.registration.profile.service.impl.MovieInterestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Heise
 * @see MovieInterestLocalService
 * @generated
 */
public class MovieInterestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.profile.service.impl.MovieInterestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MovieInterest addMovieInterest(MovieInterest movieInterest) {
		return getService().addMovieInterest(movieInterest);
	}

	/**
	 * Creates a new movie interest with the primary key. Does not add the movie interest to the database.
	 *
	 * @param movieInterestId the primary key for the new movie interest
	 * @return the new movie interest
	 */
	public static MovieInterest createMovieInterest(long movieInterestId) {
		return getService().createMovieInterest(movieInterestId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static MovieInterest deleteMovieInterest(long movieInterestId)
		throws PortalException {

		return getService().deleteMovieInterest(movieInterestId);
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
	public static MovieInterest deleteMovieInterest(
		MovieInterest movieInterest) {

		return getService().deleteMovieInterest(movieInterest);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MovieInterest fetchMovieInterest(long movieInterestId) {
		return getService().fetchMovieInterest(movieInterestId);
	}

	/**
	 * Returns the movie interest matching the UUID and group.
	 *
	 * @param uuid the movie interest's UUID
	 * @param groupId the primary key of the group
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchMovieInterestByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMovieInterestByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the movie interest with the primary key.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest
	 * @throws PortalException if a movie interest with the primary key could not be found
	 */
	public static MovieInterest getMovieInterest(long movieInterestId)
		throws PortalException {

		return getService().getMovieInterest(movieInterestId);
	}

	/**
	 * Returns the movie interest matching the UUID and group.
	 *
	 * @param uuid the movie interest's UUID
	 * @param groupId the primary key of the group
	 * @return the matching movie interest
	 * @throws PortalException if a matching movie interest could not be found
	 */
	public static MovieInterest getMovieInterestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMovieInterestByUuidAndGroupId(uuid, groupId);
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
	public static List<MovieInterest> getMovieInterests(int start, int end) {
		return getService().getMovieInterests(start, end);
	}

	/**
	 * Returns all the movie interests matching the UUID and company.
	 *
	 * @param uuid the UUID of the movie interests
	 * @param companyId the primary key of the company
	 * @return the matching movie interests, or an empty list if no matches were found
	 */
	public static List<MovieInterest> getMovieInterestsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMovieInterestsByUuidAndCompanyId(
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
	public static List<MovieInterest> getMovieInterestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getService().getMovieInterestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of movie interests.
	 *
	 * @return the number of movie interests
	 */
	public static int getMovieInterestsCount() {
		return getService().getMovieInterestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static MovieInterest updateMovieInterest(
		MovieInterest movieInterest) {

		return getService().updateMovieInterest(movieInterest);
	}

	public static MovieInterestLocalService getService() {
		return _service;
	}

	private static volatile MovieInterestLocalService _service;

}