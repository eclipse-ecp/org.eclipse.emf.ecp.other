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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IViewPresentation;

/**
 * An IUiViewEditpart is an abstraction of the root ui element of a composite structure based on
 * {@link IUiEmbeddableEditpart}. The IUiViewEditpart should not be contained in a {@link IUiLayoutEditpart} but it can
 * contain several embeddables.
 */
public interface IUiViewEditpart extends IUiElementEditpart {

	/**
	 * Name for "content" property.
	 */
	String PROP_CONTENT = "content";

	/**
	 * Returns the view context. It offers access to more view related information.
	 * 
	 * @return context The view context
	 */
	IViewContext getContext();

	/**
	 * Sets the view context. It offers access to more view related information.
	 * 
	 * @param context The view context
	 * 
	 * @throws RuntimeException if the context changes and the editpart was already rendered.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	void setContext(IViewContext context) throws RuntimeException;

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Returns the name of the view.
	 * 
	 * @return name The name of the view.
	 */
	String getName();

	/**
	 * Is called to set the content of the view.
	 * 
	 * @param content The content of the view.
	 */
	void setContent(IUiEmbeddableEditpart content);

	/**
	 * Returns the content of the view.
	 * 
	 * @return content
	 */
	IUiEmbeddableEditpart getContent();

	/**
	 * Returns the parent of that edit part.
	 * 
	 * @return parent The view set edit part.
	 */
	IUiViewSetEditpart getParent();

	/**
	 * Returns the view presenter for the edit part.
	 * 
	 * @param <A> An instance of {@link IViewPresentation}
	 * @return presentation The presentation used to render the UI.
	 */
	<A extends IViewPresentation<?>> A getPresentation();

}
