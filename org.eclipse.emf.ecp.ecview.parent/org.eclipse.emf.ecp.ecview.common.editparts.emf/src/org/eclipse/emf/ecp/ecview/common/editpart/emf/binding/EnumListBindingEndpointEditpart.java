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

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IEnumListBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class EnumListBindingEndpointEditpart extends
		BindableListEndpointEditpart<YEnumListBindingEndpoint> implements
		IEnumListBindingEndpointEditpart {

	private static final Logger logger = LoggerFactory
			.getLogger(EnumListBindingEndpointEditpart.class);
	private RefreshProvider refresh;

	@Override
	protected YEnumListBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE.createYEnumListBindingEndpoint();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case BindingPackage.YENUM_LIST_BINDING_ENDPOINT__ENUM:
			refresh.refresh();
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableList> A getObservable() {
		if (!getModel().getEnum().isEnum()) {
			logger.error(getModel().getEnum() + " is not an enum!");
			throw new IllegalArgumentException(getModel().getEnum()
					+ " is not an enum!");
		}

		Class<Enum<?>> enumClass = (Class<Enum<?>>) getModel().getEnum();
		WritableList observable = new WritableList();
		for (Enum<?> xEnum : enumClass.getEnumConstants()) {
			observable.add(xEnum);
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
