/**
 */
package org.polytech.projet.model.batiment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polytech.projet.model.batiment.BatimentDefence;
import org.polytech.projet.model.batiment.BatimentPackage;

import org.polytech.projet.model.unite.Unite;

import org.polytech.projet.model.util.Coordonnee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polytech.projet.model.batiment.impl.BatimentDefenceImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.impl.BatimentDefenceImpl#getLevelBatiment <em>Level Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.impl.BatimentDefenceImpl#getCoordonneeBatiment <em>Coordonnee Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.impl.BatimentDefenceImpl#getSymbole <em>Symbole</em>}</li>
 *   <li>{@link org.polytech.projet.model.batiment.impl.BatimentDefenceImpl#getListUnit <em>List Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BatimentDefenceImpl extends EObjectImpl implements BatimentDefence {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelBatiment() <em>Level Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelBatiment()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_BATIMENT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLevelBatiment() <em>Level Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelBatiment()
	 * @generated
	 * @ordered
	 */
	protected int levelBatiment = LEVEL_BATIMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordonneeBatiment() <em>Coordonnee Batiment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordonneeBatiment()
	 * @generated
	 * @ordered
	 */
	protected Coordonnee coordonneeBatiment;

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
	 * The cached value of the '{@link #getListUnit() <em>List Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Unite> listUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatimentDefenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BatimentPackage.Literals.BATIMENT_DEFENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BatimentPackage.BATIMENT_DEFENCE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevelBatiment() {
		return levelBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelBatiment(int newLevelBatiment) {
		int oldLevelBatiment = levelBatiment;
		levelBatiment = newLevelBatiment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BatimentPackage.BATIMENT_DEFENCE__LEVEL_BATIMENT, oldLevelBatiment, levelBatiment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee getCoordonneeBatiment() {
		if (coordonneeBatiment != null && coordonneeBatiment.eIsProxy()) {
			InternalEObject oldCoordonneeBatiment = (InternalEObject)coordonneeBatiment;
			coordonneeBatiment = (Coordonnee)eResolveProxy(oldCoordonneeBatiment);
			if (coordonneeBatiment != oldCoordonneeBatiment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT, oldCoordonneeBatiment, coordonneeBatiment));
			}
		}
		return coordonneeBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordonnee basicGetCoordonneeBatiment() {
		return coordonneeBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordonneeBatiment(Coordonnee newCoordonneeBatiment) {
		Coordonnee oldCoordonneeBatiment = coordonneeBatiment;
		coordonneeBatiment = newCoordonneeBatiment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT, oldCoordonneeBatiment, coordonneeBatiment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BatimentPackage.BATIMENT_DEFENCE__SYMBOLE, oldSymbole, symbole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unite> getListUnit() {
		if (listUnit == null) {
			listUnit = new EObjectResolvingEList<Unite>(Unite.class, this, BatimentPackage.BATIMENT_DEFENCE__LIST_UNIT);
		}
		return listUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BatimentPackage.BATIMENT_DEFENCE__NOM:
				return getNom();
			case BatimentPackage.BATIMENT_DEFENCE__LEVEL_BATIMENT:
				return getLevelBatiment();
			case BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT:
				if (resolve) return getCoordonneeBatiment();
				return basicGetCoordonneeBatiment();
			case BatimentPackage.BATIMENT_DEFENCE__SYMBOLE:
				return getSymbole();
			case BatimentPackage.BATIMENT_DEFENCE__LIST_UNIT:
				return getListUnit();
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
			case BatimentPackage.BATIMENT_DEFENCE__NOM:
				setNom((String)newValue);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__LEVEL_BATIMENT:
				setLevelBatiment((Integer)newValue);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT:
				setCoordonneeBatiment((Coordonnee)newValue);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__SYMBOLE:
				setSymbole((Character)newValue);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__LIST_UNIT:
				getListUnit().clear();
				getListUnit().addAll((Collection<? extends Unite>)newValue);
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
			case BatimentPackage.BATIMENT_DEFENCE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__LEVEL_BATIMENT:
				setLevelBatiment(LEVEL_BATIMENT_EDEFAULT);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT:
				setCoordonneeBatiment((Coordonnee)null);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__SYMBOLE:
				setSymbole(SYMBOLE_EDEFAULT);
				return;
			case BatimentPackage.BATIMENT_DEFENCE__LIST_UNIT:
				getListUnit().clear();
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
			case BatimentPackage.BATIMENT_DEFENCE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case BatimentPackage.BATIMENT_DEFENCE__LEVEL_BATIMENT:
				return levelBatiment != LEVEL_BATIMENT_EDEFAULT;
			case BatimentPackage.BATIMENT_DEFENCE__COORDONNEE_BATIMENT:
				return coordonneeBatiment != null;
			case BatimentPackage.BATIMENT_DEFENCE__SYMBOLE:
				return symbole != SYMBOLE_EDEFAULT;
			case BatimentPackage.BATIMENT_DEFENCE__LIST_UNIT:
				return listUnit != null && !listUnit.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", levelBatiment: ");
		result.append(levelBatiment);
		result.append(", symbole: ");
		result.append(symbole);
		result.append(')');
		return result.toString();
	}

} //BatimentDefenceImpl
