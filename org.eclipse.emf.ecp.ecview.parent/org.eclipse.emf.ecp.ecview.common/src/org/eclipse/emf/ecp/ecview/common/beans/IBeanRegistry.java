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

/**
 * The bean registry. <br>
 * Not intended to be subclassed.
 */
public interface IBeanRegistry {

	public static final String ROOTBEAN_SELECTOR = "http://eclipse.org/emf/emfclient/uimodel/view/rootbean";

	/**
	 * Returns a bean for the given selector. It can be used to store transient
	 * values related to the current view. All returned beans should offer
	 * PropertyChangeSupport.<br>
	 * If an instance of a bean for the given selector could be found, it will
	 * be returned. Otherwise <code>null</code> will be returned.
	 * <p>
	 * A common use case for beans would be the sharing of a selected value. For
	 * instance a selection event on a list may write the selection to the
	 * context (selector="my.personlist.selection"). And a detail component can
	 * observe the wrapper of the bean instance (see
	 * {@link #getBeanSlot(String)} and reflect its values. To observe the value
	 * change of bean wrapper eclipse data binding may be used.
	 * 
	 * @param selector
	 *            The selector string to identify the bean instance.
	 * @return valueBean
	 */
	public abstract Object getBean(String selector);

	/**
	 * Registers an instance of the bean to the context. It can be accessed by
	 * the selector. See also {@link #getBean(String) getBean}.
	 * <p>
	 * If not bean slot was created for the selector, then it will be created
	 * automatically if the bean is not <code>null</code>. If the bean is
	 * <code>null</code> no slot can be created since its type is not known.<br>
	 * If a bean slot exists, then the type of the bean has to be assignable to
	 * the valuetype of the slot.
	 * 
	 * @param selector
	 *            The selector string to identify the bean instance.
	 * @param bean
	 *            The bean.
	 * 
	 * @throws IllegalArgumentException
	 *             if the bean is <code>null</code> or the type of the bean is
	 *             not assignable to the valueType of the slot.
	 */
	void setBean(String selector, Object bean);

	/**
	 * Returns the bean slot that is used internally to store the bean.
	 * <p>
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @return slot
	 */
	public abstract ISlot getBeanSlot(String selector);

	/**
	 * Creates a new bean slot at the registry. If the slot already exists, that
	 * instance will be returned.
	 * 
	 * @param selector
	 *            The selector string to identify the bean instance.
	 * @param type
	 *            The type of the bean. Must not be <code>null</code>
	 * @return
	 */
	ISlot createBeanSlot(String selector, Class<?> type);

}