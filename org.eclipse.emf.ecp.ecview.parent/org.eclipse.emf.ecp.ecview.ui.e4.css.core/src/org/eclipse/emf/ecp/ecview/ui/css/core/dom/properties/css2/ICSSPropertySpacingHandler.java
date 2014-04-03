/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on org.eclipse.e4.ui.css.core.dom.properties.css2.ICSSPropertyMarginHandler
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2;

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
	// BEGIN SUPRESS CATCH EXCEPTION
	void applyCSSPropertySpacingHorizontal(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception; // END SUPRESS CATCH EXCEPTION

	/**
	 * Sets the vertical spacing. Available values are {length}
	 * 
	 * @param element
	 * @param value
	 * @param pseudo
	 * @param engine
	 * @throws Exception
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	void applyCSSPropertySpacingVertical(Object element, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception; // END SUPRESS CATCH EXCEPTION

	/**
	 * Retrieves the CSS property.
	 * 
	 * @param element
	 * @param pseudo
	 * @param engine
	 * @return value
	 * @throws Exception
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	String retrieveCSSPropertySpacingHorizontal(Object element, String pseudo, CSSEngine engine) throws Exception; // END

	/**
	 * Retrieves the CSS property.
	 * 
	 * @param element
	 * @param pseudo
	 * @param engine
	 * @return value
	 * @throws Exception
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	String retrieveCSSPropertySpacingVertical(Object element, String pseudo, CSSEngine engine) throws Exception; // END
																													// EXCEPTION
}
