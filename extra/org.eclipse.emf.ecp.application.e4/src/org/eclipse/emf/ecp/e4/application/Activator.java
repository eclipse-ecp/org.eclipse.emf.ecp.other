package org.eclipse.emf.ecp.e4.application;

import java.util.Collection;

import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.services.EContextService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
	public static EPartService getEPartService(){
		try {
			ServiceReference<?> service=context.getServiceReferences(IContextFunction.class.getName(),"(service.context.key="+EPartService.class.getName()+")")[0];
			//TODO a "bit" ugly
			return (EPartService) ((IContextFunction)context.getService(service)).compute(E4Workbench.getServiceContext(),null);
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
