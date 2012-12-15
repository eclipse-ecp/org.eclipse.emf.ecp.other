/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.editor.mecontrols.multiattributecontrol;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecp.editor.Activator;
import org.eclipse.emf.ecp.editor.mecontrols.AbstractMEControl;
import org.eclipse.emf.ecp.editor.mecontrols.IValidatableControl;
import org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eugen Neufeld
 */
public abstract class MultiMEAttributeControl extends AbstractMEControl implements IValidatableControl {

	private List<AttributeControlHelper> controlHelpers = new ArrayList<MultiMEAttributeControl.AttributeControlHelper>();

	private int upperBound;

	private ActionContributionItem addActionItem;

	private Section section;

	private IListChangeListener changeListener;

	private IObservableList model;

	private ToolBar toolbar;

	private DisposeListener disposeListener;

	private ToolBarManager toolBarManager;

	private Cursor handCursor;

	@Override
	protected Class<EAttribute> getEStructuralFeatureType() {
		return EAttribute.class;
	}

	@Override
	protected boolean isMulti() {
		return true;
	}

	private void refreshSection() {
		section.setExpanded(false);
		section.setExpanded(true);
		isFull();
	}

	private void updateIndicesAfterRemove(int indexRemoved) {
		int i = 0;
		for (AttributeControlHelper h : controlHelpers) {
			if (i < indexRemoved) {
				i++;
				continue;
			}
			ECPObservableValue modelValue = h.getModelValue();
			modelValue.setIndex(modelValue.getIndex() - 1);
		}
	}

	private void shiftIndecesToRight(int index) {
		ECPObservableValue modelValue = controlHelpers.get(index + 1).getModelValue();
		modelValue.setIndex(modelValue.getIndex() + 1);

	}

	private void shiftIndecesToLeft(int index) {
		ECPObservableValue modelValue = controlHelpers.get(index - 1).getModelValue();
		modelValue.setIndex(modelValue.getIndex() - 1);

	}

	@Override
	protected Control createControl(Composite parent, final int style) {
		upperBound = getStructuralFeature().getUpperBound();
		section = getToolkit().createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		section.setText(getItemPropertyDescriptor().getDisplayName(getModelElement()));
		createSectionToolbar(section, getToolkit());
		final Composite sectionComposite = getToolkit().createComposite(section, style);
		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).applyTo(sectionComposite);

		model = EMFEditObservables.observeList(getContext().getEditingDomain(), getModelElement(),
			getStructuralFeature());

