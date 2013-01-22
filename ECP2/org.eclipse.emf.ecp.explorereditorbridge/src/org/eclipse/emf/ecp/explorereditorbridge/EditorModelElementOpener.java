/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 * 
 *******************************************************************************/
package org.eclipse.emf.ecp.explorereditorbridge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.editor.e3.MEEditorInput;
import org.eclipse.emf.ecp.ui.util.ModelElementOpener;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * ECP Class to open the default ECP Editor.
 * 
 * @author Eugen Neufeld
 * 
 */
public class EditorModelElementOpener implements ModelElementOpener {

	/**
	 * Convenient constructor.
	 */
	public EditorModelElementOpener() {
	}

	/**
	 * The default editor can open every {@link EObject}, but has the lowest value.
	 * 
	 * @param modelElement {@link EObject} to test
	 * @return 0
	 */
	public int canOpen(EObject modelElement) {
		return 0;
	}

	/**
	 * Opens the default ECP Editor for an {@link EObject} and the corresponding {@link ECPProject}.
	 * 
	 * @param modelElement the {@link EObject} to open the Editor for
	 * @param ecpProject the {@link ECPProject} to open the Editor for
	 */
	public void openModelElement(EObject modelElement, ECPProject ecpProject) {
		MEEditorInput input = new MEEditorInput(new EditorContext(modelElement, ecpProject, PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow().getShell()));
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.openEditor(input, "org.eclipse.emf.ecp.editor", true);
		} catch (PartInitException e) {
			Activator.logException(e);
		}
	}
}
