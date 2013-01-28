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
package org.eclipse.emf.ecp.ecview.common.model.core.util;

import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;

public class CoreModelUtil {

	/**
	 * Initializes the transient values.
	 * 
	 * @param yEmbeddable
	 */
	public static void initTransientValues(YEmbeddable yEmbeddable) {
		if (yEmbeddable instanceof YEditable) {
			((YEditable) yEmbeddable).setEditable(((YEditable) yEmbeddable)
					.isInitialEditable());
		}

		if (yEmbeddable instanceof YEnable) {
			((YEnable) yEmbeddable).setEnabled(((YEnable) yEmbeddable)
					.isInitialEnabled());
		}

		if (yEmbeddable instanceof YVisibleable) {
			((YVisibleable) yEmbeddable)
					.setVisible(((YVisibleable) yEmbeddable).isInitialVisible());
		}
	}

}
