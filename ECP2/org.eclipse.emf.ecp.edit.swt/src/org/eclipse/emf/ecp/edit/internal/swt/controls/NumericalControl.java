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
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.edit.internal.swt.Activator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This class is used as a common class for all number controls.
 * 
 * @author Eugen Neufeld
 */
public class NumericalControl extends AbstractTextControl {
	private String helpText;

	/**
	 * Constructor for a String control.
	 * 
	 * @param showLabel whether to show a label
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor} to use
	 * @param feature the {@link EStructuralFeature} to use
	 * @param modelElementContext the {@link ECPControlContext} to use
	 * @param embedded whether this control is embedded in another control
	 */
	public NumericalControl(boolean showLabel, IItemPropertyDescriptor itemPropertyDescriptor,
		EStructuralFeature feature, ECPControlContext modelElementContext, boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext, embedded);

		prepareHelpText();
	}

	/**
	 * 
	 */
	private void prepareHelpText() {
		Class<?> instanceClass = getStructuralFeature().getEType().getInstanceClass();
		if (instanceClass.isPrimitive()) {
			try {
				if (Integer.class.getField("TYPE").get(null).equals(instanceClass)) {
					helpText = "This is an Integer Field. The format is '#'.";
				} else if (Double.class.getField("TYPE").get(null).equals(instanceClass)) {
					helpText = "This is an Float Field. The format is '#.#'.";
				}
			} catch (NoSuchFieldException e) {
				Activator.logException(e);
			} catch (IllegalArgumentException e) {
				Activator.logException(e);
			} catch (IllegalAccessException e) {
				Activator.logException(e);
			} catch (SecurityException e) {
				Activator.logException(e);
			}

		} else if (BigInteger.class.isAssignableFrom(instanceClass)) {
			helpText = "This is an Integer Field. The format is '#'.";
		} else if (Integer.class.isAssignableFrom(instanceClass)) {
			helpText = "This is an Integer Field. The format is '#'.";
		} else if (BigDecimal.class.isAssignableFrom(instanceClass)) {
			helpText = "This is an Float Field. The format is '#.#'.";
		} else if (Double.class.isAssignableFrom(instanceClass)) {
			helpText = "This is an Float Field. The format is '#.#'.";
		}
	}

	@Override
	protected int getTextWidgetStyle() {
		return super.getTextWidgetStyle() | SWT.RIGHT;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.controls.AbstractTextControl#getTextVariantID()
	 */
	@Override
	protected String getTextVariantID() {
		return "org_eclipse_emf_ecp_control_swt_number";
	}

	@Override
	protected void customizeText(Text text) {
		if (!getModelElementContext().isRunningAsWebApplication()) {
			text.setToolTipText(helpText);
		}
	}

	@Override
	protected String getHelpText() {
		return helpText;
	}
}
