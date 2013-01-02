/**
 */
package org.polytech.projet.model.carte;

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
 * @see org.polytech.projet.model.carte.CarteFactory
 * @model kind="package"
 * @generated
 */
public interface CartePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "carte";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polytech.projet.model.carte";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "carte";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CartePackage eINSTANCE = org.polytech.projet.model.carte.impl.CartePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.carte.impl.CarteImpl <em>Carte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.carte.impl.CarteImpl
	 * @see org.polytech.projet.model.carte.impl.CartePackageImpl#getCarte()
	 * @generated
	 */
	int CARTE = 0;

	/**
	 * The feature id for the '<em><b>List Unite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__LIST_UNITE = 0;

	/**
	 * The feature id for the '<em><b>List Batiment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__LIST_BATIMENT = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Carte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.carte.impl.VilleImpl <em>Ville</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.carte.impl.VilleImpl
	 * @see org.polytech.projet.model.carte.impl.CartePackageImpl#getVille()
	 * @generated
	 */
	int VILLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Ville</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VILLE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.carte.Carte <em>Carte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carte</em>'.
	 * @see org.polytech.projet.model.carte.Carte
	 * @generated
	 */
	EClass getCarte();

	/**
	 * Returns the meta object for the reference list '{@link org.polytech.projet.model.carte.Carte#getListUnite <em>List Unite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Unite</em>'.
	 * @see org.polytech.projet.model.carte.Carte#getListUnite()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_ListUnite();

	/**
	 * Returns the meta object for the reference list '{@link org.polytech.projet.model.carte.Carte#getListBatiment <em>List Batiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Batiment</em>'.
	 * @see org.polytech.projet.model.carte.Carte#getListBatiment()
	 * @see #getCarte()
	 * @generated
	 */
	EReference getCarte_ListBatiment();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.carte.Carte#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.polytech.projet.model.carte.Carte#getWidth()
	 * @see #getCarte()
	 * @generated
	 */
	EAttribute getCarte_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.carte.Carte#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.polytech.projet.model.carte.Carte#getHeight()
	 * @see #getCarte()
	 * @generated
	 */
	EAttribute getCarte_Height();

	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.carte.Ville <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ville</em>'.
	 * @see org.polytech.projet.model.carte.Ville
	 * @generated
	 */
	EClass getVille();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.carte.Ville#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.polytech.projet.model.carte.Ville#getName()
	 * @see #getVille()
	 * @generated
	 */
	EAttribute getVille_Name();

	/**
	 * Returns the meta object for the reference '{@link org.polytech.projet.model.carte.Ville#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see org.polytech.projet.model.carte.Ville#getPosition()
	 * @see #getVille()
	 * @generated
	 */
	EReference getVille_Position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarteFactory getCarteFactory();

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
		 * The meta object literal for the '{@link org.polytech.projet.model.carte.impl.CarteImpl <em>Carte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.carte.impl.CarteImpl
		 * @see org.polytech.projet.model.carte.impl.CartePackageImpl#getCarte()
		 * @generated
		 */
		EClass CARTE = eINSTANCE.getCarte();

		/**
		 * The meta object literal for the '<em><b>List Unite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__LIST_UNITE = eINSTANCE.getCarte_ListUnite();

		/**
		 * The meta object literal for the '<em><b>List Batiment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTE__LIST_BATIMENT = eINSTANCE.getCarte_ListBatiment();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTE__WIDTH = eINSTANCE.getCarte_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTE__HEIGHT = eINSTANCE.getCarte_Height();

		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.carte.impl.VilleImpl <em>Ville</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.carte.impl.VilleImpl
		 * @see org.polytech.projet.model.carte.impl.CartePackageImpl#getVille()
		 * @generated
		 */
		EClass VILLE = eINSTANCE.getVille();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VILLE__NAME = eINSTANCE.getVille_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VILLE__POSITION = eINSTANCE.getVille_Position();

	}

} //CartePackage
