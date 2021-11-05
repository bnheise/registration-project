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

package com.amf.registration.monitor.service;

import com.amf.registration.monitor.model.UserEvents;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for UserEvents. This utility wraps
 * <code>com.amf.registration.monitor.service.impl.UserEventsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventsLocalService
 * @generated
 */
public class UserEventsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.monitor.service.impl.UserEventsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the user events to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvents the user events
	 * @return the user events that was added
	 */
	public static UserEvents addUserEvents(UserEvents userEvents) {
		return getService().addUserEvents(userEvents);
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
	 * Creates a new user events with the primary key. Does not add the user events to the database.
	 *
	 * @param userEventId the primary key for the new user events
	 * @return the new user events
	 */
	public static UserEvents createUserEvents(long userEventId) {
		return getService().createUserEvents(userEventId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user events with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events that was removed
	 * @throws PortalException if a user events with the primary key could not be found
	 */
	public static UserEvents deleteUserEvents(long userEventId)
		throws PortalException {

		return getService().deleteUserEvents(userEventId);
	}

	/**
	 * Deletes the user events from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvents the user events
	 * @return the user events that was removed
	 */
	public static UserEvents deleteUserEvents(UserEvents userEvents) {
		return getService().deleteUserEvents(userEvents);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventsModelImpl</code>.
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

	public static UserEvents fetchUserEvents(long userEventId) {
		return getService().fetchUserEvents(userEventId);
	}

	/**
	 * Returns the user events matching the UUID and group.
	 *
	 * @param uuid the user events's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	public static UserEvents fetchUserEventsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchUserEventsByUuidAndGroupId(uuid, groupId);
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
	 * Returns the user events with the primary key.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events
	 * @throws PortalException if a user events with the primary key could not be found
	 */
	public static UserEvents getUserEvents(long userEventId)
		throws PortalException {

		return getService().getUserEvents(userEventId);
	}

	/**
	 * Returns the user events matching the UUID and group.
	 *
	 * @param uuid the user events's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user events
	 * @throws PortalException if a matching user events could not be found
	 */
	public static UserEvents getUserEventsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getUserEventsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the user eventses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @return the range of user eventses
	 */
	public static List<UserEvents> getUserEventses(int start, int end) {
		return getService().getUserEventses(start, end);
	}

	/**
	 * Returns all the user eventses matching the UUID and company.
	 *
	 * @param uuid the UUID of the user eventses
	 * @param companyId the primary key of the company
	 * @return the matching user eventses, or an empty list if no matches were found
	 */
	public static List<UserEvents> getUserEventsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getUserEventsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of user eventses matching the UUID and company.
	 *
	 * @param uuid the UUID of the user eventses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of user eventses
	 * @param end the upper bound of the range of user eventses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching user eventses, or an empty list if no matches were found
	 */
	public static List<UserEvents> getUserEventsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<UserEvents> orderByComparator) {

		return getService().getUserEventsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user eventses.
	 *
	 * @return the number of user eventses
	 */
	public static int getUserEventsesCount() {
		return getService().getUserEventsesCount();
	}

	/**
	 * Updates the user events in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvents the user events
	 * @return the user events that was updated
	 */
	public static UserEvents updateUserEvents(UserEvents userEvents) {
		return getService().updateUserEvents(userEvents);
	}

	public static UserEventsLocalService getService() {
		return _service;
	}

	private static volatile UserEventsLocalService _service;

}