/**
 */
package org.polytech.projet.model.joueur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polytech.projet.model.batiment.BatimentPackage;

import org.polytech.projet.model.batiment.impl.BatimentPackageImpl;

import org.polytech.projet.model.carte.CartePackage;

import org.polytech.projet.model.carte.impl.CartePackageImpl;

import org.polytech.projet.model.joueur.Joueur;
import org.polytech.projet.model.joueur.JoueurFactory;
import org.polytech.projet.model.joueur.JoueurHumain;
import org.polytech.projet.model.joueur.JoueurIA;
import org.polytech.projet.model.joueur.JoueurPackage;

import org.polytech.projet.model.unite.UnitePackage;

import org.polytech.projet.model.unite.impl.UnitePackageImpl;

import org.polytech.projet.model.util.UtilPackage;

import org.polytech.projet.model.util.impl.UtilPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoueurPackageImpl extends EPackageImpl implements JoueurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joueurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joueurHumainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joueurIAEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polytech.projet.model.joueur.JoueurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoueurPackageImpl() {
		super(eNS_URI, JoueurFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JoueurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JoueurPackage init() {
		if (isInited) return (JoueurPackage)EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI);

		// Obtain or create and register package
		JoueurPackageImpl theJoueurPackage = (JoueurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JoueurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JoueurPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BatimentPackageImpl theBatimentPackage = (BatimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) instanceof BatimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) : BatimentPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UnitePackageImpl theUnitePackage = (UnitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) instanceof UnitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) : UnitePackage.eINSTANCE);
		CartePackageImpl theCartePackage = (CartePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) instanceof CartePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) : CartePackage.eINSTANCE);

		// Create package meta-data objects
		theJoueurPackage.createPackageContents();
		theBatimentPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUnitePackage.createPackageContents();
		theCartePackage.createPackageContents();

		// Initialize created meta-data
		theJoueurPackage.initializePackageContents();
		theBatimentPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUnitePackage.initializePackageContents();
		theCartePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoueurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JoueurPackage.eNS_URI, theJoueurPackage);
		return theJoueurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoueur() {
		return joueurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoueurHumain() {
		return joueurHumainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoueurIA() {
		return joueurIAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoueurFactory getJoueurFactory() {
		return (JoueurFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		joueurEClass = createEClass(JOUEUR);

		joueurHumainEClass = createEClass(JOUEUR_HUMAIN);

		joueurIAEClass = createEClass(JOUEUR_IA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		joueurHumainEClass.getESuperTypes().add(this.getJoueur());
		joueurIAEClass.getESuperTypes().add(this.getJoueur());

		// Initialize classes and features; add operations and parameters
		initEClass(joueurEClass, Joueur.class, "Joueur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joueurHumainEClass, JoueurHumain.class, "JoueurHumain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joueurIAEClass, JoueurIA.class, "JoueurIA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JoueurPackageImpl
