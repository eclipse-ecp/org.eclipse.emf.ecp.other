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
package org.eclipse.emf.ecp.ecview.common.context;

/**
 * This class is called if the view becomes rendered.
 * 
 * @noimplement should not be implemented by clients. Use ConfigurationAdapter
 *              instead.
 */
public interface IConfiguration {

	/**
	 * Is called before the binding is activated.
	 * 
	 * @param context
	 */
	void beforeBind(IContext context);

}
