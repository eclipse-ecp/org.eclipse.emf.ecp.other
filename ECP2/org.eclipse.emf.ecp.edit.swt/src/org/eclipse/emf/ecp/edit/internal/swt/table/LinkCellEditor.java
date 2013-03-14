package org.eclipse.emf.ecp.edit.internal.swt.table;

import org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor;
import org.eclipse.emf.ecp.editor.util.ModelElementChangeListener;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.jface.databinding.swt.WidgetValueProperty;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;

import java.text.MessageFormat;

public class LinkCellEditor extends CellEditor implements ECPCellEditor {

	private Link link;
	private AdapterFactoryItemDelegator adapterFactoryItemDelegator;
	private ComposedAdapterFactory composedAdapterFactory;
	private IItemPropertyDescriptor descriptor;
	private ModelElementChangeListener modelElementChangeListener;

	public LinkCellEditor() {
		// TODO Auto-generated constructor stub
	}

	public LinkCellEditor(Composite parent) {
		super(parent);
	}

	public LinkCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	public IValueProperty getValueProperty() {
		return new WidgetValueProperty() {

			public Object getValueType() {
				return String.class;
			}

			@Override
			protected Object doGetValue(Object source) {
				return LinkCellEditor.this.doGetValue();
			}

			@Override
			protected void doSetValue(Object source, Object value) {
				LinkCellEditor.this.doSetValue(value);
			}

			@Override
			public IObservableValue observe(Object source) {
				if (source instanceof LinkCellEditor) {
					return observe(link);
				}
				return super.observe(source);
			}
		};
	}

	public void instantiate(IItemPropertyDescriptor descriptor) {
		this.descriptor = descriptor;
	}

	@Override
	protected Control createControl(Composite parent) {
		composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(composedAdapterFactory);
		link = new Link(parent, SWT.NONE);
		link.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				super.widgetDefaultSelected(e);
				widgetSelected(e);
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
			}

		});
		return link;
	}

	@Override
	protected Object doGetValue() {
		return link.getText();
	}

	@Override
	public void dispose() {
		composedAdapterFactory.dispose();
		if (modelElementChangeListener != null) {
			modelElementChangeListener.remove();
		}
		super.dispose();
	}

	@Override
	protected void doSetFocus() {
		link.setFocus();
	}

	@Override
	protected void doSetValue(Object value) {
		String linkName = adapterFactoryItemDelegator.getText(value);
		link.setText("<a>" + linkName + "</a>");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.CellEditor#focusLost()
	 */
	@Override
	protected void focusLost() {
		if (isActivated()) {
			applyEditorValueAndDeactivate();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.viewers.CellEditor#keyReleaseOccured(org.eclipse.swt.events.KeyEvent)
	 */
	@Override
	protected void keyReleaseOccured(KeyEvent keyEvent) {
		super.keyReleaseOccured(keyEvent);
		if (keyEvent.character == '\u001b') { // Escape character
			fireCancelEditor();
		} else if (keyEvent.character == '\t') { // tab key
			applyEditorValueAndDeactivate();
		}
	}

	/**
	 * Applies the currently selected value and deactiavates the cell editor
	 */
	void applyEditorValueAndDeactivate() {
		// must set the selection before getting value

		Object newValue = doGetValue();
		markDirty();
		boolean isValid = isCorrect(newValue);
		setValueValid(isValid);

		if (!isValid) {
			MessageFormat.format(getErrorMessage(), new Object[] { newValue });
		}

		fireApplyEditorValue();
		deactivate();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor#getFormatedString(java.lang.Object)
	 */
	public String getFormatedString(Object value) {
		return adapterFactoryItemDelegator.getText(value);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.ECPCellEditor#getColumnWidthWeight()
	 */
	public int getColumnWidthWeight() {
		return 100;
	}
}
