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
package org.eclipse.emf.ecp.ecview.common.services;

import org.eclipse.emf.ecp.ecview.common.binding.IBindingManager;

/**
 * The service registry. <br>
 * Not intended to be subclassed.
 */
public interface IServiceRegistry {

	/**
	 * Defines the sequence of a service. It defined i which order the services
	 * are called. Lower sequences will be called first. See
	 * {@link #PROPERTY__DEFAULT_SQUENCE}.
	 */
	public static final String PROPERTY__SQUENCE = "service.sequence";

	/**
	 * Defines the default sequence used.
	 */
	public static final int PROPERTY__DEFAULT_SQUENCE = 100;

	/**
	 * Returns a service. It can be used to store transient values related to
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
	public abstract <S> S getService(String selector);

	/**
	 * Registers an instance of a service to the context. It can be accessed by
	 * the selector. See also {@link #getService(String) getService}.
	 * 
	 * @param selector
	 *            The selector string to identify the service instance.
	 * @param bean
	 *            The service.
	 * @return
	 */
	public abstract void registerService(String selector, Object service);

	/**
	 * Is called to unregister the service with the given selector.
	 * 
	 * @param selector
	 */
	public abstract void unregisterService(String selector);

}