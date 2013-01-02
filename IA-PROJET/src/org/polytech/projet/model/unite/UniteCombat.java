/**
 */
package org.polytech.projet.model.unite;

import org.eclipse.emf.common.util.EList;

import org.polytech.projet.model.util.Coordonnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getArme <em>Arme</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getDistanceUnite <em>Distance Unite</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getVie <em>Vie</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getArmure <em>Armure</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getPorteeArme <em>Portee Arme</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.UniteCombat#getListCoordAccessible <em>List Coord Accessible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat()
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
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_Arme()
	 * @model default="0.0"
	 * @generated
	 */
	double getArme();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getArme <em>Arme</em>}' attribute.
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
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_CoordonneeUnit()
	 * @model
	 * @generated
	 */
	Coordonnee getCoordonneeUnit();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getCoordonneeUnit <em>Coordonnee Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordonnee Unit</em>' reference.
	 * @see #getCoordonneeUnit()
	 * @generated
	 */
	void setCoordonneeUnit(Coordonnee value);

	/**
	 * Returns the value of the '<em><b>Distance Unite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Unite</em>' attribute.
	 * @see #setDistanceUnite(int)
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_DistanceUnite()
	 * @model
	 * @generated
	 */
	int getDistanceUnite();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getDistanceUnite <em>Distance Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Unite</em>' attribute.
	 * @see #getDistanceUnite()
	 * @generated
	 */
	void setDistanceUnite(int value);

	/**
	 * Returns the value of the '<em><b>Vie</b></em>' attribute.
	 * The default value is <code>"100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vie</em>' attribute.
	 * @see #setVie(double)
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_Vie()
	 * @model default="100.0"
	 * @generated
	 */
	double getVie();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getVie <em>Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vie</em>' attribute.
	 * @see #getVie()
	 * @generated
	 */
	void setVie(double value);

	/**
	 * Returns the value of the '<em><b>Armure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armure</em>' attribute.
	 * @see #setArmure(double)
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_Armure()
	 * @model
	 * @generated
	 */
	double getArmure();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getArmure <em>Armure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armure</em>' attribute.
	 * @see #getArmure()
	 * @generated
	 */
	void setArmure(double value);

	/**
	 * Returns the value of the '<em><b>Portee Arme</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee Arme</em>' attribute.
	 * @see #setPorteeArme(int)
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_PorteeArme()
	 * @model default="1"
	 * @generated
	 */
	int getPorteeArme();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.UniteCombat#getPorteeArme <em>Portee Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee Arme</em>' attribute.
	 * @see #getPorteeArme()
	 * @generated
	 */
	void setPorteeArme(int value);

	/**
	 * Returns the value of the '<em><b>List Coord Accessible</b></em>' reference list.
	 * The list contents are of type {@link org.polytech.projet.model.util.Coordonnee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Coord Accessible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Coord Accessible</em>' reference list.
	 * @see org.polytech.projet.model.unite.UnitePackage#getUniteCombat_ListCoordAccessible()
	 * @model upper="100"
	 * @generated
	 */
	EList<Coordonnee> getListCoordAccessible();

} // UniteCombat
