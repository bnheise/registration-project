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

import com.amf.registration.profile.model.GeneralProfile;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for GeneralProfile. This utility wraps
 * <code>com.amf.registration.profile.service.impl.GeneralProfileLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Heise
 * @see GeneralProfileLocalService
 * @generated
 */
public class GeneralProfileLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.profile.service.impl.GeneralProfileLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the general profile to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalProfile the general profile
	 * @return the general profile that was added
	 */
	public static GeneralProfile addGeneralProfile(
		GeneralProfile generalProfile) {

		return getService().addGeneralProfile(generalProfile);
	}

	/**
	 * Creates a new general profile with the primary key. Does not add the general profile to the database.
	 *
	 * @param generalProfileId the primary key for the new general profile
	 * @return the new general profile
	 */
	public static GeneralProfile createGeneralProfile(long generalProfileId) {
		return getService().createGeneralProfile(generalProfileId);
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
	 * Deletes the general profile from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalProfile the general profile
	 * @return the general profile that was removed
	 */
	public static GeneralProfile deleteGeneralProfile(
		GeneralProfile generalProfile) {

		return getService().deleteGeneralProfile(generalProfile);
	}

	/**
	 * Deletes the general profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalProfileId the primary key of the general profile
	 * @return the general profile that was removed
	 * @throws PortalException if a general profile with the primary key could not be found
	 */
	public static GeneralProfile deleteGeneralProfile(long generalProfileId)
		throws PortalException {

		return getService().deleteGeneralProfile(generalProfileId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GeneralProfileModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GeneralProfileModelImpl</code>.
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

	public static GeneralProfile fetchGeneralProfile(long generalProfileId) {
		return getService().fetchGeneralProfile(generalProfileId);
	}

	/**
	 * Returns the general profile matching the UUID and group.
	 *
	 * @param uuid the general profile's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public static GeneralProfile fetchGeneralProfileByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchGeneralProfileByUuidAndGroupId(uuid, groupId);
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

	/**
	 * Returns the general profile with the primary key.
	 *
	 * @param generalProfileId the primary key of the general profile
	 * @return the general profile
	 * @throws PortalException if a general profile with the primary key could not be found
	 */
	public static GeneralProfile getGeneralProfile(long generalProfileId)
		throws PortalException {

		return getService().getGeneralProfile(generalProfileId);
	}

	/**
	 * Returns the general profile matching the UUID and group.
	 *
	 * @param uuid the general profile's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general profile
	 * @throws PortalException if a matching general profile could not be found
	 */
	public static GeneralProfile getGeneralProfileByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getGeneralProfileByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the general profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.profile.model.impl.GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @return the range of general profiles
	 */
	public static List<GeneralProfile> getGeneralProfiles(int start, int end) {
		return getService().getGeneralProfiles(start, end);
	}

	/**
	 * Returns all the general profiles matching the UUID and company.
	 *
	 * @param uuid the UUID of the general profiles
	 * @param companyId the primary key of the company
	 * @return the matching general profiles, or an empty list if no matches were found
	 */
	public static List<GeneralProfile> getGeneralProfilesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getGeneralProfilesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of general profiles matching the UUID and company.
	 *
	 * @param uuid the UUID of the general profiles
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching general profiles, or an empty list if no matches were found
	 */
	public static List<GeneralProfile> getGeneralProfilesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GeneralProfile> orderByComparator) {

		return getService().getGeneralProfilesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of general profiles.
	 *
	 * @return the number of general profiles
	 */
	public static int getGeneralProfilesCount() {
		return getService().getGeneralProfilesCount();
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
	 * Updates the general profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalProfile the general profile
	 * @return the general profile that was updated
	 */
	public static GeneralProfile updateGeneralProfile(
		GeneralProfile generalProfile) {

		return getService().updateGeneralProfile(generalProfile);
	}

	public static GeneralProfileLocalService getService() {
		return _service;
	}

	private static volatile GeneralProfileLocalService _service;

}