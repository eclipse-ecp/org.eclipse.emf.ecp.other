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
package org.eclipse.emf.ecp.ui.model.uimodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl#getViewName <em>View Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiViewImpl extends EObjectImpl implements YUiView {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<YUiEmbeddable> elements;

	/**
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected String viewName = VIEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiModelPackage.Literals.YUI_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiLayout getParent() {
		if (eContainerFeatureID() != UiModelPackage.YUI_VIEW__PARENT) return null;
		return (YUiLayout)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(YUiLayout newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, UiModelPackage.YUI_VIEW__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(YUiLayout newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != UiModelPackage.YUI_VIEW__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, UiModelPackage.YUI_LAYOUT__ELEMENTS, YUiLayout.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YUiEmbeddable> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<YUiEmbeddable>(YUiEmbeddable.class, this, UiModelPackage.YUI_VIEW__ELEMENTS, UiModelPackage.YUI_EMBEDDABLE__PARENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(String newViewName) {
		String oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.YUI_VIEW__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((YUiLayout)otherEnd, msgs);
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiModelPackage.YUI_VIEW__PARENT:
				return basicSetParent(null, msgs);
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UiModelPackage.YUI_VIEW__PARENT:
				return eInternalContainer().eInverseRemove(this, UiModelPackage.YUI_LAYOUT__ELEMENTS, YUiLayout.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiModelPackage.YUI_VIEW__ID:
				return getId();
			case UiModelPackage.YUI_VIEW__PARENT:
				return getParent();
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				return getElements();
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				return getViewName();
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
			case UiModelPackage.YUI_VIEW__ID:
				setId((String)newValue);
				return;
			case UiModelPackage.YUI_VIEW__PARENT:
				setParent((YUiLayout)newValue);
				return;
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends YUiEmbeddable>)newValue);
				return;
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				setViewName((String)newValue);
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
			case UiModelPackage.YUI_VIEW__ID:
				setId(ID_EDEFAULT);
				return;
			case UiModelPackage.YUI_VIEW__PARENT:
				setParent((YUiLayout)null);
				return;
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				getElements().clear();
				return;
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
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
			case UiModelPackage.YUI_VIEW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UiModelPackage.YUI_VIEW__PARENT:
				return getParent() != null;
			case UiModelPackage.YUI_VIEW__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
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
		if (baseClass == YUiEmbeddable.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.YUI_VIEW__PARENT: return UiModelPackage.YUI_EMBEDDABLE__PARENT;
				default: return -1;
			}
		}
		if (baseClass == YUiLayout.class) {
			switch (derivedFeatureID) {
				case UiModelPackage.YUI_VIEW__ELEMENTS: return UiModelPackage.YUI_LAYOUT__ELEMENTS;
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
		if (baseClass == YUiEmbeddable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_EMBEDDABLE__PARENT: return UiModelPackage.YUI_VIEW__PARENT;
				default: return -1;
			}
		}
		if (baseClass == YUiLayout.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_LAYOUT__ELEMENTS: return UiModelPackage.YUI_VIEW__ELEMENTS;
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
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //YUiViewImpl
