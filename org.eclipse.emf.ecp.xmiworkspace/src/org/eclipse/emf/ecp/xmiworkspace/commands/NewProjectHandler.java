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
package org.eclipse.emf.ecp.xmiworkspace.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.common.model.ECPWorkspaceManager;
import org.eclipse.emf.ecp.common.model.NoWorkspaceException;
import org.eclipse.emf.ecp.xmiworkspace.exceptions.XMIWorkspaceException;
import org.eclipse.emf.ecp.xmiworkspace.views.NewProjectDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Handler for creating a new project in workspace or filesystem.
 * @author kraftm, maierma
 *
 */
public class NewProjectHandler extends XmiAbstractHandler {
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// open dialog
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		NewProjectDialog dialog = new NewProjectDialog(activeShell, this);

		// open dialog and process the results if the user doesn't cancel the dialog
		if(dialog.open() == Window.OK) {
			try {						
				// run the import process in a command
				buildCommand(ECPWorkspaceManager.getInstance().getWorkSpace()).run(true);
			} catch (NoWorkspaceException e) {
				new XMIWorkspaceException("Could not create new model element.", e);
			}
		}
		
		return null;
	}
}
