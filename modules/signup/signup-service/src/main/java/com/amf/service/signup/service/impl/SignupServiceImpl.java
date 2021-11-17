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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.amf.service.signup.service.base.SignupServiceBaseImpl;
import com.amf.service.signup.validator.SignupValidator;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Account;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.AddressLocalService;
import com.liferay.portal.kernel.service.CountryServiceUtil;
import com.liferay.portal.kernel.service.ListTypeLocalService;
import com.liferay.portal.kernel.service.PhoneLocalService;
import com.liferay.portal.kernel.service.RegionServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

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
@Component(property = { "json.web.service.context.name=signup",
		"json.web.service.context.path=Signup" }, service = AopService.class)
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
	public List<Region> getStates() {
		List<Region> result = new ArrayList<>();
		try {
			long usCountryId = CountryServiceUtil.getCountryByName("united-states").getCountryId();
			result = RegionServiceUtil.getRegions(usCountryId);
			return result;
		} catch (Exception exception) {
		}
		return result;
	}

	@Override
	public boolean signup(String password1, String password2, String screenName, String emailAddress, String firstName,
			String lastName, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, Address billingAddress,
			Phone homePhone, Phone mobilePhone, boolean agreedToTerms, String securityQuestion, String securityAnswer,
			ServiceContext serviceContext) throws PortalException {
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

		signupValidator.validate(password1, password2, screenName, emailAddress, firstName, lastName, male,
				birthdayMonth, birthdayDay, birthdayYear, companyId, homePhone, mobilePhone, billingAddress,
				agreedToTerms, securityQuestion, securityAnswer);
		log.info("Attempting to create user.");
		User user = userLocalService.addUser(creatorUserId, companyId, autoPassword, password1, password2,
				autoScreenName, screenName, emailAddress, locale, firstName, middleName, lastName, prefixId, suffixId,
				male, birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds,
				userGroupIds, sendEmail, serviceContext);

		userLocalService.updateAgreedToTermsOfUse(user.getUserId(), agreedToTerms);
		userLocalService.updateReminderQuery(user.getUserId(), securityQuestion, securityAnswer);

		log.info("User creation successful");
		log.info("New user:" + user.toString());
		log.info("BILLING  " + billingAddress.toString());

		homePhone.setTypeId(
				listTypeLocalService.getListType("personal", Contact.class.getName() + ".phone").getListTypeId());
		addPhone(homePhone, user, serviceContext);
		mobilePhone.setTypeId(
				listTypeLocalService.getListType("mobile-phone", Contact.class.getName() + ".phone").getListTypeId());
		addPhone(mobilePhone, user, serviceContext);
		addAddress(billingAddress, user, serviceContext);

		return true;
	}

	private void addAddress(Address address, User user, ServiceContext serviceContext) {
		try {
			log.info("Attempting to add address");
			long userId = user.getUserId();
			String className = Address.class.getName();
			long classPK = PortalUtil.getClassNameId(Address.class.getName());
			String street1 = address.getStreet1();
			String street2 = address.getStreet2();
			String street3 = address.getStreet3();
			String city = address.getCity();
			String zip = address.getZip();
			long regionId = address.getRegionId();
			long countryId = CountryServiceUtil.getCountryByName("united-states").getCountryId();
			long typeId = listTypeLocalService.getListType("billing", Account.class.getName() + ".address").getListTypeId();
			boolean mailing = false;
			boolean primary = true;
			addressLocalService.addAddress(userId, className, classPK, street1, street2, street3, city, zip, regionId, countryId, typeId, mailing, primary, serviceContext);

		} catch (PortalException exception) {
			log.error(exception.toString());
			deleteUser(user);
		}
	}

	private void addPhone(Phone phone, User user, ServiceContext serviceContext) {
		if (!phone.getNumber().isBlank()) {
			try {
				log.info("Attempting to add home phone number");
				log.info(phone.getNumber());
				log.info(phone.getNumber().isBlank());
				Phone newPhone = phoneLocalService.addPhone(user.getUserId(), Contact.class.getName(),
						user.getContactId(), phone.getNumber(), phone.getExtension(), phone.getTypeId(),
						phone.getPrimary(), serviceContext);
				log.info(newPhone.toString());
			} catch (Exception exception) {
				deleteUser(user);
			}
		}
	}

	private void deleteUser(User user) {
		try {
			userLocalService.deleteUser(user);
		} catch (Exception exception) {
		}

	}

	@Reference
	SignupValidator signupValidator;

	@Reference
	PhoneLocalService phoneLocalService;

	@Reference
	AddressLocalService addressLocalService;

	@Reference
	ListTypeLocalService listTypeLocalService;

}