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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The datatype editpart is responsible to observe the {@link YDatatype} model
 * element and to update all UI elements that are registered at this instance.
 */
public abstract class DatatypeEditpart<M extends YDatatype> extends
		ElementEditpart<M> implements IDatatypeEditpart, IValidationConfig {

	private static final Logger logger = LoggerFactory
			.getLogger(DatatypeEditpart.class);

	private Set<DatatypeBridge> bridges = Collections
			.synchronizedSet(new HashSet<DatatypeBridge>());

	@Override
	public DatatypeChangeEvent getCurrentState() {
		ValidatorDelta delta = internalGetAllValidators();
		DatatypeChangeEvent event = new DatatypeChangeEvent(this, null,
				delta.getToAdd(), null);
		return event;
	}

	/**
	 * 
	 * @return
	 */
	public DatatypeChangeEvent getDisposeDatatypeChangeEvent(
			DatatypeBridge bridge) {
		ValidatorDelta delta = internalGetAllValidators();

		DatatypeChangeEvent event = new DatatypeChangeEvent(this, null,
				delta.getToAdd(), null);
		return event;
	}

	/**
	 * Returns a validator delta that should be applied to the internal
	 * validators of the containing UI element.
	 * 
	 * @param bridge
	 *            The currently handled bridge. If <code>null</code> is passed,
	 *            then all validators have to be returned.
	 * @param notification
	 *            Based on the notification the subclasses have to calculate the
	 *            validators to add. If <code>null</code> is passed, then all
	 *            validators have to be returned.
	 * 
	 * @return
	 */
	protected ValidatorDelta internalGetValidatorsDelta(DatatypeBridge bridge,
			Notification notification) {
		return ValidatorByConfigFactory.internalGetValidatorsDelta(this,
				bridge, notification);
	}

	/**
	 * Collects all validators.
	 * 
	 * @param result
	 * @return
	 */
	protected ValidatorDelta internalGetAllValidators() {
		return ValidatorByConfigFactory.getAllValidators(this);
	}

	@Override
	public void addBridge(DatatypeBridge bridge) {
		bridges.add(bridge);
	}

	@Override
	public void removeBridge(DatatypeBridge bridge) {
		if (bridges == null) {
			return;
		}
		bridges.remove(bridge);
	}

	/**
	 * Returns the validator editparts for the given bridge.
	 * 
	 * @param bridge
	 * @return
	 */
	protected List<IValidatorEditpart> getValidatorsForBridge(
			DatatypeBridge bridge) {
		List<IValidatorEditpart> result = bridge.getDatatypeValidators();
		return result != null ? result : Collections
				.<IValidatorEditpart> emptyList();
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		if (notification.getEventType() != Notification.REMOVING_ADAPTER) {
			// forward the notification to the listeners elements
			for (DatatypeBridge bridge : bridges
					.toArray(new DatatypeBridge[bridges.size()])) {

				ValidatorDelta delta = internalGetValidatorsDelta(bridge,
						notification);
				DatatypeChangeEvent event = new DatatypeChangeEvent(this,
						notification, delta.getToAdd(), delta.getToRemove());
				bridge.notifyDatatypeChanged(event);
			}
		}
	}

	/**
	 * Default implementation for all subclasses that implement
	 * {@link IValidationConfig}.
	 * 
	 * @return
	 */
	public Object getValidationSettings() {
		return getModel();
	}

	/**
	 * Returns an unmodifiable collection of bridges.
	 * 
	 * @return
	 */
	protected Set<DatatypeBridge> getBridges() {
		checkDisposed();

		return Collections.unmodifiableSet(bridges);
	}

	@Override
	protected void internalDispose() {
		try {

			if (bridges.size() > 0) {
				logger.error("Attention: The DatatypeEditpart is disposed! "
						+ "All connections from consuming elements like UI fields are interrupted. "
						+ "And they can not be installed anymore without resetting the datatype feature again.");
			}

			// remove all validators and all settings from the observing
			// listeners
			for (DatatypeBridge bridge : bridges
					.toArray(new DatatypeBridge[bridges.size()])) {
				DatatypeChangeEvent event = new DatatypeChangeEvent(this, null,
						null, new ArrayList<>(bridge.getDatatypeValidators()));
				bridge.notifyDatatypeChanged(event);
			}

			bridges = null;
		} finally {
			super.internalDispose();
		}
	}

	/**
	 * A container for validators to be added and removed.
	 */
	public static class ValidatorDelta {

		private final List<IValidatorEditpart> toAdd;
		private final List<IValidatorEditpart> toRemove;

		public ValidatorDelta(List<IValidatorEditpart> toAdd,
				List<IValidatorEditpart> toRemove) {
			super();
			this.toAdd = toAdd;
			this.toRemove = toRemove;
		}

		public List<IValidatorEditpart> getToAdd() {
			return toAdd;
		}

		public List<IValidatorEditpart> getToRemove() {
			return toRemove;
		}

	}

}
