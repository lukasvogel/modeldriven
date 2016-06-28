/**
 */
package behaviourTable;

import interactionTable.Operation;
import interactionTable.State;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.Behaviour#getPreState <em>Pre State</em>}</li>
 *   <li>{@link behaviourTable.Behaviour#getPostState <em>Post State</em>}</li>
 *   <li>{@link behaviourTable.Behaviour#getInMessage <em>In Message</em>}</li>
 *   <li>{@link behaviourTable.Behaviour#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @see behaviourTable.BehaviourTablePackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre State</em>' reference.
	 * @see #setPreState(State)
	 * @see behaviourTable.BehaviourTablePackage#getBehaviour_PreState()
	 * @model required="true"
	 * @generated
	 */
	State getPreState();

	/**
	 * Sets the value of the '{@link behaviourTable.Behaviour#getPreState <em>Pre State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre State</em>' reference.
	 * @see #getPreState()
	 * @generated
	 */
	void setPreState(State value);

	/**
	 * Returns the value of the '<em><b>Post State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post State</em>' reference.
	 * @see #setPostState(State)
	 * @see behaviourTable.BehaviourTablePackage#getBehaviour_PostState()
	 * @model required="true"
	 * @generated
	 */
	State getPostState();

	/**
	 * Sets the value of the '{@link behaviourTable.Behaviour#getPostState <em>Post State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post State</em>' reference.
	 * @see #getPostState()
	 * @generated
	 */
	void setPostState(State value);

	/**
	 * Returns the value of the '<em><b>In Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Message</em>' reference.
	 * @see #setInMessage(Operation)
	 * @see behaviourTable.BehaviourTablePackage#getBehaviour_InMessage()
	 * @model required="true"
	 * @generated
	 */
	Operation getInMessage();

	/**
	 * Sets the value of the '{@link behaviourTable.Behaviour#getInMessage <em>In Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Message</em>' reference.
	 * @see #getInMessage()
	 * @generated
	 */
	void setInMessage(Operation value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' reference.
	 * @see #setActivation(Activation)
	 * @see behaviourTable.BehaviourTablePackage#getBehaviour_Activation()
	 * @model required="true"
	 * @generated
	 */
	Activation getActivation();

	/**
	 * Sets the value of the '{@link behaviourTable.Behaviour#getActivation <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Activation value);

} // Behaviour
