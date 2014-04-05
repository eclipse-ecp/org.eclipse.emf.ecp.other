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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LifecycleService implements ILifecycleService {

	private Set<ILifecycleHandler> handlers = Collections
			.synchronizedSet(new HashSet<ILifecycleHandler>());

	@Override
	public void addHandler(ILifecycleHandler handler) {
		handlers.add(handler);
	}

	@Override
	public void removeHandler(ILifecycleHandler handler) {
		handlers.remove(handler);
	}

	@Override
	public void notifyLifecycle(ILifecycleEvent event) {
		synchronized (handlers) {
			for (ILifecycleHandler handler : handlers) {
				handler.notifyLifecycle(event);
			}
		}
	}
}
