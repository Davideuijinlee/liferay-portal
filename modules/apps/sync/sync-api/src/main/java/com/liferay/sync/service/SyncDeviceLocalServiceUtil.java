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

package com.liferay.sync.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for SyncDevice. This utility wraps
 * <code>com.liferay.sync.service.impl.SyncDeviceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SyncDeviceLocalService
 * @generated
 */
public class SyncDeviceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.sync.service.impl.SyncDeviceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.sync.model.SyncDevice addSyncDevice(
			long userId, String type, long buildNumber, String hostname,
			int featureSet)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSyncDevice(
			userId, type, buildNumber, hostname, featureSet);
	}

	/**
	 * Adds the sync device to the database. Also notifies the appropriate model listeners.
	 *
	 * @param syncDevice the sync device
	 * @return the sync device that was added
	 */
	public static com.liferay.sync.model.SyncDevice addSyncDevice(
		com.liferay.sync.model.SyncDevice syncDevice) {

		return getService().addSyncDevice(syncDevice);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sync device with the primary key. Does not add the sync device to the database.
	 *
	 * @param syncDeviceId the primary key for the new sync device
	 * @return the new sync device
	 */
	public static com.liferay.sync.model.SyncDevice createSyncDevice(
		long syncDeviceId) {

		return getService().createSyncDevice(syncDeviceId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sync device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param syncDeviceId the primary key of the sync device
	 * @return the sync device that was removed
	 * @throws PortalException if a sync device with the primary key could not be found
	 */
	public static com.liferay.sync.model.SyncDevice deleteSyncDevice(
			long syncDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSyncDevice(syncDeviceId);
	}

	/**
	 * Deletes the sync device from the database. Also notifies the appropriate model listeners.
	 *
	 * @param syncDevice the sync device
	 * @return the sync device that was removed
	 */
	public static com.liferay.sync.model.SyncDevice deleteSyncDevice(
		com.liferay.sync.model.SyncDevice syncDevice) {

		return getService().deleteSyncDevice(syncDevice);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sync.model.impl.SyncDeviceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sync.model.impl.SyncDeviceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.sync.model.SyncDevice fetchSyncDevice(
		long syncDeviceId) {

		return getService().fetchSyncDevice(syncDeviceId);
	}

	/**
	 * Returns the sync device with the matching UUID and company.
	 *
	 * @param uuid the sync device's UUID
	 * @param companyId the primary key of the company
	 * @return the matching sync device, or <code>null</code> if a matching sync device could not be found
	 */
	public static com.liferay.sync.model.SyncDevice
		fetchSyncDeviceByUuidAndCompanyId(String uuid, long companyId) {

		return getService().fetchSyncDeviceByUuidAndCompanyId(uuid, companyId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sync device with the primary key.
	 *
	 * @param syncDeviceId the primary key of the sync device
	 * @return the sync device
	 * @throws PortalException if a sync device with the primary key could not be found
	 */
	public static com.liferay.sync.model.SyncDevice getSyncDevice(
			long syncDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSyncDevice(syncDeviceId);
	}

	/**
	 * Returns the sync device with the matching UUID and company.
	 *
	 * @param uuid the sync device's UUID
	 * @param companyId the primary key of the company
	 * @return the matching sync device
	 * @throws PortalException if a matching sync device could not be found
	 */
	public static com.liferay.sync.model.SyncDevice
			getSyncDeviceByUuidAndCompanyId(String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSyncDeviceByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of all the sync devices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.sync.model.impl.SyncDeviceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sync devices
	 * @param end the upper bound of the range of sync devices (not inclusive)
	 * @return the range of sync devices
	 */
	public static java.util.List<com.liferay.sync.model.SyncDevice>
		getSyncDevices(int start, int end) {

		return getService().getSyncDevices(start, end);
	}

	public static java.util.List<com.liferay.sync.model.SyncDevice>
			getSyncDevices(
				long userId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSyncDevices(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sync devices.
	 *
	 * @return the number of sync devices
	 */
	public static int getSyncDevicesCount() {
		return getService().getSyncDevicesCount();
	}

	public static java.util.List<com.liferay.sync.model.SyncDevice> search(
		long companyId, String keywords, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.liferay.sync.model.SyncDevice> orderByComparator) {

		return getService().search(
			companyId, keywords, start, end, orderByComparator);
	}

	public static void updateStatus(long syncDeviceId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().updateStatus(syncDeviceId, status);
	}

	public static com.liferay.sync.model.SyncDevice updateSyncDevice(
			long syncDeviceId, String type, long buildNumber, int featureSet,
			String hostname, int status)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSyncDevice(
			syncDeviceId, type, buildNumber, featureSet, hostname, status);
	}

	/**
	 * Updates the sync device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param syncDevice the sync device
	 * @return the sync device that was updated
	 */
	public static com.liferay.sync.model.SyncDevice updateSyncDevice(
		com.liferay.sync.model.SyncDevice syncDevice) {

		return getService().updateSyncDevice(syncDevice);
	}

	public static SyncDeviceLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<SyncDeviceLocalService, SyncDeviceLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SyncDeviceLocalService.class);

		ServiceTracker<SyncDeviceLocalService, SyncDeviceLocalService>
			serviceTracker =
				new ServiceTracker
					<SyncDeviceLocalService, SyncDeviceLocalService>(
						bundle.getBundleContext(), SyncDeviceLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}