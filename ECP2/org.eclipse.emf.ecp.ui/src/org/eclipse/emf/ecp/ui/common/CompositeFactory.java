/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.ecp.ui.common;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.internal.ui.composites.AddRepositoryCompositeImpl;
import org.eclipse.emf.ecp.internal.ui.composites.CheckedSelectModelClassCompositeImpl;
import org.eclipse.emf.ecp.internal.ui.composites.CheckoutProjectCompositeImpl;
import org.eclipse.emf.ecp.internal.ui.composites.CreateProjectCompositeImpl;
import org.eclipse.emf.ecp.internal.ui.composites.SelectModelClassCompositeImpl;
import org.eclipse.emf.ecp.internal.ui.composites.SelectModelElementCompositeImpl;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * @author Eugen Neufeld
 * 
 */
public final class CompositeFactory {

	private CompositeFactory() {
	}

	public static AddRepositoryComposite getAddRepositoryComposite() {
		return new AddRepositoryCompositeImpl(null);
	}

	public static AddRepositoryComposite getAddRepositoryComposite(ECPProvider provider) {
		return new AddRepositoryCompositeImpl(provider);
	}

	public static CheckoutProjectComposite getCheckoutProjectComposite(ECPCheckoutSource checkoutSource) {
		return new CheckoutProjectCompositeImpl(checkoutSource);
	}

	public static CreateProjectComposite getCreateProjectComposite(List<ECPProvider> providers) {
		return new CreateProjectCompositeImpl(providers);
	}

	public static CheckedModelClassComposite getCheckedModelClassComposite(Collection<EPackage> ePackages) {
		return new CheckedSelectModelClassCompositeImpl(new HashSet<EPackage>(), ePackages, new HashSet<EClass>());
	}

	public static SelectionComposite<TreeViewer> getSelectModelClassComposite(
		Collection<EPackage> unsupportedEPackages, Collection<EPackage> filteredEPackages,
		Collection<EClass> filteredEClasses) {
		return new SelectModelClassCompositeImpl(unsupportedEPackages, filteredEPackages, filteredEClasses);
	}

	public static SelectionComposite<TreeViewer> getSelectModelClassComposite(ECPProject project) {
		return new SelectModelClassCompositeImpl(project);
	}

	public static SelectionComposite<TableViewer> getTableSelectionComposite(Object rootObject) {
		return new SelectModelElementCompositeImpl(rootObject);
	}

}
