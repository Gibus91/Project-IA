/**
 */
package org.polytech.projet.model.joueur;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.polytech.projet.model.joueur.JoueurFactory
 * @model kind="package"
 * @generated
 */
public interface JoueurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "joueur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polytech.projet.model.joueur";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "joueur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoueurPackage eINSTANCE = org.polytech.projet.model.joueur.impl.JoueurPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.joueur.impl.JoueurImpl <em>Joueur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.joueur.impl.JoueurImpl
	 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueur()
	 * @generated
	 */
	int JOUEUR = 0;

	/**
	 * The number of structural features of the '<em>Joueur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.joueur.impl.JoueurHumainImpl <em>Humain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.joueur.impl.JoueurHumainImpl
	 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueurHumain()
	 * @generated
	 */
	int JOUEUR_HUMAIN = 1;

	/**
	 * The number of structural features of the '<em>Humain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_HUMAIN_FEATURE_COUNT = JOUEUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.joueur.impl.JoueurIAImpl <em>IA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.joueur.impl.JoueurIAImpl
	 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueurIA()
	 * @generated
	 */
	int JOUEUR_IA = 2;

	/**
	 * The number of structural features of the '<em>IA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOUEUR_IA_FEATURE_COUNT = JOUEUR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.joueur.Joueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joueur</em>'.
	 * @see org.polytech.projet.model.joueur.Joueur
	 * @generated
	 */
	EClass getJoueur();

	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.joueur.JoueurHumain <em>Humain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Humain</em>'.
	 * @see org.polytech.projet.model.joueur.JoueurHumain
	 * @generated
	 */
	EClass getJoueurHumain();

	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.joueur.JoueurIA <em>IA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IA</em>'.
	 * @see org.polytech.projet.model.joueur.JoueurIA
	 * @generated
	 */
	EClass getJoueurIA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JoueurFactory getJoueurFactory();

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
		 * The meta object literal for the '{@link org.polytech.projet.model.joueur.impl.JoueurImpl <em>Joueur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.joueur.impl.JoueurImpl
		 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueur()
		 * @generated
		 */
		EClass JOUEUR = eINSTANCE.getJoueur();

		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.joueur.impl.JoueurHumainImpl <em>Humain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.joueur.impl.JoueurHumainImpl
		 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueurHumain()
		 * @generated
		 */
		EClass JOUEUR_HUMAIN = eINSTANCE.getJoueurHumain();

		/**
		 * The meta object literal for the '{@link org.polytech.projet.model.joueur.impl.JoueurIAImpl <em>IA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.joueur.impl.JoueurIAImpl
		 * @see org.polytech.projet.model.joueur.impl.JoueurPackageImpl#getJoueurIA()
		 * @generated
		 */
		EClass JOUEUR_IA = eINSTANCE.getJoueurIA();

	}

} //JoueurPackage
