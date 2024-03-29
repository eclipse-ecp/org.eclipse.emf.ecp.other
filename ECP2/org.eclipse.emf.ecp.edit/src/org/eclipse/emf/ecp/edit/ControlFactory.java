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
package org.eclipse.emf.ecp.edit;

import java.util.Set;

import org.eclipse.emf.ecp.internal.edit.ControlFactoryImpl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
/**
 * The ControlFactory provides a
 * method ({@link ControlFactory#createControl(T, IItemPropertyDescriptor, ECPControlContext)}) for creating a suitable
 * control with the known widgets.
 * 
 * @author Eugen Neufeld
 * 
 */
public interface ControlFactory {
	/**
	 * The Singleton for accessing the ControlFactory.
	 */
	ControlFactory INSTANCE = ControlFactoryImpl.INSTANCE;
	/**
	 * Creates an {@link AbstractControl} from the provided {@link IItemPropertyDescriptor} and the
	 * {@link ECPControlContext}.
	 * 
	 * @param <T> the Type of the composite where we want to add the control onto
	 * @param parent the Composite the control will be added to
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor}
	 * @param context the {@link ECPControlContext}
	 * @return the created {@link AbstractControl} or null if nothing fitting could be created
	 */
	<T> AbstractControl<T> createControl(T parent, IItemPropertyDescriptor itemPropertyDescriptor,
		ECPControlContext context);
	/**
	 * Creates an {@link AbstractControl} based on a provided id.
	 * 
	 * @param <T> the Type of the composite where we want to add the control onto
	 * @param parent the Composite the control will be added to
	 * @param itemPropertyDescriptor the {@link IItemPropertyDescriptor}
	 * @param context the {@link ECPControlContext}
	 * @param controlId the id of the control to create
	 * @return the created {@link AbstractControl} or null if id is unknown
	 */
	<T> AbstractControl<T> createControl(T parent, IItemPropertyDescriptor itemPropertyDescriptor,
		ECPControlContext context,String controlId);
	/**
	 * A copy of all known {@link ControlDescription}.
	 * @return a copy of the set of all known controlDescriptions
	 */
	Set<ControlDescription> getControlDescriptors();
}
