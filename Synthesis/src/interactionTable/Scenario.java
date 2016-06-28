/**
 */
package interactionTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionTable.Scenario#getCommunications <em>Communications</em>}</li>
 * </ul>
 *
 * @see interactionTable.InteractionTablePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Communications</b></em>' reference list.
	 * The list contents are of type {@link interactionTable.Communication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communications</em>' reference list.
	 * @see interactionTable.InteractionTablePackage#getScenario_Communications()
	 * @model
	 * @generated
	 */
	EList<Communication> getCommunications();

} // Scenario
