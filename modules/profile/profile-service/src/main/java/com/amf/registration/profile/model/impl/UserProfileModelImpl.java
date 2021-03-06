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

package com.amf.registration.profile.model.impl;

import com.amf.registration.profile.model.UserProfile;
import com.amf.registration.profile.model.UserProfileModel;
import com.amf.registration.profile.model.UserProfileSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the UserProfile service. Represents a row in the &quot;UserProfile_UserProfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserProfileModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserProfileImpl}.
 * </p>
 *
 * @author Brian Heise
 * @see UserProfileImpl
 * @generated
 */
@JSON(strict = true)
public class UserProfileModelImpl
	extends BaseModelImpl<UserProfile> implements UserProfileModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user profile model instance should use the <code>UserProfile</code> interface instead.
	 */
	public static final String TABLE_NAME = "UserProfile_UserProfile";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"userId", Types.BIGINT},
		{"firstName", Types.VARCHAR}, {"lastName", Types.VARCHAR},
		{"screenName", Types.VARCHAR}, {"male", Types.BOOLEAN},
		{"birthYear", Types.INTEGER}, {"birthMonth", Types.INTEGER},
		{"birthDay", Types.INTEGER}, {"aboutMe", Types.VARCHAR},
		{"favoriteQuotes", Types.VARCHAR}, {"favoriteMovie", Types.VARCHAR},
		{"favoriteGenre", Types.VARCHAR}, {"favoriteGenreId", Types.BIGINT},
		{"leastFavMovie", Types.VARCHAR}, {"favoriteActor", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("screenName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("male", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("birthYear", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("birthMonth", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("birthDay", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("aboutMe", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("favoriteQuotes", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("favoriteMovie", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("favoriteGenre", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("favoriteGenreId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("leastFavMovie", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("favoriteActor", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table UserProfile_UserProfile (uuid_ VARCHAR(75) null,userId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,screenName VARCHAR(75) null,male BOOLEAN,birthYear INTEGER,birthMonth INTEGER,birthDay INTEGER,aboutMe VARCHAR(75) null,favoriteQuotes VARCHAR(75) null,favoriteMovie VARCHAR(75) null,favoriteGenre VARCHAR(75) null,favoriteGenreId LONG,leastFavMovie VARCHAR(75) null,favoriteActor VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table UserProfile_UserProfile";

	public static final String ORDER_BY_JPQL =
		" ORDER BY userProfile.lastName ASC, userProfile.firstName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY UserProfile_UserProfile.lastName ASC, UserProfile_UserProfile.firstName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long LASTNAME_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FIRSTNAME_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static UserProfile toModel(UserProfileSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserProfile model = new UserProfileImpl();

		model.setUuid(soapModel.getUuid());
		model.setUserId(soapModel.getUserId());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setScreenName(soapModel.getScreenName());
		model.setMale(soapModel.isMale());
		model.setBirthYear(soapModel.getBirthYear());
		model.setBirthMonth(soapModel.getBirthMonth());
		model.setBirthDay(soapModel.getBirthDay());
		model.setAboutMe(soapModel.getAboutMe());
		model.setFavoriteQuotes(soapModel.getFavoriteQuotes());
		model.setFavoriteMovie(soapModel.getFavoriteMovie());
		model.setFavoriteGenre(soapModel.getFavoriteGenre());
		model.setFavoriteGenreId(soapModel.getFavoriteGenreId());
		model.setLeastFavMovie(soapModel.getLeastFavMovie());
		model.setFavoriteActor(soapModel.getFavoriteActor());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<UserProfile> toModels(UserProfileSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserProfile> models = new ArrayList<UserProfile>(
			soapModels.length);

		for (UserProfileSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserProfileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserProfile.class;
	}

	@Override
	public String getModelClassName() {
		return UserProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserProfile, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserProfile, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserProfile, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((UserProfile)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserProfile, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserProfile, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserProfile)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserProfile, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserProfile, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, UserProfile>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			UserProfile.class.getClassLoader(), UserProfile.class,
			ModelWrapper.class);

		try {
			Constructor<UserProfile> constructor =
				(Constructor<UserProfile>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<UserProfile, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserProfile, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserProfile, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserProfile, Object>>();
		Map<String, BiConsumer<UserProfile, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserProfile, ?>>();

		attributeGetterFunctions.put("uuid", UserProfile::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<UserProfile, String>)UserProfile::setUuid);
		attributeGetterFunctions.put("userId", UserProfile::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserProfile, Long>)UserProfile::setUserId);
		attributeGetterFunctions.put("firstName", UserProfile::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName",
			(BiConsumer<UserProfile, String>)UserProfile::setFirstName);
		attributeGetterFunctions.put("lastName", UserProfile::getLastName);
		attributeSetterBiConsumers.put(
			"lastName",
			(BiConsumer<UserProfile, String>)UserProfile::setLastName);
		attributeGetterFunctions.put("screenName", UserProfile::getScreenName);
		attributeSetterBiConsumers.put(
			"screenName",
			(BiConsumer<UserProfile, String>)UserProfile::setScreenName);
		attributeGetterFunctions.put("male", UserProfile::getMale);
		attributeSetterBiConsumers.put(
			"male", (BiConsumer<UserProfile, Boolean>)UserProfile::setMale);
		attributeGetterFunctions.put("birthYear", UserProfile::getBirthYear);
		attributeSetterBiConsumers.put(
			"birthYear",
			(BiConsumer<UserProfile, Integer>)UserProfile::setBirthYear);
		attributeGetterFunctions.put("birthMonth", UserProfile::getBirthMonth);
		attributeSetterBiConsumers.put(
			"birthMonth",
			(BiConsumer<UserProfile, Integer>)UserProfile::setBirthMonth);
		attributeGetterFunctions.put("birthDay", UserProfile::getBirthDay);
		attributeSetterBiConsumers.put(
			"birthDay",
			(BiConsumer<UserProfile, Integer>)UserProfile::setBirthDay);
		attributeGetterFunctions.put("aboutMe", UserProfile::getAboutMe);
		attributeSetterBiConsumers.put(
			"aboutMe",
			(BiConsumer<UserProfile, String>)UserProfile::setAboutMe);
		attributeGetterFunctions.put(
			"favoriteQuotes", UserProfile::getFavoriteQuotes);
		attributeSetterBiConsumers.put(
			"favoriteQuotes",
			(BiConsumer<UserProfile, String>)UserProfile::setFavoriteQuotes);
		attributeGetterFunctions.put(
			"favoriteMovie", UserProfile::getFavoriteMovie);
		attributeSetterBiConsumers.put(
			"favoriteMovie",
			(BiConsumer<UserProfile, String>)UserProfile::setFavoriteMovie);
		attributeGetterFunctions.put(
			"favoriteGenre", UserProfile::getFavoriteGenre);
		attributeSetterBiConsumers.put(
			"favoriteGenre",
			(BiConsumer<UserProfile, String>)UserProfile::setFavoriteGenre);
		attributeGetterFunctions.put(
			"favoriteGenreId", UserProfile::getFavoriteGenreId);
		attributeSetterBiConsumers.put(
			"favoriteGenreId",
			(BiConsumer<UserProfile, Long>)UserProfile::setFavoriteGenreId);
		attributeGetterFunctions.put(
			"leastFavMovie", UserProfile::getLeastFavMovie);
		attributeSetterBiConsumers.put(
			"leastFavMovie",
			(BiConsumer<UserProfile, String>)UserProfile::setLeastFavMovie);
		attributeGetterFunctions.put(
			"favoriteActor", UserProfile::getFavoriteActor);
		attributeSetterBiConsumers.put(
			"favoriteActor",
			(BiConsumer<UserProfile, String>)UserProfile::setFavoriteActor);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastName = lastName;
	}

	@JSON
	@Override
	public String getScreenName() {
		if (_screenName == null) {
			return "";
		}
		else {
			return _screenName;
		}
	}

	@Override
	public void setScreenName(String screenName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_screenName = screenName;
	}

	@JSON
	@Override
	public boolean getMale() {
		return _male;
	}

	@JSON
	@Override
	public boolean isMale() {
		return _male;
	}

	@Override
	public void setMale(boolean male) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_male = male;
	}

	@JSON
	@Override
	public int getBirthYear() {
		return _birthYear;
	}

	@Override
	public void setBirthYear(int birthYear) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthYear = birthYear;
	}

	@JSON
	@Override
	public int getBirthMonth() {
		return _birthMonth;
	}

	@Override
	public void setBirthMonth(int birthMonth) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthMonth = birthMonth;
	}

	@JSON
	@Override
	public int getBirthDay() {
		return _birthDay;
	}

	@Override
	public void setBirthDay(int birthDay) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthDay = birthDay;
	}

	@JSON
	@Override
	public String getAboutMe() {
		if (_aboutMe == null) {
			return "";
		}
		else {
			return _aboutMe;
		}
	}

	@Override
	public void setAboutMe(String aboutMe) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_aboutMe = aboutMe;
	}

	@JSON
	@Override
	public String getFavoriteQuotes() {
		if (_favoriteQuotes == null) {
			return "";
		}
		else {
			return _favoriteQuotes;
		}
	}

	@Override
	public void setFavoriteQuotes(String favoriteQuotes) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_favoriteQuotes = favoriteQuotes;
	}

	@JSON
	@Override
	public String getFavoriteMovie() {
		if (_favoriteMovie == null) {
			return "";
		}
		else {
			return _favoriteMovie;
		}
	}

	@Override
	public void setFavoriteMovie(String favoriteMovie) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_favoriteMovie = favoriteMovie;
	}

	@JSON
	@Override
	public String getFavoriteGenre() {
		if (_favoriteGenre == null) {
			return "";
		}
		else {
			return _favoriteGenre;
		}
	}

	@Override
	public void setFavoriteGenre(String favoriteGenre) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_favoriteGenre = favoriteGenre;
	}

	@JSON
	@Override
	public long getFavoriteGenreId() {
		return _favoriteGenreId;
	}

	@Override
	public void setFavoriteGenreId(long favoriteGenreId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_favoriteGenreId = favoriteGenreId;
	}

	@JSON
	@Override
	public String getLeastFavMovie() {
		if (_leastFavMovie == null) {
			return "";
		}
		else {
			return _leastFavMovie;
		}
	}

	@Override
	public void setLeastFavMovie(String leastFavMovie) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_leastFavMovie = leastFavMovie;
	}

	@JSON
	@Override
	public String getFavoriteActor() {
		if (_favoriteActor == null) {
			return "";
		}
		else {
			return _favoriteActor;
		}
	}

	@Override
	public void setFavoriteActor(String favoriteActor) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_favoriteActor = favoriteActor;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, UserProfile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserProfile toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserProfile>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserProfileImpl userProfileImpl = new UserProfileImpl();

		userProfileImpl.setUuid(getUuid());
		userProfileImpl.setUserId(getUserId());
		userProfileImpl.setFirstName(getFirstName());
		userProfileImpl.setLastName(getLastName());
		userProfileImpl.setScreenName(getScreenName());
		userProfileImpl.setMale(isMale());
		userProfileImpl.setBirthYear(getBirthYear());
		userProfileImpl.setBirthMonth(getBirthMonth());
		userProfileImpl.setBirthDay(getBirthDay());
		userProfileImpl.setAboutMe(getAboutMe());
		userProfileImpl.setFavoriteQuotes(getFavoriteQuotes());
		userProfileImpl.setFavoriteMovie(getFavoriteMovie());
		userProfileImpl.setFavoriteGenre(getFavoriteGenre());
		userProfileImpl.setFavoriteGenreId(getFavoriteGenreId());
		userProfileImpl.setLeastFavMovie(getLeastFavMovie());
		userProfileImpl.setFavoriteActor(getFavoriteActor());

		userProfileImpl.resetOriginalValues();

		return userProfileImpl;
	}

	@Override
	public int compareTo(UserProfile userProfile) {
		int value = 0;

		value = getLastName().compareTo(userProfile.getLastName());

		if (value != 0) {
			return value;
		}

		value = getFirstName().compareTo(userProfile.getFirstName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserProfile)) {
			return false;
		}

		UserProfile userProfile = (UserProfile)object;

		long primaryKey = userProfile.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<UserProfile> toCacheModel() {
		UserProfileCacheModel userProfileCacheModel =
			new UserProfileCacheModel();

		userProfileCacheModel.uuid = getUuid();

		String uuid = userProfileCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			userProfileCacheModel.uuid = null;
		}

		userProfileCacheModel.userId = getUserId();

		userProfileCacheModel.firstName = getFirstName();

		String firstName = userProfileCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			userProfileCacheModel.firstName = null;
		}

		userProfileCacheModel.lastName = getLastName();

		String lastName = userProfileCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			userProfileCacheModel.lastName = null;
		}

		userProfileCacheModel.screenName = getScreenName();

		String screenName = userProfileCacheModel.screenName;

		if ((screenName != null) && (screenName.length() == 0)) {
			userProfileCacheModel.screenName = null;
		}

		userProfileCacheModel.male = isMale();

		userProfileCacheModel.birthYear = getBirthYear();

		userProfileCacheModel.birthMonth = getBirthMonth();

		userProfileCacheModel.birthDay = getBirthDay();

		userProfileCacheModel.aboutMe = getAboutMe();

		String aboutMe = userProfileCacheModel.aboutMe;

		if ((aboutMe != null) && (aboutMe.length() == 0)) {
			userProfileCacheModel.aboutMe = null;
		}

		userProfileCacheModel.favoriteQuotes = getFavoriteQuotes();

		String favoriteQuotes = userProfileCacheModel.favoriteQuotes;

		if ((favoriteQuotes != null) && (favoriteQuotes.length() == 0)) {
			userProfileCacheModel.favoriteQuotes = null;
		}

		userProfileCacheModel.favoriteMovie = getFavoriteMovie();

		String favoriteMovie = userProfileCacheModel.favoriteMovie;

		if ((favoriteMovie != null) && (favoriteMovie.length() == 0)) {
			userProfileCacheModel.favoriteMovie = null;
		}

		userProfileCacheModel.favoriteGenre = getFavoriteGenre();

		String favoriteGenre = userProfileCacheModel.favoriteGenre;

		if ((favoriteGenre != null) && (favoriteGenre.length() == 0)) {
			userProfileCacheModel.favoriteGenre = null;
		}

		userProfileCacheModel.favoriteGenreId = getFavoriteGenreId();

		userProfileCacheModel.leastFavMovie = getLeastFavMovie();

		String leastFavMovie = userProfileCacheModel.leastFavMovie;

		if ((leastFavMovie != null) && (leastFavMovie.length() == 0)) {
			userProfileCacheModel.leastFavMovie = null;
		}

		userProfileCacheModel.favoriteActor = getFavoriteActor();

		String favoriteActor = userProfileCacheModel.favoriteActor;

		if ((favoriteActor != null) && (favoriteActor.length() == 0)) {
			userProfileCacheModel.favoriteActor = null;
		}

		return userProfileCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserProfile, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserProfile, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserProfile, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((UserProfile)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<UserProfile, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<UserProfile, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserProfile, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((UserProfile)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserProfile>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _userId;
	private String _firstName;
	private String _lastName;
	private String _screenName;
	private boolean _male;
	private int _birthYear;
	private int _birthMonth;
	private int _birthDay;
	private String _aboutMe;
	private String _favoriteQuotes;
	private String _favoriteMovie;
	private String _favoriteGenre;
	private long _favoriteGenreId;
	private String _leastFavMovie;
	private String _favoriteActor;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<UserProfile, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((UserProfile)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("firstName", _firstName);
		_columnOriginalValues.put("lastName", _lastName);
		_columnOriginalValues.put("screenName", _screenName);
		_columnOriginalValues.put("male", _male);
		_columnOriginalValues.put("birthYear", _birthYear);
		_columnOriginalValues.put("birthMonth", _birthMonth);
		_columnOriginalValues.put("birthDay", _birthDay);
		_columnOriginalValues.put("aboutMe", _aboutMe);
		_columnOriginalValues.put("favoriteQuotes", _favoriteQuotes);
		_columnOriginalValues.put("favoriteMovie", _favoriteMovie);
		_columnOriginalValues.put("favoriteGenre", _favoriteGenre);
		_columnOriginalValues.put("favoriteGenreId", _favoriteGenreId);
		_columnOriginalValues.put("leastFavMovie", _leastFavMovie);
		_columnOriginalValues.put("favoriteActor", _favoriteActor);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("userId", 2L);

		columnBitmasks.put("firstName", 4L);

		columnBitmasks.put("lastName", 8L);

		columnBitmasks.put("screenName", 16L);

		columnBitmasks.put("male", 32L);

		columnBitmasks.put("birthYear", 64L);

		columnBitmasks.put("birthMonth", 128L);

		columnBitmasks.put("birthDay", 256L);

		columnBitmasks.put("aboutMe", 512L);

		columnBitmasks.put("favoriteQuotes", 1024L);

		columnBitmasks.put("favoriteMovie", 2048L);

		columnBitmasks.put("favoriteGenre", 4096L);

		columnBitmasks.put("favoriteGenreId", 8192L);

		columnBitmasks.put("leastFavMovie", 16384L);

		columnBitmasks.put("favoriteActor", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private UserProfile _escapedModel;

}