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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.ecp.ui.model.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>YUi Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class YUiRootTest extends TestCase {

	/**
	 * The fixture for this YUi Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(YUiRootTest.class);
	}

	/**
	 * Constructs a new YUi Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this YUi Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(YUiRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this YUi Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiRoot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiModelFactory.eINSTANCE.createYUiRoot());
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

} //YUiRootTest
