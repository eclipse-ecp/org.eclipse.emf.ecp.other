/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering, Technische Universitaet Muenchen. All rights
 * reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public
 * License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.teamprovider.recording;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.client.model.WorkspaceManager;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactRegistry;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.FileUtil;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ResourceFactoryRegistry;
//import org.eclipse.jgit.lib.IndexDiff;
//import org.eclipse.jgit.lib.Repository;
//import org.eclipse.jgit.treewalk.FileTreeIterator;
//import org.eclipse.jgit.treewalk.TreeWalk;
//import org.eclipse.jgit.treewalk.WorkingTreeIterator;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author emueller
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "org.eclipse.emf.emfstore.teamprovider.recording";

	/**
	 * The shared instance.
	 */
	private static Activator plugin;

	// TODO: enable multiple providesr
//	public static Map<String ,IVCSProvider> vcsProviders;
	public static IVCSProvider VCS_PROVIDER;

	/**
	 * The constructor.
	 */
	public Activator() {
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Override
	public void start(BundleContext context) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		super.start(context);
		plugin = this;

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Override
	public void stop(BundleContext context) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * {@inheritDoc}
	 */
	public void earlyStartup() {
		// TODO: initialize workspace
		WorkspaceManager.getInstance();
		ResourceFactoryRegistry.replaceSupportedFactories();
		try {
			initVCSProviders();
			initArtifacts();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		
		 //TODO: the listener is needed to check if any new history files
		//       have been added to the workspace, since there seems to be no
		//		 git pull hook -> part of VCS interface
		IResourceChangeListener listener = new IResourceChangeListener() {
			
			public void resourceChanged(IResourceChangeEvent event) {
				
				IResourceDelta delta = event.getDelta();
				
				for (IResource resource : fetchAffectedResources(delta, new HashSet<IResource>())) {
					if (!(resource instanceof IFile) || !FileUtil.isHistoryFile((IFile) resource)) {
						continue;
					}

					IFile historyFile = (IFile) resource;
					IFile artifactFile = FileUtil.getArtifactFile(historyFile);
					
					if (!ArtifactRegistry.getInstance().isRegistered(artifactFile)) {
						ArtifactRegistry.getInstance().flag(artifactFile);
						ArtifactRegistry.getInstance().markClearHistory(FileUtil.getUri(artifactFile));
					}
				}
			}
		};
		
		workspace.addResourceChangeListener(listener);	
	}

	private void initArtifacts() throws CoreException, InvocationTargetException, IOException {
	
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		for (IProject project : root.getProjects()) {
			for (IFile file: fetchAllFiles(project, new HashSet<IFile>())) {
				
				if (!FileUtil.isHistoryFile(file)) {
					continue;
				}

				// we know that file now needs to be the history file 
				IFile artifactFile = FileUtil.getArtifactFile(file);
				
				if (!ArtifactRegistry.getInstance().isRegistered(artifactFile) 
						|| !ArtifactRegistry.getInstance().isPreRegistered(artifactFile)) {
					ArtifactRegistry.getInstance().flag(artifactFile);
					VCS_PROVIDER.clearHistFile(artifactFile);
				}
			}
		}
	}

	
	
	/**
	 * Fetches all affected resources from an {@link IResourceDelta} contained in a 
	 * {@link IResourceChangeEvent}. 
	 * 
	 * @param delta the {@link IResourceDelta}
	 * @param resources a collection that will hold all resources, may be empty, but not null
	 * @return the given <code>resources</code> collection with all files contained within the given container
	 * @throws IllegalArgumentException if <code>files</code> is null
	 */
	private Set<IResource> fetchAffectedResources(IResourceDelta delta, Set<IResource> resources) {
		
		if (resources == null) {
			throw new IllegalArgumentException("files must not be null");
		}
		
		for (IResourceDelta childDelta : delta.getAffectedChildren()) {
			resources.add(childDelta.getResource());
			if (childDelta.getAffectedChildren() != null && childDelta.getAffectedChildren().length > 0) {
				fetchAffectedResources(childDelta, resources);
			}
		}
		
		return resources;
	}

	/**
	 * Fetches all instances of {@link IFile} contained in a {@link IContainer}.
	 * 
	 * @param container the container to fetch the files from
	 * @param files a collection that will hold all instances of files, may be empty, but not null
	 * @return the given <code>files</code> collection with all files contained within the given container
	 * @throws CoreException if the given container either does not exist or is not accessible
	 * @throws IllegalArgumentException if <code>files</code> is null
	 */
	private Collection<IFile> fetchAllFiles(IContainer container, Collection<IFile> files) 
		throws CoreException, IllegalArgumentException {
		
		if (files == null) {
			throw new IllegalArgumentException("files must not be null");
		}
		
		for (IResource resource : container.members()) {
			if (resource instanceof IContainer) {
				IContainer c = (IContainer) resource;
				files.addAll(fetchAllFiles(c, files));
			} else if (resource instanceof IFile){
				files.add((IFile) resource);
			}
		}
		return files; 
	}
	
	private void initVCSProviders() {
//		if (vcsProviders == null) {
			// collect singleton ID resolvers
//			vcsProviders = new HashMap<String, IVCSProvider>();
			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
					"org.eclipse.emf.emfstore.recording.provider");

			for (IConfigurationElement extension : config) {
				try {
					IVCSProvider provider = (IVCSProvider) extension.createExecutableExtension("class");
					String providerName =  extension.getAttribute("name");
//					vcsProviders.put(providerName, provider);
					VCS_PROVIDER = provider;
				} catch (CoreException e) {
					ModelUtil.logWarning("Couldn't instantiate Singleton ID resolver:"
							+ e.getMessage());
				}
			}
//		}
	}
}
