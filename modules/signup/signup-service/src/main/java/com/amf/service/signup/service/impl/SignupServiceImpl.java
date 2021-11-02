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

package com.amf.service.signup.service.impl;

import java.util.List;
import java.util.Locale;

import com.amf.service.signup.service.base.SignupServiceBaseImpl;
import com.amf.service.signup.validator.SignupValidator;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the signup remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.service.signup.service.SignupService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SignupServiceBaseImpl
 */
@Component(property = {
		"json.web.service.context.name=signup",
		"json.web.service.context.path=Signup"
}, service = AopService.class)
public class SignupServiceImpl extends SignupServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.amf.service.signup.service.SignupServiceUtil</code> to access the
	 * signup remote service.
	 */

	private static Log log = LogFactoryUtil.getLog(SignupServiceImpl.class);

	@Override
	public boolean signup(String password1,
			String password2, String screenName,
			String emailAddress, String firstName, String lastName, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear,
			List<Address> addresses,
			List<Phone> phones,
			ServiceContext serviceContext)
			throws PortalException {
		log.info("New user requesting signup with email " + emailAddress);

		long creatorUserId = serviceContext.getGuestOrUserId();
		long companyId = serviceContext.getCompanyId();
		boolean autoPassword = false;
		boolean autoScreenName = false;
		Locale locale = serviceContext.getLocale();
		String middleName = "";
		long prefixId = 0;
		long suffixId = 0;
		String jobTitle = "";
		long[] groupIds = new long[0];
		long[] organizationIds = new long[0];
		long[] roleIds = new long[0];
		long[] userGroupIds = new long[0];
		boolean sendEmail = false;

		signupValidator.validate(password1, password2, screenName, emailAddress,
				firstName, lastName, male,
				birthdayMonth, birthdayDay, birthdayYear, companyId);

		try {
			log.info("Attempting to create user.");
			User user = userLocalService.addUser(creatorUserId, companyId, autoPassword, password1, password2,
					autoScreenName, screenName, emailAddress, locale, firstName, middleName, lastName, prefixId,
					suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds,
					roleIds, userGroupIds, sendEmail, serviceContext);
			log.info("User creation successful");
			log.info("New user:" + user.toString());
			return true;
		} catch (Exception exception) {
			log.error("User signup failed for guest with email " + emailAddress);
			log.error("Error detais:");
			log.error(exception.toString());
			return false;
		}
	}

	@Reference
	SignupValidator signupValidator;
}