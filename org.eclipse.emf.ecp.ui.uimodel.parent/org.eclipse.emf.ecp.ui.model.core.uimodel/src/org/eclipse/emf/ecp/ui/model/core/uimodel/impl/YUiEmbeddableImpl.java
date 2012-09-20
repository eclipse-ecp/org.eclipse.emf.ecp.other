/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl#getCssID <em>Css ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YUiEmbeddableImpl extends EObjectImpl implements YUiEmbeddable {
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
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.YUI_EMBEDDABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_EMBEDDABLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS, oldCssClass, cssClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_EMBEDDABLE__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YUiLayout getParent() {
		EObject container = eContainer();
		if (container instanceof YUiLayout) {
			return (YUiLayout) container;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YUiView getView() {
		EObject container = eContainer();
		if (container instanceof YUiView) {
			return (YUiView) container;
		} else if (container instanceof YUiLayout) {
			return ((YUiLayout) container).getView();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.YUI_EMBEDDABLE__ID:
				return getId();
			case UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS:
				return getCssClass();
			case UiModelPackage.YUI_EMBEDDABLE__CSS_ID:
				return getCssID();
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
			case UiModelPackage.YUI_EMBEDDABLE__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case UiModelPackage.YUI_EMBEDDABLE__CSS_ID:
				setCssID((String)newValue);
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
			case UiModelPackage.YUI_EMBEDDABLE__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case UiModelPackage.YUI_EMBEDDABLE__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
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
			case UiModelPackage.YUI_EMBEDDABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case UiModelPackage.YUI_EMBEDDABLE__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
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
		if (baseClass == YUiCssAble.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS: return UiModelPackage.YUI_CSS_ABLE__CSS_CLASS;
				case UiModelPackage.YUI_EMBEDDABLE__CSS_ID: return UiModelPackage.YUI_CSS_ABLE__CSS_ID;
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
		if (baseClass == YUiCssAble.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_CSS_ABLE__CSS_CLASS: return UiModelPackage.YUI_EMBEDDABLE__CSS_CLASS;
				case UiModelPackage.YUI_CSS_ABLE__CSS_ID: return UiModelPackage.YUI_EMBEDDABLE__CSS_ID;
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
		result.append(", cssClass: ");
		result.append(cssClass);
		result.append(", cssID: ");
		result.append(cssID);
		result.append(')');
		return result.toString();
	}

} // YUiEmbeddableImpl
