/**
 */
package org.polytech.projet.model.unite;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.polytech.projet.model.unite.UniteFactory
 * @model kind="package"
 * @generated
 */
public interface UnitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polytech.projet.model.unite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitePackage eINSTANCE = org.polytech.projet.model.unite.impl.UnitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.unite.impl.UniteImpl <em>Unite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.unite.impl.UniteImpl
	 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUnite()
	 * @generated
	 */
	int UNITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE__SYMBOLE = 1;

	/**
	 * The number of structural features of the '<em>Unite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.unite.impl.UniteCombatImpl <em>Combat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.unite.impl.UniteCombatImpl
	 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUniteCombat()
	 * @generated
	 */
	int UNITE_COMBAT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__NAME = UNITE__NAME;

	/**
	 * The feature id for the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__SYMBOLE = UNITE__SYMBOLE;

	/**
	 * The feature id for the '<em><b>Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__ARME = UNITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordonnee Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__COORDONNEE_UNIT = UNITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Distance Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__DISTANCE_UNITE = UNITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__VIE = UNITE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Armure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__ARMURE = UNITE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Portee Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__PORTEE_ARME = UNITE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>List Coord Accessible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT__LIST_COORD_ACCESSIBLE = UNITE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Combat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_COMBAT_FEATURE_COUNT = UNITE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.unite.impl.UniteProductionImpl <em>Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.unite.impl.UniteProductionImpl
	 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUniteProduction()
	 * @generated
	 */
	int UNITE_PRODUCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_PRODUCTION__NAME = UNITE__NAME;

	/**
	 * The feature id for the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_PRODUCTION__SYMBOLE = UNITE__SYMBOLE;

	/**
	 * The number of structural features of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNITE_PRODUCTION_FEATURE_COUNT = UNITE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.unite.Unite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unite</em>'.
	 * @see org.polytech.projet.model.unite.Unite
	 * @generated
	 */
	EClass getUnite();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.Unite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polytech.projet.model.unite.Unite#getName()
	 * @see #getUnite()
	 * @generated
	 */
	EAttribute getUnite_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.Unite#getSymbole <em>Symbole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbole</em>'.
	 * @see org.polytech.projet.model.unite.Unite#getSymbole()
	 * @see #getUnite()
	 * @generated
	 */
	EAttribute getUnite_Symbole();

	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.unite.UniteCombat <em>Combat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combat</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat
	 * @generated
	 */
	EClass getUniteCombat();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.UniteCombat#getArme <em>Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arme</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getArme()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Arme();

	/**
	 * Returns the meta object for the reference '{@link org.polytech.projet.model.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordonnee Unit</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getCoordonneeUnit()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EReference getUniteCombat_CoordonneeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.UniteCombat#getDistanceUnite <em>Distance Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Unite</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getDistanceUnite()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_DistanceUnite();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.UniteCombat#getVie <em>Vie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vie</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getVie()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Vie();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.UniteCombat#getArmure <em>Armure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armure</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getArmure()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Armure();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.unite.UniteCombat#getPorteeArme <em>Portee Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portee Arme</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getPorteeArme()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_PorteeArme();

	/**
	 * Returns the meta object for the reference list '{@link org.polytech.projet.model.unite.UniteCombat#getListCoordAccessible <em>List Coord Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Coord Accessible</em>'.
	 * @see org.polytech.projet.model.unite.UniteCombat#getListCoordAccessible()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EReference getUniteCombat_ListCoordAccessible();

	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.unite.UniteProduction <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production</em>'.
	 * @see org.polytech.projet.model.unite.UniteProduction
	 * @generated
	 */
	EClass getUniteProduction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniteFactory getUniteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.unite.impl.UniteImpl <em>Unite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.unite.impl.UniteImpl
		 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUnite()
		 * @generated
		 */
		EClass UNITE = eINSTANCE.getUnite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE__NAME = eINSTANCE.getUnite_Name();

		/**
		 * The meta object literal for the '<em><b>Symbole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE__SYMBOLE = eINSTANCE.getUnite_Symbole();

		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.unite.impl.UniteCombatImpl <em>Combat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.unite.impl.UniteCombatImpl
		 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUniteCombat()
		 * @generated
		 */
		EClass UNITE_COMBAT = eINSTANCE.getUniteCombat();

		/**
		 * The meta object literal for the '<em><b>Arme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE_COMBAT__ARME = eINSTANCE.getUniteCombat_Arme();

		/**
		 * The meta object literal for the '<em><b>Coordonnee Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITE_COMBAT__COORDONNEE_UNIT = eINSTANCE.getUniteCombat_CoordonneeUnit();

		/**
		 * The meta object literal for the '<em><b>Distance Unite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE_COMBAT__DISTANCE_UNITE = eINSTANCE.getUniteCombat_DistanceUnite();

		/**
		 * The meta object literal for the '<em><b>Vie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE_COMBAT__VIE = eINSTANCE.getUniteCombat_Vie();

		/**
		 * The meta object literal for the '<em><b>Armure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE_COMBAT__ARMURE = eINSTANCE.getUniteCombat_Armure();

		/**
		 * The meta object literal for the '<em><b>Portee Arme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNITE_COMBAT__PORTEE_ARME = eINSTANCE.getUniteCombat_PorteeArme();

		/**
		 * The meta object literal for the '<em><b>List Coord Accessible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNITE_COMBAT__LIST_COORD_ACCESSIBLE = eINSTANCE.getUniteCombat_ListCoordAccessible();

		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.unite.impl.UniteProductionImpl <em>Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.unite.impl.UniteProductionImpl
		 * @see org.polytech.projet.model.unite.impl.UnitePackageImpl#getUniteProduction()
		 * @generated
		 */
		EClass UNITE_PRODUCTION = eINSTANCE.getUniteProduction();

	}

} //UnitePackage
