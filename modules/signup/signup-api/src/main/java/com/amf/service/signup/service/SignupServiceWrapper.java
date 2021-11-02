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

package com.amf.service.signup.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SignupService}.
 *
 * @author Brian Wing Shun Chan
 * @see SignupService
 * @generated
 */
public class SignupServiceWrapper
	implements ServiceWrapper<SignupService>, SignupService {

	public SignupServiceWrapper(SignupService signupService) {
		_signupService = signupService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _signupService.getOSGiServiceIdentifier();
	}

	@Override
	public boolean signup(
			String password1, String password2, String screenName,
			String emailAddress, String firstName, String lastName,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			java.util.List<com.liferay.portal.kernel.model.Address> addresses,
			java.util.List<com.liferay.portal.kernel.model.Phone> phones,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _signupService.signup(
			password1, password2, screenName, emailAddress, firstName, lastName,
			male, birthdayMonth, birthdayDay, birthdayYear, addresses, phones,
			serviceContext);
	}

	@Override
	public SignupService getWrappedService() {
		return _signupService;
	}

	@Override
	public void setWrappedService(SignupService signupService) {
		_signupService = signupService;
	}

	private SignupService _signupService;

}