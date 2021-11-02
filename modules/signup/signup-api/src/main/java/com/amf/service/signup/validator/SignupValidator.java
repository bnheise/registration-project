package com.amf.service.signup.validator;

import com.amf.service.signup.exception.SignupServiceValidationException;

public interface SignupValidator {
    public void validate(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, long companyId)
            throws SignupServiceValidationException;
}
