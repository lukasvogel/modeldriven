/**
 */
package ioAutomaton.impl;

import ioAutomaton.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IoAutomatonFactoryImpl extends EFactoryImpl implements IoAutomatonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IoAutomatonFactory init() {
		try {
			IoAutomatonFactory theIoAutomatonFactory = (IoAutomatonFactory)EPackage.Registry.INSTANCE.getEFactory(IoAutomatonPackage.eNS_URI);
			if (theIoAutomatonFactory != null) {
				return theIoAutomatonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IoAutomatonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoAutomatonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IoAutomatonPackage.IO_AUTOMATON: return createIOAutomaton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOAutomaton createIOAutomaton() {
		IOAutomatonImpl ioAutomaton = new IOAutomatonImpl();
		return ioAutomaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoAutomatonPackage getIoAutomatonPackage() {
		return (IoAutomatonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IoAutomatonPackage getPackage() {
		return IoAutomatonPackage.eINSTANCE;
	}

} //IoAutomatonFactoryImpl
