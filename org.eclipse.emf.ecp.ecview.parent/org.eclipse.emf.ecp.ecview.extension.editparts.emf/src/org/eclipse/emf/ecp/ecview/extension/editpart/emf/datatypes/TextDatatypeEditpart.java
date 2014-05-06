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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes.DatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITextDatatypeEditpart;

/**
 * An edit part for datatypes.
 */
@SuppressWarnings("restriction")
public class TextDatatypeEditpart extends DatatypeEditpart<YTextDatatype>
		implements ITextDatatypeEditpart {

	@Override
	protected YTextDatatype createModel() {
		return ExtDatatypesFactory.eINSTANCE.createYTextDatatype();
	}

	@Override
	protected List<YValidator> internalGetValidators() {
		List<YValidator> result = new ArrayList<>();
		YTextDatatype yDatatype = getModel();
		if (yDatatype != null) {
			int minlength = yDatatype.getMinLength();
			if (minlength > 0) {
				YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
						.createYMinLengthValidator();
				yValidator.setMinLength(minlength);
				result.add(yValidator);
			}

			int maxlength = yDatatype.getMaxLength();
			if (maxlength > 0) {
				YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
						.createYMaxLengthValidator();
				yValidator.setMaxLength(maxlength);
				result.add(yValidator);
			}

			String regExpression = yDatatype.getRegExpression();
			if (regExpression != null && !regExpression.equals("")) {
				YRegexpValidator yValidator = ValidationFactory.eINSTANCE
						.createYRegexpValidator();
				yValidator.setRegExpression(regExpression);
				result.add(yValidator);
			}
		}
		return result;
	}

}
