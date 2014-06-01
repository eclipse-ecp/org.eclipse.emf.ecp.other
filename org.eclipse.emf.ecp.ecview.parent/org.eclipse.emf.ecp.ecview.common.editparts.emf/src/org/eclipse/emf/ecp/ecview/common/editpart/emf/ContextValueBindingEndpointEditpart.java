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
import org.eclipse.emf.ecp.ecview.common.binding.observables.ContextObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IContextValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create a context observables.
 */
public class ContextValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YContextValueBindingEndpoint> implements
		IContextValueBindingEndpointEditpart {
	private static final Logger logger = LoggerFactory
			.getLogger(ContextValueBindingEndpointEditpart.class);

	@Override
	protected YContextValueBindingEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYContextValueBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		YView yView = null;
		try {
			yView = getModel().getBinding().getBindingSet().getView();
		} catch (NullPointerException e) {
			logger.error("{}", e);
			throw new RuntimeException("View must not be null!", e);
		}

		if (getModel().getUrlString() == null
				|| getModel().getUrlString().equals("")) {
			logger.error("URLString must not be null!");
			return null;
		}

		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);
		return (A) ContextObservables.observeValue(viewEditpart.getContext(),
				URI.create(getModel().getUrlString()));
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
