package com.amf.service.signup.util.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.amf.service.signup.exception.SignupServiceValidationException;
import com.amf.service.signup.validator.SignupValidator;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PasswordPolicy;
import com.liferay.portal.kernel.security.auth.DefaultScreenNameValidator;
import com.liferay.portal.kernel.service.PasswordPolicyLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = SignupValidator.class)
public class SignupValidatorImpl implements SignupValidator {
    private static final String PASSWORD = "password";
    private static final String SCREEN_NAME = "screenName";
    private static final String EMAIL_ADDRESS = "emailAddress";
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final String BIRTHDAY = "birthday";
    private static final int MAX_NAME_LENGTH = 50;
    private static final int MAX_EMAIL_LENGTH = 255;
    private static final int MIN_SCREENNAME_LENGTH = 4;
    private static final String SPECIAL_CHARS = "!\\\\\\\"#$%&\\\\\'()*+,-./:;<>=?@[]^_`{}|~";
    private static Log log = LogFactoryUtil.getLog(SignupValidatorImpl.class);

    public void validate(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, long companyId)
            throws SignupServiceValidationException {
        List<String> errors = new ArrayList<>();

        if (!isUserValid(password1, password2, screenName, emailAddress, firstName, lastName, male, birthdayMonth,
                birthdayDay, birthdayYear, companyId, errors)) {
            throw new SignupServiceValidationException(errors);
        }
    }

    private boolean isUserValid(String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName,
            boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, long companyId, List<String> errors) {
        boolean result = true;
        result &= isFirstNameValid(firstName, errors);
        result &= isLastNameValid(lastName, errors);
        result &= isEmailValid(emailAddress, errors);
        result &= isScreenNameValid(screenName, companyId, errors);
        result &= isBirthdayValid(birthdayYear, birthdayMonth, birthdayDay, errors);
        result &= isPasswordValid(password1, password2, companyId, errors);
        return result;
    }

    private boolean isFirstNameValid(final String firstName, List<String> errors) {
        return validateName(firstName, FIRST_NAME, MAX_NAME_LENGTH, errors);
    }

    private boolean isLastNameValid(final String lastName, List<String> errors) {
        return validateName(lastName, LAST_NAME, MAX_NAME_LENGTH, errors);
    }

    private boolean isEmailValid(final String email, List<String> errors) {
        if (!exists(email)) {
            errors.add(makeError(EMAIL_ADDRESS, blankMessage(EMAIL_ADDRESS)));
            return false;
        }

        if (!lengthLessThan(MAX_EMAIL_LENGTH, email)) {
            errors.add(makeError(EMAIL_ADDRESS, tooLongMessage(EMAIL_ADDRESS, MAX_EMAIL_LENGTH)));
        }

        return true;
    }

    private boolean isScreenNameValid(final String screenname, long companyId, List<String> errors) {
        if (!exists(screenname)) {
            errors.add(makeError(SCREEN_NAME, blankMessage(SCREEN_NAME)));
            return false;
        }

        if (!lengthGreaterThan(MIN_SCREENNAME_LENGTH, screenname)) {
            errors.add(makeError(SCREEN_NAME, tooShortMessage(SCREEN_NAME, MIN_SCREENNAME_LENGTH)));
            return false;
        }

        if (!isAlphaNumeric(screenname)) {
            errors.add(makeError(SCREEN_NAME, mustBeAlphanumericMessage(SCREEN_NAME)));
            return false;
        }

        if (!defaultScreenNameValidator.validate(companyId, screenname)) {
            errors.add(makeError(SCREEN_NAME, "Triggered default error service"));
            return false;
        }

        return true;
    }

    private boolean isBirthdayValid(final int year, final int month, final int day, List<String> errors) {
        GregorianCalendar birthday = new GregorianCalendar(year, month, day);
        GregorianCalendar limit = new GregorianCalendar();
        limit.add(Calendar.YEAR, -13);
        if (birthday.compareTo(limit) >= 0) {
            errors.add(makeError(BIRTHDAY, "You must be 13 or older to register"));
            return false;
        }

        if (year < 0 && month < 0 && day < 0) {
            errors.add((makeError(BIRTHDAY, blankMessage(BIRTHDAY))));
            return false;
        }

        return true;
    }

