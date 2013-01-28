/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YFieldImpl extends YEmbeddableImpl implements YField {
	/**
	 * The default value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDITABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEditable = INITIAL_EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEnabled = INITIAL_ENABLED_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEditable() {
		return initialEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEditable(boolean newInitialEditable) {
		boolean oldInitialEditable = initialEditable;
		initialEditable = newInitialEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__INITIAL_EDITABLE, oldInitialEditable, initialEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEnabled() {
		return initialEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEnabled(boolean newInitialEnabled) {
		boolean oldInitialEnabled = initialEnabled;
		initialEnabled = newInitialEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__INITIAL_ENABLED, oldInitialEnabled, initialEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				return isInitialEditable();
			case CoreModelPackage.YFIELD__EDITABLE:
				return isEditable();
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				return isInitialEnabled();
			case CoreModelPackage.YFIELD__ENABLED:
				return isEnabled();
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
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				setInitialEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				setInitialEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__ENABLED:
				setEnabled((Boolean)newValue);
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
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				setInitialEditable(INITIAL_EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				setInitialEnabled(INITIAL_ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				return initialEditable != INITIAL_EDITABLE_EDEFAULT;
			case CoreModelPackage.YFIELD__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				return initialEnabled != INITIAL_ENABLED_EDEFAULT;
			case CoreModelPackage.YFIELD__ENABLED:
				return enabled != ENABLED_EDEFAULT;
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
		if (baseClass == YEditable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YFIELD__INITIAL_EDITABLE: return CoreModelPackage.YEDITABLE__INITIAL_EDITABLE;
				case CoreModelPackage.YFIELD__EDITABLE: return CoreModelPackage.YEDITABLE__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YFIELD__INITIAL_ENABLED: return CoreModelPackage.YENABLE__INITIAL_ENABLED;
				case CoreModelPackage.YFIELD__ENABLED: return CoreModelPackage.YENABLE__ENABLED;
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
		if (baseClass == YEditable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YEDITABLE__INITIAL_EDITABLE: return CoreModelPackage.YFIELD__INITIAL_EDITABLE;
				case CoreModelPackage.YEDITABLE__EDITABLE: return CoreModelPackage.YFIELD__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YENABLE__INITIAL_ENABLED: return CoreModelPackage.YFIELD__INITIAL_ENABLED;
				case CoreModelPackage.YENABLE__ENABLED: return CoreModelPackage.YFIELD__ENABLED;
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
		result.append(" (initialEditable: ");
		result.append(initialEditable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", initialEnabled: ");
		result.append(initialEnabled);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //YUiFieldImpl
