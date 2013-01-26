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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IFieldEditpart}.
 * @param <M>
 */
public class FieldEditpart<M extends YField> extends EmbeddableEditpart<M> implements IFieldEditpart {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(FieldEditpart.class);

	/**
	 * A default constructor.
	 */
	protected FieldEditpart() {
	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) CoreModelFactory.eINSTANCE.createYField();
	}

}
