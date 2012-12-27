/**
 */
package jeu.unite;

import jeu.util.Coordonnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jeu.unite.UniteCombat#getArme <em>Arme</em>}</li>
 *   <li>{@link jeu.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see jeu.unite.UnitePackage#getUniteCombat()
 * @model
 * @generated
 */
public interface UniteCombat extends Unite {
	/**
	 * Returns the value of the '<em><b>Arme</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arme</em>' attribute.
	 * @see #setArme(double)
	 * @see jeu.unite.UnitePackage#getUniteCombat_Arme()
	 * @model default="0.0"
	 * @generated
	 */
	double getArme();

	/**
	 * Sets the value of the '{@link jeu.unite.UniteCombat#getArme <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arme</em>' attribute.
	 * @see #getArme()
	 * @generated
	 */
	void setArme(double value);

	/**
	 * Returns the value of the '<em><b>Coordonnee Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordonnee Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordonnee Unit</em>' reference.
	 * @see #setCoordonneeUnit(Coordonnee)
	 * @see jeu.unite.UnitePackage#getUniteCombat_CoordonneeUnit()
	 * @model
	 * @generated
	 */
	Coordonnee getCoordonneeUnit();

	/**
	 * Sets the value of the '{@link jeu.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordonnee Unit</em>' reference.
	 * @see #getCoordonneeUnit()
	 * @generated
	 */
	void setCoordonneeUnit(Coordonnee value);

} // UniteCombat
