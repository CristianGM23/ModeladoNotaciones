/**
 */
package e3Value.impl;

import e3Value.E3ValuePackage;
import e3Value.ResponsabilityElement;
import e3Value.ValueInterface;
import e3Value.ValuePortIn;
import e3Value.ValuePortOut;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getBindsResponsabilityElement <em>Binds Responsability Element</em>}</li>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getHasValuePortOut <em>Has Value Port Out</em>}</li>
 *   <li>{@link e3Value.impl.ValueInterfaceImpl#getHasValuePortIn <em>Has Value Port In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueInterfaceImpl extends MinimalEObjectImpl.Container implements ValueInterface {
	/**
	 * The cached value of the '{@link #getBindsResponsabilityElement() <em>Binds Responsability Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsResponsabilityElement()
	 * @generated
	 * @ordered
	 */
	protected ResponsabilityElement bindsResponsabilityElement;

	/**
	 * The cached value of the '{@link #getHasValuePortOut() <em>Has Value Port Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortOut()
	 * @generated
	 * @ordered
	 */
	protected ValuePortOut hasValuePortOut;

	/**
	 * The cached value of the '{@link #getHasValuePortIn() <em>Has Value Port In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValuePortIn()
	 * @generated
	 * @ordered
	 */
	protected ValuePortIn hasValuePortIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.VALUE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsabilityElement getBindsResponsabilityElement() {
		return bindsResponsabilityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement,
			NotificationChain msgs) {
		ResponsabilityElement oldBindsResponsabilityElement = bindsResponsabilityElement;
		bindsResponsabilityElement = newBindsResponsabilityElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, oldBindsResponsabilityElement,
					newBindsResponsabilityElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindsResponsabilityElement(ResponsabilityElement newBindsResponsabilityElement) {
		if (newBindsResponsabilityElement != bindsResponsabilityElement) {
			NotificationChain msgs = null;
			if (bindsResponsabilityElement != null)
				msgs = ((InternalEObject) bindsResponsabilityElement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, null,
						msgs);
			if (newBindsResponsabilityElement != null)
				msgs = ((InternalEObject) newBindsResponsabilityElement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, null,
						msgs);
			msgs = basicSetBindsResponsabilityElement(newBindsResponsabilityElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT, newBindsResponsabilityElement,
					newBindsResponsabilityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortOut getHasValuePortOut() {
		return hasValuePortOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValuePortOut(ValuePortOut newHasValuePortOut, NotificationChain msgs) {
		ValuePortOut oldHasValuePortOut = hasValuePortOut;
		hasValuePortOut = newHasValuePortOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, oldHasValuePortOut, newHasValuePortOut);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValuePortOut(ValuePortOut newHasValuePortOut) {
		if (newHasValuePortOut != hasValuePortOut) {
			NotificationChain msgs = null;
			if (hasValuePortOut != null)
				msgs = ((InternalEObject) hasValuePortOut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, null, msgs);
			if (newHasValuePortOut != null)
				msgs = ((InternalEObject) newHasValuePortOut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT, null, msgs);
			msgs = basicSetHasValuePortOut(newHasValuePortOut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT,
					newHasValuePortOut, newHasValuePortOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePortIn getHasValuePortIn() {
		return hasValuePortIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasValuePortIn(ValuePortIn newHasValuePortIn, NotificationChain msgs) {
		ValuePortIn oldHasValuePortIn = hasValuePortIn;
		hasValuePortIn = newHasValuePortIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, oldHasValuePortIn, newHasValuePortIn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasValuePortIn(ValuePortIn newHasValuePortIn) {
		if (newHasValuePortIn != hasValuePortIn) {
			NotificationChain msgs = null;
			if (hasValuePortIn != null)
				msgs = ((InternalEObject) hasValuePortIn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, null, msgs);
			if (newHasValuePortIn != null)
				msgs = ((InternalEObject) newHasValuePortIn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN, null, msgs);
			msgs = basicSetHasValuePortIn(newHasValuePortIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN,
					newHasValuePortIn, newHasValuePortIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
			return basicSetBindsResponsabilityElement(null, msgs);
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
			return basicSetHasValuePortOut(null, msgs);
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
			return basicSetHasValuePortIn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
			return getBindsResponsabilityElement();
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
			return getHasValuePortOut();
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
			return getHasValuePortIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
			setBindsResponsabilityElement((ResponsabilityElement) newValue);
			return;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
			setHasValuePortOut((ValuePortOut) newValue);
			return;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
			setHasValuePortIn((ValuePortIn) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
			setBindsResponsabilityElement((ResponsabilityElement) null);
			return;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
			setHasValuePortOut((ValuePortOut) null);
			return;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
			setHasValuePortIn((ValuePortIn) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case E3ValuePackage.VALUE_INTERFACE__BINDS_RESPONSABILITY_ELEMENT:
			return bindsResponsabilityElement != null;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_OUT:
			return hasValuePortOut != null;
		case E3ValuePackage.VALUE_INTERFACE__HAS_VALUE_PORT_IN:
			return hasValuePortIn != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueInterfaceImpl
