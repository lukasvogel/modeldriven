/**
 */
package interactionMetamodel.impl;

import interactionMetamodel.Interaction;
import interactionMetamodel.InteractionMetamodelPackage;
import interactionMetamodel.Lifeline;
import interactionMetamodel.StateInvariant;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interactionMetamodel.impl.LifelineImpl#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link interactionMetamodel.impl.LifelineImpl#getInvariants <em>Invariants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifelineImpl extends MinimalEObjectImpl.Container implements Lifeline {
	/**
	 * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interactions;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<StateInvariant> invariants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionMetamodelPackage.Literals.LIFELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getInteractions() {
		if (interactions == null) {
			interactions = new EObjectResolvingEList<Interaction>(Interaction.class, this, InteractionMetamodelPackage.LIFELINE__INTERACTIONS);
		}
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateInvariant> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectResolvingEList<StateInvariant>(StateInvariant.class, this, InteractionMetamodelPackage.LIFELINE__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionMetamodelPackage.LIFELINE__INTERACTIONS:
				return getInteractions();
			case InteractionMetamodelPackage.LIFELINE__INVARIANTS:
				return getInvariants();
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
			case InteractionMetamodelPackage.LIFELINE__INTERACTIONS:
				getInteractions().clear();
				getInteractions().addAll((Collection<? extends Interaction>)newValue);
				return;
			case InteractionMetamodelPackage.LIFELINE__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends StateInvariant>)newValue);
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
			case InteractionMetamodelPackage.LIFELINE__INTERACTIONS:
				getInteractions().clear();
				return;
			case InteractionMetamodelPackage.LIFELINE__INVARIANTS:
				getInvariants().clear();
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
			case InteractionMetamodelPackage.LIFELINE__INTERACTIONS:
				return interactions != null && !interactions.isEmpty();
			case InteractionMetamodelPackage.LIFELINE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LifelineImpl
