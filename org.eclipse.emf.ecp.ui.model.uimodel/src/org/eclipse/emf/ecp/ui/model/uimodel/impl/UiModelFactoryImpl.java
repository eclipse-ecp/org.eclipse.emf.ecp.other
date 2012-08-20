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
package org.eclipse.emf.ecp.ui.model.uimodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ui.model.uimodel.*;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiViewSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelFactoryImpl extends EFactoryImpl implements UiModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiModelFactory init() {
		try {
			UiModelFactory theUiModelFactory = (UiModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/emfclient/uimodel"); 
			if (theUiModelFactory != null) {
				return theUiModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelFactoryImpl() {
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
			case UiModelPackage.YUI_LAYOUT: return createYUiLayout();
			case UiModelPackage.YUI_FIELD: return createYUiField();
			case UiModelPackage.YUI_VIEW: return createYUiView();
			case UiModelPackage.YUI_VIEW_SET: return createYUiViewSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiLayout createYUiLayout() {
		YUiLayoutImpl yUiLayout = new YUiLayoutImpl();
		return yUiLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiField createYUiField() {
		YUiFieldImpl yUiField = new YUiFieldImpl();
		return yUiField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiView createYUiView() {
		YUiViewImpl yUiView = new YUiViewImpl();
		return yUiView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiViewSet createYUiViewSet() {
		YUiViewSetImpl yUiViewSet = new YUiViewSetImpl();
		return yUiViewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelPackage getUiModelPackage() {
		return (UiModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiModelPackage getPackage() {
		return UiModelPackage.eINSTANCE;
	}

} //UiModelFactoryImpl
