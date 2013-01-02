/**
 */
package jeu.unite.impl;

import java.util.Collection;

import jeu.unite.UniteCombat;
import jeu.unite.UnitePackage;

import jeu.util.Coordonnee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getArme <em>Arme</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getCoordonneeUnit <em>Coordonnee Unit</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getDistanceUnite <em>Distance Unite</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getVie <em>Vie</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getArmure <em>Armure</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getPorteeArme <em>Portee Arme</em>}</li>
 *   <li>{@link jeu.unite.impl.UniteCombatImpl#getListCoordAccessible <em>List Coord Accessible</em>}</li>
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
	 * The default value of the '{@link #getDistanceUnite() <em>Distance Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceUnite()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_UNITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistanceUnite() <em>Distance Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceUnite()
	 * @generated
	 * @ordered
	 */
	protected int distanceUnite = DISTANCE_UNITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVie() <em>Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVie()
	 * @generated
	 * @ordered
	 */
	protected static final double VIE_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getVie() <em>Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVie()
	 * @generated
	 * @ordered
	 */
	protected double vie = VIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArmure() <em>Armure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmure()
	 * @generated
	 * @ordered
	 */
	protected static final double ARMURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArmure() <em>Armure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmure()
	 * @generated
	 * @ordered
	 */
	protected double armure = ARMURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorteeArme() <em>Portee Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteeArme()
	 * @generated
	 * @ordered
	 */
	protected static final int PORTEE_ARME_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPorteeArme() <em>Portee Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteeArme()
	 * @generated
	 * @ordered
	 */
	protected int porteeArme = PORTEE_ARME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListCoordAccessible() <em>List Coord Accessible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCoordAccessible()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordonnee> listCoordAccessible;

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
	public int getDistanceUnite() {
		return distanceUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceUnite(int newDistanceUnite) {
		int oldDistanceUnite = distanceUnite;
		distanceUnite = newDistanceUnite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__DISTANCE_UNITE, oldDistanceUnite, distanceUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVie() {
		return vie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVie(double newVie) {
		double oldVie = vie;
		vie = newVie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__VIE, oldVie, vie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArmure() {
		return armure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmure(double newArmure) {
		double oldArmure = armure;
		armure = newArmure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__ARMURE, oldArmure, armure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPorteeArme() {
		return porteeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteeArme(int newPorteeArme) {
		int oldPorteeArme = porteeArme;
		porteeArme = newPorteeArme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitePackage.UNITE_COMBAT__PORTEE_ARME, oldPorteeArme, porteeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coordonnee> getListCoordAccessible() {
		if (listCoordAccessible == null) {
			listCoordAccessible = new EObjectResolvingEList<Coordonnee>(Coordonnee.class, this, UnitePackage.UNITE_COMBAT__LIST_COORD_ACCESSIBLE);
		}
		return listCoordAccessible;
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
			case UnitePackage.UNITE_COMBAT__DISTANCE_UNITE:
				return getDistanceUnite();
			case UnitePackage.UNITE_COMBAT__VIE:
				return getVie();
			case UnitePackage.UNITE_COMBAT__ARMURE:
				return getArmure();
			case UnitePackage.UNITE_COMBAT__PORTEE_ARME:
				return getPorteeArme();
			case UnitePackage.UNITE_COMBAT__LIST_COORD_ACCESSIBLE:
				return getListCoordAccessible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnitePackage.UNITE_COMBAT__ARME:
				setArme((Double)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__COORDONNEE_UNIT:
				setCoordonneeUnit((Coordonnee)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__DISTANCE_UNITE:
				setDistanceUnite((Integer)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__VIE:
				setVie((Double)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__ARMURE:
				setArmure((Double)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__PORTEE_ARME:
				setPorteeArme((Integer)newValue);
				return;
			case UnitePackage.UNITE_COMBAT__LIST_COORD_ACCESSIBLE:
				getListCoordAccessible().clear();
				getListCoordAccessible().addAll((Collection<? extends Coordonnee>)newValue);
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
			case UnitePackage.UNITE_COMBAT__DISTANCE_UNITE:
				setDistanceUnite(DISTANCE_UNITE_EDEFAULT);
				return;
			case UnitePackage.UNITE_COMBAT__VIE:
				setVie(VIE_EDEFAULT);
				return;
			case UnitePackage.UNITE_COMBAT__ARMURE:
				setArmure(ARMURE_EDEFAULT);
				return;
			case UnitePackage.UNITE_COMBAT__PORTEE_ARME:
				setPorteeArme(PORTEE_ARME_EDEFAULT);
				return;
			case UnitePackage.UNITE_COMBAT__LIST_COORD_ACCESSIBLE:
				getListCoordAccessible().clear();
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
			case UnitePackage.UNITE_COMBAT__DISTANCE_UNITE:
				return distanceUnite != DISTANCE_UNITE_EDEFAULT;
			case UnitePackage.UNITE_COMBAT__VIE:
				return vie != VIE_EDEFAULT;
			case UnitePackage.UNITE_COMBAT__ARMURE:
				return armure != ARMURE_EDEFAULT;
			case UnitePackage.UNITE_COMBAT__PORTEE_ARME:
				return porteeArme != PORTEE_ARME_EDEFAULT;
			case UnitePackage.UNITE_COMBAT__LIST_COORD_ACCESSIBLE:
				return listCoordAccessible != null && !listCoordAccessible.isEmpty();
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
		result.append(", distanceUnite: ");
		result.append(distanceUnite);
		result.append(", vie: ");
		result.append(vie);
		result.append(", armure: ");
		result.append(armure);
		result.append(", porteeArme: ");
		result.append(porteeArme);
		result.append(')');
		return result.toString();
	}

} //UniteCombatImpl
