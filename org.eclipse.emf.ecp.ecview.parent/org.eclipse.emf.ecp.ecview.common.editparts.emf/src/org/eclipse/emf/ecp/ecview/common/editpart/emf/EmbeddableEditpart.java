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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeBridge;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityProcessorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;
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
		ElementEditpart<M> implements IEmbeddableEditpart, DatatypeBridge {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IWidgetPresentation<?> presentation;

	private EStructuralFeature datatypeFeature;
	private IVisibilityProcessorEditpart visibilityProcessor;

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
	public void initialize(M model) {
		super.initialize(model);

		// directly after initialization the embeddable needs to become
		// registered at the datatype editpart. No lazy loading can be used
		// here.
		registerAtDatatype();
	}

	@Override
	public void setVisisibiltyProcessor(
			IVisibilityProcessorEditpart visibilityProcessor) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yEmbeddable = getModel();
			YVisibilityProcessor yVisibilityProcessor = (YVisibilityProcessor) visibilityProcessor
					.getModel();
			yEmbeddable.setVisibilityProcessor(yVisibilityProcessor);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IVisibilityProcessorEditpart getVisibilityProcessor() {
		checkDisposed();

		if (visibilityProcessor == null) {
			loadVisibilityProcessor();
		}
		return visibilityProcessor;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadVisibilityProcessor() {
		if (visibilityProcessor == null) {
			YVisibilityProcessor yVisibilityProcessor = getModel()
					.getVisibilityProcessor();
			internalSetVisibilityProcessor((IVisibilityProcessorEditpart) getEditpart(yVisibilityProcessor));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param modelValue
	 *            The content to be set
	 */
	protected void internalSetVisibilityProcessor(
			IVisibilityProcessorEditpart visibilityProcessor) {
		this.visibilityProcessor = visibilityProcessor;
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		if (notification.getFeature() == datatypeFeature) {
			YDatatype oldYDatatype = (YDatatype) notification.getOldValue();
			if (oldYDatatype != null) {
				// unregister the element from the old datatype
				unregisterFromDatatype(oldYDatatype);
			}

			// an register the field to the new datatype if available
			YDatatype newYDatatype = (YDatatype) notification.getNewValue();
			if (newYDatatype != null) {
				registerAtDatatype();
			}
		} else {
			switch (featureId) {
			case CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR:
				YVisibilityProcessor yVisibilityProcessor = (YVisibilityProcessor) notification
						.getNewValue();
				IVisibilityProcessorEditpart editPart = (IVisibilityProcessorEditpart) getEditpart(yVisibilityProcessor);
				internalSetVisibilityProcessor(editPart);
				break;
			default:
				break;
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
			datatypeEditpart.addBridge(this);

			notifyDatatypeChanged(datatypeEditpart.getCurrentState());
		}
	}

	/**
	 * Unregisters the element from the datatype. So changes on the datatype do
	 * not update the embeddable anymore.
	 */
	protected void unregisterFromDatatype(YDatatype yDatatype) {
		// unregisters the datatype editpart
		if (yDatatype != null) {
			IDatatypeEditpart datatypeEditpart = getEditpart(yDatatype);
			datatypeEditpart.removeBridge(this);
			notifyDatatypeChanged(createDatatypeUnsetEvent(datatypeEditpart));
		}
	}

	/**
	 * Create an internal event that resets the datatype information.
	 * 
	 * @param datatypeEditpart
	 * @return
	 */
	private DatatypeChangeEvent createDatatypeUnsetEvent(
			IDatatypeEditpart datatypeEditpart) {

		List<IValidatorEditpart> toRemove = new ArrayList<>(
				getDatatypeValidators());
		DatatypeChangeEvent event = new DatatypeChangeEvent(datatypeEditpart,
				null, null, toRemove);
		return event;
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
			YDatatype yDatatype = internalGetDatatype();
			if (yDatatype != null) {
				unregisterFromDatatype(yDatatype);
			}

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
