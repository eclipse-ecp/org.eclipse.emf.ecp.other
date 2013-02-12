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

package org.eclipse.emf.ecp.ui.common;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPModelContextProvider;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.internal.core.Activator;
import org.eclipse.emf.ecp.ui.common.dnd.ECPDropAdapter;
import org.eclipse.emf.ecp.ui.common.dnd.ModelExplorerDropAdapter;
import org.eclipse.emf.ecp.ui.model.ModelContentProvider;
import org.eclipse.emf.ecp.ui.model.ModelLabelProvider;
import org.eclipse.emf.ecp.ui.model.RepositoriesContentProvider;
import org.eclipse.emf.ecp.ui.model.RepositoriesLabelProvider;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;

/**
 * @author Eugen Neufeld
 */
public final class TreeViewerFactory {
	private TreeViewerFactory() {
	}

	public static TreeViewer createModelExplorerViewer(Composite parent, boolean hasDnD, ILabelDecorator labelDecorator) {
		final ModelContentProvider contentProvider = new ModelContentProvider();
		final TreeViewer viewer = createTreeViewer(parent, new ModelLabelProvider(contentProvider), contentProvider,
			ECPProjectManager.INSTANCE, labelDecorator, false);
		if (hasDnD) {
			final ECPDropAdapter dropAdapter = getDropAdapter(contentProvider, viewer);

			int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
			Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
			viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));// new ECPDragAdapter(viewer)
			viewer.addDropSupport(dndOperations, transfers, dropAdapter);// ComposedDropAdapter
			viewer.addSelectionChangedListener(new ISelectionChangedListener() {

				public void selectionChanged(SelectionChangedEvent event) {
					Object[] elements = ((IStructuredSelection) event.getSelection()).toArray();
					if (elements == null || elements.length == 0) {
						return;
					}
					ECPProject project = null;
					if (elements[0] instanceof ECPProject) {
						ECPModelContext context = ECPUtil.getModelContext(contentProvider, elements);
						if (context != null && context instanceof ECPProject) {
							project = (ECPProject) context;
						}
					} else {
						ECPModelContextProvider contextProvider = (ECPModelContextProvider) viewer.getContentProvider();
						project = (ECPProject) ECPUtil.getModelContext(contextProvider, elements[0]);
					}
					if (project != null) {
						dropAdapter.setEditingDomain(project.getEditingDomain());
					}
				}
			});
		}
		return viewer;
	}

	/**
	 * @param contentProvider
	 * @param viewer
	 * @return
	 */
	private static ECPDropAdapter getDropAdapter(ModelContentProvider contentProvider, TreeViewer viewer) {
		ECPDropAdapter dropAdapter = null;
		// read extensionpoint, if no defined take default
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(
			"org.eclipse.emf.ecp.ui.dropadapter");
		for (IExtension extension : extensionPoint.getExtensions()) {
			IConfigurationElement configurationElement = extension.getConfigurationElements()[0];
			try {
				dropAdapter = (ECPDropAdapter) configurationElement.createExecutableExtension("class");
				dropAdapter.setViewer(viewer);
				break;
			} catch (CoreException ex) {
				Activator.log(ex);
			}
		}
		if (dropAdapter == null) {
			dropAdapter = new ModelExplorerDropAdapter(viewer);
		}
		return dropAdapter;
	}

	public static TreeViewer createRepositoryExplorerViewer(Composite parent, ILabelDecorator labelDecorator) {
		RepositoriesContentProvider contentProvider = new RepositoriesContentProvider();
		TreeViewer viewer = createTreeViewer(parent, new RepositoriesLabelProvider(contentProvider), contentProvider,
			ECPRepositoryManager.INSTANCE, labelDecorator, true);
		return viewer;
	}

	public static TreeViewer createTreeViewer(Composite parent, ILabelProvider labelProvider,
		ITreeContentProvider contentProvider, Object input, ILabelDecorator labelDecorator, boolean sort) {
		TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		createTreeViewer(labelProvider, contentProvider, input, labelDecorator, viewer, sort);
		return viewer;
	}

	public static TreeViewer createCheckedTreeViewer(Composite parent, ILabelProvider labelProvider,
		ITreeContentProvider contentProvider, Object input, ILabelDecorator labelDecorator, boolean sort) {
		final ContainerCheckedTreeViewer viewer = new ContainerCheckedTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
			| SWT.V_SCROLL);
		createTreeViewer(labelProvider, contentProvider, input, labelDecorator, viewer, sort);
		return viewer;
	}

	/**
	 * @param labelProvider
	 * @param contentProvider
	 * @param input
	 * @param labelDecorator
	 * @param viewer
	 */
	private static void createTreeViewer(ILabelProvider labelProvider, ITreeContentProvider contentProvider,
		Object input, ILabelDecorator labelDecorator, TreeViewer viewer, boolean sort) {
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(labelProvider);
		if (sort) {
			viewer.setSorter(new ViewerSorter());
		}
		viewer.setInput(input);

		if (labelDecorator != null) {
			if (!(labelProvider instanceof DecoratingLabelProvider)) {
				viewer.setLabelProvider(new DecoratingLabelProvider(labelProvider, labelDecorator));
			}
		}
	}
}
