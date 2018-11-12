/**
 */
package bpmn.impl;

import bpmn.BPMNPackage;
import bpmn.Elements;
import bpmn.Group;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bpmn.impl.GroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link bpmn.impl.GroupImpl#getElementsGroup <em>Elements Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends FigureImpl implements Group {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Elements> elements;

	/**
	 * The cached value of the '{@link #getElementsGroup() <em>Elements Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Elements> elementsGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elements> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Elements>(Elements.class, this, BPMNPackage.GROUP__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elements> getElementsGroup() {
		if (elementsGroup == null) {
			elementsGroup = new EObjectWithInverseResolvingEList<Elements>(Elements.class, this,
					BPMNPackage.GROUP__ELEMENTS_GROUP, BPMNPackage.ELEMENTS__GROUP);
		}
		return elementsGroup;
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
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElementsGroup()).basicAdd(otherEnd, msgs);
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
		case BPMNPackage.GROUP__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			return ((InternalEList<?>) getElementsGroup()).basicRemove(otherEnd, msgs);
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
		case BPMNPackage.GROUP__ELEMENTS:
			return getElements();
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			return getElementsGroup();
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
		case BPMNPackage.GROUP__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Elements>) newValue);
			return;
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			getElementsGroup().clear();
			getElementsGroup().addAll((Collection<? extends Elements>) newValue);
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
		case BPMNPackage.GROUP__ELEMENTS:
			getElements().clear();
			return;
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			getElementsGroup().clear();
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
		case BPMNPackage.GROUP__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case BPMNPackage.GROUP__ELEMENTS_GROUP:
			return elementsGroup != null && !elementsGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
