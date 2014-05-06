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
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;

/**
 * The datatype editpart is responsible to observe the {@link YDatatype} model
 * element and to update all UI elements that are registered at this instance.
 */
public abstract class DatatypeEditpart<M extends YDatatype> extends
		ElementEditpart<M> implements IDatatypeEditpart, IValidationConfig {

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

		// forward the notification to the listeners elements
		for (DatatypeBridge bridge : bridges.toArray(new DatatypeBridge[bridges
				.size()])) {

			ValidatorDelta delta = internalGetValidatorsDelta(bridge,
					notification);
			DatatypeChangeEvent event = new DatatypeChangeEvent(this,
					notification, delta.getToAdd(), delta.getToRemove());
			bridge.notifyDatatypeChanged(event);
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
	 * Tries to find all validators of the given type. Each validator of the
	 * same type will then be removed.
	 * <p>
	 * Note: If we need detailed control of the validators to remove (for
	 * instance only validators that have been created by this instance of
	 * datatype editpart), then we have to add a "marker adapter" to the
	 * prepared {@link YValidator}. This marker adapter will keep a reference to
	 * this datatype editpart, and then we can separate validators that have
	 * been added by different editparts. For now, there is no need for it.
	 * 
	 * @param activeValidators
	 * @param oldValue
	 * @return
	 */
	protected List<IValidatorEditpart> findToRemoveValidators(
			List<IValidatorEditpart> activeValidators,
			Class<? extends YValidator> clazz) {
		List<IValidatorEditpart> toRemove = new ArrayList<IValidatorEditpart>();
		for (IValidatorEditpart editpart : activeValidators) {
			if (editpart.getModel().getClass() == clazz) {
				toRemove.add(editpart);
			}
		}
		return toRemove;
	}

	@Override
	protected void internalDispose() {
		try {
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
