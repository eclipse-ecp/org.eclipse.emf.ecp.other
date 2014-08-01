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
package org.eclipse.emf.ecp.ecview.common.tooling;

import org.eclipse.emf.ecp.ecview.common.services.IUiKitBasedService;

/**
 * Is used to become notified about click events on elements. Attention: On
 * activating that service, ALL mouse events will be sent to the listener.
 */
public interface IWidgetMouseClickService extends IUiKitBasedService {

	public static final String ID = IWidgetMouseClickService.class.getName();

	/**
	 * Activates the service. All mouse events will be forwarded to the
	 * listeners.
	 */
	void activate();

	/**
	 * Dectivates the service. Mouse events will not be forwarded to the
	 * listeners.
	 */
	void dactivate();

	/**
	 * Adds a mouse click listener.
	 * 
	 * @param listener
	 */
	void addListener(Listener listener);

	/**
	 * Removes the mouse click listener.
	 * 
	 * @param listener
	 */
	void removeListener(Listener listener);

	/**
	 * Resolves the model element for the given UI element.
	 */
	interface ModelResolver {

		/**
		 * Returns the model element for the given ui element.
		 * 
		 * @param uiWidget
		 * @return
		 */
		Object resolve(Object uiWidget);

	}

	interface Listener {

		/**
		 * Notifies
		 * 
		 * @param modelElement
		 */
		void clicked(Object modelElement);

	}
}
