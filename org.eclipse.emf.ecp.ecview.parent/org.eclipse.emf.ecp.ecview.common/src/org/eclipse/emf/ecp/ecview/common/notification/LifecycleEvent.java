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
package org.eclipse.emf.ecp.ecview.common.notification;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;

public class LifecycleEvent implements ILifecycleEvent {

	private final IElementEditpart editpart;
	private final String type;

	public LifecycleEvent(IElementEditpart editpart, String type) {
		super();
		this.editpart = editpart;
		this.type = type;
	}

	@Override
	public IElementEditpart getEditpart() {
		return editpart;
	}

	@Override
	public String getType() {
		return type;
	}

}
