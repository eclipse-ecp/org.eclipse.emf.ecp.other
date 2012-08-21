/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.common;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;

/**
 * Returns the {@link IUiElementEditpart}
 */
public interface IUiElementEditpartProvider {

	/**
	 * Returns the edit part.
	 * 
	 * @return
	 */
	IUiElementEditpart getEditpart();

}
