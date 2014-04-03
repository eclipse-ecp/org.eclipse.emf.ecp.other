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

import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYField()
 * @model
 * @generated
 */
public interface YField extends YEmbeddable, YEditable, YEnable {

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
