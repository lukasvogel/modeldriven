/**
 */
package ioAutomaton;

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
 * @see ioAutomaton.IoAutomatonFactory
 * @model kind="package"
 * @generated
 */
public interface IoAutomatonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ioAutomaton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ioAutomaton";

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
	IoAutomatonPackage eINSTANCE = ioAutomaton.impl.IoAutomatonPackageImpl.init();

	/**
	 * The meta object id for the '{@link ioAutomaton.impl.IOAutomatonImpl <em>IO Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ioAutomaton.impl.IOAutomatonImpl
	 * @see ioAutomaton.impl.IoAutomatonPackageImpl#getIOAutomaton()
	 * @generated
	 */
	int IO_AUTOMATON = 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON__OUT = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON__IN = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON__STATES = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON__TRANSITIONS = 3;

	/**
	 * The number of structural features of the '<em>IO Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IO Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_AUTOMATON_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ioAutomaton.IOAutomaton <em>IO Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Automaton</em>'.
	 * @see ioAutomaton.IOAutomaton
	 * @generated
	 */
	EClass getIOAutomaton();

	/**
	 * Returns the meta object for the reference list '{@link ioAutomaton.IOAutomaton#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see ioAutomaton.IOAutomaton#getOut()
	 * @see #getIOAutomaton()
	 * @generated
	 */
	EReference getIOAutomaton_Out();

	/**
	 * Returns the meta object for the reference list '{@link ioAutomaton.IOAutomaton#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see ioAutomaton.IOAutomaton#getIn()
	 * @see #getIOAutomaton()
	 * @generated
	 */
	EReference getIOAutomaton_In();

	/**
	 * Returns the meta object for the reference list '{@link ioAutomaton.IOAutomaton#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see ioAutomaton.IOAutomaton#getStates()
	 * @see #getIOAutomaton()
	 * @generated
	 */
	EReference getIOAutomaton_States();

	/**
	 * Returns the meta object for the reference list '{@link ioAutomaton.IOAutomaton#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transitions</em>'.
	 * @see ioAutomaton.IOAutomaton#getTransitions()
	 * @see #getIOAutomaton()
	 * @generated
	 */
	EReference getIOAutomaton_Transitions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoAutomatonFactory getIoAutomatonFactory();

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
		 * The meta object literal for the '{@link ioAutomaton.impl.IOAutomatonImpl <em>IO Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ioAutomaton.impl.IOAutomatonImpl
		 * @see ioAutomaton.impl.IoAutomatonPackageImpl#getIOAutomaton()
		 * @generated
		 */
		EClass IO_AUTOMATON = eINSTANCE.getIOAutomaton();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_AUTOMATON__OUT = eINSTANCE.getIOAutomaton_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_AUTOMATON__IN = eINSTANCE.getIOAutomaton_In();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_AUTOMATON__STATES = eINSTANCE.getIOAutomaton_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_AUTOMATON__TRANSITIONS = eINSTANCE.getIOAutomaton_Transitions();

	}

} //IoAutomatonPackage
