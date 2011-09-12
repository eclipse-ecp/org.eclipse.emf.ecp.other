package org.eclipse.emf.emfstore.teamprovider.recording.git;

import org.eclipse.emf.emfstore.teamprovider.recording.IRevision;
import org.eclipse.jgit.revwalk.RevCommit;

public class GitRevision implements IRevision<RevCommit> {
	
	private final RevCommit commit;
//	private final Repository repository;
//	private Project project;
//	private String id; // corresponds to hash id
	
	public GitRevision(RevCommit commit) {
		this.commit = commit;
	}

	@Override
	public RevCommit getRevision() {
		return commit;
	}

//	public GitRevision(Project project, Repository repository, RevCommit commit) {
//		this.repository = repository;
//		this.commit = commit;
//		this.project = project;
//	}

//	@SuppressWarnings("restriction")
//	@Override
//	public Collection<IFileRevision> getFiles() {
//		List<IFileRevision> result = new ArrayList<IFileRevision>();
//		GitProvider provider = (GitProvider)RepositoryProvider.getProvider(project);
//		IFileHistoryProvider fileHistoryProvider = provider.getFileHistoryProvider();
//		try {
//			for (IResource resouce : project.members()) {
//				IFileHistory fileHistory = fileHistoryProvider.getFileHistoryFor(
//						resouce,
//						IFileHistoryProvider.SINGLE_LINE_OF_DESCENT, new NullProgressMonitor());
//				IFileRevision iFileRevision = fileHistory.getFileRevision(id);
//				result.add(iFileRevision);
//			}
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return result;
//	}

	
}
