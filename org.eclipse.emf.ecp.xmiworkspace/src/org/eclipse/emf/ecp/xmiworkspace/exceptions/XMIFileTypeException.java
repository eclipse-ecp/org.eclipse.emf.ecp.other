/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * Technische Universitaet Muenchen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.ecp.xmiworkspace.exceptions;

/**
 * All exceptions related with the files or their types are thrown as this exception.
 * @author matti, markus
 */
public class XMIFileTypeException extends XMIException {

	/**
	 * Generated ID.
	 */
	private static final long serialVersionUID = -2992360783606499261L;
	
	/**
	 * Create an exception with a custom message an the exception stack.
	 * @param message Custom message to inform the user.
	 * @param e Exception thrown
	 */
	public XMIFileTypeException(String message, Exception e) {
		setMessage(message);
		setException(e);
		
		log();
	}
	
	/**
	 * Create an exception only with a message.
	 * @param message Custom message to inform the user.
	 */
	public XMIFileTypeException(String message) {
		setMessage(message);
		setException(new Exception(message));
		
		log();
	}

	
}
