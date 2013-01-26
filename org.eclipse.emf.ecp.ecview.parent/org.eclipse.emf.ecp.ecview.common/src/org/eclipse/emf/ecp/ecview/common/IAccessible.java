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
package org.eclipse.emf.ecp.ecview.common;

import org.eclipse.emf.ecp.ecview.common.beans.IBeanRegistry;
import org.eclipse.emf.ecp.ecview.common.services.IServiceRegistry;

/**
 * An interface that extends the {@link IBeanRegistry} and
 * {@link IServiceRegistry}.<br>
 * Not intended to be subclassed.
 */
public interface IAccessible extends IBeanRegistry, IServiceRegistry {

}
