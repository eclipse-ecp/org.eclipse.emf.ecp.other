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
package org.eclipse.emf.ecp.ui.model.uimodel.tests;

import junit.textui.TestRunner;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiField;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>YUi Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YUiFieldTest extends YUiEmbeddableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YUiFieldTest.class);
	}

	/**
	 * Constructs a new YUi Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this YUi Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected YUiField getFixture() {
		return (YUiField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiModelFactory.eINSTANCE.createYUiField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //YUiFieldTest
