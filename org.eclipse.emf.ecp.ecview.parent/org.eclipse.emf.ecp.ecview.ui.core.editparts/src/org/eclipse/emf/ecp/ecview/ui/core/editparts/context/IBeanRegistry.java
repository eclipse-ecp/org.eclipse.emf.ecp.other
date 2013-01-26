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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.context;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.beans.IValueBean;

/**
 * The bean registry. <br>
 * Not intended to be subclassed.
 */
public interface IBeanRegistry {

	public static final String ROOTBEAN_SELECTOR = "http://eclipse.org/emf/emfclient/uimodel/view/rootbean";

	/**
	 * Returns a value bean. It can be used to store transient values related to
	 * the current view. All returned beans should offer PropertyChangeSupport.<br>
	 * If an instance of a value bean for the given selector could be found, it
	 * will be returned. Otherwise a new bean will be created an registered.
	 * <p>
	 * A common use case for value beans would be the sharing of a selected
	 * value. For instance a selection event on a list may write the selection
	 * to a value bean (selector="my.personlist.selection"). And a detail
	 * component can observe this instance of the value bean and reflect its
	 * values. To observe the value change eclipse data binding may be used.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @return valueBean
	 */
	public abstract IValueBean getBean(String selector);

	/**
	 * Returns a value bean that contains the main domain model element. Every
	 * time a new domain model is set to the returned value bean, all observing
	 * ui elements will become notified.
	 * 
	 * @return rootBean
	 */
	IValueBean getRootBean();

	/**
	 * Registers an instance of value bean to the context. It can be accessed by
	 * the selector. See also {@link IValueBean} or {@link #getBean(String)
	 * getValueBean}.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @param bean
	 *            The value bean.
	 * @return
	 */
	void registerBean(String selector, IValueBean bean);

}