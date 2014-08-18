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

import java.util.List;

/**
 * An editpart resonsible to handle commands. If new commands are added, they
 * will become processed. Also leaving commands will become unbind.
 */
public interface ICommandSetEditpart extends IElementEditpart {

	/**
	 * Returns true if the command set is active
	 * 
	 * @return
	 */
	boolean isActive();

	/**
	 * Activates the command set manager. It will create all pending commands.
	 */
	void activate();

	/**
	 * Returns the view that command set is attached to.
	 * 
	 * @return
	 */
	IViewEditpart getView();

	/**
	 * Returns a list of all available commands.
	 * 
	 * @return
	 */
	List<ICommandEditpart> getCommands();

	/**
	 * Adds the given command to the list of commands. Adding a command will
	 * bind the contained values if not done so.
	 * 
	 * @param command
	 */
	void addCommand(ICommandEditpart command);

	/**
	 * Removes the given command from the list of commands. Removing a command
	 * will unbind the contained values.
	 * 
	 * @param command
	 */
	void removeCommand(ICommandEditpart command);

}
