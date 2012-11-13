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
	 * Returns a new object of class '<em>YText DType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText DType</em>'.
	 * @generated
	 */
	YTextDType createYTextDType();

	/**
	 * Returns a new object of class '<em>YDt Datadescription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YDt Datadescription</em>'.
	 * @generated
	 */
	YDtDatadescription createYDtDatadescription();

	/**
	 * Returns a new object of class '<em>YText DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YText DDesc</em>'.
	 * @generated
	 */
	YTextDDesc createYTextDDesc();

	/**
	 * Returns a new object of class '<em>YLabel DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YLabel DDesc</em>'.
	 * @generated
	 */
	YLabelDDesc createYLabelDDesc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesPackage getDatatypesPackage();

} //DatatypesFactory
