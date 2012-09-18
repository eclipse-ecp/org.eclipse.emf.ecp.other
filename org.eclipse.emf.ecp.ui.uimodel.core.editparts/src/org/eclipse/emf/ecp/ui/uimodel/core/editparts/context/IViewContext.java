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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.context;

import java.beans.PropertyChangeSupport;
import java.util.Map;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;

/**
 * Context containing information about the current {@link IUiViewEditpart} instance.
 */
public interface IViewContext extends IDisposable {

	/**
	 * Returns the URI that specifies the UI kit to be used.
	 * 
	 * @return
	 */
	String getPresentationURI();

	/**
	 * Returns the {@link IUiViewEditpart} that is related with this context.
	 * 
	 * @return
	 */
	IUiViewEditpart getViewEditpart();

	/**
	 * Returns the view set context of the parent edit part or <code>null</code> if no parent exists.
	 * 
	 * @return
	 */
	IViewSetContext getParentContext();

	/**
	 * Returns a value bean. It can be used to store transient values related to the current view. All returned beans
	 * should offer {@link PropertyChangeSupport}.<br>
	 * If an instance of a value bean for the given selector could be found, it will be returned. Otherwise a new bean
	 * will be created an registered.
	 * <p>
	 * A common use case for value beans would be the sharing of a selected value. For instance a selection event on a
	 * list may write the selection to a value bean (selector="my.personlist.selection"). And a detail component can
	 * observe this instance of the value bean and reflect its values. To observe the value change eclipse data binding
	 * may be used.
	 * 
	 * @param selector The selector string to identify the value bean instance.
	 * @return
	 */
	IValueBean getValueBean(String selector);

	/**
	 * Registers an instance of value bean to the context. It can be accessed by the selector.
	 * See also {@link IValueBean} or {@link #getValueBean(String) getValueBean}.
	 * 
	 * @param selector The selector string to identify the value bean instance.
	 * @param bean The value bean.
	 * @return
	 */
	void registerValueBean(String selector, IValueBean bean);

	/**
	 * Returns the root layout where all UI elements should be child elements from it.
	 * 
	 * @return
	 */
	Object getRootLayout();

	/**
	 * Returns a value bean that contains the main domain model element. Every time a new domain model is set to the
	 * returned value bean, all observing ui elements will become notified.
	 * 
	 * @return
	 */
	IValueBean getRootBean();

	/**
	 * Renders the UI based on the {@link IUiViewEditpart} and the given presentationURI.
	 * 
	 * @param presentationURI The URI that specifies the UI kit to be used. May be <code>null</code>.
	 * @param rootLayout The given root layout is the base element for the elements
	 *            to be rendered.
	 * @param parameter Parameters that can be passed for rendering
	 * @return
	 * @throws ContextException if the UI was already rendered or the rootlayout is <code>null</code>
	 */
	void render(String presentationURI, Object rootLayout, Map<String, Object> parameter) throws ContextException;

	/**
	 * Returns true, if the UI was already rendered.
	 * 
	 * @return
	 */
	boolean isRendered();

}
