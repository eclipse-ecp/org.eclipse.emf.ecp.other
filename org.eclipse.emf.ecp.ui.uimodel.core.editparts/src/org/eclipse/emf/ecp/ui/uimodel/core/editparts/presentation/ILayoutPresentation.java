/*******************************************************************************
 * Copyright (c) 2012 Florian Pirchner and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation;

import java.util.List;

/**
 * LayoutPresentations are an abstraction above a layout an are responsible to create the UI-Kit specific elements and
 * to handle them. One important thing to notice is, that the life cycle of presentations is handled by their edit
 * parts. And so on presentations must never dispose its child presentations!
 */
public interface ILayoutPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Is called to return the widget described by that presenter. If an usable instance is
	 * present then it has to be returned.
	 * 
	 * @param parent the parent where the widget should be placed in
	 * @return the created widget
	 */
	C createWidget(Object parent);

	/**
	 * The widget presenter will unrender its widget. It does not necessarily have to dispose the widget but can do so.
	 * The kind of operation that will be processed depends on the underlying UI-Kit.
	 */
	void unrender();

	/**
	 * {@inheritDoc}
	 * <p>
	 * <b>Note:</b> The life cycle of presentations is handled by their edit parts. And so on presentations must never
	 * dispose its child presentations!
	 */
	void dispose();

	/**
	 * Returns an unmodifiable list containing all child presentations.
	 * 
	 * @return
	 */
	List<IWidgetPresentation<?>> getChildren();

	/**
	 * Returns true, if the given child is contained as a children.
	 * 
	 * @param presentation
	 * @return true if the presentation is contained as a children. False otherwise.
	 */
	boolean contains(IWidgetPresentation<?> presentation);

	/**
	 * Adds a presentation to the this layout. Note, that the presentation can be of any kind and it not parameterized.
	 * 
	 * @param presentation
	 */
	void add(IWidgetPresentation<?> presentation);

	/**
	 * Removes a presentation from this layout.
	 * 
	 * @param presentation
	 */
	void remove(IWidgetPresentation<?> presentation);

	/**
	 * Inserts the given presentation at the index.
	 * 
	 * @param presentation
	 * @param index
	 * @throws RuntimeException If presentation already contained at a different index
	 */
	void insert(IWidgetPresentation<?> presentation, int index);

	/**
	 * Moves the presentation from its current index to the given one.
	 * 
	 * @param presentation
	 * @param index
	 * @throws RuntimeException If presentation is not a child yet
	 */
	void move(IWidgetPresentation<?> presentation, int index);

	/**
	 * Will render the child presentations.<br>
	 * <ul>
	 * <li><b>force == false:</b> Only elements will be rendered that are not rendered yet. Already rendered elements
	 * will not be touched.</li>
	 * <li><b>force == true:</b> First will unrender all child presentations and afterward it will render them again.</li>
	 * </ul>
	 */
	void renderChildren(boolean force);
}
