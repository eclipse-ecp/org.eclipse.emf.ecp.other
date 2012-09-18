package org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.w3c.dom.css.CSSValue;

@SuppressWarnings("restriction")
public abstract class AbstractCSSPropertySpacingHandler implements ICSSPropertySpacingHandler {

	public boolean applyCSSProperty(Object element, String property, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {
		if ("spacing-horizontal".equals(property)) {
			applyCSSPropertySpacingHorizontal(element, value, pseudo, engine);
		} else if ("spacing-vertical".equals(property)) {
			applyCSSPropertySpacingVertical(element, value, pseudo, engine);
		}
		return false;
	}

	public String retrieveCSSProperty(Object element, String property, String pseudo, CSSEngine engine)
		throws Exception {
		if ("spacing-horizontal".equals(property)) {
			return retrieveCSSPropertySpacingHorizontal(element, pseudo, engine);
		}
		if ("spacing-vertical".equals(property)) {
			return retrieveCSSPropertySpacingVertical(element, pseudo, engine);
		}
		return null;
	}
}
