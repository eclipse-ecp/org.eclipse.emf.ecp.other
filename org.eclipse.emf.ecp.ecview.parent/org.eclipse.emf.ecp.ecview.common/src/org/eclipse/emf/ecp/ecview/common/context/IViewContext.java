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
package org.eclipse.emf.ecp.ecview.common.context;

import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.IAccessible;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;

/**
 * Context containing information about the current {@link IViewEditpart}
 * instance.<br>
 * Not intended to be subclassed.
 */
public interface IViewContext extends IDisposable, IAccessible {

	/**
	 * Returns the URI that specifies the UI kit to be used.
	 * 
	 * @return presentationURI
	 */
	String getPresentationURI();

	/**
	 * Returns the {@link IViewEditpart} that is related with this context.
	 * 
	 * @return viewEditpart
	 */
	IViewEditpart getViewEditpart();

	/**
	 * Returns the view set context of the parent edit part or <code>null</code>
	 * if no parent exists.
	 * 
	 * @return parentContext
	 */
	IViewSetContext getParentContext();

	/**
	 * Registers an instance of value bean to the context. It can be accessed by
	 * the selector. See also {@link ISlot} or
	 * {@link #getValueBean(String) getValueBean}.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @param bean
	 *            The value bean.
	 * @return
	 */
	void setBean(String selector, Object bean);

	/**
	 * Returns the root layout where all UI elements should be child elements
	 * from it.
	 * 
	 * @return rootLayout
	 */
	Object getRootLayout();

	/**
	 * Renders the UI based on the {@link IViewEditpart} and the given
	 * presentationURI.
	 * 
	 * @param presentationURI
	 *            The URI that specifies the UI kit to be used. May be
	 *            <code>null</code>.
	 * @param rootLayout
	 *            The given root layout is the base element for the elements to
	 *            be rendered.
	 * @param parameter
	 *            Parameters that can be passed for rendering
	 * @return
	 * @throws ContextException
	 *             if the UI was already rendered or the rootlayout is
	 *             <code>null</code>
	 */
	void render(String presentationURI, Object rootLayout,
			Map<String, Object> parameter) throws ContextException;

	/**
	 * Returns true, if the UI was already rendered.
	 * 
	 * @return rendered
	 */
	boolean isRendered();

}
