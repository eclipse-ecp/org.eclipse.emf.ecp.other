package org.eclipse.emf.ecp.ui.uimodel.css.swt.properties.css2;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.swt.helpers.SWTElementHelpers;
import org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2.AbstractCSSPropertySpacingHandler;
import org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2.CssConstants;
import org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2.ICSSPropertySpacingHandler;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Widget;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.CSSValue;

@SuppressWarnings("restriction")
public class CSSPropertySpacingSWTHandler extends AbstractCSSPropertySpacingHandler {

	public final static ICSSPropertySpacingHandler INSTANCE = new CSSPropertySpacingSWTHandler();

	private final static int HORIZONTAL = 0;
	private final static int VERTICAL = 1;

	public boolean applyCSSProperty(Object element, String property, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {

		super.applyCSSProperty(element, property, value, pseudo, engine);
		return true;
	}

	public void applyCSSPropertyMargin(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {

		if (value.getCssValueType() == CSSValue.CSS_PRIMITIVE_VALUE) {
			setSpacing(element, HORIZONTAL, value, pseudo);
			setSpacing(element, VERTICAL, value, pseudo);
			return;
		}
	}

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

	private GridLayout getLayout(Control control) {
		if (control == null)
			return null;
		if (!(control instanceof Composite))
			return null;

		if (control.getData(CssConstants.SPACING_ENABLED) == null)
			return null;

		Layout layout = ((Composite) control).getLayout();
		if (layout == null || !(layout instanceof GridLayout))
			return null;
		return (GridLayout) layout;
	}

	private void setSpacing(Object element, int side, CSSValue value, String pseudo) {
		if (value.getCssValueType() != CSSValue.CSS_PRIMITIVE_VALUE)
			return;
		int pixelValue = (int) ((CSSPrimitiveValue) value).getFloatValue(CSSPrimitiveValue.CSS_PX);

		Widget widget = SWTElementHelpers.getWidget(element);

		if (!(widget instanceof Control))
			return;

		GridLayout layout = getLayout((Control) widget);
		if (layout == null)
			return;
		switch (side) {
		case HORIZONTAL:
			layout.horizontalSpacing = pixelValue;
			break;
		case VERTICAL:
			layout.verticalSpacing = pixelValue;
			break;
		}
	}
}
