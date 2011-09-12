package org.eclipse.emf.emfstore.teamprovider.recording.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactRegistry;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.FileUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class DisableEMFStoreMergingCommand extends AbstractHandler implements IViewActionDelegate {

	private IFile selectedFile;

	public DisableEMFStoreMergingCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		URI platformURI = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);
		if (ArtifactRegistry.getInstance().isRegistered(platformURI)) {
			ArtifactRegistry.getInstance().removeVersionedArtifact(platformURI);
			// TODO: remove decorator
		} else if (!ArtifactRegistry.getInstance().isRegistered(platformURI) || !FileUtil.hasManagedFileExtension(selectedFile)) {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), 
					"File is not under versioned control",
					"The selected file is not put under versioned control. TODO");
		} 
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (!selection.isEmpty()) {
			StructuredSelection ss = (StructuredSelection)selection;
			try {
				if (!(ss.getFirstElement() instanceof IFile)) {
					return;
				}
				
				selectedFile = (IFile) ss.getFirstElement();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
