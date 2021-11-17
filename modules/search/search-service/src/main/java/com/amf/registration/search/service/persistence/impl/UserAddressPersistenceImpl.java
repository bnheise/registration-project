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

package com.amf.registration.search.service.persistence.impl;

import com.amf.registration.search.exception.NoSuchUserAddressException;
import com.amf.registration.search.model.UserAddress;
import com.amf.registration.search.model.impl.UserAddressImpl;
import com.amf.registration.search.model.impl.UserAddressModelImpl;
import com.amf.registration.search.service.persistence.UserAddressPK;
import com.amf.registration.search.service.persistence.UserAddressPersistence;
import com.amf.registration.search.service.persistence.impl.constants.RegistrationSearchPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the user address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UserAddressPersistence.class)
public class UserAddressPersistenceImpl
	extends BasePersistenceImpl<UserAddress> implements UserAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UserAddressUtil</code> to access the user address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UserAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByZip;
	private FinderPath _finderPathWithoutPaginationFindByZip;
	private FinderPath _finderPathCountByZip;

	/**
	 * Returns all the user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the matching user addresses
	 */
	@Override
	public List<UserAddress> findByZip(String zip) {
		return findByZip(zip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @return the range of matching user addresses
	 */
	@Override
	public List<UserAddress> findByZip(String zip, int start, int end) {
		return findByZip(zip, start, end, null);
	}

	/**
	 * Returns an ordered range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user addresses
	 */
	@Override
	public List<UserAddress> findByZip(
		String zip, int start, int end,
		OrderByComparator<UserAddress> orderByComparator) {

		return findByZip(zip, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user addresses where zip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param zip the zip
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user addresses
	 */
	@Override
	public List<UserAddress> findByZip(
		String zip, int start, int end,
		OrderByComparator<UserAddress> orderByComparator,
		boolean useFinderCache) {

		zip = Objects.toString(zip, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByZip;
				finderArgs = new Object[] {zip};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByZip;
			finderArgs = new Object[] {zip, start, end, orderByComparator};
		}

		List<UserAddress> list = null;

		if (useFinderCache) {
			list = (List<UserAddress>)dummyFinderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserAddress userAddress : list) {
					if (!zip.equals(userAddress.getZip())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_USERADDRESS_WHERE);

			boolean bindZip = false;

			if (zip.isEmpty()) {
				sb.append(_FINDER_COLUMN_ZIP_ZIP_3);
			}
			else {
				bindZip = true;

				sb.append(_FINDER_COLUMN_ZIP_ZIP_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UserAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindZip) {
					queryPos.add(zip);
				}

				list = (List<UserAddress>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					dummyFinderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	@Override
	public UserAddress findByZip_First(
			String zip, OrderByComparator<UserAddress> orderByComparator)
		throws NoSuchUserAddressException {

		UserAddress userAddress = fetchByZip_First(zip, orderByComparator);

		if (userAddress != null) {
			return userAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("zip=");
		sb.append(zip);

		sb.append("}");

		throw new NoSuchUserAddressException(sb.toString());
	}

	/**
	 * Returns the first user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user address, or <code>null</code> if a matching user address could not be found
	 */
	@Override
	public UserAddress fetchByZip_First(
		String zip, OrderByComparator<UserAddress> orderByComparator) {

		List<UserAddress> list = findByZip(zip, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address
	 * @throws NoSuchUserAddressException if a matching user address could not be found
	 */
	@Override
	public UserAddress findByZip_Last(
			String zip, OrderByComparator<UserAddress> orderByComparator)
		throws NoSuchUserAddressException {

		UserAddress userAddress = fetchByZip_Last(zip, orderByComparator);

		if (userAddress != null) {
			return userAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("zip=");
		sb.append(zip);

		sb.append("}");

		throw new NoSuchUserAddressException(sb.toString());
	}

	/**
	 * Returns the last user address in the ordered set where zip = &#63;.
	 *
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user address, or <code>null</code> if a matching user address could not be found
	 */
	@Override
	public UserAddress fetchByZip_Last(
		String zip, OrderByComparator<UserAddress> orderByComparator) {

		int count = countByZip(zip);

		if (count == 0) {
			return null;
		}

		List<UserAddress> list = findByZip(
			zip, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the user addresses before and after the current user address in the ordered set where zip = &#63;.
	 *
	 * @param userAddressPK the primary key of the current user address
	 * @param zip the zip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress[] findByZip_PrevAndNext(
			UserAddressPK userAddressPK, String zip,
			OrderByComparator<UserAddress> orderByComparator)
		throws NoSuchUserAddressException {

		zip = Objects.toString(zip, "");

		UserAddress userAddress = findByPrimaryKey(userAddressPK);

		Session session = null;

		try {
			session = openSession();

			UserAddress[] array = new UserAddressImpl[3];

			array[0] = getByZip_PrevAndNext(
				session, userAddress, zip, orderByComparator, true);

			array[1] = userAddress;

			array[2] = getByZip_PrevAndNext(
				session, userAddress, zip, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserAddress getByZip_PrevAndNext(
		Session session, UserAddress userAddress, String zip,
		OrderByComparator<UserAddress> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_USERADDRESS_WHERE);

		boolean bindZip = false;

		if (zip.isEmpty()) {
			sb.append(_FINDER_COLUMN_ZIP_ZIP_3);
		}
		else {
			bindZip = true;

			sb.append(_FINDER_COLUMN_ZIP_ZIP_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(UserAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindZip) {
			queryPos.add(zip);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(userAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UserAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user addresses where zip = &#63; from the database.
	 *
	 * @param zip the zip
	 */
	@Override
	public void removeByZip(String zip) {
		for (UserAddress userAddress :
				findByZip(zip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(userAddress);
		}
	}

	/**
	 * Returns the number of user addresses where zip = &#63;.
	 *
	 * @param zip the zip
	 * @return the number of matching user addresses
	 */
	@Override
	public int countByZip(String zip) {
		zip = Objects.toString(zip, "");

		FinderPath finderPath = _finderPathCountByZip;

		Object[] finderArgs = new Object[] {zip};

		Long count = (Long)dummyFinderCache.getResult(
			finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_USERADDRESS_WHERE);

			boolean bindZip = false;

			if (zip.isEmpty()) {
				sb.append(_FINDER_COLUMN_ZIP_ZIP_3);
			}
			else {
				bindZip = true;

				sb.append(_FINDER_COLUMN_ZIP_ZIP_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindZip) {
					queryPos.add(zip);
				}

				count = (Long)query.uniqueResult();

				dummyFinderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ZIP_ZIP_2 =
		"userAddress.zip = ?";

	private static final String _FINDER_COLUMN_ZIP_ZIP_3 =
		"(userAddress.zip IS NULL OR userAddress.zip = '')";

	public UserAddressPersistenceImpl() {
		setModelClass(UserAddress.class);

		setModelImplClass(UserAddressImpl.class);
		setModelPKClass(UserAddressPK.class);
	}

	/**
	 * Caches the user address in the entity cache if it is enabled.
	 *
	 * @param userAddress the user address
	 */
	@Override
	public void cacheResult(UserAddress userAddress) {
		dummyEntityCache.putResult(
			UserAddressImpl.class, userAddress.getPrimaryKey(), userAddress);
	}

	/**
	 * Caches the user addresses in the entity cache if it is enabled.
	 *
	 * @param userAddresses the user addresses
	 */
	@Override
	public void cacheResult(List<UserAddress> userAddresses) {
		for (UserAddress userAddress : userAddresses) {
			if (dummyEntityCache.getResult(
					UserAddressImpl.class, userAddress.getPrimaryKey()) ==
						null) {

				cacheResult(userAddress);
			}
		}
	}

	/**
	 * Clears the cache for all user addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>com.liferay.portal.kernel.dao.orm.FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		dummyEntityCache.clearCache(UserAddressImpl.class);

		dummyFinderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		dummyFinderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		dummyFinderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>com.liferay.portal.kernel.dao.orm.FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserAddress userAddress) {
		dummyEntityCache.removeResult(UserAddressImpl.class, userAddress);
	}

	@Override
	public void clearCache(List<UserAddress> userAddresses) {
		for (UserAddress userAddress : userAddresses) {
			dummyEntityCache.removeResult(UserAddressImpl.class, userAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		dummyFinderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		dummyFinderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		dummyFinderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			dummyEntityCache.removeResult(UserAddressImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new user address with the primary key. Does not add the user address to the database.
	 *
	 * @param userAddressPK the primary key for the new user address
	 * @return the new user address
	 */
	@Override
	public UserAddress create(UserAddressPK userAddressPK) {
		UserAddress userAddress = new UserAddressImpl();

		userAddress.setNew(true);
		userAddress.setPrimaryKey(userAddressPK);

		return userAddress;
	}

	/**
	 * Removes the user address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address that was removed
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress remove(UserAddressPK userAddressPK)
		throws NoSuchUserAddressException {

		return remove((Serializable)userAddressPK);
	}

	/**
	 * Removes the user address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user address
	 * @return the user address that was removed
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress remove(Serializable primaryKey)
		throws NoSuchUserAddressException {

		Session session = null;

		try {
			session = openSession();

			UserAddress userAddress = (UserAddress)session.get(
				UserAddressImpl.class, primaryKey);

			if (userAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(userAddress);
		}
		catch (NoSuchUserAddressException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserAddress removeImpl(UserAddress userAddress) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userAddress)) {
				userAddress = (UserAddress)session.get(
					UserAddressImpl.class, userAddress.getPrimaryKeyObj());
			}

			if (userAddress != null) {
				session.delete(userAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (userAddress != null) {
			clearCache(userAddress);
		}

		return userAddress;
	}

	@Override
	public UserAddress updateImpl(UserAddress userAddress) {
		boolean isNew = userAddress.isNew();

		if (!(userAddress instanceof UserAddressModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(userAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(userAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in userAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UserAddress implementation " +
					userAddress.getClass());
		}

		UserAddressModelImpl userAddressModelImpl =
			(UserAddressModelImpl)userAddress;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(userAddress);
			}
			else {
				userAddress = (UserAddress)session.merge(userAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		dummyEntityCache.putResult(
			UserAddressImpl.class, userAddressModelImpl, false, true);

		if (isNew) {
			userAddress.setNew(false);
		}

		userAddress.resetOriginalValues();

		return userAddress;
	}

	/**
	 * Returns the user address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user address
	 * @return the user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserAddressException {

		UserAddress userAddress = fetchByPrimaryKey(primaryKey);

		if (userAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return userAddress;
	}

	/**
	 * Returns the user address with the primary key or throws a <code>NoSuchUserAddressException</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address
	 * @throws NoSuchUserAddressException if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress findByPrimaryKey(UserAddressPK userAddressPK)
		throws NoSuchUserAddressException {

		return findByPrimaryKey((Serializable)userAddressPK);
	}

	/**
	 * Returns the user address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userAddressPK the primary key of the user address
	 * @return the user address, or <code>null</code> if a user address with the primary key could not be found
	 */
	@Override
	public UserAddress fetchByPrimaryKey(UserAddressPK userAddressPK) {
		return fetchByPrimaryKey((Serializable)userAddressPK);
	}

	/**
	 * Returns all the user addresses.
	 *
	 * @return the user addresses
	 */
	@Override
	public List<UserAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @return the range of user addresses
	 */
	@Override
	public List<UserAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user addresses
	 */
	@Override
	public List<UserAddress> findAll(
		int start, int end, OrderByComparator<UserAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user addresses
	 * @param end the upper bound of the range of user addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user addresses
	 */
	@Override
	public List<UserAddress> findAll(
		int start, int end, OrderByComparator<UserAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<UserAddress> list = null;

		if (useFinderCache) {
			list = (List<UserAddress>)dummyFinderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_USERADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_USERADDRESS;

				sql = sql.concat(UserAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UserAddress>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					dummyFinderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserAddress userAddress : findAll()) {
			remove(userAddress);
		}
	}

	/**
	 * Returns the number of user addresses.
	 *
	 * @return the number of user addresses
	 */
	@Override
	public int countAll() {
		Long count = (Long)dummyFinderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_USERADDRESS);

				count = (Long)query.uniqueResult();

				dummyFinderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return dummyEntityCache;
	}

	@Override
	protected String getPKDBName() {
		return "userAddressPK";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_USERADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UserAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user address persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new UserAddressModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", UserAddress.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByZip = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByZip",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"zip"}, true);

		_finderPathWithoutPaginationFindByZip = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByZip",
			new String[] {String.class.getName()}, new String[] {"zip"}, true);

		_finderPathCountByZip = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByZip",
			new String[] {String.class.getName()}, new String[] {"zip"}, false);
	}

	@Deactivate
	public void deactivate() {
		dummyEntityCache.removeCache(UserAddressImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = RegistrationSearchPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = RegistrationSearchPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = RegistrationSearchPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	private static final String _SQL_SELECT_USERADDRESS =
		"SELECT userAddress FROM UserAddress userAddress";

	private static final String _SQL_SELECT_USERADDRESS_WHERE =
		"SELECT userAddress FROM UserAddress userAddress WHERE ";

	private static final String _SQL_COUNT_USERADDRESS =
		"SELECT COUNT(userAddress) FROM UserAddress userAddress";

	private static final String _SQL_COUNT_USERADDRESS_WHERE =
		"SELECT COUNT(userAddress) FROM UserAddress userAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "userAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UserAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UserAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UserAddressPersistenceImpl.class);

	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"userId", "copmanyId"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class UserAddressModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			UserAddressModelImpl userAddressModelImpl =
				(UserAddressModelImpl)baseModel;

			long columnBitmask = userAddressModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(userAddressModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						userAddressModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(userAddressModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			UserAddressModelImpl userAddressModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = userAddressModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = userAddressModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= UserAddressModelImpl.getColumnBitmask(
				"zip");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}