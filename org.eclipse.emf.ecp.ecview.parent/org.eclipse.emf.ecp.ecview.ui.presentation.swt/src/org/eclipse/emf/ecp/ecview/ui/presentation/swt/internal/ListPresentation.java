/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IListEditpart;
import org.eclipse.riena.ui.ridgets.IListRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;

/**
 * This presenter is responsible to render a list field on the given layout.
 */
public class ListPresentation extends AbstractSWTWidgetPresenter {

	private final YList yList;
	private Composite controlBase;
	private List list;
	private IListRidget listRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public ListPresentation(IElementEditpart editpart) {
		super((IListEditpart) editpart);
		this.yList = (YList) editpart.getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(2, false));
			setCSSClass(controlBase, CSS_CLASS_CONTROL_BASE);
			if (Util.isCssIdValid(yList)) {
				setCSSId(controlBase, Util.getCssID(yList));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			list = new List(controlBase, SWT.CHECK);
			list.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
					false));
			listRidget = (IListRidget) SwtRidgetFactory
					.createRidget(list);

			// update style attributes
			//
			updateStyle();
		}
		return controlBase;
	}

	/**
	 * Updates the control style attributes.
	 */
	private void updateStyle() {
		if (Util.isCssClassValid(yList)) {
			setCSSClass(list, Util.getCssClass(yList));
		} else {
			setCSSClass(list, CSS_CLASS_CONTROL);
		}
		
		// creates the binding for the field
		createBindings(yList, listRidget);

		
//		Util.updateMarkableRidget(comboBoxRidget, yList);
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	/**
	 * Returns true, if the label is valid.
	 * 
	 * @return
	 */
	public boolean isLabelValid() {
		return yList.getDatadescription() != null
				&& yList.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yList.getDatadescription().getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			list = null;
			listRidget = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		// unrender the ui control
		unrender();
	}
}