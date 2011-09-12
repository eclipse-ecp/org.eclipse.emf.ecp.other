package org.eclipse.emf.emfstore.teamprovider.recording.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactRegistry;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.FileUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class EnableEMFStoreMergingCommand extends AbstractHandler implements IViewActionDelegate {

	private IFile selectedFile;

	public EnableEMFStoreMergingCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println(event.toString());
		return null;
	}

	@Override
	public void run(IAction action) {
		if (ArtifactRegistry.getInstance().isRegistered(FileUtil.getUri(selectedFile))) {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), 
					"File already under EMFStore merger control",
					"The selected file already is under control of EMFStore merger.");
		} else if (FileUtil.hasManagedFileExtension(selectedFile)) {
//			URI platformResourceURI = URI.createPlatformResourceURI(FileUtil.getUri(selectedFile).toString(), true);
			ArtifactRegistry.getInstance().flag(FileUtil.getUri(selectedFile));
		} else {
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), 
					"File can not be put under control of EMFStore merger",
					"The selected file can not be put under control of EMFStore merger. TODO"); 
			// TODO: show, that file can not be put under version control ->
			// 		 provide possibility to do so??
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (!selection.isEmpty()) {
			StructuredSelection ss = (StructuredSelection)selection;
			// TODO: IFile or XMIResource??
			if (!(ss.getFirstElement() instanceof IFile)) {
				return;				
			}
			try {
				selectedFile = (IFile) ss.getFirstElement();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void init(IViewPart view) {
		// TODO Auto-generated method stub
		
	}
}
