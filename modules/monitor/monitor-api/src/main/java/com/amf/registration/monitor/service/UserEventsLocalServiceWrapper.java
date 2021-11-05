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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserEventsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventsLocalService
 * @generated
 */
public class UserEventsLocalServiceWrapper
	implements ServiceWrapper<UserEventsLocalService>, UserEventsLocalService {

	public UserEventsLocalServiceWrapper(
		UserEventsLocalService userEventsLocalService) {

		_userEventsLocalService = userEventsLocalService;
	}

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
	@Override
	public com.amf.registration.monitor.model.UserEvents addUserEvents(
		com.amf.registration.monitor.model.UserEvents userEvents) {

		return _userEventsLocalService.addUserEvents(userEvents);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user events with the primary key. Does not add the user events to the database.
	 *
	 * @param userEventId the primary key for the new user events
	 * @return the new user events
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvents createUserEvents(
		long userEventId) {

		return _userEventsLocalService.createUserEvents(userEventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.amf.registration.monitor.model.UserEvents deleteUserEvents(
			long userEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.deleteUserEvents(userEventId);
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
	@Override
	public com.amf.registration.monitor.model.UserEvents deleteUserEvents(
		com.amf.registration.monitor.model.UserEvents userEvents) {

		return _userEventsLocalService.deleteUserEvents(userEvents);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userEventsLocalService.dynamicQuery();
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

		return _userEventsLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userEventsLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userEventsLocalService.dynamicQuery(
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

		return _userEventsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _userEventsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.monitor.model.UserEvents fetchUserEvents(
		long userEventId) {

		return _userEventsLocalService.fetchUserEvents(userEventId);
	}

	/**
	 * Returns the user events matching the UUID and group.
	 *
	 * @param uuid the user events's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user events, or <code>null</code> if a matching user events could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvents
		fetchUserEventsByUuidAndGroupId(String uuid, long groupId) {

		return _userEventsLocalService.fetchUserEventsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userEventsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _userEventsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userEventsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEventsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user events with the primary key.
	 *
	 * @param userEventId the primary key of the user events
	 * @return the user events
	 * @throws PortalException if a user events with the primary key could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvents getUserEvents(
			long userEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.getUserEvents(userEventId);
	}

	/**
	 * Returns the user events matching the UUID and group.
	 *
	 * @param uuid the user events's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user events
	 * @throws PortalException if a matching user events could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvents
			getUserEventsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventsLocalService.getUserEventsByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvents>
		getUserEventses(int start, int end) {

		return _userEventsLocalService.getUserEventses(start, end);
	}

	/**
	 * Returns all the user eventses matching the UUID and company.
	 *
	 * @param uuid the UUID of the user eventses
	 * @param companyId the primary key of the company
	 * @return the matching user eventses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvents>
		getUserEventsesByUuidAndCompanyId(String uuid, long companyId) {

		return _userEventsLocalService.getUserEventsesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvents>
		getUserEventsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.amf.registration.monitor.model.UserEvents>
					orderByComparator) {

		return _userEventsLocalService.getUserEventsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user eventses.
	 *
	 * @return the number of user eventses
	 */
	@Override
	public int getUserEventsesCount() {
		return _userEventsLocalService.getUserEventsesCount();
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
	@Override
	public com.amf.registration.monitor.model.UserEvents updateUserEvents(
		com.amf.registration.monitor.model.UserEvents userEvents) {

		return _userEventsLocalService.updateUserEvents(userEvents);
	}

	@Override
	public UserEventsLocalService getWrappedService() {
		return _userEventsLocalService;
	}

	@Override
	public void setWrappedService(
		UserEventsLocalService userEventsLocalService) {

		_userEventsLocalService = userEventsLocalService;
	}

	private UserEventsLocalService _userEventsLocalService;

}