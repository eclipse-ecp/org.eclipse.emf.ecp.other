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
package org.eclipse.emf.ecp.ecview.common.presentation;

import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

/**
 * FieldPresentations are elements that display information but can not embed
 * any further widgets like layouts.
 * 
 * @param <C>
 */
public interface IFieldPresentation<C> extends IWidgetPresentation<C> {

	/**
	 * Adds the validator to the field.
	 * 
	 * @param validator
	 */
	void addValidator(IValidator validator);

	/**
	 * Removes the validator from the field.
	 * 
	 * @param validator
	 */
	void removeValidator(IValidator validator);

	/**
	 * An event to indicate added or removed validator.
	 */
	public static class Event {

		public static final byte ADD = 0;
		public static final byte REMOVE = 1;

		private final short type;
		private final IValidator validator;

		public Event(byte type, IValidator validator) {
			super();
			this.type = type;
			this.validator = validator;
		}

		/**
		 * Returns the event. May be {@link #ADD} or {@link #REMOVE}.
		 * 
		 * @return
		 */
		public short getType() {
			return type;
		}

		/**
		 * Returns the validator.
		 * 
		 * @return
		 */
		public IValidator getValidator() {
			return validator;
		}

	}
}
