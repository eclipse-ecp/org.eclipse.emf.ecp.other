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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi View Set</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getBeanSlots <em>Bean Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYViewSet()
 * @model
 * @generated
 */
public interface YViewSet extends YElement {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.core.YView}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYViewSet_Views()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot
	 * @model opposite="root"
	 * @generated
	 */
	EList<YView> getViews();

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
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYViewSet_BeanSlots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YBeanSlot> getBeanSlots();

	/**
	 * Adds a new bean slot for the given name and type.
	 * 
	 * @param name
	 * @param type
	 * @return
	 */
	YBeanSlot addBeanSlot(String name, Class<?> type);

} // YUiViewSet
