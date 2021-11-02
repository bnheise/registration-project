package com.amf.service.override.userservice;

import java.util.List;

import com.liferay.portal.kernel.change.tracking.CTAware;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import org.osgi.annotation.versioning.ProviderType;

@AccessControlled
@CTAware
@JSONWebService
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor = { PortalException.class, SystemException.class })
public interface UserServiceExt extends UserService {
    public boolean signup(long companyId, String password1,
            String password2, String screenName,
            String emailAddress, String firstName,
            String lastName, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
            List<Address> addresses,
            List<Phone> phones,
            ServiceContext serviceContext) throws PortalException;
}
