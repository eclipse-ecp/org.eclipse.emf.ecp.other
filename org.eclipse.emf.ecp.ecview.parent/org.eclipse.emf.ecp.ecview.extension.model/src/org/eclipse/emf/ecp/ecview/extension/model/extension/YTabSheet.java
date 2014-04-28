/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YTab Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTabSheet()
 * @model
 * @generated
 */
public interface YTabSheet extends YEmbeddable {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTabSheet_Tabs()
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTab#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<YTab> getTabs();

} // YTabSheet
