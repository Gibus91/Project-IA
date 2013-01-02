/**
 */
package org.polytech.projet.model.carte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polytech.projet.model.batiment.Batiment;

import org.polytech.projet.model.carte.Carte;
import org.polytech.projet.model.carte.CartePackage;

import org.polytech.projet.model.unite.Unite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.polytech.projet.model.carte.impl.CarteImpl#getListUnite <em>List Unite</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.impl.CarteImpl#getListBatiment <em>List Batiment</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.impl.CarteImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.polytech.projet.model.carte.impl.CarteImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarteImpl extends EObjectImpl implements Carte {
	/**
	 * The cached value of the '{@link #getListUnite() <em>List Unite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<Unite> listUnite;

	/**
	 * The cached value of the '{@link #getListBatiment() <em>List Batiment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBatiment()
	 * @generated
	 * @ordered
	 */
	protected EList<Batiment> listBatiment;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CartePackage.Literals.CARTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unite> getListUnite() {
		if (listUnite == null) {
			listUnite = new EObjectResolvingEList<Unite>(Unite.class, this, CartePackage.CARTE__LIST_UNITE);
		}
		return listUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Batiment> getListBatiment() {
		if (listBatiment == null) {
			listBatiment = new EObjectResolvingEList<Batiment>(Batiment.class, this, CartePackage.CARTE__LIST_BATIMENT);
		}
		return listBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartePackage.CARTE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CartePackage.CARTE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateMap() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addUnit(Unite unite) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addBatiment(Batiment batiment) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CartePackage.CARTE__LIST_UNITE:
				return getListUnite();
			case CartePackage.CARTE__LIST_BATIMENT:
				return getListBatiment();
			case CartePackage.CARTE__WIDTH:
				return getWidth();
			case CartePackage.CARTE__HEIGHT:
				return getHeight();
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
			case CartePackage.CARTE__LIST_UNITE:
				getListUnite().clear();
				getListUnite().addAll((Collection<? extends Unite>)newValue);
				return;
			case CartePackage.CARTE__LIST_BATIMENT:
				getListBatiment().clear();
				getListBatiment().addAll((Collection<? extends Batiment>)newValue);
				return;
			case CartePackage.CARTE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CartePackage.CARTE__HEIGHT:
				setHeight((Integer)newValue);
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
			case CartePackage.CARTE__LIST_UNITE:
				getListUnite().clear();
				return;
			case CartePackage.CARTE__LIST_BATIMENT:
				getListBatiment().clear();
				return;
			case CartePackage.CARTE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CartePackage.CARTE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case CartePackage.CARTE__LIST_UNITE:
				return listUnite != null && !listUnite.isEmpty();
			case CartePackage.CARTE__LIST_BATIMENT:
				return listBatiment != null && !listBatiment.isEmpty();
			case CartePackage.CARTE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CartePackage.CARTE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //CarteImpl
