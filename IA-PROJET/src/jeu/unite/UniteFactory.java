/**
 */
package jeu.unite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jeu.unite.UnitePackage
 * @generated
 */
public interface UniteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniteFactory eINSTANCE = jeu.unite.impl.UniteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unite</em>'.
	 * @generated
	 */
	Unite createUnite();

	/**
	 * Returns a new object of class '<em>Combat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combat</em>'.
	 * @generated
	 */
	UniteCombat createUniteCombat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnitePackage getUnitePackage();

} //UniteFactory
