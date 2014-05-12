/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YDecimal Value Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl#getReferenceValue <em>Reference Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YDecimalValueRuleImpl extends YVisibilityRuleImpl implements YDecimalValueRule {
	/**
	 * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected static final YDecimalValueRuleOption OPTION_EDEFAULT = YDecimalValueRuleOption.EQUAL;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected YDecimalValueRuleOption option = OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceValue() <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReferenceValue() <em>Reference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected double referenceValue = REFERENCE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDecimalValueRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YDECIMAL_VALUE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalValueRuleOption getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(YDecimalValueRuleOption newOption) {
		YDecimalValueRuleOption oldOption = option;
		option = newOption == null ? OPTION_EDEFAULT : newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YDECIMAL_VALUE_RULE__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReferenceValue() {
		return referenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceValue(double newReferenceValue) {
		double oldReferenceValue = referenceValue;
		referenceValue = newReferenceValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YDECIMAL_VALUE_RULE__REFERENCE_VALUE, oldReferenceValue, referenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityRuleBindingEndpoint createRuleEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YVisibilityRuleBindingEndpoint createRuleEndpoint() {
		return super.createRuleEndpoint("value");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.YDECIMAL_VALUE_RULE__OPTION:
				return getOption();
			case VisibilityPackage.YDECIMAL_VALUE_RULE__REFERENCE_VALUE:
				return getReferenceValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisibilityPackage.YDECIMAL_VALUE_RULE__OPTION:
				setOption((YDecimalValueRuleOption)newValue);
				return;
			case VisibilityPackage.YDECIMAL_VALUE_RULE__REFERENCE_VALUE:
				setReferenceValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisibilityPackage.YDECIMAL_VALUE_RULE__OPTION:
				setOption(OPTION_EDEFAULT);
				return;
			case VisibilityPackage.YDECIMAL_VALUE_RULE__REFERENCE_VALUE:
				setReferenceValue(REFERENCE_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisibilityPackage.YDECIMAL_VALUE_RULE__OPTION:
				return option != OPTION_EDEFAULT;
			case VisibilityPackage.YDECIMAL_VALUE_RULE__REFERENCE_VALUE:
				return referenceValue != REFERENCE_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (option: ");
		result.append(option);
		result.append(", referenceValue: ");
		result.append(referenceValue);
		result.append(')');
		return result.toString();
	}

} //YDecimalValueRuleImpl
