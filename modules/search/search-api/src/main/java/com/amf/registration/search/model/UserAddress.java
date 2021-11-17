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

package com.amf.registration.search.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the UserAddress service. Represents a row in the &quot;RegistrationSearch_UserAddress&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UserAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.amf.registration.search.model.impl.UserAddressImpl"
)
@ProviderType
public interface UserAddress extends PersistedModel, UserAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.amf.registration.search.model.impl.UserAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UserAddress, Long> USER_ID_ACCESSOR =
		new Accessor<UserAddress, Long>() {

			@Override
			public Long get(UserAddress userAddress) {
				return userAddress.getUserId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserAddress> getTypeClass() {
				return UserAddress.class;
			}

		};
	public static final Accessor<UserAddress, Long> COPMANY_ID_ACCESSOR =
		new Accessor<UserAddress, Long>() {

			@Override
			public Long get(UserAddress userAddress) {
				return userAddress.getCopmanyId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserAddress> getTypeClass() {
				return UserAddress.class;
			}

		};

}