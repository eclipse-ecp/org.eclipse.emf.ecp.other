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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation;

/**
 * View presenters are used to render UIs based on a view.<br>
 * Implementations are UI-kit specific.
 * 
 * @param <C>
 * @param <P>
 */
public interface IViewPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Is called to render the view.
	 */
	void render();

}
