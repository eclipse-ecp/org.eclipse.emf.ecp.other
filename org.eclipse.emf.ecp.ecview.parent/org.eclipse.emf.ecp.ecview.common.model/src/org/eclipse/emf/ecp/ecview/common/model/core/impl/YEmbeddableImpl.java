/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#isInitialVisible <em>Initial Visible</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl#getVisibilityProcessor <em>Visibility Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YEmbeddableImpl extends MinimalEObjectImpl.Container implements YEmbeddable {
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
	 * The default value of the '{@link #isInitialVisible() <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialVisible() <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean initialVisible = INITIAL_VISIBLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibilityProcessor() <em>Visibility Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityProcessor()
	 * @generated
	 * @ordered
	 */
	protected YVisibilityProcessor visibilityProcessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YEMBEDDABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__CSS_CLASS, oldCssClass, cssClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialVisible() {
		return initialVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialVisible(boolean newInitialVisible) {
		boolean oldInitialVisible = initialVisible;
		initialVisible = newInitialVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE, oldInitialVisible, initialVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProcessor getVisibilityProcessor() {
		if (visibilityProcessor != null && visibilityProcessor.eIsProxy()) {
			InternalEObject oldVisibilityProcessor = (InternalEObject)visibilityProcessor;
			visibilityProcessor = (YVisibilityProcessor)eResolveProxy(oldVisibilityProcessor);
			if (visibilityProcessor != oldVisibilityProcessor) {
				InternalEObject newVisibilityProcessor = (InternalEObject)visibilityProcessor;
				NotificationChain msgs =  oldVisibilityProcessor.eInverseRemove(this, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, YVisibilityProcessor.class, null);
				if (newVisibilityProcessor.eInternalContainer() == null) {
					msgs =  newVisibilityProcessor.eInverseAdd(this, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, YVisibilityProcessor.class, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR, oldVisibilityProcessor, visibilityProcessor));
			}
		}
		return visibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProcessor basicGetVisibilityProcessor() {
		return visibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityProcessor(YVisibilityProcessor newVisibilityProcessor, NotificationChain msgs) {
		YVisibilityProcessor oldVisibilityProcessor = visibilityProcessor;
		visibilityProcessor = newVisibilityProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR, oldVisibilityProcessor, newVisibilityProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityProcessor(YVisibilityProcessor newVisibilityProcessor) {
		if (newVisibilityProcessor != visibilityProcessor) {
			NotificationChain msgs = null;
			if (visibilityProcessor != null)
				msgs = ((InternalEObject)visibilityProcessor).eInverseRemove(this, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, YVisibilityProcessor.class, msgs);
			if (newVisibilityProcessor != null)
				msgs = ((InternalEObject)newVisibilityProcessor).eInverseAdd(this, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, YVisibilityProcessor.class, msgs);
			msgs = basicSetVisibilityProcessor(newVisibilityProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR, newVisibilityProcessor, newVisibilityProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YLayout getParent() {
		EObject container = eContainer();
		if (container instanceof YLayout) {
			return (YLayout) container;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YView getView() {
		EObject container = eContainer();
		if (container instanceof YView) {
			return (YView) container;
		} else if (container instanceof YLayout) {
			return ((YLayout) container).getView();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				if (visibilityProcessor != null)
					msgs = ((InternalEObject)visibilityProcessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR, null, msgs);
				return basicSetVisibilityProcessor((YVisibilityProcessor)otherEnd, msgs);
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
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				return basicSetVisibilityProcessor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE__ID:
				return getId();
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				return getCssClass();
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				return getCssID();
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				return isInitialVisible();
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				return isVisible();
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				if (resolve) return getVisibilityProcessor();
				return basicGetVisibilityProcessor();
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				setCssID((String)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				setInitialVisible((Boolean)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				setVisibilityProcessor((YVisibilityProcessor)newValue);
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				setInitialVisible(INITIAL_VISIBLE_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				setVisibilityProcessor((YVisibilityProcessor)null);
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
			case CoreModelPackage.YEMBEDDABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YEMBEDDABLE__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case CoreModelPackage.YEMBEDDABLE__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE:
				return initialVisible != INITIAL_VISIBLE_EDEFAULT;
			case CoreModelPackage.YEMBEDDABLE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				return visibilityProcessor != null;
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
				case CoreModelPackage.YEMBEDDABLE__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case CoreModelPackage.YEMBEDDABLE__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YVisibleable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE: return CoreModelPackage.YVISIBLEABLE__INITIAL_VISIBLE;
				case CoreModelPackage.YEMBEDDABLE__VISIBLE: return CoreModelPackage.YVISIBLEABLE__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == YVisibilityProcessable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR: return CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR;
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
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return CoreModelPackage.YEMBEDDABLE__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return CoreModelPackage.YEMBEDDABLE__CSS_ID;
				default: return -1;
			}
		}
		if (baseClass == YVisibleable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVISIBLEABLE__INITIAL_VISIBLE: return CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE;
				case CoreModelPackage.YVISIBLEABLE__VISIBLE: return CoreModelPackage.YEMBEDDABLE__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == YVisibilityProcessable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR: return CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR;
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
		result.append(", initialVisible: ");
		result.append(initialVisible);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} // YUiEmbeddableImpl
