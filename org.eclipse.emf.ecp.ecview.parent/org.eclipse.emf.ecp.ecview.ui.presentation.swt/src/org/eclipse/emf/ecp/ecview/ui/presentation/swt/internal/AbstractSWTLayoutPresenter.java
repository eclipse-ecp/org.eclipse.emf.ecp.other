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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IConstants;
import org.eclipse.swt.widgets.Control;

/**
 * An abstract base class implementing {@link ILayoutPresentation}.
 */
@SuppressWarnings("restriction")
public abstract class AbstractSWTLayoutPresenter extends AbstractDisposable
		implements ILayoutPresentation<Control> {

	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL_BASE}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL_BASE = IConstants.CSS_CLASS__CONTROL_BASE;
	// END SUPRESS CATCH EXCEPTION
	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL = IConstants.CSS_CLASS__CONTROL;
	// END SUPRESS CATCH EXCEPTION

	private List<IWidgetPresentation<?>> children;

	private final ILayoutEditpart editpart;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            the editpart
	 */
	public AbstractSWTLayoutPresenter(ILayoutEditpart editpart) {
		this.editpart = editpart;
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return the editpart
	 */
	protected ILayoutEditpart getEditpart() {
		return editpart;
	}

	@Override
	public Object getModel() {
		return getEditpart().getModel();
	}

	/**
	 * Returns the view context.
	 * 
	 * @return viewContext
	 */
	public IViewContext getViewContext() {
		return getEditpart().getView().getContext();
	}

	@Override
	public List<IWidgetPresentation<?>> getChildren() {
		ensureChildren();
		return Collections.unmodifiableList(children);
	}

	@Override
	public boolean contains(IWidgetPresentation<?> presentation) {
		return children != null && children.contains(presentation);
	}

	@Override
	public void add(IWidgetPresentation<?> presentation) {
		ensureChildren();

		if (!children.contains(presentation)) {
			children.add(presentation);

			internalAdd(presentation);
		}
	}

	/**
	 * This method is called after the presentation was successfully added to
	 * the children collection.<br>
	 * Subclasses should handle the add of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be added
	 */
	protected void internalAdd(IWidgetPresentation<?> presentation) {

	}

	@Override
	public void remove(IWidgetPresentation<?> presentation) {
		if (children == null) {
			return;
		}

		if (children.remove(presentation)) {
			internalRemove(presentation);
		}
	}

	/**
	 * This method is called after the presentation was successfully removed
	 * from the children collection.<br>
	 * Subclasses should handle the unrendering of the UI element in that
	 * method.
	 * 
	 * @param presentation
	 *            The presentation to be removed
	 */
	protected void internalRemove(IWidgetPresentation<?> presentation) {

	}

	@Override
	public void insert(IWidgetPresentation<?> presentation, int index) {
		ensureChildren();

		int currentIndex = children.indexOf(presentation);
		if (currentIndex > -1 && currentIndex != index) {
			throw new RuntimeException(
					String.format(
							"Insert at index %d not possible since presentation already contained at index %d",
							index, currentIndex));
		}

		children.add(index, presentation);
		internalInsert(presentation, index);
	}

	/**
	 * This method is called after the presentation was successfully inserted to
	 * the children collection.<br>
	 * Subclasses should handle the insert of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be inserted
	 * @param index
	 *            The index where the presentation should be inserted
	 */
	protected void internalInsert(IWidgetPresentation<?> presentation, int index) {

	}

	@Override
	public void move(IWidgetPresentation<?> presentation, int index) {
		if (children == null) {
			throw new RuntimeException(
					"Move not possible. No children present.");
		}

		if (!children.contains(presentation)) {
			throw new RuntimeException(
					String.format(
							"Move to index %d not possible since presentation not added yet!",
							index));
		}

		int currentIndex = children.indexOf(presentation);
		children.remove(presentation);
		children.add(index, presentation);

		internalMove(presentation, currentIndex, index);
	}

	/**
	 * This method is called after the presentation was successfully moved
	 * inside the children collection.<br>
	 * Subclasses should handle the move of the UI element in that method.
	 * 
	 * @param presentation
	 *            The presentation to be moved.
	 * @param oldIndex
	 *            The old index where the control was located.
	 * @param newIndex
	 *            The new index where the control should be located after the
	 *            move operation.
	 */
	protected void internalMove(IWidgetPresentation<?> presentation,
			int oldIndex, int newIndex) {

	}

	/**
	 * Ensures, that the children collection exists.
	 */
	protected void ensureChildren() {
		if (children == null) {
			children = new ArrayList<IWidgetPresentation<?>>();
			for (IEmbeddableEditpart child : editpart.getElements()) {
				children.add(child.getPresentation());
			}
		}
	}

	/**
	 * Sets the css id at the control.
	 * 
	 * @param control
	 *            The control
	 * @param id
	 *            The CSS id
	 */
	protected void setCSSId(Control control, String id) {
		WidgetElement.setID(control, id);
	}

	/**
	 * Sets the css class at the control.
	 * 
	 * @param control
	 *            The control
	 * @param clazz
	 *            The CSS class
	 */
	protected void setCSSClass(Control control, String clazz) {
		WidgetElement.setCSSClass(control, clazz);
	}

	@Override
	public IObservable getObservableValue(Object model) {
		return internalGetObservableValue((YBindingEndpoint) model);
	}

	/**
	 * Has to provide an instance of IObservable for the given bindableValue.
	 * 
	 * @param bindableValue
	 * @return
	 */
	protected IObservable internalGetObservableValue(
			YBindingEndpoint bindableValue) {
		throw new UnsupportedOperationException("Must be overridden!");
	}

	@Override
	protected void internalDispose() {
		try {
			if (children != null) {
				children.clear();
				children = null;
			}
		} finally {

		}
	}
}