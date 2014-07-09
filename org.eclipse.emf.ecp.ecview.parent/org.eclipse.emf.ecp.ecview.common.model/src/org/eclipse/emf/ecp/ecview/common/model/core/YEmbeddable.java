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
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YUi Embeddable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable#getOrphanDatatypes <em>Orphan Datatypes</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable#getOrphanDatadescriptions <em>Orphan Datadescriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddable()
 * @model abstract="true"
 * @generated
 */
public interface YEmbeddable extends YElement, YCssAble, YVisibleable,
		YVisibilityProcessable {
	/**
	 * Returns the value of the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphan Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Datatypes</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddable_OrphanDatatypes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YDatatype> getOrphanDatatypes();

	/**
	 * Returns the value of the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphan Datadescriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Datadescriptions</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddable_OrphanDatadescriptions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YDatadescription> getOrphanDatadescriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YLayout getParent();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabel(String label);

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabelI18nKey(String i18nKey);
	
	
	/**
	 * Creates a binding endpoint to observe the visible property.
	 * @return
	 */
	YValueBindingEndpoint createVisibleEndpoint();
	
	/**
	 * Creates a binding endpoint to observe the cssId property.
	 * @return
	 */
	YValueBindingEndpoint createCssIdEndpoint();
	
	/**
	 * Creates a binding endpoint to observe the cssClass property.
	 * @return
	 */
	YValueBindingEndpoint createCssClassEndpoint();

} // YUiEmbeddable
