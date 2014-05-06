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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeListener;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link ElementEditpart}.
 * 
 * @param <M>
 */
public abstract class EmbeddableEditpart<M extends YEmbeddable> extends
		ElementEditpart<M> implements IEmbeddableEditpart,
		DatatypeChangeListener {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IWidgetPresentation<?> presentation;

	private EStructuralFeature datatypeFeature;

	/**
	 * The default constructor.
	 */
	protected EmbeddableEditpart() {
	}

	/**
	 * A constructor that becomes passed the datatype feature.
	 * 
	 * @param datatypeFeature
	 */
	public EmbeddableEditpart(EStructuralFeature datatypeFeature) {
		this.datatypeFeature = datatypeFeature;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ILayoutEditpart getParent() {
		YLayout yParent = getModel().getParent();
		return yParent != null ? (ILayoutEditpart) getEditpart(yParent) : null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresenter();

			doInitPresentation(presentation);
		}
		return (A) presentation;
	}

	/**
	 * A hook method to initialize the presentation after creation.
	 * 
	 * @param presentation
	 */
	protected void doInitPresentation(IWidgetPresentation<?> presentation) {

	}

	/**
	 * Returns the datatype of the model. Or <code>null</code> if no datatype is
	 * available.
	 * 
	 * @return
	 */
	protected YDatatype internalGetDatatype() {
		if (datatypeFeature == null) {
			return null;
		}
		return (YDatatype) getModel().eGet(datatypeFeature);
	}

	/**
	 * Is called to created the presenter for this edit part.
	 */
	protected <A extends IWidgetPresentation<?>> A createPresenter() {
		IViewEditpart viewEditPart = getView();
		if (viewEditPart == null) {
			LOGGER.info("View is null");
			return null;
		}
		return DelegatingPresenterFactory.getInstance().createPresentation(
				viewEditPart.getContext(), this);
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		if (notification.getFeature() == datatypeFeature) {
			// unregister the element from the datatype
			unregisterFromDatatype();

			// an register the field to the new datatype if available
			YDatatype newYDatatype = (YDatatype) notification.getNewValue();
			if (newYDatatype != null) {
				registerAtDatatype();
			}
		}
	}

	/**
	 * Registers the element at the datatype. Changes on the datatype will
	 * update the embeddable.
	 */
	protected void registerAtDatatype() {
		// unregisters the datatype editpart
		YDatatype yDatatype = internalGetDatatype();
		if (yDatatype != null) {
			IDatatypeEditpart datatypeEditpart = getEditpart(yDatatype);
			datatypeEditpart.addListener(this);
		}
	}

	/**
	 * Unregisters the element from the datatype. So changes on the datatype do
	 * not update the embeddable anymore.
	 */
	protected void unregisterFromDatatype() {
		// unregisters the datatype editpart
		YDatatype yDatatype = internalGetDatatype();
		if (yDatatype != null) {
			IDatatypeEditpart datatypeEditpart = getEditpart(yDatatype);
			datatypeEditpart.removeListener(this);
		}
	}

	@Override
	public void notifyDatatypeChanged(DatatypeChangeEvent event) {
		
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {

			// unregister the element from the datatype
			unregisterFromDatatype();

			// if directly attached to a view, then remove it
			IViewEditpart view = getView();
			if (view != null) {
				view.setContent(null);
			}

			// remove from the parent
			ILayoutEditpart parent = getParent();
			if (parent != null) {
				parent.removeElement(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

		} finally {
			super.internalDispose();
		}
	}
}
