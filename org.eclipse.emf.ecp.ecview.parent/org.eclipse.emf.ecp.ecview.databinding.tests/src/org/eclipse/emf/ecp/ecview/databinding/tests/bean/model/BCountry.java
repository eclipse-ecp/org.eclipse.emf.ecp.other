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
package org.eclipse.emf.ecp.ecview.databinding.tests.bean.model;

public class BCountry extends AbstractBean {

	private String isoCode;

	/**
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * @param isoCode
	 *            the isoCode to set
	 */
	public void setIsoCode(String isoCode) {
		firePropertyChanged("isoCode", this.isoCode, this.isoCode = isoCode);
	}

}
