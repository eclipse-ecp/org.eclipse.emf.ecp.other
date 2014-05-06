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

import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

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
	DatatypeChangeEvent getInitialInformation();

	/**
	 * Adds a listener the the datatype editpart.
	 * <p>
	 * Note that the datatype is not part of the containment tree of the UI
	 * element. So many UI elements may share the same instance of the datatype.
	 * 
	 * @param listener
	 */
	void addListener(DatatypeChangeListener listener);

	/**
	 * Unregisters the given listener from the datatype.
	 * 
	 * @param listener
	 */
	void removeListener(DatatypeChangeListener listener);

	/**
	 * This event is fired if the datatype changed.
	 */
	public static class DatatypeChangeEvent {

		private final IDatatypeEditpart editpart;
		private final Object changeObject;
		private final boolean valiadtorUpdate;
		private final List<IValidator> validators;

		public DatatypeChangeEvent(IDatatypeEditpart editpart,
				Object changeObject, boolean valiadtorUpdate,
				List<IValidator> validators) {
			super();
			this.editpart = editpart;
			this.changeObject = changeObject;
			this.valiadtorUpdate = valiadtorUpdate;
			this.validators = validators;
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
		 * fields. See {@link #isValiadtorUpdate()}.
		 * 
		 * @return
		 */
		public List<IValidator> getValidators() {
			return validators;
		}

		/**
		 * Returns true, if the validator need to be updated. False otherwise.
		 * 
		 * @return
		 */
		public boolean isValiadtorUpdate() {
			return valiadtorUpdate;
		}

	}

	/**
	 * Listeners are notified if the datatype changed.
	 */
	public static interface DatatypeChangeListener {

		/**
		 * Notifies the listener about the change.
		 * 
		 * @param event
		 */
		void notifyDatatypeChanged(DatatypeChangeEvent event);
	}
}
