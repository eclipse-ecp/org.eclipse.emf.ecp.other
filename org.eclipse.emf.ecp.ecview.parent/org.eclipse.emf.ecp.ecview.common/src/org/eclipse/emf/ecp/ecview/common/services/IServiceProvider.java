/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.context.IContext;

/**
 * Provide services.
 * 
 * @author dominguez
 * 
 */
public interface IServiceProvider {

	/**
	 * The property of the OSGi-service to assign the provider to view or
	 * viewset level. No setting means view level.
	 */
	public static final String OSGI_PROPERTY = "ecview.serviceprovider.level";

	public static final String LEVEL_VIEW = "view";

	public static final String LEVEL_VIEW_SET = "viewset";

	public static final Map<String, Object> VIEW_PROPERTIES = PropertiesInitializer
			.createViewProperties();

	public static final Map<String, Object> VIEW_SET_PROPERTIES = PropertiesInitializer
			.createViewSetProperties();

	/**
	 * Returns true if the provider is responsible for creating services of the
	 * given type for the context.
	 * 
	 * @param selector
	 * @param context
	 * @return
	 */
	boolean isFor(String selector, IContext context);

	/**
	 * Returns the service of the given type for the context.
	 * 
	 * @param selector
	 * @param context
	 * @return
	 */
	<A> A createService(String selector, IContext context);

	public static class PropertiesInitializer {

		/**
		 * Creates the properties to assign services to views.
		 * 
		 * @return
		 */
		public static Map<String, Object> createViewProperties() {
			Map<String, Object> props = new HashMap<String, Object>();
			props.put(OSGI_PROPERTY, LEVEL_VIEW);
			return Collections.unmodifiableMap(props);
		}

		/**
		 * Creates the properties to assign services to views.
		 * 
		 * @return
		 */
		public static Map<String, Object> createViewSetProperties() {
			Map<String, Object> props = new HashMap<String, Object>();
			props.put(OSGI_PROPERTY, LEVEL_VIEW_SET);
			return Collections.unmodifiableMap(props);
		}
	}

}