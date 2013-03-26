/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage
 * @generated
 */
public interface BindingFactory extends EFactory {
	/** 
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BindingFactory eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YBinding Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBinding Set</em>'.
	 * @generated
	 */
	YBindingSet createYBindingSet();

	/**
	 * Returns a new object of class '<em>YBinding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBinding</em>'.
	 * @generated
	 */
	YBinding createYBinding();

	/**
	 * Returns a new object of class '<em>YBean Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YBean Binding Endpoint</em>'.
	 * @generated
	 */
	YBeanBindingEndpoint createYBeanBindingEndpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BindingPackage getBindingPackage();

} //BindingFactory
