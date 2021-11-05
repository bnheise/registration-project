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

package com.amf.registration.monitor.service.persistence;

import com.amf.registration.monitor.exception.NoSuchUserEventsException;
import com.amf.registration.monitor.model.UserEvents;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user events service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventsUtil
 * @generated
 */
@ProviderType
public interface UserEventsPersistence extends BasePersistence<UserEvents> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserEventsUtil} to access the user events persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid(String uuid);

	/**
	 * Returns a range of all the user eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @return the range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the user eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user eventses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public UserEvents findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Returns the first user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns the last user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public UserEvents findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Returns the last user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns the user eventses before and after the current user events in the ordered set where uuid = &#63;.
	 *
	 * @param userEventId the primary key of the current user events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user events
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public UserEvents[] findByUuid_PrevAndNext(
			long userEventId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Removes all the user eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user eventses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUserEventsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public UserEvents findByUUID_G(String uuid, long groupId)
		throws NoSuchUserEventsException;

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the user events where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the user events that was removed
	 */
	public UserEvents removeByUUID_G(String uuid, long groupId)
		throws NoSuchUserEventsException;

	/**
	 * Returns the number of user eventses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching user eventses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @return the range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user eventses
	 */
	public java.util.List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public UserEvents findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Returns the first user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns the last user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public UserEvents findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Returns the last user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public UserEvents fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns the user eventses before and after the current user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userEventId the primary key of the current user events
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user events
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public UserEvents[] findByUuid_C_PrevAndNext(
			long userEventId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
				orderByComparator)
		throws NoSuchUserEventsException;

	/**
	 * Removes all the user eventses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user eventses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the user events in the entity cache if it is enabled.
	 *
	 * @param userEvents the user events
	 */
	public void cacheResult(UserEvents userEvents);

	/**
	 * Caches the user eventses in the entity cache if it is enabled.
	 *
	 * @param userEventses the user eventses
	 */
	public void cacheResult(java.util.List<UserEvents> userEventses);

	/**
	 * Creates a new user events with the primary key. Does not add the user events to the database.
	 *
	 * @param userEventId the primary key for the new user events
	 * @return the new user events
	 */
	public UserEvents create(long userEventId);

	/**
	 * Removes the user events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events that was removed
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public UserEvents remove(long userEventId) throws NoSuchUserEventsException;

	public UserEvents updateImpl(UserEvents userEvents);

	/**
	 * Returns the user events with the primary key or throws a <code>NoSuchUserEventsException</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public UserEvents findByPrimaryKey(long userEventId)
		throws NoSuchUserEventsException;

	/**
	 * Returns the user events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events, or <code>null</code> if a user events with the primary key could not be found
	 */
	public UserEvents fetchByPrimaryKey(long userEventId);

	/**
	 * Returns all the user eventses.
	 *
	 * @return the user eventses
	 */
	public java.util.List<UserEvents> findAll();

	/**
	 * Returns a range of all the user eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @return the range of user eventses
	 */
	public java.util.List<UserEvents> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the user eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user eventses
	 */
	public java.util.List<UserEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user eventses
	 */
	public java.util.List<UserEvents> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserEvents>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user eventses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user eventses.
	 *
	 * @return the number of user eventses
	 */
	public int countAll();

}