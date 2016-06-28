/**
 */
package behaviourTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourTable.BehaviourTable#getBehaviours <em>Behaviours</em>}</li>
 * </ul>
 *
 * @see behaviourTable.BehaviourTablePackage#getBehaviourTable()
 * @model
 * @generated
 */
public interface BehaviourTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviours</b></em>' reference list.
	 * The list contents are of type {@link behaviourTable.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviours</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviours</em>' reference list.
	 * @see behaviourTable.BehaviourTablePackage#getBehaviourTable_Behaviours()
	 * @model
	 * @generated
	 */
	EList<Behaviour> getBehaviours();

} // BehaviourTable
