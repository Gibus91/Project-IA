/**
 */
package org.polytech.projet.model.util;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polytech.projet.model.util.UtilPackage
 * @generated
 */
public interface UtilFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilFactory eINSTANCE = org.polytech.projet.model.util.impl.UtilFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordonnee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordonnee</em>'.
	 * @generated
	 */
	Coordonnee createCoordonnee();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilPackage getUtilPackage();

} //UtilFactory
