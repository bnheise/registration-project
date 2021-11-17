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

package com.amf.registration.search.service.persistence;

import com.amf.registration.search.model.UserAddress;

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
 * The persistence utility for the user address service. This utility wraps <code>com.amf.registration.search.service.persistence.impl.UserAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAddressPersistence
 * @generated
 */
public class UserAddressUtil {

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
	public static void clearCache(UserAddress userAddress) {
		getPersistence().clearCache(userAddress);
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
	public static Map<Serializable, UserAddress> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserAddress update(UserAddress userAddress) {
		return getPersistence().update(userAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserAddress update(
		UserAddress userAddress, ServiceContext serviceContext) {

		return getPersistence().update(userAddress, serviceContext);
	}

	/**
	 * Returns all the user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the matching user addresses
	 */
	public static List<UserAddress> findByZip(String zip) {
		return getPersistence().findByZip(zip);
	}

	/**
	 * Returns a range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @return the range of matching user addresses
	 */
	public static List<UserAddress> findByZip(String zip, int start, int end) {
		return getPersistence().findByZip(zip, start, end);
	}

	/**
	 * Returns an ordered range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user addresses
	 */
	public static List<UserAddress> findByZip(
		String zip, int start, int end,
		OrderByComparator<UserAddress> orderByComparator) {

		return getPersistence().findByZip(zip, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user addresses
	 */
	public static List<UserAddress> findByZip(
		String zip, int start, int end,
		OrderByComparator<UserAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByZip(
			zip, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	public static UserAddress findByZip_First(
			String zip, OrderByComparator<UserAddress> orderByComparator)
		throws com.amf.registration.search.exception.
			NoSuchUserAddressException {

		return getPersistence().findByZip_First(zip, orderByComparator);
	}

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address, or <code>null</code> if a matching user address could not be found
	 */
	public static UserAddress fetchByZip_First(
		String zip, OrderByComparator<UserAddress> orderByComparator) {

		return getPersistence().fetchByZip_First(zip, orderByComparator);
	}

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	public static UserAddress findByZip_Last(
			String zip, OrderByComparator<UserAddress> orderByComparator)
		throws com.amf.registration.search.exception.
			NoSuchUserAddressException {

		return getPersistence().findByZip_Last(zip, orderByComparator);
	}

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address, or <code>null</code> if a matching user address could not be found
	 */
	public static UserAddress fetchByZip_Last(
		String zip, OrderByComparator<UserAddress> orderByComparator) {

		return getPersistence().fetchByZip_Last(zip, orderByComparator);
	}

	/**
	 * Returns the user addresses before and after the current user address in the ordered set where zip = &#63;.
	 *
	 * @param userAddressPK the primary key of the current user address
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public static UserAddress[] findByZip_PrevAndNext(
			UserAddressPK userAddressPK, String zip,
			OrderByComparator<UserAddress> orderByComparator)
		throws com.amf.registration.search.exception.
			NoSuchUserAddressException {

		return getPersistence().findByZip_PrevAndNext(
			userAddressPK, zip, orderByComparator);
	}

	/**
	 * Removes all the user addresses where zip = &#63; from the database.
	 *
	 * @param zip the zip
	 */
	public static void removeByZip(String zip) {
		getPersistence().removeByZip(zip);
	}

	/**
	 * Returns the number of user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the number of matching user addresses
	 */
	public static int countByZip(String zip) {
		return getPersistence().countByZip(zip);
	}

	/**
	 * Caches the user address in the entity cache if it is enabled.
	 *
	 * @param userAddress the user address
	 */
	public static void cacheResult(UserAddress userAddress) {
		getPersistence().cacheResult(userAddress);
	}

	/**
	 * Caches the user addresses in the entity cache if it is enabled.
	 *
	 * @param userAddresses the user addresses
	 */
	public static void cacheResult(List<UserAddress> userAddresses) {
		getPersistence().cacheResult(userAddresses);
	}

	/**
	 * Creates a new user address with the primary key. Does not add the user address to the database.
	 *
	 * @param userAddressPK the primary key for the new user address
	 * @return the new user address
	 */
	public static UserAddress create(UserAddressPK userAddressPK) {
		return getPersistence().create(userAddressPK);
	}

	/**
	 * Removes the user address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address that was removed
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public static UserAddress remove(UserAddressPK userAddressPK)
		throws com.amf.registration.search.exception.
			NoSuchUserAddressException {

		return getPersistence().remove(userAddressPK);
	}

	public static UserAddress updateImpl(UserAddress userAddress) {
		return getPersistence().updateImpl(userAddress);
	}

	/**
	 * Returns the user address with the primary key or throws a <code>NoSuchUserAddressException</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public static UserAddress findByPrimaryKey(UserAddressPK userAddressPK)
		throws com.amf.registration.search.exception.
			NoSuchUserAddressException {

		return getPersistence().findByPrimaryKey(userAddressPK);
	}

	/**
	 * Returns the user address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address, or <code>null</code> if a user address with the primary key could not be found
	 */
	public static UserAddress fetchByPrimaryKey(UserAddressPK userAddressPK) {
		return getPersistence().fetchByPrimaryKey(userAddressPK);
	}

	/**
	 * Returns all the user addresses.
	 *
	 * @return the user addresses
	 */
	public static List<UserAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @return the range of user addresses
	 */
	public static List<UserAddress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user addresses
	 */
	public static List<UserAddress> findAll(
		int start, int end, OrderByComparator<UserAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user addresses
	 */
	public static List<UserAddress> findAll(
		int start, int end, OrderByComparator<UserAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the user addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of user addresses.
	 *
	 * @return the number of user addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static UserAddressPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<UserAddressPersistence, UserAddressPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserAddressPersistence.class);

		ServiceTracker<UserAddressPersistence, UserAddressPersistence>
			serviceTracker =
				new ServiceTracker
					<UserAddressPersistence, UserAddressPersistence>(
						bundle.getBundleContext(), UserAddressPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}