package org.eclipse.emf.ecp.e4.editor;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.e4.application.Activator;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;


public class E4ModelElementOpener implements ECPModelElementOpener {

	@Override
	public void openModelElement(Object modelElement, ECPProject ecpProject) {
		
//		Activator.getEContextService();
		EPartService partService=Activator.getEPartService();
		MPart part=partService.createPart("org.eclipse.emf.ecp.e4.application.partdescriptor.editor");
		partService.showPart(part, PartState.ACTIVATE);
	}

}
