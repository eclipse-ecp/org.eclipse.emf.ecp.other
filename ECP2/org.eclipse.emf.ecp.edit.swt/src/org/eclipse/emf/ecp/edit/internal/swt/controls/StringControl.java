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
package org.eclipse.emf.ecp.edit.internal.swt.controls;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.EditModelElementContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;

/**
 * The class describing a String control.
 * @author Eugen Neufeld
 *
 */
public class StringControl extends AbstractTextControl<String> {

	/**
	 * Constructor for a String control.
	 * @param showLabel whether to show a label 
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor} to use
	 * @param feature the {@link EStructuralFeature} to use
	 * @param modelElementContext the {@link EditModelElementContext} to use
	 * @param embedded whether this control is embedded in another control
	 */
	public StringControl(boolean showLabel, IItemPropertyDescriptor itemPropertyDescriptor, EStructuralFeature feature,
		EditModelElementContext modelElementContext,boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext,embedded);
	}
	/** {@inheritDoc} */
	@Override
	protected GridData getTextWidgetLayoutData() {
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		if (getItemPropertyDescriptor().isMultiLine(getModelElementContext().getModelElement())) {
			gridData.heightHint = 200;
		}
		return gridData;
	}
	/** {@inheritDoc} */
	@Override
	protected int getTextWidgetStyle() {
		int textStyle = SWT.BORDER;
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		if (getItemPropertyDescriptor().isMultiLine(getModelElementContext().getModelElement())) {
			textStyle = textStyle | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL;
			gridData.heightHint = 200;
		} else {
			textStyle = textStyle | SWT.SINGLE;
		}
		return textStyle;
	}

	/** {@inheritDoc} */
	@Override
	protected String convertStringToModel(String s) {
		return s;
	}

	/** {@inheritDoc} */
	@Override
	protected boolean validateString(String s) {
		return true;
	}

	/** {@inheritDoc} */
	@Override
	protected String convertModelToString(String t) {
		return t;
	}

	/** {@inheritDoc} */
	@Override
	protected String getDefaultValue() {
		return ""; //$NON-NLS-1$
	}

	/** {@inheritDoc} */
	@Override
	protected void postValidate(String text) {
		// do nothing

	}
}
