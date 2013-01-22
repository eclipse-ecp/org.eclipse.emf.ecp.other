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
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Span Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnFrom <em>Column From</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowFrom <em>Row From</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnTo <em>Column To</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowTo <em>Row To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiSpanInfo()
 * @model
 * @generated
 */
public interface YUiSpanInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Column From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The column index of the cell that should contain the Upper-Left-Edge of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column From</em>' attribute.
	 * @see #setColumnFrom(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiSpanInfo_ColumnFrom()
	 * @model
	 * @generated
	 */
	int getColumnFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnFrom <em>Column From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column From</em>' attribute.
	 * @see #getColumnFrom()
	 * @generated
	 */
	void setColumnFrom(int value);

	/**
	 * Returns the value of the '<em><b>Row From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The row index of the cell that should contain the Upper-Left-Edge of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row From</em>' attribute.
	 * @see #setRowFrom(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiSpanInfo_RowFrom()
	 * @model
	 * @generated
	 */
	int getRowFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowFrom <em>Row From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row From</em>' attribute.
	 * @see #getRowFrom()
	 * @generated
	 */
	void setRowFrom(int value);

	/**
	 * Returns the value of the '<em><b>Column To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The column index of the cell that should contain the Lower-Right-Edge of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column To</em>' attribute.
	 * @see #setColumnTo(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiSpanInfo_ColumnTo()
	 * @model
	 * @generated
	 */
	int getColumnTo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnTo <em>Column To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column To</em>' attribute.
	 * @see #getColumnTo()
	 * @generated
	 */
	void setColumnTo(int value);

	/**
	 * Returns the value of the '<em><b>Row To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The row index of the cell that should contain the Lower-Right-Edge of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Row To</em>' attribute.
	 * @see #setRowTo(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiSpanInfo_RowTo()
	 * @model
	 * @generated
	 */
	int getRowTo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowTo <em>Row To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row To</em>' attribute.
	 * @see #getRowTo()
	 * @generated
	 */
	void setRowTo(int value);

} // YUiSpanInfo
