package org.eclipse.emf.ecp.ecview.extension.model.extension.util;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.util.SimpleCoreModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YMasterDetail;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YOptionsGroup;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle;

public class SimpleExtensionModelFactory extends SimpleCoreModelFactory {

	private ExtensionModelFactory factory = ExtensionModelFactory.eINSTANCE;
	private ExtDatatypesFactory dtFactory = ExtDatatypesFactory.eINSTANCE;

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTextField()
	 */
	public YTextField createTextField() {
		return factory.createYTextField();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYProgressBar()
	 */
	public YProgressBar createProgressBar() {
		return factory.createYProgressBar();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYGridLayout()
	 */
	public YGridLayout createGridLayout() {
		return factory.createYGridLayout();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYGridLayoutCellStyle()
	 */
	public YGridLayoutCellStyle createGridLayoutCellStyle() {
		return factory.createYGridLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYHorizontalLayout()
	 */
	public YHorizontalLayout createHorizontalLayout() {
		return factory.createYHorizontalLayout();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYHorizontalLayoutCellStyle()
	 */
	public YHorizontalLayoutCellStyle createHorizontalLayoutCellStyle() {
		return factory.createYHorizontalLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYVerticalLayout()
	 */
	public YVerticalLayout createVerticalLayout() {
		return factory.createYVerticalLayout();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYVerticalLayoutCellStyle()
	 */
	public YVerticalLayoutCellStyle createVerticalLayoutCellStyle() {
		return factory.createYVerticalLayoutCellStyle();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYSpanInfo()
	 */
	public YSpanInfo createSpanInfo() {
		return factory.createYSpanInfo();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTable createTable() {
		return factory.createYTable();
	}
	
	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTabSheet createTabSheet() {
		return factory.createYTabSheet();
	}
	
	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTable()
	 */
	public YTab createTab() {
		return factory.createYTab();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTree()
	 */
	public YTree createTree() {
		return factory.createYTree();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYLabel()
	 */
	public YLabel createLabel() {
		return factory.createYLabel();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYTextArea()
	 */
	public YTextArea createTextArea() {
		return factory.createYTextArea();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYBrowser()
	 */
	public YBrowser createBrowser() {
		return factory.createYBrowser();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYDateTime()
	 */
	public YDateTime createDateTime() {
		return factory.createYDateTime();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYCheckBox()
	 */
	public YCheckBox createCheckBox() {
		return factory.createYCheckBox();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYDecimalField()
	 */
	public YDecimalField createDecimalField() {
		return factory.createYDecimalField();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYNumericField()
	 */
	public YNumericField createNumericField() {
		return factory.createYNumericField();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYComboBox()
	 */
	public YComboBox createComboBox() {
		return factory.createYComboBox();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYList()
	 */
	public YList createList() {
		return factory.createYList();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYOptionsGroup()
	 */
	public YOptionsGroup createOptionsGroup() {
		return factory.createYOptionsGroup();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory#createYButton()
	 */
	public YButton createButton() {
		return factory.createYButton();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYTextDatatype()
	 */
	public YTextDatatype createTextDatatype() {
		return dtFactory.createYTextDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYProgressBarDatatype()
	 */
	public YProgressBarDatatype createProgressBarDatatype() {
		return dtFactory.createYProgressBarDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYTextAreaDatatype()
	 */
	public YTextAreaDatatype createTextAreaDatatype() {
		return dtFactory.createYTextAreaDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYNumericDatatype()
	 */
	public YNumericDatatype createNumericDatatype() {
		return dtFactory.createYNumericDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYDecimalDatatype()
	 */
	public YDecimalDatatype createDecimalDatatype() {
		return dtFactory.createYDecimalDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYTableDatatype()
	 */
	public YTableDatatype createTableDatatype() {
		return dtFactory.createYTableDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYTreeDatatype()
	 */
	public YTreeDatatype createTreeDatatype() {
		return dtFactory.createYTreeDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYCheckBoxDatatype()
	 */
	public YCheckBoxDatatype createCheckBoxDatatype() {
		return dtFactory.createYCheckBoxDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYComboBoxDatatype()
	 */
	public YComboBoxDatatype createComboBoxDatatype() {
		return dtFactory.createYComboBoxDatatype();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory#createYListDataType()
	 */
	public YListDataType createListDataType() {
		return dtFactory.createYListDataType();
	}

	/**
	 * Creates an instance of {@link YHorizontalLayoutCellStyle}.
	 * 
	 * @param yComponent
	 *            set as target
	 * @param yLayout
	 *            style added to this layout
	 * @return
	 */
	public YHorizontalLayoutCellStyle createHorizontalLayoutCellStyle(
			YEmbeddable yComponent, YHorizontalLayout yLayout) {
		YHorizontalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE
				.createYHorizontalLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Creates an instance of {@link YVerticalLayoutCellStyle}.
	 * 
	 * @param yComponent
	 *            set as target
	 * @param yLayout
	 *            style added to this layout
	 * @return
	 */
	public YVerticalLayoutCellStyle createVerticalLayoutCellStyle(
			YEmbeddable yComponent, YVerticalLayout yLayout) {
		YVerticalLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE
				.createYVerticalLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Returns a master detail element.
	 * @return
	 */
	public YMasterDetail createMasterDetail() {
		return ExtensionModelFactory.eINSTANCE.createYMasterDetail();
	}

}
