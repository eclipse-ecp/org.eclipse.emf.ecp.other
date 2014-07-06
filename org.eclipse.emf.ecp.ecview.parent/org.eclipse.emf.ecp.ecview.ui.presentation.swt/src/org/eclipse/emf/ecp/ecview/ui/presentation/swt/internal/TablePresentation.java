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
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITableEditpart;
import org.eclipse.riena.ui.ridgets.ITableRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

/**
 * This presenter is responsible to render a table field on the given layout.
 */
public class TablePresentation extends AbstractSWTWidgetPresenter {

	private final YTable yTable;
	private Composite controlBase;
	private Table table;
	private ITableRidget tableRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public TablePresentation(IElementEditpart editpart) {
		super((ITableEditpart) editpart);
		this.yTable = (YTable) editpart.getModel();
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
			if (Util.isCssIdValid(yTable)) {
				setCSSId(controlBase, Util.getCssID(yTable));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			table = new Table(controlBase, SWT.CHECK);
			table.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
					false));
			tableRidget = (ITableRidget) SwtRidgetFactory
					.createRidget(table);

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
		if (Util.isCssClassValid(yTable)) {
			setCSSClass(table, Util.getCssClass(yTable));
		} else {
			setCSSClass(table, CSS_CLASS_CONTROL);
		}
		
		// creates the binding for the field
		createBindings(yTable, tableRidget);

//		Util.updateMarkableRidget(comboBoxRidget, yTable);
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
		return yTable.getDatadescription() != null
				&& yTable.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yTable.getDatadescription().getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			table = null;
			tableRidget = null;
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