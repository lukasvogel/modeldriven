/**
 */
package interactionMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.MessageOccurenceSpecification#getLifeline <em>Lifeline</em>}</li>
 * </ul>
 *
 * @see interactionMetamodel.InteractionMetamodelPackage#getMessageOccurenceSpecification()
 * @model
 * @generated
 */
public interface MessageOccurenceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' reference.
	 * @see #setLifeline(Lifeline)
	 * @see interactionMetamodel.InteractionMetamodelPackage#getMessageOccurenceSpecification_Lifeline()
	 * @model required="true"
	 * @generated
	 */
	Lifeline getLifeline();

	/**
	 * Sets the value of the '{@link interactionMetamodel.MessageOccurenceSpecification#getLifeline <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifeline</em>' reference.
	 * @see #getLifeline()
	 * @generated
	 */
	void setLifeline(Lifeline value);

} // MessageOccurenceSpecification
