/*******************************************************************************
 * Copyright (c) 2012 Florian Pirchner and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.context;

import java.beans.PropertyChangeSupport;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;

/**
 * Context containing information about the current {@link IUiViewEditpart} instance.
 */
public interface IViewContext extends IDisposable {

	/**
	 * Returns the URI that specifies the ui kit to be used.
	 * 
	 * @return
	 */
	String getPresentationURI();

	/**
	 * Returns the {@link IUiViewEditpart} that is related with this context.
	 * 
	 * @return
	 */
	IUiViewEditpart getViewEditpart();

	/**
	 * Returns the view set context of the parent edit part or <code>null</code> if no parent exists.
	 * 
	 * @return
	 */
	IViewSetContext getParentContext();

	/**
	 * Returns a value bean. It can be used to store transient values related to the current view. All returned beans
	 * should offer {@link PropertyChangeSupport}.<br>
	 * If an instance of a value bean for the given selector could be found, it will be returned. Otherwise a new bean
	 * will be created an registered.
	 * <p>
	 * A common use case for value beans would be the sharing of a selected value. For instance a selection event on a
	 * list may write the selection to a value bean (selector="my.personlist.selection"). And a detail component can
	 * observe this instance of the value bean and reflect its values. To observe the value change eclipse data binding
	 * may be used.
	 * 
	 * @param selector The selector string to identify the value bean instance.
	 * @return
	 */
	IValueBean getValueBean(String selector);

	/**
	 * Returns the root layout where all UI elements should be child elements from it.
	 * 
	 * @return
	 */
	Object getRootLayout();

	/**
	 * Sets the root layout where all UI elements should be child elements from it. If a root layout was already set an
	 * {@link ContextException} will be thrown.
	 * 
	 * @return
	 * @throws ContextException if a layout was already set.
	 */
	void setRootLayout(Object rootLayout) throws ContextException;

	/**
	 * Returns a value bean that contains the main domain model element. Every time a new domain model is set to the
	 * returned value bean, all observing ui elements will become notified.
	 * 
	 * @return
	 */
	IValueBean getRootBean();

}
