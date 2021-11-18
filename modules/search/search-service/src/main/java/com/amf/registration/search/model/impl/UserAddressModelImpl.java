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

package com.amf.registration.search.model.impl;

import com.amf.registration.search.model.UserAddress;
import com.amf.registration.search.model.UserAddressModel;
import com.amf.registration.search.model.UserAddressSoap;
import com.amf.registration.search.service.persistence.UserAddressPK;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
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
 * The base model implementation for the UserAddress service. Represents a row in the &quot;RegistrationSearch_UserAddress&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserAddressModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAddressImpl}.
 * </p>
 *
 * @author Brian Heise
 * @see UserAddressImpl
 * @generated
 */
@JSON(strict = true)
public class UserAddressModelImpl
	extends BaseModelImpl<UserAddress> implements UserAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user address model instance should use the <code>UserAddress</code> interface instead.
	 */
	public static final String TABLE_NAME = "RegistrationSearch_UserAddress";

	public static final Object[][] TABLE_COLUMNS = {
		{"userId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"screenName", Types.VARCHAR},
		{"emailAddress", Types.VARCHAR}, {"zip", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("screenName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("zip", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table RegistrationSearch_UserAddress (userId LONG not null,companyId LONG not null,name VARCHAR(75) null,screenName VARCHAR(75) null,emailAddress VARCHAR(75) null,zip VARCHAR(75) null,primary key (userId, companyId))";

	public static final String TABLE_SQL_DROP =
		"drop table RegistrationSearch_UserAddress";

	public static final String ORDER_BY_JPQL = " ORDER BY userAddress.zip DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY RegistrationSearch_UserAddress.zip DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ZIP_COLUMN_BITMASK = 1L;

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
	public static UserAddress toModel(UserAddressSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserAddress model = new UserAddressImpl();

		model.setUserId(soapModel.getUserId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setName(soapModel.getName());
		model.setScreenName(soapModel.getScreenName());
		model.setEmailAddress(soapModel.getEmailAddress());
		model.setZip(soapModel.getZip());

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
	public static List<UserAddress> toModels(UserAddressSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserAddress> models = new ArrayList<UserAddress>(
			soapModels.length);

		for (UserAddressSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserAddressModelImpl() {
	}

	@Override
	public UserAddressPK getPrimaryKey() {
		return new UserAddressPK(_userId, _companyId);
	}

	@Override
	public void setPrimaryKey(UserAddressPK primaryKey) {
		setUserId(primaryKey.userId);
		setCompanyId(primaryKey.companyId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UserAddressPK(_userId, _companyId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UserAddressPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return UserAddress.class;
	}

	@Override
	public String getModelClassName() {
		return UserAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserAddress, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserAddress, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserAddress, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((UserAddress)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserAddress, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserAddress, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserAddress)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserAddress, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserAddress, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, UserAddress>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			UserAddress.class.getClassLoader(), UserAddress.class,
			ModelWrapper.class);

		try {
			Constructor<UserAddress> constructor =
				(Constructor<UserAddress>)proxyClass.getConstructor(
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

	private static final Map<String, Function<UserAddress, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserAddress, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserAddress, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserAddress, Object>>();
		Map<String, BiConsumer<UserAddress, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserAddress, ?>>();

		attributeGetterFunctions.put("userId", UserAddress::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserAddress, Long>)UserAddress::setUserId);
		attributeGetterFunctions.put("companyId", UserAddress::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<UserAddress, Long>)UserAddress::setCompanyId);
		attributeGetterFunctions.put("name", UserAddress::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<UserAddress, String>)UserAddress::setName);
		attributeGetterFunctions.put("screenName", UserAddress::getScreenName);
		attributeSetterBiConsumers.put(
			"screenName",
			(BiConsumer<UserAddress, String>)UserAddress::setScreenName);
		attributeGetterFunctions.put(
			"emailAddress", UserAddress::getEmailAddress);
		attributeSetterBiConsumers.put(
			"emailAddress",
			(BiConsumer<UserAddress, String>)UserAddress::setEmailAddress);
		attributeGetterFunctions.put("zip", UserAddress::getZip);
		attributeSetterBiConsumers.put(
			"zip", (BiConsumer<UserAddress, String>)UserAddress::setZip);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
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
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
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
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public String getZip() {
		if (_zip == null) {
			return "";
		}
		else {
			return _zip;
		}
	}

	@Override
	public void setZip(String zip) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_zip = zip;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalZip() {
		return getColumnOriginalValue("zip");
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
	public UserAddress toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserAddress>
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
		UserAddressImpl userAddressImpl = new UserAddressImpl();

		userAddressImpl.setUserId(getUserId());
		userAddressImpl.setCompanyId(getCompanyId());
		userAddressImpl.setName(getName());
		userAddressImpl.setScreenName(getScreenName());
		userAddressImpl.setEmailAddress(getEmailAddress());
		userAddressImpl.setZip(getZip());

		userAddressImpl.resetOriginalValues();

		return userAddressImpl;
	}

	@Override
	public int compareTo(UserAddress userAddress) {
		int value = 0;

		value = getZip().compareTo(userAddress.getZip());

		value = value * -1;

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

		if (!(object instanceof UserAddress)) {
			return false;
		}

		UserAddress userAddress = (UserAddress)object;

		UserAddressPK primaryKey = userAddress.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
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
	public CacheModel<UserAddress> toCacheModel() {
		UserAddressCacheModel userAddressCacheModel =
			new UserAddressCacheModel();

		userAddressCacheModel.userAddressPK = getPrimaryKey();

		userAddressCacheModel.userId = getUserId();

		userAddressCacheModel.companyId = getCompanyId();

		userAddressCacheModel.name = getName();

		String name = userAddressCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			userAddressCacheModel.name = null;
		}

		userAddressCacheModel.screenName = getScreenName();

		String screenName = userAddressCacheModel.screenName;

		if ((screenName != null) && (screenName.length() == 0)) {
			userAddressCacheModel.screenName = null;
		}

		userAddressCacheModel.emailAddress = getEmailAddress();

		String emailAddress = userAddressCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			userAddressCacheModel.emailAddress = null;
		}

		userAddressCacheModel.zip = getZip();

		String zip = userAddressCacheModel.zip;

		if ((zip != null) && (zip.length() == 0)) {
			userAddressCacheModel.zip = null;
		}

		return userAddressCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserAddress, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserAddress, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserAddress, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((UserAddress)this));
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
		Map<String, Function<UserAddress, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<UserAddress, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserAddress, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((UserAddress)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserAddress>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private long _userId;
	private long _companyId;
	private String _name;
	private String _screenName;
	private String _emailAddress;
	private String _zip;

	public <T> T getColumnValue(String columnName) {
		Function<UserAddress, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((UserAddress)this);
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

		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("screenName", _screenName);
		_columnOriginalValues.put("emailAddress", _emailAddress);
		_columnOriginalValues.put("zip", _zip);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("userId", 1L);

		columnBitmasks.put("companyId", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("screenName", 8L);

		columnBitmasks.put("emailAddress", 16L);

		columnBitmasks.put("zip", 32L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private UserAddress _escapedModel;

}