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
package org.eclipse.emf.ecp.ecview.common.model.core.util;

import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

public class SimpleCoreModelFactory {

	/**
	 * Creates an instance of {@link YView}
	 * 
	 * @return
	 */
	public YView createView() {
		return CoreModelFactory.eINSTANCE.createYView();
	}

	/**
	 * Creates an instance of {@link YViewSet}
	 * 
	 * @return
	 */
	public YViewSet createViewSet() {
		return CoreModelFactory.eINSTANCE.createYViewSet();
	}

	/**
	 * Creates an instance of {@link YDatadescription}
	 * 
	 * @return
	 */
	public YDatadescription createDatadescription() {
		return DatatypesFactory.eINSTANCE.createYDatadescription();
	}

	/**
	 * Creates an instance of {@link YEmbeddableValueEndpoint}
	 * 
	 * @return
	 */
	public YEmbeddableValueEndpoint createEmbeddableValueEndpoint() {
		return CoreModelFactory.eINSTANCE.createYEmbeddableValueEndpoint();
	}

	/**
	 * Creates an instance of {@link YContextBindingEndpoint}
	 * 
	 * @return
	 */
	public YContextBindingEndpoint createContextBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYContextBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanBindingEndpoint createBeanBindingEndpoint() {
		return BindingFactory.eINSTANCE.createYBeanBindingEndpoint();
	}

}