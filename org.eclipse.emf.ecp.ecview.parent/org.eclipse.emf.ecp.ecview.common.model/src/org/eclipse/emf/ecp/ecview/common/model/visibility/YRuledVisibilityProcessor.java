/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRuled Visibility Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYRuledVisibilityProcessor()
 * @model
 * @generated
 */
public interface YRuledVisibilityProcessor extends YVisibilityProcessor {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(YVisibilityRule)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYRuledVisibilityProcessor_Rule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YVisibilityRule getRule();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(YVisibilityRule value);

} // YRuledVisibilityProcessor
