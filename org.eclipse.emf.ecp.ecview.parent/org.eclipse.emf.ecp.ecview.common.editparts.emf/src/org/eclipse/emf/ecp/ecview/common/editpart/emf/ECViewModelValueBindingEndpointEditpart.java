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

import java.util.List;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.IECViewModelValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.databinding.emf.model.ECViewModelBindable;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class ECViewModelValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YECViewModelValueBindingEndpoint>
		implements IECViewModelValueBindingEndpointEditpart {

	@Override
	protected YECViewModelValueBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE
				.createYECViewModelValueBindingEndpoint();
	}

	@SuppressWarnings({ "unchecked", "restriction" })
	@Override
	public <A extends IObservableValue> A getObservable() {
		YECViewModelValueBindingEndpoint model = getModel();
		if (model.getFeatures().size() > 0) {
			List<EStructuralFeature> features = model.getFeatures();
			return (A) ECViewModelBindable.observeValue(model.getElement(),
					FeaturePath.fromList(features
							.toArray(new EStructuralFeature[features.size()])));
		} else if (model.getPropertyPath() != null
				&& !model.getPropertyPath().equals("")) {
			return (A) ECViewModelBindable.observeValue(model.getElement(),
					model.getPropertyPath(), model.getType(),
					model.getEmfNsURI());
		}

		throw new IllegalArgumentException("Not a valid binding model " + model);
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
