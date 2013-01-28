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

import java.lang.reflect.Method;
import java.net.URI;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.binding.BaseBindingDelegate;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.BeanScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

public class BeanBindingDelegate extends BaseBindingDelegate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IViewContext context, URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		BeanScope beanScope = scope.getBeanScope();
		if (beanScope == null) {
			return false;
		}
		ISlot slot = beanScope.accessBeanSlot(context);
		if (slot == null || !hasPropertyChangeSupport(slot.getValueType())) {
			return false;
		}

		return true;
	}

	/**
	 * Returns true, if the bean has property change support.
	 * 
	 * @param valueType
	 * @return
	 */
	protected boolean hasPropertyChangeSupport(Class<?> valueType) {
		for (Method method : valueType.getDeclaredMethods()) {
			if (method.getName().equals("addPropertyChangeListener")) {
				return true;
			}
		}
		return false;
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
			return BeansObservables.observeValue(realm, slot, ISlot.PROP_VALUE);
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
				IObservableValue slotObservable = BeansObservables
						.observeValue(realm, slot, ISlot.PROP_VALUE);

				// observe detail
				//
				return BeansObservables.observeDetailValue(slotObservable,
						slot.getValueType(), beanFragment, null);
			}
		}
	}
}
