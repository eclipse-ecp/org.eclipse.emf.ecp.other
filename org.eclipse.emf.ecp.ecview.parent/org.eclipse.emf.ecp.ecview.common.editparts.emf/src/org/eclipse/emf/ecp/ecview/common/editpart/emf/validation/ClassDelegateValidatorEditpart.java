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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.ClassDelegateValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IClassDelegateValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YClassDelegateValidator;
import org.eclipse.emf.ecp.ecview.common.types.ITypeProviderService;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class ClassDelegateValidatorEditpart extends
		ValidatorEditpart<YClassDelegateValidator> implements
		IClassDelegateValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public ClassDelegateValidatorEditpart() {
		super(
				ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME);
	}

	@Override
	protected YClassDelegateValidator createModel() {
		return ValidationFactory.eINSTANCE.createYClassDelegateValidator();
	}

	@Override
	protected IValidator createValidator() {
		IViewContext context = getViewContext(getModel());
		ITypeProviderService service = context.getService(ITypeProviderService.class.getName()); 
		return new ClassDelegateValidator(getModel(), service);
	}

	/**
	 * Returns the view context for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewContext getViewContext(EObject context) {
		if(context == null){
			return null;
		}
		
		if(context instanceof YEmbeddable){
			IViewEditpart viewEditpart = getViewEditpart((YEmbeddable) context);
			return viewEditpart != null ? viewEditpart.getContext() : null;
		}else{
			EObject parent = context.eContainer();
			return getViewContext(parent);
		}
	}

	/**
	 * Returns the view context for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewContext getViewContext(YEmbeddable yEmbeddable) {
		IViewEditpart viewEditpart = getViewEditpart(yEmbeddable);
		return viewEditpart != null ? viewEditpart.getContext() : null;
	}

	/**
	 * Returns the view editpart for the given embeddable.
	 * 
	 * @param yEmbeddable
	 * @return
	 */
	public static IViewEditpart getViewEditpart(YEmbeddable yEmbeddable) {
		IEmbeddableEditpart editpart = getEditpart(yEmbeddable);
		return editpart != null ? editpart.getView() : null;
	}

	@Override
	public void setConfig(IValidationConfig config) {
		YClassDelegateValidator validatable = (YClassDelegateValidator) config
				.getValidationSettings();
		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME,
						getModel(),
						ValidationPackage.Literals.YCLASS_DELEGATE_VALIDATION_CONFIG__CLASS_NAME);
	}

	@Override
	protected void internalDispose() {
		try {
			if (bridgeObserver != null) {
				bridgeObserver.dispose();
				bridgeObserver = null;
			}
		} finally {
			super.internalDispose();
		}
	}

}
