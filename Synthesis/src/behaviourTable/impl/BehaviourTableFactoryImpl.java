/**
 */
package behaviourTable.impl;

import behaviourTable.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourTableFactoryImpl extends EFactoryImpl implements BehaviourTableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourTableFactory init() {
		try {
			BehaviourTableFactory theBehaviourTableFactory = (BehaviourTableFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourTablePackage.eNS_URI);
			if (theBehaviourTableFactory != null) {
				return theBehaviourTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourTableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviourTablePackage.BEHAVIOUR: return createBehaviour();
			case BehaviourTablePackage.BEHAVIOUR_TABLE: return createBehaviourTable();
			case BehaviourTablePackage.OUT_MESSAGE: return createOutMessage();
			case BehaviourTablePackage.ACTIVATION: return createActivation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTable createBehaviourTable() {
		BehaviourTableImpl behaviourTable = new BehaviourTableImpl();
		return behaviourTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMessage createOutMessage() {
		OutMessageImpl outMessage = new OutMessageImpl();
		return outMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation createActivation() {
		ActivationImpl activation = new ActivationImpl();
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTablePackage getBehaviourTablePackage() {
		return (BehaviourTablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourTablePackage getPackage() {
		return BehaviourTablePackage.eINSTANCE;
	}

} //BehaviourTableFactoryImpl
