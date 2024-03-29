/*
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.ecp.internal.core.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecp.spi.core.util.InternalChildrenList;

import java.util.Collection;

/**
 * @author Eike Stepper
 */
public class ChildrenListImpl extends BasicEList<Object> implements InternalChildrenList {
	private static final long serialVersionUID = 1L;

	private final Object parent;

	/**
	 * The ChildrenListImpl constructor.
	 * 
	 * @param parent the parent object of this {@link ChildrenListImpl}
	 */
	public ChildrenListImpl(Object parent) {
		this.parent = parent;
	}

	/** {@inheritDoc} */
	public final Object getParent() {
		return parent;
	}

	/** {@inheritDoc} */
	public synchronized boolean hasChildren() {
		return !isEmpty();
	}

	/** {@inheritDoc} */
	public synchronized Object[] getChildren() {
		return toArray(new Object[size()]);
	}

	/** {@inheritDoc} */
	public synchronized Object getChild(int index) {
		return get(index);
	}

	/** {@inheritDoc} */
	public void addChildWithoutRefresh(Object child) {
		synchronized (this) {
			add(child);
		}
	}

	/** {@inheritDoc} */
	public final void addChild(Object child) {
		addChildWithoutRefresh(child);
		childrenAdded();
	}

	/** {@inheritDoc} */
	public final <T> void addChildren(T... children) {
		synchronized (this) {
			for (int i = 0; i < children.length; i++) {
				Object child = children[i];
				add(child);
			}
		}

		childrenAdded();
	}

	/** {@inheritDoc} */
	public final <T> void addChildren(Collection<T> children) {
		synchronized (this) {
			addAll(children);
		}

		childrenAdded();
	}

	/** {@inheritDoc} */
	public boolean isSlow() {
		return false;
	}

	/** {@inheritDoc} */
	public boolean isComplete() {
		return true;
	}

	/** {@inheritDoc} */
	public void setComplete() {
		// Do nothing
	}

	/**
	 * This method is called whenever a child is added. Subclasses interested in this information should overwrite this
	 * method.
	 */
	protected void childrenAdded() {
		// Can be overridden in subclasses
	}
}
