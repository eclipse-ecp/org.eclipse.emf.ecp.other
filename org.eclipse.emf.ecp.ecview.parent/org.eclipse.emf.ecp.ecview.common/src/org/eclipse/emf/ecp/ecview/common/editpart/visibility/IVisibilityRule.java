/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.visibility;

import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

/**
 * An editpart responsible to handle rules that will be
 */
public interface IVisibilityRule {

	/**
	 * Is called to initialize the rule by the given model element.
	 * 
	 * @param model
	 */
	void initialize(Object model);

	/**
	 * Sets the handler that handles ruleDirtyEvents.
	 * 
	 * @param handler
	 */
	void setRuleDirtyHandler(IRuleDirtyHandler handler);

	/**
	 * Fires the rule and returns the status. If {@link IStatus#OK} is returned,
	 * then the rule matches. Else the rule does not match.
	 * 
	 * @return
	 */
	IStatus fire();

}
