/**
 */
package org.eclipse.emf.ecp.ecview.databinding.tests.emf.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAddress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage#getTAddress()
 * @model
 * @generated
 */
public interface TAddress extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(TCountry)
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage#getTAddress_Country()
	 * @model
	 * @generated
	 */
	TCountry getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(TCountry value);

} // TAddress
