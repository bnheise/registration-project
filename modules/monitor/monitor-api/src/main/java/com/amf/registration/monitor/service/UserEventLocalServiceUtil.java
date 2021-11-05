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

import com.amf.registration.monitor.model.UserEvent;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for UserEvent. This utility wraps
 * <code>com.amf.registration.monitor.service.impl.UserEventLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventLocalService
 * @generated
 */
public class UserEventLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.monitor.service.impl.UserEventLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the user event to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvent the user event
	 * @return the user event that was added
	 */
	public static UserEvent addUserEvent(UserEvent userEvent) {
		return getService().addUserEvent(userEvent);
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
	 * Creates a new user event with the primary key. Does not add the user event to the database.
	 *
	 * @param userEventId the primary key for the new user event
	 * @return the new user event
	 */
	public static UserEvent createUserEvent(long userEventId) {
		return getService().createUserEvent(userEventId);
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
	 * Deletes the user event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event that was removed
	 * @throws PortalException if a user event with the primary key could not be found
	 */
	public static UserEvent deleteUserEvent(long userEventId)
		throws PortalException {

		return getService().deleteUserEvent(userEventId);
	}

	/**
	 * Deletes the user event from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvent the user event
	 * @return the user event that was removed
	 */
	public static UserEvent deleteUserEvent(UserEvent userEvent) {
		return getService().deleteUserEvent(userEvent);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventModelImpl</code>.
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

	public static UserEvent fetchUserEvent(long userEventId) {
		return getService().fetchUserEvent(userEventId);
	}

	/**
	 * Returns the user event matching the UUID and group.
	 *
	 * @param uuid the user event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user event, or <code>null</code> if a matching user event could not be found
	 */
	public static UserEvent fetchUserEventByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchUserEventByUuidAndGroupId(uuid, groupId);
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
	 * Returns the user event with the primary key.
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event
	 * @throws PortalException if a user event with the primary key could not be found
	 */
	public static UserEvent getUserEvent(long userEventId)
		throws PortalException {

		return getService().getUserEvent(userEventId);
	}

	/**
	 * Returns the user event matching the UUID and group.
	 *
	 * @param uuid the user event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user event
	 * @throws PortalException if a matching user event could not be found
	 */
	public static UserEvent getUserEventByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getUserEventByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the user events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.monitor.model.impl.UserEventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @return the range of user events
	 */
	public static List<UserEvent> getUserEvents(int start, int end) {
		return getService().getUserEvents(start, end);
	}

	/**
	 * Returns all the user events matching the UUID and company.
	 *
	 * @param uuid the UUID of the user events
	 * @param companyId the primary key of the company
	 * @return the matching user events, or an empty list if no matches were found
	 */
	public static List<UserEvent> getUserEventsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getUserEventsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of user events matching the UUID and company.
	 *
	 * @param uuid the UUID of the user events
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of user events
	 * @param end the upper bound of the range of user events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching user events, or an empty list if no matches were found
	 */
	public static List<UserEvent> getUserEventsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<UserEvent> orderByComparator) {

		return getService().getUserEventsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user events.
	 *
	 * @return the number of user events
	 */
	public static int getUserEventsCount() {
		return getService().getUserEventsCount();
	}

	/**
	 * Updates the user event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserEventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userEvent the user event
	 * @return the user event that was updated
	 */
	public static UserEvent updateUserEvent(UserEvent userEvent) {
		return getService().updateUserEvent(userEvent);
	}

	public static UserEventLocalService getService() {
		return _service;
	}

	private static volatile UserEventLocalService _service;

}