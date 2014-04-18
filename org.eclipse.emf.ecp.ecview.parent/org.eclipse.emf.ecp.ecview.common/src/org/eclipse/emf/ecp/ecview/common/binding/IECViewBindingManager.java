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
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;

/**
 * A manager that is responsible for binding data for one view instance. Each
 * binding manager has to be connected to exactly one view. All the bindings
 * contained are bindings related to the associated view.
 */
public interface IECViewBindingManager extends IDisposable {
	
	public static final boolean DEFAULT_GROUPING = true;
	public static final boolean DEFAULT_MARK_NEGATIVE = true;
	public static final int DEFAULT_PRECISION = 2;

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
	 * Binds the target to the model. Policy update will be used. Model ->
	 * Target and Target -> Model automatically. See UpdateValueStrategy.
	 * 
	 * @param target
	 * @param model
	 * @return The binding
	 */
	Binding bindValue(IObservableValue target, IObservableValue model);

	/**
	 * Binds the target to the model.
	 * 
	 * @param target
	 * @param model
	 * @param targetToModel
	 * @param modelToTarget
	 * @return The binding
	 */
	Binding bindValue(IObservableValue target, IObservableValue model,
			UpdateValueStrategy targetToModel, UpdateValueStrategy modelToTarget);
	
	/**
	 * Binds the target to the model.
	 * 
	 * @param target
	 * @param model
	 * @return The binding
	 */
	Binding bindList(IObservableList target, IObservableList model);
	
	/**
	 * Binds the target to the model.
	 * 
	 * @param target
	 * @param model
	 * @param targetToModel
	 * @param modelToTarget
	 * @return The binding
	 */
	Binding bindList(IObservableList target, IObservableList model,
			UpdateListStrategy targetToModel, UpdateListStrategy modelToTarget);

}