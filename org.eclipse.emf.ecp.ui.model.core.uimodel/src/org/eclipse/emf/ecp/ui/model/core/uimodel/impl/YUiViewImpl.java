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
package org.eclipse.emf.ecp.ui.model.core.uimodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl#getContent <em>Content</em>}</li>
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
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected YUiEmbeddable content;

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
	public YUiEmbeddable getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(YUiEmbeddable newContent, NotificationChain msgs) {
		YUiEmbeddable oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(YUiEmbeddable newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.YUI_VIEW__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiModelPackage.YUI_VIEW__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiViewSet getRoot() {
		if (eContainerFeatureID() != UiModelPackage.YUI_VIEW__ROOT) return null;
		return (YUiViewSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(YUiViewSet newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, UiModelPackage.YUI_VIEW__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(YUiViewSet newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != UiModelPackage.YUI_VIEW__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, UiModelPackage.YUI_VIEW_SET__VIEWS, YUiViewSet.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiModelPackage.YUI_VIEW__ROOT, newRoot, newRoot));
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
			case UiModelPackage.YUI_VIEW__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((YUiViewSet)otherEnd, msgs);
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
			case UiModelPackage.YUI_VIEW__ROOT:
				return basicSetRoot(null, msgs);
			case UiModelPackage.YUI_VIEW__CONTENT:
				return basicSetContent(null, msgs);
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
			case UiModelPackage.YUI_VIEW__ROOT:
				return eInternalContainer().eInverseRemove(this, UiModelPackage.YUI_VIEW_SET__VIEWS, YUiViewSet.class, msgs);
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
			case UiModelPackage.YUI_VIEW__ROOT:
				return getRoot();
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				return getViewName();
			case UiModelPackage.YUI_VIEW__CONTENT:
				return getContent();
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
			case UiModelPackage.YUI_VIEW__ROOT:
				setRoot((YUiViewSet)newValue);
				return;
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case UiModelPackage.YUI_VIEW__CONTENT:
				setContent((YUiEmbeddable)newValue);
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
			case UiModelPackage.YUI_VIEW__ROOT:
				setRoot((YUiViewSet)null);
				return;
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case UiModelPackage.YUI_VIEW__CONTENT:
				setContent((YUiEmbeddable)null);
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
			case UiModelPackage.YUI_VIEW__ROOT:
				return getRoot() != null;
			case UiModelPackage.YUI_VIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case UiModelPackage.YUI_VIEW__CONTENT:
				return content != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //YUiViewImpl
