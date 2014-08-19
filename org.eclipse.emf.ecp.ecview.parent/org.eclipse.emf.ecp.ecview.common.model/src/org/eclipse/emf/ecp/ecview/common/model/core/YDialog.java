/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>YDialog</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getContent
 * <em>Content</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isModal <em>
 * Modal</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isResizeable
 * <em>Resizeable</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isDraggable
 * <em>Draggable</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isClosable
 * <em>Closable</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getValue <em>
 * Value</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getType <em>
 * Type</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getEmfNsURI
 * <em>Emf Ns URI</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getTypeQualifiedName
 * <em>Type Qualified Name</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getDatadescription
 * <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog()
 * @model
 * @generated
 */
public interface YDialog extends YElement, YValueBindable, YCssAble {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(YEmbeddable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Content()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YEmbeddable getContent();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getContent
	 * <em>Content</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(YEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Modal</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modal</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Modal</em>' attribute.
	 * @see #setModal(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Modal()
	 * @model
	 * @generated
	 */
	boolean isModal();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isModal
	 * <em>Modal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Modal</em>' attribute.
	 * @see #isModal()
	 * @generated
	 */
	void setModal(boolean value);

	/**
	 * Returns the value of the '<em><b>Resizeable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resizeable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resizeable</em>' attribute.
	 * @see #setResizeable(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Resizeable()
	 * @model
	 * @generated
	 */
	boolean isResizeable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isResizeable
	 * <em>Resizeable</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resizeable</em>' attribute.
	 * @see #isResizeable()
	 * @generated
	 */
	void setResizeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Draggable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draggable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Draggable</em>' attribute.
	 * @see #setDraggable(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Draggable()
	 * @model
	 * @generated
	 */
	boolean isDraggable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isDraggable
	 * <em>Draggable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Draggable</em>' attribute.
	 * @see #isDraggable()
	 * @generated
	 */
	void setDraggable(boolean value);

	/**
	 * Returns the value of the '<em><b>Closable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Closable</em>' attribute.
	 * @see #setClosable(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Closable()
	 * @model
	 * @generated
	 */
	boolean isClosable();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#isClosable
	 * <em>Closable</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Closable</em>' attribute.
	 * @see #isClosable()
	 * @generated
	 */
	void setClosable(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Type()
	 * @model
	 * @generated
	 */
	Class<?> getType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Emf Ns URI</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emf Ns URI</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #setEmfNsURI(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_EmfNsURI()
	 * @model
	 * @generated
	 */
	String getEmfNsURI();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getEmfNsURI
	 * <em>Emf Ns URI</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Emf Ns URI</em>' attribute.
	 * @see #getEmfNsURI()
	 * @generated
	 */
	void setEmfNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Qualified Name</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #setTypeQualifiedName(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_TypeQualifiedName()
	 * @model
	 * @generated
	 */
	String getTypeQualifiedName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getTypeQualifiedName
	 * <em>Type Qualified Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type Qualified Name</em>' attribute.
	 * @see #getTypeQualifiedName()
	 * @generated
	 */
	void setTypeQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Datadescription</em>' containment
	 *         reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYDialog_Datadescription()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.ecp.ecview.common.model.core.YDialog#getDatadescription
	 * <em>Datadescription</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Datadescription</em>' containment
	 *            reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the view this dialog is registered at.
	 * 
	 * @return
	 */
	YView getView();

	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabel(String label);

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabelI18nKey(String i18nKey);

} // YDialog
