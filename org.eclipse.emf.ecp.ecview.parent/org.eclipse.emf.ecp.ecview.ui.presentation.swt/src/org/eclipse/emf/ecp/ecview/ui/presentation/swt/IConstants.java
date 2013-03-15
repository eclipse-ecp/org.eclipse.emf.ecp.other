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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt;

/**
 * Constants about the swt simple presentation.
 */
// BEGIN SUPRESS CATCH EXCEPTION
public interface IConstants {
	// END SUPRESS CATCH EXCEPTION
	/**
	 * This CSS class is applied to the base composite of presentations. The base composite is used to enable
	 * margins on a control and to allow a control to rebuild its SWT controls at the "base composite parent".
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	String CSS_CLASS__CONTROL_BASE = "controlbase";
	// END SUPRESS CATCH EXCEPTION

	/**
	 * This CSS class is applied to the control of a presentation as far as the model element does not specify its own
	 * CSS class.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL = "control";
	// END SUPRESS CATCH EXCEPTION

	/**
	 * This CSS class is applied to the label of a presentation.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__LABEL = "label";
	// END SUPRESS CATCH EXCEPTION
}
