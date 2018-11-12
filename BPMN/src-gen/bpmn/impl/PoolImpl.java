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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.PoolImpl#getNamePool <em>Name Pool</em>}</li>
 *   <li>{@link bpmn.impl.PoolImpl#getSwimlane <em>Swimlane</em>}</li>
 *   <li>{@link bpmn.impl.PoolImpl#getLanerelationpool <em>Lanerelationpool</em>}</li>
 *   <li>{@link bpmn.impl.PoolImpl#getChildpool <em>Childpool</em>}</li>
 *   <li>{@link bpmn.impl.PoolImpl#getFatherpool <em>Fatherpool</em>}</li>
 *   <li>{@link bpmn.impl.PoolImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoolImpl extends MinimalEObjectImpl.Container implements Pool {
	/**
	 * The default value of the '{@link #getNamePool() <em>Name Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePool()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamePool() <em>Name Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePool()
	 * @generated
	 * @ordered
	 */
	protected String namePool = NAME_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSwimlane() <em>Swimlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwimlane()
	 * @generated
	 * @ordered
	 */
	protected Swimlane swimlane;

	/**
	 * The cached value of the '{@link #getLanerelationpool() <em>Lanerelationpool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanerelationpool()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanerelationpool;

	/**
	 * The cached value of the '{@link #getChildpool() <em>Childpool</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildpool()
	 * @generated
	 * @ordered
	 */
	protected EList<Pool> childpool;

	/**
	 * The cached value of the '{@link #getFatherpool() <em>Fatherpool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatherpool()
	 * @generated
	 * @ordered
	 */
	protected Pool fatherpool;

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
	protected PoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.POOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamePool() {
		return namePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamePool(String newNamePool) {
		String oldNamePool = namePool;
		namePool = newNamePool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__NAME_POOL, oldNamePool, namePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane getSwimlane() {
		if (swimlane != null && swimlane.eIsProxy()) {
			InternalEObject oldSwimlane = (InternalEObject) swimlane;
			swimlane = (Swimlane) eResolveProxy(oldSwimlane);
			if (swimlane != oldSwimlane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.POOL__SWIMLANE, oldSwimlane,
							swimlane));
			}
		}
		return swimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane basicGetSwimlane() {
		return swimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwimlane(Swimlane newSwimlane, NotificationChain msgs) {
		Swimlane oldSwimlane = swimlane;
		swimlane = newSwimlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__SWIMLANE,
					oldSwimlane, newSwimlane);
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
	public void setSwimlane(Swimlane newSwimlane) {
		if (newSwimlane != swimlane) {
			NotificationChain msgs = null;
			if (swimlane != null)
				msgs = ((InternalEObject) swimlane).eInverseRemove(this, BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE,
						Swimlane.class, msgs);
			if (newSwimlane != null)
				msgs = ((InternalEObject) newSwimlane).eInverseAdd(this, BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE,
						Swimlane.class, msgs);
			msgs = basicSetSwimlane(newSwimlane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__SWIMLANE, newSwimlane,
					newSwimlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanerelationpool() {
		if (lanerelationpool == null) {
			lanerelationpool = new EObjectWithInverseResolvingEList<Lane>(Lane.class, this,
					BPMNPackage.POOL__LANERELATIONPOOL, BPMNPackage.LANE__POOLRELATIONLANE);
		}
		return lanerelationpool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pool> getChildpool() {
		if (childpool == null) {
			childpool = new EObjectWithInverseResolvingEList<Pool>(Pool.class, this, BPMNPackage.POOL__CHILDPOOL,
					BPMNPackage.POOL__FATHERPOOL);
		}
		return childpool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool getFatherpool() {
		if (fatherpool != null && fatherpool.eIsProxy()) {
			InternalEObject oldFatherpool = (InternalEObject) fatherpool;
			fatherpool = (Pool) eResolveProxy(oldFatherpool);
			if (fatherpool != oldFatherpool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.POOL__FATHERPOOL,
							oldFatherpool, fatherpool));
			}
		}
		return fatherpool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pool basicGetFatherpool() {
		return fatherpool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFatherpool(Pool newFatherpool, NotificationChain msgs) {
		Pool oldFatherpool = fatherpool;
		fatherpool = newFatherpool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__FATHERPOOL,
					oldFatherpool, newFatherpool);
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
	public void setFatherpool(Pool newFatherpool) {
		if (newFatherpool != fatherpool) {
			NotificationChain msgs = null;
			if (fatherpool != null)
				msgs = ((InternalEObject) fatherpool).eInverseRemove(this, BPMNPackage.POOL__CHILDPOOL, Pool.class,
						msgs);
			if (newFatherpool != null)
				msgs = ((InternalEObject) newFatherpool).eInverseAdd(this, BPMNPackage.POOL__CHILDPOOL, Pool.class,
						msgs);
			msgs = basicSetFatherpool(newFatherpool, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__FATHERPOOL, newFatherpool,
					newFatherpool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.POOL__CREATION_DATE, oldCreationDate,
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
		case BPMNPackage.POOL__SWIMLANE:
			if (swimlane != null)
				msgs = ((InternalEObject) swimlane).eInverseRemove(this, BPMNPackage.SWIMLANE__POOLINCLUDESWIMLANE,
						Swimlane.class, msgs);
			return basicSetSwimlane((Swimlane) otherEnd, msgs);
		case BPMNPackage.POOL__LANERELATIONPOOL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLanerelationpool()).basicAdd(otherEnd, msgs);
		case BPMNPackage.POOL__CHILDPOOL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildpool()).basicAdd(otherEnd, msgs);
		case BPMNPackage.POOL__FATHERPOOL:
			if (fatherpool != null)
				msgs = ((InternalEObject) fatherpool).eInverseRemove(this, BPMNPackage.POOL__CHILDPOOL, Pool.class,
						msgs);
			return basicSetFatherpool((Pool) otherEnd, msgs);
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
		case BPMNPackage.POOL__SWIMLANE:
			return basicSetSwimlane(null, msgs);
		case BPMNPackage.POOL__LANERELATIONPOOL:
			return ((InternalEList<?>) getLanerelationpool()).basicRemove(otherEnd, msgs);
		case BPMNPackage.POOL__CHILDPOOL:
			return ((InternalEList<?>) getChildpool()).basicRemove(otherEnd, msgs);
		case BPMNPackage.POOL__FATHERPOOL:
			return basicSetFatherpool(null, msgs);
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
		case BPMNPackage.POOL__NAME_POOL:
			return getNamePool();
		case BPMNPackage.POOL__SWIMLANE:
			if (resolve)
				return getSwimlane();
			return basicGetSwimlane();
		case BPMNPackage.POOL__LANERELATIONPOOL:
			return getLanerelationpool();
		case BPMNPackage.POOL__CHILDPOOL:
			return getChildpool();
		case BPMNPackage.POOL__FATHERPOOL:
			if (resolve)
				return getFatherpool();
			return basicGetFatherpool();
		case BPMNPackage.POOL__CREATION_DATE:
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
		case BPMNPackage.POOL__NAME_POOL:
			setNamePool((String) newValue);
			return;
		case BPMNPackage.POOL__SWIMLANE:
			setSwimlane((Swimlane) newValue);
			return;
		case BPMNPackage.POOL__LANERELATIONPOOL:
			getLanerelationpool().clear();
			getLanerelationpool().addAll((Collection<? extends Lane>) newValue);
			return;
		case BPMNPackage.POOL__CHILDPOOL:
			getChildpool().clear();
			getChildpool().addAll((Collection<? extends Pool>) newValue);
			return;
		case BPMNPackage.POOL__FATHERPOOL:
			setFatherpool((Pool) newValue);
			return;
		case BPMNPackage.POOL__CREATION_DATE:
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
		case BPMNPackage.POOL__NAME_POOL:
			setNamePool(NAME_POOL_EDEFAULT);
			return;
		case BPMNPackage.POOL__SWIMLANE:
			setSwimlane((Swimlane) null);
			return;
		case BPMNPackage.POOL__LANERELATIONPOOL:
			getLanerelationpool().clear();
			return;
		case BPMNPackage.POOL__CHILDPOOL:
			getChildpool().clear();
			return;
		case BPMNPackage.POOL__FATHERPOOL:
			setFatherpool((Pool) null);
			return;
		case BPMNPackage.POOL__CREATION_DATE:
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
		case BPMNPackage.POOL__NAME_POOL:
			return NAME_POOL_EDEFAULT == null ? namePool != null : !NAME_POOL_EDEFAULT.equals(namePool);
		case BPMNPackage.POOL__SWIMLANE:
			return swimlane != null;
		case BPMNPackage.POOL__LANERELATIONPOOL:
			return lanerelationpool != null && !lanerelationpool.isEmpty();
		case BPMNPackage.POOL__CHILDPOOL:
			return childpool != null && !childpool.isEmpty();
		case BPMNPackage.POOL__FATHERPOOL:
			return fatherpool != null;
		case BPMNPackage.POOL__CREATION_DATE:
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
		result.append(" (namePool: ");
		result.append(namePool);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //PoolImpl
