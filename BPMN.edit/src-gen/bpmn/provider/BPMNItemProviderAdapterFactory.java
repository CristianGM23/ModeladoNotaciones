/**
 */
package bpmn.provider;

import bpmn.util.BPMNAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNItemProviderAdapterFactory extends BPMNAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Lane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneItemProvider laneItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Lane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLaneAdapter() {
		if (laneItemProvider == null) {
			laneItemProvider = new LaneItemProvider(this);
		}

		return laneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Swimlane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimlaneItemProvider swimlaneItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Swimlane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwimlaneAdapter() {
		if (swimlaneItemProvider == null) {
			swimlaneItemProvider = new SwimlaneItemProvider(this);
		}

		return swimlaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Gateway} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayItemProvider gatewayItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Gateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGatewayAdapter() {
		if (gatewayItemProvider == null) {
			gatewayItemProvider = new GatewayItemProvider(this);
		}

		return gatewayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemProvider dataItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAdapter() {
		if (dataItemProvider == null) {
			dataItemProvider = new DataItemProvider(this);
		}

		return dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Secuence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuenceItemProvider secuenceItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Secuence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecuenceAdapter() {
		if (secuenceItemProvider == null) {
			secuenceItemProvider = new SecuenceItemProvider(this);
		}

		return secuenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Pool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoolItemProvider poolItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Pool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPoolAdapter() {
		if (poolItemProvider == null) {
			poolItemProvider = new PoolItemProvider(this);
		}

		return poolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.BPMN} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNItemProvider bpmnItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.BPMN}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBPMNAdapter() {
		if (bpmnItemProvider == null) {
			bpmnItemProvider = new BPMNItemProvider(this);
		}

		return bpmnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Final} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalItemProvider finalItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Final}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalAdapter() {
		if (finalItemProvider == null) {
			finalItemProvider = new FinalItemProvider(this);
		}

		return finalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.HighLevel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighLevelItemProvider highLevelItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.HighLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHighLevelAdapter() {
		if (highLevelItemProvider == null) {
			highLevelItemProvider = new HighLevelItemProvider(this);
		}

		return highLevelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Subprocess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprocessItemProvider subprocessItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Subprocess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubprocessAdapter() {
		if (subprocessItemProvider == null) {
			subprocessItemProvider = new SubprocessItemProvider(this);
		}

		return subprocessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.SubprocessNonInterrupt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprocessNonInterruptItemProvider subprocessNonInterruptItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.SubprocessNonInterrupt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubprocessNonInterruptAdapter() {
		if (subprocessNonInterruptItemProvider == null) {
			subprocessNonInterruptItemProvider = new SubprocessNonInterruptItemProvider(this);
		}

		return subprocessNonInterruptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Catch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchItemProvider catchItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Catch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatchAdapter() {
		if (catchItemProvider == null) {
			catchItemProvider = new CatchItemProvider(this);
		}

		return catchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Boundary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryItemProvider boundaryItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Boundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundaryAdapter() {
		if (boundaryItemProvider == null) {
			boundaryItemProvider = new BoundaryItemProvider(this);
		}

		return boundaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.BoundaryNonInterrupt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundaryNonInterruptItemProvider boundaryNonInterruptItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.BoundaryNonInterrupt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundaryNonInterruptAdapter() {
		if (boundaryNonInterruptItemProvider == null) {
			boundaryNonInterruptItemProvider = new BoundaryNonInterruptItemProvider(this);
		}

		return boundaryNonInterruptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Throw} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowItemProvider throwItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Throw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThrowAdapter() {
		if (throwItemProvider == null) {
			throwItemProvider = new ThrowItemProvider(this);
		}

		return throwItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.PerformanceActivityMaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceActivityMakerItemProvider performanceActivityMakerItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.PerformanceActivityMaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerformanceActivityMakerAdapter() {
		if (performanceActivityMakerItemProvider == null) {
			performanceActivityMakerItemProvider = new PerformanceActivityMakerItemProvider(this);
		}

		return performanceActivityMakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.NatureActivityMaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NatureActivityMakerItemProvider natureActivityMakerItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.NatureActivityMaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNatureActivityMakerAdapter() {
		if (natureActivityMakerItemProvider == null) {
			natureActivityMakerItemProvider = new NatureActivityMakerItemProvider(this);
		}

		return natureActivityMakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link bpmn.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link bpmn.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (laneItemProvider != null)
			laneItemProvider.dispose();
		if (connectionItemProvider != null)
			connectionItemProvider.dispose();
		if (swimlaneItemProvider != null)
			swimlaneItemProvider.dispose();
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (gatewayItemProvider != null)
			gatewayItemProvider.dispose();
		if (dataItemProvider != null)
			dataItemProvider.dispose();
		if (messageItemProvider != null)
			messageItemProvider.dispose();
		if (associationItemProvider != null)
			associationItemProvider.dispose();
		if (secuenceItemProvider != null)
			secuenceItemProvider.dispose();
		if (poolItemProvider != null)
			poolItemProvider.dispose();
		if (bpmnItemProvider != null)
			bpmnItemProvider.dispose();
		if (finalItemProvider != null)
			finalItemProvider.dispose();
		if (highLevelItemProvider != null)
			highLevelItemProvider.dispose();
		if (subprocessItemProvider != null)
			subprocessItemProvider.dispose();
		if (subprocessNonInterruptItemProvider != null)
			subprocessNonInterruptItemProvider.dispose();
		if (catchItemProvider != null)
			catchItemProvider.dispose();
		if (boundaryItemProvider != null)
			boundaryItemProvider.dispose();
		if (boundaryNonInterruptItemProvider != null)
			boundaryNonInterruptItemProvider.dispose();
		if (throwItemProvider != null)
			throwItemProvider.dispose();
		if (performanceActivityMakerItemProvider != null)
			performanceActivityMakerItemProvider.dispose();
		if (natureActivityMakerItemProvider != null)
			natureActivityMakerItemProvider.dispose();
		if (groupItemProvider != null)
			groupItemProvider.dispose();
	}

}
