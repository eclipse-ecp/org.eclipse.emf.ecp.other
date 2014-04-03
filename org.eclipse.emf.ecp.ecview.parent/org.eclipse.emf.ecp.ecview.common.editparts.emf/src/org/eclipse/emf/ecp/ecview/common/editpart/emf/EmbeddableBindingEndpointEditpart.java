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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindingableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public abstract class EmbeddableBindingEndpointEditpart<M extends YEmbeddableBindingEndpoint>
		extends BindingableEndpointEditpart<M> implements
		IEmbeddableBindingEndpointEditpart {

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		IEmbeddableEditpart embeddableEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(getModel().getElement());

		IWidgetPresentation<?> presentation = embeddableEditpart
				.getPresentation();
		return (A) presentation.getObservableValue(getModel());
	}

}
