package org.eclipse.emf.ecp.explorereditorbridge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.editor.Activator;
import org.eclipse.emf.ecp.editor.MEEditorInput;
import org.eclipse.emf.ecp.ui.util.ModelElementOpener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class EditorModelElementOpener implements ModelElementOpener {

	public EditorModelElementOpener() {
		// TODO Auto-generated constructor stub
	}

	public int canOpen(EObject modelElement) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void openModelElement(EObject modelElement) {
		MEEditorInput input = new MEEditorInput(modelElement, new EditorContext(modelElement));
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.openEditor(input, "org.eclipse.emf.ecp.editor", true);
		} catch (PartInitException e) {
			Activator.logException(e);
		}

	}

}
