/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * Technische Universitaet Muenchen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.ecp.internal.editor.unused;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.editor.commands.ECPCommand;
import org.eclipse.emf.ecp.editor.controls.AbstractControl;
import org.eclipse.emf.ecp.editor.controls.IValidatableControl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;

/**
 * The standard widget for multi line text fields.
 * 
 * @author helming
 */
public class MERichTextControl extends AbstractControl implements IValidatableControl {
	private EAttribute attribute;

	private AdapterImpl eAdapter;

	private static final int PRIORITY = -1;

	private Label labelWidgetImage; // Label for diagnostic image

	private Composite composite;

	private ToolBar toolBar;

	private Text text;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#createControl(org.eclipse.swt.widgets.Composite, int)
	 */
	@Override
	public Control createControl(Composite parent, int style) {
		Object feature = getItemPropertyDescriptor().getFeature(getContext().getModelElement());
		attribute = (EAttribute) feature;
		composite = getToolkit().createComposite(parent, style);
		composite.setBackgroundMode(SWT.INHERIT_FORCE);

		GridLayoutFactory.fillDefaults().numColumns(3).spacing(2, 0).applyTo(composite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);

		labelWidgetImage = getToolkit().createLabel(composite, "    ");
		labelWidgetImage.setBackground(composite.getBackground());
		GridDataFactory.fillDefaults().hint(20, 20).applyTo(labelWidgetImage);

		createText();

		ControlDecoration controlDecoration = new ControlDecoration(text, SWT.RIGHT | SWT.TOP);
		controlDecoration.setDescriptionText("Invalid input");
		controlDecoration.setShowHover(true);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
			FieldDecorationRegistry.DEC_ERROR);
		controlDecoration.setImage(fieldDecoration.getImage());
		controlDecoration.hide();

		IObservableValue model = EMFEditObservables.observeValue(getContext().getEditingDomain(), getContext()
			.getModelElement(), getStructuralFeature());
		IObservableValue value = SWTObservables.observeText(text, SWT.FocusOut);
		getContext().getDataBindingContext().bindValue(value, model);

		eAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() != null && msg.getFeature().equals(attribute)) {
					load();
				}
				super.notifyChanged(msg);
			}
		};
		getContext().getModelElement().eAdapters().add(eAdapter);
		load();
		return composite;
	}

	private void createText() {

		text = getToolkit().createText(composite, new String(), SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);

		// text.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		// text.setSize(10, 100);
		text.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				save();
				super.focusLost(e);
			}

		});
		GridData spec = new GridData();
		spec.horizontalAlignment = GridData.FILL;
		spec.grabExcessHorizontalSpace = true;
		spec.verticalAlignment = GridData.FILL;
		spec.grabExcessVerticalSpace = true;
		spec.heightHint = 200;
		text.setLayoutData(spec);

		if (!getItemPropertyDescriptor().canSetProperty(getContext().getModelElement())) {
			text.setEnabled(false);
		}
	}

	/**
	 * Returns the {@link ToolBar}.
	 * 
	 * @return the toolbar
	 */
	public ToolBar getToolbar() {
		return toolBar;
	}

	private void save() {
		new ECPCommand(getContext().getModelElement(), getContext().getEditingDomain()) {
			@Override
			protected void doRun() {
				getContext().getModelElement().eSet(attribute, text.getText());
			}
		}.run(true);
	}

	private void load() {

		String txt = "";
		final StringBuffer value = new StringBuffer();
		new ECPCommand(getContext().getModelElement(), getContext().getEditingDomain()) {
			@Override
			protected void doRun() {
				if (getContext().getModelElement().eGet(attribute) == null) {
					value.append("");
				} else {
					value.append(getContext().getModelElement().eGet(attribute));
				}
			}
		}.run(true);
		txt = value.toString();
		text.setText(txt);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		getContext().getModelElement().eAdapters().remove(eAdapter);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void applyCustomLayoutData() {
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.TOP).hint(250, 150).grab(true, false).applyTo(composite);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#canRender(org.eclipse.emf.edit.provider.IItemPropertyDescriptor,
	 *      org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public int canRender(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement) {
		Object feature = itemPropertyDescriptor.getFeature(modelElement);
		if (feature instanceof EAttribute && ((EAttribute) feature).getEType().getInstanceClass().equals(String.class)) {

			if (itemPropertyDescriptor.isMultiLine(feature)) {
				return PRIORITY;
			}
		}
		return AbstractControl.DO_NOT_RENDER;
	}

	/**
	 * . {@inheritDoc}
	 */
	public void handleValidation(Diagnostic diagnostic) {
		if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING) {
			Image image = org.eclipse.emf.ecp.internal.editor.Activator
				.getImageDescriptor("icons/validation_error.png").createImage();
			labelWidgetImage.setImage(image);
			labelWidgetImage.setToolTipText(diagnostic.getMessage());
		}
	}

	/**
	 * . {@inheritDoc}
	 */
	public void resetValidation() {
		labelWidgetImage.setImage(null);
		labelWidgetImage.setToolTipText("    ");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#getPriority()
	 */
	@Override
	protected int getPriority() {
		return PRIORITY;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#getEStructuralFeatureType()
	 */
	@Override
	protected Class<? extends EStructuralFeature> getEStructuralFeatureType() {
		return EAttribute.class;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.editor.controls.AbstractControl#getClassType()
	 */
	@Override
	protected Class<?> getSupportedClassType() {
		return String.class;
	}

	@Override
	protected boolean isMulti() {
		return false;
	}
}