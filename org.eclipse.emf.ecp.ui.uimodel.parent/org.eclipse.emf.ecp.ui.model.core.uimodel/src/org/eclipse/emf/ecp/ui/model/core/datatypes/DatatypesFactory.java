/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage
 * @generated
 */
public interface DatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesFactory eINSTANCE = org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YText Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText Datatype</em>'.
	 * @generated
	 */
	YTextDatatype createYTextDatatype();

	/**
	 * Returns a new object of class '<em>YDatadescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDatadescription</em>'.
	 * @generated
	 */
	YDatadescription createYDatadescription();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesPackage getDatatypesPackage();

} //DatatypesFactory
