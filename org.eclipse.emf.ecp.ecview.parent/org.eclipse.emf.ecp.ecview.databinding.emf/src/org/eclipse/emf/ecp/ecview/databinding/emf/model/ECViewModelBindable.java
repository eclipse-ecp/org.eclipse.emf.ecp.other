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

import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class is responsible to bind values inside the ECView UI model.
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
public class ECViewModelBindable {

	/**
	 * Returns an observable value tracking the attribute path.
	 * 
	 * @param yElement
	 *            - The ECView model element
	 * @param attributePath
	 *            - The attribute path being tracked
	 * @param elementType
	 *            - The type that is contained in the yElement. For instance if
	 *            YList#selection is of type Item.class, then this property is
	 *            Item.class.
	 * @return
	 */
	public static IObservableValue observeValue(EObject yElement,
			String attributePath, Class<?> elementType) {
		return observeValue(Realm.getDefault(), yElement, attributePath,
				elementType);
	}

	/**
	 * Returns an observable value tracking the attribute path.
	 * 
	 * @param realm
	 *            - The realm
	 * @param yElement
	 *            - The ECView model element
	 * @param attributePath
	 *            - The attribute path being tracked
	 * @param elementType
	 *            - The type that is contained in the yElement. For instance if
	 *            YList#selection is of type Item.class, then this property is
	 *            Item.class.
	 * @return
	 */
	public static IObservableValue observeValue(Realm realm, EObject yElement,
			String attributePath, Class<?> elementType) {
		if (yElement == null) {
			throw new IllegalArgumentException(
					"ECView model element must not be null!");
		}

		if (attributePath == null || attributePath.equals("")) {
			throw new IllegalArgumentException(
					"Attribute path must not be empty!");
		}
		
		int separatorIndex = attributePath.indexOf(".");
		String subPath = attributePath.substring(separatorIndex+1);

		EClass eClass = yElement.eClass();
		String[] properties = attributePath.split("\\.");
		EStructuralFeature feature = eClass
				.getEStructuralFeature(properties[0]);
		if (feature == null) {
			throw new IllegalStateException(String.format(
					"%s is not a valid feature for %s!", properties[0],
					eClass.getName()));
		}

		if (properties.length == 1
				|| elementType.isAssignableFrom(EObject.class)) {
			return EMFProperties.value(getFeaturePath(properties, eClass))
					.observe(yElement);
		} else if (hasPropertyChangeSupport(elementType)) {
			IObservableValue masterObservable = EMFProperties.value(feature)
					.observe(yElement);
			return BeanProperties.value(elementType, subPath)
					.observeDetail(masterObservable);
		} else {
			IObservableValue masterObservable = EMFProperties.value(feature)
					.observe(yElement);
			return PojoProperties.value(elementType, subPath)
					.observeDetail(masterObservable);
		}
	}

	/**
	 * Returns a feature path required for EMF databinding.
	 * 
	 * @param properties
	 * @param eClass
	 * @return
	 */
	public static FeaturePath getFeaturePath(String[] properties, EClass eClass) {
		List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
		for (String property : properties) {
			EStructuralFeature feature = eClass.getEStructuralFeature(property);
			if (feature == null) {
				throw new IllegalStateException(String.format(
						"%s is not a valid feature for %s!", property,
						eClass.getName()));
			}

			features.add(feature);
			if (feature instanceof EReference) {
				EReference eReference = (EReference) feature;
				eClass = eReference.getEReferenceType();
			}
		}

		FeaturePath featurePath = FeaturePath.fromList(features
				.toArray(new EStructuralFeature[features.size()]));
		return featurePath;
	}

	/**
	 * Returns an observable list tracking the attribute path.
	 * 
	 * @param yElement
	 *            - The ECView model element
	 * @param attributePath
	 *            - The attribute path being tracked
	 * @param elementType
	 *            - The type that is contained in the yElement. For instance if
	 *            YList#selection is of type Item.class, then this property is
	 *            Item.class.
	 * @return
	 */
	public static IObservableList observeList(EObject yElement,
			String attributePath, Class<?> elementType) {
		return observeList(Realm.getDefault(), yElement, attributePath,
				elementType);
	}

	/**
	 * Returns an observable list tracking the attribute path.
	 * 
	 * @param realm
	 *            - The realm
	 * @param yElement
	 *            - The ECView model element
	 * @param attributePath
	 *            - The attribute path being tracked
	 * @param elementType
	 *            - The type that is contained in the yElement. For instance if
	 *            YList#selection is of type Item.class, then this property is
	 *            Item.class.
	 * @return
	 */
	public static IObservableList observeList(Realm realm, EObject yElement,
			String attributePath, Class<?> elementType) {
		if (yElement == null) {
			throw new IllegalArgumentException(
					"ECView model element must not be null!");
		}

		if (attributePath == null || attributePath.equals("")) {
			throw new IllegalArgumentException(
					"Attribute path must not be empty!");
		}

		EClass eClass = yElement.eClass();
		String[] properties = attributePath.split("\\.");
		EStructuralFeature feature = eClass
				.getEStructuralFeature(properties[0]);
		if (feature == null) {
			throw new IllegalStateException(String.format(
					"%s is not a valid feature for %s!", properties[0],
					eClass.getName()));
		}

		if (elementType.isAssignableFrom(EObject.class)) {
			return EMFProperties.list(getFeaturePath(properties, eClass))
					.observe(yElement);
		} else if (hasPropertyChangeSupport(elementType)) {
			IObservableValue masterObservable = EMFProperties.value(feature)
					.observe(yElement);
			return BeanProperties.list(elementType, attributePath)
					.observeDetail(masterObservable);
		} else {
			IObservableValue masterObservable = EMFProperties.value(feature)
					.observe(yElement);
			return PojoProperties.list(elementType, attributePath)
					.observeDetail(masterObservable);
		}
	}

	/**
	 * Returns true, if the bean has property change support.
	 * 
	 * @param valueType
	 * @return
	 */
	public static boolean hasPropertyChangeSupport(Class<?> valueType) {
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
	 * Creates an attribute path that may be used for bindings in that class.
	 * 
	 * @param eFeature
	 * @param path
	 * @return
	 */
	public static String getAttributePath(EStructuralFeature eFeature,
			String path) {
		if (path == null || path.equals("")) {
			return eFeature.getName();
		} else {
			return eFeature.getName() + "." + path;
		}
	}

}
