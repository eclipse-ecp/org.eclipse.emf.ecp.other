/**
 */
package validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMin Length Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link validation.YMinLengthValidator#getMinLength <em>Min Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see validation.ValidationPackage#getYMinLengthValidator()
 * @model
 * @generated
 */
public interface YMinLengthValidator extends YValidator {
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
	 * @see validation.ValidationPackage#getYMinLengthValidator_MinLength()
	 * @model required="true"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link validation.YMinLengthValidator#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

} // YMinLengthValidator
