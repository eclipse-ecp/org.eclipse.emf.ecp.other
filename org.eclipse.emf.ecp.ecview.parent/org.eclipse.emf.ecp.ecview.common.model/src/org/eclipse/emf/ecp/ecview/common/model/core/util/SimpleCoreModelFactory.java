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
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextValueBindingEndpoint;
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
	 * Creates an instance of {@link YContextValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YContextValueBindingEndpoint createContextBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYContextValueBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanValueBindingEndpoint createBeanBindingEndpoint() {
		return BindingFactory.eINSTANCE.createYBeanValueBindingEndpoint();
	}
	
	/**
	 * Creates an instance of {@link YBeanSlotValueBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanSlotValueBindingEndpoint createBeanSlotValueBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYBeanSlotValueBindingEndpoint();
	}
	
	/**
	 * Creates an instance of {@link YBeanSlotListBindingEndpoint}
	 * 
	 * @return
	 */
	public YBeanSlotListBindingEndpoint createBeanSlotListBindingEndpoint() {
		return CoreModelFactory.eINSTANCE.createYBeanSlotListBindingEndpoint();
	}

	/**
	 * Creates an instance of {@link YBeanSlot}
	 * 
	 * @return
	 */
	public YBeanSlot createBeanSlot() {
		return CoreModelFactory.eINSTANCE.createYBeanSlot();
	}

}
