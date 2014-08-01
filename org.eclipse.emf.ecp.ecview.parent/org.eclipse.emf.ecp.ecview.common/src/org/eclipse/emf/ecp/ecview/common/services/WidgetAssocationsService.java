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
package org.eclipse.emf.ecp.ecview.common.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WidgetAssocationsService implements IWidgetAssocationsService {

	private Map<Object, Object> associations = Collections
			.synchronizedMap(new HashMap<Object, Object>());

	@Override
	public Object getModelElement(Object uiWidget) {
		return associations.get(uiWidget);
	}

	@Override
	public Object getWidget(Object modelElement) {
		synchronized (associations) {
			for (Map.Entry<Object, Object> entry : associations.entrySet()) {
				if (entry.getValue() == modelElement) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

	@Override
	public void associate(Object uiWidget, Object modelElement) {
		associations.put(uiWidget, modelElement);
	}

	@Override
	public void remove(Object uiWidget) {
		associations.remove(uiWidget);
	}

	@Override
	public void clear() {
		associations.clear();
	}

	@Override
	public List<Object> getModelElements() {
		return new ArrayList<Object>(associations.values());
	}

}
