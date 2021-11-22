package com.amf.registration.search.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class ZipValidatorException extends PortalException {
    public ZipValidatorException() {
	}

	public ZipValidatorException(String msg) {
		super(msg);
	}

	public ZipValidatorException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public ZipValidatorException(Throwable throwable) {
		super(throwable);
	}
}
