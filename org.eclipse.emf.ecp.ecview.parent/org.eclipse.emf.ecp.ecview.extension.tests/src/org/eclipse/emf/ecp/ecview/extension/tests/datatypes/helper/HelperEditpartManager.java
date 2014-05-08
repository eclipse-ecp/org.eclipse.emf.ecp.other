package org.eclipse.emf.ecp.ecview.extension.tests.datatypes.helper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.TextAreaEditpart;
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
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.datatypes.TreeDatatypeEditpart;
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

/**
 * Hooks up the helper editparts to test internal behaviour.
 */
@SuppressWarnings("restriction")
public class HelperEditpartManager extends EditpartManager {

	@SuppressWarnings({ "unchecked" })
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(IBrowserDatatypeEditpart.class)) {
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
			result = createNewInstance(HelperTextDatatypeEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ITreeDatatypeEditpart.class)) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else {
			return super.createNewInstance(editPartClazz);
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
		if (yElement instanceof YBrowserDatatype) {
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
			result = createNewInstance(HelperTextDatatypeEditpart.class);
		} else if (yElement instanceof YTreeDatatype) {
			result = createNewInstance(TreeDatatypeEditpart.class);
		} else {
			return super.createEditpart(yElement);
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
