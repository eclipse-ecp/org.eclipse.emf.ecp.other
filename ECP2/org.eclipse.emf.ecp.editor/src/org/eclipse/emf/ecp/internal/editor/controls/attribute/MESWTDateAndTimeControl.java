/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 * 
 *******************************************************************************/
package org.eclipse.emf.ecp.internal.editor.controls.attribute;

import org.eclipse.emf.ecp.editor.controls.AttributeControl;
import org.eclipse.emf.ecp.internal.editor.widgets.DateTimeWidget;
import org.eclipse.emf.ecp.internal.editor.widgets.ECPAttributeWidget;

import java.util.Date;

/**
 * An SWT-based date widget with an additional time field, which are both controlled by spinners.
 * 
 * @author Eugen Neufeld
 */
public class MESWTDateAndTimeControl extends AttributeControl {
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#getClassType()
	 */
	@Override
	protected Class<?> getSupportedClassType() {
		return Date.class;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.editor.controls.MEAttributeControl#getAttributeWidget(org.eclipse.emf.databinding.
	 * EMFDataBindingContext)
	 */
	@Override
	protected ECPAttributeWidget getWidget() {
		return new DateTimeWidget(getContext().getDataBindingContext(), getContext().getModelElement(),
			getStructuralFeature(), getContext().getEditingDomain());
	}

}