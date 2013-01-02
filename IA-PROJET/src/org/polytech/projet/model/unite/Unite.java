/**
 */
package org.polytech.projet.model.unite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.polytech.projet.model.unite.Unite#getName <em>Name</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.Unite#getSymbole <em>Symbole</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.polytech.projet.model.unite.UnitePackage#getUnite()
 * @model
 * @generated
 */
public interface Unite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polytech.projet.model.unite.UnitePackage#getUnite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.Unite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.polytech.projet.model.unite.UnitePackage#getUnite_Symbole()
	 * @model
	 * @generated
	 */
	char getSymbole();

	/**
	 * Sets the value of the '{@link org.polytech.projet.model.unite.Unite#getSymbole <em>Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbole</em>' attribute.
	 * @see #getSymbole()
	 * @generated
	 */
	void setSymbole(char value);

} // Unite
