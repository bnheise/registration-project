package com.amf.service.override.userservice.exception;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;

public class UserServiceValidationException extends PortalException {
    public UserServiceValidationException() {
    }

    public UserServiceValidationException(String msg) {
        super(msg);
    }

    public UserServiceValidationException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public UserServiceValidationException(Throwable throwable) {
        super(throwable);
    }

    public UserServiceValidationException(List<String> errors) {
        super("{\"errors\": [" + String.join(",", errors) + "]}");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

    private List<String> errors;
}
