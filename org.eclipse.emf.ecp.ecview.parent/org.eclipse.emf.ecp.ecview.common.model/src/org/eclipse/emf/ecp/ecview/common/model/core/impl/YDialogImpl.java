/**
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
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YDialog;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YDialog</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getValueBindingEndpoint <em>Value Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getCssID <em>Css ID</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#isModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#isResizeable <em>Resizeable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#isDraggable <em>Draggable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#isClosable <em>Closable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDialogImpl#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YDialogImpl extends MinimalEObjectImpl.Container implements
		YDialog {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueBindingEndpoint() <em>Value Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableValueEndpoint valueBindingEndpoint;

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
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable content;

	/**
	 * The default value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModal() <em>Modal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModal()
	 * @generated
	 * @ordered
	 */
	protected boolean modal = MODAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isResizeable() <em>Resizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESIZEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResizeable() <em>Resizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResizeable()
	 * @generated
	 * @ordered
	 */
	protected boolean resizeable = RESIZEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRAGGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDraggable()
	 * @generated
	 * @ordered
	 */
	protected boolean draggable = DRAGGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isClosable() <em>Closable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosable() <em>Closable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosable()
	 * @generated
	 * @ordered
	 */
	protected boolean closable = CLOSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;

	/**
	 * The default value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EMF_NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmfNsURI() <em>Emf Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfNsURI()
	 * @generated
	 * @ordered
	 */
	protected String emfNsURI = EMF_NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeQualifiedName() <em>Type Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String typeQualifiedName = TYPE_QUALIFIED_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YDialogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YDIALOG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint getValueBindingEndpoint() {
		if (valueBindingEndpoint != null && valueBindingEndpoint.eIsProxy()) {
			InternalEObject oldValueBindingEndpoint = (InternalEObject)valueBindingEndpoint;
			valueBindingEndpoint = (YEmbeddableValueEndpoint)eResolveProxy(oldValueBindingEndpoint);
			if (valueBindingEndpoint != oldValueBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, valueBindingEndpoint));
			}
		}
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint basicGetValueBindingEndpoint() {
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBindingEndpoint(
			YEmbeddableValueEndpoint newValueBindingEndpoint,
			NotificationChain msgs) {
		YEmbeddableValueEndpoint oldValueBindingEndpoint = valueBindingEndpoint;
		valueBindingEndpoint = newValueBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, newValueBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBindingEndpoint(
			YEmbeddableValueEndpoint newValueBindingEndpoint) {
		if (newValueBindingEndpoint != valueBindingEndpoint) {
			NotificationChain msgs = null;
			if (valueBindingEndpoint != null)
				msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			if (newValueBindingEndpoint != null)
				msgs = ((InternalEObject)newValueBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			msgs = basicSetValueBindingEndpoint(newValueBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT, newValueBindingEndpoint, newValueBindingEndpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__CSS_CLASS, oldCssClass, cssClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__CSS_ID, oldCssID, cssID));
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
				NotificationChain msgs = oldContent.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__CONTENT, null, null);
				if (newContent.eInternalContainer() == null) {
					msgs = newContent.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__CONTENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YDIALOG__CONTENT, oldContent, content));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__CONTENT, oldContent, newContent);
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
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModal() {
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModal(boolean newModal) {
		boolean oldModal = modal;
		modal = newModal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__MODAL, oldModal, modal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResizeable() {
		return resizeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResizeable(boolean newResizeable) {
		boolean oldResizeable = resizeable;
		resizeable = newResizeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__RESIZEABLE, oldResizeable, resizeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDraggable() {
		return draggable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraggable(boolean newDraggable) {
		boolean oldDraggable = draggable;
		draggable = newDraggable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__DRAGGABLE, oldDraggable, draggable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosable() {
		return closable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosable(boolean newClosable) {
		boolean oldClosable = closable;
		closable = newClosable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__CLOSABLE, oldClosable, closable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmfNsURI() {
		return emfNsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmfNsURI(String newEmfNsURI) {
		String oldEmfNsURI = emfNsURI;
		emfNsURI = newEmfNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__EMF_NS_URI, oldEmfNsURI, emfNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeQualifiedName() {
		return typeQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeQualifiedName(String newTypeQualifiedName) {
		String oldTypeQualifiedName = typeQualifiedName;
		typeQualifiedName = newTypeQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				InternalEObject newDatadescription = (InternalEObject)datadescription;
				NotificationChain msgs = oldDatadescription.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__DATADESCRIPTION, null, null);
				if (newDatadescription.eInternalContainer() == null) {
					msgs = newDatadescription.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__DATADESCRIPTION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YDIALOG__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatadescription(YDatadescription newDatadescription, NotificationChain msgs) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__DATADESCRIPTION, oldDatadescription, newDatadescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		if (newDatadescription != datadescription) {
			NotificationChain msgs = null;
			if (datadescription != null)
				msgs = ((InternalEObject)datadescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__DATADESCRIPTION, null, msgs);
			if (newDatadescription != null)
				msgs = ((InternalEObject)newDatadescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoreModelPackage.YDIALOG__DATADESCRIPTION, null, msgs);
			msgs = basicSetDatadescription(newDatadescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YDIALOG__DATADESCRIPTION, newDatadescription, newDatadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint createValueEndpoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				if (valueBindingEndpoint != null)
					msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
				return basicSetValueBindingEndpoint((YEmbeddableValueEndpoint)otherEnd, msgs);
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
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				return basicSetValueBindingEndpoint(null, msgs);
			case CoreModelPackage.YDIALOG__CONTENT:
				return basicSetContent(null, msgs);
			case CoreModelPackage.YDIALOG__DATADESCRIPTION:
				return basicSetDatadescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YDIALOG__ID:
				return getId();
			case CoreModelPackage.YDIALOG__NAME:
				return getName();
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				if (resolve) return getValueBindingEndpoint();
				return basicGetValueBindingEndpoint();
			case CoreModelPackage.YDIALOG__CSS_CLASS:
				return getCssClass();
			case CoreModelPackage.YDIALOG__CSS_ID:
				return getCssID();
			case CoreModelPackage.YDIALOG__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case CoreModelPackage.YDIALOG__MODAL:
				return isModal();
			case CoreModelPackage.YDIALOG__RESIZEABLE:
				return isResizeable();
			case CoreModelPackage.YDIALOG__DRAGGABLE:
				return isDraggable();
			case CoreModelPackage.YDIALOG__CLOSABLE:
				return isClosable();
			case CoreModelPackage.YDIALOG__VALUE:
				return getValue();
			case CoreModelPackage.YDIALOG__TYPE:
				return getType();
			case CoreModelPackage.YDIALOG__EMF_NS_URI:
				return getEmfNsURI();
			case CoreModelPackage.YDIALOG__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case CoreModelPackage.YDIALOG__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YDIALOG__ID:
				setId((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__NAME:
				setName((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)newValue);
				return;
			case CoreModelPackage.YDIALOG__CSS_CLASS:
				setCssClass((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__CSS_ID:
				setCssID((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__CONTENT:
				setContent((YEmbeddable)newValue);
				return;
			case CoreModelPackage.YDIALOG__MODAL:
				setModal((Boolean)newValue);
				return;
			case CoreModelPackage.YDIALOG__RESIZEABLE:
				setResizeable((Boolean)newValue);
				return;
			case CoreModelPackage.YDIALOG__DRAGGABLE:
				setDraggable((Boolean)newValue);
				return;
			case CoreModelPackage.YDIALOG__CLOSABLE:
				setClosable((Boolean)newValue);
				return;
			case CoreModelPackage.YDIALOG__VALUE:
				setValue(newValue);
				return;
			case CoreModelPackage.YDIALOG__TYPE:
				setType((Class<?>)newValue);
				return;
			case CoreModelPackage.YDIALOG__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
				return;
			case CoreModelPackage.YDIALOG__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
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
			case CoreModelPackage.YDIALOG__ID:
				setId(ID_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)null);
				return;
			case CoreModelPackage.YDIALOG__CSS_CLASS:
				setCssClass(CSS_CLASS_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__CSS_ID:
				setCssID(CSS_ID_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__CONTENT:
				setContent((YEmbeddable)null);
				return;
			case CoreModelPackage.YDIALOG__MODAL:
				setModal(MODAL_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__RESIZEABLE:
				setResizeable(RESIZEABLE_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__DRAGGABLE:
				setDraggable(DRAGGABLE_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__CLOSABLE:
				setClosable(CLOSABLE_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__TYPE:
				setType((Class<?>)null);
				return;
			case CoreModelPackage.YDIALOG__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
			case CoreModelPackage.YDIALOG__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
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
			case CoreModelPackage.YDIALOG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CoreModelPackage.YDIALOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT:
				return valueBindingEndpoint != null;
			case CoreModelPackage.YDIALOG__CSS_CLASS:
				return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
			case CoreModelPackage.YDIALOG__CSS_ID:
				return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT.equals(cssID);
			case CoreModelPackage.YDIALOG__CONTENT:
				return content != null;
			case CoreModelPackage.YDIALOG__MODAL:
				return modal != MODAL_EDEFAULT;
			case CoreModelPackage.YDIALOG__RESIZEABLE:
				return resizeable != RESIZEABLE_EDEFAULT;
			case CoreModelPackage.YDIALOG__DRAGGABLE:
				return draggable != DRAGGABLE_EDEFAULT;
			case CoreModelPackage.YDIALOG__CLOSABLE:
				return closable != CLOSABLE_EDEFAULT;
			case CoreModelPackage.YDIALOG__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CoreModelPackage.YDIALOG__TYPE:
				return type != null;
			case CoreModelPackage.YDIALOG__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case CoreModelPackage.YDIALOG__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
			case CoreModelPackage.YDIALOG__DATADESCRIPTION:
				return datadescription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT: return CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YDIALOG__CSS_CLASS: return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
				case CoreModelPackage.YDIALOG__CSS_ID: return CoreModelPackage.YCSS_ABLE__CSS_ID;
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
		if (baseClass == YBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT: return CoreModelPackage.YDIALOG__VALUE_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCSS_ABLE__CSS_CLASS: return CoreModelPackage.YDIALOG__CSS_CLASS;
				case CoreModelPackage.YCSS_ABLE__CSS_ID: return CoreModelPackage.YDIALOG__CSS_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", name: ");
		result.append(name);
		result.append(", cssClass: ");
		result.append(cssClass);
		result.append(", cssID: ");
		result.append(cssID);
		result.append(", modal: ");
		result.append(modal);
		result.append(", resizeable: ");
		result.append(resizeable);
		result.append(", draggable: ");
		result.append(draggable);
		result.append(", closable: ");
		result.append(closable);
		result.append(", value: ");
		result.append(value);
		result.append(", type: ");
		result.append(type);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(')');
		return result.toString();
	}

	@Override
	public YView getView() {
		return findViewGeneric(eContainer());
	}

	protected YView findViewGeneric(EObject container) {
		if (container == null) {
			return null;
		}
		if (container instanceof YView) {
			return (YView) container;
		} else if (container instanceof YLayout) {
			return ((YLayout) container).getView();
		} else {
			EObject parent = container.eContainer();
			return findViewGeneric(parent);
		}
	}
	
	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescription(label));
		} else {
			ds.setLabel(label);
		}
	}

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}
	
	protected YDatadescription createDatadescription(String label) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabel(label);
		return dsc;
	}

	protected YDatadescription createDatadescriptionForI18n(String i18nKey) {
		YDatadescription dsc = DatatypesFactory.eINSTANCE
				.createYDatadescription();
		dsc.setLabelI18nKey(i18nKey);
		return dsc;
	}

} // YDialogImpl
