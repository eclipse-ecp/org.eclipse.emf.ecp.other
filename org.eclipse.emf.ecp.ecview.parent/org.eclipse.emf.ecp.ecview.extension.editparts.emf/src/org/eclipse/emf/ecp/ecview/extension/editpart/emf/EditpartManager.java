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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.BrowserDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.CheckBoxDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.ComboBoxDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.DateTimeDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.DecimalDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.ListDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.NumericDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.OptionsGroupDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.ProgressBarDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.TabSheetDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.TableDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.TextDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.TreeDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YOptionsGroupDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTabSheetDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YMasterDetail;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YOptionsGroup;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IBrowserEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IButtonEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ICheckboxEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDateTimeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IListEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IMasterDetailEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.INumericFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IOptionsGroupEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IProgressBarEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabSheetEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITableEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextAreaEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITreeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IBrowserDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ICheckBoxDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IComboBoxDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IDateTimeDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IDecimalDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IListDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.INumericDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IOptionsGroupDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.IProgressBarDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITabSheetDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITableDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITextAreaDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITextDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.datatypes.ITreeDatatypeEditpart;
import org.osgi.service.component.ComponentContext;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
@SuppressWarnings("restriction")
public class EditpartManager extends AbstractEditpartManager {

	protected void activate(ComponentContext context) {

	}

