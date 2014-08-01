/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSelectionType;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Table</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getSelectionType <em>Selection Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getMultiSelection <em>Multi Selection</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YTableImpl extends YInputImpl implements YTable {
	/**
	 * The cached value of the '{@link #getCollectionBindingEndpoint() <em>Collection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableCollectionEndpoint collectionBindingEndpoint;
	/**
	 * The cached value of the '{@link #getSelectionBindingEndpoint() <em>Selection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableSelectionEndpoint selectionBindingEndpoint;
	/**
	 * The cached value of the '{@link #getMultiSelectionBindingEndpoint() <em>Multi Selection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSelectionBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableMultiSelectionEndpoint multiSelectionBindingEndpoint;
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YTableDatatype datatype;
	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected static final YSelectionType SELECTION_TYPE_EDEFAULT = YSelectionType.SINGLE;
	/**
	 * The cached value of the '{@link #getSelectionType() <em>Selection Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSelectionType()
	 * @generated
	 * @ordered
	 */
	protected YSelectionType selectionType = SELECTION_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Object SELECTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Object selection = SELECTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMultiSelection() <em>Multi Selection</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> multiSelection;
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> collection;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<YColumn> columns;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YTABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableCollectionEndpoint getCollectionBindingEndpoint() {
		if (collectionBindingEndpoint != null && collectionBindingEndpoint.eIsProxy()) {
			InternalEObject oldCollectionBindingEndpoint = (InternalEObject)collectionBindingEndpoint;
			collectionBindingEndpoint = (YEmbeddableCollectionEndpoint)eResolveProxy(oldCollectionBindingEndpoint);
			if (collectionBindingEndpoint != oldCollectionBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT, oldCollectionBindingEndpoint, collectionBindingEndpoint));
			}
		}
		return collectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableCollectionEndpoint basicGetCollectionBindingEndpoint() {
		return collectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionBindingEndpoint(YEmbeddableCollectionEndpoint newCollectionBindingEndpoint, NotificationChain msgs) {
		YEmbeddableCollectionEndpoint oldCollectionBindingEndpoint = collectionBindingEndpoint;
		collectionBindingEndpoint = newCollectionBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT, oldCollectionBindingEndpoint, newCollectionBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionBindingEndpoint(
			YEmbeddableCollectionEndpoint newCollectionBindingEndpoint) {
		if (newCollectionBindingEndpoint != collectionBindingEndpoint) {
			NotificationChain msgs = null;
			if (collectionBindingEndpoint != null)
				msgs = ((InternalEObject)collectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT, YEmbeddableCollectionEndpoint.class, msgs);
			if (newCollectionBindingEndpoint != null)
				msgs = ((InternalEObject)newCollectionBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT, YEmbeddableCollectionEndpoint.class, msgs);
			msgs = basicSetCollectionBindingEndpoint(newCollectionBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT, newCollectionBindingEndpoint, newCollectionBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint getSelectionBindingEndpoint() {
		if (selectionBindingEndpoint != null && selectionBindingEndpoint.eIsProxy()) {
			InternalEObject oldSelectionBindingEndpoint = (InternalEObject)selectionBindingEndpoint;
			selectionBindingEndpoint = (YEmbeddableSelectionEndpoint)eResolveProxy(oldSelectionBindingEndpoint);
			if (selectionBindingEndpoint != oldSelectionBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT, oldSelectionBindingEndpoint, selectionBindingEndpoint));
			}
		}
		return selectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint basicGetSelectionBindingEndpoint() {
		return selectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBindingEndpoint(
			YEmbeddableSelectionEndpoint newSelectionBindingEndpoint,
			NotificationChain msgs) {
		YEmbeddableSelectionEndpoint oldSelectionBindingEndpoint = selectionBindingEndpoint;
		selectionBindingEndpoint = newSelectionBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT, oldSelectionBindingEndpoint, newSelectionBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBindingEndpoint(
			YEmbeddableSelectionEndpoint newSelectionBindingEndpoint) {
		if (newSelectionBindingEndpoint != selectionBindingEndpoint) {
			NotificationChain msgs = null;
			if (selectionBindingEndpoint != null)
				msgs = ((InternalEObject)selectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, YEmbeddableSelectionEndpoint.class, msgs);
			if (newSelectionBindingEndpoint != null)
				msgs = ((InternalEObject)newSelectionBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, YEmbeddableSelectionEndpoint.class, msgs);
			msgs = basicSetSelectionBindingEndpoint(newSelectionBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT, newSelectionBindingEndpoint, newSelectionBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableMultiSelectionEndpoint getMultiSelectionBindingEndpoint() {
		if (multiSelectionBindingEndpoint != null && multiSelectionBindingEndpoint.eIsProxy()) {
			InternalEObject oldMultiSelectionBindingEndpoint = (InternalEObject)multiSelectionBindingEndpoint;
			multiSelectionBindingEndpoint = (YEmbeddableMultiSelectionEndpoint)eResolveProxy(oldMultiSelectionBindingEndpoint);
			if (multiSelectionBindingEndpoint != oldMultiSelectionBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT, oldMultiSelectionBindingEndpoint, multiSelectionBindingEndpoint));
			}
		}
		return multiSelectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableMultiSelectionEndpoint basicGetMultiSelectionBindingEndpoint() {
		return multiSelectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSelectionBindingEndpoint(YEmbeddableMultiSelectionEndpoint newMultiSelectionBindingEndpoint, NotificationChain msgs) {
		YEmbeddableMultiSelectionEndpoint oldMultiSelectionBindingEndpoint = multiSelectionBindingEndpoint;
		multiSelectionBindingEndpoint = newMultiSelectionBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT, oldMultiSelectionBindingEndpoint, newMultiSelectionBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSelectionBindingEndpoint(YEmbeddableMultiSelectionEndpoint newMultiSelectionBindingEndpoint) {
		if (newMultiSelectionBindingEndpoint != multiSelectionBindingEndpoint) {
			NotificationChain msgs = null;
			if (multiSelectionBindingEndpoint != null)
				msgs = ((InternalEObject)multiSelectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT, YEmbeddableMultiSelectionEndpoint.class, msgs);
			if (newMultiSelectionBindingEndpoint != null)
				msgs = ((InternalEObject)newMultiSelectionBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT, YEmbeddableMultiSelectionEndpoint.class, msgs);
			msgs = basicSetMultiSelectionBindingEndpoint(newMultiSelectionBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT, newMultiSelectionBindingEndpoint, newMultiSelectionBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YTableDatatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (YTableDatatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTABLE__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YTableDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(YTableDatatype newDatatype) {
		YTableDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YTABLE__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YSelectionType getSelectionType() {
		return selectionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionType(YSelectionType newSelectionType) {
		YSelectionType oldSelectionType = selectionType;
		selectionType = newSelectionType == null ? SELECTION_TYPE_EDEFAULT : newSelectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__SELECTION_TYPE, oldSelectionType, selectionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Object newSelection) {
		Object oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getMultiSelection() {
		if (multiSelection == null) {
			multiSelection = new EDataTypeUniqueEList<Object>(Object.class, this, ExtensionModelPackage.YTABLE__MULTI_SELECTION);
		}
		return multiSelection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getCollection() {
		if (collection == null) {
			collection = new EDataTypeUniqueEList<Object>(Object.class, this, ExtensionModelPackage.YTABLE__COLLECTION);
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__EMF_NS_URI, oldEmfNsURI, emfNsURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList.Resolving<YColumn>(YColumn.class, this, ExtensionModelPackage.YTABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableMultiSelectionEndpoint createMultiSelectionEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint createSelectionEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableCollectionEndpoint createCollectionEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new instance of selection endpoint with a reference to that
	 * embeddable.
	 * 
	 * @generated NOT
	 */
	public YEmbeddableSelectionEndpoint createSelectionEndpoint() {
		YEmbeddableSelectionEndpoint ep = CoreModelFactory.eINSTANCE
				.createYEmbeddableSelectionEndpoint();
		ep.setElement(this);
		return ep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YEmbeddableMultiSelectionEndpoint createMultiSelectionEndpoint() {
		YEmbeddableMultiSelectionEndpoint ep = CoreModelFactory.eINSTANCE
				.createYEmbeddableMultiSelectionEndpoint();
		ep.setElement(this);
		return ep;
	}

	/**
	 * Creates a new instance of collection endpoint with a reference to that
	 * embeddable.
	 * 
	 * @generated NOT
	 */
	public YEmbeddableCollectionEndpoint createCollectionEndpoint() {
		YEmbeddableCollectionEndpoint ep = CoreModelFactory.eINSTANCE
				.createYEmbeddableCollectionEndpoint();
		ep.setElement(this);
		return ep;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				if (collectionBindingEndpoint != null)
					msgs = ((InternalEObject)collectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT, YEmbeddableCollectionEndpoint.class, msgs);
				return basicSetCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)otherEnd, msgs);
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				if (selectionBindingEndpoint != null)
					msgs = ((InternalEObject)selectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, YEmbeddableSelectionEndpoint.class, msgs);
				return basicSetSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)otherEnd, msgs);
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				if (multiSelectionBindingEndpoint != null)
					msgs = ((InternalEObject)multiSelectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT, YEmbeddableMultiSelectionEndpoint.class, msgs);
				return basicSetMultiSelectionBindingEndpoint((YEmbeddableMultiSelectionEndpoint)otherEnd, msgs);
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
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				return basicSetCollectionBindingEndpoint(null, msgs);
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				return basicSetSelectionBindingEndpoint(null, msgs);
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				return basicSetMultiSelectionBindingEndpoint(null, msgs);
			case ExtensionModelPackage.YTABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				if (resolve) return getCollectionBindingEndpoint();
				return basicGetCollectionBindingEndpoint();
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				if (resolve) return getSelectionBindingEndpoint();
				return basicGetSelectionBindingEndpoint();
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				if (resolve) return getMultiSelectionBindingEndpoint();
				return basicGetMultiSelectionBindingEndpoint();
			case ExtensionModelPackage.YTABLE__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case ExtensionModelPackage.YTABLE__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YTABLE__SELECTION_TYPE:
				return getSelectionType();
			case ExtensionModelPackage.YTABLE__SELECTION:
				return getSelection();
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION:
				return getMultiSelection();
			case ExtensionModelPackage.YTABLE__COLLECTION:
				return getCollection();
			case ExtensionModelPackage.YTABLE__TYPE:
				return getType();
			case ExtensionModelPackage.YTABLE__EMF_NS_URI:
				return getEmfNsURI();
			case ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case ExtensionModelPackage.YTABLE__COLUMNS:
				return getColumns();
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
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				setCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)newValue);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				setSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)newValue);
				return;
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				setMultiSelectionBindingEndpoint((YEmbeddableMultiSelectionEndpoint)newValue);
				return;
			case ExtensionModelPackage.YTABLE__DATATYPE:
				setDatatype((YTableDatatype)newValue);
				return;
			case ExtensionModelPackage.YTABLE__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION_TYPE:
				setSelectionType((YSelectionType)newValue);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION:
				setSelection(newValue);
				return;
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION:
				getMultiSelection().clear();
				getMultiSelection().addAll((Collection<? extends Object>)newValue);
				return;
			case ExtensionModelPackage.YTABLE__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends Object>)newValue);
				return;
			case ExtensionModelPackage.YTABLE__TYPE:
				setType((Class<?>)newValue);
				return;
			case ExtensionModelPackage.YTABLE__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
				return;
			case ExtensionModelPackage.YTABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends YColumn>)newValue);
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
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				setCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)null);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				setSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)null);
				return;
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				setMultiSelectionBindingEndpoint((YEmbeddableMultiSelectionEndpoint)null);
				return;
			case ExtensionModelPackage.YTABLE__DATATYPE:
				setDatatype((YTableDatatype)null);
				return;
			case ExtensionModelPackage.YTABLE__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION_TYPE:
				setSelectionType(SELECTION_TYPE_EDEFAULT);
				return;
			case ExtensionModelPackage.YTABLE__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION:
				getMultiSelection().clear();
				return;
			case ExtensionModelPackage.YTABLE__COLLECTION:
				getCollection().clear();
				return;
			case ExtensionModelPackage.YTABLE__TYPE:
				setType((Class<?>)null);
				return;
			case ExtensionModelPackage.YTABLE__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
				return;
			case ExtensionModelPackage.YTABLE__COLUMNS:
				getColumns().clear();
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
			case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT:
				return collectionBindingEndpoint != null;
			case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT:
				return selectionBindingEndpoint != null;
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT:
				return multiSelectionBindingEndpoint != null;
			case ExtensionModelPackage.YTABLE__DATATYPE:
				return datatype != null;
			case ExtensionModelPackage.YTABLE__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YTABLE__SELECTION_TYPE:
				return selectionType != SELECTION_TYPE_EDEFAULT;
			case ExtensionModelPackage.YTABLE__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case ExtensionModelPackage.YTABLE__MULTI_SELECTION:
				return multiSelection != null && !multiSelection.isEmpty();
			case ExtensionModelPackage.YTABLE__COLLECTION:
				return collection != null && !collection.isEmpty();
			case ExtensionModelPackage.YTABLE__TYPE:
				return type != null;
			case ExtensionModelPackage.YTABLE__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case ExtensionModelPackage.YTABLE__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
			case ExtensionModelPackage.YTABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
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
		if (baseClass == YCollectionBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT: return CoreModelPackage.YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YSelectionBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT: return CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YMultiSelectionBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT: return CoreModelPackage.YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT;
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
		if (baseClass == YCollectionBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT: return ExtensionModelPackage.YTABLE__COLLECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YSelectionBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT: return ExtensionModelPackage.YTABLE__SELECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YMultiSelectionBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT: return ExtensionModelPackage.YTABLE__MULTI_SELECTION_BINDING_ENDPOINT;
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
		result.append(" (selectionType: ");
		result.append(selectionType);
		result.append(", selection: ");
		result.append(selection);
		result.append(", multiSelection: ");
		result.append(multiSelection);
		result.append(", collection: ");
		result.append(collection);
		result.append(", type: ");
		result.append(type);
		result.append(", emfNsURI: ");
		result.append(emfNsURI);
		result.append(", typeQualifiedName: ");
		result.append(typeQualifiedName);
		result.append(')');
		return result.toString();
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

} // YUiTableImpl
