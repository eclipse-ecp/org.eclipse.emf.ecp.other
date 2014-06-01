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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.extension;

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;

/**
 * An edit part for master details.
 */
public interface IMasterDetailEditpart extends IEmbeddableEditpart {

	/**
	 * Returns the master editpart.
	 * 
	 * @return master The editpart that controls the master presentation.
	 */
	IEmbeddableEditpart getMaster();

	/**
	 * Returns the detail editpart.
	 * 
	 * @return detail The editpart that controls the detail presentation.
	 */
	IEmbeddableEditpart getDetail();

	/**
	 * Sets the editpart that controls the master presentation.
	 * 
	 * @param master
	 */
	void setMaster(IEmbeddableEditpart master);

	/**
	 * Sets the editpart that controls the detail presentation.
	 * 
	 * @param detail
	 */
	void setDetail(IEmbeddableEditpart detail);

}
