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

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IDetailValueBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class DetailValueBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YDetailValueBindingEndpoint> implements
		IDetailValueBindingEndpointEditpart {

	@Override
	protected YDetailValueBindingEndpoint createModel() {
		checkDisposed();
		return BindingFactory.eINSTANCE.createYDetailValueBindingEndpoint();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {
		IBindableValueEndpointEditpart masterEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(getModel().getMasterObservable());

		IObservableValue masterObservable = (IObservableValue) masterEditpart
				.getObservable();
		Class<?> type = getModel().getType();
		if (type == null) {
			throw new RuntimeException("Type must not be null");
		}

		if (EObject.class.isAssignableFrom(type)) {
			if (getModel().getFeatures().size() == 0) {
				throw new IllegalArgumentException(
						"Please use features for EObjects");
			}

			List<EStructuralFeature> features = getModel().getFeatures();
			return (A) EMFProperties.value(FeaturePath.fromList(features
					.toArray(new EStructuralFeature[features.size()]))).observeDetail(masterObservable);
		} else if (hasPropertyChangeSupport(type)) {
			return (A) BeansObservables.observeDetailValue(masterObservable,
					type, getModel().getPropertyPath(), null);
		} else {
			return (A) PojoObservables.observeDetailValue(masterObservable,
					getModel().getPropertyPath(), null);
		}
	}

	// private FeaturePath createFeaturePath(EClass eClass) {
	// List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
	// String[] properties = getModel().getPropertyPath().split("\\.");
	// for (String property : properties) {
	// EStructuralFeature feature = eClass.getEStructuralFeature(property);
	// if (feature == null) {
	// throw new IllegalStateException(String.format(
	// "%s is not a valid feature for %s!", property,
	// eClass.getName()));
	// }
	//
	// features.add(feature);
	// if (feature instanceof EReference) {
	// EReference eReference = (EReference) feature;
	// eClass = eReference.getEReferenceType();
	// }
	// }
	//
	// FeaturePath path = FeaturePath.fromList(features
	// .toArray(new EStructuralFeature[features.size()]));
	// return path;
	// }
	//
	// /**
	// * Tries to find the eClass for the given type.
	// *
	// * @param type
	// * @return
	// */
	// private EClass findEClass(Class<?> type, String nsURI) {
	// EClass eClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(nsURI)
	// .getEClassifier(type.getSimpleName());
	// return eClass;
	// }

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

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
