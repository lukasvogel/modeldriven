/**
 */
package ioAutomaton;

import behaviourTable.Activation;
import behaviourTable.Behaviour;

import interactionTable.Operation;
import interactionTable.State;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ioAutomaton.IOAutomaton#getOut <em>Out</em>}</li>
 *   <li>{@link ioAutomaton.IOAutomaton#getIn <em>In</em>}</li>
 *   <li>{@link ioAutomaton.IOAutomaton#getStates <em>States</em>}</li>
 *   <li>{@link ioAutomaton.IOAutomaton#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see ioAutomaton.IoAutomatonPackage#getIOAutomaton()
 * @model
 * @generated
 */
public interface IOAutomaton extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link behaviourTable.Activation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see ioAutomaton.IoAutomatonPackage#getIOAutomaton_Out()
	 * @model derived="true"
	 * @generated
	 */
	EList<Activation> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link interactionTable.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see ioAutomaton.IoAutomatonPackage#getIOAutomaton_In()
	 * @model derived="true"
	 * @generated
	 */
	EList<Operation> getIn();

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link interactionTable.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see ioAutomaton.IoAutomatonPackage#getIOAutomaton_States()
	 * @model derived="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link behaviourTable.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see ioAutomaton.IoAutomatonPackage#getIOAutomaton_Transitions()
	 * @model
	 * @generated
	 */
	EList<Behaviour> getTransitions();

} // IOAutomaton
