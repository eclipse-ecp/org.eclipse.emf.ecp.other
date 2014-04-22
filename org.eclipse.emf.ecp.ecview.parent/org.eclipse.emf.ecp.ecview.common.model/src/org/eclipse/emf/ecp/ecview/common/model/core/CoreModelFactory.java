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
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage
 * @generated
 */
public interface CoreModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelFactory eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YLayout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YLayout</em>'.
	 * @generated
	 */
	YLayout createYLayout();

	/**
	 * Returns a new object of class '<em>YField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YField</em>'.
	 * @generated
	 */
	YField createYField();

	/**
	 * Returns a new object of class '<em>YView</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YView</em>'.
	 * @generated
	 */
	YView createYView();

	/**
	 * Returns a new object of class '<em>YView Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YView Set</em>'.
	 * @generated
	 */
	YViewSet createYViewSet();

	/**
	 * Returns a new object of class '<em>YAction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YAction</em>'.
	 * @generated
	 */
	YAction createYAction();

	/**
	 * Returns a new object of class '<em>YContext Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YContext Binding Endpoint</em>'.
	 * @generated
	 */
	YContextBindingEndpoint createYContextBindingEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Value Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Value Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableValueEndpoint createYEmbeddableValueEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Selection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableSelectionEndpoint createYEmbeddableSelectionEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableMultiSelectionEndpoint createYEmbeddableMultiSelectionEndpoint();

	/**
	 * Returns a new object of class '<em>YEmbeddable Collection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YEmbeddable Collection Endpoint</em>'.
	 * @generated
	 */
	YEmbeddableCollectionEndpoint createYEmbeddableCollectionEndpoint();

	/**
	 * Returns a new object of class '<em>YActivated Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YActivated Endpoint</em>'.
	 * @generated
	 */
	YActivatedEndpoint createYActivatedEndpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreModelPackage getCoreModelPackage();

} //UiModelFactory
