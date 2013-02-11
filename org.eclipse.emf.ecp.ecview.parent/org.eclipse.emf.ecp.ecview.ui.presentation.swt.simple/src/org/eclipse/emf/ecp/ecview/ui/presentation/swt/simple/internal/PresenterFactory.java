/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple.internal;

import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ICheckboxEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.INumericFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextAreaEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple.SimpleSwtRenderer;

/**
 * The presenter factory.
 */
public class PresenterFactory implements IPresentationFactory {

	@Override
	public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
		String presentationURI = uiContext.getPresentationURI();
		return presentationURI != null
				&& presentationURI.equals(SimpleSwtRenderer.UI_KIT_URI);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A createPresentation(
			IViewContext uiContext, IElementEditpart editpart) {

		A presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (A) new ViewPresentation((IViewEditpart) editpart);
		} else if (editpart instanceof ITextFieldEditpart) {
			presentation = (A) new TextFieldPresentation(editpart);
		} else if (editpart instanceof ILayoutEditpart) {
			presentation = (A) new GridLayoutPresentation(editpart);
		} else if (editpart instanceof ILabelEditpart) {
			presentation = (A) new LabelPresentation(editpart);
		} else if (editpart instanceof ITextAreaEditpart) {
			presentation = (A) new TextAreaPresentation(editpart);
		} else if (editpart instanceof ICheckboxEditpart) {
			presentation = (A) new CheckBoxPresentation(editpart);
		} else if (editpart instanceof INumericFieldEditpart) {
			presentation = (A) new NumericFieldPresentation(editpart);
		} else if (editpart instanceof IDecimalFieldEditpart) {
			presentation = (A) new DecimalFieldPresentation(editpart);
		}

		if (presentation == null) {
			throw new IllegalArgumentException(String.format(
					"No presenter available for editpart %s[%s]", editpart
							.getClass().getName(), editpart.getId()));
		}

		return presentation;
	}

}
