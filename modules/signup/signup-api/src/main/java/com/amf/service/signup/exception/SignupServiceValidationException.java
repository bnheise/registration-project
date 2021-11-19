package com.amf.service.signup.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class SignupServiceValidationException extends PortalException {

	public SignupServiceValidationException() {
	}

	public SignupServiceValidationException(List<String> errors) {
		super("{" + String.join(",", errors) + "}");

		this.errors = errors;
	}

	public SignupServiceValidationException(String msg) {
		super(msg);
	}

	public SignupServiceValidationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public SignupServiceValidationException(Throwable throwable) {
		super(throwable);
	}

	public List<String> getErrors() {
		return errors;
	}

	private List<String> errors;

}