package com.amf.service.signup.util.validator;

import com.amf.service.signup.exception.SignupServiceValidationException;
import com.amf.service.signup.validator.SignupValidator;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.PasswordPolicy;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.security.auth.DefaultScreenNameValidator;
import com.liferay.portal.kernel.service.PasswordPolicyLocalService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = SignupValidator.class)
public class SignupValidatorImpl implements SignupValidator {

	public static boolean isAlphaNumeric(String input) {
		if ((input != null) && input.matches("^[\\sa-zA-Z0-9]*$")) {
			return true;
		}

		return false;
	}

	public void validate(
			String password1, String password2, String screenName,
			String emailAddress, String firstName, String lastName,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			long companyId, Phone homePhone, Phone mobilePhone,
			Address billingAddress, boolean agreedToTerms,
			String securityQuestion, String securityAnswer)
		throws SignupServiceValidationException {

		List<String> errors = new ArrayList<>();
		boolean valid = true;
		valid &= isUserValid(
			password1, password2, screenName, emailAddress, firstName, lastName,
			birthdayMonth, birthdayDay, birthdayYear, companyId, agreedToTerms,
			securityQuestion, securityAnswer, errors);
		valid &= isHomePhoneValid(homePhone, errors);
		valid &= isMobilePhoneValid(mobilePhone, errors);
		valid &= isAddressValid(billingAddress, errors);

		if (!valid) {
			throw new SignupServiceValidationException(errors);
		}
	}

	private String blankMessage(String fieldName) {
		return toPrintFriendly(fieldName) + " cannot be blank.";
	}

	private boolean exists(String input) {
		if (input.length() > 0) {
			return true;
		}

		return false;
	}

	private boolean isAddress1Valid(String street1, List<String> errors) {
		boolean result = true;
		result &= isAddressLineValid(street1, ADDRESS1, errors);

		if (street1.isEmpty()) {
			result &= false;
			errors.add(makeError(ADDRESS1, blankMessage(ADDRESS1)));
		}

		return result;
	}

	private boolean isAddressLineValid(
		String street1, String fieldName, List<String> errors) {

		boolean result = true;

		if (!isAddressValidLength(street1)) {
			result &= false;
			errors.add(
				makeError(
					fieldName,
					tooLongMessage(fieldName, STANDARD_TEXT_FIELD_LENGTH)));
		}

		if (!isAlphaNumeric(street1)) {
			result &= false;
			errors.add(
				makeError(fieldName, mustBeAlphanumericMessage(fieldName)));
		}

		return result;
	}

	private boolean isAddressValid(Address address, List<String> errors) {
		boolean result = true;
		result &= isAddress1Valid(address.getStreet1(), errors);
		result &= isAddressLineValid(address.getStreet2(), ADDRESS2, errors);
		result &= isCityValid(address.getCity(), errors);
		result &= isZipValid(address.getZip(), errors);
		result &= isStateValid(address.getRegionId(), errors);

		return result;
	}

	private boolean isAddressValidLength(String addressLine) {
		if (addressLine.length() < STANDARD_TEXT_FIELD_LENGTH) {
			return true;
		}

		return false;
	}

	private boolean isBirthdayValid(
		final int year, final int month, final int day, List<String> errors) {

		GregorianCalendar birthday = new GregorianCalendar(year, month, day);
		GregorianCalendar limit = new GregorianCalendar();

		limit.add(Calendar.YEAR, -13);

		if (birthday.compareTo(limit) >= 0) {
			errors.add(
				makeError(BIRTHDAY, "You must be 13 or older to register"));

			return false;
		}

		if ((year < 0) && (month < 0) && (day < 0)) {
			errors.add(makeError(BIRTHDAY, blankMessage(BIRTHDAY)));

			return false;
		}

		return true;
	}

	private boolean isCityValid(String city, List<String> errors) {
		boolean result = true;

		if (city.isEmpty()) {
			result &= false;
			errors.add(makeError(CITY, blankMessage(CITY)));
		}

		if (!isAddressLineValid(city, CITY, errors)) {
			result &= false;
		}

		return result;
	}

