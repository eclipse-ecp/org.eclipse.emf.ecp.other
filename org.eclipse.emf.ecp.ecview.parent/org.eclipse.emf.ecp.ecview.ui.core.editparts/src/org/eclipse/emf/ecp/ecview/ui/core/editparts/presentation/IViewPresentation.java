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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.presentation;

import java.util.Map;

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
	 * @param options can contain different options used for rendering
	 */
	void render(Map<String, Object> options);

	/**
	 * Sets the presentation that should render the content.
	 * 
	 * @param presentation The content presentation
	 */
	void setContent(IWidgetPresentation<?> presentation);

	/**
	 * Returns the presentation of the content.
	 * 
	 * @return contentPresentation
	 */
	IWidgetPresentation<?> getContent();

}
