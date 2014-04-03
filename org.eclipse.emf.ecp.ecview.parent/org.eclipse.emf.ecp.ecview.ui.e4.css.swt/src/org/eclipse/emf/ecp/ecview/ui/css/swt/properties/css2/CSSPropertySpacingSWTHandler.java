/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on org.eclipse.e4.ui.css.swt.properties.css2.CSSPropertySpacingSWTHandler
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.css.swt.properties.css2;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.swt.helpers.SWTElementHelpers;
import org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2.AbstractCSSPropertySpacingHandler;
import org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2.CssConstants;
import org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2.ICSSPropertySpacingHandler;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Widget;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.CSSValue;

/**
 * A CSS handler for spacings.
 */
@SuppressWarnings("restriction")
public class CSSPropertySpacingSWTHandler extends AbstractCSSPropertySpacingHandler {
	/**
	 * The singleton instance.
	 */
	public static final ICSSPropertySpacingHandler INSTANCE = new CSSPropertySpacingSWTHandler();

	private static final int HORIZONTAL = 0;
	private static final int VERTICAL = 1;

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public boolean applyCSSProperty(Object element, String property, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {// END SUPRESS CATCH EXCEPTION

		super.applyCSSProperty(element, property, value, pseudo, engine);
		return true;
	}

	/**
	 * Applies the CSS spacing.
	 * 
	 * @param element
	 * @param value
	 * @param pseudo
	 * @param engine
	 * @throws Exception
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void applyCSSPropertySpacing(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {
		// END SUPRESS CATCH EXCEPTION

		if (value.getCssValueType() == CSSValue.CSS_PRIMITIVE_VALUE) {
			setSpacing(element, HORIZONTAL, value, pseudo);
			setSpacing(element, VERTICAL, value, pseudo);
			return;
		}
	}

	// BEGIN SUPRESS CATCH EXCEPTION
	public void applyCSSPropertySpacingHorizontal(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {
		setSpacing(element, HORIZONTAL, value, pseudo);
	}

	public void applyCSSPropertySpacingVertical(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {
		setSpacing(element, VERTICAL, value, pseudo);
	}

	public String retrieveCSSPropertySpacingHorizontal(Object element, String pseudo, CSSEngine engine)
		throws Exception {
		return null;
	}

	public String retrieveCSSPropertySpacingVertical(Object element, String pseudo, CSSEngine engine) throws Exception {
		return null;
	}
	// END SUPRESS CATCH EXCEPTION

	private GridLayout getLayout(Control control) {
		if (control == null) {
			return null;
		}
		if (!(control instanceof Composite)) {
			return null;
		}

		if (control.getData(CssConstants.SPACING_ENABLED) == null) {
			return null;
		}

		Layout layout = ((Composite) control).getLayout();
		if (layout == null || !(layout instanceof GridLayout)) {
			return null;
		}
		return (GridLayout) layout;
	}

	private void setSpacing(Object element, int side, CSSValue value, String pseudo) {
		if (value.getCssValueType() != CSSValue.CSS_PRIMITIVE_VALUE){
			return;
		}
		int pixelValue = (int) ((CSSPrimitiveValue) value).getFloatValue(CSSPrimitiveValue.CSS_PX);

		Widget widget = SWTElementHelpers.getWidget(element);

		if (!(widget instanceof Control)){
			return;
		}

		GridLayout layout = getLayout((Control) widget);
		if (layout == null){
			return;
		}
		switch (side) {
		case HORIZONTAL:
			layout.horizontalSpacing = pixelValue;
			break;
		case VERTICAL:
			layout.verticalSpacing = pixelValue;
			break;
		default:
			break;
		}
	}
}
