/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.*;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/ecp/ecview/datatypes"); 
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.YTEXT_DATATYPE: return createYTextDatatype();
			case DatatypesPackage.YDATADESCRIPTION: return createYDatadescription();
			case DatatypesPackage.YTEXT_AREA_DATATYPE: return createYTextAreaDatatype();
			case DatatypesPackage.YNUMERIC_DATATYPE: return createYNumericDatatype();
			case DatatypesPackage.YDECIMAL_DATATYPE: return createYDecimalDatatype();
			case DatatypesPackage.YTABLE_DATATYPE: return createYTableDatatype();
			case DatatypesPackage.YCHECK_BOX_DATATYPE: return createYCheckBoxDatatype();
			case DatatypesPackage.YCOMBO_BOX_DATATYPE: return createYComboBoxDatatype();
			case DatatypesPackage.YLIST_DATA_TYPE: return createYListDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDatatype createYTextDatatype() {
		YTextDatatypeImpl yTextDatatype = new YTextDatatypeImpl();
		return yTextDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription createYDatadescription() {
		YDatadescriptionImpl yDatadescription = new YDatadescriptionImpl();
		return yDatadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextAreaDatatype createYTextAreaDatatype() {
		YTextAreaDatatypeImpl yTextAreaDatatype = new YTextAreaDatatypeImpl();
		return yTextAreaDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericDatatype createYNumericDatatype() {
		YNumericDatatypeImpl yNumericDatatype = new YNumericDatatypeImpl();
		return yNumericDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalDatatype createYDecimalDatatype() {
		YDecimalDatatypeImpl yDecimalDatatype = new YDecimalDatatypeImpl();
		return yDecimalDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTableDatatype createYTableDatatype() {
		YTableDatatypeImpl yTableDatatype = new YTableDatatypeImpl();
		return yTableDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCheckBoxDatatype createYCheckBoxDatatype() {
		YCheckBoxDatatypeImpl yCheckBoxDatatype = new YCheckBoxDatatypeImpl();
		return yCheckBoxDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBoxDatatype createYComboBoxDatatype() {
		YComboBoxDatatypeImpl yComboBoxDatatype = new YComboBoxDatatypeImpl();
		return yComboBoxDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YListDataType createYListDataType() {
		YListDataTypeImpl yListDataType = new YListDataTypeImpl();
		return yListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} //DatatypesFactoryImpl
