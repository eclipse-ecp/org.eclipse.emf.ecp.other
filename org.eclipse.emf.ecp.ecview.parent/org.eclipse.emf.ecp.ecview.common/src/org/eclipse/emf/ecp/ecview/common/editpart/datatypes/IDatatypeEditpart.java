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
package org.eclipse.emf.ecp.ecview.common.editpart.datatypes;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;

/**
 * An editpart responsible to handle datatypes.
 */
public interface IDatatypeEditpart extends IElementEditpart {

	/**
	 * Returns the initial information about the datatype. The change object
	 * will be <code>null</code>.
	 * 
	 * @return
	 */
	DatatypeChangeEvent getCurrentState();

	/**
	 * Adds the given bridge to the datatype editpart. See
	 * {@link DatatypeBridge}.
	 * <p>
	 * Note that the datatype is not part of the containment tree of the UI
	 * element. So many UI elements may share the same instance of the datatype.
	 * 
	 * @param bridge
	 */
	void addBridge(DatatypeBridge bridge);

	/**
	 * Unregisters the given bridge from the datatype. See
	 * {@link DatatypeBridge}.
	 * 
	 * @param bridge
	 */
	void removeBridge(DatatypeBridge bridge);

	/**
	 * This event is fired if the datatype changed.
	 */
	public static class DatatypeChangeEvent {

		private final IDatatypeEditpart editpart;
		private final Object changeObject;
		private final List<IValidatorEditpart> removedValidators;
		private final List<IValidatorEditpart> addedValidators;

		public DatatypeChangeEvent(IDatatypeEditpart editpart,
				Object changeObject, List<IValidatorEditpart> addedValidators,
				List<IValidatorEditpart> removedValidators) {
			super();
			this.editpart = editpart;
			this.changeObject = changeObject;
			this.addedValidators = addedValidators;
			this.removedValidators = removedValidators;
		}

		/**
		 * Returns the datatype editpart that was changed.
		 * 
		 * @return
		 */
		public IDatatypeEditpart getEditpart() {
			return editpart;
		}

		/**
		 * Returns the object containing the changes. The type depends on the
		 * editpart implementation and may be <code>null</code>.
		 * 
		 * @return
		 */
		public Object getChangeObject() {
			return changeObject;
		}

		/**
		 * Returns a list of validators that should be attached to the ui
		 * fields.
		 * 
		 * @return
		 */
		public List<IValidatorEditpart> getAddedValidators() {
			return addedValidators != null ? addedValidators : Collections
					.<IValidatorEditpart> emptyList();
		}

		/**
		 * Returns a list of validators that should be removed from the ui
		 * fields.
		 * 
		 * @return
		 */
		public List<IValidatorEditpart> getRemovedValidators() {
			return removedValidators != null ? removedValidators : Collections
					.<IValidatorEditpart> emptyList();
		}

	}

	/**
	 * This bridge allows the implementor to react for changes in the datatype.
	 * And it provides the datatype editpart with available validators that have
	 * been provided by the datatype editpart.
	 */
	public static interface DatatypeBridge {

		/**
		 * Notifies the listener about the change.
		 * 
		 * @param event
		 */
		void notifyDatatypeChanged(DatatypeChangeEvent event);

		/**
		 * Returns a list with currently available validators that have been
		 * provided by the datatype editpart. Must never return
		 * <code>null</code>.
		 * 
		 * @return
		 */
		List<IValidatorEditpart> getDatatypeValidators();
	}
}
