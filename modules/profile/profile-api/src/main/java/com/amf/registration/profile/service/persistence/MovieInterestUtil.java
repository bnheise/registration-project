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

package com.amf.registration.profile.service.persistence;

import com.amf.registration.profile.model.MovieInterest;

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
 * The persistence utility for the movie interest service. This utility wraps <code>com.amf.registration.profile.service.persistence.impl.MovieInterestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Heise
 * @see MovieInterestPersistence
 * @generated
 */
public class MovieInterestUtil {

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
	public static void clearCache(MovieInterest movieInterest) {
		getPersistence().clearCache(movieInterest);
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
	public static Map<Serializable, MovieInterest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MovieInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MovieInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MovieInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MovieInterest update(MovieInterest movieInterest) {
		return getPersistence().update(movieInterest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MovieInterest update(
		MovieInterest movieInterest, ServiceContext serviceContext) {

		return getPersistence().update(movieInterest, serviceContext);
	}

	/**
	 * Returns all the movie interests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching movie interests
	 */
	public static List<MovieInterest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the movie interests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @return the range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the movie interests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the movie interests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUuid_First(
			String uuid, OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUuid_First(
		String uuid, OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUuid_Last(
			String uuid, OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUuid_Last(
		String uuid, OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the movie interests before and after the current movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param movieInterestId the primary key of the current movie interest
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next movie interest
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public static MovieInterest[] findByUuid_PrevAndNext(
			long movieInterestId, String uuid,
			OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_PrevAndNext(
			movieInterestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the movie interests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of movie interests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching movie interests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUUID_G(String uuid, long groupId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the movie interest where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the movie interest that was removed
	 */
	public static MovieInterest removeByUUID_G(String uuid, long groupId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of movie interests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching movie interests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching movie interests
	 */
	public static List<MovieInterest> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @return the range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching movie interests
	 */
	public static List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MovieInterest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the movie interests before and after the current movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param movieInterestId the primary key of the current movie interest
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next movie interest
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public static MovieInterest[] findByUuid_C_PrevAndNext(
			long movieInterestId, String uuid, long companyId,
			OrderByComparator<MovieInterest> orderByComparator)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			movieInterestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the movie interests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching movie interests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the movie interest where userId = &#63; or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public static MovieInterest findByUserId(long userId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns the movie interest where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUserId(long userId) {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	 * Returns the movie interest where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public static MovieInterest fetchByUserId(
		long userId, boolean useFinderCache) {

		return getPersistence().fetchByUserId(userId, useFinderCache);
	}

	/**
	 * Removes the movie interest where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the movie interest that was removed
	 */
	public static MovieInterest removeByUserId(long userId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of movie interests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching movie interests
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the movie interest in the entity cache if it is enabled.
	 *
	 * @param movieInterest the movie interest
	 */
	public static void cacheResult(MovieInterest movieInterest) {
		getPersistence().cacheResult(movieInterest);
	}

	/**
	 * Caches the movie interests in the entity cache if it is enabled.
	 *
	 * @param movieInterests the movie interests
	 */
	public static void cacheResult(List<MovieInterest> movieInterests) {
		getPersistence().cacheResult(movieInterests);
	}

	/**
	 * Creates a new movie interest with the primary key. Does not add the movie interest to the database.
	 *
	 * @param movieInterestId the primary key for the new movie interest
	 * @return the new movie interest
	 */
	public static MovieInterest create(long movieInterestId) {
		return getPersistence().create(movieInterestId);
	}

	/**
	 * Removes the movie interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest that was removed
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public static MovieInterest remove(long movieInterestId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().remove(movieInterestId);
	}

	public static MovieInterest updateImpl(MovieInterest movieInterest) {
		return getPersistence().updateImpl(movieInterest);
	}

	/**
	 * Returns the movie interest with the primary key or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public static MovieInterest findByPrimaryKey(long movieInterestId)
		throws com.amf.registration.profile.exception.
			NoSuchMovieInterestException {

		return getPersistence().findByPrimaryKey(movieInterestId);
	}

	/**
	 * Returns the movie interest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest, or <code>null</code> if a movie interest with the primary key could not be found
	 */
	public static MovieInterest fetchByPrimaryKey(long movieInterestId) {
		return getPersistence().fetchByPrimaryKey(movieInterestId);
	}

	/**
	 * Returns all the movie interests.
	 *
	 * @return the movie interests
	 */
	public static List<MovieInterest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the movie interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @return the range of movie interests
	 */
	public static List<MovieInterest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the movie interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of movie interests
	 */
	public static List<MovieInterest> findAll(
		int start, int end,
		OrderByComparator<MovieInterest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the movie interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MovieInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of movie interests
	 * @param end the upper bound of the range of movie interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of movie interests
	 */
	public static List<MovieInterest> findAll(
		int start, int end, OrderByComparator<MovieInterest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the movie interests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of movie interests.
	 *
	 * @return the number of movie interests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MovieInterestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<MovieInterestPersistence, MovieInterestPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MovieInterestPersistence.class);

		ServiceTracker<MovieInterestPersistence, MovieInterestPersistence>
			serviceTracker =
				new ServiceTracker
					<MovieInterestPersistence, MovieInterestPersistence>(
						bundle.getBundleContext(),
						MovieInterestPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}