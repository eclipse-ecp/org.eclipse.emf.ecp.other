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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;

/**
 * Responsible to create an observable. The model of this editpart is used to
 * access the getObservableValue from the underlying widget presentation.
 */
public class EmbeddableValueEndpointEditpart extends
		EmbeddableBindingEndpointEditpart<YEmbeddableValueEndpoint> implements
		IEmbeddableValueEndpointEditpart {

	@Override
	protected YEmbeddableValueEndpoint createModel() {
		checkDisposed();
		return CoreModelFactory.eINSTANCE.createYEmbeddableValueEndpoint();
	}

	@Override
	public void setRefreshProvider(RefreshProvider refresh) {
		// nothing to do
	}

}
