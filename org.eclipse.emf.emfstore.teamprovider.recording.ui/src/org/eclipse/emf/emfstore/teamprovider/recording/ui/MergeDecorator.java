package org.eclipse.emf.emfstore.teamprovider.recording.ui;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ArtifactRegistry;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.FileUtil;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;


public class MergeDecorator implements ILabelDecorator {

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public Image decorateImage(Image image, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	public String decorateText(String text, Object element) {
		if (element instanceof IFile) {
			IFile file = (IFile) element;
			URI uri = FileUtil.getUri(file);
			if (ArtifactRegistry.getInstance().isRegistered(uri)) {
				return "[R] " + file.getName();
			}
		}
		
		// no decoration
		return null;
	}

}
