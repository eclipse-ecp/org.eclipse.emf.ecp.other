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
 ******************************************************************************/
package org.eclipse.emf.ecp.internal.ui.composites;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.ui.ECPViewerFilter;
import org.eclipse.emf.ecp.internal.ui.ModelClassFilter;
import org.eclipse.emf.ecp.internal.ui.model.FilteredEClassContentProvider;
import org.eclipse.emf.ecp.internal.ui.model.MEClassLabelProvider;
import org.eclipse.emf.ecp.ui.common.TreeViewerFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import java.util.Collection;

/**
 * This class provides an abstract implementation for displaying EClasses in a Tree.
 * 
 * @author Eugen Neufeld
 * 
 */
public abstract class AbstractEClassTreeSelectionComposite extends AbstractFilteredSelectionComposite<TreeViewer> {

	private final ModelClassFilter filter = new ModelClassFilter();
	private ComposedAdapterFactory composedAdapterFactory;
	private MEClassLabelProvider meClassLabelProvider;
	private ITreeContentProvider modelTreeContentProvider;

	/**
	 * Constructor setting the necessary data for selecting the {@link EClass EClasses}.
	 * 
	 * @param unsupportedEPackages {@link EPackage EPackages} that are not supported
	 * @param filteredEPackages {@link EPackage EPackages} selected by the user
	 * @param filteredEClasses {@link EClass EClasses} selected by the user
	 */
	public AbstractEClassTreeSelectionComposite(Collection<EPackage> unsupportedEPackages,
		Collection<EPackage> filteredEPackages, Collection<EClass> filteredEClasses) {
		super();
		composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		meClassLabelProvider = new MEClassLabelProvider(composedAdapterFactory);
		// modelTreeContentProvider = new ModelTreeContentProvider(composedAdapterFactory, ePackages,
		// unsupportedEPackages, filteredEPackages, filteredEClasses);
		modelTreeContentProvider = new FilteredEClassContentProvider(unsupportedEPackages, filteredEPackages,
			filteredEClasses);
	}

	/**
	 * Constructor that delegates to the
	 * {@link AbstractEClassTreeSelectionComposite#AbstractEClassTreeSelectionComposite(Collection, Collection, Collection, Collection)}
	 * by reading the data from the project.
	 * 
	 * @param project the {@link ECPProject} to read the data from
	 */
	public AbstractEClassTreeSelectionComposite(ECPProject project) {
		this(project.getUnsupportedEPackages(), project.getVisiblePackages(), project.getVisibleEClasses());
	}

	private ILabelProvider getLabelProvider() {
		return meClassLabelProvider;
	}

	private ITreeContentProvider getContentProvider() {
		return modelTreeContentProvider;
	}

	private Object getInput() {
		// give an empty object, otherwise it does not initialize
		return new Object();
	}

	@Override
	protected ECPViewerFilter getFilter() {
		return filter;
	}

	/**
	 * Whether the Tree is a checked tree.
	 * 
	 * @return true if a checked tree, false otherwise
	 */
	protected abstract boolean isCheckedTree();

	@Override
	protected TreeViewer createViewer(Composite composite) {
		TreeViewer viewer = null;
		if (isCheckedTree()) {
			viewer = createCheckedTreeViewer(composite);
		} else {
			viewer = createTreeViewer(composite);
		}
		return viewer;
	}

	private TreeViewer createTreeViewer(Composite composite) {
		return TreeViewerFactory.createTreeViewer(composite, getLabelProvider(), getContentProvider(), getInput(),
			null, true);
	}

	private TreeViewer createCheckedTreeViewer(Composite composite) {
		return TreeViewerFactory.createCheckedTreeViewer(composite, getLabelProvider(), getContentProvider(),
			getInput(), null, true);
	}

	@Override
	protected void expandViewer() {
		getViewer().expandAll();
	}

	@Override
	protected void collapsViewer() {
		getViewer().collapseAll();
	}

	/** {@inheritDoc} **/
	public void dispose() {
		composedAdapterFactory.dispose();
		meClassLabelProvider.dispose();
		modelTreeContentProvider.dispose();
	}
}
