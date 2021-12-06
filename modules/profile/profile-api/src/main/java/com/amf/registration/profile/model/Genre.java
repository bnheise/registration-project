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
 * The extended model interface for the Genre service. Represents a row in the &quot;UserProfile_Genre&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Heise
 * @see GenreModel
 * @generated
 */
@ImplementationClassName("com.amf.registration.profile.model.impl.GenreImpl")
@ProviderType
public interface Genre extends GenreModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.amf.registration.profile.model.impl.GenreImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Genre, Long> GENRE_ID_ACCESSOR =
		new Accessor<Genre, Long>() {

			@Override
			public Long get(Genre genre) {
				return genre.getGenreId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Genre> getTypeClass() {
				return Genre.class;
			}

		};

}