/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBinding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBindingEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface YBindingEndpoint extends YElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBinding getBinding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	boolean isBindsElement(YElement element);

} // YBindingEndpoint
