package com.amf.registration.search.validator;

import com.amf.registration.search.exception.ZipValidatorException;

public interface ZipValidator {
    public void validate(
			String zip)
		throws ZipValidatorException;
}
