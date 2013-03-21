package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.services.IServiceProvider;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Widget;

public class BindingManagerProvider implements IServiceProvider {

	@Override
	public boolean isFor(String selector, IContext context) {
		if (context instanceof IViewContext) {
			if (!org.eclipse.emf.ecp.ecview.common.binding.IBindingManager.class
					.getName().equals(selector)
					&& !org.eclipse.emf.ecp.ecview.ui.presentation.swt.IBindingManager.class
							.getName().equals(selector)) {
				return false;
			}
			IViewContext viewContext = (IViewContext) context;
			if (!ECViewSwtRenderer.UI_KIT_URI.equals(viewContext
					.getPresentationURI())) {
				return false;
			}
			return true;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A> A createService(String selector, IContext context) {
		IViewContext viewContext = (IViewContext) context;
		final BindingManager bindingManager = new BindingManager(
				SWTObservables.getRealm(((Widget) viewContext.getRootLayout())
						.getDisplay()));
		viewContext.addDisposeListener(new IDisposable.Listener() {
			@Override
			public void notifyDisposed(IDisposable notifier) {
				bindingManager.dispose();
			}
		});
		return (A) bindingManager;
	}

}
