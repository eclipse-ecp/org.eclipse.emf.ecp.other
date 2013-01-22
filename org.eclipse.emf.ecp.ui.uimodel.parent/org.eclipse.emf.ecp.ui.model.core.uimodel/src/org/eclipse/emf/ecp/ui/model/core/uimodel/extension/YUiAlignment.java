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
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>YUi Alignment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiAlignment()
 * @model
 * @generated
 */
public enum YUiAlignment implements Enumerator {
	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_LEFT(0, "BOTTOM_LEFT", "BOTTOM_LEFT"),

	/**
	 * The '<em><b>BOTTOM CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_CENTER(1, "BOTTOM_CENTER", "BOTTOM_CENTER"),

	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_RIGHT(2, "BOTTOM_RIGHT", "BOTTOM_RIGHT"),

	/**
	 * The '<em><b>BOTTOM FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_FILL(3, "BOTTOM_FILL", "BOTTOM_FILL"),

	/**
	 * The '<em><b>MIDDLE LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_LEFT(4, "MIDDLE_LEFT", "MIDDLE_LEFT"),

	/**
	 * The '<em><b>MIDDLE CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_CENTER(5, "MIDDLE_CENTER", "MIDDLE_CENTER"),

	/**
	 * The '<em><b>MIDDLE RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_RIGHT(6, "MIDDLE_RIGHT", "MIDDLE_RIGHT"),

	/**
	 * The '<em><b>MIDDLE FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE_FILL(7, "MIDDLE_FILL", "MIDDLE_FILL"),

	/**
	 * The '<em><b>TOP LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LEFT(8, "TOP_LEFT", "TOP_LEFT"),

	/**
	 * The '<em><b>TOP CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_CENTER(9, "TOP_CENTER", "TOP_CENTER"),

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_RIGHT(10, "TOP_RIGHT", "TOP_RIGHT"),

	/**
	 * The '<em><b>TOP FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_FILL(11, "TOP_FILL", "TOP_FILL"),

	/**
	 * The '<em><b>FILL FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_FILL(12, "FILL_FILL", "FILL_FILL"),

	/**
	 * The '<em><b>FILL LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_LEFT(13, "FILL_LEFT", "FILL_LEFT"),

	/**
	 * The '<em><b>FILL CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_CENTER(14, "FILL_CENTER", "FILL_CENTER"),

	/**
	 * The '<em><b>FILL RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_RIGHT(15, "FILL_RIGHT", "FILL_RIGHT"),

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(16, "UNDEFINED", "UNDEFINED");

	/**
	 * The '<em><b>BOTTOM LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_LEFT_VALUE = 0;

	/**
	 * The '<em><b>BOTTOM CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_CENTER_VALUE = 1;

	/**
	 * The '<em><b>BOTTOM RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>BOTTOM FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_FILL_VALUE = 3;

	/**
	 * The '<em><b>MIDDLE LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_LEFT_VALUE = 4;

	/**
	 * The '<em><b>MIDDLE CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_CENTER_VALUE = 5;

	/**
	 * The '<em><b>MIDDLE RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_RIGHT_VALUE = 6;

	/**
	 * The '<em><b>MIDDLE FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIDDLE FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_FILL_VALUE = 7;

	/**
	 * The '<em><b>TOP LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LEFT_VALUE = 8;

	/**
	 * The '<em><b>TOP CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_CENTER_VALUE = 9;

	/**
	 * The '<em><b>TOP RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_RIGHT_VALUE = 10;

	/**
	 * The '<em><b>TOP FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_FILL_VALUE = 11;

	/**
	 * The '<em><b>FILL FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_FILL_VALUE = 12;

	/**
	 * The '<em><b>FILL LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_LEFT_VALUE = 13;

	/**
	 * The '<em><b>FILL CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_CENTER_VALUE = 14;

	/**
	 * The '<em><b>FILL RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_RIGHT_VALUE = 15;

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 16;

	/**
	 * An array of all the '<em><b>YUi Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final YUiAlignment[] VALUES_ARRAY =
		new YUiAlignment[] {
			BOTTOM_LEFT,
			BOTTOM_CENTER,
			BOTTOM_RIGHT,
			BOTTOM_FILL,
			MIDDLE_LEFT,
			MIDDLE_CENTER,
			MIDDLE_RIGHT,
			MIDDLE_FILL,
			TOP_LEFT,
			TOP_CENTER,
			TOP_RIGHT,
			TOP_FILL,
			FILL_FILL,
			FILL_LEFT,
			FILL_CENTER,
			FILL_RIGHT,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>YUi Alignment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<YUiAlignment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>YUi Alignment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YUiAlignment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YUiAlignment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YUi Alignment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YUiAlignment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YUiAlignment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YUi Alignment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YUiAlignment get(int value) {
		switch (value) {
			case BOTTOM_LEFT_VALUE: return BOTTOM_LEFT;
			case BOTTOM_CENTER_VALUE: return BOTTOM_CENTER;
			case BOTTOM_RIGHT_VALUE: return BOTTOM_RIGHT;
			case BOTTOM_FILL_VALUE: return BOTTOM_FILL;
			case MIDDLE_LEFT_VALUE: return MIDDLE_LEFT;
			case MIDDLE_CENTER_VALUE: return MIDDLE_CENTER;
			case MIDDLE_RIGHT_VALUE: return MIDDLE_RIGHT;
			case MIDDLE_FILL_VALUE: return MIDDLE_FILL;
			case TOP_LEFT_VALUE: return TOP_LEFT;
			case TOP_CENTER_VALUE: return TOP_CENTER;
			case TOP_RIGHT_VALUE: return TOP_RIGHT;
			case TOP_FILL_VALUE: return TOP_FILL;
			case FILL_FILL_VALUE: return FILL_FILL;
			case FILL_LEFT_VALUE: return FILL_LEFT;
			case FILL_CENTER_VALUE: return FILL_CENTER;
			case FILL_RIGHT_VALUE: return FILL_RIGHT;
			case UNDEFINED_VALUE: return UNDEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private YUiAlignment(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //YUiAlignment
