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

package com.amf.registration.monitor.model.impl;

import com.liferay.portal.kernel.json.JSON;

/**
 * The extended model implementation for the UserEvent service. Represents a row
 * in the &quot;Monitor_UserEvent&quot; database table, with each column mapped
 * to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the <code>com.amf.registration.monitor.model.UserEvent</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class UserEventImpl extends UserEventBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a user event
	 * model instance should use the {@link
	 * com.amf.registration.monitor.model.UserEvent} interface instead.
	 */
	public UserEventImpl() {
	}

	@JSON
	@Override
	public void setScreenName(String screenName) {
		System.out.println("IN THE IMPL " + screenName);
		_screenName = screenName;
	}

	@Override
	public String getScreenName() {
		System.out.println("IN THE IMPL " + _screenName);
		return _screenName;
	}

	private String _screenName;

}