/**
 */
package interactionMetamodel;

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
 * @see interactionMetamodel.InteractionMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interactionMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "interactionMetamodel";

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
	InteractionMetamodelPackage eINSTANCE = interactionMetamodel.impl.InteractionMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.LifelineImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INTERACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INVARIANTS = 1;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.MessageImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.MessageOccurenceSpecificationImpl <em>Message Occurence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.MessageOccurenceSpecificationImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessageOccurenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE = 0;

	/**
	 * The number of structural features of the '<em>Message Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.ExecutionOccurenceSpecificationImpl <em>Execution Occurence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.ExecutionOccurenceSpecificationImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getExecutionOccurenceSpecification()
	 * @generated
	 */
	int EXECUTION_OCCURENCE_SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Execution Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURENCE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURENCE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.StateInvariantImpl <em>State Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.StateInvariantImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getStateInvariant()
	 * @generated
	 */
	int STATE_INVARIANT = 4;

	/**
	 * The number of structural features of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.impl.InteractionImpl
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGES = 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interactionMetamodel.MessageSort <em>Message Sort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interactionMetamodel.MessageSort
	 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 6;


	/**
	 * Returns the meta object for class '{@link interactionMetamodel.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see interactionMetamodel.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the reference list '{@link interactionMetamodel.Lifeline#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interactions</em>'.
	 * @see interactionMetamodel.Lifeline#getInteractions()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Interactions();

	/**
	 * Returns the meta object for the reference list '{@link interactionMetamodel.Lifeline#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invariants</em>'.
	 * @see interactionMetamodel.Lifeline#getInvariants()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Invariants();

	/**
	 * Returns the meta object for class '{@link interactionMetamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see interactionMetamodel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link interactionMetamodel.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Event</em>'.
	 * @see interactionMetamodel.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the reference '{@link interactionMetamodel.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Event</em>'.
	 * @see interactionMetamodel.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for the attribute '{@link interactionMetamodel.Message#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see interactionMetamodel.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for class '{@link interactionMetamodel.MessageOccurenceSpecification <em>Message Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurence Specification</em>'.
	 * @see interactionMetamodel.MessageOccurenceSpecification
	 * @generated
	 */
	EClass getMessageOccurenceSpecification();

	/**
	 * Returns the meta object for the reference '{@link interactionMetamodel.MessageOccurenceSpecification#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lifeline</em>'.
	 * @see interactionMetamodel.MessageOccurenceSpecification#getLifeline()
	 * @see #getMessageOccurenceSpecification()
	 * @generated
	 */
	EReference getMessageOccurenceSpecification_Lifeline();

	/**
	 * Returns the meta object for class '{@link interactionMetamodel.ExecutionOccurenceSpecification <em>Execution Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Occurence Specification</em>'.
	 * @see interactionMetamodel.ExecutionOccurenceSpecification
	 * @generated
	 */
	EClass getExecutionOccurenceSpecification();

	/**
	 * Returns the meta object for class '{@link interactionMetamodel.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Invariant</em>'.
	 * @see interactionMetamodel.StateInvariant
	 * @generated
	 */
	EClass getStateInvariant();

	/**
	 * Returns the meta object for class '{@link interactionMetamodel.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see interactionMetamodel.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the reference list '{@link interactionMetamodel.Interaction#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see interactionMetamodel.Interaction#getMessages()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Messages();

	/**
	 * Returns the meta object for enum '{@link interactionMetamodel.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see interactionMetamodel.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionMetamodelFactory getInteractionMetamodelFactory();

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
		 * The meta object literal for the '{@link interactionMetamodel.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.LifelineImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__INTERACTIONS = eINSTANCE.getLifeline_Interactions();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__INVARIANTS = eINSTANCE.getLifeline_Invariants();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.MessageImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.impl.MessageOccurenceSpecificationImpl <em>Message Occurence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.MessageOccurenceSpecificationImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessageOccurenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURENCE_SPECIFICATION = eINSTANCE.getMessageOccurenceSpecification();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_OCCURENCE_SPECIFICATION__LIFELINE = eINSTANCE.getMessageOccurenceSpecification_Lifeline();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.impl.ExecutionOccurenceSpecificationImpl <em>Execution Occurence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.ExecutionOccurenceSpecificationImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getExecutionOccurenceSpecification()
		 * @generated
		 */
		EClass EXECUTION_OCCURENCE_SPECIFICATION = eINSTANCE.getExecutionOccurenceSpecification();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.impl.StateInvariantImpl <em>State Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.StateInvariantImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getStateInvariant()
		 * @generated
		 */
		EClass STATE_INVARIANT = eINSTANCE.getStateInvariant();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.impl.InteractionImpl
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__MESSAGES = eINSTANCE.getInteraction_Messages();

		/**
		 * The meta object literal for the '{@link interactionMetamodel.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interactionMetamodel.MessageSort
		 * @see interactionMetamodel.impl.InteractionMetamodelPackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

	}

} //InteractionMetamodelPackage
