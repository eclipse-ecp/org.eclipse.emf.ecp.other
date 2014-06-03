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
package org.eclipse.emf.ecp.ecview.databinding.emf.model;

import java.net.URI;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

/**
 * Implementations are responsible to bind values inside the ECView UI model.
 * <p>
 * For now, 3 different types are known:<br>
 * In all cases the given bean is an EObject, since the ECView model is based on
 * Ecore. But there may be 3 different types of values contained in the EObject.
 * <br>
 * Example based on YList#selection. And the selection is an instance of
 * ItemDTO. And we'd like to bind "selection.group.name"<br>
 * ItemDTO can be of type...
 * <ul>
 * <li>EObject - then we need to use EMFBinding to bind the nested attributes.</li>
 * <li>Bean- then we need to use EMFBinding to create a master binding value for
 * YList#selection, and this binding is input for a Bean-DetailBinding.</li>
 * <li>Pojo - then we need to use EMFBinding to create a master binding value
 * for YList#selection, and this binding is input for a Pojo-DetailBinding.</li>
 * </ul>
 */
public class ECViewModelBindable extends
		ECViewDetailBindingDelegate {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(Object bean, String attributePath) {
		// thats the default
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(Object bean, String attributePath) {
		return observeValue(Realm.getDefault(), bean, attributePath);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IObservableValue observeValue(Realm realm, Object bean,
			String attributePath) {
		if (bean == null) {
			throw new IllegalArgumentException("Bean must not be null!");
		}

		String[] path = attributePath.split("\\.");
		if (path.length == 1) {
			return BeansObservables.observeValue(realm, bean, path[0]);
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
				// Note: slot (master) is observable!
				//
				IObservableValue slotObservable = BeansObservables
						.observeValue(realm, slot, ISlot.PROP_VALUE);

				// observe detail
				//
				// from PojoObservables.observeDetailValue...
				return PojoProperties.value(slot.getValueType(), beanFragment,
						null).observeDetail(slotObservable);
			}
		}
	}

	@Override
	public IObservableList observeList(Object bean, String attributePath,
			Class<?> elementType) {
		return observeList(Realm.getDefault(), registry, bindingURI,
				elementType);
	}

	@Override
	public IObservableList observeList(Object bean, String attributePath,
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
			// in that special case do not use PojoBinding since slot is
			// observable!
			return BeansObservables.observeList(realm, slot, ISlot.PROP_VALUE,
					slot.getValueType());
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
				// Note: slot (master) is observable!
				//
				IObservableValue slotObservable = BeanProperties.value(
						slot.getClass(), ISlot.PROP_VALUE, slot.getValueType())
						.observe(realm, slot);

				// observe detail
				//
				// from PojoObservables.observeDetailValue...
				return PojoProperties.list(slot.getValueType(), beanFragment,
						elementType).observeDetail(slotObservable);
			}
		}
	}

}
