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
package org.eclipse.emf.ecp.ecview.common.editpart.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;

/**
 * An editpart resonsible to handle bindings.
 */
public interface IBindingEditpart extends IElementEditpart {

	/**
	 * Returns true, if the binding defined by this editpart is active. False
	 * otherwise.
	 * 
	 * @return
	 */
	boolean isBound();

	/**
	 * Returns the target endpoint.
	 * 
	 * @return
	 */
	IBindableEndpointEditpart getTargetEndpoint();

	/**
	 * Sets the target endpoint.
	 * 
	 * @param targetValue
	 */
	void setTargetEndpoint(IBindableEndpointEditpart targetValue);

	/**
	 * Returns the model endpoint.
	 * 
	 * @return
	 */
	IBindableEndpointEditpart getModelEndpoint();

	/**
	 * Sets the target endpoint.
	 * 
	 * @param modelValue
	 */
	void setModelEndpoint(IBindableEndpointEditpart modelValue);

	/**
	 * Binds the target and model according the binding properties.
	 */
	void bind();

	/**
	 * Returns the binding or <code>null</code> if no binding is available.
	 * 
	 * @return
	 */
	Binding getBinding();

	/**
	 * Unbinds target and model.
	 */
	void unbind();
}