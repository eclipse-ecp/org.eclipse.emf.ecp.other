/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YTab</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTabImpl#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTabImpl#getCssClass
 * <em>Css Class</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTabImpl#getCssID
 * <em>Css ID</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTabImpl#getParent
 * <em>Parent</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTabImpl#getEmbeddable
 * <em>Embeddable</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class YTabImpl extends EObjectImpl implements YTab {
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
	 * The default value of the '{@link #getCssClass() <em>Css Class</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssClass() <em>Css Class</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCssClass()
	 * @generated
	 * @ordered
	 */
	protected String cssClass = CSS_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected static final String CSS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCssID() <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCssID()
	 * @generated
	 * @ordered
	 */
	protected String cssID = CSS_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable embeddable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YTabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YTAB;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTAB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCssClass() {
		return cssClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCssClass(String newCssClass) {
		String oldCssClass = cssClass;
		cssClass = newCssClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTAB__CSS_CLASS, oldCssClass,
					cssClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCssID() {
		return cssID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCssID(String newCssID) {
		String oldCssID = cssID;
		cssID = newCssID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTAB__CSS_ID, oldCssID, cssID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YTabSheet getParent() {
		if (eContainerFeatureID() != ExtensionModelPackage.YTAB__PARENT)
			return null;
		return (YTabSheet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParent(YTabSheet newParent,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent,
				ExtensionModelPackage.YTAB__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParent(YTabSheet newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != ExtensionModelPackage.YTAB__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newParent))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this,
						ExtensionModelPackage.YTAB_SHEET__TABS,
						YTabSheet.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTAB__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YEmbeddable getEmbeddable() {
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEmbeddable(YEmbeddable newEmbeddable,
			NotificationChain msgs) {
		YEmbeddable oldEmbeddable = embeddable;
		embeddable = newEmbeddable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ExtensionModelPackage.YTAB__EMBEDDABLE,
					oldEmbeddable, newEmbeddable);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEmbeddable(YEmbeddable newEmbeddable) {
		if (newEmbeddable != embeddable) {
			NotificationChain msgs = null;
			if (embeddable != null)
				msgs = ((InternalEObject) embeddable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ExtensionModelPackage.YTAB__EMBEDDABLE, null,
						msgs);
			if (newEmbeddable != null)
				msgs = ((InternalEObject) newEmbeddable).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ExtensionModelPackage.YTAB__EMBEDDABLE, null,
						msgs);
			msgs = basicSetEmbeddable(newEmbeddable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTAB__EMBEDDABLE, newEmbeddable,
					newEmbeddable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YView getViewGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YView getView() {
		EObject container = eContainer();
		if (container instanceof YView) {
			return (YView) container;
		} else if (container instanceof YTabSheet) {
			return ((YTabSheet) container).getView();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((YTabSheet) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__PARENT:
			return basicSetParent(null, msgs);
		case ExtensionModelPackage.YTAB__EMBEDDABLE:
			return basicSetEmbeddable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ExtensionModelPackage.YTAB__PARENT:
			return eInternalContainer().eInverseRemove(this,
					ExtensionModelPackage.YTAB_SHEET__TABS, YTabSheet.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__ID:
			return getId();
		case ExtensionModelPackage.YTAB__CSS_CLASS:
			return getCssClass();
		case ExtensionModelPackage.YTAB__CSS_ID:
			return getCssID();
		case ExtensionModelPackage.YTAB__PARENT:
			return getParent();
		case ExtensionModelPackage.YTAB__EMBEDDABLE:
			return getEmbeddable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__ID:
			setId((String) newValue);
			return;
		case ExtensionModelPackage.YTAB__CSS_CLASS:
			setCssClass((String) newValue);
			return;
		case ExtensionModelPackage.YTAB__CSS_ID:
			setCssID((String) newValue);
			return;
		case ExtensionModelPackage.YTAB__PARENT:
			setParent((YTabSheet) newValue);
			return;
		case ExtensionModelPackage.YTAB__EMBEDDABLE:
			setEmbeddable((YEmbeddable) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__ID:
			setId(ID_EDEFAULT);
			return;
		case ExtensionModelPackage.YTAB__CSS_CLASS:
			setCssClass(CSS_CLASS_EDEFAULT);
			return;
		case ExtensionModelPackage.YTAB__CSS_ID:
			setCssID(CSS_ID_EDEFAULT);
			return;
		case ExtensionModelPackage.YTAB__PARENT:
			setParent((YTabSheet) null);
			return;
		case ExtensionModelPackage.YTAB__EMBEDDABLE:
			setEmbeddable((YEmbeddable) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExtensionModelPackage.YTAB__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ExtensionModelPackage.YTAB__CSS_CLASS:
			return CSS_CLASS_EDEFAULT == null ? cssClass != null
					: !CSS_CLASS_EDEFAULT.equals(cssClass);
		case ExtensionModelPackage.YTAB__CSS_ID:
			return CSS_ID_EDEFAULT == null ? cssID != null : !CSS_ID_EDEFAULT
					.equals(cssID);
		case ExtensionModelPackage.YTAB__PARENT:
			return getParent() != null;
		case ExtensionModelPackage.YTAB__EMBEDDABLE:
			return embeddable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (derivedFeatureID) {
			case ExtensionModelPackage.YTAB__CSS_CLASS:
				return CoreModelPackage.YCSS_ABLE__CSS_CLASS;
			case ExtensionModelPackage.YTAB__CSS_ID:
				return CoreModelPackage.YCSS_ABLE__CSS_ID;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YCssAble.class) {
			switch (baseFeatureID) {
			case CoreModelPackage.YCSS_ABLE__CSS_CLASS:
				return ExtensionModelPackage.YTAB__CSS_CLASS;
			case CoreModelPackage.YCSS_ABLE__CSS_ID:
				return ExtensionModelPackage.YTAB__CSS_ID;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

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

} // YTabImpl
