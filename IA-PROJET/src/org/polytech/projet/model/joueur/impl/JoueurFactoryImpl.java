/**
 */
package org.polytech.projet.model.joueur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polytech.projet.model.joueur.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoueurFactoryImpl extends EFactoryImpl implements JoueurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JoueurFactory init() {
		try {
			JoueurFactory theJoueurFactory = (JoueurFactory)EPackage.Registry.INSTANCE.getEFactory("org.polytech.projet.model.joueur"); 
			if (theJoueurFactory != null) {
				return theJoueurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JoueurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoueurFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JoueurPackage.JOUEUR: return createJoueur();
			case JoueurPackage.JOUEUR_HUMAIN: return createJoueurHumain();
			case JoueurPackage.JOUEUR_IA: return createJoueurIA();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joueur createJoueur() {
		JoueurImpl joueur = new JoueurImpl();
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoueurHumain createJoueurHumain() {
		JoueurHumainImpl joueurHumain = new JoueurHumainImpl();
		return joueurHumain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoueurIA createJoueurIA() {
		JoueurIAImpl joueurIA = new JoueurIAImpl();
		return joueurIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoueurPackage getJoueurPackage() {
		return (JoueurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JoueurPackage getPackage() {
		return JoueurPackage.eINSTANCE;
	}

} //JoueurFactoryImpl
