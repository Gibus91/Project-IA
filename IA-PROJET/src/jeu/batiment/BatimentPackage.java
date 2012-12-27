/**
 */
package jeu.batiment;

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
 * @see jeu.batiment.BatimentFactory
 * @model kind="package"
 * @generated
 */
public interface BatimentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "batiment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polytech.model.jeu.batiment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "batiment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BatimentPackage eINSTANCE = jeu.batiment.impl.BatimentPackageImpl.init();

	/**
	 * The meta object id for the '{@link jeu.batiment.Batiment <em>Batiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jeu.batiment.Batiment
	 * @see jeu.batiment.impl.BatimentPackageImpl#getBatiment()
	 * @generated
	 */
	int BATIMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Level Batiment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__LEVEL_BATIMENT = 1;

	/**
	 * The feature id for the '<em><b>Coordonnee Batiment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__COORDONNEE_BATIMENT = 2;

	/**
	 * The feature id for the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__SYMBOLE = 3;

	/**
	 * The feature id for the '<em><b>List Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT__LIST_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Batiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jeu.batiment.impl.BatimentProductionImpl <em>Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jeu.batiment.impl.BatimentProductionImpl
	 * @see jeu.batiment.impl.BatimentPackageImpl#getBatimentProduction()
	 * @generated
	 */
	int BATIMENT_PRODUCTION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION__NOM = BATIMENT__NOM;

	/**
	 * The feature id for the '<em><b>Level Batiment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION__LEVEL_BATIMENT = BATIMENT__LEVEL_BATIMENT;

	/**
	 * The feature id for the '<em><b>Coordonnee Batiment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION__COORDONNEE_BATIMENT = BATIMENT__COORDONNEE_BATIMENT;

	/**
	 * The feature id for the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION__SYMBOLE = BATIMENT__SYMBOLE;

	/**
	 * The feature id for the '<em><b>List Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION__LIST_UNIT = BATIMENT__LIST_UNIT;

	/**
	 * The number of structural features of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATIMENT_PRODUCTION_FEATURE_COUNT = BATIMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jeu.batiment.Batiment <em>Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batiment</em>'.
	 * @see jeu.batiment.Batiment
	 * @generated
	 */
	EClass getBatiment();

	/**
	 * Returns the meta object for the attribute '{@link jeu.batiment.Batiment#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see jeu.batiment.Batiment#getNom()
	 * @see #getBatiment()
	 * @generated
	 */
	EAttribute getBatiment_Nom();

	/**
	 * Returns the meta object for the attribute '{@link jeu.batiment.Batiment#getLevelBatiment <em>Level Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Batiment</em>'.
	 * @see jeu.batiment.Batiment#getLevelBatiment()
	 * @see #getBatiment()
	 * @generated
	 */
	EAttribute getBatiment_LevelBatiment();

	/**
	 * Returns the meta object for the reference '{@link jeu.batiment.Batiment#getCoordonneeBatiment <em>Coordonnee Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordonnee Batiment</em>'.
	 * @see jeu.batiment.Batiment#getCoordonneeBatiment()
	 * @see #getBatiment()
	 * @generated
	 */
	EReference getBatiment_CoordonneeBatiment();

	/**
	 * Returns the meta object for the attribute '{@link jeu.batiment.Batiment#getSymbole <em>Symbole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbole</em>'.
	 * @see jeu.batiment.Batiment#getSymbole()
	 * @see #getBatiment()
	 * @generated
	 */
	EAttribute getBatiment_Symbole();

	/**
	 * Returns the meta object for the reference list '{@link jeu.batiment.Batiment#getListUnit <em>List Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Unit</em>'.
	 * @see jeu.batiment.Batiment#getListUnit()
	 * @see #getBatiment()
	 * @generated
	 */
	EReference getBatiment_ListUnit();

	/**
	 * Returns the meta object for class '{@link jeu.batiment.BatimentProduction <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production</em>'.
	 * @see jeu.batiment.BatimentProduction
	 * @generated
	 */
	EClass getBatimentProduction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BatimentFactory getBatimentFactory();

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
		 * The meta object literal for the '{@link jeu.batiment.Batiment <em>Batiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jeu.batiment.Batiment
		 * @see jeu.batiment.impl.BatimentPackageImpl#getBatiment()
		 * @generated
		 */
		EClass BATIMENT = eINSTANCE.getBatiment();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATIMENT__NOM = eINSTANCE.getBatiment_Nom();

		/**
		 * The meta object literal for the '<em><b>Level Batiment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATIMENT__LEVEL_BATIMENT = eINSTANCE.getBatiment_LevelBatiment();

		/**
		 * The meta object literal for the '<em><b>Coordonnee Batiment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATIMENT__COORDONNEE_BATIMENT = eINSTANCE.getBatiment_CoordonneeBatiment();

		/**
		 * The meta object literal for the '<em><b>Symbole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATIMENT__SYMBOLE = eINSTANCE.getBatiment_Symbole();

		/**
		 * The meta object literal for the '<em><b>List Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATIMENT__LIST_UNIT = eINSTANCE.getBatiment_ListUnit();

		/**
		 * The meta object literal for the '{@link jeu.batiment.impl.BatimentProductionImpl <em>Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jeu.batiment.impl.BatimentProductionImpl
		 * @see jeu.batiment.impl.BatimentPackageImpl#getBatimentProduction()
		 * @generated
		 */
		EClass BATIMENT_PRODUCTION = eINSTANCE.getBatimentProduction();

	}

} //BatimentPackage
