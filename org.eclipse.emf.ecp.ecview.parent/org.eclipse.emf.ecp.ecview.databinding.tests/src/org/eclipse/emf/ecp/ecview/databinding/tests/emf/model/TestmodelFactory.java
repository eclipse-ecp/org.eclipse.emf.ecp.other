/**
 */
package org.eclipse.emf.ecp.ecview.databinding.tests.emf.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage
 * @generated
 */
public interface TestmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestmodelFactory eINSTANCE = org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TPerson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPerson</em>'.
	 * @generated
	 */
	TPerson createTPerson();

	/**
	 * Returns a new object of class '<em>TAddress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAddress</em>'.
	 * @generated
	 */
	TAddress createTAddress();

	/**
	 * Returns a new object of class '<em>TCountry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCountry</em>'.
	 * @generated
	 */
	TCountry createTCountry();

	/**
	 * Returns a new object of class '<em>TList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TList</em>'.
	 * @generated
	 */
	TList createTList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestmodelPackage getTestmodelPackage();

} //TestmodelFactory
