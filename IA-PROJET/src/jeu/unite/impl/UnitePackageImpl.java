/**
 */
package jeu.unite.impl;

import jeu.batiment.BatimentPackage;

import jeu.batiment.impl.BatimentPackageImpl;

import jeu.unite.Unite;
import jeu.unite.UniteCombat;
import jeu.unite.UniteFactory;
import jeu.unite.UnitePackage;

import jeu.util.UtilPackage;

import jeu.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitePackageImpl extends EPackageImpl implements UnitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniteCombatEClass = null;

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
	 * @see jeu.unite.UnitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnitePackageImpl() {
		super(eNS_URI, UniteFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnitePackage init() {
		if (isInited) return (UnitePackage)EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI);

		// Obtain or create and register package
		UnitePackageImpl theUnitePackage = (UnitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UnitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UnitePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BatimentPackageImpl theBatimentPackage = (BatimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) instanceof BatimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) : BatimentPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theUnitePackage.createPackageContents();
		theBatimentPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theUnitePackage.initializePackageContents();
		theBatimentPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnitePackage.eNS_URI, theUnitePackage);
		return theUnitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnite() {
		return uniteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnite_Name() {
		return (EAttribute)uniteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnite_Symbole() {
		return (EAttribute)uniteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniteCombat() {
		return uniteCombatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniteCombat_Arme() {
		return (EAttribute)uniteCombatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniteCombat_CoordonneeUnit() {
		return (EReference)uniteCombatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniteFactory getUniteFactory() {
		return (UniteFactory)getEFactoryInstance();
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
		uniteEClass = createEClass(UNITE);
		createEAttribute(uniteEClass, UNITE__NAME);
		createEAttribute(uniteEClass, UNITE__SYMBOLE);

		uniteCombatEClass = createEClass(UNITE_COMBAT);
		createEAttribute(uniteCombatEClass, UNITE_COMBAT__ARME);
		createEReference(uniteCombatEClass, UNITE_COMBAT__COORDONNEE_UNIT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uniteCombatEClass.getESuperTypes().add(this.getUnite());

		// Initialize classes and features; add operations and parameters
		initEClass(uniteEClass, Unite.class, "Unite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnite_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnite_Symbole(), ecorePackage.getEChar(), "symbole", null, 0, 1, Unite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniteCombatEClass, UniteCombat.class, "UniteCombat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniteCombat_Arme(), ecorePackage.getEDouble(), "arme", "0.0", 0, 1, UniteCombat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniteCombat_CoordonneeUnit(), theUtilPackage.getCoordonnee(), null, "coordonneeUnit", null, 0, 1, UniteCombat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UnitePackageImpl
