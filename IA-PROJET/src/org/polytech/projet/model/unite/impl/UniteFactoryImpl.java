/**
 */
package org.polytech.projet.model.unite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polytech.projet.model.unite.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniteFactoryImpl extends EFactoryImpl implements UniteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniteFactory init() {
		try {
			UniteFactory theUniteFactory = (UniteFactory)EPackage.Registry.INSTANCE.getEFactory("org.polytech.projet.model.unite"); 
			if (theUniteFactory != null) {
				return theUniteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniteFactoryImpl() {
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
			case UnitePackage.UNITE: return createUnite();
			case UnitePackage.UNITE_COMBAT: return createUniteCombat();
			case UnitePackage.UNITE_PRODUCTION: return createUniteProduction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unite createUnite() {
		UniteImpl unite = new UniteImpl();
		return unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniteCombat createUniteCombat() {
		UniteCombatImpl uniteCombat = new UniteCombatImpl();
		return uniteCombat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniteProduction createUniteProduction() {
		UniteProductionImpl uniteProduction = new UniteProductionImpl();
		return uniteProduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitePackage getUnitePackage() {
		return (UnitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnitePackage getPackage() {
		return UnitePackage.eINSTANCE;
	}

} //UniteFactoryImpl