	protected void deactivate(ComponentContext context) {

	}

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(ExtensionModelPackage.eNS_URI)
					|| uriString.equals(ExtDatatypesPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(ExtensionModelPackage.eNS_URI)
					|| element.equals(ExtDatatypesPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(ITextFieldEditpart.class)) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IGridLayoutEditpart.class)) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IListEditpart.class)) {
			result = createNewInstance(ListEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITableEditpart.class)) {
			result = createNewInstance(TableEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITreeEditpart.class)) {
			result = createNewInstance(TreeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IOptionsGroupEditpart.class)) {
			result = createNewInstance(OptionsGroupEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ILabelEditpart.class)) {
			result = createNewInstance(LabelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITextAreaEditpart.class)) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IButtonEditpart.class)) {
			result = createNewInstance(ButtonEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ICheckboxEditpart.class)) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (editPartClazz.isAssignableFrom(INumericFieldEditpart.class)) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IDecimalFieldEditpart.class)) {
			result = createNewInstance(DecimalFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IBrowserEditpart.class)) {
			result = createNewInstance(BrowserEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IDateTimeEditpart.class)) {
			result = createNewInstance(DateTimeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IProgressBarEditpart.class)) {
			result = createNewInstance(ProgressBarEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITabSheetEditpart.class)) {
			result = createNewInstance(TabSheetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITabEditpart.class)) {
			result = createNewInstance(TabEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IBrowserDatatypeEditpart.class)) {
			result = createNewInstance(BrowserDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ICheckBoxDatatypeEditpart.class)) {
			result = createNewInstance(CheckBoxDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IComboBoxDatatypeEditpart.class)) {
			result = createNewInstance(ComboBoxDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDateTimeDatatypeEditpart.class)) {
			result = createNewInstance(DateTimeDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IDecimalDatatypeEditpart.class)) {
			result = createNewInstance(DecimalDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IListDatatypeEditpart.class)) {
			result = createNewInstance(ListDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(INumericDatatypeEditpart.class)) {
			result = createNewInstance(NumericDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IOptionsGroupDatatypeEditpart.class)) {
			result = createNewInstance(OptionsGroupDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IProgressBarDatatypeEditpart.class)) {
			result = createNewInstance(ProgressBarDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITableDatatypeEditpart.class)) {
			result = createNewInstance(TableDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ITabSheetDatatypeEditpart.class)) {
			result = createNewInstance(TabSheetDatatypeEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(ITextAreaDatatypeEditpart.class)) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITextDatatypeEditpart.class)) {
			result = createNewInstance(TextDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITreeDatatypeEditpart.class)) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IMasterDetailEditpart.class)) {
			result = createNewInstance(MasterDetailEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof YTextField) {
			result = createNewInstance(TextFieldEditpart.class);
		} else if (yElement instanceof YGridLayout) {
			result = createNewInstance(GridLayoutEditpart.class);
		} else if (yElement instanceof YHorizontalLayout) {
			result = createNewInstance(HorizontalLayoutEditpart.class);
		} else if (yElement instanceof YVerticalLayout) {
			result = createNewInstance(VerticalLayoutEditpart.class);
		} else if (yElement instanceof YTable) {
			result = createNewInstance(TableEditpart.class);
		} else if (yElement instanceof YTree) {
			result = createNewInstance(TreeEditpart.class);
		} else if (yElement instanceof YLabel) {
			result = createNewInstance(LabelEditpart.class);
		} else if (yElement instanceof YTextArea) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (yElement instanceof YButton) {
			result = createNewInstance(ButtonEditpart.class);
		} else if (yElement instanceof YCheckBox) {
			result = createNewInstance(CheckBoxEditpart.class);
		} else if (yElement instanceof YComboBox) {
			result = createNewInstance(ComboBoxEditpart.class);
		} else if (yElement instanceof YList) {
			result = createNewInstance(ListEditpart.class);
		} else if (yElement instanceof YOptionsGroup) {
			result = createNewInstance(OptionsGroupEditpart.class);
		} else if (yElement instanceof YNumericField) {
			result = createNewInstance(NumericFieldEditpart.class);
		} else if (yElement instanceof YDecimalField) {
			result = createNewInstance(DecimalFieldEditpart.class);
		} else if (yElement instanceof YDateTime) {
			result = createNewInstance(DateTimeEditpart.class);
		} else if (yElement instanceof YBrowser) {
			result = createNewInstance(BrowserEditpart.class);
		} else if (yElement instanceof YProgressBar) {
			result = createNewInstance(ProgressBarEditpart.class);
		} else if (yElement instanceof YTabSheet) {
			result = createNewInstance(TabSheetEditpart.class);
		} else if (yElement instanceof YTab) {
			result = createNewInstance(TabEditpart.class);
		} else if (yElement instanceof YBrowserDatatype) {
			result = createNewInstance(BrowserDatatypeEditpart.class);
		} else if (yElement instanceof YCheckBoxDatatype) {
			result = createNewInstance(CheckBoxDatatypeEditpart.class);
		} else if (yElement instanceof YComboBoxDatatype) {
			result = createNewInstance(ComboBoxDatatypeEditpart.class);
		} else if (yElement instanceof YDateTimeDatatype) {
			result = createNewInstance(DateTimeDatatypeEditpart.class);
		} else if (yElement instanceof YDecimalDatatype) {
			result = createNewInstance(DecimalDatatypeEditpart.class);
		} else if (yElement instanceof YListDataType) {
			result = createNewInstance(ListDatatypeEditpart.class);
		} else if (yElement instanceof YNumericDatatype) {
			result = createNewInstance(NumericDatatypeEditpart.class);
		} else if (yElement instanceof YOptionsGroupDataType) {
			result = createNewInstance(OptionsGroupDatatypeEditpart.class);
		} else if (yElement instanceof YProgressBarDatatype) {
			result = createNewInstance(ProgressBarDatatypeEditpart.class);
		} else if (yElement instanceof YTableDatatype) {
			result = createNewInstance(TableDatatypeEditpart.class);
		} else if (yElement instanceof YTabSheetDatatype) {
			result = createNewInstance(TabSheetDatatypeEditpart.class);
		} else if (yElement instanceof YTextAreaDatatype) {
			result = createNewInstance(TextAreaEditpart.class);
		} else if (yElement instanceof YTextDatatype) {
			result = createNewInstance(TextDatatypeEditpart.class);
		} else if (yElement instanceof YTreeDatatype) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else if (yElement instanceof YMasterDetail) {
			result = createNewInstance(MasterDetailEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the editpart for which an instance should be
	 *            created.
	 * @return editPart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}
}
