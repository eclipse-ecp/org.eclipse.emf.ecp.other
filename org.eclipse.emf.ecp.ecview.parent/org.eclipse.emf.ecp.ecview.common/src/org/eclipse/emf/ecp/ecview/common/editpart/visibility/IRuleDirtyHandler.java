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
 * A handler to handle dirty rules.
 */
public interface IRuleDirtyHandler {

	/**
	 * Is called to notify the handler, that a rule is dirty.
	 * 
	 * @param model
	 */
	void ruleDirty(RuleDirtyEvent event);

	/**
	 * This event is fired if a rule became dirty and the rules needs to be
	 * evaluated again. The event is passed to the parent. Combined rules need
	 * to pass the event up to the visibility processor. It will decide how to
	 * fire the rules again.
	 */
	public static class RuleDirtyEvent {

		private final IVisibilityRule rule;

		public RuleDirtyEvent(IVisibilityRule rule) {
			super();
			this.rule = rule;
		}

		/**
		 * Returns the rule that fired the change.
		 * 
		 * @return
		 */
		public IVisibilityRule getRule() {
			return rule;
		}
	}
}
