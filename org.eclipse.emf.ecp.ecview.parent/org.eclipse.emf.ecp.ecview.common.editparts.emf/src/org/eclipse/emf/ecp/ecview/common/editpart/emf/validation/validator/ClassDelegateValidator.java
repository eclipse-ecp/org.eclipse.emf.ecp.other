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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator;

import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidationConfig;
import org.eclipse.emf.ecp.ecview.common.types.ITypeProviderService;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.emf.ecp.ecview.common.validation.StringValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassDelegateValidator extends StringValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ClassDelegateValidator.class);

	private ITypeProviderService service;
	private IValidator delegate;

	public ClassDelegateValidator(YClassDelegateValidationConfig yValidator,
			ITypeProviderService service) {
		this(yValidator, service, null);
	}

	public ClassDelegateValidator(YClassDelegateValidationConfig yValidator,
			ITypeProviderService service, String message) {
		super(message);
		this.service = service;
		updateParameter(yValidator);
	}

	@Override
	public IStatus doValidate(String value) {
		return delegate.validateValue(value);
	}

	@Override
	public void updateParameter(Object model) {
		YClassDelegateValidationConfig yValidator = (YClassDelegateValidationConfig) model;
		Class<?> delegateClass = service.forName(ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATOR, yValidator.getClassName());
		try {
			delegate = (IValidator) delegateClass.newInstance();
			
		} catch (InstantiationException e) {
			LOGGER.error(e.toString());
		} catch (IllegalAccessException e) {
			LOGGER.error(e.toString());
		}
	};
}
