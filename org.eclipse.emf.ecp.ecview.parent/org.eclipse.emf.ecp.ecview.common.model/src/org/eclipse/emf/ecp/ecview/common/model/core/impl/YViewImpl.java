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
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getVisibilityProcessor <em>Visibility Processor</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl#getBeanSlots <em>Bean Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YViewImpl extends MinimalEObjectImpl.Container implements YView {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibilityProcessor()
	 * <em>Visibility Processor</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVisibilityProcessor()
	 * @generated
	 * @ordered
	 */
	protected YVisibilityProcessor visibilityProcessor;

	/**
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected String viewName = VIEW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable content;

	/**
	 * The cached value of the '{@link #getBindingSet() <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingSet()
	 * @generated
	 * @ordered
	 */
	protected YBindingSet bindingSet;

	/**
	 * The cached value of the '{@link #getBeanSlots() <em>Bean Slots</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBeanSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<YBeanSlot> beanSlots;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YVIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_CLASS, oldCssClass, cssClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewName(String newViewName) {
		String oldViewName = viewName;
		viewName = newViewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__VIEW_NAME, oldViewName, viewName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (YEmbeddable)eResolveProxy(oldContent);
			if (content != oldContent) {
				InternalEObject newContent = (InternalEObject)content;
				NotificationChain msgs = oldContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, null);
				if (newContent.eInternalContainer() == null) {
					msgs = newContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(YEmbeddable newContent,
			NotificationChain msgs) {
		YEmbeddable oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet getBindingSet() {
		if (bindingSet != null && bindingSet.eIsProxy()) {
			InternalEObject oldBindingSet = (InternalEObject)bindingSet;
			bindingSet = (YBindingSet)eResolveProxy(oldBindingSet);
			if (bindingSet != oldBindingSet) {
				InternalEObject newBindingSet = (InternalEObject)bindingSet;
				NotificationChain msgs = oldBindingSet.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, null);
				if (newBindingSet.eInternalContainer() == null) {
					msgs = newBindingSet.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__BINDING_SET, oldBindingSet, bindingSet));
			}
		}
		return bindingSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet basicGetBindingSet() {
		return bindingSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingSet(YBindingSet newBindingSet,
			NotificationChain msgs) {
		YBindingSet oldBindingSet = bindingSet;
		bindingSet = newBindingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__BINDING_SET, oldBindingSet, newBindingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSet(YBindingSet newBindingSet) {
		if (newBindingSet != bindingSet) {
			NotificationChain msgs = null;
			if (bindingSet != null)
				msgs = ((InternalEObject)bindingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
			if (newBindingSet != null)
				msgs = ((InternalEObject)newBindingSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__BINDING_SET, null, msgs);
			msgs = basicSetBindingSet(newBindingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__BINDING_SET, newBindingSet, newBindingSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YBeanSlot> getBeanSlots() {
		if (beanSlots == null) {
			beanSlots = new EObjectContainmentEList.Resolving<YBeanSlot>(YBeanSlot.class, this, CoreModelPackage.YVIEW__BEAN_SLOTS);
		}
		return beanSlots;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet getOrCreateBindingSetGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YBindingSet getOrCreateBindingSet() {
		YBindingSet bs = getBindingSet();
		if (bs == null) {
			bs = BindingFactory.eINSTANCE.createYBindingSet();
			setBindingSet(bs);
		}
		return getBindingSet();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR, oldVisibilityProcessor, visibilityProcessor));
			}
		}
		return visibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProcessor basicGetVisibilityProcessor() {
		return visibilityProcessor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityProcessor(
			YVisibilityProcessor newVisibilityProcessor, NotificationChain msgs) {
		YVisibilityProcessor oldVisibilityProcessor = visibilityProcessor;
		visibilityProcessor = newVisibilityProcessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR, oldVisibilityProcessor, newVisibilityProcessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityProcessor(
			YVisibilityProcessor newVisibilityProcessor) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR, newVisibilityProcessor, newVisibilityProcessor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet getRoot() {
		if (eContainerFeatureID() != CoreModelPackage.YVIEW__ROOT) return null;
		return (YViewSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet basicGetRoot() {
		if (eContainerFeatureID() != CoreModelPackage.YVIEW__ROOT) return null;
		return (YViewSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(YViewSet newRoot,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, CoreModelPackage.YVIEW__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				if (visibilityProcessor != null)
					msgs = ((InternalEObject)visibilityProcessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR, null, msgs);
				return basicSetVisibilityProcessor((YVisibilityProcessor)otherEnd, msgs);
			case CoreModelPackage.YVIEW__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((YViewSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				return basicSetVisibilityProcessor(null, msgs);
			case CoreModelPackage.YVIEW__ROOT:
				return basicSetRoot(null, msgs);
			case CoreModelPackage.YVIEW__CONTENT:
				return basicSetContent(null, msgs);
			case CoreModelPackage.YVIEW__BINDING_SET:
				return basicSetBindingSet(null, msgs);
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return ((InternalEList<?>)getBeanSlots()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CoreModelPackage.YVIEW__ROOT:
				return eInternalContainer().eInverseRemove(this, CoreModelPackage.YVIEW_SET__VIEWS, YViewSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				if (resolve) return getVisibilityProcessor();
				return basicGetVisibilityProcessor();
			case CoreModelPackage.YVIEW__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return getViewName();
			case CoreModelPackage.YVIEW__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case CoreModelPackage.YVIEW__BINDING_SET:
				if (resolve) return getBindingSet();
				return basicGetBindingSet();
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return getBeanSlots();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				setVisibilityProcessor((YVisibilityProcessor)newValue);
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
			case CoreModelPackage.YVIEW__BINDING_SET:
				setBindingSet((YBindingSet)newValue);
				return;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				getBeanSlots().clear();
				getBeanSlots().addAll((Collection<? extends YBeanSlot>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				setVisibilityProcessor((YVisibilityProcessor)null);
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
			case CoreModelPackage.YVIEW__BINDING_SET:
				setBindingSet((YBindingSet)null);
				return;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				getBeanSlots().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR:
				return visibilityProcessor != null;
			case CoreModelPackage.YVIEW__ROOT:
				return basicGetRoot() != null;
			case CoreModelPackage.YVIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
			case CoreModelPackage.YVIEW__CONTENT:
				return content != null;
			case CoreModelPackage.YVIEW__BINDING_SET:
				return bindingSet != null;
			case CoreModelPackage.YVIEW__BEAN_SLOTS:
				return beanSlots != null && !beanSlots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (baseClass == YVisibilityProcessable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR: return CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		if (baseClass == YVisibilityProcessable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR: return CoreModelPackage.YVIEW__VISIBILITY_PROCESSOR;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoreModelPackage.YVIEW___GET_OR_CREATE_BINDING_SET:
				return getOrCreateBindingSet();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

	@Override
	public YBeanSlot addBeanSlot(String name, Class<?> type) {
		YBeanSlot result = getBeanSlot(name);
		if (result == null) {
			result = CoreModelFactory.eINSTANCE.createYBeanSlot();
			result.setName(name);
			result.setValueType(type);
			getBeanSlots().add(result);
		}

		return result;
	}

	@Override
	public YBeanSlot getBeanSlot(String name) {
		YBeanSlot result = null;
		for (YBeanSlot ySlot : getBeanSlots()) {
			if (ySlot.getName().equals(name)) {
				result = ySlot;
				break;
			}
		}
		return result;
	}

} // YUiViewImpl
