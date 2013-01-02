/**
 */
package org.polytech.projet.model.carte.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polytech.projet.model.batiment.BatimentPackage;

import org.polytech.projet.model.batiment.impl.BatimentPackageImpl;

import org.polytech.projet.model.carte.Carte;
import org.polytech.projet.model.carte.CarteFactory;
import org.polytech.projet.model.carte.CartePackage;
import org.polytech.projet.model.carte.Ville;

import org.polytech.projet.model.joueur.JoueurPackage;

import org.polytech.projet.model.joueur.impl.JoueurPackageImpl;

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
public class CartePackageImpl extends EPackageImpl implements CartePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass villeEClass = null;

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
	 * @see org.polytech.projet.model.carte.CartePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CartePackageImpl() {
		super(eNS_URI, CarteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CartePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CartePackage init() {
		if (isInited) return (CartePackage)EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI);

		// Obtain or create and register package
		CartePackageImpl theCartePackage = (CartePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CartePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CartePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BatimentPackageImpl theBatimentPackage = (BatimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) instanceof BatimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) : BatimentPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UnitePackageImpl theUnitePackage = (UnitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) instanceof UnitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) : UnitePackage.eINSTANCE);
		JoueurPackageImpl theJoueurPackage = (JoueurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) instanceof JoueurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) : JoueurPackage.eINSTANCE);

		// Create package meta-data objects
		theCartePackage.createPackageContents();
		theBatimentPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUnitePackage.createPackageContents();
		theJoueurPackage.createPackageContents();

		// Initialize created meta-data
		theCartePackage.initializePackageContents();
		theBatimentPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUnitePackage.initializePackageContents();
		theJoueurPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCartePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CartePackage.eNS_URI, theCartePackage);
		return theCartePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarte() {
		return carteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_ListUnite() {
		return (EReference)carteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarte_ListBatiment() {
		return (EReference)carteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarte_Width() {
		return (EAttribute)carteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarte_Height() {
		return (EAttribute)carteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVille() {
		return villeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVille_Name() {
		return (EAttribute)villeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVille_Position() {
		return (EReference)villeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarteFactory getCarteFactory() {
		return (CarteFactory)getEFactoryInstance();
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
		carteEClass = createEClass(CARTE);
		createEReference(carteEClass, CARTE__LIST_UNITE);
		createEReference(carteEClass, CARTE__LIST_BATIMENT);
		createEAttribute(carteEClass, CARTE__WIDTH);
		createEAttribute(carteEClass, CARTE__HEIGHT);

		villeEClass = createEClass(VILLE);
		createEAttribute(villeEClass, VILLE__NAME);
		createEReference(villeEClass, VILLE__POSITION);
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

		// Obtain other dependent packages
		UnitePackage theUnitePackage = (UnitePackage)EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI);
		BatimentPackage theBatimentPackage = (BatimentPackage)EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(carteEClass, Carte.class, "Carte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarte_ListUnite(), theUnitePackage.getUnite(), null, "listUnite", null, 0, 100, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarte_ListBatiment(), theBatimentPackage.getBatiment(), null, "listBatiment", null, 0, 100, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarte_Width(), ecorePackage.getEInt(), "width", "20", 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarte_Height(), ecorePackage.getEInt(), "height", "20", 0, 1, Carte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(carteEClass, null, "generateMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(carteEClass, ecorePackage.getEBoolean(), "addUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUnitePackage.getUnite(), "unite", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(carteEClass, ecorePackage.getEBoolean(), "addBatiment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theBatimentPackage.getBatiment(), "batiment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(villeEClass, Ville.class, "Ville", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVille_Name(), ecorePackage.getEString(), "name", "city", 0, 1, Ville.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVille_Position(), theUtilPackage.getCoordonnee(), null, "position", null, 0, 1, Ville.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CartePackageImpl
