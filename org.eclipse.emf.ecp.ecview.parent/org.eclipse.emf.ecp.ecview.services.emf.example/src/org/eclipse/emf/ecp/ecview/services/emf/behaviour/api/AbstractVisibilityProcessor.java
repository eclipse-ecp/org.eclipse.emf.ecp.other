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
package org.eclipse.emf.ecp.ecview.services.emf.behaviour.api;

import org.eclipse.emf.ecp.ecview.common.context.IViewContext;

public abstract class AbstractVisibilityProcessor<E> implements IVisibilityProcessor<E> {

	@Override
	public void register(E element) {
	}

	@Override
	public void unregister(E element) {
	}

	@Override
	public void setContext(IViewContext context) {
	}

	@Override
	public void fire() {
	}

}
