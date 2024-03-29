package org.eclipse.emf.ecp.edit.internal.swt.table;

import org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.CellEditorProperties;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import java.math.BigDecimal;

public class NumberCellEditor extends TextCellEditor implements ECPCellEditor {

	public NumberCellEditor(Composite parent) {
		super(parent, SWT.RIGHT);
	}

	public NumberCellEditor(Composite parent, int style) {
		super(parent, style | SWT.RIGHT);
	}

	public IValueProperty getValueProperty() {
		return CellEditorProperties.control().value(WidgetProperties.text(SWT.FocusOut));
	}

	public void instantiate(IItemPropertyDescriptor descriptor) {
		getControl().setData(CUSTOM_VARIANT, "org_eclipse_emf_ecp_edit_swt_cellEditor_number");
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor#getFormatedString(java.lang.Object)
	 */
	public String getFormatedString(Object value) {
		if (value == null) {
			setErrorMessage("Value is null");
			return "";
		}

		if (BigDecimal.class.isInstance(value)) {
			BigDecimal bigDecimal = (BigDecimal) value;
			bigDecimal.toPlainString();
		}
		return ((Number) value).toString();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor#getColumnWidthWeight()
	 */
	public int getColumnWidthWeight() {
		return 50;
	}

}
