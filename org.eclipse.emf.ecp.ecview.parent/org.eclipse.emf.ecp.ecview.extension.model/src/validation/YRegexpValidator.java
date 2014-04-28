/**
 */
package validation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRegexp Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link validation.YRegexpValidator#getRegexp <em>Regexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see validation.ValidationPackage#getYRegexpValidator()
 * @model
 * @generated
 */
public interface YRegexpValidator extends YValidator {
	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(String)
	 * @see validation.ValidationPackage#getYRegexpValidator_Regexp()
	 * @model required="true"
	 * @generated
	 */
	String getRegexp();

	/**
	 * Sets the value of the '{@link validation.YRegexpValidator#getRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #getRegexp()
	 * @generated
	 */
	void setRegexp(String value);

} // YRegexpValidator
