package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;

public class PresenterFactory implements IPresentationFactory {

	@Override
	public boolean isFor(IViewContext uiContext, IUiElementEditpart editpart) {
		String presentationURI = uiContext.getPresentationURI();
		return presentationURI != null && presentationURI.equals(SimpleSwtRenderer.UI_KIT_URI);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A createPresentation(IViewContext uiContext, IUiElementEditpart editpart) {
		if (editpart instanceof IUiViewEditpart) {
			return (A) new ViewPresentation((IUiViewEditpart) editpart);
		} else if (editpart instanceof IUiTextFieldEditpart) {
			return (A) new TextFieldPresentation(editpart);
		} else if (editpart instanceof IUiLayoutEditpart) {
			return (A) new GridLayoutPresentation(editpart);
		}

		throw new IllegalArgumentException(String.format("No presenter available for editpart %s[%s]", editpart
			.getClass().getName(), editpart.getId()));
	}

}
