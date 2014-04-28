/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecp.ecview.common.model.core.*;

import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelFactoryImpl extends EFactoryImpl implements CoreModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreModelFactory init() {
		try {
			CoreModelFactory theCoreModelFactory = (CoreModelFactory)EPackage.Registry.INSTANCE.getEFactory(CoreModelPackage.eNS_URI);
			if (theCoreModelFactory != null) {
				return theCoreModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelFactoryImpl() {
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
			case CoreModelPackage.YLAYOUT: return createYLayout();
			case CoreModelPackage.YFIELD: return createYField();
			case CoreModelPackage.YVIEW: return createYView();
			case CoreModelPackage.YVIEW_SET: return createYViewSet();
			case CoreModelPackage.YACTION: return createYAction();
			case CoreModelPackage.YCONTEXT_BINDING_ENDPOINT: return createYContextBindingEndpoint();
			case CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT: return createYEmbeddableValueEndpoint();
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT: return createYEmbeddableSelectionEndpoint();
			case CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT: return createYEmbeddableMultiSelectionEndpoint();
			case CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT: return createYEmbeddableCollectionEndpoint();
			case CoreModelPackage.YACTIVATED_ENDPOINT: return createYActivatedEndpoint();
			case CoreModelPackage.YDT_WRAPPER: return createYDtWrapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoreModelPackage.YUNIT:
				return createYUnitFromString(eDataType, initialValue);
			case CoreModelPackage.YURI:
				return createYURIFromString(eDataType, initialValue);
			case CoreModelPackage.YVALUE_CHANGE_LISTENER:
				return createYValueChangeListenerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoreModelPackage.YUNIT:
				return convertYUnitToString(eDataType, instanceValue);
			case CoreModelPackage.YURI:
				return convertYURIToString(eDataType, instanceValue);
			case CoreModelPackage.YVALUE_CHANGE_LISTENER:
				return convertYValueChangeListenerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLayout createYLayout() {
		YLayoutImpl yLayout = new YLayoutImpl();
		return yLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YField createYField() {
		YFieldImpl yField = new YFieldImpl();
		return yField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YView createYView() {
		YViewImpl yView = new YViewImpl();
		return yView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YViewSet createYViewSet() {
		YViewSetImpl yViewSet = new YViewSetImpl();
		return yViewSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAction createYAction() {
		YActionImpl yAction = new YActionImpl();
		return yAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YContextBindingEndpoint createYContextBindingEndpoint() {
		YContextBindingEndpointImpl yContextBindingEndpoint = new YContextBindingEndpointImpl();
		return yContextBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint createYEmbeddableValueEndpoint() {
		YEmbeddableValueEndpointImpl yEmbeddableValueEndpoint = new YEmbeddableValueEndpointImpl();
		return yEmbeddableValueEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableSelectionEndpoint createYEmbeddableSelectionEndpoint() {
		YEmbeddableSelectionEndpointImpl yEmbeddableSelectionEndpoint = new YEmbeddableSelectionEndpointImpl();
		return yEmbeddableSelectionEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableMultiSelectionEndpoint createYEmbeddableMultiSelectionEndpoint() {
		YEmbeddableMultiSelectionEndpointImpl yEmbeddableMultiSelectionEndpoint = new YEmbeddableMultiSelectionEndpointImpl();
		return yEmbeddableMultiSelectionEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableCollectionEndpoint createYEmbeddableCollectionEndpoint() {
		YEmbeddableCollectionEndpointImpl yEmbeddableCollectionEndpoint = new YEmbeddableCollectionEndpointImpl();
		return yEmbeddableCollectionEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YActivatedEndpoint createYActivatedEndpoint() {
		YActivatedEndpointImpl yActivatedEndpoint = new YActivatedEndpointImpl();
		return yActivatedEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDtWrapper createYDtWrapper() {
		YDtWrapperImpl yDtWrapper = new YDtWrapperImpl();
		return yDtWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUnit createYUnitFromString(EDataType eDataType, String initialValue) {
		YUnit result = YUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createYURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueChangeListener createYValueChangeListenerFromString(EDataType eDataType, String initialValue) {
		return (YValueChangeListener)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYValueChangeListenerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelPackage getCoreModelPackage() {
		return (CoreModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoreModelPackage getPackage() {
		return CoreModelPackage.eINSTANCE;
	}

} //CoreModelFactoryImpl
