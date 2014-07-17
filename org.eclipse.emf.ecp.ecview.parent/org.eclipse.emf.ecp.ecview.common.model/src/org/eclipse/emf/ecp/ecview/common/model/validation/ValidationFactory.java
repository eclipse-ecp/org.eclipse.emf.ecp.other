/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage
 * @generated
 */
public interface ValidationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationFactory eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YMin Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YMin Length Validator</em>'.
	 * @generated
	 */
	YMinLengthValidator createYMinLengthValidator();

	/**
	 * Returns a new object of class '<em>YMax Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YMax Length Validator</em>'.
	 * @generated
	 */
	YMaxLengthValidator createYMaxLengthValidator();

	/**
	 * Returns a new object of class '<em>YRegexp Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YRegexp Validator</em>'.
	 * @generated
	 */
	YRegexpValidator createYRegexpValidator();

	/**
	 * Returns a new object of class '<em>YClass Delegate Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YClass Delegate Validator</em>'.
	 * @generated
	 */
	YClassDelegateValidator createYClassDelegateValidator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValidationPackage getValidationPackage();

} //ValidationFactory
