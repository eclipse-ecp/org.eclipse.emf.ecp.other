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
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This Handler uses the {@link HandlerHelper#addModelElement(ECPProject, org.eclipse.emf.ecp.ui.common.AbstractUICallback, boolean)} method
 * to add a model element to a project.
 * 
 * @author Eugen Neufeld
 */
public class NewModelElementWizardHandler extends AbstractHandler
{
  /**
   * {@inheritDoc}
   */
  public Object execute(final ExecutionEvent event) throws ExecutionException
  {
    ISelection selection = HandlerUtil.getActiveMenuSelection(event);
    IStructuredSelection ssel = (IStructuredSelection)selection;
    HandlerHelper.addModelElement((ECPProject)ssel.getFirstElement(), HandlerUtil.getActiveShell(event),true);
    
    return null;
  }
}
