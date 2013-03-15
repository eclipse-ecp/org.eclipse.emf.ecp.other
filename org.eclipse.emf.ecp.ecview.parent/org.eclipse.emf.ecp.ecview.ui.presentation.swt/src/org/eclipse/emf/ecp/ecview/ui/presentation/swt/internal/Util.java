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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;

public class Util {

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssClass()
	 */
	public static String getCssClass(YCssAble yCssAble) {
		return yCssAble.getCssClass();
	}

	/**
	 * Returns true, if the css class is not null and not empty.
	 * 
	 * @return
	 */
	public static boolean isCssClassValid(YCssAble yCssAble) {
		return getCssClass(yCssAble) != null && !getCssClass(yCssAble).equals("");
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssID()
	 */
	public static String getCssID(YCssAble yCssAble) {
		return yCssAble.getCssID();
	}

	/**
	 * Returns true, if the css id is not null and not empty.
	 * 
	 * @return
	 */
	public static boolean isCssIdValid(YCssAble yCssAble) {
		return getCssID(yCssAble) != null && !getCssID(yCssAble).equals("");
	}
}
