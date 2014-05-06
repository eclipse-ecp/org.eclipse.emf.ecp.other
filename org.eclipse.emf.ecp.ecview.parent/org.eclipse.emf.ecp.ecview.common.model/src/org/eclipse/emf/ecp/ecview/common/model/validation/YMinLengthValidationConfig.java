/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMin Length Validation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig#getMinLength <em>Min Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYMinLengthValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YMinLengthValidationConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYMinLengthValidationConfig_MinLength()
	 * @model required="true"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

} // YMinLengthValidationConfig
