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
package org.eclipse.emf.ecp.ui.commands;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
/**
 * This Handler uses the {@link HandlerHelper#deleteModelElement(org.eclipse.emf.ecp.core.ECPProject, java.util.Collection)} method
 * to delete the selected {@link EObject EObjects}.
 * 
 * @author Eugen Neufeld
 */
public class DeleteModelElementHandler extends AbstractHandler {

	/** {@inheritDoc} */
	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

		InternalProject project=(InternalProject)ECPProjectManager.INSTANCE.getProject(selection.getFirstElement());
			
		HandlerHelper.deleteModelElement(project, (List<EObject>)selection.toList());
		return null;
	}

}
