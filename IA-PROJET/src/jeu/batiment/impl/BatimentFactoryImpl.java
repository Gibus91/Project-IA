/**
 */
package jeu.batiment.impl;

import jeu.batiment.*;

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
public class BatimentFactoryImpl extends EFactoryImpl implements BatimentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BatimentFactory init() {
		try {
			BatimentFactory theBatimentFactory = (BatimentFactory)EPackage.Registry.INSTANCE.getEFactory("org.polytech.model.jeu.batiment"); 
			if (theBatimentFactory != null) {
				return theBatimentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BatimentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatimentFactoryImpl() {
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
			case BatimentPackage.BATIMENT_PRODUCTION: return createBatimentProduction();
			case BatimentPackage.BATIMENT_DEFENCE: return createBatimentDefence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatimentProduction createBatimentProduction() {
		BatimentProductionImpl batimentProduction = new BatimentProductionImpl();
		return batimentProduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatimentDefence createBatimentDefence() {
		BatimentDefenceImpl batimentDefence = new BatimentDefenceImpl();
		return batimentDefence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatimentPackage getBatimentPackage() {
		return (BatimentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BatimentPackage getPackage() {
		return BatimentPackage.eINSTANCE;
	}

} //BatimentFactoryImpl
