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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YMasterDetail;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IMasterDetailEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.presentation.IMasterDetailPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the IMasterDetailEditpart.
 */
@SuppressWarnings("restriction")
public class MasterDetailEditpart extends EmbeddableEditpart<YMasterDetail>
		implements IMasterDetailEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(MasterDetailEditpart.class);

	private IEmbeddableEditpart masterEditpart;
	private IEmbeddableEditpart detailEditpart;

	public MasterDetailEditpart() {
		super(ExtensionModelPackage.Literals.YMASTER_DETAIL__DATATYPE);
	}

	@Override
	protected YMasterDetail createModel() {
		return ExtensionModelFactory.eINSTANCE.createYMasterDetail();
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}

	protected void doInitPresentation(IWidgetPresentation<?> presentation) {

		// Create a bean slot which is the input for the master detail. It is
		// used by the presentation to bind the table, list,... to that slot.
		IViewContext context = getView().getContext();
		context.createBeanSlot(getCollectionBeanSlot(), getModel().getType());
		// Creates a bean slot that is the input for the detail fields. It is
		// used by the presentation to bind the detail fields to that slot.
		context.createBeanSlot(getSelectionBeanSlot(), getModel().getType());

		// load the elements
		IEmbeddableEditpart masterEditpart = getMaster();
		IEmbeddableEditpart detailEditpart = getDetail();

		IMasterDetailPresentation<?> mdPresentation = (IMasterDetailPresentation<?>) presentation;

		if (masterEditpart != null) {
			mdPresentation.setMaster(masterEditpart.getPresentation());
		}

		if (detailEditpart != null) {
			mdPresentation.setDetail(detailEditpart.getPresentation());
		}
	}

	/**
	 * Creates a bean slot that is the input for the detail fields. It is used
	 * by the presentation to bind the detail fields to that slot.
	 * 
	 * @return
	 */
	protected String getSelectionBeanSlot() {
		return "selection_" + getId();
	}

	/**
	 * Create a bean slot which is the input for the master detail. It is used
	 * by the presentation to bind the table, list,... to that slot.
	 */
	protected String getCollectionBeanSlot() {
		return "input_" + getId();
	}

	@Override
	public IEmbeddableEditpart getMaster() {
		if (masterEditpart == null) {
			internalLoadMaster();
		}
		return masterEditpart;
	}

	@Override
	public IEmbeddableEditpart getDetail() {
		if (detailEditpart == null) {
			internalLoadDetail();
		}
		return detailEditpart;
	}

	/**
	 * Is called to load and initialize the master.
	 */
	protected void internalLoadMaster() {
		checkDisposed();

		if (masterEditpart == null) {
			YEmbeddable yMaster = getModel().getMasterElement();
			IEmbeddableEditpart editPart = getEditpart(yMaster);
			internalSetMaster(editPart);
		}
	}

	protected void internalSetMaster(IEmbeddableEditpart editPart) {
		this.masterEditpart = editPart;
	}

	/**
	 * Is called to load and initialize the detail.
	 */
	protected void internalLoadDetail() {
		checkDisposed();

		if (detailEditpart == null) {
			YEmbeddable yDetail = getModel().getDetailElement();
			IEmbeddableEditpart editPart = getEditpart(yDetail);
			internalSetDetail(editPart);
		}
	}

	protected void internalSetDetail(IEmbeddableEditpart editPart) {
		this.detailEditpart = editPart;
	}

	@Override
	public void setMaster(IEmbeddableEditpart master) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YMasterDetail yMasterDetail = getModel();
			YEmbeddable yMaster = (YEmbeddable) master.getModel();
			yMasterDetail.setMasterElement(yMaster);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void setDetail(IEmbeddableEditpart detail) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YMasterDetail yMasterDetail = getModel();
			YEmbeddable yDetail = (YEmbeddable) detail.getModel();
			yMasterDetail.setDetailElement(yDetail);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YMASTER_DETAIL__MASTER_ELEMENT:
			YEmbeddable yMaster = (YEmbeddable) notification.getNewValue();

			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yMaster);
			internalSetMaster(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IMasterDetailPresentation<?> presenter = getPresentation();
				if (yMaster != null) {
					presenter.setMaster(editPart.getPresentation());
				} else {
					presenter.setMaster(null);
				}
			}
			break;
		case ExtensionModelPackage.YMASTER_DETAIL__DETAIL_ELEMENT:
			YEmbeddable yDetail = (YEmbeddable) notification.getNewValue();

			editPart = (IEmbeddableEditpart) getEditpart(yDetail);
			internalSetDetail(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IMasterDetailPresentation<?> presenter = getPresentation();
				if (yDetail != null) {
					presenter.setDetail(editPart.getPresentation());
				} else {
					presenter.setDetail(null);
				}
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	private boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}
}
