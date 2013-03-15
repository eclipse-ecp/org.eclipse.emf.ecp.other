/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Grid Layout Cell Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYGridLayoutCellStyle()
 * @model
 * @generated
 */
public interface YGridLayoutCellStyle {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(YEmbeddable)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYGridLayoutCellStyle_Target()
	 * @model required="true"
	 * @generated
	 */
	YEmbeddable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The alignment of the ui element relative to its grid cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @see #setAlignment(YAlignment)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYGridLayoutCellStyle_Alignment()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	YAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(YAlignment value);

	/**
	 * Returns the value of the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span Info</em>' containment reference.
	 * @see #setSpanInfo(YSpanInfo)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYGridLayoutCellStyle_SpanInfo()
	 * @model containment="true"
	 * @generated
	 */
	YSpanInfo getSpanInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Info</em>' containment reference.
	 * @see #getSpanInfo()
	 * @generated
	 */
	void setSpanInfo(YSpanInfo value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YSpanInfo addSpanInfo(int col1, int row1, int col2, int row2);

} // YUiGridLayoutCellStyle
