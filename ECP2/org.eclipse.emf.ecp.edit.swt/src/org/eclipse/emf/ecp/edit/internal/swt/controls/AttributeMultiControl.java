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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.EditModelElementContext;
import org.eclipse.emf.ecp.edit.internal.swt.actions.AddAttributeAction;
import org.eclipse.emf.ecp.edit.internal.swt.actions.ECPSWTAction;
import org.eclipse.emf.ecp.editor.util.StaticApplicableTester;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
/**
 * This class defines a Control which is used for displaying {@link EStructuralFeature}s which have a multi attribute.
 * 
 * @author Eugen Neufeld
 * 
 */
public class AttributeMultiControl extends MultiControl {
	/**
	 * Constructor for a multi attribute control.
	 * 
	 * @param showLabel whether to show a label
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor} to use
	 * @param feature the {@link EStructuralFeature} to use
	 * @param modelElementContext the {@link EditModelElementContext} to use
	 * @param embedded whether this control is embedded in another control
	 */
	public AttributeMultiControl(boolean showLabel, IItemPropertyDescriptor itemPropertyDescriptor,
		EStructuralFeature feature, EditModelElementContext modelElementContext,boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext,embedded);

	}
	@Override
	protected ECPSWTAction[] instantiateActions() {
		ECPSWTAction[] actions = new ECPSWTAction[1];
		actions[0] = new AddAttributeAction(getModelElementContext(), getItemPropertyDescriptor(),
			getStructuralFeature());
		return actions;
	}
	@Override
	protected int getTesterPriority(StaticApplicableTester tester, IItemPropertyDescriptor itemPropertyDescriptor,
		EObject eObject) {
		return AttributeMultiControlTester.getTesterPriority(tester, itemPropertyDescriptor, eObject);
	}

	

}
