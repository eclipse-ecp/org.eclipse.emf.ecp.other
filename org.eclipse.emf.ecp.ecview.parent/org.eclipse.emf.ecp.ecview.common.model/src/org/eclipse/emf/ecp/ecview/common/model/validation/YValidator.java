/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YValidator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidator#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYValidator()
 * @model abstract="true"
 * @generated
 */
public interface YValidator extends YElement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYValidator_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);
} // YValidator
