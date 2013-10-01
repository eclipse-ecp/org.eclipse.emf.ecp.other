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

	final String partId = "org.eclipse.emf.ecp.e4.application.partdescriptor.editor";

	@Override
	public void openModelElement(Object modelElement, ECPProject ecpProject) {

		EPartService partService = Activator.getEPartService();
		for (MPart existingPart : partService.getParts()) {
			if (!partId.equals(existingPart.getElementId())) {
				continue;
			}
			
			if (existingPart.getContext()==null) {
				continue;
			}

			if (existingPart.getContext().get(ECPE4Editor.INPUT) == modelElement) {
				if (!existingPart.isVisible() || !existingPart.isOnTop()) {
					partService.showPart(existingPart, PartState.ACTIVATE);
				}
				return;
			}
		}

		MPart part = partService.createPart(partId);
		partService.showPart(part, PartState.ACTIVATE);
		part.getContext().set(ECPProject.class, ecpProject);
		part.getContext().set(ECPE4Editor.INPUT, modelElement);
	}

}
