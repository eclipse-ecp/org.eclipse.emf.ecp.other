/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YRegexp Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YRegexpValidatorImpl#getRegExpression <em>Reg Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YRegexpValidatorImpl extends YValidatorImpl implements YRegexpValidator {
	/**
	 * The default value of the '{@link #getRegExpression() <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegExpression() <em>Reg Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegExpression()
	 * @generated
	 * @ordered
	 */
	protected String regExpression = REG_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YRegexpValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.YREGEXP_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegExpression() {
		return regExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegExpression(String newRegExpression) {
		String oldRegExpression = regExpression;
		regExpression = newRegExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION, oldRegExpression, regExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				return getRegExpression();
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
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				setRegExpression((String)newValue);
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
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				setRegExpression(REG_EXPRESSION_EDEFAULT);
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
			case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION:
				return REG_EXPRESSION_EDEFAULT == null ? regExpression != null : !REG_EXPRESSION_EDEFAULT.equals(regExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YValidationConfig.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YValidationConfig.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YRegexpValidationConfig.class) {
			switch (baseFeatureID) {
				case ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATOR__REG_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (regExpression: ");
		result.append(regExpression);
		result.append(')');
		return result.toString();
	}

} //YRegexpValidatorImpl
