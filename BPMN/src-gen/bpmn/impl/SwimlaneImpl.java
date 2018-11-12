/**
 */
package bpmn.impl;

import bpmn.BPMNPackage;
import bpmn.Lane;
import bpmn.Pool;
import bpmn.Swimlane;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swimlane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getPool <em>Pool</em>}</li>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getNameSwimlane <em>Name Swimlane</em>}</li>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getPoolincludeswimlane <em>Poolincludeswimlane</em>}</li>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getLaneincludeswimlane <em>Laneincludeswimlane</em>}</li>
 *   <li>{@link bpmn.impl.SwimlaneImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwimlaneImpl extends MinimalEObjectImpl.Container implements Swimlane {
	/**
	 * The cached value of the '{@link #getLane() <em>Lane</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLane()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lane;

	/**
	 * The cached value of the '{@link #getPool() <em>Pool</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPool()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> pool;

	/**
	 * The default value of the '{@link #getNameSwimlane() <em>Name Swimlane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSwimlane()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SWIMLANE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSwimlane() <em>Name Swimlane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSwimlane()
	 * @generated
	 * @ordered
	 */
	protected String nameSwimlane = NAME_SWIMLANE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoolincludeswimlane() <em>Poolincludeswimlane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolincludeswimlane()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> poolincludeswimlane;

	/**
	 * The cached value of the '{@link #getLaneincludeswimlane() <em>Laneincludeswimlane</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaneincludeswimlane()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> laneincludeswimlane;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected String creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.SWIMLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLane() {
		if (lane == null) {
			lane = new EObjectContainmentEList<Lane>(Lane.class, this, BPMNPackage.SWIMLANE__LANE);
		}
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pool> getPool() {
		if (pool == null) {
			pool = new EObjectContainmentEList<Pool>(Pool.class, this, BPMNPackage.SWIMLANE__POOL);
		}
		return pool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSwimlane() {
		return nameSwimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSwimlane(String newNameSwimlane) {
		String oldNameSwimlane = nameSwimlane;
		nameSwimlane = newNameSwimlane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.SWIMLANE__NAME_SWIMLANE, oldNameSwimlane,
					nameSwimlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pool> getPoolincludeswimlane() {
		if (poolincludeswimlane == null) {
			poolincludeswimlane = new EObjectWithInverseResolvingEList<Pool>(Pool.class, this,
					BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE, BPMNPackage.POOL__SWIMLANE);
		}
		return poolincludeswimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLaneincludeswimlane() {
		if (laneincludeswimlane == null) {
			laneincludeswimlane = new EObjectWithInverseResolvingEList<Lane>(Lane.class, this,
					BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE, BPMNPackage.LANE__LANERELATIONSWIMLINE);
		}
		return laneincludeswimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(String newCreationDate) {
		String oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.SWIMLANE__CREATION_DATE, oldCreationDate,
					creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPoolincludeswimlane()).basicAdd(otherEnd,
					msgs);
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLaneincludeswimlane()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.SWIMLANE__LANE:
			return ((InternalEList<?>) getLane()).basicRemove(otherEnd, msgs);
		case BPMNPackage.SWIMLANE__POOL:
			return ((InternalEList<?>) getPool()).basicRemove(otherEnd, msgs);
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			return ((InternalEList<?>) getPoolincludeswimlane()).basicRemove(otherEnd, msgs);
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			return ((InternalEList<?>) getLaneincludeswimlane()).basicRemove(otherEnd, msgs);
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
		case BPMNPackage.SWIMLANE__LANE:
			return getLane();
		case BPMNPackage.SWIMLANE__POOL:
			return getPool();
		case BPMNPackage.SWIMLANE__NAME_SWIMLANE:
			return getNameSwimlane();
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			return getPoolincludeswimlane();
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			return getLaneincludeswimlane();
		case BPMNPackage.SWIMLANE__CREATION_DATE:
			return getCreationDate();
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
		case BPMNPackage.SWIMLANE__LANE:
			getLane().clear();
			getLane().addAll((Collection<? extends Lane>) newValue);
			return;
		case BPMNPackage.SWIMLANE__POOL:
			getPool().clear();
			getPool().addAll((Collection<? extends Pool>) newValue);
			return;
		case BPMNPackage.SWIMLANE__NAME_SWIMLANE:
			setNameSwimlane((String) newValue);
			return;
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			getPoolincludeswimlane().clear();
			getPoolincludeswimlane().addAll((Collection<? extends Pool>) newValue);
			return;
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			getLaneincludeswimlane().clear();
			getLaneincludeswimlane().addAll((Collection<? extends Lane>) newValue);
			return;
		case BPMNPackage.SWIMLANE__CREATION_DATE:
			setCreationDate((String) newValue);
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
		case BPMNPackage.SWIMLANE__LANE:
			getLane().clear();
			return;
		case BPMNPackage.SWIMLANE__POOL:
			getPool().clear();
			return;
		case BPMNPackage.SWIMLANE__NAME_SWIMLANE:
			setNameSwimlane(NAME_SWIMLANE_EDEFAULT);
			return;
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			getPoolincludeswimlane().clear();
			return;
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			getLaneincludeswimlane().clear();
			return;
		case BPMNPackage.SWIMLANE__CREATION_DATE:
			setCreationDate(CREATION_DATE_EDEFAULT);
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
		case BPMNPackage.SWIMLANE__LANE:
			return lane != null && !lane.isEmpty();
		case BPMNPackage.SWIMLANE__POOL:
			return pool != null && !pool.isEmpty();
		case BPMNPackage.SWIMLANE__NAME_SWIMLANE:
			return NAME_SWIMLANE_EDEFAULT == null ? nameSwimlane != null : !NAME_SWIMLANE_EDEFAULT.equals(nameSwimlane);
		case BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE:
			return poolincludeswimlane != null && !poolincludeswimlane.isEmpty();
		case BPMNPackage.SWIMLANE__LANEINCLUDESWIMLANE:
			return laneincludeswimlane != null && !laneincludeswimlane.isEmpty();
		case BPMNPackage.SWIMLANE__CREATION_DATE:
			return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameSwimlane: ");
		result.append(nameSwimlane);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //SwimlaneImpl
