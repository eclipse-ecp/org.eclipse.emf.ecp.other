/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YActivateable;
import org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YDtWrapper;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YHeightable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YUnit;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.common.model.core.YWidthable;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelPackageImpl extends EPackageImpl implements CoreModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCssAbleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMarginableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySpacingableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHeightableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yWidthableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yActivateableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibleableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySelectionBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMultiSelectionBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCollectionBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yContextValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanSlotValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanSlotListBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableValueEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableSelectionEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableMultiSelectionEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableCollectionEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yActivatedEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDtWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityProcessableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yuriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yValueChangeListenerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoreModelPackageImpl() {
		super(eNS_URI, CoreModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CoreModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoreModelPackage init() {
		if (isInited) return (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Obtain or create and register package
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoreModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) : BindingPackage.eINSTANCE);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) : VisibilityPackage.eINSTANCE);

		// Create package meta-data objects
		theCoreModelPackage.createPackageContents();
		theBindingPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theVisibilityPackage.createPackageContents();

		// Initialize created meta-data
		theCoreModelPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theVisibilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoreModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoreModelPackage.eNS_URI, theCoreModelPackage);
		return theCoreModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElement() {
		return yElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYElement_Id() {
		return (EAttribute)yElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYElement_Name() {
		return (EAttribute)yElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLayout() {
		return yLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLayout_Elements() {
		return (EReference)yLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYField() {
		return yFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYField_Validators() {
		return (EReference)yFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYField_InternalValidators() {
		return (EReference)yFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYView() {
		return yViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_Root() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYView_ViewName() {
		return (EAttribute)yViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_Content() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_BindingSet() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_BeanSlots() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYViewSet() {
		return yViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYViewSet_Views() {
		return (EReference)yViewSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYViewSet_BeanSlots() {
		return (EReference)yViewSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanSlot() {
		return yBeanSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlot_Name() {
		return (EAttribute)yBeanSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlot_ValueType() {
		return (EAttribute)yBeanSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlot_ValueTypeQualifiedName() {
		return (EAttribute)yBeanSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddable() {
		return yEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddable_OrphanDatatypes() {
		return (EReference)yEmbeddableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddable_OrphanDatadescriptions() {
		return (EReference)yEmbeddableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCssAble() {
		return yCssAbleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCssAble_CssClass() {
		return (EAttribute)yCssAbleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCssAble_CssID() {
		return (EAttribute)yCssAbleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMarginable() {
		return yMarginableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMarginable_Margin() {
		return (EAttribute)yMarginableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSpacingable() {
		return ySpacingableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpacingable_Spacing() {
		return (EAttribute)ySpacingableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHeightable() {
		return yHeightableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHeightable_Height() {
		return (EAttribute)yHeightableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHeightable_HeightUnit() {
		return (EAttribute)yHeightableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYWidthable() {
		return yWidthableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYWidthable_Width() {
		return (EAttribute)yWidthableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYWidthable_WidthUnit() {
		return (EAttribute)yWidthableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYActivateable() {
		return yActivateableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYActivateable_InitialActivated() {
		return (EAttribute)yActivateableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYActivateable_Activated() {
		return (EAttribute)yActivateableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibleable() {
		return yVisibleableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibleable_InitialVisible() {
		return (EAttribute)yVisibleableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibleable_Visible() {
		return (EAttribute)yVisibleableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEditable() {
		return yEditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEditable_InitialEditable() {
		return (EAttribute)yEditableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEditable_Editable() {
		return (EAttribute)yEditableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnable() {
		return yEnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnable_InitialEnabled() {
		return (EAttribute)yEnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnable_Enabled() {
		return (EAttribute)yEnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAction() {
		return yActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBindable() {
		return yBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBindable() {
		return yValueBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYValueBindable_ValueBindingEndpoint() {
		return (EReference)yValueBindableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSelectionBindable() {
		return ySelectionBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYSelectionBindable_SelectionBindingEndpoint() {
		return (EReference)ySelectionBindableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMultiSelectionBindable() {
		return yMultiSelectionBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYMultiSelectionBindable_MultiSelectionBindingEndpoint() {
		return (EReference)yMultiSelectionBindableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCollectionBindable() {
		return yCollectionBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCollectionBindable_CollectionBindingEndpoint() {
		return (EReference)yCollectionBindableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYContextValueBindingEndpoint() {
		return yContextValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYContextValueBindingEndpoint_UrlString() {
		return (EAttribute)yContextValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanSlotValueBindingEndpoint() {
		return yBeanSlotValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlotValueBindingEndpoint_AttributePath() {
		return (EAttribute)yBeanSlotValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBeanSlotValueBindingEndpoint_BeanSlot() {
		return (EReference)yBeanSlotValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanSlotListBindingEndpoint() {
		return yBeanSlotListBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlotListBindingEndpoint_AttributePath() {
		return (EAttribute)yBeanSlotListBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBeanSlotListBindingEndpoint_BeanSlot() {
		return (EReference)yBeanSlotListBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlotListBindingEndpoint_CollectionType() {
		return (EAttribute)yBeanSlotListBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanSlotListBindingEndpoint_CollectionTypeQualifiedName() {
		return (EAttribute)yBeanSlotListBindingEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableBindingEndpoint() {
		return yEmbeddableBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableValueEndpoint() {
		return yEmbeddableValueEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddableValueEndpoint_Element() {
		return (EReference)yEmbeddableValueEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableSelectionEndpoint() {
		return yEmbeddableSelectionEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddableSelectionEndpoint_Element() {
		return (EReference)yEmbeddableSelectionEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEmbeddableSelectionEndpoint_AttributePath() {
		return (EAttribute)yEmbeddableSelectionEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableMultiSelectionEndpoint() {
		return yEmbeddableMultiSelectionEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddableMultiSelectionEndpoint_Element() {
		return (EReference)yEmbeddableMultiSelectionEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableCollectionEndpoint() {
		return yEmbeddableCollectionEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddableCollectionEndpoint_Element() {
		return (EReference)yEmbeddableCollectionEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYActivatedEndpoint() {
		return yActivatedEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYActivatedEndpoint_Element() {
		return (EReference)yActivatedEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDtWrapper() {
		return yDtWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProcessable() {
		return yVisibilityProcessableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProcessable_VisibilityProcessor() {
		return (EReference)yVisibilityProcessableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYUnit() {
		return yUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYURI() {
		return yuriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYValueChangeListener() {
		return yValueChangeListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelFactory getCoreModelFactory() {
		return (CoreModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yElementEClass = createEClass(YELEMENT);
		createEAttribute(yElementEClass, YELEMENT__ID);
		createEAttribute(yElementEClass, YELEMENT__NAME);

		yLayoutEClass = createEClass(YLAYOUT);
		createEReference(yLayoutEClass, YLAYOUT__ELEMENTS);

		yFieldEClass = createEClass(YFIELD);
		createEReference(yFieldEClass, YFIELD__VALIDATORS);
		createEReference(yFieldEClass, YFIELD__INTERNAL_VALIDATORS);

		yViewEClass = createEClass(YVIEW);
		createEReference(yViewEClass, YVIEW__ROOT);
		createEAttribute(yViewEClass, YVIEW__VIEW_NAME);
		createEReference(yViewEClass, YVIEW__CONTENT);
		createEReference(yViewEClass, YVIEW__BINDING_SET);
		createEReference(yViewEClass, YVIEW__BEAN_SLOTS);

		yViewSetEClass = createEClass(YVIEW_SET);
		createEReference(yViewSetEClass, YVIEW_SET__VIEWS);
		createEReference(yViewSetEClass, YVIEW_SET__BEAN_SLOTS);

		yBeanSlotEClass = createEClass(YBEAN_SLOT);
		createEAttribute(yBeanSlotEClass, YBEAN_SLOT__NAME);
		createEAttribute(yBeanSlotEClass, YBEAN_SLOT__VALUE_TYPE);
		createEAttribute(yBeanSlotEClass, YBEAN_SLOT__VALUE_TYPE_QUALIFIED_NAME);

		yEmbeddableEClass = createEClass(YEMBEDDABLE);
		createEReference(yEmbeddableEClass, YEMBEDDABLE__ORPHAN_DATATYPES);
		createEReference(yEmbeddableEClass, YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS);

		yCssAbleEClass = createEClass(YCSS_ABLE);
		createEAttribute(yCssAbleEClass, YCSS_ABLE__CSS_CLASS);
		createEAttribute(yCssAbleEClass, YCSS_ABLE__CSS_ID);

		yMarginableEClass = createEClass(YMARGINABLE);
		createEAttribute(yMarginableEClass, YMARGINABLE__MARGIN);

		ySpacingableEClass = createEClass(YSPACINGABLE);
		createEAttribute(ySpacingableEClass, YSPACINGABLE__SPACING);

		yHeightableEClass = createEClass(YHEIGHTABLE);
		createEAttribute(yHeightableEClass, YHEIGHTABLE__HEIGHT);
		createEAttribute(yHeightableEClass, YHEIGHTABLE__HEIGHT_UNIT);

		yWidthableEClass = createEClass(YWIDTHABLE);
		createEAttribute(yWidthableEClass, YWIDTHABLE__WIDTH);
		createEAttribute(yWidthableEClass, YWIDTHABLE__WIDTH_UNIT);

		yActivateableEClass = createEClass(YACTIVATEABLE);
		createEAttribute(yActivateableEClass, YACTIVATEABLE__INITIAL_ACTIVATED);
		createEAttribute(yActivateableEClass, YACTIVATEABLE__ACTIVATED);

		yVisibleableEClass = createEClass(YVISIBLEABLE);
		createEAttribute(yVisibleableEClass, YVISIBLEABLE__INITIAL_VISIBLE);
		createEAttribute(yVisibleableEClass, YVISIBLEABLE__VISIBLE);

		yEditableEClass = createEClass(YEDITABLE);
		createEAttribute(yEditableEClass, YEDITABLE__INITIAL_EDITABLE);
		createEAttribute(yEditableEClass, YEDITABLE__EDITABLE);

		yEnableEClass = createEClass(YENABLE);
		createEAttribute(yEnableEClass, YENABLE__INITIAL_ENABLED);
		createEAttribute(yEnableEClass, YENABLE__ENABLED);

		yActionEClass = createEClass(YACTION);

		yBindableEClass = createEClass(YBINDABLE);

		yValueBindableEClass = createEClass(YVALUE_BINDABLE);
		createEReference(yValueBindableEClass, YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT);

		ySelectionBindableEClass = createEClass(YSELECTION_BINDABLE);
		createEReference(ySelectionBindableEClass, YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT);

		yMultiSelectionBindableEClass = createEClass(YMULTI_SELECTION_BINDABLE);
		createEReference(yMultiSelectionBindableEClass, YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT);

		yCollectionBindableEClass = createEClass(YCOLLECTION_BINDABLE);
		createEReference(yCollectionBindableEClass, YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT);

		yContextValueBindingEndpointEClass = createEClass(YCONTEXT_VALUE_BINDING_ENDPOINT);
		createEAttribute(yContextValueBindingEndpointEClass, YCONTEXT_VALUE_BINDING_ENDPOINT__URL_STRING);

		yBeanSlotValueBindingEndpointEClass = createEClass(YBEAN_SLOT_VALUE_BINDING_ENDPOINT);
		createEAttribute(yBeanSlotValueBindingEndpointEClass, YBEAN_SLOT_VALUE_BINDING_ENDPOINT__ATTRIBUTE_PATH);
		createEReference(yBeanSlotValueBindingEndpointEClass, YBEAN_SLOT_VALUE_BINDING_ENDPOINT__BEAN_SLOT);

		yBeanSlotListBindingEndpointEClass = createEClass(YBEAN_SLOT_LIST_BINDING_ENDPOINT);
		createEAttribute(yBeanSlotListBindingEndpointEClass, YBEAN_SLOT_LIST_BINDING_ENDPOINT__ATTRIBUTE_PATH);
		createEReference(yBeanSlotListBindingEndpointEClass, YBEAN_SLOT_LIST_BINDING_ENDPOINT__BEAN_SLOT);
		createEAttribute(yBeanSlotListBindingEndpointEClass, YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE);
		createEAttribute(yBeanSlotListBindingEndpointEClass, YBEAN_SLOT_LIST_BINDING_ENDPOINT__COLLECTION_TYPE_QUALIFIED_NAME);

		yEmbeddableBindingEndpointEClass = createEClass(YEMBEDDABLE_BINDING_ENDPOINT);

		yEmbeddableValueEndpointEClass = createEClass(YEMBEDDABLE_VALUE_ENDPOINT);
		createEReference(yEmbeddableValueEndpointEClass, YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT);

		yEmbeddableSelectionEndpointEClass = createEClass(YEMBEDDABLE_SELECTION_ENDPOINT);
		createEReference(yEmbeddableSelectionEndpointEClass, YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT);
		createEAttribute(yEmbeddableSelectionEndpointEClass, YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH);

		yEmbeddableMultiSelectionEndpointEClass = createEClass(YEMBEDDABLE_MULTI_SELECTION_ENDPOINT);
		createEReference(yEmbeddableMultiSelectionEndpointEClass, YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT);

		yEmbeddableCollectionEndpointEClass = createEClass(YEMBEDDABLE_COLLECTION_ENDPOINT);
		createEReference(yEmbeddableCollectionEndpointEClass, YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT);

		yActivatedEndpointEClass = createEClass(YACTIVATED_ENDPOINT);
		createEReference(yActivatedEndpointEClass, YACTIVATED_ENDPOINT__ELEMENT);

		yDtWrapperEClass = createEClass(YDT_WRAPPER);

		yVisibilityProcessableEClass = createEClass(YVISIBILITY_PROCESSABLE);
		createEReference(yVisibilityProcessableEClass, YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR);

		// Create enums
		yUnitEEnum = createEEnum(YUNIT);

		// Create data types
		yuriEDataType = createEDataType(YURI);
		yValueChangeListenerEDataType = createEDataType(YVALUE_CHANGE_LISTENER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ValidationPackage theValidationPackage = (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		VisibilityPackage theVisibilityPackage = (VisibilityPackage)EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yLayoutEClass.getESuperTypes().add(this.getYEmbeddable());
		yFieldEClass.getESuperTypes().add(this.getYEmbeddable());
		yFieldEClass.getESuperTypes().add(this.getYEditable());
		yFieldEClass.getESuperTypes().add(this.getYEnable());
		yViewEClass.getESuperTypes().add(this.getYElement());
		yViewEClass.getESuperTypes().add(this.getYCssAble());
		yViewEClass.getESuperTypes().add(this.getYMarginable());
		yViewEClass.getESuperTypes().add(this.getYVisibilityProcessable());
		yViewSetEClass.getESuperTypes().add(this.getYElement());
		yBeanSlotEClass.getESuperTypes().add(this.getYBindable());
		yEmbeddableEClass.getESuperTypes().add(this.getYElement());
		yEmbeddableEClass.getESuperTypes().add(this.getYCssAble());
		yEmbeddableEClass.getESuperTypes().add(this.getYVisibleable());
		yEmbeddableEClass.getESuperTypes().add(this.getYVisibilityProcessable());
		yActivateableEClass.getESuperTypes().add(this.getYBindable());
		yActionEClass.getESuperTypes().add(this.getYEmbeddable());
		yActionEClass.getESuperTypes().add(this.getYEnable());
		yValueBindableEClass.getESuperTypes().add(this.getYBindable());
		ySelectionBindableEClass.getESuperTypes().add(this.getYBindable());
		yMultiSelectionBindableEClass.getESuperTypes().add(this.getYBindable());
		yCollectionBindableEClass.getESuperTypes().add(this.getYBindable());
		yContextValueBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yBeanSlotValueBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yBeanSlotListBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYListBindingEndpoint());
		yEmbeddableValueEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yEmbeddableValueEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yEmbeddableSelectionEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yEmbeddableSelectionEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yEmbeddableMultiSelectionEndpointEClass.getESuperTypes().add(theBindingPackage.getYListBindingEndpoint());
		yEmbeddableMultiSelectionEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yEmbeddableCollectionEndpointEClass.getESuperTypes().add(theBindingPackage.getYListBindingEndpoint());
		yEmbeddableCollectionEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yActivatedEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yActivatedEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yDtWrapperEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());

		// Initialize classes and features; add operations and parameters
		initEClass(yElementEClass, YElement.class, "YElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, YElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, YElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yLayoutEClass, YLayout.class, "YLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLayout_Elements(), this.getYEmbeddable(), null, "elements", null, 0, -1, YLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFieldEClass, YField.class, "YField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYField_Validators(), theValidationPackage.getYValidator(), null, "validators", null, 0, -1, YField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYField_InternalValidators(), theValidationPackage.getYValidator(), null, "internalValidators", null, 0, -1, YField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yFieldEClass, ecorePackage.getEBoolean(), "addValueChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueChangeListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yFieldEClass, ecorePackage.getEBoolean(), "removeValueChangeListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueChangeListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yFieldEClass, null, "removeAllValueChangListeners", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yViewEClass, YView.class, "YView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYView_Root(), this.getYViewSet(), this.getYViewSet_Views(), "root", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYView_ViewName(), ecorePackage.getEString(), "viewName", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYView_Content(), this.getYEmbeddable(), null, "content", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYView_BindingSet(), theBindingPackage.getYBindingSet(), null, "bindingSet", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYView_BeanSlots(), this.getYBeanSlot(), null, "beanSlots", null, 0, -1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yViewEClass, theBindingPackage.getYBindingSet(), "getOrCreateBindingSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yViewSetEClass, YViewSet.class, "YViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYViewSet_Views(), this.getYView(), this.getYView_Root(), "views", null, 0, -1, YViewSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYViewSet_BeanSlots(), this.getYBeanSlot(), null, "beanSlots", null, 0, -1, YViewSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanSlotEClass, YBeanSlot.class, "YBeanSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanSlot_Name(), ecorePackage.getEString(), "name", null, 1, 1, YBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYBeanSlot_ValueType(), g1, "valueType", null, 0, 1, YBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanSlot_ValueTypeQualifiedName(), ecorePackage.getEString(), "valueTypeQualifiedName", null, 0, 1, YBeanSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableEClass, YEmbeddable.class, "YEmbeddable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddable_OrphanDatatypes(), theDatatypesPackage.getYDatatype(), null, "orphanDatatypes", null, 0, -1, YEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYEmbeddable_OrphanDatadescriptions(), theDatatypesPackage.getYDatadescription(), null, "orphanDatadescriptions", null, 0, -1, YEmbeddable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yEmbeddableEClass, this.getYLayout(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yEmbeddableEClass, this.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yCssAbleEClass, YCssAble.class, "YCssAble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYCssAble_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, YCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYCssAble_CssID(), ecorePackage.getEString(), "cssID", null, 0, 1, YCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMarginableEClass, YMarginable.class, "YMarginable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMarginable_Margin(), ecorePackage.getEBoolean(), "margin", "true", 0, 1, YMarginable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySpacingableEClass, YSpacingable.class, "YSpacingable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYSpacingable_Spacing(), ecorePackage.getEBoolean(), "spacing", "true", 0, 1, YSpacingable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yHeightableEClass, YHeightable.class, "YHeightable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYHeightable_Height(), ecorePackage.getEInt(), "height", "100", 0, 1, YHeightable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYHeightable_HeightUnit(), this.getYUnit(), "heightUnit", null, 0, 1, YHeightable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yWidthableEClass, YWidthable.class, "YWidthable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYWidthable_Width(), ecorePackage.getEInt(), "width", "100", 0, 1, YWidthable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYWidthable_WidthUnit(), this.getYUnit(), "widthUnit", null, 0, 1, YWidthable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yActivateableEClass, YActivateable.class, "YActivateable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYActivateable_InitialActivated(), ecorePackage.getEBoolean(), "initialActivated", "true", 0, 1, YActivateable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYActivateable_Activated(), ecorePackage.getEBoolean(), "activated", "true", 0, 1, YActivateable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yVisibleableEClass, YVisibleable.class, "YVisibleable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYVisibleable_InitialVisible(), ecorePackage.getEBoolean(), "initialVisible", "true", 0, 1, YVisibleable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibleable_Visible(), ecorePackage.getEBoolean(), "visible", "true", 0, 1, YVisibleable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yEditableEClass, YEditable.class, "YEditable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEditable_InitialEditable(), ecorePackage.getEBoolean(), "initialEditable", "true", 0, 1, YEditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEditable_Editable(), ecorePackage.getEBoolean(), "editable", "true", 0, 1, YEditable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yEnableEClass, YEnable.class, "YEnable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEnable_InitialEnabled(), ecorePackage.getEBoolean(), "initialEnabled", "true", 0, 1, YEnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnable_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1, YEnable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yActionEClass, YAction.class, "YAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yBindableEClass, YBindable.class, "YBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yValueBindableEClass, YValueBindable.class, "YValueBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYValueBindable_ValueBindingEndpoint(), this.getYEmbeddableValueEndpoint(), this.getYEmbeddableValueEndpoint_Element(), "valueBindingEndpoint", null, 0, 1, YValueBindable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yValueBindableEClass, this.getYEmbeddableValueEndpoint(), "createValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ySelectionBindableEClass, YSelectionBindable.class, "YSelectionBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYSelectionBindable_SelectionBindingEndpoint(), this.getYEmbeddableSelectionEndpoint(), this.getYEmbeddableSelectionEndpoint_Element(), "selectionBindingEndpoint", null, 0, 1, YSelectionBindable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ySelectionBindableEClass, this.getYEmbeddableSelectionEndpoint(), "createSelectionEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yMultiSelectionBindableEClass, YMultiSelectionBindable.class, "YMultiSelectionBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYMultiSelectionBindable_MultiSelectionBindingEndpoint(), this.getYEmbeddableMultiSelectionEndpoint(), this.getYEmbeddableMultiSelectionEndpoint_Element(), "multiSelectionBindingEndpoint", null, 0, 1, YMultiSelectionBindable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yMultiSelectionBindableEClass, this.getYEmbeddableMultiSelectionEndpoint(), "createMultiSelectionEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yCollectionBindableEClass, YCollectionBindable.class, "YCollectionBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCollectionBindable_CollectionBindingEndpoint(), this.getYEmbeddableCollectionEndpoint(), this.getYEmbeddableCollectionEndpoint_Element(), "collectionBindingEndpoint", null, 0, 1, YCollectionBindable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yCollectionBindableEClass, this.getYEmbeddableCollectionEndpoint(), "createCollectionEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yContextValueBindingEndpointEClass, YContextValueBindingEndpoint.class, "YContextValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYContextValueBindingEndpoint_UrlString(), ecorePackage.getEString(), "urlString", null, 1, 1, YContextValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanSlotValueBindingEndpointEClass, YBeanSlotValueBindingEndpoint.class, "YBeanSlotValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanSlotValueBindingEndpoint_AttributePath(), ecorePackage.getEString(), "attributePath", null, 1, 1, YBeanSlotValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYBeanSlotValueBindingEndpoint_BeanSlot(), this.getYBeanSlot(), null, "beanSlot", null, 1, 1, YBeanSlotValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBeanSlotListBindingEndpointEClass, YBeanSlotListBindingEndpoint.class, "YBeanSlotListBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanSlotListBindingEndpoint_AttributePath(), ecorePackage.getEString(), "attributePath", null, 1, 1, YBeanSlotListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYBeanSlotListBindingEndpoint_BeanSlot(), this.getYBeanSlot(), null, "beanSlot", null, 1, 1, YBeanSlotListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYBeanSlotListBindingEndpoint_CollectionType(), g1, "collectionType", null, 0, 1, YBeanSlotListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanSlotListBindingEndpoint_CollectionTypeQualifiedName(), ecorePackage.getEString(), "collectionTypeQualifiedName", null, 0, 1, YBeanSlotListBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableBindingEndpointEClass, YEmbeddableBindingEndpoint.class, "YEmbeddableBindingEndpoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yEmbeddableBindingEndpointEClass, this.getYBindable(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yEmbeddableValueEndpointEClass, YEmbeddableValueEndpoint.class, "YEmbeddableValueEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddableValueEndpoint_Element(), this.getYValueBindable(), this.getYValueBindable_ValueBindingEndpoint(), "element", null, 1, 1, YEmbeddableValueEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableSelectionEndpointEClass, YEmbeddableSelectionEndpoint.class, "YEmbeddableSelectionEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddableSelectionEndpoint_Element(), this.getYSelectionBindable(), this.getYSelectionBindable_SelectionBindingEndpoint(), "element", null, 1, 1, YEmbeddableSelectionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEmbeddableSelectionEndpoint_AttributePath(), ecorePackage.getEString(), "attributePath", null, 0, 1, YEmbeddableSelectionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableMultiSelectionEndpointEClass, YEmbeddableMultiSelectionEndpoint.class, "YEmbeddableMultiSelectionEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddableMultiSelectionEndpoint_Element(), this.getYMultiSelectionBindable(), this.getYMultiSelectionBindable_MultiSelectionBindingEndpoint(), "element", null, 1, 1, YEmbeddableMultiSelectionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableCollectionEndpointEClass, YEmbeddableCollectionEndpoint.class, "YEmbeddableCollectionEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddableCollectionEndpoint_Element(), this.getYCollectionBindable(), this.getYCollectionBindable_CollectionBindingEndpoint(), "element", null, 1, 1, YEmbeddableCollectionEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yActivatedEndpointEClass, YActivatedEndpoint.class, "YActivatedEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYActivatedEndpoint_Element(), this.getYActivateable(), null, "element", null, 1, 1, YActivatedEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDtWrapperEClass, YDtWrapper.class, "YDtWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yVisibilityProcessableEClass, YVisibilityProcessable.class, "YVisibilityProcessable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityProcessable_VisibilityProcessor(), theVisibilityPackage.getYVisibilityProcessor(), theVisibilityPackage.getYVisibilityProcessor_Parent(), "visibilityProcessor", null, 0, 1, YVisibilityProcessable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yUnitEEnum, YUnit.class, "YUnit");
		addEEnumLiteral(yUnitEEnum, YUnit.PIXEL);
		addEEnumLiteral(yUnitEEnum, YUnit.EM);

		// Initialize data types
		initEDataType(yuriEDataType, URI.class, "YURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yValueChangeListenerEDataType, YValueChangeListener.class, "YValueChangeListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CoreModelPackageImpl
