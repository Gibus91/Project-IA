/**
 */
package org.polytech.projet.model.carte;

import org.eclipse.emf.ecore.EObject;

import org.polytech.projet.model.util.Coordonnee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ville</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polytech.projet.model.carte.Ville#getName <em>Name</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.Ville#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polytech.projet.model.carte.CartePackage#getVille()
 * @model
 * @generated
 */
public interface Ville extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"city"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polytech.projet.model.carte.CartePackage#getVille_Name()
	 * @model default="city"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.carte.Ville#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Coordonnee)
	 * @see org.polytech.projet.model.carte.CartePackage#getVille_Position()
	 * @model
	 * @generated
	 */
	Coordonnee getPosition();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.carte.Ville#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Coordonnee value);

} // Ville
