/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding;

import org.eclipse.core.databinding.conversion.IConverter;

/**
 * Negates a boolean.
 */
public class BoolNegator implements IConverter {

	@Override
	public Object getFromType() {
		return Boolean.class;
	}

	@Override
	public Object getToType() {
		return Boolean.class;
	}

	@Override
	public Object convert(Object fromObject) {
		return !((Boolean) fromObject);
	}

}