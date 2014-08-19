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

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;

/**
 * Needs to render a dialog.
 *
 * @param <C>
 */
public interface IDialogPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Sets the content of the dialog.
	 * 
	 * @param child
	 */
	void setContent(IEmbeddableEditpart child);

	/**
	 * Sets the input data. The binding endpoint contains information about the
	 * data that should be bound to the dialog.
	 * 
	 * @param bindingEndpoint
	 */
	void setInputDataBindingEndpoint(IBindableEndpointEditpart bindingEndpoint);

}
