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

import java.util.List;

import org.eclipse.emf.ecp.ecview.common.binding.IECViewBindingManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;

/**
 * An editpart resonsible to handle bindings. If new bindings are added, they
 * will become processed. Also leaving bindings will become unbind.
 */
public interface IBindingSetEditpart extends IElementEditpart {

	/**
	 * Returns true if the binding set is active
	 * 
	 * @return
	 */
	boolean isActive();

	/**
	 * Activates the binding set manager. It will create all pending bindings.
	 */
	void activate();

	/**
	 * Returns the view that binding set is attached to.
	 * 
	 * @return
	 */
	IViewEditpart getView();

	/**
	 * Returns a list of all available bindings.
	 * 
	 * @return
	 */
	List<IBindingEditpart> getBindings();

	/**
	 * Adds the given binding to the list of bindings. Adding a binding will
	 * bind the contained values if not done so.
	 * 
	 * @param binding
	 */
	void addBinding(IBindingEditpart binding);

	/**
	 * Removes the given binding from the list of bindings. Removing a binding
	 * will unbind the contained values.
	 * 
	 * @param binding
	 */
	void removeBinding(IBindingEditpart binding);

	/**
	 * Returns the binding manager that should be used to bind values.
	 * 
	 * @return
	 */
	IECViewBindingManager getBindingManager();

	/**
	 * Sets the binding manager that should be used to bind values.
	 * 
	 * @param bindingManager
	 */
	void setBindingManager(IECViewBindingManager bindingManager);

}
