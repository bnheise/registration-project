package com.amf.service.override.userservice.util.validator;

import java.util.ArrayList;
import java.util.List;

import com.amf.service.override.userservice.exception.UserServiceValidationException;
import com.amf.service.override.userservice.validator.UserValidator;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = UserValidator.class)
public class UserValidatorImpl implements UserValidator {
    public void validate(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear) throws UserServiceValidationException {
        List<String> errors = new ArrayList<>();

        if (!isUserValid(password1, password2, screenName, emailAddress, firstName, lastName, male, birthdayMonth,
                birthdayDay, birthdayYear)) {
            throw new UserServiceValidationException(errors);
        }
    }

    private boolean isUserValid(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear) {
        boolean result = true;

        return result;
    }
}
