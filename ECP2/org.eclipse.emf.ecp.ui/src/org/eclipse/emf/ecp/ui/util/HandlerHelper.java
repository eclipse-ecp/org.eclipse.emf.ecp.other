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

package org.eclipse.emf.ecp.ui.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;
import org.eclipse.emf.ecp.core.exception.ProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPCloseable;
import org.eclipse.emf.ecp.core.util.ECPDeletable;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.internal.ui.Activator;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.internal.ui.dialogs.DeleteDialog;
import org.eclipse.emf.ecp.internal.ui.dialogs.ProjectPropertiesDialog;
import org.eclipse.emf.ecp.internal.ui.dialogs.RepositoryPropertiesDialog;
import org.eclipse.emf.ecp.internal.wizards.AddRepositoryWizard;
import org.eclipse.emf.ecp.internal.wizards.CheckoutProjectWizard;
import org.eclipse.emf.ecp.internal.wizards.CreateProjectWizard;
import org.eclipse.emf.ecp.internal.wizards.FilterModelElementWizard;
import org.eclipse.emf.ecp.internal.wizards.SelectModelElementWizard;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.spi.core.InternalProvider.LifecycleEvent;
import org.eclipse.emf.ecp.ui.common.AddRepositoryComposite;
import org.eclipse.emf.ecp.ui.common.CheckedModelClassComposite;
import org.eclipse.emf.ecp.ui.common.CheckoutProjectComposite;
import org.eclipse.emf.ecp.ui.common.CompositeFactory;
import org.eclipse.emf.ecp.ui.common.CreateProjectComposite;
import org.eclipse.emf.ecp.ui.common.SelectionComposite;
import org.eclipse.emf.edit.command.ChangeCommand;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This is a utility class providing commonly necessary methods.
 * 
 * @author Eugen Neufeld
 */
public final class HandlerHelper {
	private HandlerHelper() {
	}

	private static void showError(Shell shell, String title, String message) {
		MessageDialog.openError(shell, title, message);
	}

	/**
	 * This method allows to checkout a list of {@link ECPCheckoutSource} into the workspace.
	 * 
	 * @param checkoutObjects the List of {@link ECPCheckoutSource} to checkout
	 * @param shell the {@link Shell} to use for diplaying UI
	 */
	public static void checkout(final List<ECPCheckoutSource> checkoutObjects, final Shell shell) {
		for (ECPCheckoutSource checkoutSource : checkoutObjects) {
			CheckoutProjectComposite checkoutCompposite = CompositeFactory.getCheckoutProjectComposite(checkoutSource);
			CheckoutProjectWizard wizard = new CheckoutProjectWizard();
			wizard.setCompositeProvider(checkoutCompposite);

			WizardDialog wd = new WizardDialog(shell, wizard);

			int result = wd.open();
			if (result == WizardDialog.OK) {

				String projectName = checkoutCompposite.getProjectName();
				ECPProperties projectProperties = checkoutCompposite.getProjectProperties();
				try {
					checkoutSource.checkout(projectName, projectProperties);
				} catch (ProjectWithNameExistsException ex) {
					showError(shell, "Cannot checkout project", "A project with name " + projectName
						+ " already exists in the workspace.");
				}
			}
		}
	}

	/**
	 * This helper method is used to delete model elements from a project.
	 * 
	 * @param project the project to delete from
	 * @param eObjects the model elements to delete
	 */
	public static void deleteModelElement(final ECPProject project, final Collection<EObject> eObjects) {
		if (project != null) {
			project.delete(eObjects);
		}
	}

	/**
	 * This method creates a new project.
	 * 
	 * @param shell the shell for displaying the wizard
	 * @return the created {@link ECPProject}
	 */
	public static ECPProject createProject(final Shell shell) {
		List<ECPProvider> providers = new ArrayList<ECPProvider>();
		for (ECPProvider provider : ECPProviderRegistry.INSTANCE.getProviders()) {
			if (provider.hasUnsharedProjectSupport()) {
				providers.add(provider);
			}
		}
		if (providers.size() == 0) {
			// TODO language
			showError(shell, "No Provider", "Please check if a suitable provider is installed.");
			return null;
		}
		CreateProjectComposite createProjectComposite = CompositeFactory.getCreateProjectComposite(providers);
		CreateProjectWizard wizard = new CreateProjectWizard();
		wizard.setCompositeProvider(createProjectComposite);

		WizardDialog wd = new WizardDialog(shell, wizard);

		int result = wd.open();
		if (result == WizardDialog.OK) {
			ECPProvider selectedProvider = createProjectComposite.getProvider();
			if (selectedProvider == null) {
				showError(shell, "No project created", "Please check if a suitable provider is installed.");
				return null;
			}

			ECPProperties projectProperties = createProjectComposite.getProperties();
			String projectName = createProjectComposite.getProjectName();

			ECPProject project = null;
			try {
				project = ECPProjectManager.INSTANCE.createProject(selectedProvider, projectName, projectProperties);
			} catch (ProjectWithNameExistsException ex) {
				showError(shell, "No project created", "A project with name " + projectName
					+ " already exists in the workspace.");
				return null;
			}
			if (project == null) {
				showError(shell, "No project created", "Please check the log.");
				return null;
			}
			((InternalProvider) selectedProvider).handleLifecycle(project, LifecycleEvent.CREATE);
			project.open();
			return project;
		}
		return null;
	}

