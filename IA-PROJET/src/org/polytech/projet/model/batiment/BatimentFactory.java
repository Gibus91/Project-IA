/**
 */
package org.polytech.projet.model.batiment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.polytech.projet.model.batiment.BatimentPackage
 * @generated
 */
public interface BatimentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BatimentFactory eINSTANCE = org.polytech.projet.model.batiment.impl.BatimentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Production</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production</em>'.
	 * @generated
	 */
	BatimentProduction createBatimentProduction();

	/**
	 * Returns a new object of class '<em>Defence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defence</em>'.
	 * @generated
	 */
	BatimentDefence createBatimentDefence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BatimentPackage getBatimentPackage();

} //BatimentFactory
