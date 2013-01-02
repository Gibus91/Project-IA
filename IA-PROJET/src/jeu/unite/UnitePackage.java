/**
 */
package jeu.unite;

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
 * @see jeu.unite.UniteFactory
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
	String eNS_URI = "org.polytech.model.jeu.unite";

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
	UnitePackage eINSTANCE = jeu.unite.impl.UnitePackageImpl.init();

	/**
	 * The meta object id for the '{@link jeu.unite.impl.UniteImpl <em>Unite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jeu.unite.impl.UniteImpl
	 * @see jeu.unite.impl.UnitePackageImpl#getUnite()
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
	 * The meta object id for the '{@link jeu.unite.impl.UniteCombatImpl <em>Combat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jeu.unite.impl.UniteCombatImpl
	 * @see jeu.unite.impl.UnitePackageImpl#getUniteCombat()
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
	 * Returns the meta object for class '{@link jeu.unite.Unite <em>Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unite</em>'.
	 * @see jeu.unite.Unite
	 * @generated
	 */
	EClass getUnite();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.Unite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jeu.unite.Unite#getName()
	 * @see #getUnite()
	 * @generated
	 */
	EAttribute getUnite_Name();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.Unite#getSymbole <em>Symbole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbole</em>'.
	 * @see jeu.unite.Unite#getSymbole()
	 * @see #getUnite()
	 * @generated
	 */
	EAttribute getUnite_Symbole();

	/**
	 * Returns the meta object for class '{@link jeu.unite.UniteCombat <em>Combat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combat</em>'.
	 * @see jeu.unite.UniteCombat
	 * @generated
	 */
	EClass getUniteCombat();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.UniteCombat#getArme <em>Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arme</em>'.
	 * @see jeu.unite.UniteCombat#getArme()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Arme();

	/**
	 * Returns the meta object for the reference '{@link jeu.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordonnee Unit</em>'.
	 * @see jeu.unite.UniteCombat#getCoordonneeUnit()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EReference getUniteCombat_CoordonneeUnit();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.UniteCombat#getDistanceUnite <em>Distance Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Unite</em>'.
	 * @see jeu.unite.UniteCombat#getDistanceUnite()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_DistanceUnite();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.UniteCombat#getVie <em>Vie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vie</em>'.
	 * @see jeu.unite.UniteCombat#getVie()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Vie();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.UniteCombat#getArmure <em>Armure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Armure</em>'.
	 * @see jeu.unite.UniteCombat#getArmure()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_Armure();

	/**
	 * Returns the meta object for the attribute '{@link jeu.unite.UniteCombat#getPorteeArme <em>Portee Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portee Arme</em>'.
	 * @see jeu.unite.UniteCombat#getPorteeArme()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EAttribute getUniteCombat_PorteeArme();

	/**
	 * Returns the meta object for the reference list '{@link jeu.unite.UniteCombat#getListCoordAccessible <em>List Coord Accessible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Coord Accessible</em>'.
	 * @see jeu.unite.UniteCombat#getListCoordAccessible()
	 * @see #getUniteCombat()
	 * @generated
	 */
	EReference getUniteCombat_ListCoordAccessible();

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
		 * The meta object literal for the '{@link jeu.unite.impl.UniteImpl <em>Unite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jeu.unite.impl.UniteImpl
		 * @see jeu.unite.impl.UnitePackageImpl#getUnite()
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
		 * The meta object literal for the '{@link jeu.unite.impl.UniteCombatImpl <em>Combat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jeu.unite.impl.UniteCombatImpl
		 * @see jeu.unite.impl.UnitePackageImpl#getUniteCombat()
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

	}

} //UnitePackage
