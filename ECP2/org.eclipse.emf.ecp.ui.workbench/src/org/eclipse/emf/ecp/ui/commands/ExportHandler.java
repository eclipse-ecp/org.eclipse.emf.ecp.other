package org.eclipse.emf.ecp.ui.commands;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ui.platform.Activator;
import org.eclipse.emf.ecp.ui.platform.PreferenceHelper;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExportHandler extends AbstractHandler {

	private static final String FILE_EXTENSION = "xmi";

	/**
	 * These filter names are used to filter which files are displayed.
	 */
	public static final String[] FILTER_NAMES = { "Model Files (*." + FILE_EXTENSION + ")" };

	/**
	 * These filter extensions are used to filter which files are displayed.
	 */
	public static final String[] FILTER_EXTS = { "*." + FILE_EXTENSION };

	private static final String EXPORT_MODEL_PATH = "org.eclipse.emf.emfstore.client.ui.exportModelPath";

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final List<EObject> exportModelElements = getSelfContainedModelElementTree(event);

		if (exportModelElements.size() > 0) {

			
			String filePath = getFilePathByFileDialog(getNameForModelElement(exportModelElements.get(0)));

			if (filePath == null) {
				return null;
			}

			PreferenceHelper.setPreference(EXPORT_MODEL_PATH, new File(filePath).getParent());

			runCommand(exportModelElements, filePath, HandlerUtil.getActiveShell(event));

		}

		return null;
	}
	private AdapterFactoryLabelProvider labelProvider;
	/**
	 * Get the name of a model element.
	 * 
	 * @param modelElement the model element
	 * @return the name for the model element
	 */
	private String getNameForModelElement(EObject modelElement) {
		ComposedAdapterFactory adapterFactory=null;
		
		if (labelProvider == null) {
			adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
		}
		
		String text = labelProvider.getText(modelElement);
		if (adapterFactory!=null) {
			adapterFactory.dispose();
		}
		return text;
	}
	
	private void runCommand(final List<EObject> exportModelElements, String filePath, Shell shell) {
		final File file = new File(filePath);

		final URI uri = URI.createFileURI(filePath);

		final ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(PlatformUI.getWorkbench()
			.getActiveWorkbenchWindow().getShell());

		progressDialog.open();
		progressDialog.getProgressMonitor().beginTask("Export modelelement...", 100);
		progressDialog.getProgressMonitor().worked(10);

		try {
			saveEObjectToResource(exportModelElements, uri);
		} catch (IOException e) {
			showExceptionDialog(e.getMessage(), e, shell);
		}
		progressDialog.getProgressMonitor().done();
		progressDialog.close();

		MessageDialog.openInformation(null, "Export", "Exported modelelement to file " + file.getName());
	}

	/**
	 * This method opens a standard error dialog displaying an exception to the user.
	 * 
	 * @param cause the exception to be shown.
	 * @param message the message to be shown.
	 */
	private void showExceptionDialog(String message, Exception cause, Shell shell) {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(message);
		String title = "Error";
		if (cause != null) {
			stringBuilder.append(": ");
			stringBuilder.append(cause.getMessage());
			title = cause.getClass().getName();
		}
		String string = stringBuilder.toString();
		MessageDialog.openError(shell, title, string);
		Activator.log("An unexpected error in a ECP plugin occured.", cause);
	}
	
	private List<EObject> getSelfContainedModelElementTree(ExecutionEvent event) {
		List<EObject> result = new ArrayList<EObject>();

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection strucSel = null;
		EObject copyModelElement = null;

		if (selection != null && selection instanceof IStructuredSelection) {
			strucSel = (IStructuredSelection) selection;
			Object firstElement = strucSel.getFirstElement();
			if (firstElement instanceof EObject) {
				// TODO: ChainSaw - check whether specific clone functionality of ModelUtil is needed here
				copyModelElement = EcoreUtil.copy((EObject) firstElement);
				// copyModelElement = ModelUtil.clone((EObject) firstElement);

				// only export the rootnode makes xml with references, otherwise (see (commented) line two) the children
				// will be "real" nested as containments of the node (is not necessary)
				result.add(copyModelElement);
				// result.addAll(copyModelElement.getAllContainedModelElements());

			} else {
				// do nothing System.out.println("NOT A MODELELEMENT");
			}
		}

		return result;
	}

	private String getFilePathByFileDialog(String modelElementName) {
		FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.SAVE);
		dialog.setFilterNames(FILTER_NAMES);
		dialog.setFilterExtensions(FILTER_EXTS);
		String initialPath = PreferenceHelper.getPreference(EXPORT_MODEL_PATH, System.getProperty("user.home"));
		dialog.setFilterPath(initialPath);
		dialog.setOverwrite(true);

		try {
			// String initialFileName = projectSpace.getProjectName() + "@"
			// + projectSpace.getBaseVersion().getIdentifier() + ".ucp";
			String initialFileName = "ModelElement_" + modelElementName + "." + FILE_EXTENSION;
			dialog.setFileName(initialFileName);

		} catch (NullPointerException e) {
			// do nothing
		}

		String filePath = dialog.open();

		return filePath;
	}

	/**
	 * Save a list of EObjects to the resource with the given URI.
	 * 
	 * @param eObjects the EObjects to be saved
	 * @param resourceURI the URI of the resource, which should be used to save the EObjects
	 * @throws IOException if saving to the resource fails
	 */
	public void saveEObjectToResource(List<? extends EObject> eObjects, URI resourceURI) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(resourceURI);
		EList<EObject> contents = resource.getContents();

		for (EObject eObject : eObjects) {
			contents.add(eObject);
		}

		contents.addAll(eObjects);
		resource.save(null);
	}

	/**
	 * Save an EObject to a resource.
	 * 
	 * @param eObject the object
	 * @param resourceURI the resources URI
	 * @throws IOException if saving to the resource fails.
	 */
	public void saveEObjectToResource(EObject eObject, URI resourceURI) throws IOException {
		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(eObject);
		saveEObjectToResource(list, resourceURI);
	}

}
