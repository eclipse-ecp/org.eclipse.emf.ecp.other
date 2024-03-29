/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eike Stepper - initial API and implementation
 * Eugen Neufeld - JavaDoc
 * 
 *******************************************************************************/
package org.eclipse.emf.ecp.core.util;

/**
 * A ModelContextAware knows its {@link ECPModelContext}.
 * 
 * @author Eike Stepper
 */
public interface ECPModelContextAware extends ECPProviderAware {
	/**
	 * Returns the {@link ECPModelContext} this interface is aware of.
	 * 
	 * @return {@link ECPModelContext}
	 */
	ECPModelContext getContext();
}
