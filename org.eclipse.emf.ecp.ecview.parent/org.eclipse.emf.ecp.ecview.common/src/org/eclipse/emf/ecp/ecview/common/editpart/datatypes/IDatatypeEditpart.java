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
package org.eclipse.emf.ecp.ecview.common.editpart.datatypes;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;

/**
 * An editpart responsible to handle datatypes.
 */
public interface IDatatypeEditpart extends IElementEditpart {

	/**
	 * Applies the datatype settings to the given UI element. And registers the
	 * UI element to become updated if the datatype changes.
	 * <p>
	 * Note that the datatype is not part of the containment tree of the UI
	 * element. So many UI elements may share the same instance of the datatype.
	 * 
	 * @param yEmbeddable
	 */
	void register(IEmbeddableEditpart yEmbeddable);

	/**
	 * Unregisters the given embeddable from the datatype. So changes at the
	 * datatype do not effect the UI element anymore.
	 * 
	 * @param yEmbeddable
	 */
	void unregister(IEmbeddableEditpart yEmbeddable);

}
