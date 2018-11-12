/**
 */
package bpmn.impl;

import bpmn.BPMNPackage;
import bpmn.Connection;
import bpmn.Figure;

import bpmn.Lane;
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
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.FigureImpl#getName <em>Name</em>}</li>
 *   <li>{@link bpmn.impl.FigureImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link bpmn.impl.FigureImpl#getConnectionTarget <em>Connection Target</em>}</li>
 *   <li>{@link bpmn.impl.FigureImpl#getConnectionSource <em>Connection Source</em>}</li>
 *   <li>{@link bpmn.impl.FigureImpl#getFigurecontentslane <em>Figurecontentslane</em>}</li>
 *   <li>{@link bpmn.impl.FigureImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FigureImpl extends MinimalEObjectImpl.Container implements Figure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getConnectionTarget() <em>Connection Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionTarget;

	/**
	 * The cached value of the '{@link #getConnectionSource() <em>Connection Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectionSource;

	/**
	 * The cached value of the '{@link #getFigurecontentslane() <em>Figurecontentslane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigurecontentslane()
	 * @generated
	 * @ordered
	 */
	protected Lane figurecontentslane;

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
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.FIGURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this,
					BPMNPackage.FIGURE__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionSource() {
		if (connectionSource == null) {
			connectionSource = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this,
					BPMNPackage.FIGURE__CONNECTION_SOURCE, BPMNPackage.CONNECTION__FROM);
		}
		return connectionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane getFigurecontentslane() {
		if (figurecontentslane != null && figurecontentslane.eIsProxy()) {
			InternalEObject oldFigurecontentslane = (InternalEObject) figurecontentslane;
			figurecontentslane = (Lane) eResolveProxy(oldFigurecontentslane);
			if (figurecontentslane != oldFigurecontentslane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.FIGURE__FIGURECONTENTSLANE,
							oldFigurecontentslane, figurecontentslane));
			}
		}
		return figurecontentslane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetFigurecontentslane() {
		return figurecontentslane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigurecontentslane(Lane newFigurecontentslane, NotificationChain msgs) {
		Lane oldFigurecontentslane = figurecontentslane;
		figurecontentslane = newFigurecontentslane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BPMNPackage.FIGURE__FIGURECONTENTSLANE, oldFigurecontentslane, newFigurecontentslane);
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
	public void setFigurecontentslane(Lane newFigurecontentslane) {
		if (newFigurecontentslane != figurecontentslane) {
			NotificationChain msgs = null;
			if (figurecontentslane != null)
				msgs = ((InternalEObject) figurecontentslane).eInverseRemove(this, BPMNPackage.LANE__LANEINCLUDEFIGURE,
						Lane.class, msgs);
			if (newFigurecontentslane != null)
				msgs = ((InternalEObject) newFigurecontentslane).eInverseAdd(this, BPMNPackage.LANE__LANEINCLUDEFIGURE,
						Lane.class, msgs);
			msgs = basicSetFigurecontentslane(newFigurecontentslane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.FIGURE__FIGURECONTENTSLANE,
					newFigurecontentslane, newFigurecontentslane));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.FIGURE__CREATION_DATE, oldCreationDate,
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
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionTarget()).basicAdd(otherEnd, msgs);
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectionSource()).basicAdd(otherEnd, msgs);
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			if (figurecontentslane != null)
				msgs = ((InternalEObject) figurecontentslane).eInverseRemove(this, BPMNPackage.LANE__LANEINCLUDEFIGURE,
						Lane.class, msgs);
			return basicSetFigurecontentslane((Lane) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectionTarget() {
		if (connectionTarget == null) {
			connectionTarget = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this,
					BPMNPackage.FIGURE__CONNECTION_TARGET, BPMNPackage.CONNECTION__TO);
		}
		return connectionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BPMNPackage.FIGURE__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			return ((InternalEList<?>) getConnectionTarget()).basicRemove(otherEnd, msgs);
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			return ((InternalEList<?>) getConnectionSource()).basicRemove(otherEnd, msgs);
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			return basicSetFigurecontentslane(null, msgs);
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
		case BPMNPackage.FIGURE__NAME:
			return getName();
		case BPMNPackage.FIGURE__CONNECTION:
			return getConnection();
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			return getConnectionTarget();
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			return getConnectionSource();
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			if (resolve)
				return getFigurecontentslane();
			return basicGetFigurecontentslane();
		case BPMNPackage.FIGURE__CREATION_DATE:
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
		case BPMNPackage.FIGURE__NAME:
			setName((String) newValue);
			return;
		case BPMNPackage.FIGURE__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends Connection>) newValue);
			return;
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			getConnectionTarget().clear();
			getConnectionTarget().addAll((Collection<? extends Connection>) newValue);
			return;
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			getConnectionSource().clear();
			getConnectionSource().addAll((Collection<? extends Connection>) newValue);
			return;
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			setFigurecontentslane((Lane) newValue);
			return;
		case BPMNPackage.FIGURE__CREATION_DATE:
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
		case BPMNPackage.FIGURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BPMNPackage.FIGURE__CONNECTION:
			getConnection().clear();
			return;
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			getConnectionTarget().clear();
			return;
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			getConnectionSource().clear();
			return;
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			setFigurecontentslane((Lane) null);
			return;
		case BPMNPackage.FIGURE__CREATION_DATE:
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
		case BPMNPackage.FIGURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BPMNPackage.FIGURE__CONNECTION:
			return connection != null && !connection.isEmpty();
		case BPMNPackage.FIGURE__CONNECTION_TARGET:
			return connectionTarget != null && !connectionTarget.isEmpty();
		case BPMNPackage.FIGURE__CONNECTION_SOURCE:
			return connectionSource != null && !connectionSource.isEmpty();
		case BPMNPackage.FIGURE__FIGURECONTENTSLANE:
			return figurecontentslane != null;
		case BPMNPackage.FIGURE__CREATION_DATE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //FigureImpl
