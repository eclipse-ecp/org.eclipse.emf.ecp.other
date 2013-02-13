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
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.internal.wizards;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.internal.wizards.page.AddRepositoryPage;
import org.eclipse.emf.ecp.internal.wizards.page.SelectOrCreateRepositoryPage;
import org.eclipse.emf.ecp.internal.wizards.page.SelectRepositoryPage;
import org.eclipse.emf.ecp.ui.common.AddRepositoryComposite;
import org.eclipse.emf.ecp.ui.common.CompositeFactory;

import org.eclipse.jface.wizard.Wizard;

/**
 * @author Eugen Neufeld
 */
public class ShareWizard extends Wizard {

	private ECPRepository selectedRepository;

	private ECPProvider provider;

	// private AddRepositoryPage addPage;

	private AddRepositoryComposite repositoryComposite;

	/**
	 * @return the provider
	 */
	public ECPProvider getProvider() {
		return provider;
	}

	/**
	 * @return the selectedRepository
	 */
	public ECPRepository getSelectedRepository() {
		return selectedRepository;
	}

	/**
	 * @param selectedRepository
	 *            the selectedRepository to set
	 */
	public void setSelectedRepository(ECPRepository selectedRepository) {
		this.selectedRepository = selectedRepository;
	}

	/**
	 * . ({@inheritDoc})
	 */
	@Override
	public void addPages() {

		SelectOrCreateRepositoryPage userChoicePage = new SelectOrCreateRepositoryPage("UserChoice"); //$NON-NLS-1$
		SelectRepositoryPage selectPage = new SelectRepositoryPage("SelectRepository"); //$NON-NLS-1$
		repositoryComposite = CompositeFactory.getAddRepositoryComposite(provider);
		AddRepositoryPage addPage = new AddRepositoryPage("AddRepository", repositoryComposite); //$NON-NLS-1$
		addPage(userChoicePage);
		addPage(selectPage);
		addPage(addPage);
	}

	/**
	 * . ({@inheritDoc})
	 */
	@Override
	public boolean canFinish() {

		return selectedRepository != null || repositoryComposite.getProperties() != null
			&& repositoryComposite.getRepositoryName() != null;

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		if (selectedRepository == null) {
			selectedRepository = ECPRepositoryManager.INSTANCE
				.addRepository(
					provider,
					repositoryComposite.getRepositoryName(),
					repositoryComposite.getRepositoryLabel() == null ? "" : repositoryComposite.getRepositoryLabel(), //$NON-NLS-1$
					repositoryComposite.getRepositoryDescription() == null ? "" : repositoryComposite.getRepositoryDescription(), //$NON-NLS-1$
					repositoryComposite.getProperties());
		}
		return true;
	}

	/**
	 * @param provider
	 *            - {@link ECPProvider} to filter the known {@link ECPRepository}s by
	 */
	public void init(ECPProvider provider) {
		this.provider = provider;
		setWindowTitle(Messages.ShareWizard_Title_Share);
	}

}
