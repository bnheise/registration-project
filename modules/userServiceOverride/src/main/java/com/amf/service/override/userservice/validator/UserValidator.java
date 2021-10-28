package com.amf.service.override.userservice.validator;

import com.amf.service.override.userservice.exception.UserServiceValidationException;

public interface UserValidator {
    public void validate(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear) throws UserServiceValidationException;
}
