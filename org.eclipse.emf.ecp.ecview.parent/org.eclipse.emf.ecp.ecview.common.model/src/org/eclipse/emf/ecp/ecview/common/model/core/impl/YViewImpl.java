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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YViewImpl extends EObjectImpl implements YView {
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
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

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
	protected YEmbeddable content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YVIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_CLASS, oldCssClass, cssClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_ID, oldCssID, cssID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(YEmbeddable newContent, NotificationChain msgs) {
		YEmbeddable oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(YEmbeddable newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet getRoot() {
		if (eContainerFeatureID() != CoreModelPackage.YVIEW__ROOT) return null;
		return (YViewSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(YViewSet newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, CoreModelPackage.YVIEW__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(YViewSet newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != CoreModelPackage.YVIEW__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ROOT, newRoot, newRoot));
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
			case CoreModelPackage.YVIEW__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((YViewSet)otherEnd, msgs);
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
			case CoreModelPackage.YVIEW__ROOT:
				return basicSetRoot(null, msgs);
			case CoreModelPackage.YVIEW__CONTENT:
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
			case CoreModelPackage.YVIEW__ROOT:
				return eInternalContainer().eInverseRemove(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
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
			case CoreModelPackage.YVIEW__ID:
				return getId();
			case CoreModelPackage.YVIEW__CSS_CLASS:
				return getCssClass();
			case CoreModelPackage.YVIEW__CSS_ID:
				return getCssID();
			case CoreModelPackage.YVIEW__MARGIN:
				return isMargin();
			case CoreModelPackage.YVIEW__ROOT:
				return getRoot();
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return getViewName();
			case CoreModelPackage.YVIEW__CONTENT:
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
			case CoreModelPackage.YVIEW__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CSS_ID:
				setCssID((String)newValue);
				return;
			case CoreModelPackage.YVIEW__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case CoreModelPackage.YVIEW__ROOT:
				setRoot((YViewSet)newValue);
				return;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case CoreModelPackage.YVIEW__CONTENT:
				setContent((YEmbeddable)newValue);
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
			case CoreModelPackage.YVIEW__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__ROOT:
				setRoot((YViewSet)null);
				return;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case CoreModelPackage.YVIEW__CONTENT:
				setContent((YEmbeddable)null);
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
			case CoreModelPackage.YVIEW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YVIEW__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case CoreModelPackage.YVIEW__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case CoreModelPackage.YVIEW__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case CoreModelPackage.YVIEW__ROOT:
				return getRoot() != null;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case CoreModelPackage.YVIEW__CONTENT:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YVIEW__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case CoreModelPackage.YVIEW__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YVIEW__MARGIN: return CoreModelPackage.YMARGINABLE__MARGIN;
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
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return CoreModelPackage.YVIEW__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return CoreModelPackage.YVIEW__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMARGINABLE__MARGIN: return CoreModelPackage.YVIEW__MARGIN;
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
		result.append(", margin: ");
		result.append(margin);
		result.append(", viewName: ");
		result.append(viewName);
		result.append(')');
		return result.toString();
	}

} //YUiViewImpl
