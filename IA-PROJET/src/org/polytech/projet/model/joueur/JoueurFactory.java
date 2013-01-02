/**
 */
package org.polytech.projet.model.joueur;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polytech.projet.model.joueur.JoueurPackage
 * @generated
 */
public interface JoueurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JoueurFactory eINSTANCE = org.polytech.projet.model.joueur.impl.JoueurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Joueur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joueur</em>'.
	 * @generated
	 */
	Joueur createJoueur();

	/**
	 * Returns a new object of class '<em>Humain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Humain</em>'.
	 * @generated
	 */
	JoueurHumain createJoueurHumain();

	/**
	 * Returns a new object of class '<em>IA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IA</em>'.
	 * @generated
	 */
	JoueurIA createJoueurIA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JoueurPackage getJoueurPackage();

} //JoueurFactory
