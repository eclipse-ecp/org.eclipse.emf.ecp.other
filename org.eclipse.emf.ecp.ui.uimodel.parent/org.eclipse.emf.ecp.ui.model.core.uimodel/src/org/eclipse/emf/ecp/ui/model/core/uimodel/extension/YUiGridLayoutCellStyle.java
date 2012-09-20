/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Grid Layout Cell Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabHorizontal <em>Grab Horizontal</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabVertical <em>Grab Vertical</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle()
 * @model
 * @generated
 */
public interface YUiGridLayoutCellStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(YUiEmbeddable)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle_Target()
	 * @model required="true"
	 * @generated
	 */
	YUiEmbeddable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(YUiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see #setAlignment(YUiAlignment)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle_Alignment()
	 * @model
	 * @generated
	 */
	YUiAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(YUiAlignment value);

	/**
	 * Returns the value of the '<em><b>Grab Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Horizontal</em>' attribute.
	 * @see #setGrabHorizontal(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle_GrabHorizontal()
	 * @model
	 * @generated
	 */
	boolean isGrabHorizontal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabHorizontal <em>Grab Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Horizontal</em>' attribute.
	 * @see #isGrabHorizontal()
	 * @generated
	 */
	void setGrabHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Grab Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Vertical</em>' attribute.
	 * @see #setGrabVertical(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle_GrabVertical()
	 * @model
	 * @generated
	 */
	boolean isGrabVertical();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabVertical <em>Grab Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Vertical</em>' attribute.
	 * @see #isGrabVertical()
	 * @generated
	 */
	void setGrabVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span Info</em>' containment reference.
	 * @see #setSpanInfo(YUiSpanInfo)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiGridLayoutCellStyle_SpanInfo()
	 * @model containment="true"
	 * @generated
	 */
	YUiSpanInfo getSpanInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Info</em>' containment reference.
	 * @see #getSpanInfo()
	 * @generated
	 */
	void setSpanInfo(YUiSpanInfo value);

} // YUiGridLayoutCellStyle