	/**
	 * Add a new {@link EObject} to the root of an {@link ECPProject}.
	 * 
	 * @param ecpProject the {@link ECPProject} to add the {@link EObject} to
	 * @param shell the {@link Shell} used to display the UI
	 * @param open whether to open the corresponding editor or not
	 */
	public static void addModelElement(final ECPProject ecpProject, final Shell shell, boolean open) {
		SelectionComposite<TreeViewer> helper = CompositeFactory.getSelectModelClassComposite(ecpProject);
		SelectModelElementWizard wizard = new SelectModelElementWizard(Messages.NewModelElementWizardHandler_Title,
			Messages.NewModelElementWizard_WizardTitle_AddModelElement,
			Messages.NewModelElementWizard_PageTitle_AddModelElement,
			Messages.NewModelElementWizard_PageDescription_AddModelElement);
		wizard.setCompositeProvider(helper);
		WizardDialog wd = new WizardDialog(shell, wizard);

		int wizardResult = wd.open();
		if (wizardResult == WizardDialog.OK) {
			Object[] selection = helper.getSelection();
			if (selection == null || selection.length == 0) {
				return;
			}
			EClass newMEType = (EClass) selection[0];
			// TODO find childdescriptor

			if (ecpProject != null && newMEType != null) {
				// 1.create ME
				EPackage ePackage = newMEType.getEPackage();
				final EObject newMEInstance = ePackage.getEFactoryInstance().create(newMEType);
				ecpProject.getEditingDomain().getCommandStack().execute(new ChangeCommand(newMEInstance) {

					@Override
					protected void doExecute() {
						ecpProject.getElements().add(newMEInstance);
					}
				});
				if (open) {
					// 3.open the newly created ME
					openModelElement(newMEInstance, ecpProject);
				}
			}
		}
	}

	/**
	 * This method allows the user to filter the visible packages and classes.
	 * 
	 * @param ecpProject the project to filter
	 * @param shell the {@link Shell} to use for UI
	 */
	public static void filterProjectPackages(final ECPProject ecpProject, final Shell shell) {
		Set<EPackage> ePackages = ECPUtil.getAllRegisteredEPackages();

		CheckedModelClassComposite checkedModelComposite = CompositeFactory.getCheckedModelClassComposite(ePackages);
		Set<Object> initialSelectionSet = new HashSet<Object>();
		initialSelectionSet.addAll(ecpProject.getVisiblePackages());
		initialSelectionSet.addAll(ecpProject.getVisibleEClasses());
		checkedModelComposite.setInitialSelection(initialSelectionSet.toArray());

		FilterModelElementWizard wizard = new FilterModelElementWizard();
		wizard.setCompositeProvider(checkedModelComposite);
		WizardDialog wd = new WizardDialog(shell, wizard);

		int wizardResult = wd.open();
		if (wizardResult == WizardDialog.OK) {
			Object[] dialogSelection = checkedModelComposite.getChecked();
			Set<EPackage> filtererdPackages = new HashSet<EPackage>();
			Set<EClass> filtererdEClasses = new HashSet<EClass>();
			for (Object object : dialogSelection) {
				if (object instanceof EPackage) {
					filtererdPackages.add((EPackage) object);
				} else if (object instanceof EClass) {
					EClass eClass = (EClass) object;
					if (!filtererdPackages.contains(eClass.getEPackage())) {
						filtererdEClasses.add(eClass);
					}
				}
			}
			ecpProject.setVisiblePackages(filtererdPackages);
			ecpProject.setVisibleEClasses(filtererdEClasses);
		}
	}

	/**
	 * This method created a new Repository.
	 * 
	 * @param shell the shell for the Wizard
	 * @return the created {@link ECPRepository}
	 */
	public static ECPRepository createRepository(final Shell shell) {
		AddRepositoryComposite addRepositoryComposite = CompositeFactory.getAddRepositoryComposite();
		AddRepositoryWizard wizard = new AddRepositoryWizard();
		wizard.setCompositeProvider(addRepositoryComposite);
		WizardDialog wd = new WizardDialog(shell, wizard);

		int wizardResult = wd.open();
		if (wizardResult == WizardDialog.OK) {
			ECPRepository ecpRepository = ECPRepositoryManager.INSTANCE.addRepository(
				addRepositoryComposite.getProvider(), addRepositoryComposite.getRepositoryName(),
				addRepositoryComposite.getRepositoryLabel() == null ? "" : addRepositoryComposite.getRepositoryLabel(), //$NON-NLS-1$
				addRepositoryComposite.getRepositoryDescription() == null ? "" : addRepositoryComposite //$NON-NLS-1$
					.getRepositoryDescription(), addRepositoryComposite.getProperties());
			return ecpRepository;
		}
		return null;
	}

