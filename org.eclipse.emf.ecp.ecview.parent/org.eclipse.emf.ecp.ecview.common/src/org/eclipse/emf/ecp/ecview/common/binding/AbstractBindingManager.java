/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;

/**
 * Is used to bind values. For details see {@link IBindingManager}.
 */
public abstract class AbstractBindingManager extends AbstractDisposable
		implements IBindingManager {

	private final Realm validationRealm;
	private final DataBindingContext dbc;

	public AbstractBindingManager(Realm validationRealm) {
		super();
		this.validationRealm = validationRealm;
		dbc = createDatabindingContext(validationRealm);
	}

	/**
	 * Creates a new instance of the databinding context.
	 * 
	 * @param validationRealm
	 * @return
	 */
	protected DataBindingContext createDatabindingContext(Realm validationRealm) {
		return new DataBindingContext(validationRealm);
	}

	public Realm getValidationRealm() {
		return validationRealm;
	}

	@Override
	public DataBindingContext getDatabindingContext() {
		return dbc;
	}

	@Override
	public Binding bind(IObservableValue target, IObservableValue model) {
		return dbc.bindValue(target, model, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE), new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE));
	}

	@Override
	protected void internalDispose() {
		if (isDisposed()) {
			return;
		}

		dbc.dispose();
	}

}
