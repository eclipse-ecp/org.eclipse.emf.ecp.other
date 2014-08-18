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

/**
 * An editpart that handles commands.
 */
public interface ICommandEditpart extends IElementEditpart {

	/**
	 * Activates the command. It used to active commands before bindings and
	 * after element creation.
	 */
	void activate();

	/**
	 * Returns the view edit part of this embeddable edit part.<br>
	 * May be <code>null</code> as far as this element and no of its parents are
	 * attached to a view.
	 * 
	 * @return editpart The view editpart
	 */
	IViewEditpart getView();

	/**
	 * Requests disposal of the current editpart. This method will forward the
	 * request to the parent if available and the parent will handle the steps
	 * required to dispose the editpart properly.
	 */
	void requestDispose();

	/**
	 * Executes the command.
	 */
	void execute();

	/**
	 * Returns the parent that contains this command.
	 * 
	 * @return
	 */
	IElementEditpart getParent();

}
