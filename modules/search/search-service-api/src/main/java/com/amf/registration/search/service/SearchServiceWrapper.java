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

package com.amf.registration.search.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SearchService}.
 *
 * @author Brian Wing Shun Chan
 * @see SearchService
 * @generated
 */
public class SearchServiceWrapper
	implements SearchService, ServiceWrapper<SearchService> {

	public SearchServiceWrapper(SearchService searchService) {
		_searchService = searchService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _searchService.getOSGiServiceIdentifier();
	}

	@Override
	public SearchService getWrappedService() {
		return _searchService;
	}

	@Override
	public void setWrappedService(SearchService searchService) {
		_searchService = searchService;
	}

	private SearchService _searchService;

}