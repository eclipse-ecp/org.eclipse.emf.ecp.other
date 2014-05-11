/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Rule Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityRuleBindingEndpoint()
 * @model
 * @generated
 */
public interface YVisibilityRuleBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#getBindingEndpoints <em>Binding Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(YVisibilityRule)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityRuleBindingEndpoint_Rule()
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#getBindingEndpoints
	 * @model opposite="bindingEndpoints" required="true"
	 * @generated
	 */
	YVisibilityRule getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(YVisibilityRule value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityRuleBindingEndpoint_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // YVisibilityRuleBindingEndpoint
