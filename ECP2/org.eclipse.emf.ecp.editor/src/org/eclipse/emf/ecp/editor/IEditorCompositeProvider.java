/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.ecp.editor;

import org.eclipse.swt.widgets.Composite;

/**
 * @author Eugen Neufeld
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
// FIXME: remove the "I"
public interface IEditorCompositeProvider {

	/**
	 * This method creates a UI bundled into a {@link Composite} that can be used anywhere.
	 * 
	 * @param parent the parent {@link Composite}
	 * @return the created {@link Composite}
	 */
	// FIXME: do we want to offer this method or move the parent composite to the Factory. What happens if you call this
	// method twice?
	Composite createUI(Composite parent);

	/**
	 * Dispose the ModelElement controls.
	 */
	void dispose();

	/**
	 * Triggers live validation of the model attributes.
	 **/
	// FIXME: Do we need to expose this?
	void updateLiveValidation();

	/**
	 * Set focus to the controls.
	 */
	void focus();

}
