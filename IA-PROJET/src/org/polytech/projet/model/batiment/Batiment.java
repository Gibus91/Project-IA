/**
 */
package org.polytech.projet.model.batiment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polytech.projet.model.unite.Unite;

import org.polytech.projet.model.util.Coordonnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polytech.projet.model.batiment.Batiment#getNom <em>Nom</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.Batiment#getLevelBatiment <em>Level Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.Batiment#getCoordonneeBatiment <em>Coordonnee Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.Batiment#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.Batiment#getListUnit <em>List Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Batiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.batiment.Batiment#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Level Batiment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Batiment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Batiment</em>' attribute.
	 * @see #setLevelBatiment(int)
	 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment_LevelBatiment()
	 * @model default="1"
	 * @generated
	 */
	int getLevelBatiment();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.batiment.Batiment#getLevelBatiment <em>Level Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Batiment</em>' attribute.
	 * @see #getLevelBatiment()
	 * @generated
	 */
	void setLevelBatiment(int value);

	/**
	 * Returns the value of the '<em><b>Coordonnee Batiment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordonnee Batiment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordonnee Batiment</em>' reference.
	 * @see #setCoordonneeBatiment(Coordonnee)
	 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment_CoordonneeBatiment()
	 * @model
	 * @generated
	 */
	Coordonnee getCoordonneeBatiment();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.batiment.Batiment#getCoordonneeBatiment <em>Coordonnee Batiment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordonnee Batiment</em>' reference.
	 * @see #getCoordonneeBatiment()
	 * @generated
	 */
	void setCoordonneeBatiment(Coordonnee value);

	/**
	 * Returns the value of the '<em><b>Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbole</em>' attribute.
	 * @see #setSymbole(char)
	 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment_Symbole()
	 * @model
	 * @generated
	 */
	char getSymbole();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.batiment.Batiment#getSymbole <em>Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbole</em>' attribute.
	 * @see #getSymbole()
	 * @generated
	 */
	void setSymbole(char value);

	/**
	 * Returns the value of the '<em><b>List Unit</b></em>' reference list.
	 * The list contents are of type {@link org.polytech.projet.model.unite.Unite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Unit</em>' reference list.
	 * @see org.polytech.projet.model.batiment.BatimentPackage#getBatiment_ListUnit()
	 * @model upper="10"
	 * @generated
	 */
	EList<Unite> getListUnit();

} // Batiment
