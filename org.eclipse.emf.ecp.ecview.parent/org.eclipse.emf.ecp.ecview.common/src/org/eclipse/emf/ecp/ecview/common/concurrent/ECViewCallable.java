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
package org.eclipse.emf.ecp.ecview.common.concurrent;

import java.util.concurrent.Callable;

import org.eclipse.emf.ecp.ecview.common.context.IViewContext;

public abstract class ECViewCallable<V> implements Callable<V> {

	private final IViewContext context;

	public ECViewCallable(IViewContext context) {
		super();
		this.context = context;
	}

	/**
	 * The view context, this callable is assigned to. May be <code>null</code>.
	 * 
	 * @return
	 */
	public IViewContext getContext() {
		return context;
	}

}
