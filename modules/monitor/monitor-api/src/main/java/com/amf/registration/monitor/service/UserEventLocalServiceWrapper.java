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
 * Provides a wrapper for {@link UserEventLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserEventLocalService
 * @generated
 */
public class UserEventLocalServiceWrapper
	implements ServiceWrapper<UserEventLocalService>, UserEventLocalService {

	public UserEventLocalServiceWrapper(
		UserEventLocalService userEventLocalService) {

		_userEventLocalService = userEventLocalService;
	}

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
	@Override
	public com.amf.registration.monitor.model.UserEvent addUserEvent(
		com.amf.registration.monitor.model.UserEvent userEvent) {

		return _userEventLocalService.addUserEvent(userEvent);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user event with the primary key. Does not add the user event to the database.
	 *
	 * @param userEventId the primary key for the new user event
	 * @return the new user event
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvent createUserEvent(
		long userEventId) {

		return _userEventLocalService.createUserEvent(userEventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.amf.registration.monitor.model.UserEvent deleteUserEvent(
			long userEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.deleteUserEvent(userEventId);
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
	@Override
	public com.amf.registration.monitor.model.UserEvent deleteUserEvent(
		com.amf.registration.monitor.model.UserEvent userEvent) {

		return _userEventLocalService.deleteUserEvent(userEvent);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userEventLocalService.dynamicQuery();
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

		return _userEventLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userEventLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userEventLocalService.dynamicQuery(
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

		return _userEventLocalService.dynamicQueryCount(dynamicQuery);
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

		return _userEventLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.monitor.model.UserEvent fetchUserEvent(
		long userEventId) {

		return _userEventLocalService.fetchUserEvent(userEventId);
	}

	/**
	 * Returns the user event matching the UUID and group.
	 *
	 * @param uuid the user event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user event, or <code>null</code> if a matching user event could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvent
		fetchUserEventByUuidAndGroupId(String uuid, long groupId) {

		return _userEventLocalService.fetchUserEventByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userEventLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _userEventLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userEventLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userEventLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user event with the primary key.
	 *
	 * @param userEventId the primary key of the user event
	 * @return the user event
	 * @throws PortalException if a user event with the primary key could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvent getUserEvent(
			long userEventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.getUserEvent(userEventId);
	}

	/**
	 * Returns the user event matching the UUID and group.
	 *
	 * @param uuid the user event's UUID
	 * @param groupId the primary key of the group
	 * @return the matching user event
	 * @throws PortalException if a matching user event could not be found
	 */
	@Override
	public com.amf.registration.monitor.model.UserEvent
			getUserEventByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userEventLocalService.getUserEventByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvent>
		getUserEvents(int start, int end) {

		return _userEventLocalService.getUserEvents(start, end);
	}

	/**
	 * Returns all the user events matching the UUID and company.
	 *
	 * @param uuid the UUID of the user events
	 * @param companyId the primary key of the company
	 * @return the matching user events, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvent>
		getUserEventsByUuidAndCompanyId(String uuid, long companyId) {

		return _userEventLocalService.getUserEventsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.amf.registration.monitor.model.UserEvent>
		getUserEventsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.amf.registration.monitor.model.UserEvent>
					orderByComparator) {

		return _userEventLocalService.getUserEventsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of user events.
	 *
	 * @return the number of user events
	 */
	@Override
	public int getUserEventsCount() {
		return _userEventLocalService.getUserEventsCount();
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
	@Override
	public com.amf.registration.monitor.model.UserEvent updateUserEvent(
		com.amf.registration.monitor.model.UserEvent userEvent) {

		return _userEventLocalService.updateUserEvent(userEvent);
	}

	@Override
	public UserEventLocalService getWrappedService() {
		return _userEventLocalService;
	}

	@Override
	public void setWrappedService(UserEventLocalService userEventLocalService) {
		_userEventLocalService = userEventLocalService;
	}

	private UserEventLocalService _userEventLocalService;

}