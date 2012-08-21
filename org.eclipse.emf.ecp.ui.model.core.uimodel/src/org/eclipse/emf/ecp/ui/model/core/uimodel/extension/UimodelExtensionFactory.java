/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage
 * @generated
 */
public interface UimodelExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimodelExtensionFactory eINSTANCE = org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YUi Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Text Field</em>'.
	 * @generated
	 */
	YUiTextField createYUiTextField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimodelExtensionPackage getUimodelExtensionPackage();

} //UimodelExtensionFactory
