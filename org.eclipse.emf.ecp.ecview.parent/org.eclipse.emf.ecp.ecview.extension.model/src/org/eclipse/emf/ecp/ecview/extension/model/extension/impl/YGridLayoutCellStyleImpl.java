/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Grid Layout Cell Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl#getSpanInfo <em>Span Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YGridLayoutCellStyleImpl extends MinimalEObjectImpl.Container implements
		YGridLayoutCellStyle {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddable target;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final YAlignment ALIGNMENT_EDEFAULT = YAlignment.UNDEFINED;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected YAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpanInfo() <em>Span Info</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpanInfo()
	 * @generated
	 * @ordered
	 */
	protected YSpanInfo spanInfo;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YGridLayoutCellStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YGRID_LAYOUT_CELL_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (YEmbeddable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(YEmbeddable newTarget) {
		YEmbeddable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(YAlignment newAlignment) {
		YAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YSpanInfo getSpanInfo() {
		if (spanInfo != null && spanInfo.eIsProxy()) {
			InternalEObject oldSpanInfo = (InternalEObject)spanInfo;
			spanInfo = (YSpanInfo)eResolveProxy(oldSpanInfo);
			if (spanInfo != oldSpanInfo) {
				InternalEObject newSpanInfo = (InternalEObject)spanInfo;
				NotificationChain msgs = oldSpanInfo.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, null);
				if (newSpanInfo.eInternalContainer() == null) {
					msgs = newSpanInfo.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, oldSpanInfo, spanInfo));
			}
		}
		return spanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSpanInfo basicGetSpanInfo() {
		return spanInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpanInfo(YSpanInfo newSpanInfo,
			NotificationChain msgs) {
		YSpanInfo oldSpanInfo = spanInfo;
		spanInfo = newSpanInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, oldSpanInfo, newSpanInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanInfo(YSpanInfo newSpanInfo) {
		if (newSpanInfo != spanInfo) {
			NotificationChain msgs = null;
			if (spanInfo != null)
				msgs = ((InternalEObject)spanInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			if (newSpanInfo != null)
				msgs = ((InternalEObject)newSpanInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			msgs = basicSetSpanInfo(newSpanInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO, newSpanInfo, newSpanInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return basicSetSpanInfo(null, msgs);
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
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return getAlignment();
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				if (resolve) return getSpanInfo();
				return basicGetSpanInfo();
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
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YEmbeddable)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment((YAlignment)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YSpanInfo)newValue);
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
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YEmbeddable)null);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YSpanInfo)null);
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
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__TARGET:
				return target != null;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return spanInfo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE___ADD_SPAN_INFO__INT_INT_INT_INT:
				return addSpanInfo((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(')');
		return result.toString();
	}

	/**
	 * Creates and attaches an instance of {@link YSpanInfo}
	 * 
	 * @param col1
	 *            From column
	 * @param row1
	 *            From row
	 * @param col2
	 *            To column
	 * @param row2
	 *            To row
	 * 
	 * @return
	 */
	public YSpanInfo addSpanInfo(int col1, int row1, int col2, int row2) {
		YSpanInfo yInfo = ExtensionModelFactory.eINSTANCE.createYSpanInfo();
		setSpanInfo(yInfo);

		yInfo.setColumnFrom(col1);
		yInfo.setRowFrom(row1);
		yInfo.setColumnTo(col2);
		yInfo.setRowTo(row2);

		return yInfo;
	}

} // YUiGridLayoutCellStyleImpl
