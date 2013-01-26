/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.impl.FieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextAreaEditpart;

/**
 * The implementation of the IUiTextAreaEditpart.
 */
public class TextAreaEditpart extends FieldEditpart<YTextArea> implements
		ITextAreaEditpart {

	@Override
	protected YTextArea createModel() {
		return (YTextArea) ExtensionModelFactory.eINSTANCE
				.createYTextArea();
	}

}
