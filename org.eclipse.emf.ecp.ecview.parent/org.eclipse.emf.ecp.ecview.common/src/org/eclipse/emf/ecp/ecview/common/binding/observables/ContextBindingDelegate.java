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
package org.eclipse.emf.ecp.ecview.common.binding.observables;

import java.net.URI;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;

/**
 * The base class of {@link IContextBindingDelegate} that should be overridden by
 * subclasses.
 */
public class ContextBindingDelegate implements IContextBindingDelegate {

	@Override
	public boolean isFor(IViewContext context, URI bindingURI) {
		return false;
	}

	@Override
	public IObservableValue observeValue(IViewContext context, URI bindingURI) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IObservableValue observeValue(Realm realm, IViewContext context,
			URI bindingURI) {
		throw new UnsupportedOperationException();
	}

}
