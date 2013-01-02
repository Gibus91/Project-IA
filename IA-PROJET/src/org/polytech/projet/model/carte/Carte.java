/**
 */
package org.polytech.projet.model.carte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.polytech.projet.model.batiment.Batiment;

import org.polytech.projet.model.unite.Unite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polytech.projet.model.carte.Carte#getListUnite <em>List Unite</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.Carte#getListBatiment <em>List Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.Carte#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.Carte#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polytech.projet.model.carte.CartePackage#getCarte()
 * @model
 * @generated
 */
public interface Carte extends EObject {
	/**
	 * Returns the value of the '<em><b>List Unite</b></em>' reference list.
	 * The list contents are of type {@link org.polytech.projet.model.unite.Unite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Unite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Unite</em>' reference list.
	 * @see org.polytech.projet.model.carte.CartePackage#getCarte_ListUnite()
	 * @model upper="100"
	 * @generated
	 */
	EList<Unite> getListUnite();

	/**
	 * Returns the value of the '<em><b>List Batiment</b></em>' reference list.
	 * The list contents are of type {@link org.polytech.projet.model.batiment.Batiment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Batiment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Batiment</em>' reference list.
	 * @see org.polytech.projet.model.carte.CartePackage#getCarte_ListBatiment()
	 * @model upper="100"
	 * @generated
	 */
	EList<Batiment> getListBatiment();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.polytech.projet.model.carte.CartePackage#getCarte_Width()
	 * @model default="20"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.carte.Carte#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.polytech.projet.model.carte.CartePackage#getCarte_Height()
	 * @model default="20"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.carte.Carte#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void generateMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean addUnit(Unite unite);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean addBatiment(Batiment batiment);

} // Carte
