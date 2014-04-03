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
package org.eclipse.emf.ecp.ecview.common.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * A default implementation of the slot. Offers {@link PropertyChangeSupport}.
 */
public class AbstractSlot implements ISlot {
	private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);
	
	private final Class<?> valueType;
	private Object value;

	public AbstractSlot(Class<?> valueType) {
		this.valueType = valueType;
	}

	public AbstractSlot(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Value must not be null!");
		}
		this.value = value;
		this.valueType = value.getClass();
	}

	@Override
	public Class<?> getValueType() {
		return valueType;
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param listener
	 *            Listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param property
	 *            Name of the property
	 * @param listener
	 *            Listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(property, listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param listener
	 *            Listener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param property
	 *            Name of the property
	 * @param listener
	 *            Listener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(property, listener);
	}

	/**
	 * Fires the property changed event.
	 * 
	 * @param property
	 *            Name of the property
	 * @param oldValue
	 *            The old value
	 * @param newValue
	 *            The new value
	 * @see java.beans.PropertyChangeSupport#firePropertyChange(String, Object,
	 *      Object)
	 */
	protected void firePropertyChanged(String property, Object oldValue,
			Object newValue) {
		changeSupport.firePropertyChange(property, oldValue, newValue);
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public void setValue(Object value) {
		// BEGIN SUPRESS CATCH EXCEPTION
		firePropertyChanged("value", this.value, this.value = value);
		// END SUPRESS CATCH EXCEPTION
	}
}
