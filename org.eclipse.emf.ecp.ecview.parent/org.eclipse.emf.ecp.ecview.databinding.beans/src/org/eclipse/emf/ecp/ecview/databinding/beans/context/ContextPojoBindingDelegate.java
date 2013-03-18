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
package org.eclipse.emf.ecp.ecview.databinding.beans.context;

import java.net.URI;

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.binding.context.ContextBindingDelegate;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

public class ContextPojoBindingDelegate extends ContextBindingDelegate {

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

		String beanFragment = scope.getBeanFragment();

		// if value-property was references inside the slot, then return the
		// observable
		if (beanFragment.equals(ISlot.PROP_VALUE)) {
			return PojoObservables.observeValue(realm, slot, ISlot.PROP_VALUE);
		} else {
			// normalize bean fragment
			beanFragment = AccessibleScope
					.removeSlotValueFragmentToken(beanFragment);
			if (beanFragment.equals("")) {
				// if no bean fragment was specified, then the bean slot is
				// addressed and it can not be observed since it is stable.
				return null;
			} else {
				// observe master
				//
				IObservableValue slotObservable = PojoObservables.observeValue(
						realm, slot, ISlot.PROP_VALUE);

				// observe detail
				//
				// from PojoObservables.observeDetailValue...
				return PojoProperties.value(slot.getValueType(), beanFragment,
						null).observeDetail(slotObservable);
			}
		}
	}

}
