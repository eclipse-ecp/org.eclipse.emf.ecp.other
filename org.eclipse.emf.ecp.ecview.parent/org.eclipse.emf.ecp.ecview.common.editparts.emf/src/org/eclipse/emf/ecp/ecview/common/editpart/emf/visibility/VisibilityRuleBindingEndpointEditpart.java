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

import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRuleBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRuleEditpart;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class VisibilityRuleBindingEndpointEditpart extends
		BindableValueEndpointEditpart<YVisibilityRuleBindingEndpoint> implements
		IVisibilityRuleBindingEndpointEditpart {

	private static final Logger logger = LoggerFactory
			.getLogger(VisibilityRuleBindingEndpointEditpart.class);
	private RefreshProvider refresh;

	@Override
	protected YVisibilityRuleBindingEndpoint createModel() {
		checkDisposed();
		return VisibilityFactory.eINSTANCE
				.createYVisibilityRuleBindingEndpoint();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		switch (featureId) {
		case VisibilityPackage.YVISIBILITY_RULE_BINDING_ENDPOINT__ATTRIBUTE:
			refresh.refresh();
			break;
		default:
			break;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IObservableValue> A getObservable() {

		YVisibilityRule yRule = getModel().getRule();
		IVisibilityRuleEditpart ruleEditpart = getEditpart(yRule);
		IVisibilityRule rule = ruleEditpart.getRule();

		String attribute = getModel().getAttribute();
		if (ruleEditpart == null || attribute == null || attribute.equals("")) {
			logger.warn("RuleEditpart {} or attribute {} not valid!", ruleEditpart, attribute);
			return null;
		}

		IObservableValue observable = null;
		observable = PojoObservables.observeValue(rule, attribute);

		return (A) observable;
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		this.refresh = refresh;
	}

	@Override
	protected void internalDispose() {
		refresh = null;

		super.internalDispose();
	}
}
