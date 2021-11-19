package com.amf.service.signup.validator;

import com.amf.service.signup.exception.SignupServiceValidationException;

import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Phone;

public interface SignupValidator {

	public void validate(
			String password1, String password2, String screenName,
			String emailAddress, String firstName, String lastName,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			long companyId, Phone homePhone, Phone mobilePhone,
			Address billingAddress, boolean agreedToTerms,
			String securityQuestion, String securityAnswer)
		throws SignupServiceValidationException;

}