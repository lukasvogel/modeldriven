/**
 */
package interactionMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.Interaction#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see interactionMetamodel.InteractionMetamodelPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link interactionMetamodel.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see interactionMetamodel.InteractionMetamodelPackage#getInteraction_Messages()
	 * @model
	 * @generated
	 */
	EList<Message> getMessages();

} // Interaction
