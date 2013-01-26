package org.eclipse.emf.ecp.ecview.common.model.core.util;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

public class SimpleCoreModelFactory {

	/**
	 * Creates an instance of {@link YView}
	 * 
	 * @return
	 */
	public YView createView() {
		return CoreModelFactory.eINSTANCE.createYView();
	}

	/**
	 * Creates an instance of {@link YViewSet}
	 * 
	 * @return
	 */
	public YViewSet createViewSet() {
		return CoreModelFactory.eINSTANCE.createYViewSet();
	}

	/**
	 * Creates an instance of {@link YDatadescription}
	 * 
	 * @return
	 */
	public YDatadescription createDatadescription() {
		return DatatypesFactory.eINSTANCE.createYDatadescription();
	}

}
