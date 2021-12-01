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

package com.amf.registration.profile.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the UserProfile service. Represents a row in the &quot;UserProfile_UserProfile&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Heise
 * @see UserProfileModel
 * @generated
 */
@ImplementationClassName(
	"com.amf.registration.profile.model.impl.UserProfileImpl"
)
@ProviderType
public interface UserProfile extends PersistedModel, UserProfileModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.amf.registration.profile.model.impl.UserProfileImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UserProfile, Long> USER_ID_ACCESSOR =
		new Accessor<UserProfile, Long>() {

			@Override
			public Long get(UserProfile userProfile) {
				return userProfile.getUserId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserProfile> getTypeClass() {
				return UserProfile.class;
			}

		};

}