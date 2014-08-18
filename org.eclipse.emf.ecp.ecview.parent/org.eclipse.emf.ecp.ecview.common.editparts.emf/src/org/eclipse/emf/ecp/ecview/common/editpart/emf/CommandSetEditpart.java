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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.ICommandEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ICommandSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YCommand;
import org.eclipse.emf.ecp.ecview.common.model.core.YCommandSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link ICommandSetEditpart}.
 * 
 * @param <M>
 */
public class CommandSetEditpart extends ElementEditpart<YCommandSet> implements
		ICommandSetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CommandSetEditpart.class);
	private boolean active;
	private List<ICommandEditpart> commands;

	/**
	 * A default constructor.
	 */
	public CommandSetEditpart() {
	}

	@Override
	protected YCommandSet createModel() {
		checkDisposed();

		return CoreModelFactory.eINSTANCE.createYCommandSet();
	}

	@Override
	public IViewEditpart getView() {
		checkDisposed();

		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) ElementEditpart
				.findEditPartFor(yView) : null;
	}

	@Override
	public boolean isActive() {
		checkDisposed();

		return active;
	}

	@Override
	public void activate() {
		checkDisposed();

		try {
			for (ICommandEditpart command : getCommands()) {
				command.activate();
			}
		} finally {
			active = true;
		}
	}

	@Override
	public void addCommand(ICommandEditpart command) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YCommandSet yCommandSet = getModel();
			YCommand yCommand = (YCommand) command.getModel();
			yCommandSet.addCommand(yCommand);

			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeCommand(ICommandEditpart command) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YCommandSet yCommandSet = getModel();
			YCommand yCommand = (YCommand) command.getModel();
			yCommandSet.removeCommand(yCommand);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}

	}

	@Override
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YCOMMAND_SET__COMMANDS:
			YCommand yCommand = (YCommand) notification.getNewValue();

			ICommandEditpart editPart = (ICommandEditpart) getEditpart(yCommand);
			internalAddCommand(editPart);
			break;
		default:
			break;
		}

	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of commands.
	 * 
	 * @param command
	 *            The editpart to be added
	 */
	protected void internalAddCommand(ICommandEditpart command) {
		checkDisposed();

		ensureCommandsLoaded();
		if (!commands.contains(command)) {
			commands.add(command);

			// activates the command
			command.activate();
		}
	}

	@Override
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YCOMMAND_SET__COMMANDS:
			YCommand yCommand = (YCommand) notification.getOldValue();

			ICommandEditpart editPart = (ICommandEditpart) getEditpart(yCommand);
			internalRemoveCommand(editPart);
			break;
		default:
			break;
		}
	}

	/**
	 * Ensures that the internal commands are loaded properly.
	 */
	private void ensureCommandsLoaded() {
		if (commands == null) {
			internalLoadCommands();
		}
	}

	/**
	 * Is called to load and initialize all commands.
	 */
	protected void internalLoadCommands() {
		checkDisposed();

		if (commands == null) {
			commands = new ArrayList<ICommandEditpart>();
			for (YCommand yCommand : getModel().getCommands()) {
				ICommandEditpart editPart = getEditpart(yCommand);
				internalAddCommand(editPart);
			}
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of commands.
	 * 
	 * @param command
	 *            The editpart to be removed
	 */
	protected void internalRemoveCommand(ICommandEditpart command) {
		checkDisposed();

		if (commands != null && command != null) {
			commands.remove(command);
		}

		// unbinds the command
		command.dispose();
	}

	@Override
	public List<ICommandEditpart> getCommands() {
		ensureCommandsLoaded();
		return new ArrayList<ICommandEditpart>(commands);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet, but exist in the model.
			if (commands != null || getModel().getCommands().size() > 0) {
				List<ICommandEditpart> tempElements = getCommands();
				synchronized (commands) {
					for (ICommandEditpart command : tempElements
							.toArray(new ICommandEditpart[tempElements.size()])) {
						command.dispose();
					}
				}
				commands = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
