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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple.internal;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import org.eclipse.riena.ui.ridgets.IDecimalTextRidget;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;

public class Util {

	/**
	 * Updates the ridget attributes based on the yInput.
	 * 
	 * @param ridget
	 * @param yInput
	 */
	public static void updateMarkableRidget(IMarkableRidget ridget,
			YInput yInput) {
		ridget.setEnabled(yInput.isEnabled());
		ridget.setMandatory(yInput.isRequired());
		ridget.setOutputOnly(yInput.isReadonly());
		ridget.setVisible(yInput.isVisible());
	}

	/**
	 * Updates the numeric ridget attributes based on the datatype.
	 * 
	 * @param ridget the numericTextRidget
	 * @param yDatatype the datatype
	 */
	public static void updateNumericRidget(INumericTextRidget ridget,
			YNumericDatatype yDatatype) {
		ridget.setGrouping(yDatatype.isGrouping());
		ridget.setMarkNegative(yDatatype.isMarkNegative());
	}

	/**
	 * Updates the decimal ridget attributes based on the datatype.
	 * 
	 * @param ridget the decimalTextRidget
	 * @param yDatatype the datatype
	 */
	public static void updateDecimalRidget(IDecimalTextRidget ridget,
			YDecimalDatatype yDatatype) {
		updateNumericRidget(ridget, yDatatype);
		ridget.setPrecision(yDatatype.getPrecision());
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssClass()
	 */
	public static String getCssClass(YInput yInput) {
		return yInput.getCssClass();
	}

	/**
	 * Returns true, if the css class is not null and not empty.
	 * 
	 * @return
	 */
	public static boolean isCssClassValid(YInput yInput) {
		return getCssClass(yInput) != null && !getCssClass(yInput).equals("");
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssID()
	 */
	public static String getCssID(YInput yInput) {
		return yInput.getCssID();
	}

	/**
	 * Returns true, if the css id is not null and not empty.
	 * 
	 * @return
	 */
	public static boolean isCssIdValid(YInput yInput) {
		return getCssID(yInput) != null && !getCssID(yInput).equals("");
	}
}