	private boolean isEmailValid(final String email, List<String> errors) {
		if (!exists(email)) {
			errors.add(makeError(EMAIL_ADDRESS, blankMessage(EMAIL_ADDRESS)));

			return false;
		}

		if (!lengthLessThan(STANDARD_TEXT_FIELD_LENGTH, email)) {
			errors.add(
				makeError(
					EMAIL_ADDRESS,
					tooLongMessage(EMAIL_ADDRESS, STANDARD_TEXT_FIELD_LENGTH)));
		}

		return true;
	}

	private boolean isFirstNameValid(
		final String firstName, List<String> errors) {

		return validateName(firstName, FIRST_NAME, MAX_NAME_LENGTH, errors);
	}

	private boolean isHomePhoneValid(Phone phone, List<String> errors) {
		boolean result = true;

		if (!phone.getNumber(
			).isEmpty()) {

			if (!isPhoneLengthValid(phone)) {
				errors.add(
					makeError(
						HOME_PHONE,
						"Phone numbers must be exactly 10 characters long"));
				result &= false;
			}

			if (!isValidNumber(phone.getNumber())) {
				errors.add(
					makeError(
						HOME_PHONE, "Phone must be comprised of only numbers"));
				result &= false;
			}
		}

		return result;
	}

	private boolean isLastNameValid(
		final String lastName, List<String> errors) {

		return validateName(lastName, LAST_NAME, MAX_NAME_LENGTH, errors);
	}

	private boolean isMobilePhoneValid(Phone phone, List<String> errors) {
		boolean result = true;

		if (!phone.getNumber(
			).isEmpty()) {

			if (!isPhoneLengthValid(phone)) {
				errors.add(
					makeError(
						MOBILE_PHONE,
						"Phone numbers must be exactly 10 characters long"));
				result &= false;
			}

			if (!isValidNumber(phone.getNumber())) {
				errors.add(
					makeError(
						MOBILE_PHONE,
						"Phone must be comprised of only numbers"));
				result &= false;
			}
		}

		return result;
	}

	private boolean isPasswordValid(
		String password1, String password2, long companyId,
		List<String> errors) {

		if (!password1.equals(password2)) {
			errors.add(
				makeError(PASSWORD, "Confirmation password does not match"));

			return false;
		}

		List<String> passwordErrors = new ArrayList<>();

		try {
			PasswordPolicy policy = passwordPolicyService.getPasswordPolicy(
				companyId, true);

			int minLength = policy.getMinLength();

			if (password1.length() < minLength) {
				passwordErrors.add("Password must be 6 characters or longer");
			}

			int minUpperCase = policy.getMinUpperCase();
			Pattern uppercasePattern = Pattern.compile("(( *?[A-Z] *?)){1}");

			Matcher uppercaseMatcher = uppercasePattern.matcher(password1);

			if (uppercaseMatcher.results(
				).
					count() < minUpperCase) {

				passwordErrors.add(
					"Password must contain at least " + minUpperCase +
						" uppercase letter");
			}

			int minNumbers = policy.getMinNumbers();
			Pattern numberPattern = Pattern.compile("(( *?[0-9] *?)){1}");

			Matcher numberMatcher = numberPattern.matcher(password1);

			if (numberMatcher.results(
				).
					count() < minNumbers) {

				passwordErrors.add(
					"Password must contain at least " + minNumbers + " number");
			}

			int minSpecial = policy.getMinSymbols();
			Pattern specialPattern = Pattern.compile(
				"(( *?[!\"#$%&'()*+,-./:;<>=?@\\[\\]\\\\^_`\\{}\\|~] *?)){1}");

			Matcher specialMatcher = specialPattern.matcher(password1);

			if (specialMatcher.results(
				).
					count() < minSpecial) {

				passwordErrors.add(
					"Password must contain at least one of the following characters: " +
						SPECIAL_CHARS);
			}

			if (passwordErrors.isEmpty()) {
				return true;
			}

			errors.add(makeError(PASSWORD, passwordErrors));

			return false;
		}
		catch (Exception e) {
			log.error(e);
		}

		return true;
	}

