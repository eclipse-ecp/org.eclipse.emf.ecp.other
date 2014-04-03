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
package org.eclipse.emf.ecp.ecview.common.model.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDatadescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabelI18nKey <em>Label I1 8n Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage#getYDatadescription()
 * @model
 * @generated
 */
public interface YDatadescription extends YDtBase {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage#getYDatadescription_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label I1 8n Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label I1 8n Key</em>' attribute.
	 * @see #setLabelI18nKey(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage#getYDatadescription_LabelI18nKey()
	 * @model
	 * @generated
	 */
	String getLabelI18nKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabelI18nKey <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label I1 8n Key</em>' attribute.
	 * @see #getLabelI18nKey()
	 * @generated
	 */
	void setLabelI18nKey(String value);

} // YDatadescription
