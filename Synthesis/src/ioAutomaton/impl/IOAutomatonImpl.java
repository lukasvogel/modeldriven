/**
 */
package ioAutomaton.impl;

import behaviourTable.Activation;
import behaviourTable.Behaviour;

import interactionTable.Operation;
import interactionTable.State;

import ioAutomaton.IOAutomaton;
import ioAutomaton.IoAutomatonPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Automaton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ioAutomaton.impl.IOAutomatonImpl#getOut <em>Out</em>}</li>
 *   <li>{@link ioAutomaton.impl.IOAutomatonImpl#getIn <em>In</em>}</li>
 *   <li>{@link ioAutomaton.impl.IOAutomatonImpl#getStates <em>States</em>}</li>
 *   <li>{@link ioAutomaton.impl.IOAutomatonImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOAutomatonImpl extends MinimalEObjectImpl.Container implements IOAutomaton {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Activation> out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> in;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Behaviour> transitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOAutomatonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IoAutomatonPackage.Literals.IO_AUTOMATON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activation> getOut() {
		if (out == null) {
			out = new EObjectResolvingEList<Activation>(Activation.class, this, IoAutomatonPackage.IO_AUTOMATON__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getIn() {
		if (in == null) {
			in = new EObjectResolvingEList<Operation>(Operation.class, this, IoAutomatonPackage.IO_AUTOMATON__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectResolvingEList<State>(State.class, this, IoAutomatonPackage.IO_AUTOMATON__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behaviour> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectResolvingEList<Behaviour>(Behaviour.class, this, IoAutomatonPackage.IO_AUTOMATON__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IoAutomatonPackage.IO_AUTOMATON__OUT:
				return getOut();
			case IoAutomatonPackage.IO_AUTOMATON__IN:
				return getIn();
			case IoAutomatonPackage.IO_AUTOMATON__STATES:
				return getStates();
			case IoAutomatonPackage.IO_AUTOMATON__TRANSITIONS:
				return getTransitions();
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
			case IoAutomatonPackage.IO_AUTOMATON__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Activation>)newValue);
				return;
			case IoAutomatonPackage.IO_AUTOMATON__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Operation>)newValue);
				return;
			case IoAutomatonPackage.IO_AUTOMATON__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case IoAutomatonPackage.IO_AUTOMATON__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Behaviour>)newValue);
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
			case IoAutomatonPackage.IO_AUTOMATON__OUT:
				getOut().clear();
				return;
			case IoAutomatonPackage.IO_AUTOMATON__IN:
				getIn().clear();
				return;
			case IoAutomatonPackage.IO_AUTOMATON__STATES:
				getStates().clear();
				return;
			case IoAutomatonPackage.IO_AUTOMATON__TRANSITIONS:
				getTransitions().clear();
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
			case IoAutomatonPackage.IO_AUTOMATON__OUT:
				return out != null && !out.isEmpty();
			case IoAutomatonPackage.IO_AUTOMATON__IN:
				return in != null && !in.isEmpty();
			case IoAutomatonPackage.IO_AUTOMATON__STATES:
				return states != null && !states.isEmpty();
			case IoAutomatonPackage.IO_AUTOMATON__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IOAutomatonImpl
