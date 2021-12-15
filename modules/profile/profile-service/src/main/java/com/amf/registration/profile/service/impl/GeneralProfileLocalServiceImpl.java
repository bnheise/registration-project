/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.amf.registration.profile.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.amf.registration.profile.internal.security.permission.resource.CustomActionKeys;
import com.amf.registration.profile.model.GeneralProfile;
import com.amf.registration.profile.service.base.GeneralProfileLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the general profile local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.amf.registration.profile.service.GeneralProfileLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Heise
 * @see GeneralProfileLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.amf.registration.profile.model.GeneralProfile", service = AopService.class)
public class GeneralProfileLocalServiceImpl
		extends GeneralProfileLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.amf.registration.profile.service.GeneralProfileLocalService</code>
	 * via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.amf.registration.profile.service.GeneralProfileLocalServiceUtil</
	 * code>.
	 */

	@Override
	public GeneralProfile getGeneralProfileByUserId(long userId, ServiceContext serviceContext) throws PortalException {
		GeneralProfile generalProfile = generalProfilePersistence.fetchByUserId(userId);
		if (generalProfile == null) {
			generalProfile = generalProfilePersistence
					.create(CounterLocalServiceUtil.increment(GeneralProfile.class.getName()));
			User user = UserLocalServiceUtil.getUser(userId);
			generalProfile.setCompanyId(user.getCompanyId());
			generalProfile.setCreateDate(new Date());
			generalProfile.setGroupId(serviceContext.getScopeGroupId());
			generalProfile.setModifiedDate(new Date());
			generalProfile.setUserId(user.getUserId());
			generalProfile.setUserName(user.getScreenName());
			generalProfile.setAboutMe("");
			generalProfile.setFavoriteQuotes("");
			addGeneralProfile(generalProfile);
			ResourceLocalServiceUtil.addResources(serviceContext.getCompanyId(), user.getGroupId(),
					userId, GeneralProfile.class.getName(), generalProfile.getGeneralProfileId(), true, true, true);
			
			Map<Long, String[]> roleIdsToActionIds = new HashMap<>();
			long guestRoleId = RoleLocalServiceUtil.getRole(serviceContext.getCompanyId(), "Guest").getRoleId();
			long userRoleId = RoleLocalServiceUtil.getRole(serviceContext.getCompanyId(), "User").getRoleId();
			String[] actionKeys = new String[] {CustomActionKeys.VIEW_BASIC_INFO, CustomActionKeys.VIEW_FIRST_NAME, CustomActionKeys.VIEW_LAST_NAME, CustomActionKeys.VIEW_MALE, CustomActionKeys.VIEW_BIRTHDAY};
			roleIdsToActionIds.put(guestRoleId, actionKeys);
			roleIdsToActionIds.put(userRoleId, actionKeys);

			ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), User.class.getName(), 4, String.valueOf(userId), roleIdsToActionIds);
		}
		return generalProfile;
	}
}