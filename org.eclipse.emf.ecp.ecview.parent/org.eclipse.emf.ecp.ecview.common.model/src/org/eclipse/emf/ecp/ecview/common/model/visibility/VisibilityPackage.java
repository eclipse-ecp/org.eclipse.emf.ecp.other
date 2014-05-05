/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The number of structural features of the '<em>YVisibility Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule <em>YVisibility Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule
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
	 * The number of structural features of the '<em>YVisibility Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_RULE_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColorType()
	 * @generated
	 */
	int YCOLOR_TYPE = 5;


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
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YColor Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @generated
	 */
	EEnum getYColorType();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule <em>YVisibility Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYVisibilityRule()
		 * @generated
		 */
		EClass YVISIBILITY_RULE = eINSTANCE.getYVisibilityRule();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType <em>YColor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
		 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl#getYColorType()
		 * @generated
		 */
		EEnum YCOLOR_TYPE = eINSTANCE.getYColorType();

	}

} //VisibilityPackage
