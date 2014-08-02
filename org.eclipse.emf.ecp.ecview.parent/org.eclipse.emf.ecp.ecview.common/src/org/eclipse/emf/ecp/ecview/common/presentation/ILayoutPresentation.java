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
package org.eclipse.emf.ecp.ecview.common.presentation;

import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;

/**
 * LayoutPresentations are an abstraction above a layout an are responsible to
 * create the UI-Kit specific elements and to handle them. One important thing
 * to notice is, that the life cycle of editparts is handled by their edit
 * parts. And so on editparts must never unrender or dispose its child editparts!
 * 
 * @param <C>
 */
public interface ILayoutPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Returns a list containing all child editparts.
	 * 
	 * @return children
	 */
	List<IEmbeddableEditpart> getChildren();

	/**
	 * Returns true, if the given child is contained as a children.
	 * 
	 * @param editpart
	 *            The editpart
	 * @return true if the editpart is contained as a children. False
	 *         otherwise.
	 */
	boolean contains(IEmbeddableEditpart editpart);

	/**
	 * Adds a editpart to the this layout. Note, that the editpart can
	 * be of any kind and it not parameterized.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	void add(IEmbeddableEditpart editpart);

	/**
	 * Removes a editpart from this layout.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	void remove(IEmbeddableEditpart editpart);

	/**
	 * Inserts the given editpart at the index.
	 * 
	 * @param editpart
	 *            The editpart to be inserted
	 * @param index
	 *            The index where the editpart should be inserted
	 */
	void insert(IEmbeddableEditpart editpart, int index);

	/**
	 * Moves the editpart from its current index to the given one.
	 * 
	 * @param editpart
	 *            The editpart
	 * @param index
	 *            The index where the editpart should be moved to
	 */
	void move(IEmbeddableEditpart editpart, int index);

	/**
	 * Will render the child editparts.<br>
	 * <ul>
	 * <li><b>force == false:</b> Only elements will be rendered that are not
	 * rendered yet. Already rendered elements will not be touched.</li>
	 * <li><b>force == true:</b> First will unrender all child editparts and
	 * afterward it will render them again.</li>
	 * </ul>
	 * 
	 * @param force
	 *            see method description
	 */
	void renderChildren(boolean force);
}
