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
package org.eclipse.emf.ecp.ui.model.core.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#isMargin <em>Margin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiView()
 * @model
 * @generated
 */
public interface YUiView extends YUiElement, YUiCssAble {
	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiView_ViewName()
	 * @model
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(YUiEmbeddable)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiView_Content()
	 * @model containment="true"
	 * @generated
	 */
	YUiEmbeddable getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(YUiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiView_Margin()
	 * @model
	 * @generated
	 */
	boolean isMargin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#isMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #isMargin()
	 * @generated
	 */
	void setMargin(boolean value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(YUiViewSet)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiView_Root()
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet#getViews
	 * @model opposite="views" required="true" transient="false"
	 * @generated
	 */
	YUiViewSet getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(YUiViewSet value);

} // YUiView
