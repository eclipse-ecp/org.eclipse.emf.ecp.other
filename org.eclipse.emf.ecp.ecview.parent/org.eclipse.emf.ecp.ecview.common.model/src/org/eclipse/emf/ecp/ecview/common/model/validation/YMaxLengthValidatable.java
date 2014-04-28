/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMax Length Validatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYMaxLengthValidatable()
 * @model
 * @generated
 */
public interface YMaxLengthValidatable extends YValidatable {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYMaxLengthValidatable_MaxLength()
	 * @model required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

} // YMaxLengthValidatable