	private boolean isPhoneLengthValid(Phone phone) {
		if (phone.getNumber(
			).length() == 10) {

			return true;
		}

		return false;
	}

	private boolean isScreenNameValid(
		final String screenname, long companyId, List<String> errors) {

		if (!exists(screenname)) {
			errors.add(makeError(SCREEN_NAME, blankMessage(SCREEN_NAME)));

			return false;
		}

		if (!lengthGreaterThan(MIN_SCREENNAME_LENGTH, screenname)) {
			errors.add(
				makeError(
					SCREEN_NAME,
					tooShortMessage(SCREEN_NAME, MIN_SCREENNAME_LENGTH)));

			return false;
		}

		if (!isAlphaNumeric(screenname)) {
			errors.add(
				makeError(SCREEN_NAME, mustBeAlphanumericMessage(SCREEN_NAME)));

			return false;
		}

		if (!defaultScreenNameValidator.validate(companyId, screenname)) {
			errors.add(
				makeError(SCREEN_NAME, "Triggered default error service"));

			return false;
		}

		return true;
	}

	private boolean isSecurityAnswerValid(
		String securityAnswer, List<String> errors) {

		List<String> answerErrors = new ArrayList<>();

		if (securityAnswer.isEmpty()) {
			answerErrors.add(blankMessage(SECURITY_ANSWER));
		}

		if (!isAlphaNumeric(securityAnswer)) {
			answerErrors.add(
				toPrintFriendly(SECURITY_ANSWER) +
					" must comprise of only numbers and letters");
		}

		if (securityAnswer.length() > STANDARD_TEXT_FIELD_LENGTH) {
			answerErrors.add(
				tooLongMessage(SECURITY_ANSWER, STANDARD_TEXT_FIELD_LENGTH));
		}

		if (answerErrors.isEmpty()) {
			return true;
		}

		errors.add(makeError(SECURITY_ANSWER, answerErrors));

		return false;
	}

	private boolean isSecurityQuestionValid(
		String securityQuestion, List<String> errors) {

		if (securityQuestion.isBlank()) {
			errors.add(
				makeError(SECURITY_QUESTION, blankMessage(SECURITY_QUESTION)));

			return false;
		}

		return true;
	}

	private boolean isStateValid(long regionId, List<String> errors) {
		if (regionId == -1) {
			errors.add(makeError(STATE, "Please select a " + STATE));

			return false;
		}

		return true;
	}

	private boolean isUserValid(
		String password1, String password2, String screenName,
		String emailAddress, String firstName, String lastName,
		int birthdayMonth, int birthdayDay, int birthdayYear, long companyId,
		boolean agreedToTerms, String securityQuestion, String securityAnswer,
		List<String> errors) {

		boolean result = true;
		result &= isFirstNameValid(firstName, errors);
		result &= isLastNameValid(lastName, errors);
		result &= isEmailValid(emailAddress, errors);
		result &= isScreenNameValid(screenName, companyId, errors);
		result &= isBirthdayValid(
			birthdayYear, birthdayMonth, birthdayDay, errors);
		result &= isPasswordValid(password1, password2, companyId, errors);
		result &= isSecurityQuestionValid(securityQuestion, errors);
		result &= isSecurityAnswerValid(securityAnswer, errors);

		if (!agreedToTerms) {
			result &= agreedToTerms;
			errors.add(
				makeError(
					AGREED_TO_TERMS,
					"You must accept the terms and conditions to register"));
		}

		return result;
	}

	private boolean isValidNumber(String numberString) {
		try {
			Integer.parseInt(numberString);
		}
		catch (NumberFormatException exception) {
			return false;
		}

		return true;
	}

