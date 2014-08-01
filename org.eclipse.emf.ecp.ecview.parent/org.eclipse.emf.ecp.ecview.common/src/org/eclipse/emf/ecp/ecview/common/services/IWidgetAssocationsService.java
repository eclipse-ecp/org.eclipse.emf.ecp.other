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

import java.util.List;

/**
 * Is used to associate widgets with their model elements.
 */
public interface IWidgetAssocationsService extends IUiKitBasedService {

	public static final String ID = IWidgetAssocationsService.class.getName();

	/**
	 * Returns the model element for the given ui widget.
	 * 
	 * @param uiWidget
	 */
	Object getModelElement(Object uiWidget);
	
	/**
	 * Returns the widget for the given model element.
	 * 
	 * @param modelElement
	 */
	Object getWidget(Object modelElement);

	/**
	 * Associates the uiWidget with the given model element. One model element
	 * can become assigned to different uiWidgets.
	 * 
	 * @param uiWidget
	 * @param modelElement
	 */
	void associate(Object uiWidget, Object modelElement);

	/**
	 * Removes the association for the given uiWidget.
	 * 
	 * @param uiWidget
	 */
	void remove(Object uiWidget);

	/**
	 * Returns all model elements.
	 */
	List<Object> getModelElements();

	/**
	 * Clears all associations.
	 */
	void clear();

}
