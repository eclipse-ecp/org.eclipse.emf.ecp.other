/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ecview.common.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;

/**
 * A manager that is responsible for binding data for one view instance. Each
 * binding manager has to be connected to exactly one view. All the bindings
 * contained are bindings related to the associated view.
 */
public interface IBindingManager extends IDisposable {

	/**
	 * Returns the binding context that is related with the instance of that
	 * binding manager. All bindings for the view should be done by this binding
	 * 
	 * @return
	 */
	IViewContext getViewContext();

	/**
	 * Returns the validation realm for the binding manager.
	 * 
	 * @return
	 */
	Realm getValidationRealm();

	/**
	 * Returns the databinding context that is responsible for binding the view.
	 * 
	 * @return
	 */
	DataBindingContext getDatabindingContext();

	/**
	 * Binds the target to the model.
	 * 
	 * @param target
	 * @param model
	 * @return The binding
	 */
	Binding bind(IObservableValue target, IObservableValue model);

}