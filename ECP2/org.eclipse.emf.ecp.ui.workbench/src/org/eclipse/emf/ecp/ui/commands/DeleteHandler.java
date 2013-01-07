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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
/**
 * This Handler uses the {@link HandlerHelper#deleteHandlerHelper(IStructuredSelection, org.eclipse.swt.widgets.Shell)} method
 * to delete.
 * 
 * @author Eugen Neufeld
 */
public class DeleteHandler extends AbstractHandler {

	/** {@inheritDoc} */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection ssel = (IStructuredSelection) selection;

		//FIXME change to {@link HandlerHelper#deleteHandlerHelper(java.util.List, org.eclipse.emf.ecp.ui.common.AbstractUICallback)}
		HandlerHelper.deleteHandlerHelper(ssel, HandlerUtil.getActiveShell(event));
		return null;
	}
}
