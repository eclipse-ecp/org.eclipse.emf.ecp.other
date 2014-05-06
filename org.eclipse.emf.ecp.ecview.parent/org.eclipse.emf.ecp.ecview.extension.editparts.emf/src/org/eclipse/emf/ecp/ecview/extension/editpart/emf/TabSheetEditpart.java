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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.LayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabSheetEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.presentation.ITabSheetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("restriction")
public class TabSheetEditpart extends EmbeddableEditpart<YTabSheet> implements
		ITabSheetEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LayoutEditpart.class);
	private List<ITabEditpart> tabEditparts;

	/**
	 * Default constructor.
	 */
	public TabSheetEditpart() {

	}

	@Override
	protected YTabSheet createModel() {
		return ExtensionModelFactory.eINSTANCE.createYTabSheet();
	}

	@Override
	public List<ITabEditpart> getTabs() {
		if (tabEditparts == null) {
			internalLoadTabs();
		}
		return Collections.unmodifiableList(tabEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have
			// not been loaded yet,
			// but exist in the model.
			if (tabEditparts != null || getModel().getTabs().size() > 0) {
				List<ITabEditpart> tempElements = getTabs();
				synchronized (tabEditparts) {
					for (ITabEditpart editpart : tempElements
							.toArray(new ITabEditpart[tempElements.size()])) {
						editpart.dispose();
					}
				}
				tabEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public void addTab(ITabEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			YTabSheet yLayout = getModel();
			YTab yTab = (YTab) element.getModel();
			yLayout.getTabs().add(yTab);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeTab(ITabEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			YTabSheet yLayout = getModel();
			YTab yTab = (YTab) element.getModel();
			yLayout.getTabs().remove(yTab);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			YTab yTab = (YTab) notification.getNewValue();

			ITabEditpart editPart = (ITabEditpart) getEditpart(yTab);
			internalAddElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ITabSheetPresentation<?> presenter = getPresentation();
				int index = notification.getPosition();
				if (index < 0 || index >= getTabs().size() - 1) {
					presenter.add(editPart.getPresentation());
				} else {
					presenter.insert(editPart.getPresentation(), index);
				}
			}
			break;
		default:
			break;
		}
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			YTab yTab = (YTab) notification.getNewValue();

			ITabEditpart editPart = (ITabEditpart) getEditpart(yTab);
			internalMoveTab(editPart, notification.getPosition());

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ITabSheetPresentation<?> presenter = getPresentation();
				presenter.move(editPart.getPresentation(),
						notification.getPosition());
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	private boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YTAB_SHEET__TABS:
			YTab yTab = (YTab) notification.getOldValue();

			ITabEditpart editPart = (ITabEditpart) getEditpart(yTab);
			internalRemoveTab(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ITabSheetPresentation<?> presenter = getPresentation();
				presenter.remove(editPart.getPresentation());
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the
	 * list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be added
	 */
	protected void internalAddElement(ITabEditpart editpart) {
		checkDisposed();

		if (tabEditparts == null) {
			internalLoadTabs();
		}
		if (!tabEditparts.contains(editpart)) {
			tabEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and to move the given editpart in
	 * the list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be inserted
	 * @param index
	 *            The index to move the element.
	 */
	protected void internalMoveTab(ITabEditpart editpart, int index) {
		checkDisposed();

		if (tabEditparts == null) {
			internalLoadTabs();
		} else if (!tabEditparts.contains(editpart)) {
			throw new RuntimeException(String.format(
					"Editpart %s is not contained in tabs", editpart.getId()));
		} else {
			tabEditparts.remove(editpart);
			tabEditparts.add(index, editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from
	 * the list of tabs.
	 * 
	 * @param editpart
	 *            The editpart to be removed
	 */
	protected void internalRemoveTab(ITabEditpart editpart) {
		checkDisposed();

		if (tabEditparts != null && editpart != null) {
			tabEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all tabs.
	 */
	protected void internalLoadTabs() {
		checkDisposed();

		if (tabEditparts == null) {
			tabEditparts = new ArrayList<ITabEditpart>();
			for (YTab yTab : getModel().getTabs()) {
				ITabEditpart editPart = getEditpart(yTab);
				internalAddElement(editPart);
			}
		}
	}

	@Override
	public List<IValidatorEditpart> getDatatypeValidators() {
		return Collections.emptyList();
	}
}
