/**
 */
package behaviourTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see behaviourTable.BehaviourTableFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviourTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "behaviourTable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "elite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourTablePackage eINSTANCE = behaviourTable.impl.BehaviourTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviourTable.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourTable.impl.BehaviourImpl
	 * @see behaviourTable.impl.BehaviourTablePackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Pre State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__PRE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Post State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__POST_STATE = 1;

	/**
	 * The feature id for the '<em><b>In Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__IN_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ACTIVATION = 3;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourTable.impl.BehaviourTableImpl <em>Behaviour Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourTable.impl.BehaviourTableImpl
	 * @see behaviourTable.impl.BehaviourTablePackageImpl#getBehaviourTable()
	 * @generated
	 */
	int BEHAVIOUR_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Behaviours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_TABLE__BEHAVIOURS = 0;

	/**
	 * The number of structural features of the '<em>Behaviour Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behaviour Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourTable.impl.OutMessageImpl <em>Out Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourTable.impl.OutMessageImpl
	 * @see behaviourTable.impl.BehaviourTablePackageImpl#getOutMessage()
	 * @generated
	 */
	int OUT_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE__RETURN = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE__OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Out Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Out Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviourTable.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviourTable.impl.ActivationImpl
	 * @see behaviourTable.impl.BehaviourTablePackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 3;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__RETURN = 0;

	/**
	 * The feature id for the '<em><b>Out Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION__OUT_MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link behaviourTable.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see behaviourTable.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.Behaviour#getPreState <em>Pre State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre State</em>'.
	 * @see behaviourTable.Behaviour#getPreState()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_PreState();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.Behaviour#getPostState <em>Post State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post State</em>'.
	 * @see behaviourTable.Behaviour#getPostState()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_PostState();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.Behaviour#getInMessage <em>In Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Message</em>'.
	 * @see behaviourTable.Behaviour#getInMessage()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_InMessage();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.Behaviour#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation</em>'.
	 * @see behaviourTable.Behaviour#getActivation()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Activation();

	/**
	 * Returns the meta object for class '{@link behaviourTable.BehaviourTable <em>Behaviour Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Table</em>'.
	 * @see behaviourTable.BehaviourTable
	 * @generated
	 */
	EClass getBehaviourTable();

	/**
	 * Returns the meta object for the reference list '{@link behaviourTable.BehaviourTable#getBehaviours <em>Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Behaviours</em>'.
	 * @see behaviourTable.BehaviourTable#getBehaviours()
	 * @see #getBehaviourTable()
	 * @generated
	 */
	EReference getBehaviourTable_Behaviours();

	/**
	 * Returns the meta object for class '{@link behaviourTable.OutMessage <em>Out Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Message</em>'.
	 * @see behaviourTable.OutMessage
	 * @generated
	 */
	EClass getOutMessage();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.OutMessage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see behaviourTable.OutMessage#getOperation()
	 * @see #getOutMessage()
	 * @generated
	 */
	EReference getOutMessage_Operation();

	/**
	 * Returns the meta object for the attribute '{@link behaviourTable.OutMessage#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see behaviourTable.OutMessage#getReturn()
	 * @see #getOutMessage()
	 * @generated
	 */
	EAttribute getOutMessage_Return();

	/**
	 * Returns the meta object for the reference '{@link behaviourTable.OutMessage#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see behaviourTable.OutMessage#getObject()
	 * @see #getOutMessage()
	 * @generated
	 */
	EReference getOutMessage_Object();

	/**
	 * Returns the meta object for class '{@link behaviourTable.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see behaviourTable.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for the attribute '{@link behaviourTable.Activation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see behaviourTable.Activation#getReturn()
	 * @see #getActivation()
	 * @generated
	 */
	EAttribute getActivation_Return();

	/**
	 * Returns the meta object for the reference list '{@link behaviourTable.Activation#getOutMessages <em>Out Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Messages</em>'.
	 * @see behaviourTable.Activation#getOutMessages()
	 * @see #getActivation()
	 * @generated
	 */
	EReference getActivation_OutMessages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourTableFactory getBehaviourTableFactory();

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
		 * The meta object literal for the '{@link behaviourTable.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourTable.impl.BehaviourImpl
		 * @see behaviourTable.impl.BehaviourTablePackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Pre State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__PRE_STATE = eINSTANCE.getBehaviour_PreState();

		/**
		 * The meta object literal for the '<em><b>Post State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__POST_STATE = eINSTANCE.getBehaviour_PostState();

		/**
		 * The meta object literal for the '<em><b>In Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__IN_MESSAGE = eINSTANCE.getBehaviour_InMessage();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__ACTIVATION = eINSTANCE.getBehaviour_Activation();

		/**
		 * The meta object literal for the '{@link behaviourTable.impl.BehaviourTableImpl <em>Behaviour Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourTable.impl.BehaviourTableImpl
		 * @see behaviourTable.impl.BehaviourTablePackageImpl#getBehaviourTable()
		 * @generated
		 */
		EClass BEHAVIOUR_TABLE = eINSTANCE.getBehaviourTable();

		/**
		 * The meta object literal for the '<em><b>Behaviours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_TABLE__BEHAVIOURS = eINSTANCE.getBehaviourTable_Behaviours();

		/**
		 * The meta object literal for the '{@link behaviourTable.impl.OutMessageImpl <em>Out Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourTable.impl.OutMessageImpl
		 * @see behaviourTable.impl.BehaviourTablePackageImpl#getOutMessage()
		 * @generated
		 */
		EClass OUT_MESSAGE = eINSTANCE.getOutMessage();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_MESSAGE__OPERATION = eINSTANCE.getOutMessage_Operation();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_MESSAGE__RETURN = eINSTANCE.getOutMessage_Return();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_MESSAGE__OBJECT = eINSTANCE.getOutMessage_Object();

		/**
		 * The meta object literal for the '{@link behaviourTable.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviourTable.impl.ActivationImpl
		 * @see behaviourTable.impl.BehaviourTablePackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION__RETURN = eINSTANCE.getActivation_Return();

		/**
		 * The meta object literal for the '<em><b>Out Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION__OUT_MESSAGES = eINSTANCE.getActivation_OutMessages();

	}

} //BehaviourTablePackage
