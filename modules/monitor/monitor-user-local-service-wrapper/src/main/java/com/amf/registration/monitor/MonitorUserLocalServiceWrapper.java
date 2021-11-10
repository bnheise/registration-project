package com.amf.registration.monitor;

import com.amf.registration.monitor.service.UserEventLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author brianheise
 */
@Component(immediate = true, property = {
}, service = ServiceWrapper.class)
public class MonitorUserLocalServiceWrapper extends UserLocalServiceWrapper {

	public MonitorUserLocalServiceWrapper() {
		super(null);
	}

	@Override
	public User addUser(long creatorUserId, long companyId, boolean autoPassword,
			String password1, String password2, boolean autoScreenName,
			String screenName, String emailAddress, java.util.Locale locale,
			String firstName, String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth, int birthdayDay,
			int birthdayYear, String jobTitle, long[] groupIds,
			long[] organizationIds, long[] roleIds, long[] userGroupIds,
			boolean sendEmail, ServiceContext serviceContext) throws PortalException {

		User user = super.addUser(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName,
				screenName, emailAddress, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);
		serviceContext.setUserId(user.getUserId());
		userEventLocalService.addUserEvent(serviceContext);
		return user;
	}

	@Reference
	private UserEventLocalService userEventLocalService;
}