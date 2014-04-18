/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBinding</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding()
 * @model abstract="true"
 * @generated
 */
public interface YBinding extends YElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingSet getBindingSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	boolean isBindsElement(YElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingEndpoint getTargetEndpoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingEndpoint getModelEndpoint();

} // YBinding
