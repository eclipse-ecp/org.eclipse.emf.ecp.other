/*
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.views;

import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.internal.ui.model.ProvidersContentProvider;
import org.eclipse.emf.ecp.internal.ui.model.ProvidersLabelProvider;
import org.eclipse.emf.ecp.ui.common.TreeViewerFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Eike Stepper
 */
public class ECPProvidersView extends TreeView
{
  public static final String ID = "org.eclipse.emf.ecp.ui.ECPProvidersView";

  public ECPProvidersView()
  {
    super(ID);
  }

  @Override
  protected TreeViewer createViewer(Composite parent)
  {
    TreeViewer viewer = TreeViewerFactory.createTreeViewer(parent, new ProvidersLabelProvider(),
        new ProvidersContentProvider(), ECPProviderRegistry.INSTANCE, createLabelDecorator(),true);
    return viewer;
  }
}
