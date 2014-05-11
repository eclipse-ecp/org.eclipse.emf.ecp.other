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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.visibility;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.DelegatingVisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRuleEditpart;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

public abstract class VisibilityRuleEditpart<M extends YVisibilityRule> extends
		ElementEditpart<M> implements IVisibilityRuleEditpart {

	private IVisibilityRule rule;

	@Override
	public IStatus fire() {
		return rule.fire();
	}

	@Override
	public IVisibilityRule getRule() {
		if (rule == null) {
			rule = DelegatingVisibilityFactory.getInstance().createRule(
					getModel());
		}
		return rule;
	}

}
