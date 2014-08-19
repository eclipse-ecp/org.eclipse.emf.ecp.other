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
package org.eclipse.emf.ecp.ecview.common.editpart;

import java.util.Map;
import java.util.concurrent.Future;

import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IConfiguration;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.services.IUiKitBasedService;

/**
 * An IUiViewEditpart is an abstraction of the root ui element of a composite
 * structure based on {@link IEmbeddableEditpart}. The IUiViewEditpart should
 * not be contained in a {@link ILayoutEditpart} but it can contain several
 * embeddables.
 */
public interface IViewEditpart extends IElementEditpart, IEmbeddableParent {

	/**
	 * Name for "content" property.
	 */
	String PROP_CONTENT = "content";

	/**
	 * Returns the view context. It offers access to more view related
	 * information.
	 * 
	 * @return context The view context
	 */
	IViewContext getContext();

	/**
	 * Sets the view context. It offers access to more view related information.
	 * 
	 * @param context
	 *            The view context
	 * 
	 * @throws RuntimeException
	 *             if the context changes and the editpart was already rendered.
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
	 * @param content
	 *            The content of the view.
	 */
	void setContent(IEmbeddableEditpart content);

	/**
	 * Sets the configuration. It will become invoked at rendering time.
	 * 
	 * @param configuration
	 */
	void setConfiguration(IConfiguration configuration);

	/**
	 * Returns the content of the view.
	 * 
	 * @return content
	 */
	IEmbeddableEditpart getContent();

	/**
	 * Returns the parent of that edit part.
	 * 
	 * @return parent The view set edit part.
	 */
	IViewSetEditpart getParent();

	/**
	 * Returns the view presenter for the edit part.
	 * 
	 * @param <A>
	 *            An instance of {@link IViewPresentation}
	 * @return presentation The presentation used to render the UI.
	 */
	<A extends IViewPresentation<?>> A getPresentation();

	/**
	 * Returns the bindingSet that is responsible to handle bindings.
	 * 
	 * @return
	 */
	IBindingSetEditpart getBindingSet();

	/**
	 * Is called to set the bindingSet of the view.
	 * 
	 * @param bindingSet
	 *            The bindingSet of the view.
	 */
	void setBindingSet(IBindingSetEditpart bindingSet);

	/**
	 * Returns the commandSet that is responsible to handle commands.
	 * 
	 * @return
	 */
	ICommandSetEditpart getCommandSet();

	/**
	 * Is called to set the commandSet of the view.
	 * 
	 * @param commandSet
	 *            The commandSet of the view.
	 */
	void setCommandSet(ICommandSetEditpart commandSet);

	/**
	 * Is called to render the view.
	 * 
	 * @param options
	 *            can contain different options used for rendering
	 * @throws ContextException
	 */
	void render(Map<String, Object> options) throws ContextException;

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

	/**
	 * Returns a fully configured service for the given serviceClass.
	 * 
	 * @param serviceClass
	 * @return
	 */
	<A extends IUiKitBasedService> A createService(Class<A> serviceClass);

	/**
	 * Opens the dialog.
	 * 
	 * @param dialogEditpart
	 * @param inputData this object contains information about the input data of the
	 *            target navigation page.
	 */
	void openDialog(IDialogEditpart dialogEditpart, IBindableEndpointEditpart inputData);

	/**
	 * Closes the dialog.
	 * 
	 * @param dialogEditpart
	 */
	void closeDialog(IDialogEditpart dialogEditpart);

}
