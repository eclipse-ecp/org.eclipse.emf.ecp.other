package org.eclipse.emf.ecp.emfstore.core.internal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPModelContextAdapter;
import org.eclipse.emf.ecp.spi.core.DefaultProvider;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.ecp.spi.core.InternalRepository;
import org.eclipse.emf.ecp.spi.core.util.InternalChildrenList;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.emfstore.client.model.Configuration;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.ServerInfo;
import org.eclipse.emf.emfstore.client.model.Workspace;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.client.model.util.EMFStoreClientUtil;
import org.eclipse.emf.emfstore.common.model.IdEObjectCollection;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.IdEObjectCollectionChangeObserver;
import org.eclipse.emf.emfstore.server.exceptions.AccessControlException;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.eclipse.emf.emfstore.server.model.ProjectInfo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Eugen Neufeld
 */
public class EMFStoreProvider extends DefaultProvider {
	public static final String NAME = "org.eclipse.emf.ecp.emfstore.provider";

	public static EMFStoreProvider INSTANCE = new EMFStoreProvider();

	public static final String PROP_REPOSITORY_URL = "repositoryUrl";

	public static final String PROP_PORT = "port";

	public static final String PROP_CERTIFICATE = "certificate";

	public static final String PROP_PROJECTSPACEID = "projectSpaceID";

	public static final String PROP_SERVERINFOID = "serverInfoID";

	private AdapterImpl adapter;

	public EMFStoreProvider() {
		super(NAME);
		INSTANCE = this;
		configureEMFStore();
	}

	/**
   * 
   */
	private void configureEMFStore() {
		Configuration.setAutoSave(false);
	}

	// @Override
	// public Collection<EPackage> getUnsupportedEPackages(Collection<EPackage> packages)
	// {
	// Set<EPackage> unsupported = new HashSet<EPackage>();
	// for (EPackage ePackage : packages)
	// {
	// if (ePackage.getNsURI().equalsIgnoreCase("http://org/eclipse/example/bowling")
	// || ePackage.getNsURI().equals("http://eclipse.org/emf/emfstore/common/model")
	// || ePackage.getNsURI().equals("http://www4.in.tum.de/~af3/model")
	// || ePackage.getNsURI().equals("http://www.cksw.de/model/birequirements/0.1")
	// || ePackage.getESuperPackage() != null
	// && ePackage.getESuperPackage().getNsURI().equals("http://www.cksw.de/model/birequirements/0.1"))
	// {
	// continue;
	// }
	// unsupported.add(ePackage);
	//
	// }
	// return unsupported;
	// }

	@Override
	public void fillChildren(ECPModelContext context, Object parent, InternalChildrenList childrenList) {
		if (parent instanceof InternalProject) {
			ProjectSpace projectSpace = getProjectSpace((InternalProject) parent);
			if (projectSpace != null) {
				childrenList.addChildren(projectSpace.getProject().getModelElements());
			}
		} else if (parent instanceof InternalRepository) {
			ServerInfo serverInfo = getServerInfo((InternalRepository) parent);
			if (serverInfo.getLastUsersession() != null) {
				try {
					if (!serverInfo.getLastUsersession().isLoggedIn()
						&& serverInfo.getLastUsersession().getSessionId() != null) {
						serverInfo.getLastUsersession().logIn();
					}
					EList<ProjectInfo> projectInfos = serverInfo.getProjectInfos();
					for (ProjectInfo projectInfo : projectInfos) {
						childrenList.addChild(new EMFStoreProjectWrapper((InternalRepository) parent,
							new EMFStoreCheckoutData(serverInfo, projectInfo)));
					}

				} catch (AccessControlException ex) {
					Activator.log(ex);
				} catch (EmfStoreException e) {
					Activator.log(e);
				}

			}
		}
		super.fillChildren(context, parent, childrenList);
	}

	@Override
	public boolean hasUnsharedProjectSupport() {
		return true;
	}

	public EList<Object> getElements(InternalProject project) {
		ProjectSpace projectSpace = getProjectSpace(project);
		return new BasicEList<Object>(projectSpace.getProject().getModelElements());
	}

	@Override
	public void handleLifecycle(ECPModelContext context, LifecycleEvent event) {
		switch (event) {
		case INIT:
			handleInit(context);
			break;
		case DISPOSE:
			handelDispose(context);
			break;
		case CREATE:
			handleCreate(context);
			break;
		default:
			break;
		}
		// TODO Trace properly
		String providerClass = getClass().getSimpleName();
		String contextClass = context.getClass().getSimpleName();
		System.out.println(providerClass + " received " + event + " for " + contextClass + " " + context);
	}

