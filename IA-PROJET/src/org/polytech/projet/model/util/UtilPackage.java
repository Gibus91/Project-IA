/**
 */
package org.polytech.projet.model.util;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.polytech.projet.model.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.polytech.projet.model.util";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = org.polytech.projet.model.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polytech.projet.model.util.impl.CoordonneeImpl <em>Coordonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polytech.projet.model.util.impl.CoordonneeImpl
	 * @see org.polytech.projet.model.util.impl.UtilPackageImpl#getCoordonnee()
	 * @generated
	 */
	int COORDONNEE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE__Y = 1;

	/**
	 * The number of structural features of the '<em>Coordonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDONNEE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.polytech.projet.model.util.Coordonnee <em>Coordonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordonnee</em>'.
	 * @see org.polytech.projet.model.util.Coordonnee
	 * @generated
	 */
	EClass getCoordonnee();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.util.Coordonnee#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.polytech.projet.model.util.Coordonnee#getX()
	 * @see #getCoordonnee()
	 * @generated
	 */
	EAttribute getCoordonnee_X();

	/**
	 * Returns the meta object for the attribute '{@link org.polytech.projet.model.util.Coordonnee#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.polytech.projet.model.util.Coordonnee#getY()
	 * @see #getCoordonnee()
	 * @generated
	 */
	EAttribute getCoordonnee_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '{@link org.polytech.projet.model.util.impl.CoordonneeImpl <em>Coordonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polytech.projet.model.util.impl.CoordonneeImpl
		 * @see org.polytech.projet.model.util.impl.UtilPackageImpl#getCoordonnee()
		 * @generated
		 */
		EClass COORDONNEE = eINSTANCE.getCoordonnee();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDONNEE__X = eINSTANCE.getCoordonnee_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDONNEE__Y = eINSTANCE.getCoordonnee_Y();

	}

} //UtilPackage
