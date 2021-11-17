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

import com.amf.registration.search.exception.NoSuchUserAddressException;
import com.amf.registration.search.model.UserAddress;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserAddressUtil
 * @generated
 */
@ProviderType
public interface UserAddressPersistence extends BasePersistence<UserAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserAddressUtil} to access the user address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the matching user addresses
	 */
	public java.util.List<UserAddress> findByZip(String zip);

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
	public java.util.List<UserAddress> findByZip(
		String zip, int start, int end);

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
	public java.util.List<UserAddress> findByZip(
		String zip, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator);

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
	public java.util.List<UserAddress> findByZip(
		String zip, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	public UserAddress findByZip_First(
			String zip,
			com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
				orderByComparator)
		throws NoSuchUserAddressException;

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address, or <code>null</code> if a matching user address could not be found
	 */
	public UserAddress fetchByZip_First(
		String zip,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator);

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	public UserAddress findByZip_Last(
			String zip,
			com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
				orderByComparator)
		throws NoSuchUserAddressException;

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address, or <code>null</code> if a matching user address could not be found
	 */
	public UserAddress fetchByZip_Last(
		String zip,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator);

	/**
	 * Returns the user addresses before and after the current user address in the ordered set where zip = &#63;.
	 *
	 * @param userAddressPK the primary key of the current user address
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public UserAddress[] findByZip_PrevAndNext(
			UserAddressPK userAddressPK, String zip,
			com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
				orderByComparator)
		throws NoSuchUserAddressException;

	/**
	 * Removes all the user addresses where zip = &#63; from the database.
	 *
	 * @param zip the zip
	 */
	public void removeByZip(String zip);

	/**
	 * Returns the number of user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the number of matching user addresses
	 */
	public int countByZip(String zip);

	/**
	 * Caches the user address in the entity cache if it is enabled.
	 *
	 * @param userAddress the user address
	 */
	public void cacheResult(UserAddress userAddress);

	/**
	 * Caches the user addresses in the entity cache if it is enabled.
	 *
	 * @param userAddresses the user addresses
	 */
	public void cacheResult(java.util.List<UserAddress> userAddresses);

	/**
	 * Creates a new user address with the primary key. Does not add the user address to the database.
	 *
	 * @param userAddressPK the primary key for the new user address
	 * @return the new user address
	 */
	public UserAddress create(UserAddressPK userAddressPK);

	/**
	 * Removes the user address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address that was removed
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public UserAddress remove(UserAddressPK userAddressPK)
		throws NoSuchUserAddressException;

	public UserAddress updateImpl(UserAddress userAddress);

	/**
	 * Returns the user address with the primary key or throws a <code>NoSuchUserAddressException</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	public UserAddress findByPrimaryKey(UserAddressPK userAddressPK)
		throws NoSuchUserAddressException;

	/**
	 * Returns the user address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address, or <code>null</code> if a user address with the primary key could not be found
	 */
	public UserAddress fetchByPrimaryKey(UserAddressPK userAddressPK);

	/**
	 * Returns all the user addresses.
	 *
	 * @return the user addresses
	 */
	public java.util.List<UserAddress> findAll();

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
	public java.util.List<UserAddress> findAll(int start, int end);

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
	public java.util.List<UserAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator);

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
	public java.util.List<UserAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserAddress>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user addresses.
	 *
	 * @return the number of user addresses
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}