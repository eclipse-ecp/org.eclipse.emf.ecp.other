/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.validation;

import org.eclipse.emf.ecp.ecview.common.model.visibility.YColor;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YVisibilityPropertiesValidator {
	boolean validate();

	boolean validateVisible(boolean value);
	boolean validateEditable(boolean value);
	boolean validateEnabled(boolean value);
	boolean validateBorder(boolean value);
	boolean validateBold(boolean value);
	boolean validateItalic(boolean value);
	boolean validateStrikethrough(boolean value);
	boolean validateUnderline(boolean value);
	boolean validateBackgroundColor(YColor value);
	boolean validateForegroundColor(YColor value);
}
