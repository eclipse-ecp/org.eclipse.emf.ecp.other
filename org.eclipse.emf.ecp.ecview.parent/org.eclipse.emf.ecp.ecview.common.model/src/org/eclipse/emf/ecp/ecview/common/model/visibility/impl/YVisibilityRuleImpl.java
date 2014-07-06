/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YVisibility Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl#getBindingEndpoints <em>Binding Endpoints</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityRuleImpl#isMatchMeansFalse <em>Match Means False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YVisibilityRuleImpl extends MinimalEObjectImpl.Container
		implements YVisibilityRule {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBindingEndpoints() <em>Binding Endpoints</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBindingEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<YVisibilityRuleBindingEndpoint> bindingEndpoints;

	/**
	 * The default value of the '{@link #isMatchMeansFalse() <em>Match Means False</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isMatchMeansFalse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATCH_MEANS_FALSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMatchMeansFalse() <em>Match Means False</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isMatchMeansFalse()
	 * @generated
	 * @ordered
	 */
	protected boolean matchMeansFalse = MATCH_MEANS_FALSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YVisibilityRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YVISIBILITY_RULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YVisibilityRuleBindingEndpoint> getBindingEndpoints() {
		if (bindingEndpoints == null) {
			bindingEndpoints = new EObjectWithInverseResolvingEList<YVisibilityRuleBindingEndpoint>(YVisibilityRuleBindingEndpoint.class, this, VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS, VisibilityPackage.YVISIBILITY_RULE_BINDING_ENDPOINT__RULE);
		}
		return bindingEndpoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatchMeansFalse() {
		return matchMeansFalse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchMeansFalse(boolean newMatchMeansFalse) {
		boolean oldMatchMeansFalse = matchMeansFalse;
		matchMeansFalse = newMatchMeansFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE, oldMatchMeansFalse, matchMeansFalse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityRuleBindingEndpoint createRuleEndpointGen(String attribute) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YVisibilityRuleBindingEndpoint createRuleEndpoint(String attribute) {
		YVisibilityRuleBindingEndpoint yEndpoint = VisibilityFactory.eINSTANCE
				.createYVisibilityRuleBindingEndpoint();
		yEndpoint.setRule(this);
		yEndpoint.setAttribute(attribute);
		return yEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindingEndpoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				return ((InternalEList<?>)getBindingEndpoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__ID:
				return getId();
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				return getBindingEndpoints();
			case VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE:
				return isMatchMeansFalse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__ID:
				setId((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				getBindingEndpoints().clear();
				getBindingEndpoints().addAll((Collection<? extends YVisibilityRuleBindingEndpoint>)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE:
				setMatchMeansFalse((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				getBindingEndpoints().clear();
				return;
			case VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE:
				setMatchMeansFalse(MATCH_MEANS_FALSE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VisibilityPackage.YVISIBILITY_RULE__BINDING_ENDPOINTS:
				return bindingEndpoints != null && !bindingEndpoints.isEmpty();
			case VisibilityPackage.YVISIBILITY_RULE__MATCH_MEANS_FALSE:
				return matchMeansFalse != MATCH_MEANS_FALSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VisibilityPackage.YVISIBILITY_RULE___CREATE_RULE_ENDPOINT__STRING:
				return createRuleEndpoint((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", matchMeansFalse: ");
		result.append(matchMeansFalse);
		result.append(')');
		return result.toString();
	}

} // YVisibilityRuleImpl
