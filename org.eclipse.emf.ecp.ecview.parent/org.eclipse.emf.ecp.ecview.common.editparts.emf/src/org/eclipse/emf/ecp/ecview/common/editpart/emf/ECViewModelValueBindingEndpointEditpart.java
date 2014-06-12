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
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.IECViewModelValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;

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

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		YECViewModelValueBindingEndpoint model = getModel();

		if (model.getFeatures().size() == 1) {
			return (A) EMFProperties.value(model.getFeatures().get(0)).observe(
					model.getElement());
		} else if (model.getFeatures().size() > 1) {
			FeaturePath path = FeaturePath
					.fromList(model.getFeatures().toArray(
							new EStructuralFeature[model.getFeatures().size()]));
			return (A) EMFProperties.value(path).observe(getModel().getElement());
		} else {
			throw new IllegalStateException("Features need to be available");
		}
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
