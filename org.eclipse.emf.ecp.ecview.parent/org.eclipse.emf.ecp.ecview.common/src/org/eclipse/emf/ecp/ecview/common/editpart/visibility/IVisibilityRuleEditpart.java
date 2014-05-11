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

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

/**
 * An editpart responsible to handle rules that will be used to trigger the
 * visibility properties.
 */
public interface IVisibilityRuleEditpart extends IElementEditpart {

	/**
	 * Fires the rule.
	 * 
	 * @return status - OK for matching rule and ERROR for not matching rule.
	 */
	IStatus fire();

	/**
	 * Returns the rule of the editpart. For different calls, the same instance
	 * must be returned.
	 * 
	 * @return
	 */
	IVisibilityRule getRule();

	/**
	 * This event is fired if a rule became dirty and the rules needs to be
	 * evaluated again. The event is passed to the parent. Combined rules need
	 * to pass the event up to the visibility processor. It will decide how to
	 * fire the rules again.
	 */
	public static class RuleDirtyEvent {

		private final IVisibilityRuleEditpart editpart;

		public RuleDirtyEvent(IVisibilityRuleEditpart editpart) {
			super();
			this.editpart = editpart;
		}

		/**
		 * Returns the rule that fired the change.
		 * 
		 * @return
		 */
		public IVisibilityRuleEditpart getEditpart() {
			return editpart;
		}
	}

}
