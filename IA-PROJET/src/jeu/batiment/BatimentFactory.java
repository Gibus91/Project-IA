/**
 */
package jeu.batiment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jeu.batiment.BatimentPackage
 * @generated
 */
public interface BatimentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BatimentFactory eINSTANCE = jeu.batiment.impl.BatimentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Production</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production</em>'.
	 * @generated
	 */
	BatimentProduction createBatimentProduction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BatimentPackage getBatimentPackage();

} //BatimentFactory