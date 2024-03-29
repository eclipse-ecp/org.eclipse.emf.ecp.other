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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.common.model.ECPWorkspaceManager;
import org.eclipse.emf.ecp.common.model.NoWorkspaceException;
import org.eclipse.emf.ecp.xmiworkspace.XMIMetaModelElementContext;
import org.eclipse.emf.ecp.xmiworkspace.XmiUtil;
import org.eclipse.emf.ecp.xmiworkspace.exceptions.XMIWorkspaceException;
import org.eclipse.emf.ecp.xmiworkspace.structure.XMIECPFileProject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;

/**
 * Handles the user's choice to add or remove a model from a FileProject.
 * @author kraftm, maierma
 *
 */
public class ConfigureModelsHandler extends AbstractHandler {

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		//determine an open project
		XMIECPFileProject project = null;
		try {
			project = (XMIECPFileProject) ECPWorkspaceManager.getInstance().getWorkSpace().getActiveProject();
		} catch (NoWorkspaceException e) {
			new XMIWorkspaceException("No Workspace available.", e);
		}
		
		// get the context from the project
		XMIMetaModelElementContext context = (XMIMetaModelElementContext) project.getMetaModelElementContext();
		
		// build dialog
		Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		
		ListSelectionDialog dialog = new ListSelectionDialog(activeShell,
				XmiUtil.getAllModels().toArray(), new ArrayContentProvider(), new LabelProvider(),
				"Select the models for your project:");
		dialog.setTitle("Model Selection");
		dialog.setInitialSelections(context.getModels().toArray());
		
		// work with the result of the dialog to add or remove models from FileProject
		if (dialog.open() == Window.OK) {
			//remove all registered models
			context.clearModels();
			
			//Add all selected models
			for(Object s : dialog.getResult()) {
				if(s instanceof String)	{
					context.addModel((String) s);
				}
			}
		}
		
		return null;
	}

}
