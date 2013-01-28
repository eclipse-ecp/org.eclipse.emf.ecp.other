/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.databinding.beans;

import java.net.URI;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.binding.BaseBindingDelegate;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

public class PojoBindingDelegate extends BaseBindingDelegate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IViewContext context, URI bindingURI) {
		// thats the default
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(IViewContext context, URI bindingURI) {
		return observeValue(Realm.getDefault(), context, bindingURI);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(Realm realm, IViewContext context,
			URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(context);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		// observe master
		//
		IObservableValue slotObservable = PojoObservables.observeValue(realm,
				slot, ISlot.PROP_VALUE);

		// normalize bean fragment
		String beanFragment = AccessibleScope
				.removeSlotValueFragmentToken(scope.getBeanFragment());

		// observe detail
		//
		IObservableValue observableValue = PojoObservables.observeDetailValue(
				slotObservable, beanFragment, null);

		return observableValue;
	}

}
