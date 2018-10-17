/**
 */
package e3Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e3Value.E3ValueModel#getHasValueExchanges <em>Has Value Exchanges</em>}</li>
 *   <li>{@link e3Value.E3ValueModel#getHasValueObjects <em>Has Value Objects</em>}</li>
 *   <li>{@link e3Value.E3ValueModel#getHasBusinessActors <em>Has Business Actors</em>}</li>
 *   <li>{@link e3Value.E3ValueModel#getHasDependenceElements <em>Has Dependence Elements</em>}</li>
 * </ul>
 *
 * @see e3Value.E3ValuePackage#getE3ValueModel()
 * @model
 * @generated
 */
public interface E3ValueModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Value Exchanges</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Exchanges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Exchanges</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getE3ValueModel_HasValueExchanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueExchange> getHasValueExchanges();

	/**
	 * Returns the value of the '<em><b>Has Value Objects</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.ValueObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Value Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Value Objects</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getE3ValueModel_HasValueObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueObject> getHasValueObjects();

	/**
	 * Returns the value of the '<em><b>Has Business Actors</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.BusinessActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Business Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Business Actors</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getE3ValueModel_HasBusinessActors()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessActor> getHasBusinessActors();

	/**
	 * Returns the value of the '<em><b>Has Dependence Elements</b></em>' containment reference list.
	 * The list contents are of type {@link e3Value.DependencyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependence Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependence Elements</em>' containment reference list.
	 * @see e3Value.E3ValuePackage#getE3ValueModel_HasDependenceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyElement> getHasDependenceElements();

} // E3ValueModel
