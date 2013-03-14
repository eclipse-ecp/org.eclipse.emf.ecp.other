/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple;

import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;
import org.eclipse.riena.ui.ridgets.IRidget;

/**
 * A manager that is responsible for binding data for one view instance. Each
 * binding manager has to be connected to exactly one view. All the bindings
 * contained are bindings related to the associated view.
 */
public interface IBindingManager extends
		org.eclipse.emf.ecp.ecview.common.binding.IBindingManager {

	/**
	 * Binds the visible option.
	 * 
	 * @param viewContext
	 * @param yVisibleAble
	 * @param field
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
	 * @param viewContext
	 * @param yEditable
	 * @param field
	 */
	public abstract void bindReadonly(YEditable yEditable,
			IMarkableRidget ridget);

	/**
	 * Binds the visible option.
	 * 
	 * @param viewContext
	 * @param yEditable
	 * @param field
	 */
	public abstract void bindGrouping(YNumericField yNumericField,
			INumericTextRidget ridget);

	/**
	 * Binds the visible option.
	 * 
	 * @param viewContext
	 * @param yEditable
	 * @param field
	 */
	public abstract void bindMarkNegative(YNumericField yNumericField,
			INumericTextRidget ridget);

}