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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IRuledVisibilityProcessorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityPropertiesEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRuleEditpart;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuledVisibilityProcessorEditpart extends
		VisibilityProcessorEditpart<YRuledVisibilityProcessor> implements
		IRuledVisibilityProcessorEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RuledVisibilityProcessorEditpart.class);
	private IVisibilityRuleEditpart rule;
	private IVisibilityPropertiesEditpart onMatch;

	@Override
	protected YRuledVisibilityProcessor createModel() {
		return VisibilityFactory.eINSTANCE.createYRuledVisibilityProcessor();
	}

	public void setRule(IVisibilityRuleEditpart rule) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YRuledVisibilityProcessor yProcessor = getModel();
			YVisibilityRule yRule = rule != null ? (YVisibilityRule) rule
					.getModel() : null;
			yProcessor.setRule(yRule);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IVisibilityRuleEditpart getRule() {
		checkDisposed();

		if (rule == null) {
			loadRule();
		}
		return rule;
	}

	/**
	 * Loads the rule.
	 */
	protected void loadRule() {
		if (rule == null) {
			YVisibilityRule yRule = getModel().getRule();
			internalSetRule((IVisibilityRuleEditpart) getEditpart(yRule));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param rule
	 *            The content to be set
	 */
	protected void internalSetRule(IVisibilityRuleEditpart rule) {
		this.rule = rule;

		// fire the rule
		fire();
	}

	public void setOnMatch(IVisibilityPropertiesEditpart onMatch) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YRuledVisibilityProcessor yProcessor = getModel();
			YVisibilityProperties yOnMatch = onMatch != null ? (YVisibilityProperties) onMatch
					.getModel() : null;
			yProcessor.setOnMatch(yOnMatch);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IVisibilityPropertiesEditpart getOnMatch() {
		checkDisposed();

		if (onMatch == null) {
			loadOnMatch();
		}
		return onMatch;
	}

	/**
	 * Loads the onMatch properties.
	 */
	protected void loadOnMatch() {
		if (rule == null) {
			YVisibilityProperties yOnMatch = getModel().getOnMatch();
			internalOnMatch((IVisibilityPropertiesEditpart) getEditpart(yOnMatch));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param onMatch
	 *            The content to be set
	 */
	protected void internalOnMatch(IVisibilityPropertiesEditpart onMatch) {
		this.onMatch = onMatch;

		// fire the rule
		fire();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case VisibilityPackage.YRULED_VISIBILITY_PROCESSOR__RULE:
			YVisibilityRule yRule = (YVisibilityRule) notification
					.getNewValue();

			IVisibilityRuleEditpart editPart = (IVisibilityRuleEditpart) getEditpart(yRule);
			internalSetRule(editPart);
			break;
		case VisibilityPackage.YRULED_VISIBILITY_PROCESSOR__ON_MATCH:
			YVisibilityProperties yOnMatch = (YVisibilityProperties) notification
					.getNewValue();

			IVisibilityPropertiesEditpart onMatchEditPart = (IVisibilityPropertiesEditpart) getEditpart(yOnMatch);
			internalOnMatch(onMatchEditPart);
			break;
		default:
			break;
		}
	}

	@Override
	public void fire() {
		IVisibilityRuleEditpart rule = getRule();
		if (rule != null) {
			rule.fire();
		}
	}
}
