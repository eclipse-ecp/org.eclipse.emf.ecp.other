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
package org.eclipse.emf.ecp.ecview.common.notification;

/**
 * {@link ILifecycleHandler} may use that service to register for
 * {@link ILifecycleEvent lifecycle events}.
 * <p>
 * Should not be implemented by clients.
 */
public interface ILifecycleService {

	/**
	 * Adds a handler to the service. Calling the method twice has no effect.
	 * 
	 * @param handler
	 */
	void addHandler(ILifecycleHandler handler);

	/**
	 * Removes the given handler.
	 * 
	 * @param handler
	 */
	void removeHandler(ILifecycleHandler handler);

	/**
	 * Sends a lifecycle event to all registered handler.
	 * 
	 * @param event
	 */
	void notifyLifecycle(ILifecycleEvent event);

}
