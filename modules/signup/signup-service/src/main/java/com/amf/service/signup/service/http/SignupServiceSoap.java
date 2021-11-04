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

package com.amf.service.signup.service.http;

import java.rmi.RemoteException;

import com.amf.service.signup.service.SignupServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Provides the SOAP utility for the <code>SignupServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SignupServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SignupServiceSoap {

	public static com.liferay.portal.kernel.model.Region[] getStates()
			throws RemoteException {

		try {
			java.util.List<com.liferay.portal.kernel.model.Region> returnValue = SignupServiceUtil.getStates();

			return returnValue.toArray(
					new com.liferay.portal.kernel.model.Region[returnValue.size()]);
		} catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static boolean signup(
			String password1, String password2, String screenName,
			String emailAddress, String firstName, String lastName,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			com.liferay.portal.kernel.model.AddressSoap billingAddress,
			com.liferay.portal.kernel.model.PhoneSoap homePhone,
			com.liferay.portal.kernel.model.PhoneSoap mobilePhone,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
			throws RemoteException {

		return false;
	}

	private static Log _log = LogFactoryUtil.getLog(SignupServiceSoap.class);

}