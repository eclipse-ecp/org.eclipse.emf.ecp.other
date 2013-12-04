package org.eclipse.emf.ecp.e4.editor;

import java.net.URL;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.ui.view.emf.AdapterFactoryLabelProvider;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.spi.ui.UIProvider;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class ECPE4Editor {

	public static final java.lang.String INPUT = "ecpEditorInput";
	private MPart part;
	private EObject modelElement;
	private Adapter adapter;
	private final Composite composite;
	private final ScrolledComposite sc;

	@Inject
	public ECPE4Editor(Composite composite) {
		this.composite = composite;
		sc = new ScrolledComposite(composite, SWT.V_SCROLL
			| SWT.H_SCROLL);
	}

	@Inject
	public void setInput(@Optional @Named(INPUT) EObject modelElement, @Optional ECPProject ecpProject, MPart part) {
		if (modelElement == null || ecpProject == null) {
			return;
		}
		this.part = part;
		this.modelElement = modelElement;
		ECPSWTView render;
		try {
			render = ECPSWTViewRenderer.INSTANCE.render(sc, modelElement);

			sc.setExpandHorizontal(true);
			sc.setExpandVertical(true);
			sc.setContent(render.getSWTControl());
			sc.setMinSize(render.getSWTControl().computeSize(SWT.DEFAULT, SWT.DEFAULT));

		} catch (final ECPRendererException ex) {
			ex.printStackTrace();
		}
		// composite.layout();

		updateImageAndText();
		adapter = new AdapterImpl() {

			/*
			 * (non-Javadoc)
			 * @see
			 * org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			@Override
			public void notifyChanged(Notification msg) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						updateImageAndText();
					}
				});
			}

		};
		modelElement.eAdapters().add(adapter);
	}

	@PreDestroy
	void dispose() {
		modelElement.eAdapters().remove(adapter);
	}

	private void updateImageAndText() {
		part.setLabel(UIProvider.EMF_LABEL_PROVIDER.getText(modelElement));
		part.setTooltip(UIProvider.EMF_LABEL_PROVIDER.getText(modelElement));

		final AdapterFactoryLabelProvider provider = new AdapterFactoryLabelProvider(
			InternalProvider.EMF_ADAPTER_FACTORY);
		final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) provider.getAdapterFactory().adapt(
			modelElement, IItemLabelProvider.class);

		final URL url = (URL) itemLabelProvider.getImage(modelElement);

	}

	@Focus
	void setFocus() {
		if (sc != null) {
			sc.setFocus();
		}
	}
}
