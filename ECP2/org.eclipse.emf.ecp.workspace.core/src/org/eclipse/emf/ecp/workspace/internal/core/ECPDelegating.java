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
 * Eugen Neufeld - JavaDoc
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.workspace.internal.core;

/**
 * This interface allows to get a delegate.
 * 
 * 
 * @author Eike Stepper
 * @author Eugen Neufeld
 * 
 * @param <DELEGATE> The delegating class.
 */
public interface ECPDelegating<DELEGATE> {
	/**
	 * Returns a delegate.
	 * 
	 * @return the delegate
	 */
	DELEGATE getDelegate();
}