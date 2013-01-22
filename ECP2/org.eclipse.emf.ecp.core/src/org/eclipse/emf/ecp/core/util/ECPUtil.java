/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eike Stepper - initial API and implementation
 * Eugen Neufeld - JavaDoc
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.core.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecp.internal.core.util.ElementDescriptor;
import org.eclipse.emf.ecp.internal.core.util.Properties;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * This class provides common functionality.
 * 
 * @author Eike Stepper
 * @author Eugen Neufeld
 */
public final class ECPUtil {

	private static final int NOT_FOUND = -1;

	private ECPUtil() {
	}

	/**
	 * Return the common {@link ECPModelContext} for the provided elements.
	 * 
	 * @param contextProvider the {@link ECPModelContextProvider} to use
	 * @param elements the elements to check
	 * @return the common {@link ECPModelContext} for the elements or null
	 */
	public static ECPModelContext getModelContext(ECPModelContextProvider contextProvider, Object... elements) {
		ECPModelContext commonContext = null;
		for (Object element : elements) {
			ECPModelContext elementContext = contextProvider.getModelContext(element);
			if (elementContext == null) {
				return null;
			}

			if (elementContext != commonContext) {
				if (commonContext == null) {
					commonContext = elementContext;
				} else {
					return null;
				}
			}
		}

		return commonContext;
	}

	/**
	 * This creates an empty {@link ECPProperties}.
	 * 
	 * @return an empry {@link ECPProperties}
	 */
	public static ECPProperties createProperties() {
		return new Properties();
	}

	/**
	 * Checks whether an object is an {@link ECPDisposable} and disposed.
	 * 
	 * @param object the object to check
	 * @return true if the object is an instance of {@link ECPDisposable} and {@link ECPDisposable#isDisposed()} returns
	 *         true, false otherwise
	 */
	public static boolean isDisposed(Object object) {
		if (object instanceof ECPDisposable) {
			ECPDisposable disposable = (ECPDisposable) object;
			return disposable.isDisposed();
		}

		return false;
	}

	/**
	 * Checks whether an object is an {@link ECPCloseable} and closed.
	 * 
	 * @param object the object to check
	 * @return true if the object is an instance of {@link ECPCloseable} and not open, false otherwise
	 */
	public static boolean isClosed(Object object) {
		if (object instanceof ECPCloseable) {
			ECPCloseable closeable = (ECPCloseable) object;
			return !closeable.isOpen();
		}

		return false;
	}

	/**
	 * Checks whether the {@link ECPElement} is an {@link ElementDescriptor} and resolves it when necessary.
	 * 
	 * @param elementOrDescriptor the {@link ECPElement} to check
	 * @return the resolved Object or the original object if it is not an descriptor
	 */
	public static ECPElement getResolvedElement(ECPElement elementOrDescriptor) {
		if (elementOrDescriptor instanceof ElementDescriptor) {
			ElementDescriptor<?> descriptor = (ElementDescriptor<?>) elementOrDescriptor;
			return descriptor.getResolvedElement();
		}

		return elementOrDescriptor;
	}

	/**
	 * Checks whether an array contains an element.
	 * 
	 * @param elements the array to check
	 * @param element the element to find
	 * @param <E> the type of the elements
	 * @return true if the element is in the array, false otherwise
	 */
	public static <E> boolean containsElement(E[] elements, E element) {
		return getElementIndex(elements, element) != NOT_FOUND;
	}

	/**
	 * Returns the index of an Element inside the array.
	 * 
	 * @param elements the array to search
	 * @param element the element to search
	 * @param <E> the generic type of the element and the array
	 * @return the index of the element in the array or {@link #NOT_FOUND} if the element is not in the array
	 */
	public static <E> int getElementIndex(E[] elements, E element) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == element) {
				return i;
			}
		}

		return NOT_FOUND;
	}

	/**
	 * This method looks through all known {@link EPackage}s to find all subclasses for the provided super class.
	 * 
	 * @param superClass
	 *            - the class for which to get the subclasses
	 * @return a {@link Collection} of {@link EClass EClasses}
	 */
	public static Collection<EClass> getSubClasses(EClass superClass) {
		Collection<EClass> classes = new HashSet<EClass>();
		for (String nsURI : Registry.INSTANCE.keySet()) {
			EPackage ePackage = Registry.INSTANCE.getEPackage(nsURI);
			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (superClass.isSuperTypeOf(eClass) && !eClass.isAbstract() && !eClass.isInterface()) {
						classes.add(eClass);
					}
				}
			}
		}
		return classes;
	}

	/**
	 * Returns the set of all known {@link EPackage EPackages}.
	 * 
	 * @return the Set of all known {@link EPackage Epackages}
	 */
	public static Set<EPackage> getAllRegisteredEPackages() {
		Set<EPackage> ePackages = new HashSet<EPackage>();
		for (String nsURI : Registry.INSTANCE.keySet()) {
			EPackage ePackage = Registry.INSTANCE.getEPackage(nsURI);
			ePackages.add(ePackage);
		}
		return ePackages;
	}
}
