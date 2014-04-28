/**
 */
package validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMax Length Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link validation.YMaxLengthValidator#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see validation.ValidationPackage#getYMaxLengthValidator()
 * @model
 * @generated
 */
public interface YMaxLengthValidator extends YValidator {
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
	 * @see validation.ValidationPackage#getYMaxLengthValidator_MaxLength()
	 * @model required="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link validation.YMaxLengthValidator#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

} // YMaxLengthValidator
