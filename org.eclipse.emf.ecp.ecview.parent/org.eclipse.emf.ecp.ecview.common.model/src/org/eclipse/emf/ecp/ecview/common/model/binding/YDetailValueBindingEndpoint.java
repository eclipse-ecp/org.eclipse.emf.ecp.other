/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDetail Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getMasterObservable <em>Master Observable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYDetailValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YDetailValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Master Observable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Observable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Observable</em>' containment reference.
	 * @see #setMasterObservable(YValueBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYDetailValueBindingEndpoint_MasterObservable()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	YValueBindingEndpoint getMasterObservable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getMasterObservable <em>Master Observable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Observable</em>' containment reference.
	 * @see #getMasterObservable()
	 * @generated
	 */
	void setMasterObservable(YValueBindingEndpoint value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYDetailValueBindingEndpoint_Features()
	 * @model
	 * @generated
	 */
	EList<EStructuralFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYDetailValueBindingEndpoint_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYDetailValueBindingEndpoint_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

} // YDetailValueBindingEndpoint
