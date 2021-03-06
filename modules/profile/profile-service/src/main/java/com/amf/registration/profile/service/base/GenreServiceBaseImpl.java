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

package com.amf.registration.profile.service.base;

import com.amf.registration.profile.model.Genre;
import com.amf.registration.profile.service.GenreService;
import com.amf.registration.profile.service.GenreServiceUtil;
import com.amf.registration.profile.service.persistence.GeneralProfilePersistence;
import com.amf.registration.profile.service.persistence.GenrePersistence;
import com.amf.registration.profile.service.persistence.MovieInterestPersistence;
import com.amf.registration.profile.service.persistence.UserProfilePersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the genre remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.amf.registration.profile.service.impl.GenreServiceImpl}.
 * </p>
 *
 * @author Brian Heise
 * @see com.amf.registration.profile.service.impl.GenreServiceImpl
 * @generated
 */
public abstract class GenreServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, GenreService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>GenreService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>GenreServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			GenreService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		genreService = (GenreService)aopProxy;

		_setServiceUtilService(genreService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return GenreService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Genre.class;
	}

	protected String getModelClassName() {
		return Genre.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = genrePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(GenreService genreService) {
		try {
			Field field = GenreServiceUtil.class.getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, genreService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected GeneralProfilePersistence generalProfilePersistence;

	@Reference
	protected com.amf.registration.profile.service.GenreLocalService
		genreLocalService;

	protected GenreService genreService;

	@Reference
	protected GenrePersistence genrePersistence;

	@Reference
	protected MovieInterestPersistence movieInterestPersistence;

	@Reference
	protected UserProfilePersistence userProfilePersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}