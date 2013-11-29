/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage
 * @generated
 */
public interface ExtDatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtDatatypesFactory eINSTANCE = org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YText Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Datatype</em>'.
	 * @generated
	 */
	YTextDatatype createYTextDatatype();

	/**
	 * Returns a new object of class '<em>YText Area Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Area Datatype</em>'.
	 * @generated
	 */
	YTextAreaDatatype createYTextAreaDatatype();

	/**
	 * Returns a new object of class '<em>YNumeric Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YNumeric Datatype</em>'.
	 * @generated
	 */
	YNumericDatatype createYNumericDatatype();

	/**
	 * Returns a new object of class '<em>YDecimal Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDecimal Datatype</em>'.
	 * @generated
	 */
	YDecimalDatatype createYDecimalDatatype();

	/**
	 * Returns a new object of class '<em>YTable Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YTable Datatype</em>'.
	 * @generated
	 */
	YTableDatatype createYTableDatatype();

	/**
	 * Returns a new object of class '<em>YCheck Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCheck Box Datatype</em>'.
	 * @generated
	 */
	YCheckBoxDatatype createYCheckBoxDatatype();

	/**
	 * Returns a new object of class '<em>YCombo Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YCombo Box Datatype</em>'.
	 * @generated
	 */
	YComboBoxDatatype createYComboBoxDatatype();

	/**
	 * Returns a new object of class '<em>YList Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YList Data Type</em>'.
	 * @generated
	 */
	YListDataType createYListDataType();

	/**
	 * Returns a new object of class '<em>YBrowser Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBrowser Datatype</em>'.
	 * @generated
	 */
	YBrowserDatatype createYBrowserDatatype();

	/**
	 * Returns a new object of class '<em>YDate Time Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDate Time Datatype</em>'.
	 * @generated
	 */
	YDateTimeDatatype createYDateTimeDatatype();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtDatatypesPackage getExtDatatypesPackage();

} //ExtDatatypesFactory
