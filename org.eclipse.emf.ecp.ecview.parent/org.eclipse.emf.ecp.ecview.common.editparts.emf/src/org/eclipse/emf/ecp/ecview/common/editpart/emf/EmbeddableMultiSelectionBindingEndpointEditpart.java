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

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableMultiSelectionEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableListEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;

/**
 * Responsible to create an observable.
 */
public class EmbeddableMultiSelectionBindingEndpointEditpart extends
		BindableListEndpointEditpart<YEmbeddableMultiSelectionEndpoint>
		implements IEmbeddableMultiSelectionEndpointEditpart {

	@Override
	protected YEmbeddableMultiSelectionEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE
				.createYEmbeddableMultiSelectionEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableList> A getObservable() {
		IEmbeddableEditpart embeddableEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(getModel().getElement());

		IWidgetPresentation<?> presentation = embeddableEditpart
				.getPresentation();
		return presentation != null ? (A) presentation
				.getObservableValue(getModel()) : null;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
