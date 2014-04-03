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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.binding;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBeanBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class BeanBindingEndpointEditpart extends
		BindingableEndpointEditpart<YBeanBindingEndpoint> implements
		IBeanBindingEndpointEditpart {

	private static final Logger logger = LoggerFactory
			.getLogger(BeanBindingEndpointEditpart.class);
	private RefreshProvider refresh;

	@Override
	protected YBeanBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE.createYBeanBindingEndpoint();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case BindingPackage.YBEAN_BINDING_ENDPOINT__BEAN:
			refresh.refresh();
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {

		Object bean = getModel().getBean();

		String propertyPath = getModel().getPropertyPath();
		if (bean == null || propertyPath == null || propertyPath.equals("")) {
			logger.warn("Bean {} or propertyPath {} not valid!", bean,
					propertyPath);
			return null;
		}

		IObservableValue observable = null;
		if (propertyPath.contains("\\.")) {
			WritableValue value = new WritableValue(bean, bean.getClass());
			observable = BeansObservables.observeDetailValue(value,
					propertyPath, null);
		} else {
			observable = BeansObservables.observeValue(bean, propertyPath);
		}

		return (A) observable;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		this.refresh = refresh;
	}

	@Override
	protected void internalDispose() {
		refresh = null;

		super.internalDispose();
	}
}
