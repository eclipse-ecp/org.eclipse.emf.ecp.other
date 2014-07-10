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
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YMasterDetailDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YMasterDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YMaster Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getEmfNsURI <em>Emf Ns URI</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getDetailElement <em>Detail Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YMasterDetailImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YMasterDetailImpl extends YInputImpl implements YMasterDetail {
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
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YMasterDetailDatatype datatype;

	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Object SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Object selection = SELECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> collection;

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
	 * The cached value of the '{@link #getMasterElement() <em>Master Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterElement()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable masterElement;

	/**
	 * The cached value of the '{@link #getDetailElement() <em>Detail Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailElement()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable detailElement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YMasterDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YMASTER_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableCollectionEndpoint getCollectionBindingEndpoint() {
		if (collectionBindingEndpoint != null && collectionBindingEndpoint.eIsProxy()) {
			InternalEObject oldCollectionBindingEndpoint = (InternalEObject)collectionBindingEndpoint;
			collectionBindingEndpoint = (YEmbeddableCollectionEndpoint)eResolveProxy(oldCollectionBindingEndpoint);
			if (collectionBindingEndpoint != oldCollectionBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT, oldCollectionBindingEndpoint, collectionBindingEndpoint));
			}
		}
		return collectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT, oldCollectionBindingEndpoint, newCollectionBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionBindingEndpoint(YEmbeddableCollectionEndpoint newCollectionBindingEndpoint) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT, newCollectionBindingEndpoint, newCollectionBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint getSelectionBindingEndpoint() {
		if (selectionBindingEndpoint != null && selectionBindingEndpoint.eIsProxy()) {
			InternalEObject oldSelectionBindingEndpoint = (InternalEObject)selectionBindingEndpoint;
			selectionBindingEndpoint = (YEmbeddableSelectionEndpoint)eResolveProxy(oldSelectionBindingEndpoint);
			if (selectionBindingEndpoint != oldSelectionBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT, oldSelectionBindingEndpoint, selectionBindingEndpoint));
			}
		}
		return selectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint basicGetSelectionBindingEndpoint() {
		return selectionBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionBindingEndpoint(YEmbeddableSelectionEndpoint newSelectionBindingEndpoint, NotificationChain msgs) {
		YEmbeddableSelectionEndpoint oldSelectionBindingEndpoint = selectionBindingEndpoint;
		selectionBindingEndpoint = newSelectionBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT, oldSelectionBindingEndpoint, newSelectionBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionBindingEndpoint(YEmbeddableSelectionEndpoint newSelectionBindingEndpoint) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT, newSelectionBindingEndpoint, newSelectionBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMasterDetailDatatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (YMasterDetailDatatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMasterDetailDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(YMasterDetailDatatype newDatatype) {
		YMasterDetailDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__DATATYPE, oldDatatype, datatype));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION, oldDatadescription, datadescription));
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
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Object newSelection) {
		Object oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getCollection() {
		if (collection == null) {
			collection = new EDataTypeUniqueEList<Object>(Object.class, this, ExtensionModelPackage.YMASTER_DETAIL__COLLECTION);
		}
		return collection;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__EMF_NS_URI, oldEmfNsURI, emfNsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getMasterElement() {
		if (masterElement != null && masterElement.eIsProxy()) {
			InternalEObject oldMasterElement = (InternalEObject)masterElement;
			masterElement = (YEmbeddable)eResolveProxy(oldMasterElement);
			if (masterElement != oldMasterElement) {
				InternalEObject newMasterElement = (InternalEObject)masterElement;
				NotificationChain msgs = oldMasterElement.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, null, null);
				if (newMasterElement.eInternalContainer() == null) {
					msgs = newMasterElement.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, oldMasterElement, masterElement));
			}
		}
		return masterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetMasterElement() {
		return masterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterElement(YEmbeddable newMasterElement, NotificationChain msgs) {
		YEmbeddable oldMasterElement = masterElement;
		masterElement = newMasterElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, oldMasterElement, newMasterElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterElement(YEmbeddable newMasterElement) {
		if (newMasterElement != masterElement) {
			NotificationChain msgs = null;
			if (masterElement != null)
				msgs = ((InternalEObject)masterElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, null, msgs);
			if (newMasterElement != null)
				msgs = ((InternalEObject)newMasterElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, null, msgs);
			msgs = basicSetMasterElement(newMasterElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT, newMasterElement, newMasterElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getDetailElement() {
		if (detailElement != null && detailElement.eIsProxy()) {
			InternalEObject oldDetailElement = (InternalEObject)detailElement;
			detailElement = (YEmbeddable)eResolveProxy(oldDetailElement);
			if (detailElement != oldDetailElement) {
				InternalEObject newDetailElement = (InternalEObject)detailElement;
				NotificationChain msgs = oldDetailElement.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, null, null);
				if (newDetailElement.eInternalContainer() == null) {
					msgs = newDetailElement.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, oldDetailElement, detailElement));
			}
		}
		return detailElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetDetailElement() {
		return detailElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailElement(YEmbeddable newDetailElement, NotificationChain msgs) {
		YEmbeddable oldDetailElement = detailElement;
		detailElement = newDetailElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, oldDetailElement, newDetailElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailElement(YEmbeddable newDetailElement) {
		if (newDetailElement != detailElement) {
			NotificationChain msgs = null;
			if (detailElement != null)
				msgs = ((InternalEObject)detailElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, null, msgs);
			if (newDetailElement != null)
				msgs = ((InternalEObject)newDetailElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, null, msgs);
			msgs = basicSetDetailElement(newDetailElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT, newDetailElement, newDetailElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YMASTER_DETAIL__TYPE_QUALIFIED_NAME, oldTypeQualifiedName, typeQualifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint createSelectionEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				if (collectionBindingEndpoint != null)
					msgs = ((InternalEObject)collectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT, YEmbeddableCollectionEndpoint.class, msgs);
				return basicSetCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)otherEnd, msgs);
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				if (selectionBindingEndpoint != null)
					msgs = ((InternalEObject)selectionBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, YEmbeddableSelectionEndpoint.class, msgs);
				return basicSetSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)otherEnd, msgs);
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
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				return basicSetCollectionBindingEndpoint(null, msgs);
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				return basicSetSelectionBindingEndpoint(null, msgs);
			case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
				return basicSetMasterElement(null, msgs);
			case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
				return basicSetDetailElement(null, msgs);
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
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				if (resolve) return getCollectionBindingEndpoint();
				return basicGetCollectionBindingEndpoint();
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				if (resolve) return getSelectionBindingEndpoint();
				return basicGetSelectionBindingEndpoint();
			case ExtensionModelPackage.YMASTER_DETAIL__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION:
				return getSelection();
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION:
				return getCollection();
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE:
				return getType();
			case ExtensionModelPackage.YMASTER_DETAIL__EMF_NS_URI:
				return getEmfNsURI();
			case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
				if (resolve) return getMasterElement();
				return basicGetMasterElement();
			case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
				if (resolve) return getDetailElement();
				return basicGetDetailElement();
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
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
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				setCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				setSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DATATYPE:
				setDatatype((YMasterDetailDatatype)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION:
				setSelection(newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION:
				getCollection().clear();
				getCollection().addAll((Collection<? extends Object>)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE:
				setType((Class<?>)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__EMF_NS_URI:
				setEmfNsURI((String)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
				setMasterElement((YEmbeddable)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
				setDetailElement((YEmbeddable)newValue);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((String)newValue);
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
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				setCollectionBindingEndpoint((YEmbeddableCollectionEndpoint)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				setSelectionBindingEndpoint((YEmbeddableSelectionEndpoint)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DATATYPE:
				setDatatype((YMasterDetailDatatype)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION:
				getCollection().clear();
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE:
				setType((Class<?>)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__EMF_NS_URI:
				setEmfNsURI(EMF_NS_URI_EDEFAULT);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
				setMasterElement((YEmbeddable)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
				setDetailElement((YEmbeddable)null);
				return;
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName(TYPE_QUALIFIED_NAME_EDEFAULT);
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
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT:
				return collectionBindingEndpoint != null;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT:
				return selectionBindingEndpoint != null;
			case ExtensionModelPackage.YMASTER_DETAIL__DATATYPE:
				return datatype != null;
			case ExtensionModelPackage.YMASTER_DETAIL__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YMASTER_DETAIL__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION:
				return collection != null && !collection.isEmpty();
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE:
				return type != null;
			case ExtensionModelPackage.YMASTER_DETAIL__EMF_NS_URI:
				return EMF_NS_URI_EDEFAULT == null ? emfNsURI != null : !EMF_NS_URI_EDEFAULT.equals(emfNsURI);
			case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
				return masterElement != null;
			case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
				return detailElement != null;
			case ExtensionModelPackage.YMASTER_DETAIL__TYPE_QUALIFIED_NAME:
				return TYPE_QUALIFIED_NAME_EDEFAULT == null ? typeQualifiedName != null : !TYPE_QUALIFIED_NAME_EDEFAULT.equals(typeQualifiedName);
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
		if (baseClass == YBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YCollectionBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT: return CoreModelPackage.YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YSelectionBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT: return CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT;
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
		if (baseClass == YBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YCollectionBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT: return ExtensionModelPackage.YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT;
				default: return -1;
			}
		}
		if (baseClass == YSelectionBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT: return ExtensionModelPackage.YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT;
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
		result.append(" (selection: ");
		result.append(selection);
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

} //YMasterDetailImpl
