/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on org.eclipse.e4.ui.css.core.dom.properties.css2.AbstractCSSPropertyMarginHandler
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.w3c.dom.css.CSSValue;

/**
 * An css property handler that handles "spacing".
 * 
 */
@SuppressWarnings("restriction")
public abstract class AbstractCSSPropertySpacingHandler implements ICSSPropertySpacingHandler {

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public boolean applyCSSProperty(Object element, String property, CSSValue value, String pseudo, CSSEngine engine)
		throws Exception {
		// END SUPRESS CATCH EXCEPTION
		if ("spacing-horizontal".equals(property)) {
			applyCSSPropertySpacingHorizontal(element, value, pseudo, engine);
		} else if ("spacing-vertical".equals(property)) {
			applyCSSPropertySpacingVertical(element, value, pseudo, engine);
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public String retrieveCSSProperty(Object element, String property, String pseudo, CSSEngine engine)
		throws Exception {
		// END SUPRESS CATCH EXCEPTION
		if ("spacing-horizontal".equals(property)) {
			return retrieveCSSPropertySpacingHorizontal(element, pseudo, engine);
		}
		if ("spacing-vertical".equals(property)) {
			return retrieveCSSPropertySpacingVertical(element, pseudo, engine);
		}
		return null;
	}
}
