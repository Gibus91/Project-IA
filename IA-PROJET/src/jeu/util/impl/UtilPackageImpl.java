/**
 */
package jeu.util.impl;

import jeu.batiment.BatimentPackage;

import jeu.batiment.impl.BatimentPackageImpl;

import jeu.unite.UnitePackage;

import jeu.unite.impl.UnitePackageImpl;

import jeu.util.Coordonnee;
import jeu.util.UtilFactory;
import jeu.util.UtilPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordonneeEClass = null;

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
	 * @see jeu.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BatimentPackageImpl theBatimentPackage = (BatimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) instanceof BatimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BatimentPackage.eNS_URI) : BatimentPackage.eINSTANCE);
		UnitePackageImpl theUnitePackage = (UnitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) instanceof UnitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UnitePackage.eNS_URI) : UnitePackage.eINSTANCE);
		JoueurPackageImpl theJoueurPackage = (JoueurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) instanceof JoueurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JoueurPackage.eNS_URI) : JoueurPackage.eINSTANCE);
		CartePackageImpl theCartePackage = (CartePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) instanceof CartePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CartePackage.eNS_URI) : CartePackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theBatimentPackage.createPackageContents();
		theUnitePackage.createPackageContents();
		theJoueurPackage.createPackageContents();
		theCartePackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theBatimentPackage.initializePackageContents();
		theUnitePackage.initializePackageContents();
		theJoueurPackage.initializePackageContents();
		theCartePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordonnee() {
		return coordonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordonnee_X() {
		return (EAttribute)coordonneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordonnee_Y() {
		return (EAttribute)coordonneeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
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
		coordonneeEClass = createEClass(COORDONNEE);
		createEAttribute(coordonneeEClass, COORDONNEE__X);
		createEAttribute(coordonneeEClass, COORDONNEE__Y);
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

		// Initialize classes and features; add operations and parameters
		initEClass(coordonneeEClass, Coordonnee.class, "Coordonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordonnee_X(), ecorePackage.getEInt(), "x", null, 0, 1, Coordonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordonnee_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Coordonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(coordonneeEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "Coordonnee", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UtilPackageImpl
