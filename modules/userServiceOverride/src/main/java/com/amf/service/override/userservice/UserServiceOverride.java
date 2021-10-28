package com.amf.service.override.userservice;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.service.UserServiceWrapper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author brianheise
 */
@Component(immediate = true, property = {
}, service = ServiceWrapper.class)
public class UserServiceOverride extends UserServiceWrapper {

	public UserServiceOverride() {
		super(null);
	}

	private static Log log = LogFactoryUtil.getLog(UserServiceOverride.class);

	@Override
	public User addUser(
			long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName,
			String emailAddress, java.util.Locale locale, String firstName,
			String middleName, String lastName, long prefixId, long suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			String jobTitle, long[] groupIds, long[] organizationIds,
			long[] roleIds, long[] userGroupIds,
			java.util.List<com.liferay.portal.kernel.model.Address> addresses,
			java.util.List<com.liferay.portal.kernel.model.EmailAddress> emailAddresses,
			java.util.List<com.liferay.portal.kernel.model.Phone> phones,
			java.util.List<com.liferay.portal.kernel.model.Website> websites,
			java.util.List<com.liferay.announcements.kernel.model.AnnouncementsDelivery> announcementsDelivers,
			boolean sendEmail, ServiceContext serviceContext)
			throws com.liferay.portal.kernel.exception.PortalException {

		return super.addUser(
				companyId, autoPassword, password1, password2, autoScreenName,
				screenName, emailAddress, locale, firstName, middleName, lastName,
				prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
				jobTitle, groupIds, organizationIds, roleIds, userGroupIds,
				addresses, emailAddresses, phones, websites, announcementsDelivers,
				sendEmail, serviceContext);
	}

	@Reference(unbind = "-")
	private void serviceSetter(UserService userService) {
		setWrappedService(userService);
	}
}