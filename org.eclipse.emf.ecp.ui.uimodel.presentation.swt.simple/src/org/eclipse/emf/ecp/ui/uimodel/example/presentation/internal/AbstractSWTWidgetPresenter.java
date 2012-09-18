package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public abstract class AbstractSWTWidgetPresenter extends AbstractDisposable implements IWidgetPresentation<Control> {

	/**
	 * Sets the css id at the control.
	 * 
	 * @param control
	 * @param id
	 */
	protected void setCSSId(Control control, String id) {
		WidgetElement.setID(control, id);
	}

	/**
	 * Sets the css class at the control.
	 * 
	 * @param control
	 * @param clazz
	 */
	protected void setCSSClass(Control control, String clazz) {
		WidgetElement.setCSSClass(control, clazz);
	}

}
