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

import com.amf.registration.profile.exception.NoSuchMovieInterestException;
import com.amf.registration.profile.model.MovieInterest;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the movie interest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Heise
 * @see MovieInterestUtil
 * @generated
 */
@ProviderType
public interface MovieInterestPersistence
	extends BasePersistence<MovieInterest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MovieInterestUtil} to access the movie interest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the movie interests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching movie interests
	 */
	public java.util.List<MovieInterest> findByUuid(String uuid);

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
	public java.util.List<MovieInterest> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<MovieInterest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

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
	public java.util.List<MovieInterest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

	/**
	 * Returns the movie interests before and after the current movie interest in the ordered set where uuid = &#63;.
	 *
	 * @param movieInterestId the primary key of the current movie interest
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next movie interest
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public MovieInterest[] findByUuid_PrevAndNext(
			long movieInterestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Removes all the movie interests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of movie interests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching movie interests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUUID_G(String uuid, long groupId)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the movie interest where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the movie interest where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the movie interest that was removed
	 */
	public MovieInterest removeByUUID_G(String uuid, long groupId)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the number of movie interests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching movie interests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching movie interests
	 */
	public java.util.List<MovieInterest> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

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
	public java.util.List<MovieInterest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the first movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the last movie interest in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

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
	public MovieInterest[] findByUuid_C_PrevAndNext(
			long movieInterestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
				orderByComparator)
		throws NoSuchMovieInterestException;

	/**
	 * Removes all the movie interests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of movie interests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching movie interests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the movie interest where userId = &#63; or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching movie interest
	 * @throws NoSuchMovieInterestException if a matching movie interest could not be found
	 */
	public MovieInterest findByUserId(long userId)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the movie interest where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUserId(long userId);

	/**
	 * Returns the movie interest where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching movie interest, or <code>null</code> if a matching movie interest could not be found
	 */
	public MovieInterest fetchByUserId(long userId, boolean useFinderCache);

	/**
	 * Removes the movie interest where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the movie interest that was removed
	 */
	public MovieInterest removeByUserId(long userId)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the number of movie interests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching movie interests
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the movie interest in the entity cache if it is enabled.
	 *
	 * @param movieInterest the movie interest
	 */
	public void cacheResult(MovieInterest movieInterest);

	/**
	 * Caches the movie interests in the entity cache if it is enabled.
	 *
	 * @param movieInterests the movie interests
	 */
	public void cacheResult(java.util.List<MovieInterest> movieInterests);

	/**
	 * Creates a new movie interest with the primary key. Does not add the movie interest to the database.
	 *
	 * @param movieInterestId the primary key for the new movie interest
	 * @return the new movie interest
	 */
	public MovieInterest create(long movieInterestId);

	/**
	 * Removes the movie interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest that was removed
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public MovieInterest remove(long movieInterestId)
		throws NoSuchMovieInterestException;

	public MovieInterest updateImpl(MovieInterest movieInterest);

	/**
	 * Returns the movie interest with the primary key or throws a <code>NoSuchMovieInterestException</code> if it could not be found.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest
	 * @throws NoSuchMovieInterestException if a movie interest with the primary key could not be found
	 */
	public MovieInterest findByPrimaryKey(long movieInterestId)
		throws NoSuchMovieInterestException;

	/**
	 * Returns the movie interest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param movieInterestId the primary key of the movie interest
	 * @return the movie interest, or <code>null</code> if a movie interest with the primary key could not be found
	 */
	public MovieInterest fetchByPrimaryKey(long movieInterestId);

	/**
	 * Returns all the movie interests.
	 *
	 * @return the movie interests
	 */
	public java.util.List<MovieInterest> findAll();

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
	public java.util.List<MovieInterest> findAll(int start, int end);

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
	public java.util.List<MovieInterest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator);

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
	public java.util.List<MovieInterest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MovieInterest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the movie interests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of movie interests.
	 *
	 * @return the number of movie interests
	 */
	public int countAll();

}