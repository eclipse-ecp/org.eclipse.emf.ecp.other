/**
 *
 * $Id$
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.validation;

import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;

import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;

/**
 * A sample validator interface for {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YHorizontalLayoutCellStyleValidator {
	boolean validate();

	boolean validateTarget(YEmbeddable value);
	boolean validateAlignment(YAlignment value);
}
