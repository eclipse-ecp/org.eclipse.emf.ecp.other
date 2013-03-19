/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * API and Javadoc used from org.eclipse.core.databinding.beans.BeansObservables 
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.binding.observables;

import java.net.URI;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;

/**
 * Binding delegates are used to offer a common interface for databinding.
 * Subclasses should implement the databinding for the respective type. For
 * instance <code>pojo binding</code>, <code>bean binding</code> and
 * <code>emf binding</code>.
 * <p>
 * The {@link #isFor(Object)} is used to check if the delegate can be used for
 * the given object.
 * 
 * @noimplement - Do not directly implement the interface. Implement
 *              BaseBindingDelegate since methods declarations may be added.
 */
public interface IContextBindingDelegate {

	/**
	 * Returns true if that binding delegate can be used for the URI.
	 * 
	 * @param context
	 * @param bindingURI
	 * @return
	 */
	boolean isFor(IViewContext context, URI bindingURI);

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	IObservableValue observeValue(IViewContext context, URI bindingURI);

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	IObservableValue observeValue(Realm realm, IViewContext context,
			URI bindingURI);

}