		changeListener = new IListChangeListener() {

			public void handleListChange(ListChangeEvent event) {
				ListDiff diff = event.diff;
				for (final ListDiffEntry entry : diff.getDifferences()) {
					if (entry.isAddition() && entry.getPosition() >= sectionComposite.getChildren().length) {
						addControl(sectionComposite, style, model, entry.getPosition());
						sectionComposite.layout(true);

						refreshSection();
					}
				}
			}
		};
		model.addListChangeListener(changeListener);
		for (int i = 0; i < model.size(); i++) {
			addControl(sectionComposite, style, model, i);
		}
		isFull();
		section.setClient(sectionComposite);
		return section;
	}

	private void addControl(Composite sectionComposite, int style, final IObservableList model, int position) {
		ECPObservableValue modelValue = new ECPObservableValue(model, position, getClassType());
		AttributeControlHelper h = new AttributeControlHelper(modelValue);

		h.createControl(sectionComposite, style);
		controlHelpers.add(h);
	}

	private void createSectionToolbar(Section section, FormToolkit toolkit) {
		toolBarManager = new ToolBarManager(SWT.FLAT);
		toolbar = toolBarManager.createControl(section);
		handCursor = new Cursor(Display.getCurrent(), SWT.CURSOR_HAND);
		toolbar.setCursor(handCursor);
		// Cursor needs to be explicitly disposed
		toolbar.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				if (!handCursor.isDisposed()) {
					handCursor.dispose();
				}
			}
		});

		AddAction addAction = new AddAction();
		addAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
			.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		addAction.setToolTipText("Add Entry");
		addActionItem = new ActionContributionItem(addAction);
		toolBarManager.add(addActionItem);
		toolBarManager.update(true);
		section.setTextClient(toolbar);
	}

	/**
   * 
   */
	private EMFDataBindingContext getDataBindingContext() {
		return new EMFDataBindingContext();
	}

	private void isFull() {
		boolean full = controlHelpers.size() >= upperBound && upperBound != -1;
		addActionItem.getAction().setEnabled(!full);
	}

	/**
	 * @return
	 */
	protected abstract ECPAttributeWidget getAttributeWidget(EMFDataBindingContext dbc);

	/**
	 * {@inheritDoc}
	 **/
	public void handleValidation(Diagnostic diagnostic) {
		for (int i = 0; i < controlHelpers.size(); i++) {
			controlHelpers.get(i).handleValidation(diagnostic);
		}
	}

	/**
	 * {@inheritDoc}
	 **/
	public void resetValidation() {
		for (int i = 0; i < controlHelpers.size(); i++) {
			controlHelpers.get(i).resetValidation();
		}
	}

	protected abstract Object getDefaultValue();

	private class AddAction extends Action {

		@Override
		public void run() {
			AddCommand.create(getContext().getEditingDomain(), getModelElement(), getStructuralFeature(),
				getDefaultValue(), controlHelpers.size()).execute();
			super.run();
		}
	}

	private class AttributeControlHelper {
		private final ECPObservableValue modelValue;

		private Label labelWidgetImage; // Label for diagnostic image

		private ControlDecoration controlDecoration;

		private Composite composite;

		public AttributeControlHelper(ECPObservableValue modelValue) {
			this.modelValue = modelValue;
		}

		private AttributeControlHelper getThis() {
			return this;
		}

		void createControl(Composite parent, int style) {
			composite = getToolkit().createComposite(parent, style);
			composite.setBackgroundMode(SWT.INHERIT_FORCE);
			GridLayoutFactory.fillDefaults().numColumns(5).spacing(2, 0).applyTo(composite);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(composite);

			labelWidgetImage = getToolkit().createLabel(composite, "    ");
			labelWidgetImage.setBackground(parent.getBackground());

			ECPAttributeWidget widget = getAttributeWidget(getDataBindingContext());
			Control control = widget.createWidget(getToolkit(), composite, style);
			widget.setEditable(isEditable());

			createDeleteButton(composite);
			createUpDownButtons(composite);
			controlDecoration = new ControlDecoration(control, SWT.RIGHT | SWT.TOP);
			controlDecoration.setDescriptionText("Invalid input");
			controlDecoration.setShowHover(true);
			FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault().getFieldDecoration(
				FieldDecorationRegistry.DEC_ERROR);
			controlDecoration.setImage(fieldDecoration.getImage());
			controlDecoration.hide();

			widget.bindValue(modelValue, controlDecoration);
		}

		void handleValidation(Diagnostic diagnostic) {
			if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING) {
				Image image = org.eclipse.emf.ecp.editor.Activator.getImageDescriptor("icons/validation_error.png")
					.createImage();
				labelWidgetImage.setImage(image);
				labelWidgetImage.setToolTipText(diagnostic.getMessage());
			}
		}

		void resetValidation() {
			labelWidgetImage.setImage(null);
			labelWidgetImage.setToolTipText("");
		}

		/**
		 * Initializes the delete button.
		 */
		private void createDeleteButton(Composite composite) {
			Button delB = new Button(composite, SWT.PUSH);
			delB.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_DELETE));
			delB.addSelectionListener(new SelectionAdapter() {

				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					controlHelpers.remove(getThis());
					RemoveCommand.create(getContext().getEditingDomain(), getModelElement(), getStructuralFeature(),
						modelValue.getValue()).execute();
					getThis().composite.dispose();
					refreshSection();
					updateIndicesAfterRemove(modelValue.getIndex());
				}

			});
		}

		/**
		 * Initializes the up/down buttons.
		 */
		private void createUpDownButtons(Composite composite) {
			Image up = Activator.getImageDescriptor("icons/arrow_up.png").createImage();
			Image down = Activator.getImageDescriptor("icons/arrow_down.png").createImage();

			Button upB = new Button(composite, SWT.PUSH);
			upB.setImage(up);
			upB.addSelectionListener(new SelectionAdapter() {
				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (getThis().getModelValue().getIndex() == 0) {
						return;
					}
					int currentIndex = getThis().getModelValue().getIndex();
					controlHelpers.get(currentIndex).composite.moveAbove(controlHelpers.get(currentIndex - 1).composite);
					controlHelpers.remove(currentIndex);
					MoveCommand.create(getContext().getEditingDomain(), getModelElement(), getStructuralFeature(),
						modelValue.getValue(), currentIndex - 1).execute();
					controlHelpers.add(--currentIndex, getThis());
					getThis().getModelValue().setIndex(currentIndex);
					shiftIndecesToRight(currentIndex);
					refreshSection();
				}
			});
			Button downB = new Button(composite, SWT.PUSH);
			downB.setImage(down);
			downB.addSelectionListener(new SelectionAdapter() {
				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (getThis().getModelValue().getIndex() + 1 == controlHelpers.size()) {
						return;
					}
					int currentIndex = getThis().getModelValue().getIndex();
					controlHelpers.get(currentIndex).composite.moveBelow(controlHelpers.get(currentIndex + 1).composite);
					controlHelpers.remove(currentIndex);
					MoveCommand.create(getContext().getEditingDomain(), getModelElement(), getStructuralFeature(),
						modelValue.getValue(), currentIndex + 1).execute();
					controlHelpers.add(++currentIndex, getThis());
					getThis().getModelValue().setIndex(currentIndex);
					shiftIndecesToLeft(currentIndex);
					refreshSection();
				}
			});
		}

		/**
		 * @return the modelValue
		 */
		ECPObservableValue getModelValue() {
			return modelValue;
		}

		public void dispose() {
			composite.dispose();
			controlDecoration.dispose();
			modelValue.dispose();
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		model.removeListChangeListener(changeListener);
		model.dispose();

		toolBarManager.remove(addActionItem);
		addActionItem.dispose();
		for (AttributeControlHelper helper : controlHelpers) {
			helper.dispose();
		}
		section.dispose();
		handCursor.dispose();

	}
}
