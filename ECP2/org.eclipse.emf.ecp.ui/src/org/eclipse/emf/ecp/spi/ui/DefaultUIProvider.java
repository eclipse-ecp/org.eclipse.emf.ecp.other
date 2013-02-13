/*
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.ecp.spi.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.internal.core.util.Disposable;
import org.eclipse.emf.ecp.internal.core.util.Element;
import org.eclipse.emf.ecp.internal.ui.Activator;
import org.eclipse.emf.ecp.internal.ui.composites.PropertiesComposite;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Eike Stepper
 * @author Eugen Neufeld
 */
public class DefaultUIProvider extends Element implements UIProvider {

	private static final Image PROJECT_OPEN = Activator.getImage("icons/project_open.gif"); //$NON-NLS-1$
	private static final Image PROJECT_CLOSED = Activator.getImage("icons/project_closed.gif"); //$NON-NLS-1$
	private static final Image REPOSITORY = Activator.getImage("icons/repository.gif"); //$NON-NLS-1$

	private final Disposable disposable = new Disposable(this) {
		@Override
		protected void doDispose() {
			DefaultUIProvider.this.doDispose();
		}
	};

	private String label;

	private String description;

	/**
	 * Constructor of a {@link DefaultUIProvider}.
	 * 
	 * @param name the name for this {@link UIProvider}
	 */
	public DefaultUIProvider(String name) {
		super(name);
		label = name;
		description = "";
	}

	/** {@inheritDoc} **/
	public String getType() {
		return TYPE;
	}

	/** {@inheritDoc} **/
	public InternalProvider getProvider() {
		return (InternalProvider) ECPProviderRegistry.INSTANCE.getProvider(getName());
	}

	/** {@inheritDoc} **/
	public final String getLabel() {
		return label;
	}

	/** {@inheritDoc} **/
	public final void setLabel(String label) {
		this.label = label;
	}

	/** {@inheritDoc} **/
	public final String getDescription() {
		return description;
	}

	/** {@inheritDoc} **/
	public final void setDescription(String description) {
		this.description = description;
	}

	/** {@inheritDoc} **/
	public <T> T getAdapter(Object adaptable, Class<T> adapterType) {
		return null;
	}

