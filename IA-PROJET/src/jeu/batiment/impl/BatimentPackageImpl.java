/**
 */
package jeu.batiment.impl;

import jeu.batiment.Batiment;
import jeu.batiment.BatimentDefence;
import jeu.batiment.BatimentFactory;
import jeu.batiment.BatimentPackage;
import jeu.batiment.BatimentProduction;

import jeu.unite.UnitePackage;

import jeu.unite.impl.UnitePackageImpl;

import jeu.util.UtilPackage;

import jeu.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polytech.model.jeu.model.carte.CartePackage;

import org.polytech.model.jeu.model.carte.impl.CartePackageImpl;

import org.polytech.model.jeu.model.joueur.JoueurPackage;

import org.polytech.model.jeu.model.joueur.impl.JoueurPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BatimentPackageImpl extends EPackageImpl implements BatimentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batimentProductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batimentDefenceEClass = null;

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
	 * @see jeu.batiment.BatimentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BatimentPackageImpl() {
		super(eNS_URI, BatimentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BatimentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BatimentPackage init() {
		if (isInited) return (BatimentPackage)EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI);

		// Obtain or create and register package
		BatimentPackageImpl theBatimentPackage = (BatimentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BatimentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BatimentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UnitePackageImpl theUnitePackage = (UnitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) instanceof UnitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) : UnitePackage.eINSTANCE);
		JoueurPackageImpl theJoueurPackage = (JoueurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) instanceof JoueurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) : JoueurPackage.eINSTANCE);
		CartePackageImpl theCartePackage = (CartePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) instanceof CartePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) : CartePackage.eINSTANCE);

		// Create package meta-data objects
		theBatimentPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUnitePackage.createPackageContents();
		theJoueurPackage.createPackageContents();
		theCartePackage.createPackageContents();

		// Initialize created meta-data
		theBatimentPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUnitePackage.initializePackageContents();
		theJoueurPackage.initializePackageContents();
		theCartePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBatimentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BatimentPackage.eNS_URI, theBatimentPackage);
		return theBatimentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatiment() {
		return batimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatiment_Nom() {
		return (EAttribute)batimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatiment_LevelBatiment() {
		return (EAttribute)batimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatiment_CoordonneeBatiment() {
		return (EReference)batimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatiment_Symbole() {
		return (EAttribute)batimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatiment_ListUnit() {
		return (EReference)batimentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatimentProduction() {
		return batimentProductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatimentDefence() {
		return batimentDefenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatimentFactory getBatimentFactory() {
		return (BatimentFactory)getEFactoryInstance();
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
		batimentEClass = createEClass(BATIMENT);
		createEAttribute(batimentEClass, BATIMENT__NOM);
		createEAttribute(batimentEClass, BATIMENT__LEVEL_BATIMENT);
		createEReference(batimentEClass, BATIMENT__COORDONNEE_BATIMENT);
		createEAttribute(batimentEClass, BATIMENT__SYMBOLE);
		createEReference(batimentEClass, BATIMENT__LIST_UNIT);

		batimentProductionEClass = createEClass(BATIMENT_PRODUCTION);

		batimentDefenceEClass = createEClass(BATIMENT_DEFENCE);
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
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UnitePackage theUnitePackage = (UnitePackage)EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		batimentProductionEClass.getESuperTypes().add(this.getBatiment());

		// Initialize classes and features; add operations and parameters
		initEClass(batimentEClass, Batiment.class, "Batiment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatiment_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatiment_LevelBatiment(), ecorePackage.getEInt(), "levelBatiment", "1", 0, 1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatiment_CoordonneeBatiment(), theUtilPackage.getCoordonnee(), null, "coordonneeBatiment", null, 0, 1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatiment_Symbole(), ecorePackage.getEChar(), "symbole", null, 0, 1, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBatiment_ListUnit(), theUnitePackage.getUnite(), null, "listUnit", null, 0, 10, Batiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batimentProductionEClass, BatimentProduction.class, "BatimentProduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(batimentDefenceEClass, BatimentDefence.class, "BatimentDefence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BatimentPackageImpl
