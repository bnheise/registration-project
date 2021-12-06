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

package com.amf.registration.profile.service.http;

import com.amf.registration.profile.service.UserProfileServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>UserProfileServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.amf.registration.profile.model.UserProfileSoap</code>. If the method in the
 * service utility returns a
 * <code>com.amf.registration.profile.model.UserProfile</code>, that is translated to a
 * <code>com.amf.registration.profile.model.UserProfileSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
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
 * @author Brian Heise
 * @see UserProfileServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserProfileServiceSoap {

	public static com.amf.registration.profile.model.UserProfileSoap
			getUserProfile(
				String screenName,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.amf.registration.profile.model.UserProfile returnValue =
				UserProfileServiceUtil.getUserProfile(
					screenName, serviceContext);

			return com.amf.registration.profile.model.UserProfileSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.amf.registration.profile.model.UserProfileSoap
			getUserProfileById(
				long userId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.amf.registration.profile.model.UserProfile returnValue =
				UserProfileServiceUtil.getUserProfileById(
					userId, serviceContext);

			return com.amf.registration.profile.model.UserProfileSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.amf.registration.profile.model.UserProfileSoap
			updateUserProfile(
				String screenName, String firstName, String lastName,
				boolean male, int birthYear, int birthMonth, int birthDay,
				String aboutMe, String favoriteQuotes, String favoriteMovie,
				long favoriteGenreId, String leastFavMovie,
				String favoriteActor,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.amf.registration.profile.model.UserProfile returnValue =
				UserProfileServiceUtil.updateUserProfile(
					screenName, firstName, lastName, male, birthYear,
					birthMonth, birthDay, aboutMe, favoriteQuotes,
					favoriteMovie, favoriteGenreId, leastFavMovie,
					favoriteActor, serviceContext);

			return com.amf.registration.profile.model.UserProfileSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		UserProfileServiceSoap.class);

}