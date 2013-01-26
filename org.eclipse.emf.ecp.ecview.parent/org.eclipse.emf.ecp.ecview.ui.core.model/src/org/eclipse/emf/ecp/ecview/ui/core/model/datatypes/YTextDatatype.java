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
package org.eclipse.emf.ecp.ecview.ui.core.model.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMinlength <em>Minlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getRegexpression <em>Regexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage#getYTextDatatype()
 * @model
 * @generated
 */
public interface YTextDatatype extends YDatatype {
	/**
	 * Returns the value of the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxlength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxlength</em>' attribute.
	 * @see #setMaxlength(int)
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage#getYTextDatatype_Maxlength()
	 * @model
	 * @generated
	 */
	int getMaxlength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMaxlength <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlength</em>' attribute.
	 * @see #getMaxlength()
	 * @generated
	 */
	void setMaxlength(int value);

	/**
	 * Returns the value of the '<em><b>Minlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minlength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minlength</em>' attribute.
	 * @see #setMinlength(int)
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage#getYTextDatatype_Minlength()
	 * @model
	 * @generated
	 */
	int getMinlength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMinlength <em>Minlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlength</em>' attribute.
	 * @see #getMinlength()
	 * @generated
	 */
	void setMinlength(int value);

	/**
	 * Returns the value of the '<em><b>Regexpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexpression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexpression</em>' attribute.
	 * @see #setRegexpression(String)
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage#getYTextDatatype_Regexpression()
	 * @model
	 * @generated
	 */
	String getRegexpression();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getRegexpression <em>Regexpression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexpression</em>' attribute.
	 * @see #getRegexpression()
	 * @generated
	 */
	void setRegexpression(String value);

} // YTextDatatype
