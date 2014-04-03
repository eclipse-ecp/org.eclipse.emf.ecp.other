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
package org.eclipse.emf.ecp.ecview.common.beans;

import org.eclipse.emf.ecp.ecview.common.uri.AccessibleScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;

public abstract class BeanSlotInitializerAdapter implements
		IBeanSlotInitializer {

	private IBeanRegistry registry;

	@Override
	public void intialize(IBeanRegistry registry) {
		this.registry = registry;
		doIntialize();
	}

	/**
	 * Creates a bean slot in the given registry with the given type.
	 * 
	 * @param registry
	 * @param uriString
	 * @param type
	 */
	protected void createBeanSlot(String uriString, Class<?> type) {
		AccessibleScope accessible = URIHelper.toScope(uriString);
		accessible.getBeanScope().createBeanSlot(registry, type);
	}

	/**
	 * The bean slot have to become initialized.
	 * 
	 * @param registry
	 */
	protected abstract void doIntialize();

}
