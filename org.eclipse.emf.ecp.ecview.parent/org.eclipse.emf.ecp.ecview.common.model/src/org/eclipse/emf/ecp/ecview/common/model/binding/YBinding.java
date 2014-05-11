/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelToTargetStrategy <em>Model To Target Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetToModelStrategy <em>Target To Model Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding()
 * @model abstract="true"
 * @generated
 */
public interface YBinding extends YElement {
	/**
	 * Returns the value of the '<em><b>Model To Target Strategy</b></em>' attribute.
	 * The default value is <code>"UPDATE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model To Target Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model To Target Strategy</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @see #setModelToTargetStrategy(YBindingUpdateStrategy)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding_ModelToTargetStrategy()
	 * @model default="UPDATE"
	 * @generated
	 */
	YBindingUpdateStrategy getModelToTargetStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelToTargetStrategy <em>Model To Target Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model To Target Strategy</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @see #getModelToTargetStrategy()
	 * @generated
	 */
	void setModelToTargetStrategy(YBindingUpdateStrategy value);

	/**
	 * Returns the value of the '<em><b>Target To Model Strategy</b></em>' attribute.
	 * The default value is <code>"UPDATE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target To Model Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target To Model Strategy</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @see #setTargetToModelStrategy(YBindingUpdateStrategy)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding_TargetToModelStrategy()
	 * @model default="UPDATE"
	 * @generated
	 */
	YBindingUpdateStrategy getTargetToModelStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetToModelStrategy <em>Target To Model Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target To Model Strategy</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @see #getTargetToModelStrategy()
	 * @generated
	 */
	void setTargetToModelStrategy(YBindingUpdateStrategy value);

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
