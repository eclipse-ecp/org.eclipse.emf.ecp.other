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
 * An interface that defines common methods for all ECP Classes.
 * 
 * @author Eike Stepper
 * @author Eugen Neufeld
 */
public interface ECPElement extends Comparable<ECPElement> {
	/**
	 * This returns the name of the object.
	 * 
	 * @return the name
	 */
	String getName();

	/**
	 * This return the type of the object.
	 * 
	 * @return the type
	 */
	String getType();
}
