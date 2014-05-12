/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.presentation;

import java.util.Set;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityProcessable;

/**
 * Widget presenter are used to create and provide widgets that will be
 * assembled to an UI.<br>
 * Implementations are UI-kit specific.
 * 
 * @param <C>
 */
public interface IWidgetPresentation<C> extends IDisposable, IVisibilityProcessable {

	/**
	 * Returns the model associated with this presenter.<br>
	 * Or <code>null</code> if the presenter is not based on a model.
	 * 
	 * @return the model or <code>null</code>
	 */
	Object getModel();

	/**
	 * Is called to create the widget described by the presenter. If an usable
	 * instance is present then it has to be returned. Whether the child is
	 * added to the parent depends on the underlying UI-Kit.
	 * 
	 * @param parent
	 *            the parent where the widget should be placed in
	 * @return the created widget
	 */
	C createWidget(Object parent);

	/**
	 * Is called to return the widget created by that presenter. If an usable
	 * instance is present then it has to be returned. This method should never
	 * create new instances of a widget.
	 * 
	 * @return the created widget
	 */
	C getWidget();

	/**
	 * The widget presenter will unrender its widget. It does not necessarily
	 * have to dispose the widget but can do so. The kind of operation that will
	 * be processed depends on the underlying UI-Kit.
	 */
	void unrender();

	/**
	 * Returns true, if the ui element of the presentation was rendered.
	 * 
	 * @return rendered
	 */
	boolean isRendered();

	/**
	 * Returns the view context that is responsible for the given context.
	 * 
	 * @return
	 */
	IViewContext getViewContext();

	/**
	 * Returns the observable that is related with the given model element.
	 * 
	 * @param model
	 *            The element representing the observable in the model.
	 * @return
	 */
	IObservable getObservableValue(Object model);

	/**
	 * Returns all bindings that are attached to the UI element.
	 * 
	 * @return
	 */
	Set<Binding> getUIBindings();

}
