/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDecimal Value Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getOption <em>Option</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getReferenceValue <em>Reference Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYDecimalValueRule()
 * @model abstract="true"
 * @generated
 */
public interface YDecimalValueRule extends YVisibilityRule {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * The default value is <code>"EQUAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption
	 * @see #setOption(YDecimalValueRuleOption)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYDecimalValueRule_Option()
	 * @model default="EQUAL"
	 * @generated
	 */
	YDecimalValueRuleOption getOption();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption
	 * @see #getOption()
	 * @generated
	 */
	void setOption(YDecimalValueRuleOption value);

	/**
	 * Returns the value of the '<em><b>Reference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Value</em>' attribute.
	 * @see #setReferenceValue(double)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYDecimalValueRule_ReferenceValue()
	 * @model
	 * @generated
	 */
	double getReferenceValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getReferenceValue <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Value</em>' attribute.
	 * @see #getReferenceValue()
	 * @generated
	 */
	void setReferenceValue(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YVisibilityRuleBindingEndpoint createRuleEndpoint();

} // YDecimalValueRule
