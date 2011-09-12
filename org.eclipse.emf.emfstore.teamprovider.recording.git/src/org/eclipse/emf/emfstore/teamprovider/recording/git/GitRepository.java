package org.eclipse.emf.emfstore.teamprovider.recording.git;

import org.eclipse.emf.emfstore.teamprovider.recording.IRepository;
import org.eclipse.jgit.lib.Repository;

public class GitRepository implements IRepository<Repository> {

	private final Repository repository;

	public GitRepository(Repository repository) {
		this.repository = repository;
	}

	@Override
	public Repository getRepository() {
		return repository;
	}
}
