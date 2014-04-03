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
package org.eclipse.emf.ecp.ecview.common.binding.observables;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.services.IServiceRegistry;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class ContextObservables {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ContextObservables.class);
	private static ContextObservables instance = new ContextObservables();

	private final List<DelegateInfo> delegateInfos = Collections
			.synchronizedList(new ArrayList<DelegateInfo>());

	private ContextObservables() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static ContextObservables getInstance() {
		return instance;
	}

	/**
	 * Removes all delegate. Should only be used very carefully.
	 */
	public void clear() {
		delegateInfos.clear();
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(IViewContext context,
			URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(context,
				bindingURI);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(Realm realm,
			IViewContext context, URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(realm, context,
				bindingURI);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(IViewContext context,
			URI bindingURI) {
		IContextBindingDelegate delegate = getDelegate(context, bindingURI);
		if (delegate != null) {
			return delegate.observeValue(context, bindingURI);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(Realm realm,
			IViewContext context, URI bindingURI) {
		IContextBindingDelegate delegate = getDelegate(context, bindingURI);
		if (delegate != null) {
			return delegate.observeValue(realm, context, bindingURI);
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns the delegate for the given information.
	 * 
	 * @param context
	 * @param bindingURI
	 * @return
	 */
	public IContextBindingDelegate getDelegate(IViewContext context,
			URI bindingURI) {
		for (DelegateInfo info : delegateInfos
				.toArray(new DelegateInfo[delegateInfos.size()])) {
			IContextBindingDelegate delegate = info.delegate;
			if (delegate.isFor(context, bindingURI)) {
				return delegate;
			}
		}
		return null;
	}

	/**
	 * Adds a new delegate to the manager. The lower the sequence the earlier
	 * the delegate will be used.
	 * 
	 * @param sequence
	 *            the sequence of the delegate
	 * @param delegate
	 *            delegate to be added
	 */
	public void addDelegate(int sequence, IContextBindingDelegate delegate) {
		if (!containsDelegate(delegate)) {
			delegateInfos.add(new DelegateInfo(sequence, delegate));
			Collections.sort(delegateInfos);
		}
	}

	/**
	 * Returns the sequence for the given delegate.
	 * 
	 * @param delegate
	 * @return
	 */
	public int getSequence(IContextBindingDelegate delegate) {
		DelegateInfo info = findDelegateInfo(delegate);
		return info != null ? info.sequence : -1;
	}

	/**
	 * Returns true if the delegate is contained in the list of delegate infos.
	 * 
	 * @param delegate
	 * @return
	 */
	protected boolean containsDelegate(IContextBindingDelegate delegate) {
		synchronized (delegateInfos) {
			for (DelegateInfo info : delegateInfos) {
				if (info.delegate == delegate) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns the delegate info if the delegate is contained in the list of
	 * delegate infos. Otherwise returns <code>null</code>.
	 * 
	 * @param info
	 * @return
	 */
	protected DelegateInfo findDelegateInfo(IContextBindingDelegate delegate) {
		synchronized (delegateInfos) {
			for (DelegateInfo info : delegateInfos) {
				if (info.delegate == delegate) {
					return info;
				}
			}
		}
		return null;
	}

	/**
	 * Removes the delegate from the manager.
	 * 
	 * @param delegate
	 *            delegate to be removed
	 */
	public void removeDelegate(IContextBindingDelegate delegate) {
		if (delegate == null) {
			return;
		}
		synchronized (delegateInfos) {
			for (Iterator<DelegateInfo> iterator = delegateInfos.iterator(); iterator
					.hasNext();) {
				DelegateInfo info = (DelegateInfo) iterator.next();
				if (info.delegate == delegate) {
					iterator.remove();
					return;
				}
			}
		}
	}

	/**
	 * The OSGi component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void activate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void deactivate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be added.
		 * @param properties
		 *            OSGi service properties.
		 */
		protected void addDelegate(IContextBindingDelegate delegate,
				Map<String, ?> properties) {
			int sequence = IServiceRegistry.PROPERTY__DEFAULT_SQUENCE;
			if (properties.containsKey(IServiceRegistry.PROPERTY__SQUENCE)) {
				sequence = (Integer) properties
						.get(IServiceRegistry.PROPERTY__SQUENCE);
			}
			ContextObservables.getInstance().addDelegate(sequence, delegate);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be removed.
		 */
		protected void removeDelegate(IContextBindingDelegate delegate) {
			ContextObservables.getInstance().removeDelegate(delegate);
		}
	}

	private static class DelegateInfo implements Comparable<DelegateInfo> {
		private final int sequence;
		private final IContextBindingDelegate delegate;

		private DelegateInfo(int sequence, IContextBindingDelegate delegate) {
			super();
			this.sequence = sequence;
			this.delegate = delegate;
		}

		@Override
		public int compareTo(DelegateInfo o) {
			return sequence - o.sequence;
		}
	}
}
