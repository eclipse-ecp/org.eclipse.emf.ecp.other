/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YText DDesc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDDesc()
 * @model
 * @generated
 */
public interface YTextDDesc extends YDtDatadescription {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YTextDType)
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage#getYTextDDesc_Datatype()
	 * @model
	 * @generated
	 */
	YTextDType getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YTextDType value);

} // YTextDDesc