	private boolean isZipValid(String zip, List<String> errors) {
		List<String> zipErrors = new ArrayList<>();

		if (zip.isEmpty()) {
			zipErrors.add(blankMessage(ZIP));
		}

		if (!isValidNumber(zip)) {
			zipErrors.add(
				toPrintFriendly(ZIP) + " must comprise of only numbers");
		}

		if (zip.length() != 5) {
			zipErrors.add(
				toPrintFriendly(ZIP) + " must be exactly 5 numbers long");
		}

		if (zipErrors.isEmpty()) {
			return true;
		}

		errors.add(makeError(ZIP, zipErrors));

		return false;
	}

	private boolean lengthGreaterThan(int length, String input) {
		if (input.length() >= length) {
			return true;
		}

		return false;
	}

	private boolean lengthLessThan(int length, String input) {
		if (input.length() <= length) {
			return true;
		}

		return false;
	}

	private String makeError(String inputName, List<String> messageList) {
		return "\"" + inputName + "\": [\"" +
			String.join("\", \"", messageList) + "\"]";
	}

	private String makeError(String inputName, String message) {
		return "\"" + inputName + "\": \"" + message + "\"";
	}

	private String mustBeAlphanumericMessage(String fieldName) {
		return toPrintFriendly(fieldName) +
			" can only contain numbers and letters.";
	}

	private String tooLongMessage(String fieldName, int maxLength) {
		return toPrintFriendly(fieldName) + " cannot be greater than " +
			maxLength + " characters long.";
	}

	private String tooShortMessage(String fieldName, int minLength) {
		return toPrintFriendly(fieldName) + " cannot be less than " +
			minLength + " characters long.";
	}

	private String toPrintFriendly(String fieldName) {
		List<String> split = Arrays.asList(fieldName.split("(?=\\p{Upper})"));

		String splitAndLowercase = String.join(
			" ",
			split.stream(
			).map(
				String::toLowerCase
			).collect(
				Collectors.toList()
			));

		return splitAndLowercase.substring(
			0, 1
		).toUpperCase() + splitAndLowercase.substring(1);
	}

	private boolean validateName(
		String name, String fieldName, int maxLength, List<String> errors) {

		if (!exists(name)) {
			errors.add(makeError(fieldName, blankMessage(fieldName)));

			return false;
		}

		if (!lengthLessThan(maxLength, fieldName)) {
			errors.add(makeError(name, tooLongMessage(name, maxLength)));

			return false;
		}

		if (!isAlphaNumeric(name)) {
			errors.add(
				makeError(fieldName, mustBeAlphanumericMessage(fieldName)));
		}

		return true;
	}

	private static final String ADDRESS1 = "address1";

	private static final String ADDRESS2 = "address2";

	private static final String AGREED_TO_TERMS = "agreedToTerms";

	private static final String BIRTHDAY = "birthday";

	private static final String CITY = "city";

	private static final String EMAIL_ADDRESS = "emailAddress";

	private static final String FIRST_NAME = "firstName";

	private static final String HOME_PHONE = "homePhone";

	private static final String LAST_NAME = "lastName";

	private static final int MAX_NAME_LENGTH = 50;

	private static final int MIN_SCREENNAME_LENGTH = 4;

	private static final String MOBILE_PHONE = "mobilePhone";

	private static final String PASSWORD = "password";

	private static final String SCREEN_NAME = "screenName";

	private static final String SECURITY_ANSWER = "securityAnswer";

	private static final String SECURITY_QUESTION = "securityQuestion";

	private static final String SPECIAL_CHARS =
		"!\\\\\\\"#$%&\\\\\'()*+,-./:;<>=?@[]^_`{}|~";

	private static final int STANDARD_TEXT_FIELD_LENGTH = 255;

	private static final String STATE = "state";

	private static final String ZIP = "zip";

	private static Log log = LogFactoryUtil.getLog(SignupValidatorImpl.class);

	@Reference
	DefaultScreenNameValidator defaultScreenNameValidator;

	@Reference
	PasswordPolicyLocalService passwordPolicyService;

}