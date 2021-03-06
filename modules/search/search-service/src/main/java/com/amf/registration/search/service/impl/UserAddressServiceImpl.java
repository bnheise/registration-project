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

package com.amf.registration.search.service.impl;

import java.util.List;

import com.amf.registration.search.model.UserAddress;
import com.amf.registration.search.service.base.UserAddressServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the user address remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.amf.registration.search.service.UserAddressService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Heise
 * @see UserAddressServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=registrationsearch",
		"json.web.service.context.path=UserAddress"
	},
	service = AopService.class
)
public class UserAddressServiceImpl extends UserAddressServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.amf.registration.search.service.UserAddressServiceUtil</code> to access the user address remote service.
	 */

	 @Override
	 public List<UserAddress> getUsersByZip(String zip, int start, int end) throws PortalException {
		 return userAddressLocalService.getUsersByZip(zip, start, end);
	 }
	 
	 @Override
	 public long getUserCountByZip(String zip) throws PortalException {
		 return userAddressLocalService.getUserCountByZip(zip);
	 }
}