    private boolean isPasswordValid(String password1, String password2, long companyId, List<String> errors) {
        if (!password1.equals(password2)) {
            errors.add(makeError(PASSWORD, "Confirmation password does not match"));
            return false;
        }

        List<String> passwordErrors = new ArrayList<>();
        try {
            PasswordPolicy policy = passwordPolicyService.getPasswordPolicy(companyId, true);
            int minLength = policy.getMinLength();

            if (password1.length() < minLength) {
                passwordErrors.add("Password must be 6 characters or longer");
            }

            int minUpperCase = policy.getMinUpperCase();
            Pattern uppercasePattern = Pattern.compile("(( *?[A-Z] *?)){1}");
            Matcher uppercaseMatcher = uppercasePattern.matcher(password1);
            if (uppercaseMatcher.results().count() < minUpperCase) {
                passwordErrors.add("Password must contain at least " + minUpperCase + " uppercase letter");
            }

            int minNumbers = policy.getMinNumbers();
            Pattern numberPattern = Pattern.compile("(( *?[0-9] *?)){1}");
            Matcher numberMatcher = numberPattern.matcher(password1);

            if (numberMatcher.results().count() < minNumbers) {
                passwordErrors.add("Password must contain at least " + minNumbers + " number");
            }

            int minSpecial = policy.getMinSymbols();
            Pattern specialPattern = Pattern.compile("(( *?[!\"#$%&'()*+,-./:;<>=?@\\[\\]\\\\^_`\\{}\\|~] *?)){1}");
            Matcher specialMatcher = specialPattern.matcher(password1);

            if (specialMatcher.results().count() < minSpecial) {
                passwordErrors.add("Password must contain at least one of the following characters: " + SPECIAL_CHARS);
            }

            if (passwordErrors.isEmpty()) {
                return true;
            } else {
                errors.add(makeError(PASSWORD, passwordErrors));
                return false;
            }
        } catch (Exception e) {
            log.error(e);
        }

        return true;
    }

    private boolean validateName(String name, String fieldName, int maxLength, List<String> errors) {
        if (!exists(name)) {
            errors.add(makeError(fieldName, blankMessage(fieldName)));
            return false;
        }

        if (!lengthLessThan(maxLength, fieldName)) {
            errors.add(makeError(name,
                    tooLongMessage(name, maxLength)));
            return false;
        }

        if (!isAlphaNumeric(name)) {
            errors.add(makeError(fieldName, mustBeAlphanumericMessage(fieldName)));
        }

        return true;
    }

    private boolean exists(String input) {
        return input.length() > 0;
    }

    private boolean lengthLessThan(int length, String input) {
        return input.length() <= length;
    }

    private boolean lengthGreaterThan(int length, String input) {
        return input.length() >= length;
    }

    private String makeError(String inputName, String message) {
        return "\"" + inputName + "\": \"" + message + "\"";
    }

    private String makeError(String inputName, List<String> messageList) {
        return "\"" + inputName + "\": [\"" + String.join("\", \"", messageList) + "\"]";
    }

    private String blankMessage(String fieldName) {
        return toPrintFriendly(fieldName) + " cannot be blank.";
    }

    private String tooLongMessage(String fieldName, int maxLength) {
        return toPrintFriendly(fieldName) + " cannot be greater than " + maxLength
                + " characters long.";
    }

    private String tooShortMessage(String fieldName, int minLength) {
        return toPrintFriendly(fieldName) + " cannot be less than " + minLength
                + " characters long.";
    }

    private String mustBeAlphanumericMessage(String fieldName) {
        return toPrintFriendly(fieldName) + " can only contain numbers and letters.";
    }

    public static boolean isAlphaNumeric(String input) {
        return input != null && input.matches("^[a-zA-Z0-9]*$");
    }

    private String toPrintFriendly(String fieldName) {
        List<String> split = Arrays.asList(fieldName.split("(?=\\p{Upper})"));
        String splitAndLowercase = String.join(" ",
                split.stream().map(String::toLowerCase).collect(Collectors.toList()));
        return splitAndLowercase.substring(0, 1).toUpperCase() + splitAndLowercase.substring(1);
    }

    @Reference
    DefaultScreenNameValidator defaultScreenNameValidator;

    @Reference
    PasswordPolicyLocalService passwordPolicyService;
}
