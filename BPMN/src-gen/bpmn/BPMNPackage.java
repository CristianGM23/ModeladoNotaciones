/**
 */
package bpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bpmn.BPMNFactory
 * @model kind="package"
 * @generated
 */
public interface BPMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bpmn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNPackage eINSTANCE = bpmn.impl.BPMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link bpmn.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.LaneImpl
	 * @see bpmn.impl.BPMNPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 0;

	/**
	 * The feature id for the '<em><b>Name Lane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME_LANE = 0;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__FIGURE = 1;

	/**
	 * The feature id for the '<em><b>Poolrelationlane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__POOLRELATIONLANE = 2;

	/**
	 * The feature id for the '<em><b>Laneincludefigure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LANEINCLUDEFIGURE = 3;

	/**
	 * The feature id for the '<em><b>Lanerelationswimline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LANERELATIONSWIMLINE = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__CREATION_DATE = 5;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ConnectionImpl
	 * @see bpmn.impl.BPMNPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CREATION_DATE = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.FigureImpl
	 * @see bpmn.impl.BPMNPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CONNECTION_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CONNECTION_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FIGURECONTENTSLANE = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__CREATION_DATE = 5;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.SwimlaneImpl <em>Swimlane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SwimlaneImpl
	 * @see bpmn.impl.BPMNPackageImpl#getSwimlane()
	 * @generated
	 */
	int SWIMLANE = 3;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__LANE = 0;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__POOL = 1;

	/**
	 * The feature id for the '<em><b>Name Swimlane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__NAME_SWIMLANE = 2;

	/**
	 * The feature id for the '<em><b>Poolincludeswimlane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__POOLINCLUDESWIMLANE = 3;

	/**
	 * The feature id for the '<em><b>Laneincludeswimlane</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__LANEINCLUDESWIMLANE = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE__CREATION_DATE = 5;

	/**
	 * The number of structural features of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Swimlane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWIMLANE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.ElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ElementsImpl
	 * @see bpmn.impl.BPMNPackageImpl#getElements()
	 * @generated
	 */
	int ELEMENTS = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__CONNECTION = FIGURE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__CONNECTION_TARGET = FIGURE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__CONNECTION_SOURCE = FIGURE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__FIGURECONTENTSLANE = FIGURE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__CREATION_DATE = FIGURE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__GROUP = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GroupImpl
	 * @see bpmn.impl.BPMNPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 25;

	/**
	 * The meta object id for the '{@link bpmn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ActivityImpl
	 * @see bpmn.impl.BPMNPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONNECTION = ELEMENTS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONNECTION_TARGET = ELEMENTS__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONNECTION_SOURCE = ELEMENTS__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FIGURECONTENTSLANE = ELEMENTS__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CREATION_DATE = ELEMENTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GROUP = ELEMENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NATURE = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERFORMANCE = ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Natureactivitymaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NATUREACTIVITYMAKER = ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performanceactivitymaker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PERFORMANCEACTIVITYMAKER = ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EVENTS = ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.GatewayImpl
	 * @see bpmn.impl.BPMNPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CONNECTION = ELEMENTS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CONNECTION_TARGET = ELEMENTS__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CONNECTION_SOURCE = ELEMENTS__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__FIGURECONTENTSLANE = ELEMENTS__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CREATION_DATE = ELEMENTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GROUP = ELEMENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__TYPE = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.DataImpl
	 * @see bpmn.impl.BPMNPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CONNECTION = ELEMENTS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CONNECTION_TARGET = ELEMENTS__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CONNECTION_SOURCE = ELEMENTS__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__FIGURECONTENTSLANE = ELEMENTS__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREATION_DATE = ELEMENTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__GROUP = ELEMENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.MessageImpl
	 * @see bpmn.impl.BPMNPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = CONNECTION__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FROM = CONNECTION__FROM;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CREATION_DATE = CONNECTION__CREATION_DATE;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.AssociationImpl
	 * @see bpmn.impl.BPMNPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TO = CONNECTION__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FROM = CONNECTION__FROM;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CREATION_DATE = CONNECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.SecuenceImpl <em>Secuence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SecuenceImpl
	 * @see bpmn.impl.BPMNPackageImpl#getSecuence()
	 * @generated
	 */
	int SECUENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE__TO = CONNECTION__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE__FROM = CONNECTION__FROM;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE__CREATION_DATE = CONNECTION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE__TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secuence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secuence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECUENCE_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.PoolImpl <em>Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.PoolImpl
	 * @see bpmn.impl.BPMNPackageImpl#getPool()
	 * @generated
	 */
	int POOL = 10;

	/**
	 * The feature id for the '<em><b>Name Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__NAME_POOL = 0;

	/**
	 * The feature id for the '<em><b>Swimlane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__SWIMLANE = 1;

	/**
	 * The feature id for the '<em><b>Lanerelationpool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__LANERELATIONPOOL = 2;

	/**
	 * The feature id for the '<em><b>Childpool</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__CHILDPOOL = 3;

	/**
	 * The feature id for the '<em><b>Fatherpool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__FATHERPOOL = 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__CREATION_DATE = 5;

	/**
	 * The number of structural features of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BPMNImpl <em>BPMN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BPMNImpl
	 * @see bpmn.impl.BPMNPackageImpl#getBPMN()
	 * @generated
	 */
	int BPMN = 11;

	/**
	 * The feature id for the '<em><b>Name Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN__NAME_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Swimlane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN__SWIMLANE = 1;

	/**
	 * The number of structural features of the '<em>BPMN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BPMN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.EventImpl
	 * @see bpmn.impl.BPMNPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNECTION = ELEMENTS__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNECTION_TARGET = ELEMENTS__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNECTION_SOURCE = ELEMENTS__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FIGURECONTENTSLANE = ELEMENTS__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CREATION_DATE = ELEMENTS__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__GROUP = ELEMENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIVITY = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.FinalImpl
	 * @see bpmn.impl.BPMNPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__CONNECTION = EVENT__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__CONNECTION_TARGET = EVENT__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__CONNECTION_SOURCE = EVENT__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__FIGURECONTENTSLANE = EVENT__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__CREATION_DATE = EVENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__GROUP = EVENT__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__ACTIVITY = EVENT__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL__TYPE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.InitialImpl
	 * @see bpmn.impl.BPMNPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__CONNECTION = EVENT__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__CONNECTION_TARGET = EVENT__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__CONNECTION_SOURCE = EVENT__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__FIGURECONTENTSLANE = EVENT__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__CREATION_DATE = EVENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__GROUP = EVENT__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__ACTIVITY = EVENT__ACTIVITY;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.IntermediateImpl <em>Intermediate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.IntermediateImpl
	 * @see bpmn.impl.BPMNPackageImpl#getIntermediate()
	 * @generated
	 */
	int INTERMEDIATE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__CONNECTION = EVENT__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__CONNECTION_TARGET = EVENT__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__CONNECTION_SOURCE = EVENT__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__FIGURECONTENTSLANE = EVENT__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__CREATION_DATE = EVENT__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__GROUP = EVENT__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE__ACTIVITY = EVENT__ACTIVITY;

	/**
	 * The number of structural features of the '<em>Intermediate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.HighLevelImpl <em>High Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.HighLevelImpl
	 * @see bpmn.impl.BPMNPackageImpl#getHighLevel()
	 * @generated
	 */
	int HIGH_LEVEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__NAME = INITIAL__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__CONNECTION = INITIAL__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__CONNECTION_TARGET = INITIAL__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__CONNECTION_SOURCE = INITIAL__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__FIGURECONTENTSLANE = INITIAL__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__CREATION_DATE = INITIAL__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__GROUP = INITIAL__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__ACTIVITY = INITIAL__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL__TYPE = INITIAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>High Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_FEATURE_COUNT = INITIAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>High Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_LEVEL_OPERATION_COUNT = INITIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.SubprocessImpl <em>Subprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SubprocessImpl
	 * @see bpmn.impl.BPMNPackageImpl#getSubprocess()
	 * @generated
	 */
	int SUBPROCESS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__NAME = INITIAL__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__CONNECTION = INITIAL__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__CONNECTION_TARGET = INITIAL__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__CONNECTION_SOURCE = INITIAL__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__FIGURECONTENTSLANE = INITIAL__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__CREATION_DATE = INITIAL__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__GROUP = INITIAL__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__ACTIVITY = INITIAL__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS__TYPE = INITIAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_FEATURE_COUNT = INITIAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_OPERATION_COUNT = INITIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.SubprocessNonInterruptImpl <em>Subprocess Non Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.SubprocessNonInterruptImpl
	 * @see bpmn.impl.BPMNPackageImpl#getSubprocessNonInterrupt()
	 * @generated
	 */
	int SUBPROCESS_NON_INTERRUPT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__NAME = INITIAL__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__CONNECTION = INITIAL__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__CONNECTION_TARGET = INITIAL__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__CONNECTION_SOURCE = INITIAL__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__FIGURECONTENTSLANE = INITIAL__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__CREATION_DATE = INITIAL__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__GROUP = INITIAL__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__ACTIVITY = INITIAL__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT__TYPE = INITIAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subprocess Non Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT_FEATURE_COUNT = INITIAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subprocess Non Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROCESS_NON_INTERRUPT_OPERATION_COUNT = INITIAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.CatchImpl
	 * @see bpmn.impl.BPMNPackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__NAME = INTERMEDIATE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__CONNECTION = INTERMEDIATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__CONNECTION_TARGET = INTERMEDIATE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__CONNECTION_SOURCE = INTERMEDIATE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FIGURECONTENTSLANE = INTERMEDIATE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__CREATION_DATE = INTERMEDIATE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__GROUP = INTERMEDIATE__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ACTIVITY = INTERMEDIATE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__TYPE = INTERMEDIATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = INTERMEDIATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_OPERATION_COUNT = INTERMEDIATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BoundaryImpl <em>Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BoundaryImpl
	 * @see bpmn.impl.BPMNPackageImpl#getBoundary()
	 * @generated
	 */
	int BOUNDARY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__NAME = INTERMEDIATE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__CONNECTION = INTERMEDIATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__CONNECTION_TARGET = INTERMEDIATE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__CONNECTION_SOURCE = INTERMEDIATE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__FIGURECONTENTSLANE = INTERMEDIATE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__CREATION_DATE = INTERMEDIATE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__GROUP = INTERMEDIATE__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__ACTIVITY = INTERMEDIATE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__TYPE = INTERMEDIATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_FEATURE_COUNT = INTERMEDIATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OPERATION_COUNT = INTERMEDIATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.BoundaryNonInterruptImpl <em>Boundary Non Interrupt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.BoundaryNonInterruptImpl
	 * @see bpmn.impl.BPMNPackageImpl#getBoundaryNonInterrupt()
	 * @generated
	 */
	int BOUNDARY_NON_INTERRUPT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__NAME = INTERMEDIATE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__CONNECTION = INTERMEDIATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__CONNECTION_TARGET = INTERMEDIATE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__CONNECTION_SOURCE = INTERMEDIATE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__FIGURECONTENTSLANE = INTERMEDIATE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__CREATION_DATE = INTERMEDIATE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__GROUP = INTERMEDIATE__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__ACTIVITY = INTERMEDIATE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT__TYPE = INTERMEDIATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boundary Non Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT_FEATURE_COUNT = INTERMEDIATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boundary Non Interrupt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_NON_INTERRUPT_OPERATION_COUNT = INTERMEDIATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.ThrowImpl <em>Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.ThrowImpl
	 * @see bpmn.impl.BPMNPackageImpl#getThrow()
	 * @generated
	 */
	int THROW = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__NAME = INTERMEDIATE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__CONNECTION = INTERMEDIATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__CONNECTION_TARGET = INTERMEDIATE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__CONNECTION_SOURCE = INTERMEDIATE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FIGURECONTENTSLANE = INTERMEDIATE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__CREATION_DATE = INTERMEDIATE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__GROUP = INTERMEDIATE__GROUP;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ACTIVITY = INTERMEDIATE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__TYPE = INTERMEDIATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_FEATURE_COUNT = INTERMEDIATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_OPERATION_COUNT = INTERMEDIATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.PerformanceActivityMakerImpl <em>Performance Activity Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.PerformanceActivityMakerImpl
	 * @see bpmn.impl.BPMNPackageImpl#getPerformanceActivityMaker()
	 * @generated
	 */
	int PERFORMANCE_ACTIVITY_MAKER = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ACTIVITY_MAKER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ACTIVITY_MAKER__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ACTIVITY_MAKER__CREATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Performance Activity Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ACTIVITY_MAKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Performance Activity Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ACTIVITY_MAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bpmn.impl.NatureActivityMakerImpl <em>Nature Activity Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.impl.NatureActivityMakerImpl
	 * @see bpmn.impl.BPMNPackageImpl#getNatureActivityMaker()
	 * @generated
	 */
	int NATURE_ACTIVITY_MAKER = 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_ACTIVITY_MAKER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_ACTIVITY_MAKER__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_ACTIVITY_MAKER__CREATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Nature Activity Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_ACTIVITY_MAKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nature Activity Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_ACTIVITY_MAKER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = FIGURE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONNECTION = FIGURE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONNECTION_TARGET = FIGURE__CONNECTION_TARGET;

	/**
	 * The feature id for the '<em><b>Connection Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONNECTION_SOURCE = FIGURE__CONNECTION_SOURCE;

	/**
	 * The feature id for the '<em><b>Figurecontentslane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FIGURECONTENTSLANE = FIGURE__FIGURECONTENTSLANE;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATION_DATE = FIGURE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS = FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ELEMENTS_GROUP = FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bpmn.TypeConnectionSecuence <em>Type Connection Secuence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeConnectionSecuence
	 * @see bpmn.impl.BPMNPackageImpl#getTypeConnectionSecuence()
	 * @generated
	 */
	int TYPE_CONNECTION_SECUENCE = 27;

	/**
	 * The meta object id for the '{@link bpmn.TypeAssociation <em>Type Association</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeAssociation
	 * @see bpmn.impl.BPMNPackageImpl#getTypeAssociation()
	 * @generated
	 */
	int TYPE_ASSOCIATION = 28;

	/**
	 * The meta object id for the '{@link bpmn.TypeGateway <em>Type Gateway</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeGateway
	 * @see bpmn.impl.BPMNPackageImpl#getTypeGateway()
	 * @generated
	 */
	int TYPE_GATEWAY = 29;

	/**
	 * The meta object id for the '{@link bpmn.TypeActivity <em>Type Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeActivity
	 * @see bpmn.impl.BPMNPackageImpl#getTypeActivity()
	 * @generated
	 */
	int TYPE_ACTIVITY = 30;

	/**
	 * The meta object id for the '{@link bpmn.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeData
	 * @see bpmn.impl.BPMNPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 31;

	/**
	 * The meta object id for the '{@link bpmn.TypeNatureActivityMaker <em>Type Nature Activity Maker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeNatureActivityMaker
	 * @see bpmn.impl.BPMNPackageImpl#getTypeNatureActivityMaker()
	 * @generated
	 */
	int TYPE_NATURE_ACTIVITY_MAKER = 32;

	/**
	 * The meta object id for the '{@link bpmn.TypePerformanceActivityMaker <em>Type Performance Activity Maker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypePerformanceActivityMaker
	 * @see bpmn.impl.BPMNPackageImpl#getTypePerformanceActivityMaker()
	 * @generated
	 */
	int TYPE_PERFORMANCE_ACTIVITY_MAKER = 33;

	/**
	 * The meta object id for the '{@link bpmn.TypeSubprocess <em>Type Subprocess</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeSubprocess
	 * @see bpmn.impl.BPMNPackageImpl#getTypeSubprocess()
	 * @generated
	 */
	int TYPE_SUBPROCESS = 34;

	/**
	 * The meta object id for the '{@link bpmn.TypeSubprocessNonInterrupt <em>Type Subprocess Non Interrupt</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeSubprocessNonInterrupt
	 * @see bpmn.impl.BPMNPackageImpl#getTypeSubprocessNonInterrupt()
	 * @generated
	 */
	int TYPE_SUBPROCESS_NON_INTERRUPT = 35;

	/**
	 * The meta object id for the '{@link bpmn.TypeBoundary <em>Type Boundary</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeBoundary
	 * @see bpmn.impl.BPMNPackageImpl#getTypeBoundary()
	 * @generated
	 */
	int TYPE_BOUNDARY = 36;

	/**
	 * The meta object id for the '{@link bpmn.TypeHighLevel <em>Type High Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeHighLevel
	 * @see bpmn.impl.BPMNPackageImpl#getTypeHighLevel()
	 * @generated
	 */
	int TYPE_HIGH_LEVEL = 37;

	/**
	 * The meta object id for the '{@link bpmn.TypeThrow <em>Type Throw</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeThrow
	 * @see bpmn.impl.BPMNPackageImpl#getTypeThrow()
	 * @generated
	 */
	int TYPE_THROW = 38;

	/**
	 * The meta object id for the '{@link bpmn.TypeFinal <em>Type Final</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeFinal
	 * @see bpmn.impl.BPMNPackageImpl#getTypeFinal()
	 * @generated
	 */
	int TYPE_FINAL = 39;

	/**
	 * The meta object id for the '{@link bpmn.TypeBoundaryNonInterrupt <em>Type Boundary Non Interrupt</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeBoundaryNonInterrupt
	 * @see bpmn.impl.BPMNPackageImpl#getTypeBoundaryNonInterrupt()
	 * @generated
	 */
	int TYPE_BOUNDARY_NON_INTERRUPT = 40;

	/**
	 * The meta object id for the '{@link bpmn.TypeCatch <em>Type Catch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn.TypeCatch
	 * @see bpmn.impl.BPMNPackageImpl#getTypeCatch()
	 * @generated
	 */
	int TYPE_CATCH = 41;

	/**
	 * Returns the meta object for class '{@link bpmn.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see bpmn.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Lane#getNameLane <em>Name Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Lane</em>'.
	 * @see bpmn.Lane#getNameLane()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_NameLane();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Lane#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figure</em>'.
	 * @see bpmn.Lane#getFigure()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Figure();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Lane#getPoolrelationlane <em>Poolrelationlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Poolrelationlane</em>'.
	 * @see bpmn.Lane#getPoolrelationlane()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Poolrelationlane();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Lane#getLaneincludefigure <em>Laneincludefigure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Laneincludefigure</em>'.
	 * @see bpmn.Lane#getLaneincludefigure()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Laneincludefigure();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Lane#getLanerelationswimline <em>Lanerelationswimline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lanerelationswimline</em>'.
	 * @see bpmn.Lane#getLanerelationswimline()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_Lanerelationswimline();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Lane#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.Lane#getCreationDate()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_CreationDate();

	/**
	 * Returns the meta object for class '{@link bpmn.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see bpmn.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see bpmn.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see bpmn.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Connection#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.Connection#getCreationDate()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link bpmn.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see bpmn.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Figure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bpmn.Figure#getName()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Figure#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see bpmn.Figure#getConnection()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Connection();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Figure#getConnectionSource <em>Connection Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Source</em>'.
	 * @see bpmn.Figure#getConnectionSource()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ConnectionSource();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Figure#getFigurecontentslane <em>Figurecontentslane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Figurecontentslane</em>'.
	 * @see bpmn.Figure#getFigurecontentslane()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Figurecontentslane();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Figure#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.Figure#getCreationDate()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_CreationDate();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Figure#getConnectionTarget <em>Connection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection Target</em>'.
	 * @see bpmn.Figure#getConnectionTarget()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_ConnectionTarget();

	/**
	 * Returns the meta object for class '{@link bpmn.Swimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swimlane</em>'.
	 * @see bpmn.Swimlane
	 * @generated
	 */
	EClass getSwimlane();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Swimlane#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane</em>'.
	 * @see bpmn.Swimlane#getLane()
	 * @see #getSwimlane()
	 * @generated
	 */
	EReference getSwimlane_Lane();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Swimlane#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pool</em>'.
	 * @see bpmn.Swimlane#getPool()
	 * @see #getSwimlane()
	 * @generated
	 */
	EReference getSwimlane_Pool();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Swimlane#getNameSwimlane <em>Name Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Swimlane</em>'.
	 * @see bpmn.Swimlane#getNameSwimlane()
	 * @see #getSwimlane()
	 * @generated
	 */
	EAttribute getSwimlane_NameSwimlane();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Swimlane#getPoolincludeswimlane <em>Poolincludeswimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Poolincludeswimlane</em>'.
	 * @see bpmn.Swimlane#getPoolincludeswimlane()
	 * @see #getSwimlane()
	 * @generated
	 */
	EReference getSwimlane_Poolincludeswimlane();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Swimlane#getLaneincludeswimlane <em>Laneincludeswimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Laneincludeswimlane</em>'.
	 * @see bpmn.Swimlane#getLaneincludeswimlane()
	 * @see #getSwimlane()
	 * @generated
	 */
	EReference getSwimlane_Laneincludeswimlane();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Swimlane#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.Swimlane#getCreationDate()
	 * @see #getSwimlane()
	 * @generated
	 */
	EAttribute getSwimlane_CreationDate();

	/**
	 * Returns the meta object for class '{@link bpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see bpmn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for the containment reference '{@link bpmn.Activity#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nature</em>'.
	 * @see bpmn.Activity#getNature()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nature();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Activity#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance</em>'.
	 * @see bpmn.Activity#getPerformance()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Performance();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Activity#getNatureactivitymaker <em>Natureactivitymaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Natureactivitymaker</em>'.
	 * @see bpmn.Activity#getNatureactivitymaker()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Natureactivitymaker();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Activity#getPerformanceactivitymaker <em>Performanceactivitymaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performanceactivitymaker</em>'.
	 * @see bpmn.Activity#getPerformanceactivitymaker()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Performanceactivitymaker();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Activity#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see bpmn.Activity#getEvents()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Events();

	/**
	 * Returns the meta object for class '{@link bpmn.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see bpmn.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Gateway#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Gateway#getType()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see bpmn.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see bpmn.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link bpmn.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see bpmn.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Association#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Association#getType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Secuence <em>Secuence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secuence</em>'.
	 * @see bpmn.Secuence
	 * @generated
	 */
	EClass getSecuence();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Secuence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Secuence#getType()
	 * @see #getSecuence()
	 * @generated
	 */
	EAttribute getSecuence_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Pool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pool</em>'.
	 * @see bpmn.Pool
	 * @generated
	 */
	EClass getPool();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Pool#getNamePool <em>Name Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Pool</em>'.
	 * @see bpmn.Pool#getNamePool()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_NamePool();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Pool#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Swimlane</em>'.
	 * @see bpmn.Pool#getSwimlane()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Swimlane();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Pool#getLanerelationpool <em>Lanerelationpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lanerelationpool</em>'.
	 * @see bpmn.Pool#getLanerelationpool()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Lanerelationpool();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Pool#getChildpool <em>Childpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childpool</em>'.
	 * @see bpmn.Pool#getChildpool()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Childpool();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Pool#getFatherpool <em>Fatherpool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fatherpool</em>'.
	 * @see bpmn.Pool#getFatherpool()
	 * @see #getPool()
	 * @generated
	 */
	EReference getPool_Fatherpool();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Pool#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.Pool#getCreationDate()
	 * @see #getPool()
	 * @generated
	 */
	EAttribute getPool_CreationDate();

	/**
	 * Returns the meta object for class '{@link bpmn.BPMN <em>BPMN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN</em>'.
	 * @see bpmn.BPMN
	 * @generated
	 */
	EClass getBPMN();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.BPMN#getNameDiagram <em>Name Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Diagram</em>'.
	 * @see bpmn.BPMN#getNameDiagram()
	 * @see #getBPMN()
	 * @generated
	 */
	EAttribute getBPMN_NameDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link bpmn.BPMN#getSwimlane <em>Swimlane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swimlane</em>'.
	 * @see bpmn.BPMN#getSwimlane()
	 * @see #getBPMN()
	 * @generated
	 */
	EReference getBPMN_Swimlane();

	/**
	 * Returns the meta object for class '{@link bpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see bpmn.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Event#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see bpmn.Event#getActivity()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Activity();

	/**
	 * Returns the meta object for class '{@link bpmn.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see bpmn.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Final#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Final#getType()
	 * @see #getFinal()
	 * @generated
	 */
	EAttribute getFinal_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see bpmn.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link bpmn.Intermediate <em>Intermediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate</em>'.
	 * @see bpmn.Intermediate
	 * @generated
	 */
	EClass getIntermediate();

	/**
	 * Returns the meta object for class '{@link bpmn.HighLevel <em>High Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High Level</em>'.
	 * @see bpmn.HighLevel
	 * @generated
	 */
	EClass getHighLevel();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.HighLevel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.HighLevel#getType()
	 * @see #getHighLevel()
	 * @generated
	 */
	EAttribute getHighLevel_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Subprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprocess</em>'.
	 * @see bpmn.Subprocess
	 * @generated
	 */
	EClass getSubprocess();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Subprocess#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Subprocess#getType()
	 * @see #getSubprocess()
	 * @generated
	 */
	EAttribute getSubprocess_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.SubprocessNonInterrupt <em>Subprocess Non Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprocess Non Interrupt</em>'.
	 * @see bpmn.SubprocessNonInterrupt
	 * @generated
	 */
	EClass getSubprocessNonInterrupt();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.SubprocessNonInterrupt#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.SubprocessNonInterrupt#getType()
	 * @see #getSubprocessNonInterrupt()
	 * @generated
	 */
	EAttribute getSubprocessNonInterrupt_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see bpmn.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Catch#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Catch#getType()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Boundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary</em>'.
	 * @see bpmn.Boundary
	 * @generated
	 */
	EClass getBoundary();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Boundary#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Boundary#getType()
	 * @see #getBoundary()
	 * @generated
	 */
	EAttribute getBoundary_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.BoundaryNonInterrupt <em>Boundary Non Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Non Interrupt</em>'.
	 * @see bpmn.BoundaryNonInterrupt
	 * @generated
	 */
	EClass getBoundaryNonInterrupt();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.BoundaryNonInterrupt#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.BoundaryNonInterrupt#getType()
	 * @see #getBoundaryNonInterrupt()
	 * @generated
	 */
	EAttribute getBoundaryNonInterrupt_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw</em>'.
	 * @see bpmn.Throw
	 * @generated
	 */
	EClass getThrow();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.Throw#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.Throw#getType()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_Type();

	/**
	 * Returns the meta object for class '{@link bpmn.PerformanceActivityMaker <em>Performance Activity Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Activity Maker</em>'.
	 * @see bpmn.PerformanceActivityMaker
	 * @generated
	 */
	EClass getPerformanceActivityMaker();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.PerformanceActivityMaker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.PerformanceActivityMaker#getType()
	 * @see #getPerformanceActivityMaker()
	 * @generated
	 */
	EAttribute getPerformanceActivityMaker_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmn.PerformanceActivityMaker#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see bpmn.PerformanceActivityMaker#getActivity()
	 * @see #getPerformanceActivityMaker()
	 * @generated
	 */
	EReference getPerformanceActivityMaker_Activity();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.PerformanceActivityMaker#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.PerformanceActivityMaker#getCreationDate()
	 * @see #getPerformanceActivityMaker()
	 * @generated
	 */
	EAttribute getPerformanceActivityMaker_CreationDate();

	/**
	 * Returns the meta object for class '{@link bpmn.NatureActivityMaker <em>Nature Activity Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature Activity Maker</em>'.
	 * @see bpmn.NatureActivityMaker
	 * @generated
	 */
	EClass getNatureActivityMaker();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.NatureActivityMaker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bpmn.NatureActivityMaker#getType()
	 * @see #getNatureActivityMaker()
	 * @generated
	 */
	EAttribute getNatureActivityMaker_Type();

	/**
	 * Returns the meta object for the reference '{@link bpmn.NatureActivityMaker#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see bpmn.NatureActivityMaker#getActivity()
	 * @see #getNatureActivityMaker()
	 * @generated
	 */
	EReference getNatureActivityMaker_Activity();

	/**
	 * Returns the meta object for the attribute '{@link bpmn.NatureActivityMaker#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bpmn.NatureActivityMaker#getCreationDate()
	 * @see #getNatureActivityMaker()
	 * @generated
	 */
	EAttribute getNatureActivityMaker_CreationDate();

	/**
	 * Returns the meta object for class '{@link bpmn.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see bpmn.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link bpmn.Group#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see bpmn.Group#getElements()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Elements();

	/**
	 * Returns the meta object for the reference list '{@link bpmn.Group#getElementsGroup <em>Elements Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements Group</em>'.
	 * @see bpmn.Group#getElementsGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_ElementsGroup();

	/**
	 * Returns the meta object for class '{@link bpmn.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see bpmn.Elements
	 * @generated
	 */
	EClass getElements();

	/**
	 * Returns the meta object for the reference '{@link bpmn.Elements#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see bpmn.Elements#getGroup()
	 * @see #getElements()
	 * @generated
	 */
	EReference getElements_Group();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeConnectionSecuence <em>Type Connection Secuence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Connection Secuence</em>'.
	 * @see bpmn.TypeConnectionSecuence
	 * @generated
	 */
	EEnum getTypeConnectionSecuence();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeAssociation <em>Type Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Association</em>'.
	 * @see bpmn.TypeAssociation
	 * @generated
	 */
	EEnum getTypeAssociation();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeGateway <em>Type Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Gateway</em>'.
	 * @see bpmn.TypeGateway
	 * @generated
	 */
	EEnum getTypeGateway();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeActivity <em>Type Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Activity</em>'.
	 * @see bpmn.TypeActivity
	 * @generated
	 */
	EEnum getTypeActivity();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see bpmn.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeNatureActivityMaker <em>Type Nature Activity Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Nature Activity Maker</em>'.
	 * @see bpmn.TypeNatureActivityMaker
	 * @generated
	 */
	EEnum getTypeNatureActivityMaker();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypePerformanceActivityMaker <em>Type Performance Activity Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Performance Activity Maker</em>'.
	 * @see bpmn.TypePerformanceActivityMaker
	 * @generated
	 */
	EEnum getTypePerformanceActivityMaker();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeSubprocess <em>Type Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Subprocess</em>'.
	 * @see bpmn.TypeSubprocess
	 * @generated
	 */
	EEnum getTypeSubprocess();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeSubprocessNonInterrupt <em>Type Subprocess Non Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Subprocess Non Interrupt</em>'.
	 * @see bpmn.TypeSubprocessNonInterrupt
	 * @generated
	 */
	EEnum getTypeSubprocessNonInterrupt();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeBoundary <em>Type Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Boundary</em>'.
	 * @see bpmn.TypeBoundary
	 * @generated
	 */
	EEnum getTypeBoundary();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeHighLevel <em>Type High Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type High Level</em>'.
	 * @see bpmn.TypeHighLevel
	 * @generated
	 */
	EEnum getTypeHighLevel();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeThrow <em>Type Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Throw</em>'.
	 * @see bpmn.TypeThrow
	 * @generated
	 */
	EEnum getTypeThrow();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeFinal <em>Type Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Final</em>'.
	 * @see bpmn.TypeFinal
	 * @generated
	 */
	EEnum getTypeFinal();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeBoundaryNonInterrupt <em>Type Boundary Non Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Boundary Non Interrupt</em>'.
	 * @see bpmn.TypeBoundaryNonInterrupt
	 * @generated
	 */
	EEnum getTypeBoundaryNonInterrupt();

	/**
	 * Returns the meta object for enum '{@link bpmn.TypeCatch <em>Type Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Catch</em>'.
	 * @see bpmn.TypeCatch
	 * @generated
	 */
	EEnum getTypeCatch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMNFactory getBPMNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bpmn.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.LaneImpl
		 * @see bpmn.impl.BPMNPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Name Lane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__NAME_LANE = eINSTANCE.getLane_NameLane();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__FIGURE = eINSTANCE.getLane_Figure();

		/**
		 * The meta object literal for the '<em><b>Poolrelationlane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__POOLRELATIONLANE = eINSTANCE.getLane_Poolrelationlane();

		/**
		 * The meta object literal for the '<em><b>Laneincludefigure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__LANEINCLUDEFIGURE = eINSTANCE.getLane_Laneincludefigure();

		/**
		 * The meta object literal for the '<em><b>Lanerelationswimline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__LANERELATIONSWIMLINE = eINSTANCE.getLane_Lanerelationswimline();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__CREATION_DATE = eINSTANCE.getLane_CreationDate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ConnectionImpl
		 * @see bpmn.impl.BPMNPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CREATION_DATE = eINSTANCE.getConnection_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link bpmn.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.FigureImpl
		 * @see bpmn.impl.BPMNPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__NAME = eINSTANCE.getFigure_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__CONNECTION = eINSTANCE.getFigure_Connection();

		/**
		 * The meta object literal for the '<em><b>Connection Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__CONNECTION_SOURCE = eINSTANCE.getFigure_ConnectionSource();

		/**
		 * The meta object literal for the '<em><b>Figurecontentslane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FIGURECONTENTSLANE = eINSTANCE.getFigure_Figurecontentslane();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__CREATION_DATE = eINSTANCE.getFigure_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Connection Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__CONNECTION_TARGET = eINSTANCE.getFigure_ConnectionTarget();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SwimlaneImpl <em>Swimlane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SwimlaneImpl
		 * @see bpmn.impl.BPMNPackageImpl#getSwimlane()
		 * @generated
		 */
		EClass SWIMLANE = eINSTANCE.getSwimlane();

		/**
		 * The meta object literal for the '<em><b>Lane</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIMLANE__LANE = eINSTANCE.getSwimlane_Lane();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIMLANE__POOL = eINSTANCE.getSwimlane_Pool();

		/**
		 * The meta object literal for the '<em><b>Name Swimlane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIMLANE__NAME_SWIMLANE = eINSTANCE.getSwimlane_NameSwimlane();

		/**
		 * The meta object literal for the '<em><b>Poolincludeswimlane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIMLANE__POOLINCLUDESWIMLANE = eINSTANCE.getSwimlane_Poolincludeswimlane();

		/**
		 * The meta object literal for the '<em><b>Laneincludeswimlane</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWIMLANE__LANEINCLUDESWIMLANE = eINSTANCE.getSwimlane_Laneincludeswimlane();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWIMLANE__CREATION_DATE = eINSTANCE.getSwimlane_CreationDate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ActivityImpl
		 * @see bpmn.impl.BPMNPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NATURE = eINSTANCE.getActivity_Nature();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PERFORMANCE = eINSTANCE.getActivity_Performance();

		/**
		 * The meta object literal for the '<em><b>Natureactivitymaker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NATUREACTIVITYMAKER = eINSTANCE.getActivity_Natureactivitymaker();

		/**
		 * The meta object literal for the '<em><b>Performanceactivitymaker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PERFORMANCEACTIVITYMAKER = eINSTANCE.getActivity_Performanceactivitymaker();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EVENTS = eINSTANCE.getActivity_Events();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GatewayImpl
		 * @see bpmn.impl.BPMNPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__TYPE = eINSTANCE.getGateway_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.DataImpl
		 * @see bpmn.impl.BPMNPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.MessageImpl
		 * @see bpmn.impl.BPMNPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link bpmn.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.AssociationImpl
		 * @see bpmn.impl.BPMNPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SecuenceImpl <em>Secuence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SecuenceImpl
		 * @see bpmn.impl.BPMNPackageImpl#getSecuence()
		 * @generated
		 */
		EClass SECUENCE = eINSTANCE.getSecuence();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECUENCE__TYPE = eINSTANCE.getSecuence_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.PoolImpl <em>Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.PoolImpl
		 * @see bpmn.impl.BPMNPackageImpl#getPool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getPool();

		/**
		 * The meta object literal for the '<em><b>Name Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__NAME_POOL = eINSTANCE.getPool_NamePool();

		/**
		 * The meta object literal for the '<em><b>Swimlane</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__SWIMLANE = eINSTANCE.getPool_Swimlane();

		/**
		 * The meta object literal for the '<em><b>Lanerelationpool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__LANERELATIONPOOL = eINSTANCE.getPool_Lanerelationpool();

		/**
		 * The meta object literal for the '<em><b>Childpool</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__CHILDPOOL = eINSTANCE.getPool_Childpool();

		/**
		 * The meta object literal for the '<em><b>Fatherpool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__FATHERPOOL = eINSTANCE.getPool_Fatherpool();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POOL__CREATION_DATE = eINSTANCE.getPool_CreationDate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BPMNImpl <em>BPMN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BPMNImpl
		 * @see bpmn.impl.BPMNPackageImpl#getBPMN()
		 * @generated
		 */
		EClass BPMN = eINSTANCE.getBPMN();

		/**
		 * The meta object literal for the '<em><b>Name Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPMN__NAME_DIAGRAM = eINSTANCE.getBPMN_NameDiagram();

		/**
		 * The meta object literal for the '<em><b>Swimlane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPMN__SWIMLANE = eINSTANCE.getBPMN_Swimlane();

		/**
		 * The meta object literal for the '{@link bpmn.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.EventImpl
		 * @see bpmn.impl.BPMNPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIVITY = eINSTANCE.getEvent_Activity();

		/**
		 * The meta object literal for the '{@link bpmn.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.FinalImpl
		 * @see bpmn.impl.BPMNPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINAL__TYPE = eINSTANCE.getFinal_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.InitialImpl
		 * @see bpmn.impl.BPMNPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link bpmn.impl.IntermediateImpl <em>Intermediate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.IntermediateImpl
		 * @see bpmn.impl.BPMNPackageImpl#getIntermediate()
		 * @generated
		 */
		EClass INTERMEDIATE = eINSTANCE.getIntermediate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.HighLevelImpl <em>High Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.HighLevelImpl
		 * @see bpmn.impl.BPMNPackageImpl#getHighLevel()
		 * @generated
		 */
		EClass HIGH_LEVEL = eINSTANCE.getHighLevel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_LEVEL__TYPE = eINSTANCE.getHighLevel_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SubprocessImpl <em>Subprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SubprocessImpl
		 * @see bpmn.impl.BPMNPackageImpl#getSubprocess()
		 * @generated
		 */
		EClass SUBPROCESS = eINSTANCE.getSubprocess();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROCESS__TYPE = eINSTANCE.getSubprocess_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.SubprocessNonInterruptImpl <em>Subprocess Non Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.SubprocessNonInterruptImpl
		 * @see bpmn.impl.BPMNPackageImpl#getSubprocessNonInterrupt()
		 * @generated
		 */
		EClass SUBPROCESS_NON_INTERRUPT = eINSTANCE.getSubprocessNonInterrupt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROCESS_NON_INTERRUPT__TYPE = eINSTANCE.getSubprocessNonInterrupt_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.CatchImpl <em>Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.CatchImpl
		 * @see bpmn.impl.BPMNPackageImpl#getCatch()
		 * @generated
		 */
		EClass CATCH = eINSTANCE.getCatch();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH__TYPE = eINSTANCE.getCatch_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BoundaryImpl <em>Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BoundaryImpl
		 * @see bpmn.impl.BPMNPackageImpl#getBoundary()
		 * @generated
		 */
		EClass BOUNDARY = eINSTANCE.getBoundary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY__TYPE = eINSTANCE.getBoundary_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.BoundaryNonInterruptImpl <em>Boundary Non Interrupt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.BoundaryNonInterruptImpl
		 * @see bpmn.impl.BPMNPackageImpl#getBoundaryNonInterrupt()
		 * @generated
		 */
		EClass BOUNDARY_NON_INTERRUPT = eINSTANCE.getBoundaryNonInterrupt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_NON_INTERRUPT__TYPE = eINSTANCE.getBoundaryNonInterrupt_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ThrowImpl <em>Throw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ThrowImpl
		 * @see bpmn.impl.BPMNPackageImpl#getThrow()
		 * @generated
		 */
		EClass THROW = eINSTANCE.getThrow();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROW__TYPE = eINSTANCE.getThrow_Type();

		/**
		 * The meta object literal for the '{@link bpmn.impl.PerformanceActivityMakerImpl <em>Performance Activity Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.PerformanceActivityMakerImpl
		 * @see bpmn.impl.BPMNPackageImpl#getPerformanceActivityMaker()
		 * @generated
		 */
		EClass PERFORMANCE_ACTIVITY_MAKER = eINSTANCE.getPerformanceActivityMaker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_ACTIVITY_MAKER__TYPE = eINSTANCE.getPerformanceActivityMaker_Type();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_ACTIVITY_MAKER__ACTIVITY = eINSTANCE.getPerformanceActivityMaker_Activity();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_ACTIVITY_MAKER__CREATION_DATE = eINSTANCE.getPerformanceActivityMaker_CreationDate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.NatureActivityMakerImpl <em>Nature Activity Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.NatureActivityMakerImpl
		 * @see bpmn.impl.BPMNPackageImpl#getNatureActivityMaker()
		 * @generated
		 */
		EClass NATURE_ACTIVITY_MAKER = eINSTANCE.getNatureActivityMaker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE_ACTIVITY_MAKER__TYPE = eINSTANCE.getNatureActivityMaker_Type();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURE_ACTIVITY_MAKER__ACTIVITY = eINSTANCE.getNatureActivityMaker_Activity();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURE_ACTIVITY_MAKER__CREATION_DATE = eINSTANCE.getNatureActivityMaker_CreationDate();

		/**
		 * The meta object literal for the '{@link bpmn.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.GroupImpl
		 * @see bpmn.impl.BPMNPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS = eINSTANCE.getGroup_Elements();

		/**
		 * The meta object literal for the '<em><b>Elements Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ELEMENTS_GROUP = eINSTANCE.getGroup_ElementsGroup();

		/**
		 * The meta object literal for the '{@link bpmn.impl.ElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.impl.ElementsImpl
		 * @see bpmn.impl.BPMNPackageImpl#getElements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getElements();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS__GROUP = eINSTANCE.getElements_Group();

		/**
		 * The meta object literal for the '{@link bpmn.TypeConnectionSecuence <em>Type Connection Secuence</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeConnectionSecuence
		 * @see bpmn.impl.BPMNPackageImpl#getTypeConnectionSecuence()
		 * @generated
		 */
		EEnum TYPE_CONNECTION_SECUENCE = eINSTANCE.getTypeConnectionSecuence();

		/**
		 * The meta object literal for the '{@link bpmn.TypeAssociation <em>Type Association</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeAssociation
		 * @see bpmn.impl.BPMNPackageImpl#getTypeAssociation()
		 * @generated
		 */
		EEnum TYPE_ASSOCIATION = eINSTANCE.getTypeAssociation();

		/**
		 * The meta object literal for the '{@link bpmn.TypeGateway <em>Type Gateway</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeGateway
		 * @see bpmn.impl.BPMNPackageImpl#getTypeGateway()
		 * @generated
		 */
		EEnum TYPE_GATEWAY = eINSTANCE.getTypeGateway();

		/**
		 * The meta object literal for the '{@link bpmn.TypeActivity <em>Type Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeActivity
		 * @see bpmn.impl.BPMNPackageImpl#getTypeActivity()
		 * @generated
		 */
		EEnum TYPE_ACTIVITY = eINSTANCE.getTypeActivity();

		/**
		 * The meta object literal for the '{@link bpmn.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeData
		 * @see bpmn.impl.BPMNPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

		/**
		 * The meta object literal for the '{@link bpmn.TypeNatureActivityMaker <em>Type Nature Activity Maker</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeNatureActivityMaker
		 * @see bpmn.impl.BPMNPackageImpl#getTypeNatureActivityMaker()
		 * @generated
		 */
		EEnum TYPE_NATURE_ACTIVITY_MAKER = eINSTANCE.getTypeNatureActivityMaker();

		/**
		 * The meta object literal for the '{@link bpmn.TypePerformanceActivityMaker <em>Type Performance Activity Maker</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypePerformanceActivityMaker
		 * @see bpmn.impl.BPMNPackageImpl#getTypePerformanceActivityMaker()
		 * @generated
		 */
		EEnum TYPE_PERFORMANCE_ACTIVITY_MAKER = eINSTANCE.getTypePerformanceActivityMaker();

		/**
		 * The meta object literal for the '{@link bpmn.TypeSubprocess <em>Type Subprocess</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeSubprocess
		 * @see bpmn.impl.BPMNPackageImpl#getTypeSubprocess()
		 * @generated
		 */
		EEnum TYPE_SUBPROCESS = eINSTANCE.getTypeSubprocess();

		/**
		 * The meta object literal for the '{@link bpmn.TypeSubprocessNonInterrupt <em>Type Subprocess Non Interrupt</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeSubprocessNonInterrupt
		 * @see bpmn.impl.BPMNPackageImpl#getTypeSubprocessNonInterrupt()
		 * @generated
		 */
		EEnum TYPE_SUBPROCESS_NON_INTERRUPT = eINSTANCE.getTypeSubprocessNonInterrupt();

		/**
		 * The meta object literal for the '{@link bpmn.TypeBoundary <em>Type Boundary</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeBoundary
		 * @see bpmn.impl.BPMNPackageImpl#getTypeBoundary()
		 * @generated
		 */
		EEnum TYPE_BOUNDARY = eINSTANCE.getTypeBoundary();

		/**
		 * The meta object literal for the '{@link bpmn.TypeHighLevel <em>Type High Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeHighLevel
		 * @see bpmn.impl.BPMNPackageImpl#getTypeHighLevel()
		 * @generated
		 */
		EEnum TYPE_HIGH_LEVEL = eINSTANCE.getTypeHighLevel();

		/**
		 * The meta object literal for the '{@link bpmn.TypeThrow <em>Type Throw</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeThrow
		 * @see bpmn.impl.BPMNPackageImpl#getTypeThrow()
		 * @generated
		 */
		EEnum TYPE_THROW = eINSTANCE.getTypeThrow();

		/**
		 * The meta object literal for the '{@link bpmn.TypeFinal <em>Type Final</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeFinal
		 * @see bpmn.impl.BPMNPackageImpl#getTypeFinal()
		 * @generated
		 */
		EEnum TYPE_FINAL = eINSTANCE.getTypeFinal();

		/**
		 * The meta object literal for the '{@link bpmn.TypeBoundaryNonInterrupt <em>Type Boundary Non Interrupt</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeBoundaryNonInterrupt
		 * @see bpmn.impl.BPMNPackageImpl#getTypeBoundaryNonInterrupt()
		 * @generated
		 */
		EEnum TYPE_BOUNDARY_NON_INTERRUPT = eINSTANCE.getTypeBoundaryNonInterrupt();

		/**
		 * The meta object literal for the '{@link bpmn.TypeCatch <em>Type Catch</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bpmn.TypeCatch
		 * @see bpmn.impl.BPMNPackageImpl#getTypeCatch()
		 * @generated
		 */
		EEnum TYPE_CATCH = eINSTANCE.getTypeCatch();

	}

} //BPMNPackage
