/**
 */
package interactionMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.Lifeline#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link interactionMetamodel.Lifeline#getInvariants <em>Invariants</em>}</li>
 * </ul>
 *
 * @see interactionMetamodel.InteractionMetamodelPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' reference list.
	 * The list contents are of type {@link interactionMetamodel.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactions</em>' reference list.
	 * @see interactionMetamodel.InteractionMetamodelPackage#getLifeline_Interactions()
	 * @model
	 * @generated
	 */
	EList<Interaction> getInteractions();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' reference list.
	 * The list contents are of type {@link interactionMetamodel.StateInvariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' reference list.
	 * @see interactionMetamodel.InteractionMetamodelPackage#getLifeline_Invariants()
	 * @model
	 * @generated
	 */
	EList<StateInvariant> getInvariants();

} // Lifeline
