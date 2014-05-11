/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#getBindingEndpoints <em>Binding Endpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityRule()
 * @model abstract="true"
 * @generated
 */
public interface YVisibilityRule extends YElement {

	/**
	 * Returns the value of the '<em><b>Binding Endpoints</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Endpoints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Endpoints</em>' reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityRule_BindingEndpoints()
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	EList<YVisibilityRuleBindingEndpoint> getBindingEndpoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YVisibilityRuleBindingEndpoint createRuleEndpoint();
} // YVisibilityRule
