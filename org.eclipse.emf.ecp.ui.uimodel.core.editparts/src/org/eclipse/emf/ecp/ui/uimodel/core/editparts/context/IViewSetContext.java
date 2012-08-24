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
import java.util.List;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;

/**
 * Context containing information about the current {@link IUiViewSetEditpart} instance.
 */
public interface IViewSetContext extends IDisposable {

	/**
	 * Returns the {@link IUiViewSetEditpart} that is related with this context.
	 * 
	 * @return
	 */
	IUiViewSetEditpart getViewSetEditpart();

	/**
	 * Returns a list of contained view contexts.
	 * 
	 * @return
	 */
	List<IViewContext> getViewContexts();

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
	 * Returns a value bean that contains the main domain model element. Every time a new domain model is set to the
	 * returned value bean, all observing ui elements will become notified.
	 * 
	 * @return
	 */
	IValueBean getRootBean();

}
