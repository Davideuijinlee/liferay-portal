/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.portal.workflow.metrics.rest.internal.graphql.mutation.v1_0;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.workflow.metrics.rest.dto.v1_0.SLA;
import com.liferay.portal.workflow.metrics.rest.resource.v1_0.SLAResource;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Rafael Praxedes
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setSLAResourceComponentServiceObjects(
		ComponentServiceObjects<SLAResource>
			slaResourceComponentServiceObjects) {

		_slaResourceComponentServiceObjects =
			slaResourceComponentServiceObjects;
	}

	@GraphQLField
	public SLA createProcessSLA(
			@GraphQLName("processId") Long processId,
			@GraphQLName("sla") SLA sla)
		throws Exception {

		return _applyComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.postProcessSLA(processId, sla));
	}

	@GraphQLField
	public Response createProcessSLABatch(
			@GraphQLName("processId") Long processId,
			@GraphQLName("sla") SLA sla,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.postProcessSLABatch(
				processId, sla, callbackURL, object));
	}

	@GraphQLField
	public boolean deleteSLA(@GraphQLName("slaId") Long slaId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.deleteSLA(slaId));

		return true;
	}

	@GraphQLField
	public Response deleteSLABatch(
			@GraphQLName("slaId") Long slaId,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.deleteSLABatch(
				slaId, callbackURL, object));
	}

	@GraphQLField
	public SLA updateSLA(
			@GraphQLName("slaId") Long slaId, @GraphQLName("sla") SLA sla)
		throws Exception {

		return _applyComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.putSLA(slaId, sla));
	}

	@GraphQLField
	public Response updateSLABatch(
			@GraphQLName("slaId") Long slaId, @GraphQLName("sla") SLA sla,
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_slaResourceComponentServiceObjects, this::_populateResourceContext,
			slaResource -> slaResource.putSLABatch(
				slaId, sla, callbackURL, object));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(SLAResource slaResource)
		throws Exception {

		slaResource.setContextAcceptLanguage(_acceptLanguage);
		slaResource.setContextCompany(_company);
		slaResource.setContextHttpServletRequest(_httpServletRequest);
		slaResource.setContextHttpServletResponse(_httpServletResponse);
		slaResource.setContextUriInfo(_uriInfo);
		slaResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<SLAResource>
		_slaResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}