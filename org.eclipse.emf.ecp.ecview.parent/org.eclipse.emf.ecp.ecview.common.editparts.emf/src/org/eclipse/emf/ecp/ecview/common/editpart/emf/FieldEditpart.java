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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.common.presentation.IFieldPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IFieldEditpart}.
 * 
 * @param <M>
 */
public class FieldEditpart<M extends YField> extends EmbeddableEditpart<M>
		implements IFieldEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(FieldEditpart.class);

	private List<IValidatorEditpart> validators;
	private List<IValidatorEditpart> internalValidators;

	/**
	 * A default constructor.
	 */
	protected FieldEditpart() {
	}

	/**
	 * A constructor that becomes passed the datatype feature.
	 * 
	 * @param datatypeFeature
	 */
	public FieldEditpart(EStructuralFeature datatypeFeature) {
		super(datatypeFeature);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) CoreModelFactory.eINSTANCE.createYField();
	}

	@Override
	protected void doInitPresentation(IWidgetPresentation<?> presentation) {
		IFieldPresentation<?> fieldPresentation = (IFieldPresentation<?>) presentation;

		ensureValidatorsLoaded();
		for (IValidatorEditpart validatorEditpart : validators) {
			fieldPresentation.addValidator(validatorEditpart.getValidator());
		}
	}

	@Override
	public void notifyDatatypeChanged(DatatypeChangeEvent event) {

		// Remove the validators that should be removed
		//
		for (IValidatorEditpart validator : event.getRemovedValidators()) {
			getModel().getInternalValidators().remove(
					(YValidator) validator.getModel());
		}

		// Add the validators that should be added
		//
		for (IValidatorEditpart validator : event.getAddedValidators()) {
			getModel().getInternalValidators().add(
					(YValidator) validator.getModel());
		}
	}

	@Override
	public void addValidator(IValidatorEditpart validator) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YField yField = getModel();
			YValidator yValidator = (YValidator) validator.getModel();
			yField.getValidators().add(yValidator);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeValidator(IValidatorEditpart validator) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YField yField = getModel();
			YValidator yValidator = (YValidator) validator.getModel();
			yField.getValidators().remove(yValidator);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}

	}

	@Override
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YFIELD__VALIDATORS:
			YValidator yValidator = (YValidator) notification.getNewValue();

			IValidatorEditpart editPart = (IValidatorEditpart) getEditpart(yValidator);
			internalAddValidator(editPart);
			break;
		case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
			yValidator = (YValidator) notification.getNewValue();

			editPart = (IValidatorEditpart) getEditpart(yValidator);
			internalAddInternalValidator(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of validators.
	 * 
	 * @param validatorEditpart
	 *            The editpart to be added
	 */
	protected void internalAddValidator(IValidatorEditpart validatorEditpart) {
		checkDisposed();

		ensureValidatorsLoaded();
		if (!validators.contains(validatorEditpart)) {
			validators.add(validatorEditpart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.addValidator(validatorEditpart.getValidator());
			}
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of internal validators.
	 * 
	 * @param validatorEditpart
	 *            The editpart to be added
	 */
	protected void internalAddInternalValidator(
			IValidatorEditpart validatorEditpart) {
		checkDisposed();

		if (internalValidators == null) {
			internalValidators = new ArrayList<>();
		}

		if (!internalValidators.contains(validatorEditpart)) {
			internalValidators.add(validatorEditpart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.addValidator(validatorEditpart.getValidator());
			}
		}
	}

	@Override
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YFIELD__VALIDATORS:
			YValidator yValidator = (YValidator) notification.getOldValue();

			IValidatorEditpart editPart = (IValidatorEditpart) getEditpart(yValidator);
			internalRemoveValidator(editPart);
			break;
		case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
			yValidator = (YValidator) notification.getOldValue();

			editPart = (IValidatorEditpart) getEditpart(yValidator);
			internalRemoveInternalValidator(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Ensures that the internal validators are loaded properly.
	 */
	private void ensureValidatorsLoaded() {
		if (validators == null) {
			internalLoadValidators();
		}
	}

	/**
	 * Is called to load and initialize all validators.
	 */
	protected void internalLoadValidators() {
		checkDisposed();

		if (validators == null) {
			validators = new ArrayList<IValidatorEditpart>();
			for (YValidator yValidator : getModel().getValidators()) {
				IValidatorEditpart editPart = getEditpart(yValidator);
				internalAddValidator(editPart);
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of validators.
	 * 
	 * @param validatorEditpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveValidator(IValidatorEditpart validatorEditpart) {
		checkDisposed();

		if (validators != null && validatorEditpart != null) {
			validators.remove(validatorEditpart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.removeValidator(validatorEditpart.getValidator());
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of internal validators.
	 * 
	 * @param validatorEditpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveInternalValidator(
			IValidatorEditpart validatorEditpart) {
		checkDisposed();

		if (internalValidators != null && validatorEditpart != null) {
			internalValidators.remove(validatorEditpart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.removeValidator(validatorEditpart.getValidator());
			}

			validatorEditpart.dispose();
		}
	}

	@Override
	public List<IValidatorEditpart> getValidators() {
		ensureValidatorsLoaded();
		return Collections.unmodifiableList(validators);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet, but exist in the model.
			if (validators != null || getModel().getValidators().size() > 0) {
				List<IValidatorEditpart> tempElements = getValidators();
				IFieldPresentation<?> presentation = internalGetPresentation();
				synchronized (validators) {
					for (IValidatorEditpart validatorEditpart : tempElements
							.toArray(new IValidatorEditpart[tempElements.size()])) {
						if (presentation != null) {
							presentation.removeValidator(validatorEditpart
									.getValidator());
						}
						validatorEditpart.dispose();
					}
				}
				validators = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	protected boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return internalValidators != null ? Collections
				.unmodifiableList(internalValidators) : Collections
				.<IValidatorEditpart> emptyList();
	}

}
