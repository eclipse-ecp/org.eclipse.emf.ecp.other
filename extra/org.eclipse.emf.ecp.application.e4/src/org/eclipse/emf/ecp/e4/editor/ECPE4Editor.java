package org.eclipse.emf.ecp.e4.editor;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.edit.ECPEditorContext;
import org.eclipse.emf.ecp.editor.EditorFactory;
import org.eclipse.emf.ecp.editor.IEditorCompositeProvider;
import org.eclipse.emf.ecp.explorereditorbridge.internal.EditorContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ECPE4Editor {

	public ECPE4Editor(){
		
	}
	
	@PostConstruct
	public void construct(Composite composite,@Named(IServiceConstants.ACTIVE_SELECTION) @Optional EObject modelElement){
//		IEditorCompositeProvider compositeProvider=EditorFactory.INSTANCE.getEditorComposite(modelElementContext);
//		Composite editorComposite=compositeProvider.createUI(composite);
		if(modelElement==null)
			return;
		ECPEditorContext editorContext=new EditorContext(modelElement, ECPUtil.getECPProjectManager().getProject(modelElement), composite.getShell());
		IEditorCompositeProvider editorPageContent = EditorFactory.INSTANCE.getEditorComposite(editorContext);
		editorPageContent.createUI(composite);
	}
}
