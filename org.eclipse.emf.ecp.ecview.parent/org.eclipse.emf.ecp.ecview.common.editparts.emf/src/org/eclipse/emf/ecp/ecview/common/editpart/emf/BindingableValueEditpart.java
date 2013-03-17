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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.IBindableValueEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public abstract class BindingableValueEditpart extends
		ElementEditpart<YBinding> implements IBindableValueEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BindingableValueEditpart.class);

	/**
	 * A default constructor.
	 */
	protected BindingableValueEditpart() {
	}

	@Override
	protected YBinding createModel() {
		checkDisposed();

		return BindingFactory.eINSTANCE.createYBinding();
	}

	@Override
	protected void internalDispose() {
		try {
		} finally {
			super.internalDispose();
		}
	}
}
