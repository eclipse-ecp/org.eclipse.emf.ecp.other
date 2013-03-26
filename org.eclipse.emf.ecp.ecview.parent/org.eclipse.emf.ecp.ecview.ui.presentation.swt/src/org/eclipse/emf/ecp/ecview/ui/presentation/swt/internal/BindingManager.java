/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ISWTBindingManager;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding.BoolNegator;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding.EMFNullToBoolConverter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding.EMFNullToIntConverter;
import org.eclipse.riena.ui.ridgets.IDecimalTextRidget;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;
import org.eclipse.riena.ui.ridgets.IRidget;

/**
 * Is used to bind values.
 */
public class BindingManager extends
		org.eclipse.emf.ecp.ecview.common.binding.AbstractBindingManager
		implements ISWTBindingManager {

	private final ExtensionModelPackage pckg = ExtensionModelPackage.eINSTANCE;
	private final ExtDatatypesPackage extDtPckg = ExtDatatypesPackage.eINSTANCE;

	public BindingManager(Realm validationRealm) {
		super(validationRealm);
	}

	/**
	 * Casts element to EObject.
	 * 
	 * @param element
	 * @return
	 */
	protected EObject castEObject(Object element) {
		return (EObject) element;
	}

	@Override
	protected DataBindingContext createDatabindingContext(Realm validationRealm) {
		return new EMFDataBindingContext(validationRealm);
	}

	@Override
	public void bindVisible(YVisibleable yVisibleAble, IRidget ridget) {
		// TODO: JCD -- IRidget.PROPERTY_SHOWING not working. Therefore send bug
		// to Riena.
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"visible");
		IObservableValue modelObservable = EMFObservables.observeValue(
				castEObject(yVisibleAble),
				CoreModelPackage.eINSTANCE.getYVisibleable_Visible());
		getDatabindingContext().bindValue(uiObservable, modelObservable);
	}

	@Override
	public void bindEnabled(YEnable yEnable, IRidget ridget) {
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				IRidget.PROPERTY_ENABLED);
		IObservableValue modelObservable = EMFObservables.observeValue(
				castEObject(yEnable),
				CoreModelPackage.eINSTANCE.getYEnable_Enabled());
		getDatabindingContext().bindValue(uiObservable, modelObservable);
	}

	@Override
	public void bindReadonly(YEditable yEditable, IMarkableRidget ridget) {
		// TODO: JCD -- IRidget.PROPERTY_OUTPUT_ONLY not working. Therefore send
		// bug to Riena.
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"outputOnly");
		IObservableValue modelObservable = EMFObservables.observeValue(
				castEObject(yEditable),
				CoreModelPackage.eINSTANCE.getYEditable_Editable());
		getDatabindingContext().bindValue(
				uiObservable,
				modelObservable,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new BoolNegator()),
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new BoolNegator()));
	}

	@Override
	public void bindGrouping(YNumericField yNumericField,
			INumericTextRidget ridget) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yNumericField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYNumericField_Datatype(),
						extDtPckg.getYNumericDatatype_Grouping() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"grouping");
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__GROUPING,
										DEFAULT_GROUPING)));
	}

	@Override
	public void bindMarkNegative(YNumericField yNumericField,
			INumericTextRidget ridget) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yNumericField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYNumericField_Datatype(),
						extDtPckg.getYNumericDatatype_MarkNegative() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"markNegative");
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__MARK_NEGATIVE,
										DEFAULT_MARK_NEGATIVE)));
	}

	@Override
	public void bindGrouping(YDecimalField yField, IDecimalTextRidget ridget) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYNumericField_Datatype(),
						extDtPckg.getYNumericDatatype_Grouping() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"grouping");
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__GROUPING,
										DEFAULT_GROUPING)));
	}

	@Override
	public void bindMarkNegative(YDecimalField yField, IDecimalTextRidget ridget) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYNumericField_Datatype(),
						extDtPckg.getYNumericDatatype_MarkNegative() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				"markNegative");
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__MARK_NEGATIVE,
										DEFAULT_MARK_NEGATIVE)));
	}

	@Override
	public void bindPrecision(YDecimalField yDecimalField,
			IDecimalTextRidget ridget) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yDecimalField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYDecimalField_Datatype(),
						extDtPckg.getYDecimalDatatype_Precision() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				IDecimalTextRidget.PROPERTY_PRECISION);
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToIntConverter(
										ExtDatatypesPackage.Literals.YDECIMAL_DATATYPE__PRECISION,
										DEFAULT_PRECISION)));
	}

	@Override
	public void bindPrecision(YDecimalField yField,
			DecimalFieldPresentation decimalFieldPresentation) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						pckg.getYDecimalField_Datatype(),
						extDtPckg.getYDecimalDatatype_Precision() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = PojoObservables.observeValue(
				decimalFieldPresentation, "precision");
		getDatabindingContext()
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToIntConverter(
										ExtDatatypesPackage.Literals.YDECIMAL_DATATYPE__PRECISION,
										DEFAULT_PRECISION)));
	}

}
