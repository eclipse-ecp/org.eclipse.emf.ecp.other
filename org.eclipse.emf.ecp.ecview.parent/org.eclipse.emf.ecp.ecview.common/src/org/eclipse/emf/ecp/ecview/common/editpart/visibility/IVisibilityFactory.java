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
 * Is responsible to return visibility handler.
 */
public interface IVisibilityFactory {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param modelElement
	 *            Any kind of object that contains information how to create the
	 *            rule.
	 * @return result True if the manager can be used for the modelElement
	 */
	boolean isFor(Object modelElement);

	/**
	 * Is used to create a new instance of a rule.
	 * 
	 * @param modelElement
	 *            the model element describing the rule
	 * @return visibilityRule
	 */
	<A extends IVisibilityRule> A createRule(Object modelElement);

}