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
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.common.presentation.IFieldPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
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

	/**
	 * A default constructor.
	 */
	protected FieldEditpart() {
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
		for (IValidator validator : validators) {
			fieldPresentation.addValidator(validator);
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
		default:
			break;
		}

	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of validators.
	 * 
	 * @param validator
	 *            The editpart to be added
	 */
	protected void internalAddValidator(IValidatorEditpart validator) {
		checkDisposed();

		ensureValidatorsLoaded();
		if (!validators.contains(validator)) {
			validators.add(validator);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.addValidator(validator);
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
	 * @param validator
	 *            The editpart to be removed
	 */
	protected void internalRemoveValidator(IValidatorEditpart validator) {
		checkDisposed();

		if (validators != null && validator != null) {
			validators.remove(validator);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				IFieldPresentation<?> presenter = getPresentation();
				presenter.removeValidator(validator);
			}
		}

		validator.dispose();
	}

	@Override
	public List<IValidatorEditpart> getValidators() {
		ensureValidatorsLoaded();
		return new ArrayList<IValidatorEditpart>(validators);
	}

	@Override
	protected void internalDispose() {
		try {
			IFieldPresentation<?> presentation = getPresentation();

			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet, but exist in the model.
			if (validators != null || getModel().getValidators().size() > 0) {
				List<IValidatorEditpart> tempElements = getValidators();
				synchronized (validators) {
					for (IValidatorEditpart validator : tempElements
							.toArray(new IValidatorEditpart[tempElements.size()])) {
						presentation.removeValidator(validator);
						validator.dispose();
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
	private boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

}
