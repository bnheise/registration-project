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

package com.amf.registration.newsletter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IssueLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see IssueLocalService
 * @generated
 */
public class IssueLocalServiceWrapper
	implements IssueLocalService, ServiceWrapper<IssueLocalService> {

	public IssueLocalServiceWrapper(IssueLocalService issueLocalService) {
		_issueLocalService = issueLocalService;
	}

	/**
	 * Adds the issue to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IssueLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issue the issue
	 * @return the issue that was added
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue addIssue(
		com.amf.registration.newsletter.model.Issue issue) {

		return _issueLocalService.addIssue(issue);
	}

	/**
	 * Creates a new issue with the primary key. Does not add the issue to the database.
	 *
	 * @param issueNumber the primary key for the new issue
	 * @return the new issue
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue createIssue(
		long issueNumber) {

		return _issueLocalService.createIssue(issueNumber);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _issueLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the issue from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IssueLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issue the issue
	 * @return the issue that was removed
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue deleteIssue(
		com.amf.registration.newsletter.model.Issue issue) {

		return _issueLocalService.deleteIssue(issue);
	}

	/**
	 * Deletes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IssueLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issueNumber the primary key of the issue
	 * @return the issue that was removed
	 * @throws PortalException if a issue with the primary key could not be found
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue deleteIssue(
			long issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _issueLocalService.deleteIssue(issueNumber);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _issueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _issueLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _issueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.IssueModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _issueLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.IssueModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _issueLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _issueLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _issueLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.amf.registration.newsletter.model.Issue fetchIssue(
		long issueNumber) {

		return _issueLocalService.fetchIssue(issueNumber);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _issueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _issueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the issue with the primary key.
	 *
	 * @param issueNumber the primary key of the issue
	 * @return the issue
	 * @throws PortalException if a issue with the primary key could not be found
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue getIssue(
			long issueNumber)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _issueLocalService.getIssue(issueNumber);
	}

	/**
	 * Returns a range of all the issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.amf.registration.newsletter.model.impl.IssueModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of issues
	 * @param end the upper bound of the range of issues (not inclusive)
	 * @return the range of issues
	 */
	@Override
	public java.util.List<com.amf.registration.newsletter.model.Issue>
		getIssues(int start, int end) {

		return _issueLocalService.getIssues(start, end);
	}

	/**
	 * Returns the number of issues.
	 *
	 * @return the number of issues
	 */
	@Override
	public int getIssuesCount() {
		return _issueLocalService.getIssuesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _issueLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _issueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the issue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect IssueLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issue the issue
	 * @return the issue that was updated
	 */
	@Override
	public com.amf.registration.newsletter.model.Issue updateIssue(
		com.amf.registration.newsletter.model.Issue issue) {

		return _issueLocalService.updateIssue(issue);
	}

	@Override
	public IssueLocalService getWrappedService() {
		return _issueLocalService;
	}

	@Override
	public void setWrappedService(IssueLocalService issueLocalService) {
		_issueLocalService = issueLocalService;
	}

	private IssueLocalService _issueLocalService;

}