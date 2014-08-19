/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getBeanSlots <em>Bean Slots</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getCommandSet <em>Command Set</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getDialogs <em>Dialogs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView()
 * @model
 * @generated
 */
public interface YView extends YElement, YCssAble, YMarginable,
		YVisibilityProcessable {
	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_ViewName()
	 * @model
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getViewName
	 * <em>View Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(YEmbeddable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YEmbeddable getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Set</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Set</em>' containment reference.
	 * @see #setBindingSet(YBindingSet)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_BindingSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YBindingSet getBindingSet();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getBindingSet <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Set</em>' containment reference.
	 * @see #getBindingSet()
	 * @generated
	 */
	void setBindingSet(YBindingSet value);

	/**
	 * Returns the value of the '<em><b>Bean Slots</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slots</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bean Slots</em>' containment reference
	 *         list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_BeanSlots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBeanSlot> getBeanSlots();

	/**
	 * Returns the value of the '<em><b>Command Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Set</em>' containment reference.
	 * @see #setCommandSet(YCommandSet)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_CommandSet()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YCommandSet getCommandSet();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getCommandSet <em>Command Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Set</em>' containment reference.
	 * @see #getCommandSet()
	 * @generated
	 */
	void setCommandSet(YCommandSet value);

	/**
	 * Returns the value of the '<em><b>Dialogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogs</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_Dialogs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YDialog> getDialogs();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingSet getOrCreateBindingSet();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(YViewSet)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYView_Root()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getViews
	 * @model opposite="views"
	 * @generated
	 */
	YViewSet getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(YViewSet value);

	/**
	 * Adds a new bean slot for the given name and type.
	 * 
	 * @param name
	 * @param type 
	 * @return
	 */
	YBeanSlot addBeanSlot(String name, Class<?> type);
	
	
	/**
	 * Returns the bean slot for the given name. Or <code>null</code> if no bean slot is available.
	 * 
	 * @param name
	 * @return
	 */
	YBeanSlot getBeanSlot(String name);

} // YUiView