	/**
	 * Returns an object which is an instance of the given class associated with this object. Returns <code>null</code>
	 * if
	 * no such object can be found.
	 * <p>
	 * This implementation of the method declared by <code>IAdaptable</code> passes the request along to the platform's
	 * adapter manager; roughly <code>Platform.getAdapterManager().getAdapter(this, adapter)</code>. Subclasses may
	 * override this method (however, if they do so, they should invoke the method on their superclass to ensure that
	 * the Platform's adapter manager is consulted).
	 * </p>
	 * 
	 * @param adapterType
	 *            the class to adapt to
	 * @return the adapted object or <code>null</code>
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(Class)
	 */
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapterType) {
		return Platform.getAdapterManager().getAdapter(this, adapterType);
	}

	/** {@inheritDoc} **/
	public final boolean isDisposed() {
		return disposable.isDisposed();
	}

	/** {@inheritDoc} **/
	public final void dispose() {
		disposable.dispose();
	}

	/** {@inheritDoc} **/
	public final void addDisposeListener(DisposeListener listener) {
		disposable.addDisposeListener(listener);
	}

	/** {@inheritDoc} **/
	public final void removeDisposeListener(DisposeListener listener) {
		disposable.removeDisposeListener(listener);
	}

	protected void doDispose() {
		// Subclasses can override.
	}

	/** {@inheritDoc} **/
	public String getText(Object element) {
		if (element instanceof Resource) {
			Resource resource = (Resource) element;
			return resource.getURI().lastSegment();
		}

		return UIProvider.EMF_LABEL_PROVIDER.getText(element);
	}

	/** {@inheritDoc} **/
	public Image getImage(Object element) {
		if (element instanceof ECPProject) {
			ECPProject project = (ECPProject) element;
			return project.isOpen() ? PROJECT_OPEN : PROJECT_CLOSED;
		}

		if (element instanceof ECPRepository) {
			return REPOSITORY;
		}

		return UIProvider.EMF_LABEL_PROVIDER.getImage(element);
	}

	/** {@inheritDoc} **/
	// TODO is this the right place for this implementation?
	public void fillContextMenu(IMenuManager manager, ECPModelContext context, Object[] elements) {
		if (elements.length == 1) {
			Object element = elements[0];
			if (context instanceof ECPProject) {
				fillContextMenuForProject(manager, (ECPProject) context, element);
			}
		}
	}

	private void fillContextMenuForProject(IMenuManager manager, final ECPProject project, Object element) {
		if (element instanceof Resource) {
			Resource resource = (Resource) element;
			populateNewRoot(resource, manager);
		} else if (element instanceof EObject) {
			final EditingDomain domain = project.getEditingDomain();
			Collection<?> descriptors = domain.getNewChildDescriptors(element, null);
			if (descriptors != null) {
				fillContextMenuWithDescriptors(manager, descriptors, domain, element, project);
			}
		}
	}

	/**
	 * @param descriptors
	 */
	private void fillContextMenuWithDescriptors(IMenuManager manager, Collection<?> descriptors,
		final EditingDomain domain, final Object object, final ECPProject project) {
		for (Object descriptor : descriptors) {
			final CommandParameter cp = (CommandParameter) descriptor;
			// TODO check containment?
			if (!cp.getEReference().isMany() || !cp.getEReference().isContainment()) {
				continue;
			}
			manager.add(new CreateChildAction(domain, new StructuredSelection(object), descriptor) {
				@Override
				public void run() {
					super.run();

					// try {
					// TODO what is correct
					domain.getCommandStack().execute(
						AddCommand.create(domain, object, ((CommandParameter) descriptor).getEStructuralFeature(),
							new Object[] { cp.getEValue() }));
					// object.eResource().save(null);
					HandlerHelper.openModelElement(cp.getEValue(), this.getClass().getName(), project);
					// } catch (IOException ex) {
					// Activator.log(ex);
					// }
				}
			});
		}
	}

	/** {@inheritDoc} **/
	public Control createAddRepositoryUI(Composite parent, ECPProperties repositoryProperties, Text repositoryNameText,
		Text repositoryLabelText, Text repositoryDescriptionText) {
		return new PropertiesComposite(parent, true, repositoryProperties);
	}

	/** {@inheritDoc} **/
	public Control createCheckoutUI(Composite parent, ECPCheckoutSource checkoutSource, ECPProperties projectProperties) {
		return new PropertiesComposite(parent, true, projectProperties);
	}

	protected boolean populateNewRoot(Resource resource, IMenuManager manager) {
		boolean populated = false;
		EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
		for (Map.Entry<String, Object> entry : getSortedRegistryEntries(packageRegistry)) {
			IContributionItem item = populateSubMenu(resource, entry.getKey(), entry.getValue(), packageRegistry);
			if (item != null) {
				manager.add(item);
				populated = true;
			}
		}

		return populated;
	}

	private static IContributionItem populateSubMenu(final Resource resource, String nsURI, Object value,
		final EPackage.Registry packageRegistry) {
		if (value instanceof EPackage) {
			EPackage ePackage = (EPackage) value;

			ImageDescriptor imageDescriptor = Activator.getImageDescriptor("icons/EPackage.gif");
			MenuManager submenuManager = new MenuManager(nsURI, imageDescriptor, nsURI);
			populateSubMenu(resource, ePackage, submenuManager);
			return submenuManager;
		}

		ImageDescriptor imageDescriptor = Activator.getImageDescriptor("icons/EPackageUnknown.gif");
		final MenuManager submenuManager = new MenuManager(nsURI, imageDescriptor, nsURI);
		submenuManager.setRemoveAllWhenShown(true);
		submenuManager.add(new Action("Calculating...") {
		});

		submenuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				String nsURI = submenuManager.getMenuText();
				EPackage ePackage = packageRegistry.getEPackage(nsURI);

				if (ePackage != null) {
					populateSubMenu(resource, ePackage, submenuManager);
				} else {
					Activator.log(MessageFormat.format("Can't find {0} in package registry", nsURI));
				}
			}
		});

		return submenuManager;
	}

	private static void populateSubMenu(final Resource resource, EPackage ePackage, final MenuManager submenuManager) {
		List<EObject> objects = new ArrayList<EObject>();
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				if (!eClass.isAbstract() && !eClass.isInterface()) {
					objects.add(EcoreUtil.create(eClass));
				}
			}
		}

		if (!objects.isEmpty()) {
			Collections.sort(objects, new Comparator<EObject>() {
				public int compare(EObject o1, EObject o2) {
					return o1.eClass().getName().compareTo(o2.eClass().getName());
				}
			});

			for (final EObject object : objects) {
				String text = object.eClass().getName();
				Image image = UIProvider.EMF_LABEL_PROVIDER.getImage(object);
				ImageDescriptor imageDescriptor = ExtendedImageRegistry.getInstance().getImageDescriptor(image);

				Action action = new Action(text, imageDescriptor) {
					@Override
					public void run() {
						resource.getContents().add(object);

						try {
							resource.save(null);
						} catch (IOException ex) {
							Activator.log(ex);
						}
					}
				};

				submenuManager.add(action);
			}
		}
	}

	private static Map.Entry<String, Object>[] getSortedRegistryEntries(EPackage.Registry packageRegistry) {
		Set<Map.Entry<String, Object>> entries = packageRegistry.entrySet();
		@SuppressWarnings("unchecked")
		Map.Entry<String, Object>[] array = entries.toArray(new Entry[entries.size()]);
		Arrays.sort(array, new Comparator<Map.Entry<String, Object>>() {
			public int compare(Map.Entry<String, Object> o1, Map.Entry<String, Object> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		return array;
	}
}
