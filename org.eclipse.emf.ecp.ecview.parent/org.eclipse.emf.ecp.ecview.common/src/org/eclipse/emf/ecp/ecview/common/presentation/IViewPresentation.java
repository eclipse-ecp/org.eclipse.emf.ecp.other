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

import org.eclipse.emf.ecp.ecview.common.editpart.IDialogEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.services.IUiKitBasedService;

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
	 * Sets the editpart that should render the content.
	 * 
	 * @param editpart
	 *            The content editpart
	 */
	void setContent(IEmbeddableEditpart editpart);

	/**
	 * Returns the editpart of the content.
	 * 
	 * @return editpart
	 */
	IEmbeddableEditpart getContent();

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
	 * Creates the fully configured service for the given service class.
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
