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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.amf.registration.profile.service.http.GenreServiceSoap}.
 *
 * @author Brian Heise
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class GenreSoap implements Serializable {

	public static GenreSoap toSoapModel(Genre model) {
		GenreSoap soapModel = new GenreSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGenreId(model.getGenreId());
		soapModel.setGenreName(model.getGenreName());

		return soapModel;
	}

	public static GenreSoap[] toSoapModels(Genre[] models) {
		GenreSoap[] soapModels = new GenreSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GenreSoap[][] toSoapModels(Genre[][] models) {
		GenreSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GenreSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GenreSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GenreSoap[] toSoapModels(List<Genre> models) {
		List<GenreSoap> soapModels = new ArrayList<GenreSoap>(models.size());

		for (Genre model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GenreSoap[soapModels.size()]);
	}

	public GenreSoap() {
	}

	public long getPrimaryKey() {
		return _genreId;
	}

	public void setPrimaryKey(long pk) {
		setGenreId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGenreId() {
		return _genreId;
	}

	public void setGenreId(long genreId) {
		_genreId = genreId;
	}

	public String getGenreName() {
		return _genreName;
	}

	public void setGenreName(String genreName) {
		_genreName = genreName;
	}

	private String _uuid;
	private long _genreId;
	private String _genreName;

}