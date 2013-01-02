/**
 */
package org.polytech.projet.model.carte;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polytech.projet.model.carte.CartePackage
 * @generated
 */
public interface CarteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarteFactory eINSTANCE = org.polytech.projet.model.carte.impl.CarteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carte</em>'.
	 * @generated
	 */
	Carte createCarte();

	/**
	 * Returns a new object of class '<em>Ville</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ville</em>'.
	 * @generated
	 */
	Ville createVille();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CartePackage getCartePackage();

} //CarteFactory
