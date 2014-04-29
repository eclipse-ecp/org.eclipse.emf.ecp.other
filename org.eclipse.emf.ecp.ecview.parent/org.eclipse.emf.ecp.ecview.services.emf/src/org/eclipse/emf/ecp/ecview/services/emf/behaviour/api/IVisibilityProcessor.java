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
package org.eclipse.emf.ecp.ecview.services.emf.behaviour.api;

import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;

/**
 * Implementations handle the visibility of UI elements based on domain data.
 * Like editable, visible,...
 * 
 * Clients should implement {@link AbstractVisibilityProcessor} since API may
 * change.
 */
public interface IVisibilityProcessor {

	/**
	 * Registers the element. The visibility options of the element will become
	 * managed.
	 * 
	 * @param element
	 * @param adapter
	 *            - The visibility adapter
	 */
	void register(YVisibilityProcessable element, IVisibilityAdapter adapter);

	/**
	 * Unregisters the element.
	 * 
	 * @param element
	 */
	void unregister(YVisibilityProcessable element);

	/**
	 * The context may be used to access the underlying domain model and further
	 * options.
	 * 
	 * @param context
	 */
	void setContext(IViewContext context);

}
