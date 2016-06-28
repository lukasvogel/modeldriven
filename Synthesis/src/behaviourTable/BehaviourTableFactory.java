/**
 */
package behaviourTable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviourTable.BehaviourTablePackage
 * @generated
 */
public interface BehaviourTableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourTableFactory eINSTANCE = behaviourTable.impl.BehaviourTableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour</em>'.
	 * @generated
	 */
	Behaviour createBehaviour();

	/**
	 * Returns a new object of class '<em>Behaviour Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour Table</em>'.
	 * @generated
	 */
	BehaviourTable createBehaviourTable();

	/**
	 * Returns a new object of class '<em>Out Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Message</em>'.
	 * @generated
	 */
	OutMessage createOutMessage();

	/**
	 * Returns a new object of class '<em>Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation</em>'.
	 * @generated
	 */
	Activation createActivation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourTablePackage getBehaviourTablePackage();

} //BehaviourTableFactory