	/**
	 * @param context
	 */
	private void handleCreate(final ECPModelContext context) {
		if (context instanceof InternalRepository) {
			ServerInfo serverInfo = getServerInfo((InternalRepository) context);
			if (serverInfo.getLastUsersession() != null && !serverInfo.getLastUsersession().isLoggedIn()) {
				try {
					serverInfo.getLastUsersession().logIn();
				} catch (AccessControlException ex) {
					Activator.log(ex);
				} catch (EmfStoreException ex) {
					Activator.log(ex);
				}
			}
		} else if (context instanceof InternalProject) {
			getProjectSpace((InternalProject) context);
			// InternalProject project = (InternalProject)context;
			// if (project.getRepository() != null)
			// {
			// ServerInfo serverInfo = getServerInfo(project.getRepository());
			// if (serverInfo.getLastUsersession() != null && serverInfo.getLastUsersession().isLoggedIn())
			// {
			// for (ProjectInfo projectInfo :
			// WorkspaceManager.getInstance().getCurrentWorkspace().getp.getProjectInfos())
			// {
			// if (projectInfo.getProjectId().getId().equals(project.getProperties().getValue(PROP_PROJECTSPACEID)))
			// {
			// try
			// {
			// ProjectSpace projectSpace = WorkspaceManager.getInstance().getCurrentWorkspace()
			// .checkout(serverInfo.getLastUsersession(), projectInfo);
			//
			// WorkspaceManager.getInstance().getCurrentWorkspace().save();
			// if (project.getProviderSpecificData() == null)
			// {
			// project.setProviderSpecificData(projectSpace);
			// }
			// }
			// catch (EmfStoreException ex)
			// {
			// Activator.log(ex);
			// }
			//
			// }
			// }
			// }
			// }
		}
	}

	/**
	 * @param context
	 */
	private void handelDispose(ECPModelContext context) {
		if (context instanceof InternalProject) {
			ProjectSpace projectSpace = getProjectSpace((InternalProject) context);

			projectSpace.getProject().eAdapters().remove(adapter);

		}

	}

	/**
	 * @param context
	 */
	private void handleInit(final ECPModelContext context) {
		if (context instanceof InternalProject) {
			ProjectSpace projectSpace = getProjectSpace((InternalProject) context);
			if (projectSpace == null) {
				return;
			}
			projectSpace.getProject().addIdEObjectCollectionChangeObserver(new IdEObjectCollectionChangeObserver() {
				// 2
				public void notify(Notification notification, IdEObjectCollection collection, EObject modelElement) {

					((InternalProject) context).notifyObjectsChanged(new Object[] { modelElement }, false);
				}

				// 3
				public void modelElementRemoved(IdEObjectCollection collection, EObject modelElement) {
					if (modelElement.eContainer() == null) {
						((InternalProject) context).notifyObjectsChanged(new Object[] { modelElement, context }, true);
					}
				}

				// 1
				public void modelElementAdded(IdEObjectCollection collection, EObject modelElement) {
					if (Project.class.isInstance(modelElement.eContainer())) {
						((InternalProject) context).notifyObjectsChanged(new Object[] { context, modelElement }, true);
					}
					((InternalProject) context).notifyObjectsChanged(new Object[] { modelElement }, true);
				}

				public void collectionDeleted(IdEObjectCollection collection) {
					// project delete
					((InternalProject) context).notifyObjectsChanged(new Object[] { context }, true);
				}
			});
		}

	}

