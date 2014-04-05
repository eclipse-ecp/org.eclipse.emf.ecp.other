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
package org.eclipse.emf.ecp.ecview.common.presentation;

import java.util.Map;
import java.util.concurrent.Future;

/**
 * View presenters are used to render UIs based on a view.<br>
 * Implementations are UI-kit specific.
 * 
 * @param <C>
 */
public interface IViewPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Is called to render the view.
	 * 
	 * @param options
	 *            can contain different options used for rendering
	 */
	void render(Map<String, Object> options);

	/**
	 * Sets the presentation that should render the content.
	 * 
	 * @param presentation
	 *            The content presentation
	 */
	void setContent(IWidgetPresentation<?> presentation);

	/**
	 * Returns the presentation of the content.
	 * 
	 * @return contentPresentation
	 */
	IWidgetPresentation<?> getContent();

	/**
	 * Executes the given runnable. It is ensured that the runnable will be
	 * executed within the context of the user interface related to this
	 * context.
	 * 
	 * @param runnable
	 */
	void exec(Runnable runnable);

	/**
	 * Executes the given runnable in a different thread. It is ensured that the
	 * runnable will be executed within the context of the user interface
	 * related to this context.
	 * 
	 * @param runnable
	 */
	Future<?> execAsync(Runnable runnable);

}