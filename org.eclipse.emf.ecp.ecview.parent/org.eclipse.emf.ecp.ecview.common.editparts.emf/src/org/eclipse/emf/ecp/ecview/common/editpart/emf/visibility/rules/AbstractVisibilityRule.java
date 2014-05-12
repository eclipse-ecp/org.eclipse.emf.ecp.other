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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.visibility.rules;

import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IRuleDirtyHandler;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

/**
 * A rule that fires true, if a value is "true". False otherwise.
 */
public abstract class AbstractVisibilityRule implements IVisibilityRule {

	private boolean matchMeansFalse;
	private IRuleDirtyHandler handler;

	@Override
	public void initialize(Object model) {
		YVisibilityRule yRule = (YVisibilityRule) model;
		matchMeansFalse = yRule.isMatchMeansFalse();
	}

	@Override
	public void setRuleDirtyHandler(IRuleDirtyHandler handler) {
		this.handler = handler;
	}

	@Override
	public IStatus fire() {
		IStatus result = doFire();
		if (!matchMeansFalse) {
			return result;
		} else {
			return result == IStatus.OK ? IStatus.ERROR : IStatus.OK;
		}
	}

	protected abstract IStatus doFire();

	/**
	 * @return the matchMeansFalse
	 */
	public boolean isMatchMeansFalse() {
		return matchMeansFalse;
	}

	/**
	 * Returns the ruleDirtyHandler.
	 */
	protected IRuleDirtyHandler getRuleDirtyHandler() {
		return handler;
	}

	protected void fireRuleDirty() {
		if (handler != null) {
			handler.ruleDirty(new IRuleDirtyHandler.RuleDirtyEvent(this));
		}
	}

}
