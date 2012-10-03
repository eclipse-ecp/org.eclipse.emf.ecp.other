/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMinlength <em>Minlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getRegexpression <em>Regexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDType()
 * @model
 * @generated
 */
public interface YTextDType extends YDtDatatype {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDType_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

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
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDType_Maxlength()
	 * @model
	 * @generated
	 */
	int getMaxlength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMaxlength <em>Maxlength</em>}' attribute.
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
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDType_Minlength()
	 * @model
	 * @generated
	 */
	int getMinlength();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMinlength <em>Minlength</em>}' attribute.
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
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDType_Regexpression()
	 * @model
	 * @generated
	 */
	String getRegexpression();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getRegexpression <em>Regexpression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexpression</em>' attribute.
	 * @see #getRegexpression()
	 * @generated
	 */
	void setRegexpression(String value);

} // YTextDType
