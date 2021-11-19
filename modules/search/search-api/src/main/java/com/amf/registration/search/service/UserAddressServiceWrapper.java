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
 * Provides a wrapper for {@link UserAddressService}.
 *
 * @author Brian Heise
 * @see UserAddressService
 * @generated
 */
public class UserAddressServiceWrapper
	implements ServiceWrapper<UserAddressService>, UserAddressService {

	public UserAddressServiceWrapper(UserAddressService userAddressService) {
		_userAddressService = userAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userAddressService.getOSGiServiceIdentifier();
	}

	@Override
	public long getUserCountByZip(String zip) {
		return _userAddressService.getUserCountByZip(zip);
	}

	@Override
	public java.util.List<com.amf.registration.search.model.UserAddress>
		getUsersByZip(String zip, int start, int end) {

		return _userAddressService.getUsersByZip(zip, start, end);
	}

	@Override
	public UserAddressService getWrappedService() {
		return _userAddressService;
	}

	@Override
	public void setWrappedService(UserAddressService userAddressService) {
		_userAddressService = userAddressService;
	}

	private UserAddressService _userAddressService;

}