/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl.custom;

import java.util.Arrays;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class ChangeAdapter extends AdapterImpl {

	private Config config;

	public ChangeAdapter(Config config) {
		super();
		this.config = config;
	}

	@Override
	public void notifyChanged(final Notification msg) {

		// not a valid feature
		if (msg.getFeature() != config.feature) {
			return;
		}

		// not a valid event
		if (Arrays.binarySearch(config.events, msg.getEventType()) < 0) {
			return;
		}

		switch (msg.getEventType()) {
		case Notification.ADD:
			handleAdd(msg);
			break;
		case Notification.REMOVE:
			handleRemove(msg);
			break;
		case Notification.SET:
			handleSet(msg);
			break;
		default:
			throw new IllegalArgumentException(
					String.format("Event %s not valid!",
							Integer.toString(msg.getEventType())));
		}
	}

	/**
	 * Handles adding eObjects.
	 * 
	 * @param msg
	 */
	protected void handleAdd(Notification msg) {
		// never put content here!
	}

	/**
	 * Handles removing eObjects.
	 * 
	 * @param msg
	 */
	protected void handleRemove(Notification msg) {
		// never put content here!
	}

	/**
	 * Handles set of eObjects.
	 * 
	 * @param msg
	 */
	protected void handleSet(Notification msg) {
		// never put content here!
	}

	/**
	 * Config for the adapter.
	 */
	public static class Config {
		private EStructuralFeature feature;
		private int[] events;

		public Config(EStructuralFeature feature, int... events) {
			this.feature = feature;
			this.events = Arrays.copyOf(events, events.length);
		}
	}

}
