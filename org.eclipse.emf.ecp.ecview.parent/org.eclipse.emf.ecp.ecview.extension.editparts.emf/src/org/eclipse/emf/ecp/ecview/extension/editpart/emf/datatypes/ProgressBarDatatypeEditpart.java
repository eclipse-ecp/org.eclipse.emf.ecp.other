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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes.DatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IProgressBarDatatypeEditpart;

/**
 * An edit part for datatypes.
 */
@SuppressWarnings("restriction")
public class ProgressBarDatatypeEditpart extends
		DatatypeEditpart<YProgressBarDatatype> implements
		IProgressBarDatatypeEditpart {

	@Override
	protected YProgressBarDatatype createModel() {
		return ExtDatatypesFactory.eINSTANCE.createYProgressBarDatatype();
	}
	
}
