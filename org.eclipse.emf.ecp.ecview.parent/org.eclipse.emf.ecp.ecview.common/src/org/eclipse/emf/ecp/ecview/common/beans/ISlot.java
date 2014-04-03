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
package org.eclipse.emf.ecp.ecview.common.beans;

/**
 * An abstraction for a slot in the context. Slots can keep a value and maybe in
 * future other things too. The implementation should be bindable with eclipse
 * databinding and offer PropertyChangeSupport.
 * <p>
 * For a use case see IViewContext#getBeanSlot(String, Class). <br>
 * 
 * @noimplement Not to be implemented by clients.
 */
public interface ISlot {

	public static final String PROP_VALUE = "value";

	/**
	 * Returns the given value.
	 * 
	 * @return value
	 */
	Object getValue();

	/**
	 * Sets the given value.
	 * 
	 * @param value
	 *            The value to be set
	 */
	void setValue(Object value);

	/**
	 * Returns the type of the value.
	 * 
	 * @return
	 */
	Class<?> getValueType();

}
