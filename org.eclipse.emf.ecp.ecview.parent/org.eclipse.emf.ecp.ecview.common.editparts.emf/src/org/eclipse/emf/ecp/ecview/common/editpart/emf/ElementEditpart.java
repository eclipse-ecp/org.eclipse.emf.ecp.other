/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpartProvider;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the main edit part. <br>
 * The whole ui is based on an ui model which is built by emf. And each edit
 * part is based on an EObject (ui model element) that is given in the
 * initialize method and contains all information required to render the ui
 * element. The edit part is just the controller that renders the ui but the
 * informations how to render is given by the EObject.
 * <p>
 * For general, edit parts have 3 different kind of methods. <br>
 * <h3>API</h3> API are public methods that are declared by the interfaces. They
 * can be used to create the ui based on the edit parts like
 * <p>
 * <code>
 * layoutEditpart.addElement(element)
 * </code>
 * <p>
 * Internally these methods do not handle the calls directly, but will delegate
 * to the underlying EMF model. What means, that the implementation of the
 * public methods do not create ui, but just changes the EObject.
 * 
 * <h3>EMF adpater</h3>
 * Since each edit part inherits {@link Adapter} and observes all the
 * notifications from the assigned element, the changes made by the public API
 * methods will notify the {@link #notifyChanged(Notification)} method that
 * delegates the call to the handleModel_... methods.<br>
 * 
 * <h3>Internal methods</h3> The handleModel_... methods interpret the model
 * change and invoke the internal... methods. These are responsible to make the
 * changes to internal state of the edit part.
 * 
 * <h3>Advantage</h3> The advantage of that pattern is to provide a very
 * flexible API. The ui can be built up by the edit parts, but it can be also
 * defined based on the underlying emf model.
 * 
 * <h3>Presenters</h3> The presenter used to render the ui by a special ui-kit
 * may use databinding. Therefore they can bind the emf model directly to become
 * notified of changes to the ui model. But they can also bind the edit parts
 * properties. But attention! Binding an edit part can only notify about edit
 * part related changes. For instance, if a new edit part was prepared based on
 * a model change. All returned lists for <code>"List get[Element]()"</code>
 * should return an unmodifiable bindable list representation like a
 * UnmodifiableObservableList.
 * <p>
 * 
 * @param <M>
 */
public abstract class ElementEditpart<M extends YElement> extends AdapterImpl
		implements IElementEditpart, IElementEditpartProvider {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ElementEditpart.class);

	private final PropertyChangeSupport changeSupport;

	private boolean disposed;
	private List<IDisposable.Listener> disposeListeners;
	private M model;
	private String id;

	/**
	 * Returns the edit part for the given model yElement.
	 * 
	 * @param <A>
	 *            An instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	public static <A extends IElementEditpart> A findEditPartFor(
			YElement yElement) {
		return EditpartManager.findEditPartFor(yElement);
	}

	/**
	 * Returns an existing edit part or creates a new one.
	 * 
	 * @param <A>
	 *            An instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	public static <A extends IElementEditpart> A getEditpart(YElement yElement) {
		if (yElement == null) {
			return null;
		}

		A editPart = findEditPartFor(yElement);
		if (editPart != null) {
			return editPart;
		}
		return DelegatingEditPartManager.getInstance().getEditpart(yElement);
	}

	/**
	 * The default constructor.
	 */
	protected ElementEditpart() {
		changeSupport = new PropertyChangeSupport(this);
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param listener
	 *            the listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * Adds the given property change listener to the change support.
	 * 
	 * @param property
	 *            the property
	 * @param listener
	 *            the listener to be added
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(property, listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param listener
	 *            the listener to be added
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * Removes the given property change listener from the change support.
	 * 
	 * @param property
	 *            the property
	 * @param listener
	 *            the listener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String property,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(property, listener);
	}

	/**
	 * Fires the property changed event.
	 * 
	 * @param property
	 *            the property
	 * @param oldValue
	 *            the oldValue
	 * @param newValue
	 *            the newValue
	 * @see java.beans.PropertyChangeSupport#firePropertyChange(String, Object,
	 *      Object)
	 */
	protected void firePropertyChanged(String property, Object oldValue,
			Object newValue) {
		changeSupport.firePropertyChange(property, oldValue, newValue);
	}

	/**
	 * Fires the property changed event.
	 * 
	 * @param property
	 *            the property
	 * @param notification
	 *            the notification
	 */
	protected void firePropertyChanged(String property,
			Notification notification) {
		firePropertyChanged(property, notification.getOldValue(),
				notification.getNewValue());
	}

	/**
	 * Fires the property changed event for edit part properties. The new and
	 * old values are resolved to edit parts.
	 * 
	 * @param property
	 *            the property
	 * @param notification
	 *            the notification
	 */
	protected void firePropertyChangedEditpart(String property,
			Notification notification) {
		firePropertyChanged(property,
				getEditpart((YElement) notification.getOldValue()),
				getEditpart((YElement) notification.getNewValue()));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getId() {
		checkDisposed();

		return id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public M getModel() {
		checkDisposed();

		return model;
	}

	/**
	 * Is called to initialize this edit part with the given model. The editpart
	 * will be built based on the given model.
	 * 
	 * @param model
	 *            the model element
	 */
	public void initialize(M model) {
		checkDisposed();

		if (this.model != null) {
			LOGGER.error("Editparts must only be initialized once!");
			throw new IllegalStateException(
					"Editparts must only be initialized once!");
		}

		for (Adapter adapter : castEObject(model).eAdapters()) {
			if (adapter instanceof IElementEditpartProvider) {
				LOGGER.error("For a modelelement instance only one editpart can be created!");
				throw new RuntimeException(
						"For a modelelement instance only one editpart can be created!");
			}
		}

		this.model = model;
		id = model.getId();
		if (id == null || id.equals("")) {
			id = UUID.randomUUID().toString();
			model.setId(id);
		}

		registerAdapter(this);
	}

	/**
	 * Casts element to eObject.
	 * 
	 * @param element
	 * @return
	 */
	protected EObject castEObject(M element) {
		return (EObject) element;
	}

	/**
	 * Is called to initialize this edit part. Since no model is given, a new
	 * model will be instantiated.
	 * 
	 * @param element
	 */
	public void initialize() {
		checkDisposed();

		initialize(createModel());
	}

	/**
	 * Has to return a new initialized instance of the model element that is
	 * responsible for the edit part.
	 * 
	 * @return model
	 */
	protected abstract M createModel();

	/**
	 * Implementation of {@link IElementEditpartProvider} and returns
	 * <code>this</code> in that special case.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public IElementEditpart getEditpart() {
		checkDisposed();

		return this;
	}

	/**
	 * Registers an adapter at the model element.
	 * 
	 * @param adapter
	 *            The adapter to be added to the model element
	 */
	protected void registerAdapter(Adapter adapter) {
		checkDisposed();

		EObject eObject = castEObject(model);
		if (!eObject.eAdapters().contains(adapter)) {
			eObject.eAdapters().add(adapter);
		}
	}

	/**
	 * Unregisters an adapter at the model element.
	 * 
	 * @param adapter
	 *            The adapter to be removed from the model element
	 */
	protected void unregisterAdapter(Adapter adapter) {
		castEObject(model).eAdapters().remove(adapter);
	}

	/**
	 * Is called by the emf model element, if state changed.
	 * 
	 * @param notification
	 *            notification to be processed
	 */
	public void notifyChanged(Notification notification) {
		int featureId = notification.getFeatureID(YElement.class);
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleModelAdd(featureId, notification);
			break;
		case Notification.REMOVE:
			handleModelRemove(featureId, notification);
			break;
		case Notification.MOVE:
			handleModelMove(featureId, notification);
			break;
		case Notification.SET:
			handleModelSet(featureId, notification);
			break;
		default:

		}
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the add-event to
	 * be handled by subclasses.
	 * 
	 * @param featureId
	 *            The featureId the notication belongs to
	 * @param notification
	 *            The notfication
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the remove-event
	 * to be handled by subclasses.
	 * 
	 * @param featureId
	 *            The featureId the notication belongs to
	 * @param notification
	 *            The notfication
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the move-event to
	 * be handled by subclasses.
	 * 
	 * @param featureId
	 *            The featureId the notication belongs to
	 * @param notification
	 *            The notfication
	 */
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();
	}

	/**
	 * Is called from {@link #notifyChanged(Notification)} for the set-event to
	 * be handled by subclasses.
	 * 
	 * @param featureId
	 *            The featureId the notication belongs to
	 * @param notification
	 *            The notfication
	 */
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		if (featureId == CoreModelPackage.YELEMENT__ID) {
			throw new IllegalArgumentException("The id must never be changed!");
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		if (!isDisposed()) {
			internalDispose();
		}
	}

	/**
	 * Is called to dispose all this instance.
	 */
	protected void internalDispose() {
		try {
			// unregisters the observer from observing the model
			unregisterAdapter(this);

			// first call the dispose listener and the set disposed=true
			notifyDisposeListeners();
		} finally {
			disposed = true;
		}
	}

	/**
	 * Checks whether the element is disposed. Throws a DisposeException is the
	 * element is disposed.
	 * 
	 * @throws DisposeException
	 */
	protected void checkDisposed() {
		IDisposable.DisposableUtil.checkDisposed(this);
	}

	@Override
	public void addDisposeListener(Listener listener) {
		checkDisposed();

		if (listener == null) {
			return;
		}

		if (disposeListeners == null) {
			disposeListeners = new ArrayList<IDisposable.Listener>();
		}

		if (!disposeListeners.contains(listener)) {
			disposeListeners.add(listener);
		}
	}

	@Override
	public void removeDisposeListener(Listener listener) {
		checkDisposed();

		if (listener == null || disposeListeners == null) {
			return;
		}

		disposeListeners.remove(listener);
	}

	/**
	 * Notifies all listeners about the disposal of that elemenyElement
	 **/
	protected void notifyDisposeListeners() {
		if (disposeListeners == null) {
			return;
		}

		for (IDisposable.Listener listener : disposeListeners
				.toArray(new IDisposable.Listener[disposeListeners.size()])) {
			listener.notifyDisposed(this);
		}
	}
}
