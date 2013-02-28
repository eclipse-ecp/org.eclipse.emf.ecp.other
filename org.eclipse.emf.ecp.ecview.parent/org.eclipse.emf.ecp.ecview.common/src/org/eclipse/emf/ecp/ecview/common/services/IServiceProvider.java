/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.services;

import org.eclipse.emf.ecp.ecview.common.context.IContext;

/**
 * Provide services.
 * 
 * @author dominguez
 *
 */
public interface IServiceProvider {	
	/**
	 * Returns true if the provider is responsible for creating services of the given type for the context.
	 * 
	 * @param selector
	 * @param context
	 * @return
	 */
	boolean isFor(String selector, IContext context);
	
	/**
	 * Returns the service of the given type for the context.
	 *  
	 * @param selector
	 * @param context
	 * @return
	 */
	<A> A createService(String selector, IContext context);
}