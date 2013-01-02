/**
 */
package org.polytech.projet.model.unite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polytech.projet.model.unite.Unite;
import org.polytech.projet.model.unite.UnitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polytech.projet.model.unite.impl.UniteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polytech.projet.model.unite.impl.UniteImpl#getSymbole <em>Symbole</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniteImpl extends EObjectImpl implements Unite {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbole() <em>Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbole()
	 * @generated
	 * @ordered
	 */
	protected static final char SYMBOLE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSymbole() <em>Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbole()
	 * @generated
	 * @ordered
	 */
	protected char symbole = SYMBOLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitePackage.Literals.UNITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSymbole() {
		return symbole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbole(char newSymbole) {
		char oldSymbole = symbole;
		symbole = newSymbole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE__SYMBOLE, oldSymbole, symbole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnitePackage.UNITE__NAME:
				return getName();
			case UnitePackage.UNITE__SYMBOLE:
				return getSymbole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnitePackage.UNITE__NAME:
				setName((String)newValue);
				return;
			case UnitePackage.UNITE__SYMBOLE:
				setSymbole((Character)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UnitePackage.UNITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnitePackage.UNITE__SYMBOLE:
				setSymbole(SYMBOLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UnitePackage.UNITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnitePackage.UNITE__SYMBOLE:
				return symbole != SYMBOLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", symbole: ");
		result.append(symbole);
		result.append(')');
		return result.toString();
	}

} //UniteImpl
