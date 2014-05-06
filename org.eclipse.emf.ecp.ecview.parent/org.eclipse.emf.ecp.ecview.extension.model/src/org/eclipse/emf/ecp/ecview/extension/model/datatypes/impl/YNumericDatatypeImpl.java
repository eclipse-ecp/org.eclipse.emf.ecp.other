/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YNumeric Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#getRegExpression <em>Reg Expression</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl#isMarkNegative <em>Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YNumericDatatypeImpl extends MinimalEObjectImpl.Container implements YNumericDatatype {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<YValidator> validators;

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
	 * The default value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUPING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected boolean grouping = GROUPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_NEGATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean markNegative = MARK_NEGATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YNumericDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectResolvingEList<YValidator>(YValidator.class, this, ExtDatatypesPackage.YNUMERIC_DATATYPE__VALIDATORS);
		}
		return validators;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION, oldRegExpression, regExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(boolean newGrouping) {
		boolean oldGrouping = grouping;
		grouping = newGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__GROUPING, oldGrouping, grouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkNegative() {
		return markNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkNegative(boolean newMarkNegative) {
		boolean oldMarkNegative = markNegative;
		markNegative = newMarkNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtDatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE, oldMarkNegative, markNegative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__ID:
				return getId();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__NAME:
				return getName();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				return getDescription();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__VALIDATORS:
				return getValidators();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION:
				return getRegExpression();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				return isGrouping();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				return isMarkNegative();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__ID:
				setId((String)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__NAME:
				setName((String)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends YValidator>)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION:
				setRegExpression((String)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				setGrouping((Boolean)newValue);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				setMarkNegative((Boolean)newValue);
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
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__VALIDATORS:
				getValidators().clear();
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION:
				setRegExpression(REG_EXPRESSION_EDEFAULT);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				setGrouping(GROUPING_EDEFAULT);
				return;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				setMarkNegative(MARK_NEGATIVE_EDEFAULT);
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
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION:
				return REG_EXPRESSION_EDEFAULT == null ? regExpression != null : !REG_EXPRESSION_EDEFAULT.equals(regExpression);
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				return grouping != GROUPING_EDEFAULT;
			case ExtDatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				return markNegative != MARK_NEGATIVE_EDEFAULT;
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
				case ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION: return ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION;
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
				case ValidationPackage.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION: return ExtDatatypesPackage.YNUMERIC_DATATYPE__REG_EXPRESSION;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", regExpression: ");
		result.append(regExpression);
		result.append(", grouping: ");
		result.append(grouping);
		result.append(", markNegative: ");
		result.append(markNegative);
		result.append(')');
		return result.toString();
	}

} //YNumericDatatypeImpl
