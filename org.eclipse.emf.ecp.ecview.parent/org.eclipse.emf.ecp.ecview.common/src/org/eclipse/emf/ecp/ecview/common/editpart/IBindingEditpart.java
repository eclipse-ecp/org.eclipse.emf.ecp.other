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
package org.eclipse.emf.ecp.ecview.common.editpart;

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
	 * Returns the target bindableValue.
	 * 
	 * @return
	 */
	IBindableValueEditpart getTargetValue();

	/**
	 * Sets the target bindable value.
	 * 
	 * @param targetValue
	 */
	void setTargetValue(IBindableValueEditpart targetValue);

	/**
	 * Returns the model bindableValue.
	 * 
	 * @return
	 */
	IBindableValueEditpart getModelValue();

	/**
	 * Sets the target bindable value.
	 * 
	 * @param modelValue
	 */
	void setModelValue(IBindableValueEditpart modelValue);

	/**
	 * Binds the target and model according the binding properties.
	 */
	void bind();

	/**
	 * Unbinds target and model.
	 */
	void unbind();
}
