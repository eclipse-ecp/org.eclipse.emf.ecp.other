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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.visibility.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.editpart.visibility.IVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YBooleanValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class VisibilityFactory implements IVisibilityFactory {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(VisibilityFactory.class);

	protected VisibilityFactory() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(VisibilityPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(VisibilityPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IVisibilityRule> A createRule(Object yElement) {
		IVisibilityRule result = null;
		if (yElement instanceof YBooleanValueRule) {
			result = new BooleanValueRule();
		} else if (yElement instanceof YDecimalValueRule) {
			result = new DecimalValueRule();
		} else if (yElement instanceof YRegexpRule) {
			result = new RegexpRule();
		}

		if (result != null) {
			result.initialize((YVisibilityRule) yElement);
		}

		return (A) result;
	}
}
