/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt;

import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.DecimalFieldPresentation;
import org.eclipse.riena.ui.ridgets.IDecimalTextRidget;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;
import org.eclipse.riena.ui.ridgets.IRidget;

/**
 * A manager that is responsible for binding data for one view instance. Each
 * binding manager has to be connected to exactly one view. All the bindings
 * contained are bindings related to the associated view.
 */
public interface ISWTBindingManager extends
		org.eclipse.emf.ecp.ecview.common.binding.IECViewBindingManager {

	/**
	 * Binds the visible option.
	 * 
	 * @param yVisibleAble
	 * @param ridget
	 */
	public abstract void bindVisible(YVisibleable yVisibleAble, IRidget ridget);

	/**
	 * Binds the enable option.
	 * 
	 * @param viewContext
	 * @param yEnable
	 * @param field
	 */
	public abstract void bindEnabled(YEnable yEnable, IRidget ridget);

	/**
	 * Binds the readonly option.
	 * 
	 * @param yEditable
	 * @param ridget
	 */
	public abstract void bindReadonly(YEditable yEditable,
			IMarkableRidget ridget);

	/**
	 * Binds the grouping option.
	 * 
	 * @param yNumericField
	 * @param ridget
	 */
	public abstract void bindGrouping(YNumericField yNumericField,
			INumericTextRidget ridget);

	/**
	 * Binds the mark negative option.
	 * 
	 * @param yNumericField
	 * @param ridget
	 */
	public abstract void bindMarkNegative(YNumericField yNumericField,
			INumericTextRidget ridget);

	/**
	 * Binds the grouping option.
	 * 
	 * @param yField
	 * @param ridget
	 */
	public abstract void bindGrouping(YDecimalField yField,
			IDecimalTextRidget ridget);

	/**
	 * Binds the mark negative option.
	 * 
	 * @param yField
	 * @param ridget
	 */
	public abstract void bindMarkNegative(YDecimalField yField,
			IDecimalTextRidget ridget);

	/**
	 * Binds the precision option.
	 * 
	 * @param yDecimalField
	 * @param ridget
	 */
	public abstract void bindPrecision(YDecimalField yDecimalField,
			IDecimalTextRidget ridget);

	public abstract void bindPrecision(YDecimalField yField,
			DecimalFieldPresentation decimalFieldPresentation);
}