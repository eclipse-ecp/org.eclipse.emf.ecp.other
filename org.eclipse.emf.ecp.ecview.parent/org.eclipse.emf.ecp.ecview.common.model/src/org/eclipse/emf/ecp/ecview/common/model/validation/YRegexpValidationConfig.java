/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRegexp Validation Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig#getRegExpression <em>Reg Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYRegexpValidationConfig()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YRegexpValidationConfig extends YValidationConfig {
	/**
	 * Returns the value of the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Expression</em>' attribute.
	 * @see #setRegExpression(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage#getYRegexpValidationConfig_RegExpression()
	 * @model required="true"
	 * @generated
	 */
	String getRegExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig#getRegExpression <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg Expression</em>' attribute.
	 * @see #getRegExpression()
	 * @generated
	 */
	void setRegExpression(String value);

} // YRegexpValidationConfig
