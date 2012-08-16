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
package org.eclipse.emf.ecp.ui.model.uimodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage
 * @generated
 */
public interface UiModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiModelFactory eINSTANCE = org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YUi Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Layout</em>'.
	 * @generated
	 */
	YUiLayout createYUiLayout();

	/**
	 * Returns a new object of class '<em>YUi Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Field</em>'.
	 * @generated
	 */
	YUiField createYUiField();

	/**
	 * Returns a new object of class '<em>YUi View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi View</em>'.
	 * @generated
	 */
	YUiView createYUiView();

	/**
	 * Returns a new object of class '<em>YUi Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Root</em>'.
	 * @generated
	 */
	YUiRoot createYUiRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiModelPackage getUiModelPackage();

} //UiModelFactory
