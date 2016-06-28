/**
 */
package ioAutomaton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ioAutomaton.IoAutomatonPackage
 * @generated
 */
public interface IoAutomatonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoAutomatonFactory eINSTANCE = ioAutomaton.impl.IoAutomatonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IO Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Automaton</em>'.
	 * @generated
	 */
	IOAutomaton createIOAutomaton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IoAutomatonPackage getIoAutomatonPackage();

} //IoAutomatonFactory
