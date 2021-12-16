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

import com.amf.registration.profile.model.MovieInterest;
import com.amf.registration.profile.service.base.MovieInterestLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the movie interest local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.amf.registration.profile.service.MovieInterestLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Heise
 * @see MovieInterestLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.amf.registration.profile.model.MovieInterest",
	service = AopService.class
)
public class MovieInterestLocalServiceImpl
	extends MovieInterestLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.amf.registration.profile.service.MovieInterestLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.amf.registration.profile.service.MovieInterestLocalServiceUtil</code>.
	 */

	@Override
	public MovieInterest getMovieInterestByUserId(long userId, ServiceContext serviceContext) throws PortalException {
		MovieInterest movieInterest = movieInterestPersistence.fetchByUserId(userId);
		if (movieInterest == null) {
			movieInterest = addMovieInterest(movieInterestPersistence.create(CounterLocalServiceUtil.increment(MovieInterest.class.getName())));
			User user = UserLocalServiceUtil.getUser(userId);
			movieInterest.setCompanyId(user.getCompanyId());
			movieInterest.setCreateDate(new Date());
			movieInterest.setGroupId(serviceContext.getScopeGroupId());
			movieInterest.setModifiedDate(new Date());
			movieInterest.setUserId(user.getUserId());
			movieInterest.setUserName(user.getScreenName());
			movieInterest.setFavoriteGenreId(12);
			movieInterest.setFavoriteActor("");
			movieInterest.setFavoriteMovie("");
			movieInterest.setLeastFavMovie("");
			
			ResourceLocalServiceUtil.addResources(serviceContext.getCompanyId(), user.getGroupId(), userId,
				MovieInterest.class.getName(), movieInterest.getMovieInterestId(), true, true, true);
		}
		return movieInterest;
	}
}