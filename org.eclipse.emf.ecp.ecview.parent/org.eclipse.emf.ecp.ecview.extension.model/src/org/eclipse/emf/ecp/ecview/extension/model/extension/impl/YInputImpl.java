/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import validation.YValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class YInputImpl extends YFieldImpl implements YInput {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YINPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<YValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList<YValidator>(YValidator.class, this, ExtensionModelPackage.YINPUT__VALIDATORS);
		}
		return validators;
	}

} //YUiInputImpl
