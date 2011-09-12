package org.eclipse.emf.emfstore.teamprovider.recording.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.Artifact;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactMerger;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactRegistry;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ResourceFactoryRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ExecuteMergerCommand extends AbstractHandler implements IViewActionDelegate  {


	@Override
	public void run(IAction action) {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		ISelection selection = page.getSelection();
		if (selection instanceof StructuredSelection) {
			StructuredSelection ss = (StructuredSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile file = (IFile) firstElement;
				Artifact versionedArtifact = ArtifactRegistry.getInstance().getVersionedArtifact(
						ResourceFactoryRegistry.CURRENT_URI);
				// TODO: how can this be not initalized?
				if (!versionedArtifact.isInitialized()) {
					versionedArtifact.initialize();
				}
				// file == must be history file ATM
				ArtifactMerger merger = new ArtifactMerger(file, versionedArtifact.getXmiResource(),
						versionedArtifact.getHistoryResource(),
						versionedArtifact.getCollection());
				merger.toString();
			}
		}
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void init(IViewPart view) {
		// TODO Auto-generated method stub
		
	}
}
