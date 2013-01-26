/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.editparts;

/**
 * Is responsible to return editparts based on the given element.
 */
public interface IEditPartManager {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param modelElement Any kind of object that contains information how to create the edit part.
	 * @return result True if the manager can be used for the modelElement
	 */
	boolean isFor(Object modelElement);

	/**
	 * Tries to find an existing edit part for the given element. If no edit part could be found, a new one will be
	 * created.
	 * 
	 * @param <A> An instance of {@link IElementEditpart}
	 * @param modelElement Any kind of object that contains information how to create the edit part.
	 * @return editpart The found or created editPart.
	 */
	<A extends IElementEditpart> A getEditpart(Object modelElement);

	/**
	 * Tries to find an existing instance of the editpart. If no instance could be found then <code>null</code> will be
	 * returned.
	 * 
	 * @param <A> An instance of {@link IElementEditpart}
	 * @param modelElement Any kind of object that contains information how to create the edit part.
	 * @return editpart The found editpart or <code>null</code>
	 */
	<A extends IElementEditpart> A findEditpart(Object modelElement);

	/**
	 * Is used to create a new instance of an edit part, without having an model element.
	 * 
	 * @param <A> An instance of {@link IElementEditpart}
	 * @param selector The selector is used to find the proper edit part manager that is responsible to handle that
	 *            call.
	 * @param editPartClazz The type of edit part an instance of should be prepared.
	 * @return editpart The created editpart
	 */
	<A extends IElementEditpart> A createEditpart(Object selector, Class<A> editPartClazz);

}