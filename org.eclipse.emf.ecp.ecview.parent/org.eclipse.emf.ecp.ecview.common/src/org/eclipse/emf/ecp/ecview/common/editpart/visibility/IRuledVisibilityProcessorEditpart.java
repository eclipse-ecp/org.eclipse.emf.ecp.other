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

/**
 * An editpart responsible to handle validations. If the set config was
 * disposed, the validator editpart will not handle this. It is the issue of the
 * parent editparts to handle this.
 */
public interface IRuledVisibilityProcessorEditpart extends
		IVisibilityProcessorEditpart {

	/**
	 * Fires the visibility rule. Rules will fire automatically at domain model
	 * changes for normal. But a call to that method will fire them too.
	 */
	void fire();

	/**
	 * Sets the rule, that triggers the visibility options.
	 * 
	 * @param rule
	 */
	void setRule(IVisibilityRuleEditpart rule);

	/**
	 * Returns the rule, that triggers the visibility options.
	 * 
	 * @return
	 */
	IVisibilityRuleEditpart getRule();

	/**
	 * Sets the properties, that are being triggered if the rule matches.
	 * 
	 * @param rule
	 */
	void setOnMatch(IVisibilityPropertiesEditpart properties);

	/**
	 * Returns the properties, that are being triggered if the rule matches.
	 * 
	 * @return
	 */
	IVisibilityPropertiesEditpart getOnMatch();

}
