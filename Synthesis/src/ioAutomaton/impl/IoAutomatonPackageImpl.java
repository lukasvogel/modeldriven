/**
 */
package ioAutomaton.impl;

import behaviourTable.BehaviourTablePackage;

import interactionTable.InteractionTablePackage;

import ioAutomaton.IOAutomaton;
import ioAutomaton.IoAutomatonFactory;
import ioAutomaton.IoAutomatonPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoAutomatonPackageImpl extends EPackageImpl implements IoAutomatonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioAutomatonEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ioAutomaton.IoAutomatonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IoAutomatonPackageImpl() {
		super(eNS_URI, IoAutomatonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IoAutomatonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IoAutomatonPackage init() {
		if (isInited) return (IoAutomatonPackage)EPackage.Registry.INSTANCE.getEPackage(IoAutomatonPackage.eNS_URI);

		// Obtain or create and register package
		IoAutomatonPackageImpl theIoAutomatonPackage = (IoAutomatonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IoAutomatonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IoAutomatonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BehaviourTablePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIoAutomatonPackage.createPackageContents();

		// Initialize created meta-data
		theIoAutomatonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIoAutomatonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IoAutomatonPackage.eNS_URI, theIoAutomatonPackage);
		return theIoAutomatonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOAutomaton() {
		return ioAutomatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOAutomaton_Out() {
		return (EReference)ioAutomatonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOAutomaton_In() {
		return (EReference)ioAutomatonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOAutomaton_States() {
		return (EReference)ioAutomatonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOAutomaton_Transitions() {
		return (EReference)ioAutomatonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoAutomatonFactory getIoAutomatonFactory() {
		return (IoAutomatonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ioAutomatonEClass = createEClass(IO_AUTOMATON);
		createEReference(ioAutomatonEClass, IO_AUTOMATON__OUT);
		createEReference(ioAutomatonEClass, IO_AUTOMATON__IN);
		createEReference(ioAutomatonEClass, IO_AUTOMATON__STATES);
		createEReference(ioAutomatonEClass, IO_AUTOMATON__TRANSITIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BehaviourTablePackage theBehaviourTablePackage = (BehaviourTablePackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourTablePackage.eNS_URI);
		InteractionTablePackage theInteractionTablePackage = (InteractionTablePackage)EPackage.Registry.INSTANCE.getEPackage(InteractionTablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ioAutomatonEClass, IOAutomaton.class, "IOAutomaton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOAutomaton_Out(), theBehaviourTablePackage.getActivation(), null, "out", null, 0, -1, IOAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIOAutomaton_In(), theInteractionTablePackage.getOperation(), null, "in", null, 0, -1, IOAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIOAutomaton_States(), theInteractionTablePackage.getState(), null, "states", null, 0, -1, IOAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIOAutomaton_Transitions(), theBehaviourTablePackage.getBehaviour(), null, "transitions", null, 0, -1, IOAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IoAutomatonPackageImpl
