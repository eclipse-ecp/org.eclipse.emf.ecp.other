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
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi Layout</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YLayout#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYLayout()
 * @model
 * @generated
 */
public interface YLayout extends YEmbeddable {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYLayout_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<YEmbeddable> getElements();

	/**
	 * Adds the given element to the list of elements.
	 * 
	 * @param element
	 * @return true, if the element was added
	 */
	boolean addElement(YEmbeddable element);

	/**
	 * Adds the given element to the list of elements at the given position. If
	 * position is greater than list size, the element will be added at the end
	 * of the list.
	 * 
	 * @param index
	 * @param element
	 * 
	 * @throws IllegalArgumentException
	 *             if the object is a duplicate.
	 */
	void insertElement(int index, YEmbeddable element);

	/**
	 * Moves the given element from its current position to the new position.
	 * 
	 * @param newPosition
	 * @param element
	 */
	void moveElement(int newPosition, YEmbeddable element);

	/**
	 * Removes the given element from the elements.
	 * 
	 * @param element
	 * @return true, if the element was removed
	 */
	boolean removeElement(YEmbeddable element);

	/**
	 * Returns the index of the given element. If element is not present then -1
	 * will be returned.
	 * 
	 * @param element
	 * @return the index of the element or -1 if not present.
	 */
	int getIndex(YEmbeddable element);

	/**
	 * Returns the element at the given index.
	 * 
	 * @param index
	 * @return the element at the given index.
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (
	 *             <tt>index &lt; 0 || index &gt;= size()</tt>)
	 */
	YEmbeddable getElement(int index);

} // YUiLayout
