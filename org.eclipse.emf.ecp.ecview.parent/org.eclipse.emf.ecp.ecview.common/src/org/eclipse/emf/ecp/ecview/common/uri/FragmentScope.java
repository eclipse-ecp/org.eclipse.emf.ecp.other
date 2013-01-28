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
package org.eclipse.emf.ecp.ecview.common.uri;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FragmentScope extends AbstractScope {

	private static final Logger logger = LoggerFactory
			.getLogger(FragmentScope.class);

	private static final String SEGMENT_TEMPLATE = "#%s";
	private final BeanScope parent;
	private final String selector;

	public FragmentScope(BeanScope parent, String selector) {
		this.parent = parent;
		this.selector = selector;

		setURISegment(String.format(SEGMENT_TEMPLATE, selector));
	}

	/**
	 * Returns the URI representation of this bean scope.
	 * 
	 * @return URI
	 */
	public URI toURI() {
		return URI.create(toURIString());
	}

	/**
	 * Returns the URI string of the produced string token.
	 * 
	 * @return String string
	 */
	public String toURIString() {
		return parent.toURIString().concat(getURISegment());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends AccessibleScope> A root() {
		return (A) parent.getViewScope();
	}

	public Object access(Object bean) {
		Object result = null;
		try {
			result = PropertyUtils.getProperty(bean, selector);
		} catch (IllegalAccessException e) {
			logger.error("{}", e);
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			logger.error("{}", e);
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			logger.error("{}", e);
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Returns the URISegment but removing the first #.
	 * 
	 * @return
	 */
	public String getFragmentContent() {
		return getURISegment().replace("#", "");
	}

	public String toString() {
		return toURIString();
	}

}
