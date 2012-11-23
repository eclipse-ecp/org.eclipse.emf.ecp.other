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
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.wizards;

import org.eclipse.emf.ecp.ui.common.ICompositeProvider;

import org.eclipse.jface.wizard.Wizard;

/**
 * @author Eugen Neufeld
 */
public abstract class ECPWizard<T extends ICompositeProvider> extends Wizard {
	private T uiProvider;

	public void setUIProvider(T uiProvider) {
		this.uiProvider = uiProvider;
	}

	protected T getUIProvider() {
		return uiProvider;
	}
}
