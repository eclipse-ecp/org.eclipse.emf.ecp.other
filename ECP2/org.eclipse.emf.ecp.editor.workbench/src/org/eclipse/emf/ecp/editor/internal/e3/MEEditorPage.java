/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * Technische Universitaet Muenchen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.ecp.editor.internal.e3;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.editor.EditorFactory;
import org.eclipse.emf.ecp.editor.IEditorCompositeProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.menus.IMenuService;

/**
 * The editor page for the {@link MEEditor}.
 * 
 * @author helming
 * @author shterev
 * @author naughton
 */
public class MEEditorPage extends FormPage {

	//
	private ScrolledForm form;
	//
	private final ECPControlContext modelElementContext;

	private IEditorCompositeProvider editorPageContent;

	private ShortLabelProvider shortLabelProvider;

	private ComposedAdapterFactory composedAdapterFactory;

	// private ISourceProvider sourceProvider;

	// private IEvaluationService service;

	/**
	 * Default constructor.
	 * 
	 * @param editor
	 *            the {@link MEEditor}
	 * @param id
	 *            the {@link FormPage#id}
	 * @param title
	 *            the title
	 * @param modelElement
	 *            the modelElement
	 * @param modelElementContext
	 *            the {@link ModelElementContext}
	 */
	public MEEditorPage(MEEditor editor, String id, String title, ECPControlContext modelElementContext,
		EObject modelElement) {
		super(editor, id, title);
		this.modelElementContext = modelElementContext;

	}

	/**
	 * Default constructor.
	 * 
	 * @param editor
	 *            the {@link MEEditor}
	 * @param id
	 *            the {@link FormPage#id}
	 * @param title
	 *            the title
	 * @param modelElement
	 *            the modelElement
	 * @param problemFeature
	 *            the problemFeature
	 * @param modelElementContext
	 *            the {@link ModelElementContext}
	 */
	public MEEditorPage(MEEditor editor, String id, String title, ECPControlContext modelElementContext,
		EObject modelElement, EStructuralFeature problemFeature) {
		this(editor, id, title, modelElementContext, modelElement);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		shortLabelProvider = new ShortLabelProvider(composedAdapterFactory);
		FormToolkit toolkit = getEditor().getToolkit();
		form = managedForm.getForm();
		toolkit.decorateFormHeading(form.getForm());
		Composite body = form.getBody();
		body.setLayout(new GridLayout());
		editorPageContent = EditorFactory.INSTANCE.getEditorComposite(modelElementContext);
		editorPageContent.createUI(body);

		form.setImage(shortLabelProvider.getImage(modelElementContext.getModelElement()));
		createToolbar();
		form.pack();
		updateSectionTitle();
	}

	/**
	 * Updates the name of the section.
	 */
	public void updateSectionTitle() {
		// Layout form

		String name = shortLabelProvider.getText(modelElementContext.getModelElement());

		name += " [" + modelElementContext.getModelElement().eClass().getName() + "]";
		try {
			form.setText(name);
		} catch (SWTException e) {
			// Catch in case editor is closed directly after change
		}
	}

	private void createToolbar() {
		IMenuService menuService = (IMenuService) PlatformUI.getWorkbench().getService(IMenuService.class);
		// sourceProvider = new AbstractSourceProvider() {
		// public void dispose() {
		// }
		//
		// @SuppressWarnings("rawtypes")
		// public Map getCurrentState() {
		// HashMap<Object, Object> map = new HashMap<Object, Object>();
		// map.put(activeModelelement, modelElementContext.getModelElement());
		// return map;
		// }
		//
		// public String[] getProvidedSourceNames() {
		// String[] namens = new String[1];
		// namens[0] = activeModelelement;
		// return namens;
		// }
		//
		// };
		//
		// service = (IEvaluationService) PlatformUI.getWorkbench()
		// .getService(IEvaluationService.class);
		// service.addSourceProvider(sourceProvider);

		form.getToolBarManager().add(new Action("", Activator.getImageDescriptor("icons/delete.gif")) {

			@Override
			public void run() {
				new ECPCommand(modelElementContext.getModelElement(), modelElementContext.getEditingDomain()) {

					@Override
					protected void doRun() {
						EcoreUtil.delete(modelElementContext.getModelElement(), true);
					}

				}.run(true);

				MEEditorPage.this.getEditor().close(true);
			}
		});
		menuService.populateContributionManager((ContributionManager) form.getToolBarManager(),
			"toolbar:org.eclipse.emf.ecp.editor.internal.e3.MEEditorPage");
		form.getToolBarManager().update(true);
	}

	/**
	 * {@inheritDoc} This method is added to solve the focus bug of navigator. Every time that a ME is opened in editor,
	 * navigator has to lose focus so that its action contributions are set correctly for next time.
	 */
	@Override
	public void setFocus() {
		editorPageContent.focus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		editorPageContent.dispose();
		composedAdapterFactory.dispose();
		shortLabelProvider.dispose();
		form.dispose();
		super.dispose();
	}
}
