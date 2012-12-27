/**
 */
package jeu.unite.impl;

import jeu.unite.UniteCombat;
import jeu.unite.UnitePackage;

import jeu.util.Coordonnee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getArme <em>Arme</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getCoordonneeUnit <em>Coordonnee Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniteCombatImpl extends UniteImpl implements UniteCombat {
	/**
	 * The default value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected static final double ARME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArme() <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArme()
	 * @generated
	 * @ordered
	 */
	protected double arme = ARME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordonneeUnit() <em>Coordonnee Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordonneeUnit()
	 * @generated
	 * @ordered
	 */
	protected Coordonnee coordonneeUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniteCombatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitePackage.Literals.UNITE_COMBAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArme() {
		return arme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArme(double newArme) {
		double oldArme = arme;
		arme = newArme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__ARME, oldArme, arme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee getCoordonneeUnit() {
		if (coordonneeUnit != null && coordonneeUnit.eIsProxy()) {
			InternalEObject oldCoordonneeUnit = (InternalEObject)coordonneeUnit;
			coordonneeUnit = (Coordonnee)eResolveProxy(oldCoordonneeUnit);
			if (coordonneeUnit != oldCoordonneeUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT, oldCoordonneeUnit, coordonneeUnit));
			}
		}
		return coordonneeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee basicGetCoordonneeUnit() {
		return coordonneeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordonneeUnit(Coordonnee newCoordonneeUnit) {
		Coordonnee oldCoordonneeUnit = coordonneeUnit;
		coordonneeUnit = newCoordonneeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT, oldCoordonneeUnit, coordonneeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnitePackage.UNITE_COMBAT__ARME:
				return getArme();
			case UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT:
				if (resolve) return getCoordonneeUnit();
				return basicGetCoordonneeUnit();
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
			case UnitePackage.UNITE_COMBAT__ARME:
				setArme((Double)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT:
				setCoordonneeUnit((Coordonnee)newValue);
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
			case UnitePackage.UNITE_COMBAT__ARME:
				setArme(ARME_EDEFAULT);
				return;
			case UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT:
				setCoordonneeUnit((Coordonnee)null);
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
			case UnitePackage.UNITE_COMBAT__ARME:
				return arme != ARME_EDEFAULT;
			case UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT:
				return coordonneeUnit != null;
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
		result.append(" (arme: ");
		result.append(arme);
		result.append(')');
		return result.toString();
	}

} //UniteCombatImpl
