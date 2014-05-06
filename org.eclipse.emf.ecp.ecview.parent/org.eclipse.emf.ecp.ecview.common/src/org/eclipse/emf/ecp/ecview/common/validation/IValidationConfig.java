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
package org.eclipse.emf.ecp.ecview.common.validation;

/**
 * A validation config marks a class that it provides information how to
 * validate an element. For instance datatype editparts may implement that
 * interface.
 */
public interface IValidationConfig {

	/**
	 * Returns the setting of the config. The type of the return value depends
	 * on the implementation of the editpart.
	 * 
	 * @return
	 */
	Object getValidationSettings();

}
