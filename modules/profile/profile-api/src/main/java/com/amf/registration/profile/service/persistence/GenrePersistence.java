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

import com.amf.registration.profile.exception.NoSuchGenreException;
import com.amf.registration.profile.model.Genre;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the genre service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Heise
 * @see GenreUtil
 * @generated
 */
@ProviderType
public interface GenrePersistence extends BasePersistence<Genre> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GenreUtil} to access the genre persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the genres where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching genres
	 */
	public java.util.List<Genre> findByUuid(String uuid);

	/**
	 * Returns a range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of matching genres
	 */
	public java.util.List<Genre> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching genres
	 */
	public java.util.List<Genre> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator);

	/**
	 * Returns an ordered range of all the genres where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching genres
	 */
	public java.util.List<Genre> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public Genre findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Genre>
				orderByComparator)
		throws NoSuchGenreException;

	/**
	 * Returns the first genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public Genre fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator);

	/**
	 * Returns the last genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre
	 * @throws NoSuchGenreException if a matching genre could not be found
	 */
	public Genre findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Genre>
				orderByComparator)
		throws NoSuchGenreException;

	/**
	 * Returns the last genre in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching genre, or <code>null</code> if a matching genre could not be found
	 */
	public Genre fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator);

	/**
	 * Returns the genres before and after the current genre in the ordered set where uuid = &#63;.
	 *
	 * @param genreId the primary key of the current genre
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next genre
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public Genre[] findByUuid_PrevAndNext(
			long genreId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Genre>
				orderByComparator)
		throws NoSuchGenreException;

	/**
	 * Removes all the genres where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of genres where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching genres
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the genre in the entity cache if it is enabled.
	 *
	 * @param genre the genre
	 */
	public void cacheResult(Genre genre);

	/**
	 * Caches the genres in the entity cache if it is enabled.
	 *
	 * @param genres the genres
	 */
	public void cacheResult(java.util.List<Genre> genres);

	/**
	 * Creates a new genre with the primary key. Does not add the genre to the database.
	 *
	 * @param genreId the primary key for the new genre
	 * @return the new genre
	 */
	public Genre create(long genreId);

	/**
	 * Removes the genre with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre that was removed
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public Genre remove(long genreId) throws NoSuchGenreException;

	public Genre updateImpl(Genre genre);

	/**
	 * Returns the genre with the primary key or throws a <code>NoSuchGenreException</code> if it could not be found.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre
	 * @throws NoSuchGenreException if a genre with the primary key could not be found
	 */
	public Genre findByPrimaryKey(long genreId) throws NoSuchGenreException;

	/**
	 * Returns the genre with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param genreId the primary key of the genre
	 * @return the genre, or <code>null</code> if a genre with the primary key could not be found
	 */
	public Genre fetchByPrimaryKey(long genreId);

	/**
	 * Returns all the genres.
	 *
	 * @return the genres
	 */
	public java.util.List<Genre> findAll();

	/**
	 * Returns a range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @return the range of genres
	 */
	public java.util.List<Genre> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of genres
	 */
	public java.util.List<Genre> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator);

	/**
	 * Returns an ordered range of all the genres.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenreModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of genres
	 * @param end the upper bound of the range of genres (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of genres
	 */
	public java.util.List<Genre> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Genre>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the genres from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of genres.
	 *
	 * @return the number of genres
	 */
	public int countAll();

}