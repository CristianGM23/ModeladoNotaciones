/**
 */
package e3Value.impl;

import e3Value.BusinessActor;
import e3Value.DependencyElement;
import e3Value.E3ValueModel;
import e3Value.E3ValuePackage;
import e3Value.ValueExchange;
import e3Value.ValueObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e3Value.impl.E3ValueModelImpl#getHasValueExchanges <em>Has Value Exchanges</em>}</li>
 *   <li>{@link e3Value.impl.E3ValueModelImpl#getHasValueObjects <em>Has Value Objects</em>}</li>
 *   <li>{@link e3Value.impl.E3ValueModelImpl#getHasBusinessActors <em>Has Business Actors</em>}</li>
 *   <li>{@link e3Value.impl.E3ValueModelImpl#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class E3ValueModelImpl extends MinimalEObjectImpl.Container implements E3ValueModel {
	/**
	 * The cached value of the '{@link #getHasValueExchanges() <em>Has Value Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueExchange> hasValueExchanges;

	/**
	 * The cached value of the '{@link #getHasValueObjects() <em>Has Value Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasValueObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueObject> hasValueObjects;

	/**
	 * The cached value of the '{@link #getHasBusinessActors() <em>Has Business Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBusinessActors()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessActor> hasBusinessActors;

	/**
	 * The cached value of the '{@link #getHasDependenceElements() <em>Has Dependence Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDependenceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyElement> hasDependenceElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E3ValueModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return E3ValuePackage.Literals.E3_VALUE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueExchange> getHasValueExchanges() {
		if (hasValueExchanges == null) {
			hasValueExchanges = new EObjectContainmentEList<ValueExchange>(ValueExchange.class, this,
					E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES);
		}
		return hasValueExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueObject> getHasValueObjects() {
		if (hasValueObjects == null) {
			hasValueObjects = new EObjectContainmentEList<ValueObject>(ValueObject.class, this,
					E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS);
		}
		return hasValueObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessActor> getHasBusinessActors() {
		if (hasBusinessActors == null) {
			hasBusinessActors = new EObjectContainmentEList<BusinessActor>(BusinessActor.class, this,
					E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS);
		}
		return hasBusinessActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyElement> getHasDependenceElements() {
		if (hasDependenceElements == null) {
			hasDependenceElements = new EObjectContainmentEList<DependencyElement>(DependencyElement.class, this,
					E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS);
		}
		return hasDependenceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			return ((InternalEList<?>) getHasValueExchanges()).basicRemove(otherEnd, msgs);
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
			return ((InternalEList<?>) getHasValueObjects()).basicRemove(otherEnd, msgs);
		case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			return ((InternalEList<?>) getHasBusinessActors()).basicRemove(otherEnd, msgs);
		case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
			return ((InternalEList<?>) getHasDependenceElements()).basicRemove(otherEnd, msgs);
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
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			return getHasValueExchanges();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
			return getHasValueObjects();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			return getHasBusinessActors();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
			return getHasDependenceElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			getHasValueExchanges().clear();
			getHasValueExchanges().addAll((Collection<? extends ValueExchange>) newValue);
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
			getHasValueObjects().clear();
			getHasValueObjects().addAll((Collection<? extends ValueObject>) newValue);
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			getHasBusinessActors().clear();
			getHasBusinessActors().addAll((Collection<? extends BusinessActor>) newValue);
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
			getHasDependenceElements().clear();
			getHasDependenceElements().addAll((Collection<? extends DependencyElement>) newValue);
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
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			getHasValueExchanges().clear();
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
			getHasValueObjects().clear();
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			getHasBusinessActors().clear();
			return;
		case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
			getHasDependenceElements().clear();
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
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_EXCHANGES:
			return hasValueExchanges != null && !hasValueExchanges.isEmpty();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_VALUE_OBJECTS:
			return hasValueObjects != null && !hasValueObjects.isEmpty();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_BUSINESS_ACTORS:
			return hasBusinessActors != null && !hasBusinessActors.isEmpty();
		case E3ValuePackage.E3_VALUE_MODEL__HAS_DEPENDENCE_ELEMENTS:
			return hasDependenceElements != null && !hasDependenceElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //E3ValueModelImpl
