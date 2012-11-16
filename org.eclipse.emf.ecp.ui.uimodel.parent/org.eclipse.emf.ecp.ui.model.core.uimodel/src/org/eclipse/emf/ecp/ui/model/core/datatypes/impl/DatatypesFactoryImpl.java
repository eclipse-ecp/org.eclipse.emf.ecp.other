/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ui.model.core.datatypes.*;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype;

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
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/emfclient/uimodel/datatypes"); 
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
