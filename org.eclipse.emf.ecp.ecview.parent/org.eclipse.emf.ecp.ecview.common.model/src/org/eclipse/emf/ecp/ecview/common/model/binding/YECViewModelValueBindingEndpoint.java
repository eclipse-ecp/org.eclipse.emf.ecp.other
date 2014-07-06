/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEC View Model Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getEmfNsURI <em>Emf Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YECViewModelValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

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
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint_Features()
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
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getPropertyPath <em>Property Path</em>}' attribute.
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
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #setEmfNsURI(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYECViewModelValueBindingEndpoint_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getEmfNsURI <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #getEmfNsURI()
	 * @generated
	 */
	void setEmfNsURI(String value);

} // YECViewModelValueBindingEndpoint
