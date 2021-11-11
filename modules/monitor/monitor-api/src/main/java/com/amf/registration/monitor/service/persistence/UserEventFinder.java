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

package com.amf.registration.monitor.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public interface UserEventFinder {

	public java.util.List<java.util.HashMap<String, Object>> findAll(
		int start, int end);

	public long countAll();

	public java.util.List<java.util.HashMap<String, Object>> findType(
		int start, int end, String type);

	public long countType(String type);

	public java.util.List<java.util.HashMap<String, Object>> findAllForUser(
		int start, int end, long userId);

	public long countAllForUser(long userId);

	public java.util.List<java.util.HashMap<String, Object>> findTypeForUser(
		int start, int end, long userId, String type);

	public long countTypeForUser(long userId, String type);

}