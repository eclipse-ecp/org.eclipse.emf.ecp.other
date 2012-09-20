/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.IConstants;
import org.eclipse.swt.widgets.Control;

/**
 * An abstract implementation of the {@link IWidgetPresentation}.
 */
@SuppressWarnings("restriction")
public abstract class AbstractSWTWidgetPresenter extends AbstractDisposable implements IWidgetPresentation<Control> {

	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL_BASE}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL_BASE = IConstants.CSS_CLASS__CONTROL_BASE;
	// END SUPRESS CATCH EXCEPTION
	
	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL = IConstants.CSS_CLASS__CONTROL;
	// END SUPRESS CATCH EXCEPTION
	
	/**
	 * Sets the CSS id at the control.
	 * 
	 * @param control The control
	 * @param id The CSS id
	 */
	protected void setCSSId(Control control, String id) {
		WidgetElement.setID(control, id);
	}

	/**
	 * Sets the CSS class at the control.
	 * 
	 * @param control The control
	 * @param clazz The CSS id
	 */
	protected void setCSSClass(Control control, String clazz) {
		WidgetElement.setCSSClass(control, clazz);
	}

}
