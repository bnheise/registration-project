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

import com.amf.service.signup.service.SignupServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>SignupServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SignupServiceSoap
 * @generated
 */
public class SignupServiceHttp {

	public static java.util.List<com.liferay.portal.kernel.model.Region>
		getStates(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				SignupServiceUtil.class, "getStates",
				_getStatesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.portal.kernel.model.Region>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static boolean signup(
			HttpPrincipal httpPrincipal, String password1, String password2,
			String screenName, String emailAddress, String firstName,
			String lastName, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear,
			com.liferay.portal.kernel.model.Address billingAddress,
			com.liferay.portal.kernel.model.Phone homePhone,
			com.liferay.portal.kernel.model.Phone mobilePhone,
			boolean agreedToTerms,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				SignupServiceUtil.class, "signup", _signupParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, password1, password2, screenName, emailAddress,
				firstName, lastName, male, birthdayMonth, birthdayDay,
				birthdayYear, billingAddress, homePhone, mobilePhone,
				agreedToTerms, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SignupServiceHttp.class);

	private static final Class<?>[] _getStatesParameterTypes0 = new Class[] {};
	private static final Class<?>[] _signupParameterTypes1 = new Class[] {
		String.class, String.class, String.class, String.class, String.class,
		String.class, boolean.class, int.class, int.class, int.class,
		com.liferay.portal.kernel.model.Address.class,
		com.liferay.portal.kernel.model.Phone.class,
		com.liferay.portal.kernel.model.Phone.class, boolean.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};

}