/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eike Stepper - initial API and implementation
 * Jonas Helming - JavaDoc
 *******************************************************************************/
package org.eclipse.emf.ecp.spi.core.util;

import org.eclipse.emf.ecp.core.util.ECPDisposable;
import org.eclipse.emf.ecp.core.util.ECPRegistryElement;

/**
 * @author Eike Stepper
 */
public interface InternalRegistryElement extends ECPRegistryElement, ECPDisposable {

	/**
	 * {@inheritDoc}
	 */
	void setLabel(String label);

	/**
	 * {@inheritDoc}
	 */
	void setDescription(String description);
}
