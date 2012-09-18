package org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2;

import org.eclipse.e4.ui.css.core.dom.properties.ICSSPropertyHandler;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.w3c.dom.css.CSSValue;

/**
 * CSS Layout Spacing Handler.
 */
@SuppressWarnings("restriction")
public interface ICSSPropertySpacingHandler extends ICSSPropertyHandler {

	/**
	 * Sets the horizontal spacing. Available values are {length}
	 * 
	 * @param element
	 * @param value
	 * @param pseudo
	 * @param engine
	 * @throws Exception
	 */
	public void applyCSSPropertySpacingHorizontal(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception;

	/**
	 * Sets the vertical spacing. Available values are {length}
	 * 
	 * @param element
	 * @param value
	 * @param pseudo
	 * @param engine
	 * @throws Exception
	 */
	public void applyCSSPropertySpacingVertical(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception;

	public String retrieveCSSPropertySpacingHorizontal(Object element, String pseudo, CSSEngine engine)
		throws Exception;

	public String retrieveCSSPropertySpacingVertical(Object element, String pseudo, CSSEngine engine) throws Exception;

}
