package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class is responsible to observe changes at a validatable and to forward
 * the changes to the validator.
 */
public class ValidationConfigToValidatorBridge extends AdapterImpl {

	private final EObject sourceValidatable;
	private final EObject targetValidator;

	private final Map<EStructuralFeature, EStructuralFeature> mapping;
	private boolean disposed;

	/**
	 * Creates an instance for the given values.
	 * 
	 * @param sourceValidatable
	 * @param sourceFeature
	 * @param targetValidator
	 * @param targetFeature
	 * @return
	 */
	public static ValidationConfigToValidatorBridge createObserver(
			EObject sourceValidatable, EStructuralFeature sourceFeature,
			EObject targetValidator, EStructuralFeature targetFeature) {

		return new ValidationConfigToValidatorBridge(sourceValidatable,
				targetValidator, Collections.singletonMap(sourceFeature,
						targetFeature));
	}

	public ValidationConfigToValidatorBridge(EObject sourceValidatable,
			EObject targetValidator,
			Map<EStructuralFeature, EStructuralFeature> mapping) {
		super();
		this.sourceValidatable = sourceValidatable;
		this.targetValidator = targetValidator;
		this.mapping = mapping;

		sourceValidatable.eAdapters().add(this);
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (disposed) {
			throw new IllegalStateException("Observer is disposed!");
		}

		EStructuralFeature sourceFeature = (EStructuralFeature) notification
				.getFeature();

		// if there is a mapping available, then set the value from
		// source#sourceFeature to target#targetFeature
		if (mapping.containsKey(sourceFeature)) {
			EStructuralFeature targetFeature = mapping.get(sourceFeature);
			targetValidator.eSet(targetFeature, notification.getNewValue());
		}
	}

	public void dispose() {
		try {
			sourceValidatable.eAdapters().remove(this);
			mapping.clear();
		} finally {
			disposed = true;
		}
	}

}
