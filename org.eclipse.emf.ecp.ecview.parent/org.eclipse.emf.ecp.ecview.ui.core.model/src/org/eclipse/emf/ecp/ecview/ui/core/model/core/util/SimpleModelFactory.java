package org.eclipse.emf.ecp.ecview.ui.core.model.core.util;

import org.eclipse.emf.ecp.ecview.ui.core.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YView;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YList;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayoutCellStyle;

public class SimpleModelFactory {

	/**
	 * Creates an instance of {@link YGridLayout}
	 * 
	 * @return
	 */
	public YGridLayout createGridLayout() {
		return ExtensionModelFactory.eINSTANCE.createYGridLayout();
	}

	/**
	 * Creates an instance of {@link YGridLayoutCellStyle}
	 * 
	 * @return
	 */
	public YGridLayoutCellStyle createGridLayoutCellStyle() {
		return ExtensionModelFactory.eINSTANCE.createYGridLayoutCellStyle();
	}

	/**
	 * Creates an instance of {@link YGridLayoutCellStyle}.
	 * 
	 * @param yComponent
	 *            set as target
	 * @param yLayout
	 *            style added to this layout
	 * @return
	 */
	public YGridLayoutCellStyle createGridLayoutCellStyle(
			YEmbeddable yComponent, YGridLayout yLayout) {
		YGridLayoutCellStyle yStyle = ExtensionModelFactory.eINSTANCE
				.createYGridLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Creates an instance of {@link YHorizontalLayout}
	 * 
	 * @return
	 */
	public YHorizontalLayout createHorizontalLayout() {
		return ExtensionModelFactory.eINSTANCE.createYHorizontalLayout();
	}

	/**
	 * Creates an instance of {@link YHorizontalLayoutCellStyle}
	 * 
	 * @return
	 */
	public YHorizontalLayoutCellStyle createHorizontalLayoutCellStyle() {
		return ExtensionModelFactory.eINSTANCE
				.createYHorizontalLayoutCellStyle();
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
	 * Creates an instance of {@link YVerticalLayout}
	 * 
	 * @return
	 */
	public YVerticalLayout createVerticalLayout() {
		return ExtensionModelFactory.eINSTANCE.createYVerticalLayout();
	}

	/**
	 * Creates an instance of {@link YVerticalLayoutCellStyle}
	 * 
	 * @return
	 */
	public YVerticalLayoutCellStyle createVerticalLayoutCellStyle() {
		return ExtensionModelFactory.eINSTANCE
				.createYVerticalLayoutCellStyle();
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
	 * Creates an instance of {@link YSpanInfo}
	 * 
	 * @return
	 */
	public YSpanInfo createSpanInfo() {
		return ExtensionModelFactory.eINSTANCE.createYSpanInfo();
	}

	/**
	 * Creates an instance of {@link YSpanInfo}
	 * 
	 * @param yStyle
	 *            The style where the span info should be added to
	 * @param col1
	 *            From / To column
	 * @param row1
	 *            From / To row
	 * 
	 * @return
	 */
	public YSpanInfo createSpanInfo(YGridLayoutCellStyle yStyle, int col1,
			int row1) {
		return createSpanInfo(yStyle, col1, row1, col1, row1);
	}

	/**
	 * Creates an instance of {@link YSpanInfo}
	 * 
	 * @param yStyle
	 *            The style where the span info should be added to
	 * @param col1
	 *            From column
	 * @param row1
	 *            From row
	 * @param col2
	 *            To column
	 * @param row2
	 *            To row
	 * 
	 * @return
	 */
	public YSpanInfo createSpanInfo(YGridLayoutCellStyle yStyle, int col1,
			int row1, int col2, int row2) {
		YSpanInfo yInfo = createSpanInfo();
		yStyle.setSpanInfo(yInfo);

		yInfo.setColumnFrom(col1);
		yInfo.setRowFrom(row1);
		yInfo.setColumnTo(col2);
		yInfo.setRowTo(row2);

		return yInfo;
	}

	/**
	 * Creates an instance of {@link YTextField}
	 * 
	 * @return
	 */
	public YTextField createTextField() {
		return ExtensionModelFactory.eINSTANCE.createYTextField();
	}

	/**
	 * Creates an instance of {@link YTextArea}
	 * 
	 * @return
	 */
	public YTextArea createTextArea() {
		return ExtensionModelFactory.eINSTANCE.createYTextArea();
	}

	/**
	 * Creates an instance of {@link YLabel}
	 * 
	 * @return
	 */
	public YLabel createLabel() {
		return ExtensionModelFactory.eINSTANCE.createYLabel();
	}

	/**
	 * Creates an instance of {@link YCheckBox}
	 * 
	 * @return
	 */
	public YCheckBox createCheckBox() {
		return ExtensionModelFactory.eINSTANCE.createYCheckBox();
	}

	/**
	 * Creates an instance of {@link YComboBox}
	 * 
	 * @return
	 */
	public YComboBox createComboBox() {
		return ExtensionModelFactory.eINSTANCE.createYComboBox();
	}

	/**
	 * Creates an instance of {@link YList}
	 * 
	 * @return
	 */
	public YList createList() {
		return ExtensionModelFactory.eINSTANCE.createYList();
	}

	/**
	 * Creates an instance of {@link YTable}
	 * 
	 * @return
	 */
	public YTable createTable() {
		return ExtensionModelFactory.eINSTANCE.createYTable();
	}

	/**
	 * Creates an instance of {@link YView}
	 * 
	 * @return
	 */
	public YView createView() {
		return CoreModelFactory.eINSTANCE.createYView();
	}

	/**
	 * Creates an instance of {@link YViewSet}
	 * 
	 * @return
	 */
	public YViewSet createViewSet() {
		return CoreModelFactory.eINSTANCE.createYViewSet();
	}

	/**
	 * Creates an instance of {@link YDatadescription}
	 * 
	 * @return
	 */
	public YDatadescription createDatadescription() {
		return DatatypesFactory.eINSTANCE.createYDatadescription();
	}

}
