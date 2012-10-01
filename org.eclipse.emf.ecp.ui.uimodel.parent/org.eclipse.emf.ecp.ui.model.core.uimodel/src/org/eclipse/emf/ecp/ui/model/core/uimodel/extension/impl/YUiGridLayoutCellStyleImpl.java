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

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit;
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
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isGrabHorizontalSpace <em>Grab Horizontal Space</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isGrabVerticalSpace <em>Grab Vertical Space</em>}</li>
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
	 * The default value of the '{@link #isGrabHorizontalSpace() <em>Grab Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_HORIZONTAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabHorizontalSpace() <em>Grab Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabHorizontalSpace = GRAB_HORIZONTAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabVerticalSpace() <em>Grab Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_VERTICAL_SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabVerticalSpace() <em>Grab Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean grabVerticalSpace = GRAB_VERTICAL_SPACE_EDEFAULT;

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
	public boolean isGrabHorizontalSpace() {
		return grabHorizontalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabHorizontalSpace(boolean newGrabHorizontalSpace) {
		boolean oldGrabHorizontalSpace = grabHorizontalSpace;
		grabHorizontalSpace = newGrabHorizontalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL_SPACE, oldGrabHorizontalSpace, grabHorizontalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabVerticalSpace() {
		return grabVerticalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabVerticalSpace(boolean newGrabVerticalSpace) {
		boolean oldGrabVerticalSpace = grabVerticalSpace;
		grabVerticalSpace = newGrabVerticalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL_SPACE, oldGrabVerticalSpace, grabVerticalSpace));
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL_SPACE:
				return isGrabHorizontalSpace();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL_SPACE:
				return isGrabVerticalSpace();
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL_SPACE:
				setGrabHorizontalSpace((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL_SPACE:
				setGrabVerticalSpace((Boolean)newValue);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL_SPACE:
				setGrabHorizontalSpace(GRAB_HORIZONTAL_SPACE_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL_SPACE:
				setGrabVerticalSpace(GRAB_VERTICAL_SPACE_EDEFAULT);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL_SPACE:
				return grabHorizontalSpace != GRAB_HORIZONTAL_SPACE_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL_SPACE:
				return grabVerticalSpace != GRAB_VERTICAL_SPACE_EDEFAULT;
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
		result.append(", grabHorizontalSpace: ");
		result.append(grabHorizontalSpace);
		result.append(", grabVerticalSpace: ");
		result.append(grabVerticalSpace);
		result.append(')');
		return result.toString();
	}

} //YUiGridLayoutCellStyleImpl
