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
package org.eclipse.emf.ecp.ecview.common.editpart;

public interface IEmbeddableParent {

	/**
	 * Calling this method will render the child editpart without adding it to
	 * the model.
	 * 
	 * @param child
	 */
	void renderChild(IEmbeddableEditpart child);

	/**
	 * Calling this method will unrender the child editpart without removing it
	 * from the model.
	 * 
	 * @param child
	 */
	void unrenderChild(IEmbeddableEditpart child);

	/**
	 * Calling this method will dispose the child editpart without removing it
	 * from the model.
	 * 
	 * @param child
	 */
	void disposeChild(IEmbeddableEditpart child);

}
