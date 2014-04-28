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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import validation.YValidator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YField#getValidators <em>Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYField()
 * @model
 * @generated
 */
public interface YField extends YEmbeddable, YEditable, YEnable {

	/**
	 * Returns the value of the '<em><b>Validators</b></em>' containment reference list.
	 * The list contents are of type {@link validation.YValidator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validators</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYField_Validators()
	 * @model containment="true"
	 * @generated
	 */
	EList<YValidator> getValidators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.eclipse.emf.ecp.ecview.common.model.core.YValueChangeListener"
	 * @generated
	 */
	boolean addValueChangeListener(YValueChangeListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.eclipse.emf.ecp.ecview.common.model.core.YValueChangeListener"
	 * @generated
	 */
	boolean removeValueChangeListener(YValueChangeListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAllValueChangListeners();
} // YUiField
