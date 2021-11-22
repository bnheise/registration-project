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

package com.amf.registration.search.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserAddressLocalService}.
 *
 * @author Brian Heise
 * @see UserAddressLocalService
 * @generated
 */
public class UserAddressLocalServiceWrapper
	implements ServiceWrapper<UserAddressLocalService>,
			   UserAddressLocalService {

	public UserAddressLocalServiceWrapper(
		UserAddressLocalService userAddressLocalService) {

		_userAddressLocalService = userAddressLocalService;
	}

	/**
	 * Adds the user address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userAddress the user address
	 * @return the user address that was added
	 */
	@Override
	public com.amf.registration.search.model.UserAddress addUserAddress(
		com.amf.registration.search.model.UserAddress userAddress) {

		return _userAddressLocalService.addUserAddress(userAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user address with the primary key. Does not add the user address to the database.
	 *
	 * @param userAddressPK the primary key for the new user address
	 * @return the new user address
	 */
	@Override
	public com.amf.registration.search.model.UserAddress createUserAddress(
		com.amf.registration.search.service.persistence.UserAddressPK
			userAddressPK) {

		return _userAddressLocalService.createUserAddress(userAddressPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userAddress the user address
	 * @return the user address that was removed
	 */
	@Override
	public com.amf.registration.search.model.UserAddress deleteUserAddress(
		com.amf.registration.search.model.UserAddress userAddress) {

		return _userAddressLocalService.deleteUserAddress(userAddress);
	}

	/**
	 * Deletes the user address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address that was removed
	 * @throws PortalException if a user address with the primary key could not be found
	 */
	@Override
	public com.amf.registration.search.model.UserAddress deleteUserAddress(
			com.amf.registration.search.service.persistence.UserAddressPK
				userAddressPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.deleteUserAddress(userAddressPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userAddressLocalService.dynamicQuery();
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

		return _userAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.search.model.impl.UserAddressModelImpl</code>.
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

		return _userAddressLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.search.model.impl.UserAddressModelImpl</code>.
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

		return _userAddressLocalService.dynamicQuery(
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

		return _userAddressLocalService.dynamicQueryCount(dynamicQuery);
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

		return _userAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.search.model.UserAddress fetchUserAddress(
		com.amf.registration.search.service.persistence.UserAddressPK
			userAddressPK) {

		return _userAddressLocalService.fetchUserAddress(userAddressPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userAddressLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userAddressLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userAddressLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user address with the primary key.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address
	 * @throws PortalException if a user address with the primary key could not be found
	 */
	@Override
	public com.amf.registration.search.model.UserAddress getUserAddress(
			com.amf.registration.search.service.persistence.UserAddressPK
				userAddressPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.getUserAddress(userAddressPK);
	}

	/**
	 * Returns a range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.search.model.impl.UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @return the range of user addresses
	 */
	@Override
	public java.util.List<com.amf.registration.search.model.UserAddress>
		getUserAddresses(int start, int end) {

		return _userAddressLocalService.getUserAddresses(start, end);
	}

	/**
	 * Returns the number of user addresses.
	 *
	 * @return the number of user addresses
	 */
	@Override
	public int getUserAddressesCount() {
		return _userAddressLocalService.getUserAddressesCount();
	}

	@Override
	public long getUserCountByZip(String zip)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.getUserCountByZip(zip);
	}

	@Override
	public java.util.List<com.amf.registration.search.model.UserAddress>
			getUsersByZip(String zip, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userAddressLocalService.getUsersByZip(zip, start, end);
	}

	/**
	 * Updates the user address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userAddress the user address
	 * @return the user address that was updated
	 */
	@Override
	public com.amf.registration.search.model.UserAddress updateUserAddress(
		com.amf.registration.search.model.UserAddress userAddress) {

		return _userAddressLocalService.updateUserAddress(userAddress);
	}

	@Override
	public UserAddressLocalService getWrappedService() {
		return _userAddressLocalService;
	}

	@Override
	public void setWrappedService(
		UserAddressLocalService userAddressLocalService) {

		_userAddressLocalService = userAddressLocalService;
	}

	private UserAddressLocalService _userAddressLocalService;

}