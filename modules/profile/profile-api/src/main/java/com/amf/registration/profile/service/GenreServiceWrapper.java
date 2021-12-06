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

package com.amf.registration.profile.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GenreService}.
 *
 * @author Brian Heise
 * @see GenreService
 * @generated
 */
public class GenreServiceWrapper
	implements GenreService, ServiceWrapper<GenreService> {

	public GenreServiceWrapper(GenreService genreService) {
		_genreService = genreService;
	}

	@Override
	public java.util.List<com.amf.registration.profile.model.Genre>
		getAllGenres() {

		return _genreService.getAllGenres();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _genreService.getOSGiServiceIdentifier();
	}

	@Override
	public GenreService getWrappedService() {
		return _genreService;
	}

	@Override
	public void setWrappedService(GenreService genreService) {
		_genreService = genreService;
	}

	private GenreService _genreService;

}