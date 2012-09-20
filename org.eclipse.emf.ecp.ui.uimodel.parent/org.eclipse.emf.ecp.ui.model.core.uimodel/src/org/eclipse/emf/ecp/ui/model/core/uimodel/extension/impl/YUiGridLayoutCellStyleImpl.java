/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Grid Layout Cell Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isGrabHorizontal <em>Grab Horizontal</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isGrabVertical <em>Grab Vertical</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getSpanInfo <em>Span Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiGridLayoutCellStyleImpl extends EObjectImpl implements YUiGridLayoutCellStyle {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected YUiEmbeddable target;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final YUiAlignment ALIGNMENT_EDEFAULT = YUiAlignment.BOTTOM_LEFT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected YUiAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabHorizontal() <em>Grab Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabHorizontal() <em>Grab Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean grabHorizontal = GRAB_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabVertical() <em>Grab Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_VERTICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabVertical() <em>Grab Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean grabVertical = GRAB_VERTICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpanInfo() <em>Span Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanInfo()
	 * @generated
	 * @ordered
	 */
	protected YUiSpanInfo spanInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiGridLayoutCellStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelExtensionPackage.Literals.YUI_GRID_LAYOUT_CELL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiEmbeddable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (YUiEmbeddable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiEmbeddable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(YUiEmbeddable newTarget) {
		YUiEmbeddable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(YUiAlignment newAlignment) {
		YUiAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabHorizontal() {
		return grabHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabHorizontal(boolean newGrabHorizontal) {
		boolean oldGrabHorizontal = grabHorizontal;
		grabHorizontal = newGrabHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL, oldGrabHorizontal, grabHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabVertical() {
		return grabVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabVertical(boolean newGrabVertical) {
		boolean oldGrabVertical = grabVertical;
		grabVertical = newGrabVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL, oldGrabVertical, grabVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiSpanInfo getSpanInfo() {
		return spanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpanInfo(YUiSpanInfo newSpanInfo, NotificationChain msgs) {
		YUiSpanInfo oldSpanInfo = spanInfo;
		spanInfo = newSpanInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, oldSpanInfo, newSpanInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanInfo(YUiSpanInfo newSpanInfo) {
		if (newSpanInfo != spanInfo) {
			NotificationChain msgs = null;
			if (spanInfo != null)
				msgs = ((InternalEObject)spanInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			if (newSpanInfo != null)
				msgs = ((InternalEObject)newSpanInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			msgs = basicSetSpanInfo(newSpanInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, newSpanInfo, newSpanInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return basicSetSpanInfo(null, msgs);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return getAlignment();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL:
				return isGrabHorizontal();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL:
				return isGrabVertical();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return getSpanInfo();
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YUiEmbeddable)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment((YUiAlignment)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL:
				setGrabHorizontal((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL:
				setGrabVertical((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YUiSpanInfo)newValue);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YUiEmbeddable)null);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL:
				setGrabHorizontal(GRAB_HORIZONTAL_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL:
				setGrabVertical(GRAB_VERTICAL_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YUiSpanInfo)null);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				return target != null;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL:
				return grabHorizontal != GRAB_HORIZONTAL_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL:
				return grabVertical != GRAB_VERTICAL_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", grabHorizontal: ");
		result.append(grabHorizontal);
		result.append(", grabVertical: ");
		result.append(grabVertical);
		result.append(')');
		return result.toString();
	}

} //YUiGridLayoutCellStyleImpl