	// /**
	// * @param repository
	// */
	// // TODO remove
	// public EList<ProjectInfo> getAllProjects(ECPRepository repository, String user, String password)
	// {
	// ServerInfo serverInfo = getServerInfo((InternalRepository)repository);
	// if (serverInfo.getLastUsersession() == null)
	// {
	// Usersession usersession = ModelFactory.eINSTANCE.createUsersession();
	// usersession.setServerInfo(serverInfo);
	// usersession.setUsername(user);
	// usersession.setPassword(password);
	// serverInfo.setLastUsersession(usersession);
	// }
	// if (!serverInfo.getLastUsersession().isLoggedIn())
	// {
	// try
	// {
	// serverInfo.getLastUsersession().logIn();
	// }
	// catch (Exception ex)
	// {
	// Activator.log(ex);
	// }
	// }
	//
	// return serverInfo.getProjectInfos();
	// }

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.DefaultProvider#getLinkElements(org.eclipse.emf.ecore.EObject,
	 * org.eclipse.emf.ecore.EReference)
	 */
	@Override
	public Iterator<EObject> getLinkElements(InternalProject project, EObject modelElement, EReference eReference) {
		Collection<EObject> result = new HashSet<EObject>();
		ItemPropertyDescriptor.collectReachableObjectsOfType(new HashSet<EObject>(), result, getProjectSpace(project)
			.getProject(), eReference.getEType());
		return result.iterator();
	}

	public ProjectSpace getProjectSpace(InternalProject internalProject) {
		return getProjectSpace(internalProject, true);
	}

	private ProjectSpace getProjectSpace(InternalProject internalProject, boolean createNewIfNeeded) {
		ProjectSpace projectSpace = (ProjectSpace) internalProject.getProviderSpecificData();
		if (projectSpace == null) {
			boolean found = false;
			EList<ProjectSpace> projectSpaces = WorkspaceManager.getInstance().getCurrentWorkspace().getProjectSpaces();
			for (ProjectSpace ps : projectSpaces) {
				String projectSpaceID = internalProject.getProperties().getValue(EMFStoreProvider.PROP_PROJECTSPACEID);
				if (ps.getIdentifier().equals(projectSpaceID)) {
					found = true;
					projectSpace = ps;
					break;
				}
			}
			if (!found && createNewIfNeeded) {
				projectSpace = WorkspaceManager.getInstance().getCurrentWorkspace()
					.createLocalProject(internalProject.getName(), "");
				internalProject.getProperties().addProperty(EMFStoreProvider.PROP_PROJECTSPACEID,
					projectSpace.getIdentifier());

			}
			internalProject.setProviderSpecificData(projectSpace);
			projectSpace.getProject().eResource().eAdapters().add(new ECPModelContextAdapter(internalProject));
		}
		return projectSpace;
	}

	public ServerInfo getServerInfo(InternalRepository internalRepository) {
		ServerInfo serverInfo = (ServerInfo) internalRepository.getProviderSpecificData();
		if (serverInfo == null) {
			Workspace workspace = WorkspaceManager.getInstance().getCurrentWorkspace();

			boolean foundExisting = false;
			for (ServerInfo info : workspace.getServerInfos()) {
				if (internalRepository.getProperties().hasProperties()
					&& isSameServerInfo(info,
						internalRepository.getProperties().getValue(EMFStoreProvider.PROP_REPOSITORY_URL),
						Integer.parseInt(internalRepository.getProperties().getValue(EMFStoreProvider.PROP_PORT)),
						internalRepository.getProperties().getValue(EMFStoreProvider.PROP_CERTIFICATE))) {
					serverInfo = info;
					foundExisting = true;
					break;
				}
			}
			if (!foundExisting && internalRepository.getProperties().hasProperties()) {
				serverInfo = EMFStoreClientUtil.createServerInfo(
					internalRepository.getProperties().getValue(EMFStoreProvider.PROP_REPOSITORY_URL),
					Integer.parseInt(internalRepository.getProperties().getValue(EMFStoreProvider.PROP_PORT)),
					internalRepository.getProperties().getValue(EMFStoreProvider.PROP_CERTIFICATE));
				workspace.addServerInfo(serverInfo);
				workspace.save();
			} else {
				serverInfo = EMFStoreClientUtil.giveServerInfo("localhost", 8080);
			}
			internalRepository.setProviderSpecificData(serverInfo);
		}
		return serverInfo;
	}

	/**
	 * @param info
	 * @param ecpProperties
	 * @return
	 */
	private boolean isSameServerInfo(ServerInfo info, String url, int port, String certificate) {
		return info.getUrl().equalsIgnoreCase(url) && info.getPort() == port
			&& info.getCertificateAlias().equalsIgnoreCase(certificate);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.DefaultProvider#doSave(org.eclipse.emf.ecp.spi.core.InternalProject)
	 */
	@Override
	public void doSave(InternalProject project) {
		getProjectSpace(project).save();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.DefaultProvider#isDirty(org.eclipse.emf.ecp.spi.core.InternalProject)
	 */
	@Override
	public boolean isDirty(InternalProject project) {
		return getProjectSpace(project).hasUnsavedChanges();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.DefaultProvider#hasAutosave(org.eclipse.emf.ecp.spi.core.InternalProject)
	 */
	@Override
	public boolean hasAutosave(InternalProject project) {
		return Configuration.isAutoSaveEnabled();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.InternalProvider#delete(org.eclipse.emf.ecp.spi.core.InternalProject,
	 * java.util.Collection)
	 */
	public void delete(InternalProject project, Collection<EObject> eObjects) {
		ProjectSpace projectSpace = getProjectSpace(project);
		for (EObject eObject : eObjects) {
			projectSpace.getProject().deleteModelElement(eObject);
		}
	}

	public void cloneProject(final InternalProject projectToClone, InternalProject targetProject) {
		ProjectSpace toClone = getProjectSpace(projectToClone);
		ProjectSpace target = getProjectSpace(targetProject);
		target.setProject(EcoreUtil.copy(toClone.getProject()));
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.DefaultProvider#contains(org.eclipse.emf.ecore.EObject)
	 */

	public boolean contains(InternalProject internalProject, EObject eObject) {
		ProjectSpace projectSpace = getProjectSpace(internalProject);
		return projectSpace.getProject().containsInstance(eObject);
	}

	@Override
	public boolean modelExists(InternalProject project) {
		return getProjectSpace(project, false) != null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.spi.core.InternalProvider#getRoot(org.eclipse.emf.ecp.spi.core.InternalProject)
	 */
	public boolean isRoot(InternalProject project, Object object) {
		return object.equals(getProjectSpace(project).getProject());
	}

	/**
	 * @param projectSpace
	 * @return
	 */
	public ECPProject getProject(ProjectSpace projectSpace) {
		for (InternalProject project : getOpenProjects()) {
			ProjectSpace localProjectSpace = (ProjectSpace) project.getProviderSpecificData();
			if (localProjectSpace.equals(projectSpace)) {
				return project;
			}
		}
		return null;
	}
}
