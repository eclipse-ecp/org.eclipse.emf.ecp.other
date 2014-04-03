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
package org.eclipse.emf.ecp.ecview.common.editpart;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;

/**
 * The root editpart. An editpart is a controller that handles the model and the ui presentations.
 */
public interface IElementEditpart extends IDisposable {

	/**
	 * Returns the unique id of that edit part.
	 * 
	 * @return id The id of the editpart
	 */
	String getId();

	/**
	 * Returns the model associated with this edit part.<br>
	 * Or <code>null</code> if the edit parts are not based on a model.
	 * 
	 * @return the model or <code>null</code>
	 */
	Object getModel();
}
