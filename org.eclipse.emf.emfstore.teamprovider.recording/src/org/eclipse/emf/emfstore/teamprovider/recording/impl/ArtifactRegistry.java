package org.eclipse.emf.emfstore.teamprovider.recording.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;

/**
 * Keeps track of which artifacts are considered to be under recorder control.
 * @author emueller
 *
 */
public class ArtifactRegistry {
	
	public static final String PREFERENCE_DELIMITER = ";";
	private Map<URI, Artifact> recordedArtifacts;
	private Set<URI> flags;
	private Map<URI, Boolean> clearHistoryFiles;
	
	private static ArtifactRegistry registry;
	
	public static ArtifactRegistry getInstance() {
		if (registry == null) {
			registry = new ArtifactRegistry();
		}
		return registry;
	}

	private ArtifactRegistry() {
		recordedArtifacts = new HashMap<URI, Artifact>();
		flags = new HashSet<URI>();
		clearHistoryFiles = new HashMap<URI, Boolean>();
	}

	/**
	 * Adds a {@link Artifact} to the registry.
	 * @param artifact the artifact to be added 
	 * @param isLoading whether the artifact is loading or whether it is 
	 * 		considered to be a new one not yet put under recorder control
	 */
	public void addVersionedArtifact(Artifact artifact) {
		recordedArtifacts.put(artifact.getURI(), artifact);
//		artifact.initialize();
		// TODO: write versioned artifact to preference store
		//		 e.g. by means of using the filename/URI
	}
	
	public Artifact getVersionedArtifact(URI uri) {
		return recordedArtifacts.get(uri);
	}
	
	
	/**
	 * Removes the artifact 
	 * @param uri
	 */
	public void removeVersionedArtifact(URI uri) {
		Artifact versionedArtifact = recordedArtifacts.get(uri);
		versionedArtifact.dispose();
		recordedArtifacts.remove(uri);
		deleteHistoryFile(uri);
	}
	
	// TODO: remove?
	public boolean isRegistered(URI uri) {
		return recordedArtifacts.containsKey(uri);
	}
	
	public boolean isRegistered(IFile artifactFile) {
		return recordedArtifacts.containsKey(FileUtil.getUri(artifactFile));
	}
	
	private void deleteHistoryFile(URI uri) {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = FileUtil.getFile(uri);
		IPath historyPath = file.getFullPath().removeFileExtension().addFileExtension("hist");
		IFile historyFile = root.getFile(historyPath);
		try {
			historyFile.delete(true, new NullProgressMonitor());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void flag(URI uri) {
		flags.add(uri);
	}
	
	public void flag(IFile artifactFile) {
		flags.add(FileUtil.getUri(artifactFile));
	}
	
	public void markClearHistory(URI uri) {
		clearHistoryFiles.put(uri, true);
	}
	
	public void removeClearHistory(URI uri) {
		clearHistoryFiles.remove(uri);
	}
	
	public boolean isMarkedForClearHistory(URI uri) {
		return clearHistoryFiles.containsKey(uri);
	}
	
	public boolean isFlagged(URI uri) {
		return flags.contains(uri);
	}
	
	public boolean isPreRegistered(IFile artifactFile) {
		return flags.contains(FileUtil.getUri(artifactFile));
	}
	
	public void removeFlag(URI uri) {
		flags.remove(uri);
	}
}
