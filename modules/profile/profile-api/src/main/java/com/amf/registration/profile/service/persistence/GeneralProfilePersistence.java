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

package com.amf.registration.profile.service.persistence;

import com.amf.registration.profile.exception.NoSuchGeneralProfileException;
import com.amf.registration.profile.model.GeneralProfile;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the general profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Heise
 * @see GeneralProfileUtil
 * @generated
 */
@ProviderType
public interface GeneralProfilePersistence
	extends BasePersistence<GeneralProfile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GeneralProfileUtil} to access the general profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the general profiles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid(String uuid);

	/**
	 * Returns a range of all the general profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @return the range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the general profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the general profiles where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first general profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the first general profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns the last general profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the last general profile in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns the general profiles before and after the current general profile in the ordered set where uuid = &#63;.
	 *
	 * @param generalProfileId the primary key of the current general profile
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general profile
	 * @throws NoSuchGeneralProfileException if a general profile with the primary key could not be found
	 */
	public GeneralProfile[] findByUuid_PrevAndNext(
			long generalProfileId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Removes all the general profiles where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of general profiles where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching general profiles
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the general profile where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGeneralProfileException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the general profile where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the general profile where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the general profile where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the general profile that was removed
	 */
	public GeneralProfile removeByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the number of general profiles where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching general profiles
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the general profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the general profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @return the range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the general profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the general profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general profiles
	 */
	public java.util.List<GeneralProfile> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first general profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the first general profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns the last general profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the last general profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns the general profiles before and after the current general profile in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param generalProfileId the primary key of the current general profile
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general profile
	 * @throws NoSuchGeneralProfileException if a general profile with the primary key could not be found
	 */
	public GeneralProfile[] findByUuid_C_PrevAndNext(
			long generalProfileId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
				orderByComparator)
		throws NoSuchGeneralProfileException;

	/**
	 * Removes all the general profiles where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of general profiles where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching general profiles
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the general profile where userId = &#63; or throws a <code>NoSuchGeneralProfileException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching general profile
	 * @throws NoSuchGeneralProfileException if a matching general profile could not be found
	 */
	public GeneralProfile findByUserId(long userId)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the general profile where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUserId(long userId);

	/**
	 * Returns the general profile where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching general profile, or <code>null</code> if a matching general profile could not be found
	 */
	public GeneralProfile fetchByUserId(long userId, boolean useFinderCache);

	/**
	 * Removes the general profile where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the general profile that was removed
	 */
	public GeneralProfile removeByUserId(long userId)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the number of general profiles where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching general profiles
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the general profile in the entity cache if it is enabled.
	 *
	 * @param generalProfile the general profile
	 */
	public void cacheResult(GeneralProfile generalProfile);

	/**
	 * Caches the general profiles in the entity cache if it is enabled.
	 *
	 * @param generalProfiles the general profiles
	 */
	public void cacheResult(java.util.List<GeneralProfile> generalProfiles);

	/**
	 * Creates a new general profile with the primary key. Does not add the general profile to the database.
	 *
	 * @param generalProfileId the primary key for the new general profile
	 * @return the new general profile
	 */
	public GeneralProfile create(long generalProfileId);

	/**
	 * Removes the general profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalProfileId the primary key of the general profile
	 * @return the general profile that was removed
	 * @throws NoSuchGeneralProfileException if a general profile with the primary key could not be found
	 */
	public GeneralProfile remove(long generalProfileId)
		throws NoSuchGeneralProfileException;

	public GeneralProfile updateImpl(GeneralProfile generalProfile);

	/**
	 * Returns the general profile with the primary key or throws a <code>NoSuchGeneralProfileException</code> if it could not be found.
	 *
	 * @param generalProfileId the primary key of the general profile
	 * @return the general profile
	 * @throws NoSuchGeneralProfileException if a general profile with the primary key could not be found
	 */
	public GeneralProfile findByPrimaryKey(long generalProfileId)
		throws NoSuchGeneralProfileException;

	/**
	 * Returns the general profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalProfileId the primary key of the general profile
	 * @return the general profile, or <code>null</code> if a general profile with the primary key could not be found
	 */
	public GeneralProfile fetchByPrimaryKey(long generalProfileId);

	/**
	 * Returns all the general profiles.
	 *
	 * @return the general profiles
	 */
	public java.util.List<GeneralProfile> findAll();

	/**
	 * Returns a range of all the general profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @return the range of general profiles
	 */
	public java.util.List<GeneralProfile> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the general profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of general profiles
	 */
	public java.util.List<GeneralProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the general profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general profiles
	 * @param end the upper bound of the range of general profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of general profiles
	 */
	public java.util.List<GeneralProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralProfile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the general profiles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of general profiles.
	 *
	 * @return the number of general profiles
	 */
	public int countAll();

}