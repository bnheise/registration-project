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

import com.amf.registration.monitor.model.UserEvents;

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
 * The persistence utility for the user events service. This utility wraps <code>com.amf.registration.monitor.service.persistence.impl.UserEventsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserEventsPersistence
 * @generated
 */
public class UserEventsUtil {

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
	public static void clearCache(UserEvents userEvents) {
		getPersistence().clearCache(userEvents);
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
	public static Map<Serializable, UserEvents> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserEvents> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserEvents update(UserEvents userEvents) {
		return getPersistence().update(userEvents);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserEvents update(
		UserEvents userEvents, ServiceContext serviceContext) {

		return getPersistence().update(userEvents, serviceContext);
	}

	/**
	 * Returns all the user eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user eventses
	 */
	public static List<UserEvents> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<UserEvents> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<UserEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<UserEvents> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<UserEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public static UserEvents findByUuid_First(
			String uuid, OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUuid_First(
		String uuid, OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public static UserEvents findByUuid_Last(
			String uuid, OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last user events in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUuid_Last(
		String uuid, OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the user eventses before and after the current user events in the ordered set where uuid = &#63;.
	 *
	 * @param userEventId the primary key of the current user events
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user events
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public static UserEvents[] findByUuid_PrevAndNext(
			long userEventId, String uuid,
			OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_PrevAndNext(
			userEventId, uuid, orderByComparator);
	}

	/**
	 * Removes all the user eventses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of user eventses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user eventses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchUserEventsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public static UserEvents findByUUID_G(String uuid, long groupId)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the user events where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the user events where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the user events that was removed
	 */
	public static UserEvents removeByUUID_G(String uuid, long groupId)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of user eventses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching user eventses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user eventses
	 */
	public static List<UserEvents> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<UserEvents> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<UserEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public static UserEvents findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events
	 * @throws NoSuchUserEventsException if a matching user events could not be found
	 */
	public static UserEvents findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last user events in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static UserEvents[] findByUuid_C_PrevAndNext(
			long userEventId, String uuid, long companyId,
			OrderByComparator<UserEvents> orderByComparator)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			userEventId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the user eventses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of user eventses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user eventses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the user events in the entity cache if it is enabled.
	 *
	 * @param userEvents the user events
	 */
	public static void cacheResult(UserEvents userEvents) {
		getPersistence().cacheResult(userEvents);
	}

	/**
	 * Caches the user eventses in the entity cache if it is enabled.
	 *
	 * @param userEventses the user eventses
	 */
	public static void cacheResult(List<UserEvents> userEventses) {
		getPersistence().cacheResult(userEventses);
	}

	/**
	 * Creates a new user events with the primary key. Does not add the user events to the database.
	 *
	 * @param userEventId the primary key for the new user events
	 * @return the new user events
	 */
	public static UserEvents create(long userEventId) {
		return getPersistence().create(userEventId);
	}

	/**
	 * Removes the user events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events that was removed
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public static UserEvents remove(long userEventId)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().remove(userEventId);
	}

	public static UserEvents updateImpl(UserEvents userEvents) {
		return getPersistence().updateImpl(userEvents);
	}

	/**
	 * Returns the user events with the primary key or throws a <code>NoSuchUserEventsException</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events
	 * @throws NoSuchUserEventsException if a user events with the primary key could not be found
	 */
	public static UserEvents findByPrimaryKey(long userEventId)
		throws com.amf.registration.monitor.exception.
			NoSuchUserEventsException {

		return getPersistence().findByPrimaryKey(userEventId);
	}

	/**
	 * Returns the user events with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events, or <code>null</code> if a user events with the primary key could not be found
	 */
	public static UserEvents fetchByPrimaryKey(long userEventId) {
		return getPersistence().fetchByPrimaryKey(userEventId);
	}

	/**
	 * Returns all the user eventses.
	 *
	 * @return the user eventses
	 */
	public static List<UserEvents> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<UserEvents> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<UserEvents> findAll(
		int start, int end, OrderByComparator<UserEvents> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<UserEvents> findAll(
		int start, int end, OrderByComparator<UserEvents> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the user eventses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of user eventses.
	 *
	 * @return the number of user eventses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserEventsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserEventsPersistence, UserEventsPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserEventsPersistence.class);

		ServiceTracker<UserEventsPersistence, UserEventsPersistence>
			serviceTracker =
				new ServiceTracker
					<UserEventsPersistence, UserEventsPersistence>(
						bundle.getBundleContext(), UserEventsPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}