	/**
	 * This method closes/opens an array of closables.
	 * 
	 * @param closeables the {@link ECPCloseable}s to change the state for
	 * @param currentType the action to do
	 */
	public static void changeCloseState(ECPCloseable[] closeables, String currentType) {
		for (ECPCloseable closeable : closeables) {
			if ("open".equalsIgnoreCase(currentType)) { //$NON-NLS-1$
				closeable.open();
			} else if ("close".equalsIgnoreCase(currentType)) { //$NON-NLS-1$
				closeable.close();
			}
		}
	}

	/**
	 * Deletes the provided {@link ECPDeletable} elements.
	 * 
	 * @param deletables the List of {@link ECPDeletable}s to delete
	 * @param shell the shell to use for UI
	 */
	public static void deleteHandlerHelper(List<ECPDeletable> deletables, Shell shell) {

		if (!deletables.isEmpty()) {
			DeleteDialog dialog = new DeleteDialog(shell, deletables);
			if (dialog.open() == DeleteDialog.OK) {
				for (ECPDeletable deletable : deletables) {
					deletable.delete();
				}
			}
		}
	}

	/**
	 * Triggers the save on an {@link ECPProject}.
	 * 
	 * @param project the project to save the changes on
	 */
	public static void saveProject(ECPProject project) {
		project.saveModel();
	}

	/**
	 * This opens the model element.
	 * 
	 * @param me
	 *            ModelElement to open
	 * @param sourceView
	 *            the view that requested the open model element
	 * @param ecpProject the {@link ECPProject} of the model element
	 */
	public static void openModelElement(final EObject me, ECPProject ecpProject) {
		if (me == null) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(),
				Messages.ActionHelper_ErrorTitle_ElementDeleted, Messages.ActionHelper_ErrorMessage_ElementDeleted);
			return;
		}
		IConfigurationElement[] modelelementopener = Platform.getExtensionRegistry().getConfigurationElementsFor(
			"org.eclipse.emf.ecp.ui.modelelementopener"); //$NON-NLS-1$
		ModelElementOpener bestCandidate = null;
		int bestValue = -1;
		for (IConfigurationElement element : modelelementopener) {
			modelelementopener = null;
			try {
				ModelElementOpener modelelementOpener = (ModelElementOpener) element.createExecutableExtension("class"); //$NON-NLS-1$
				for (IConfigurationElement testerElement : element.getChildren()) {
					if ("staticTester".equals(testerElement.getName())) {//$NON-NLS-1$
						int priority = Integer.parseInt(testerElement.getAttribute("priority"));//$NON-NLS-1$
						String type = testerElement.getAttribute("modelElement");
						try {
							Class<?> supportedClassType = Class.forName(type);
							if (supportedClassType.isInstance(me)) {
								if (priority > bestValue) {
									bestCandidate = modelelementOpener;
									bestValue = priority;
								}
							}

						} catch (ClassNotFoundException ex) {
							Activator.log(ex);
						}
					} else if ("dynamicTester".equals(testerElement.getName())) {//$NON-NLS-1$
						ModelElementOpenTester tester = (ModelElementOpenTester) testerElement
							.createExecutableExtension("tester"); //$NON-NLS-1$
						int value = tester.isApplicable(me);
						if (value > bestValue) {
							bestCandidate = modelelementOpener;
							bestValue = value;
						}
					}
				}

			} catch (CoreException e) {

				Activator.log(e);
			}
		}
		// TODO: find solution
		// ECPWorkspaceManager.getObserverBus().notify(ModelElementOpenObserver.class).onOpen(me, sourceView, name);
		// BEGIN SUPRESS CATCH EXCEPTION
		try {
			bestCandidate.openModelElement(me, ecpProject);
		} catch (RuntimeException e) {
			Activator.log(e);
		}
		// END SUPRESS CATCH EXCEPTION

	}

	/**
	 * @param project
	 * @param editable
	 * @param shell
	 */
	public static void openProjectProperties(ECPProject project, boolean editable, Shell shell) {
		new ProjectPropertiesDialog(shell, editable, project).open();
	}

	/**
	 * @param firstElement
	 * @param b
	 * @param activeShell
	 */
	public static void openRepositoryProperties(ECPRepository repository, boolean editable, Shell shell) {
		new RepositoryPropertiesDialog(shell, editable, repository).open();
	}
}
