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
package org.eclipse.emf.ecp.ecview.databinding.beans.context;

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.net.URI;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.IBeanRegistry;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.binding.observables.ContextBindingDelegate;
import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.BeanScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

public class ContextBeanBindingDelegate extends ContextBindingDelegate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(IBeanRegistry registry, URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		BeanScope beanScope = scope.getBeanScope();
		if (beanScope == null) {
			return false;
		}
		ISlot slot = beanScope.accessBeanSlot(registry);
		// TODO: if attribute.path == 1 --> use bean binding since slot is
		// observable
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
		@SuppressWarnings("unused")
		Method method = null;
		try {
			try {
				method = valueType.getMethod("addPropertyChangeListener",
						new Class[] { String.class,
								PropertyChangeListener.class });
				return true;
			} catch (NoSuchMethodException e) {
				method = valueType.getMethod("addPropertyChangeListener",
						new Class[] { PropertyChangeListener.class });
				return true;
			}
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(IBeanRegistry registry, URI bindingURI) {
		return observeValue(Realm.getDefault(), registry, bindingURI);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(Realm realm, IBeanRegistry registry,
			URI bindingURI) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

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

	@Override
	public IObservableList observeList(IBeanRegistry registry, URI bindingURI,
			Class<?> elementType) {
		return observeList(Realm.getDefault(), registry, bindingURI,
				elementType);
	}

	@Override
	public IObservableList observeList(Realm realm, IBeanRegistry registry,
			URI bindingURI, Class<?> elementType) {
		AccessibleScope scope = URIHelper.toScope(bindingURI);
		ISlot slot = scope.getBeanScope().accessBeanSlot(registry);

		if (slot == null) {
			throw new IllegalArgumentException("Bean slot must be available!");
		}

		String beanFragment = scope.getBeanFragment();
		// if value-property was references inside the slot, then return the
		// observable
		if (beanFragment.equals(ISlot.PROP_VALUE)) {
			return BeanProperties.list(slot.getClass(), ISlot.PROP_VALUE,
					elementType).observe(realm, slot);
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
				IObservableValue slotObservable = BeanProperties.value(
						slot.getClass(), ISlot.PROP_VALUE, slot.getValueType())
						.observe(realm, slot);

				// observe detail
				//
				return BeansObservables.observeDetailList(slotObservable,
						beanFragment, elementType);
			}
		}
	}
}
