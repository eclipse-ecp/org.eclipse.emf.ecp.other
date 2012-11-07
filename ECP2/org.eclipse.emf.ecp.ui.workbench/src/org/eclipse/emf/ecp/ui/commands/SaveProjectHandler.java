package org.eclipse.emf.ecp.ui.commands;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPModelContextProvider;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.emf.ecp.ui.views.TreeView;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;


public class SaveProjectHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ECPModelContextProvider contextProvider = (ECPModelContextProvider)((TreeView)HandlerUtil.getActivePart(event))
	        .getViewer().getContentProvider();
		IStructuredSelection selection=(IStructuredSelection)HandlerUtil.getCurrentSelection(event);
		ECPProject project = (ECPProject)ECPUtil.getModelContext(contextProvider, selection.getFirstElement());
		HandlerHelper.saveProject(project);
		return null;
	}

}