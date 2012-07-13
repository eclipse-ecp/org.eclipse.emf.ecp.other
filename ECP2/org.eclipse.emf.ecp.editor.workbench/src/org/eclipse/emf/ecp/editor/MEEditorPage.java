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
package org.eclipse.emf.ecp.editor;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ui.util.ShortLabelProvider;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.services.IEvaluationService;

import java.util.HashMap;
import java.util.Map;

/**
 * The editor page for the {@link MEEditor}.
 * 
 * @author helming
 * @author shterev
 * @author naughton
 */
public class MEEditorPage extends FormPage {

	// private EObject modelElement;
	//
	// private FormToolkit toolkit;
	//
	// private List<AbstractMEControl> meControls = new ArrayList<AbstractMEControl>();
	//
	private static String activeModelelement = "activeModelelement";

	//
	private ScrolledForm form;

	//
	// private List<IItemPropertyDescriptor> leftColumnAttributes = new ArrayList<IItemPropertyDescriptor>();
	//
	// private List<IItemPropertyDescriptor> rightColumnAttributes = new ArrayList<IItemPropertyDescriptor>();
	//
	// private List<IItemPropertyDescriptor> bottomAttributes = new ArrayList<IItemPropertyDescriptor>();
	//
	// private Composite leftColumnComposite;
	//
	// private Composite rightColumnComposite;
	//
	// private Composite bottomComposite;
	//
	// private EStructuralFeature problemFeature;
	//
	// private final EditorModelelementContext modelElementContext;

	private FormEditorContentHelper editorPageContent;

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
	public MEEditorPage(MEEditor editor, String id, String title, EditorModelelementContext modelElementContext,
		EObject modelElement) {
		super(editor, id, title);
		editorPageContent = new FormEditorContentHelper(modelElement, modelElementContext);

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
	public MEEditorPage(MEEditor editor, String id, String title, EditorModelelementContext modelElementContext,
		EObject modelElement, EStructuralFeature problemFeature) {
		this(editor, id, title, modelElementContext, modelElement);
		// this.problemFeature = problemFeature;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);

		FormToolkit toolkit = getEditor().getToolkit();
		form = managedForm.getForm();
		toolkit.decorateFormHeading(form.getForm());
		Composite body = form.getBody();
		body.setLayout(new GridLayout());
		editorPageContent.createUI(body, toolkit);

		form.setImage(new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE)).getImage(editorPageContent.getModelElement()));
		createToolbar();
		form.pack();
		updateSectionTitle();
	}

	/**
	 * Updates the name of the section.
	 */
	public void updateSectionTitle() {
		// Layout form
		ShortLabelProvider shortLabelProvider = new ShortLabelProvider();
		String name = shortLabelProvider.getText(editorPageContent.getModelElement());

		name += " [" + editorPageContent.getModelElement().eClass().getName() + "]";
		try {
			form.setText(name);
		} catch (SWTException e) {
			// Catch in case editor is closed directly after change
		}
	}

	private void createToolbar() {
		IMenuService menuService = (IMenuService) PlatformUI.getWorkbench().getService(IMenuService.class);
		ISourceProvider sourceProvider = new AbstractSourceProvider() {
			public void dispose() {
			}

			@SuppressWarnings("rawtypes")
			public Map getCurrentState() {
				HashMap<Object, Object> map = new HashMap<Object, Object>();
				map.put(activeModelelement, editorPageContent.getModelElement());
				return map;
			}

			public String[] getProvidedSourceNames() {
				String[] namens = new String[1];
				namens[0] = activeModelelement;
				return namens;
			}

		};

		IEvaluationService service = (IEvaluationService) PlatformUI.getWorkbench()
			.getService(IEvaluationService.class);
		service.addSourceProvider(sourceProvider);
		form.getToolBarManager().add(new Action("", Activator.getImageDescriptor("icons/delete.gif")) {

			@Override
			public void run() {
				// TODO: Test
				Command command = DeleteCommand.create(editorPageContent.getModelElementContext().getEditingDomain(),
					editorPageContent.getModelElement());
				command.execute();

			}
		});
		menuService.populateContributionManager((ContributionManager) form.getToolBarManager(),
			"toolbar:org.eclipse.emf.ecp.editor.MEEditorPage");
		form.getToolBarManager().update(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		editorPageContent.dispose();
		super.dispose();
	}

	/**
	 * {@inheritDoc} This method is added to solve the focus bug of navigator. Every time that a ME is opened in editor,
	 * navigator has to lose focus so that its action contributions are set correctly for next time.
	 */
	@Override
	public void setFocus() {
		super.setFocus();
	}
	/**
	 * Triggers live validation of the model attributes.
	 * **/
	public void updateLiveValidation() {
		editorPageContent.updateLiveValidation();
	}

}