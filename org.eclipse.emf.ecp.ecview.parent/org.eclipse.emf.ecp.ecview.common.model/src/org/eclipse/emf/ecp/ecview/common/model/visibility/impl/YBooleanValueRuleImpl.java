/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YBooleanValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBoolean Value Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class YBooleanValueRuleImpl extends YVisibilityRuleImpl implements YBooleanValueRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBooleanValueRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YBOOLEAN_VALUE_RULE;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VisibilityPackage.YBOOLEAN_VALUE_RULE___CREATE_RULE_ENDPOINT:
				return createRuleEndpoint();
		}
		return super.eInvoke(operationID, arguments);
	}

} //YBooleanValueRuleImpl
