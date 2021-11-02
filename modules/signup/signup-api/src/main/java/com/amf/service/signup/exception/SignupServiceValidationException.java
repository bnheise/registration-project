package com.amf.service.signup.exception;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;

public class SignupServiceValidationException extends PortalException {
    public SignupServiceValidationException() {
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

    public SignupServiceValidationException(List<String> errors) {
        super("{" + String.join(",", errors) + "}");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    private List<String> errors;
}
