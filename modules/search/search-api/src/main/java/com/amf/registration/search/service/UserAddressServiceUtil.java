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

import com.amf.registration.search.model.UserAddress;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for UserAddress. This utility wraps
 * <code>com.amf.registration.search.service.impl.UserAddressServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Heise
 * @see UserAddressService
 * @generated
 */
public class UserAddressServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.amf.registration.search.service.impl.UserAddressServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static long getUserCountByZip(String zip) throws PortalException {
		return getService().getUserCountByZip(zip);
	}

	public static List<UserAddress> getUsersByZip(
			String zip, int start, int end)
		throws PortalException {

		return getService().getUsersByZip(zip, start, end);
	}

	public static UserAddressService getService() {
		return _service;
	}

	private static volatile UserAddressService _service;

}