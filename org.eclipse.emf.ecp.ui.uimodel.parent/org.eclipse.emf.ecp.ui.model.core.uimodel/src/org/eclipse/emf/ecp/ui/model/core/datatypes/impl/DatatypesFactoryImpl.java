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
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType;

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
			case DatatypesPackage.YTEXT_DTYPE: return createYTextDType();
			case DatatypesPackage.YDT_DATADESCRIPTION: return createYDtDatadescription();
			case DatatypesPackage.YTEXT_DDESC: return createYTextDDesc();
			case DatatypesPackage.YLABEL_DDESC: return createYLabelDDesc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDType createYTextDType() {
		YTextDTypeImpl yTextDType = new YTextDTypeImpl();
		return yTextDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDtDatadescription createYDtDatadescription() {
		YDtDatadescriptionImpl yDtDatadescription = new YDtDatadescriptionImpl();
		return yDtDatadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDDesc createYTextDDesc() {
		YTextDDescImpl yTextDDesc = new YTextDDescImpl();
		return yTextDDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLabelDDesc createYLabelDDesc() {
		YLabelDDescImpl yLabelDDesc = new YLabelDDescImpl();
		return yLabelDDesc;
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
