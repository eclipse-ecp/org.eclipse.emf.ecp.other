/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import java.net.URI;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.binding.observables.ContextObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IBeanSlotBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create a context observable based on the given bean slot.
 */
public class BeanSlotBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YBeanSlotBindingEndpoint> implements
		IBeanSlotBindingEndpointEditpart {
	private static final Logger logger = LoggerFactory
			.getLogger(BeanSlotBindingEndpointEditpart.class);

	@Override
	protected YBeanSlotBindingEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYBeanSlotBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		if (getModel().getAttributePath() == null
				|| getModel().getAttributePath().equals("")) {
			logger.error("Attribute path must not be null!");
			return null;
		}

		YBeanSlot yBeanSlot = getModel().getBeanSlot();
		if (yBeanSlot == null) {
			logger.error("BeanSlot must not be null!");
			return null;
		}

		// view or viewset
		Object container = getModel().getBeanSlot().eContainer();
		if (container instanceof YView) {
			URI targetURI = getURI(yBeanSlot);
			IViewEditpart viewEditpart = DelegatingEditPartManager
					.getInstance().getEditpart(container);
			return (A) ContextObservables.observeValue(
					viewEditpart.getContext(), targetURI);
		} else if (container instanceof YViewSet) {
			URI targetURI = getURI(yBeanSlot);
			IViewSetEditpart viewSetEditpart = DelegatingEditPartManager
					.getInstance().getEditpart(container);
			return (A) ContextObservables.observeValue(
					viewSetEditpart.getContext(), targetURI);
		}

		throw new IllegalArgumentException(container
				+ " is not a valid super type!");
	}

	/**
	 * Returns the URI for the given bean slot. The URI may be used with the
	 * {@link URIHelper} to access the bean slot.
	 * 
	 * @param yBeanSlot
	 * @return
	 */
	private URI getURI(YBeanSlot yBeanSlot) {
		EObject container = yBeanSlot.eContainer();
		URI uri = null;
		if (container instanceof YView) {
			uri = URIHelper.view().bean(yBeanSlot.getName())
					.fragment(getModel().getAttributePath()).toURI();
		} else if (container instanceof YViewSet) {
			uri = URIHelper.viewset().bean(yBeanSlot.getName())
					.fragment(getModel().getAttributePath()).toURI();
		} else {
			throw new RuntimeException(container + " is not a valid type!");
		}

		return uri;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
