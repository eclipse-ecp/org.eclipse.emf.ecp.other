/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.core.editparts;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;

public interface IUiElementEditpart extends IDisposable {

	/**
	 * Returns the unique id of that edit part.
	 * 
	 * @return
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
