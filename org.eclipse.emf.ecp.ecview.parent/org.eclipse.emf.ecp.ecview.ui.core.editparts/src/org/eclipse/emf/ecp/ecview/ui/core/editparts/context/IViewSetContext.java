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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.context;

import java.util.List;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.disposal.IDisposable;

/**
 * Context containing information about the current {@link IViewSetEditpart}
 * instance.<br>
 * Not intended to be subclassed.
 */
public interface IViewSetContext extends IDisposable, IAccessible {

	/**
	 * Returns the {@link IViewSetEditpart} that is related with this context.
	 * 
	 * @return viewSetEditpart
	 */
	IViewSetEditpart getViewSetEditpart();

	/**
	 * Returns a list of contained view contexts.
	 * 
	 * @return viewContexts
	 */
	List<IViewContext> getViewContexts();

}
