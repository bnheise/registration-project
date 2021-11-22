package com.amf.registration.search.util.validator;

import java.util.ArrayList;
import java.util.List;

import com.amf.registration.search.exception.ZipValidatorException;
import com.amf.registration.search.validator.ZipValidator;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, service = ZipValidator.class)
public class ZipValidatorImpl implements ZipValidator {

    @Override
    public void validate(String zip) throws ZipValidatorException {
        boolean valid = true;
        List<String> errors = new ArrayList<>();
        if (!Validator.isDigit(zip)) {
            valid &= false;
            errors.add("inlcudesNonDigits");
        }

        if (zip.length() != 5) {
            valid &= false;
            errors.add("notFiveDigits");
        }

        if (!valid) {
            String jsonErrors = JSONFactoryUtil.serialize(errors);
            throw new ZipValidatorException(jsonErrors);
        }
        
    }
    
}
