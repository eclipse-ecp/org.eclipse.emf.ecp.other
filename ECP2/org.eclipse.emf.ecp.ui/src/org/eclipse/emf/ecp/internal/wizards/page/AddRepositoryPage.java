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

package org.eclipse.emf.ecp.internal.wizards.page;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.internal.ui.Activator;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.ui.common.AddRepositoryComposite;
import org.eclipse.emf.ecp.ui.common.AddRepositoryComposite.AddRepositoryChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Eugen Neufeld
 */
public class AddRepositoryPage extends WizardPage {

	/**
	 * @param pageName
	 */
	public AddRepositoryPage(String pageName, AddRepositoryComposite addRepositoryComposite) {
		super(pageName);
		this.addRepositoryComposite = addRepositoryComposite;
	}

	private AddRepositoryComposite addRepositoryComposite;

	/** {@inheritDoc} */
	public void createControl(Composite parent) {
		setPageComplete(false);
		setTitle(Messages.AddRepositoryPage_PageTitle_AddRepository);
		setImageDescriptor(Activator.getImageDescriptor("icons/checkout_project_wiz.png")); //$NON-NLS-1$
		setMessage(Messages.AddRepositoryPage_PageMessage_AddRepository);

		addRepositoryComposite.setListener(new AddRepositoryChangeListener() {

			public void repositoryProviderChanged(ECPProvider provider) {
			}

			public void repositoryNameChanged(String repositoryName) {
				if (repositoryName != null && repositoryName.length() != 0) {
					setPageComplete(true);
				} else {
					setPageComplete(false);
				}
			}

			public void repositoryLabelChanged(String repositoryLabel) {
			}

			public void repositoryDescriptionChanged(String repositoryDescription) {
			}
		});
		Composite composite = addRepositoryComposite.createUI(parent);
		setControl(composite);
	}

}
