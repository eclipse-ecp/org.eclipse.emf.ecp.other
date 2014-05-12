/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory
 * @model kind="package"
 * @generated
 */
public interface VisibilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visibility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/visibility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visibility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisibilityPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl <em>YVisibility Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProcessor()
	 * @generated
	 */
	int YVISIBILITY_PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>On Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__ON_MATCH = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR__PARENT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YVisibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRuledVisibilityProcessorImpl <em>YRuled Visibility Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRuledVisibilityProcessorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYRuledVisibilityProcessor()
	 * @generated
	 */
	int YRULED_VISIBILITY_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YRULED_VISIBILITY_PROCESSOR__ID = YVISIBILITY_PROCESSOR__ID;

	/**
	 * The feature id for the '<em><b>On Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YRULED_VISIBILITY_PROCESSOR__ON_MATCH = YVISIBILITY_PROCESSOR__ON_MATCH;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YRULED_VISIBILITY_PROCESSOR__PARENT = YVISIBILITY_PROCESSOR__PARENT;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YRULED_VISIBILITY_PROCESSOR__RULE = YVISIBILITY_PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YRuled Visibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YRULED_VISIBILITY_PROCESSOR_FEATURE_COUNT = YVISIBILITY_PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl <em>YVisibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityRule()
	 * @generated
	 */
	int YVISIBILITY_RULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE__BINDING_ENDPOINTS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE__MATCH_MEANS_FALSE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YVisibility Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityPropertiesImpl <em>YVisibility Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityPropertiesImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProperties()
	 * @generated
	 */
	int YVISIBILITY_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__VISIBLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__EDITABLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ENABLED = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BORDER = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BOLD = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__ITALIC = CoreModelPackage.YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__STRIKETHROUGH = CoreModelPackage.YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__UNDERLINE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__BACKGROUND_COLOR = CoreModelPackage.YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES__FOREGROUND_COLOR = CoreModelPackage.YELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>YVisibility Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROPERTIES_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl <em>YColor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColor()
	 * @generated
	 */
	int YCOLOR = 4;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR__RED = 0;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR__GREEN = 1;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR__BLUE = 2;

	/**
	 * The feature id for the '<em><b>Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR__THEME_ID = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR__TYPE = 4;

	/**
	 * The number of structural features of the '<em>YColor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleBindingEndpointImpl <em>YVisibility Rule Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityRuleBindingEndpoint()
	 * @generated
	 */
	int YVISIBILITY_RULE_BINDING_ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_BINDING_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_BINDING_ENDPOINT__RULE = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_BINDING_ENDPOINT__ATTRIBUTE = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YVisibility Rule Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YBooleanValueRuleImpl <em>YBoolean Value Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YBooleanValueRuleImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYBooleanValueRule()
	 * @generated
	 */
	int YBOOLEAN_VALUE_RULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_VALUE_RULE__ID = YVISIBILITY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_VALUE_RULE__BINDING_ENDPOINTS = YVISIBILITY_RULE__BINDING_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_VALUE_RULE__MATCH_MEANS_FALSE = YVISIBILITY_RULE__MATCH_MEANS_FALSE;

	/**
	 * The number of structural features of the '<em>YBoolean Value Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_VALUE_RULE_FEATURE_COUNT = YVISIBILITY_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRegexpRuleImpl <em>YRegexp Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRegexpRuleImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYRegexpRule()
	 * @generated
	 */
	int YREGEXP_RULE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_RULE__ID = YVISIBILITY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_RULE__BINDING_ENDPOINTS = YVISIBILITY_RULE__BINDING_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_RULE__MATCH_MEANS_FALSE = YVISIBILITY_RULE__MATCH_MEANS_FALSE;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_RULE__REG_EXPRESSION = YVISIBILITY_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YRegexp Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_RULE_FEATURE_COUNT = YVISIBILITY_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl <em>YDecimal Value Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYDecimalValueRule()
	 * @generated
	 */
	int YDECIMAL_VALUE_RULE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE__ID = YVISIBILITY_RULE__ID;

	/**
	 * The feature id for the '<em><b>Binding Endpoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE__BINDING_ENDPOINTS = YVISIBILITY_RULE__BINDING_ENDPOINTS;

	/**
	 * The feature id for the '<em><b>Match Means False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE__MATCH_MEANS_FALSE = YVISIBILITY_RULE__MATCH_MEANS_FALSE;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE__OPTION = YVISIBILITY_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE__REFERENCE_VALUE = YVISIBILITY_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YDecimal Value Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_VALUE_RULE_FEATURE_COUNT = YVISIBILITY_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColorType()
	 * @generated
	 */
	int YCOLOR_TYPE = 9;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption <em>YDecimal Value Rule Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYDecimalValueRuleOption()
	 * @generated
	 */
	int YDECIMAL_VALUE_RULE_OPTION = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor <em>YVisibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Processor</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor
	 * @generated
	 */
	EClass getYVisibilityProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getOnMatch <em>On Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Match</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getOnMatch()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EReference getYVisibilityProcessor_OnMatch();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent()
	 * @see #getYVisibilityProcessor()
	 * @generated
	 */
	EReference getYVisibilityProcessor_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor <em>YRuled Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRuled Visibility Processor</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor
	 * @generated
	 */
	EClass getYRuledVisibilityProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor#getRule()
	 * @see #getYRuledVisibilityProcessor()
	 * @generated
	 */
	EReference getYRuledVisibilityProcessor_Rule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule <em>YVisibility Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule
	 * @generated
	 */
	EClass getYVisibilityRule();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#getBindingEndpoints <em>Binding Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding Endpoints</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#getBindingEndpoints()
	 * @see #getYVisibilityRule()
	 * @generated
	 */
	EReference getYVisibilityRule_BindingEndpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#isMatchMeansFalse <em>Match Means False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Means False</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule#isMatchMeansFalse()
	 * @see #getYVisibilityRule()
	 * @generated
	 */
	EAttribute getYVisibilityRule_MatchMeansFalse();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties <em>YVisibility Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Properties</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties
	 * @generated
	 */
	EClass getYVisibilityProperties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isVisible()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isEditable()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isEnabled()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isBorder()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isBold()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Bold();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isItalic()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isStrikethrough <em>Strikethrough</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isStrikethrough()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Strikethrough();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#isUnderline()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EAttribute getYVisibilityProperties_Underline();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Color</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#getBackgroundColor()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EReference getYVisibilityProperties_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreground Color</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties#getForegroundColor()
	 * @see #getYVisibilityProperties()
	 * @generated
	 */
	EReference getYVisibilityProperties_ForegroundColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor <em>YColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YColor</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor
	 * @generated
	 */
	EClass getYColor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getRed()
	 * @see #getYColor()
	 * @generated
	 */
	EAttribute getYColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getGreen()
	 * @see #getYColor()
	 * @generated
	 */
	EAttribute getYColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getBlue()
	 * @see #getYColor()
	 * @generated
	 */
	EAttribute getYColor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getThemeId <em>Theme Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme Id</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getThemeId()
	 * @see #getYColor()
	 * @generated
	 */
	EAttribute getYColor_ThemeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getType()
	 * @see #getYColor()
	 * @generated
	 */
	EAttribute getYColor_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint <em>YVisibility Rule Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Rule Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint
	 * @generated
	 */
	EClass getYVisibilityRuleBindingEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getRule()
	 * @see #getYVisibilityRuleBindingEndpoint()
	 * @generated
	 */
	EReference getYVisibilityRuleBindingEndpoint_Rule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint#getAttribute()
	 * @see #getYVisibilityRuleBindingEndpoint()
	 * @generated
	 */
	EAttribute getYVisibilityRuleBindingEndpoint_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YBooleanValueRule <em>YBoolean Value Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBoolean Value Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YBooleanValueRule
	 * @generated
	 */
	EClass getYBooleanValueRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule <em>YRegexp Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule
	 * @generated
	 */
	EClass getYRegexpRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule#getRegExpression <em>Reg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Expression</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule#getRegExpression()
	 * @see #getYRegexpRule()
	 * @generated
	 */
	EAttribute getYRegexpRule_RegExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule <em>YDecimal Value Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDecimal Value Rule</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule
	 * @generated
	 */
	EClass getYDecimalValueRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getOption()
	 * @see #getYDecimalValueRule()
	 * @generated
	 */
	EAttribute getYDecimalValueRule_Option();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getReferenceValue <em>Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule#getReferenceValue()
	 * @see #getYDecimalValueRule()
	 * @generated
	 */
	EAttribute getYDecimalValueRule_ReferenceValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YColor Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @generated
	 */
	EEnum getYColorType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption <em>YDecimal Value Rule Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YDecimal Value Rule Option</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption
	 * @generated
	 */
	EEnum getYDecimalValueRuleOption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisibilityFactory getVisibilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl <em>YVisibility Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProcessor()
		 * @generated
		 */
		EClass YVISIBILITY_PROCESSOR = eINSTANCE.getYVisibilityProcessor();

		/**
		 * The meta object literal for the '<em><b>On Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROCESSOR__ON_MATCH = eINSTANCE.getYVisibilityProcessor_OnMatch();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROCESSOR__PARENT = eINSTANCE.getYVisibilityProcessor_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRuledVisibilityProcessorImpl <em>YRuled Visibility Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRuledVisibilityProcessorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYRuledVisibilityProcessor()
		 * @generated
		 */
		EClass YRULED_VISIBILITY_PROCESSOR = eINSTANCE.getYRuledVisibilityProcessor();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YRULED_VISIBILITY_PROCESSOR__RULE = eINSTANCE.getYRuledVisibilityProcessor_Rule();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl <em>YVisibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityRule()
		 * @generated
		 */
		EClass YVISIBILITY_RULE = eINSTANCE.getYVisibilityRule();

		/**
		 * The meta object literal for the '<em><b>Binding Endpoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_RULE__BINDING_ENDPOINTS = eINSTANCE.getYVisibilityRule_BindingEndpoints();

		/**
		 * The meta object literal for the '<em><b>Match Means False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_RULE__MATCH_MEANS_FALSE = eINSTANCE.getYVisibilityRule_MatchMeansFalse();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityPropertiesImpl <em>YVisibility Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityPropertiesImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityProperties()
		 * @generated
		 */
		EClass YVISIBILITY_PROPERTIES = eINSTANCE.getYVisibilityProperties();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__VISIBLE = eINSTANCE.getYVisibilityProperties_Visible();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__EDITABLE = eINSTANCE.getYVisibilityProperties_Editable();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__ENABLED = eINSTANCE.getYVisibilityProperties_Enabled();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BORDER = eINSTANCE.getYVisibilityProperties_Border();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__BOLD = eINSTANCE.getYVisibilityProperties_Bold();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__ITALIC = eINSTANCE.getYVisibilityProperties_Italic();

		/**
		 * The meta object literal for the '<em><b>Strikethrough</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__STRIKETHROUGH = eINSTANCE.getYVisibilityProperties_Strikethrough();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_PROPERTIES__UNDERLINE = eINSTANCE.getYVisibilityProperties_Underline();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROPERTIES__BACKGROUND_COLOR = eINSTANCE.getYVisibilityProperties_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROPERTIES__FOREGROUND_COLOR = eINSTANCE.getYVisibilityProperties_ForegroundColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl <em>YColor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColor()
		 * @generated
		 */
		EClass YCOLOR = eINSTANCE.getYColor();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLOR__RED = eINSTANCE.getYColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLOR__GREEN = eINSTANCE.getYColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLOR__BLUE = eINSTANCE.getYColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Theme Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLOR__THEME_ID = eINSTANCE.getYColor_ThemeId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLOR__TYPE = eINSTANCE.getYColor_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleBindingEndpointImpl <em>YVisibility Rule Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityRuleBindingEndpoint()
		 * @generated
		 */
		EClass YVISIBILITY_RULE_BINDING_ENDPOINT = eINSTANCE.getYVisibilityRuleBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_RULE_BINDING_ENDPOINT__RULE = eINSTANCE.getYVisibilityRuleBindingEndpoint_Rule();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBILITY_RULE_BINDING_ENDPOINT__ATTRIBUTE = eINSTANCE.getYVisibilityRuleBindingEndpoint_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YBooleanValueRuleImpl <em>YBoolean Value Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YBooleanValueRuleImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYBooleanValueRule()
		 * @generated
		 */
		EClass YBOOLEAN_VALUE_RULE = eINSTANCE.getYBooleanValueRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRegexpRuleImpl <em>YRegexp Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YRegexpRuleImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYRegexpRule()
		 * @generated
		 */
		EClass YREGEXP_RULE = eINSTANCE.getYRegexpRule();

		/**
		 * The meta object literal for the '<em><b>Reg Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YREGEXP_RULE__REG_EXPRESSION = eINSTANCE.getYRegexpRule_RegExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl <em>YDecimal Value Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YDecimalValueRuleImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYDecimalValueRule()
		 * @generated
		 */
		EClass YDECIMAL_VALUE_RULE = eINSTANCE.getYDecimalValueRule();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDECIMAL_VALUE_RULE__OPTION = eINSTANCE.getYDecimalValueRule_Option();

		/**
		 * The meta object literal for the '<em><b>Reference Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDECIMAL_VALUE_RULE__REFERENCE_VALUE = eINSTANCE.getYDecimalValueRule_ReferenceValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColorType()
		 * @generated
		 */
		EEnum YCOLOR_TYPE = eINSTANCE.getYColorType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption <em>YDecimal Value Rule Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYDecimalValueRuleOption()
		 * @generated
		 */
		EEnum YDECIMAL_VALUE_RULE_OPTION = eINSTANCE.getYDecimalValueRuleOption();

	}

} //VisibilityPackage
