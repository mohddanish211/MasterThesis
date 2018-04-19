/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.abs.AbsFactory;
import org.xtext.abs.AbsPackage;
import org.xtext.abs.After_condition;
import org.xtext.abs.AndGuard;
import org.xtext.abs.And_expr;
import org.xtext.abs.Annotation;
import org.xtext.abs.Annotations;
import org.xtext.abs.Anon_function_decl;
import org.xtext.abs.AppAnd_exp;
import org.xtext.abs.AppOr_exp;
import org.xtext.abs.Application_condition;
import org.xtext.abs.Case_branch;
import org.xtext.abs.Casestmtbranch;
import org.xtext.abs.Class_decl;
import org.xtext.abs.Class_modifier_fragment;
import org.xtext.abs.Comparison_expr;
import org.xtext.abs.Compilation_Unit;
import org.xtext.abs.DataType_decl;
import org.xtext.abs.Data_constructor;
import org.xtext.abs.Data_constructor_arg;
import org.xtext.abs.Decl;
import org.xtext.abs.Delta_access;
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Delta_id;
import org.xtext.abs.Delta_param;
import org.xtext.abs.Deltaspec;
import org.xtext.abs.DomainModel;
import org.xtext.abs.Eff_expr;
import org.xtext.abs.Equality_expr;
import org.xtext.abs.Exception_decl;
import org.xtext.abs.Exp;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Feature_decl_attribute;
import org.xtext.abs.Feature_decl_constraint;
import org.xtext.abs.Feature_decl_group;
import org.xtext.abs.Fextension;
import org.xtext.abs.Field_decl;
import org.xtext.abs.Fnode;
import org.xtext.abs.From_condition;
import org.xtext.abs.Function_decl;
import org.xtext.abs.Function_list;
import org.xtext.abs.Function_name_decl;
import org.xtext.abs.Function_name_list;
import org.xtext.abs.Function_name_param_decl;
import org.xtext.abs.Function_param;
import org.xtext.abs.Functional_modifier;
import org.xtext.abs.Guard;
import org.xtext.abs.Has_condition;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Interface_modifier_fragment;
import org.xtext.abs.Interface_name;
import org.xtext.abs.Main_block;
import org.xtext.abs.Method;
import org.xtext.abs.Methodsig;
import org.xtext.abs.Mexp;
import org.xtext.abs.MexpAnd_expr;
import org.xtext.abs.MexpComparison_expr;
import org.xtext.abs.MexpEquality_expr;
import org.xtext.abs.MexpImplies_expr;
import org.xtext.abs.MexpMulDivOrMod_expr;
import org.xtext.abs.MexpOr_exp;
import org.xtext.abs.MexpPlusOrMinus_expr;
import org.xtext.abs.MexpPrimary_expr;
import org.xtext.abs.Module_decl;
import org.xtext.abs.Module_export;
import org.xtext.abs.Module_import;
import org.xtext.abs.Module_modifier;
import org.xtext.abs.MulDivOrMod_expr;
import org.xtext.abs.Namespace_modifier;
import org.xtext.abs.NotExpression;
import org.xtext.abs.OO_modifier;
import org.xtext.abs.Object_update;
import org.xtext.abs.Object_update_assign_stmt;
import org.xtext.abs.Or_expr;
import org.xtext.abs.Par_function_decl;
import org.xtext.abs.Param_decl;
import org.xtext.abs.Param_list;
import org.xtext.abs.Pattern;
import org.xtext.abs.PlusOrMinus_expr;
import org.xtext.abs.ProductAnd_exp;
import org.xtext.abs.ProductOr_expr;
import org.xtext.abs.ProductPrimary_exp;
import org.xtext.abs.Product_decl;
import org.xtext.abs.Product_expr;
import org.xtext.abs.Product_reconfiguration;
import org.xtext.abs.Productline_decl;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;
import org.xtext.abs.Stmt;
import org.xtext.abs.Trait_decl;
import org.xtext.abs.Trait_expr;
import org.xtext.abs.Trait_oper;
import org.xtext.abs.Trait_usage;
import org.xtext.abs.Type_exp;
import org.xtext.abs.Type_use;
import org.xtext.abs.Typesyn_decl;
import org.xtext.abs.Update_decl;
import org.xtext.abs.Update_preamble_declaration;
import org.xtext.abs.Var_or_field_ref;
import org.xtext.abs.When_condition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsPackageImpl extends EPackageImpl implements AbsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilation_UnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass module_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass module_exportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass module_importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass par_function_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_name_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_name_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataType_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_constructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass data_constructor_argEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_useEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pure_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_or_field_refEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass case_branchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pure_exp_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_name_param_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anon_function_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass param_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass param_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass function_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typesyn_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exception_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodsigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eff_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delta_idEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass casestmtbranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trait_usageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trait_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trait_operEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trait_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass main_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delta_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delta_paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass has_conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delta_accessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass module_modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functional_modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oO_modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_modifier_fragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_modifier_fragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespace_modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass update_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass object_updateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass update_preamble_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass object_update_assign_stmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productline_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delta_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaspecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass after_conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass from_conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass when_conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass application_conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass product_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass product_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass product_reconfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feature_declEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feature_decl_groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fnodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feature_decl_attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass feature_decl_constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fextensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass or_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass and_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equality_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparison_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusOrMinus_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulDivOrMod_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andGuardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appOr_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appAnd_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productOr_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productAnd_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productPrimary_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpOr_expEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpAnd_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpImplies_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpEquality_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpComparison_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpPlusOrMinus_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpMulDivOrMod_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mexpPrimary_exprEClass = null;

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
   * @see org.xtext.abs.AbsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AbsPackageImpl()
  {
    super(eNS_URI, AbsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AbsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AbsPackage init()
  {
    if (isInited) return (AbsPackage)EPackage.Registry.INSTANCE.getEPackage(AbsPackage.eNS_URI);

    // Obtain or create and register package
    AbsPackageImpl theAbsPackage = (AbsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAbsPackage.createPackageContents();

    // Initialize created meta-data
    theAbsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAbsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AbsPackage.eNS_URI, theAbsPackage);
    return theAbsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilation_Unit()
  {
    return compilation_UnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Module()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_DeltaDecl()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Update_decl()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Productline_decl()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Product_decl()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Feature_decl()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_Unit_Fextension()
  {
    return (EReference)compilation_UnitEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule_decl()
  {
    return module_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_decl_Name()
  {
    return (EAttribute)module_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_decl_Module_export()
  {
    return (EReference)module_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_decl_Module_import()
  {
    return (EReference)module_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_decl_Decl()
  {
    return (EReference)module_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_decl_Main_block()
  {
    return (EReference)module_declEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule_export()
  {
    return module_exportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_export_AnyPackage()
  {
    return (EAttribute)module_exportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_export_ImportedNamespace()
  {
    return (EAttribute)module_exportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule_import()
  {
    return module_importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_import_ImportedNamespace()
  {
    return (EAttribute)module_importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_import_Name()
  {
    return (EAttribute)module_importEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecl()
  {
    return declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecl_Name()
  {
    return (EAttribute)declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPar_function_decl()
  {
    return par_function_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPar_function_decl_Type_use()
  {
    return (EReference)par_function_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPar_function_decl_Lt()
  {
    return (EAttribute)par_function_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPar_function_decl_P()
  {
    return (EAttribute)par_function_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPar_function_decl_Gt()
  {
    return (EAttribute)par_function_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPar_function_decl_Functions()
  {
    return (EReference)par_function_declEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPar_function_decl_Params()
  {
    return (EReference)par_function_declEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPar_function_decl_E()
  {
    return (EReference)par_function_declEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_name_list()
  {
    return function_name_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_name_list_Function_name_decl()
  {
    return (EReference)function_name_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_name_decl()
  {
    return function_name_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_name_decl_Name()
  {
    return (EAttribute)function_name_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType_decl()
  {
    return dataType_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_decl_Lt()
  {
    return (EAttribute)dataType_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_decl_P()
  {
    return (EAttribute)dataType_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_decl_Gt()
  {
    return (EAttribute)dataType_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_decl_Data_constructor()
  {
    return (EReference)dataType_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getData_constructor()
  {
    return data_constructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getData_constructor_Name()
  {
    return (EAttribute)data_constructorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getData_constructor_Data_constructor_arg()
  {
    return (EReference)data_constructorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getData_constructor_arg()
  {
    return data_constructor_argEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotations()
  {
    return annotationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotations_Annotation()
  {
    return (EReference)annotationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Pure_exp()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_use()
  {
    return type_useEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_use_Name()
  {
    return (EAttribute)type_useEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_use_Type_use()
  {
    return (EReference)type_useEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPure_exp()
  {
    return pure_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Function_list()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Partial_function_pure_exp_list()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Function_expr()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Variadic_exp_list()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_C()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_L()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Else()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Casebranch()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Type_use()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPure_exp_Value()
  {
    return (EAttribute)pure_expEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_I()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_B()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_Var_or_field_ref()
  {
    return (EReference)pure_expEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar_or_field_ref()
  {
    return var_or_field_refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVar_or_field_ref_Name()
  {
    return (EAttribute)var_or_field_refEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCase_branch()
  {
    return case_branchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Pure_exp()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Pattern()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPure_exp_list()
  {
    return pure_exp_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPure_exp_list_Pure_exp()
  {
    return (EReference)pure_exp_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_list()
  {
    return function_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_list_Function_param()
  {
    return (EReference)function_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_param()
  {
    return function_paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_name_param_decl()
  {
    return function_name_param_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_name_param_decl_Value()
  {
    return (EAttribute)function_name_param_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnon_function_decl()
  {
    return anon_function_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnon_function_decl_Params()
  {
    return (EReference)anon_function_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnon_function_decl_Pure_exp()
  {
    return (EReference)anon_function_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam_list()
  {
    return param_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParam_list_Param_decl()
  {
    return (EReference)param_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam_decl()
  {
    return param_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParam_decl_Type_exp()
  {
    return (EReference)param_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_decl_Name()
  {
    return (EAttribute)param_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_exp()
  {
    return type_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_exp_Name()
  {
    return (EAttribute)type_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_exp_Lt()
  {
    return (EAttribute)type_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_exp_P()
  {
    return (EReference)type_expEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_exp_Gt()
  {
    return (EAttribute)type_expEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction_decl()
  {
    return function_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_decl_Type_use()
  {
    return (EReference)function_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_decl_Lt()
  {
    return (EAttribute)function_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_decl_ImportedNamespace()
  {
    return (EAttribute)function_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_decl_Gt()
  {
    return (EAttribute)function_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_decl_Paramlist()
  {
    return (EReference)function_declEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_decl_Pure_exp()
  {
    return (EReference)function_declEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypesyn_decl()
  {
    return typesyn_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypesyn_decl_Type_use()
  {
    return (EReference)typesyn_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getException_decl()
  {
    return exception_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getException_decl_Type()
  {
    return (EReference)exception_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_decl()
  {
    return interface_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_decl_Interface_name()
  {
    return (EReference)interface_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_decl_Methodsig()
  {
    return (EReference)interface_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_name()
  {
    return interface_nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_name_Name()
  {
    return (EAttribute)interface_nameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodsig()
  {
    return methodsigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodsig_Type_use()
  {
    return (EReference)methodsigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodsig_Name()
  {
    return (EAttribute)methodsigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodsig_Paramlist()
  {
    return (EReference)methodsigEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_decl()
  {
    return class_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Paramlist()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Interface_name()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Field_decl()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Stmt()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Casestmtbranch()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Trait_usage()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_decl_Method()
  {
    return (EReference)class_declEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_decl()
  {
    return field_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_decl_Type_use()
  {
    return (EReference)field_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_decl_Name()
  {
    return (EReference)field_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_decl_Pure_exp()
  {
    return (EReference)field_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStmt()
  {
    return stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Type_exp()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStmt_Name()
  {
    return (EAttribute)stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Exp()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Var_or_field_ref()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Stmt()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Pure_exp()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Ifstmt()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_R()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Condition()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Whilestmt()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStmt_I()
  {
    return (EAttribute)stmtEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_L()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Foreachstmt()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Trystmt()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Casestmtbranch()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_Guard()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_F()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_T()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_ThrowPureExp()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_DiePureExp()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStmt_C()
  {
    return (EReference)stmtEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExp()
  {
    return expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExp_Pure_exp_list()
  {
    return (EReference)expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExp_Pure_exp()
  {
    return (EReference)expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEff_expr()
  {
    return eff_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEff_expr_L()
  {
    return (EAttribute)eff_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEff_expr_C()
  {
    return (EAttribute)eff_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEff_expr_A()
  {
    return (EAttribute)eff_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEff_expr_O()
  {
    return (EReference)eff_exprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEff_expr_M()
  {
    return (EAttribute)eff_exprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEff_expr_D()
  {
    return (EReference)eff_exprEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta_id()
  {
    return delta_idEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_id_Name()
  {
    return (EAttribute)delta_idEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuard()
  {
    return guardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Name()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Min()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_Max()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuard_E()
  {
    return (EReference)guardEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCasestmtbranch()
  {
    return casestmtbranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasestmtbranch_Pattern()
  {
    return (EReference)casestmtbranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasestmtbranch_Stmt()
  {
    return (EReference)casestmtbranchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrait_usage()
  {
    return trait_usageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrait_expr()
  {
    return trait_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_expr_Method()
  {
    return (EReference)trait_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_expr_TraitMethod()
  {
    return (EReference)trait_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrait_expr_Name()
  {
    return (EAttribute)trait_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_expr_Trait_expr()
  {
    return (EReference)trait_exprEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_expr_Trait_oper()
  {
    return (EReference)trait_exprEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrait_oper()
  {
    return trait_operEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_oper_Method()
  {
    return (EReference)trait_operEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_oper_Methodsig()
  {
    return (EReference)trait_operEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_oper_Trait_expr()
  {
    return (EReference)trait_operEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_oper_Trait_exp()
  {
    return (EReference)trait_operEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Type_use()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Paramlist()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Stmt()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrait_decl()
  {
    return trait_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrait_decl_Trait_expr()
  {
    return (EReference)trait_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain_block()
  {
    return main_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMain_block_Stmt()
  {
    return (EReference)main_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta_decl()
  {
    return delta_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_decl_Name()
  {
    return (EAttribute)delta_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_decl_P()
  {
    return (EReference)delta_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_decl_Delta_access()
  {
    return (EReference)delta_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_decl_Module_modifier()
  {
    return (EReference)delta_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta_param()
  {
    return delta_paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHas_condition()
  {
    return has_conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHas_condition_F()
  {
    return (EReference)has_conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHas_condition_M()
  {
    return (EReference)has_conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHas_condition_I()
  {
    return (EReference)has_conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta_access()
  {
    return delta_accessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_access_Name()
  {
    return (EAttribute)delta_accessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule_modifier()
  {
    return module_modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctional_modifier()
  {
    return functional_modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOO_modifier()
  {
    return oO_modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Class_decl()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Class()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_I()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Class_modifier_fragment()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Interface_decl()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Interface()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOO_modifier_Interface_modifier_fragment()
  {
    return (EReference)oO_modifierEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_modifier_fragment()
  {
    return class_modifier_fragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_modifier_fragment_F()
  {
    return (EReference)class_modifier_fragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_modifier_fragment()
  {
    return interface_modifier_fragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_modifier_fragment_RemovedMethod()
  {
    return (EReference)interface_modifier_fragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace_modifier()
  {
    return namespace_modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_modifier_Star()
  {
    return (EAttribute)namespace_modifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdate_decl()
  {
    return update_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUpdate_decl_Name()
  {
    return (EAttribute)update_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdate_decl_Object_update()
  {
    return (EReference)update_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject_update()
  {
    return object_updateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_Guard()
  {
    return (EReference)object_updateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_Update_preamble_declaration()
  {
    return (EReference)object_updateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_Pre()
  {
    return (EReference)object_updateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_Post()
  {
    return (EReference)object_updateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdate_preamble_declaration()
  {
    return update_preamble_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObject_update_assign_stmt()
  {
    return object_update_assign_stmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_assign_stmt_Var_or_field_ref()
  {
    return (EReference)object_update_assign_stmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObject_update_assign_stmt_Exp()
  {
    return (EReference)object_update_assign_stmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductline_decl()
  {
    return productline_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProductline_decl_Name()
  {
    return (EAttribute)productline_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductline_decl_Feature()
  {
    return (EReference)productline_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductline_decl_Delta_clause()
  {
    return (EReference)productline_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_P()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Attr_assignment()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta_clause()
  {
    return delta_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_clause_Deltaspec()
  {
    return (EReference)delta_clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_clause_After_condition()
  {
    return (EReference)delta_clauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_clause_From_condition()
  {
    return (EReference)delta_clauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_clause_When_condition()
  {
    return (EReference)delta_clauseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaspec()
  {
    return deltaspecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaspec_Name()
  {
    return (EAttribute)deltaspecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaspec_Deltaspec_param()
  {
    return (EAttribute)deltaspecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfter_condition()
  {
    return after_conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAfter_condition_Delta_id()
  {
    return (EReference)after_conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrom_condition()
  {
    return from_conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrom_condition_Application_condition()
  {
    return (EReference)from_conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhen_condition()
  {
    return when_conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhen_condition_Application_condition()
  {
    return (EReference)when_conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication_condition()
  {
    return application_conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_condition_Feature()
  {
    return (EReference)application_conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct_decl()
  {
    return product_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_decl_Name()
  {
    return (EAttribute)product_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_decl_Feature()
  {
    return (EReference)product_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_decl_Product_reconfiguration()
  {
    return (EReference)product_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_decl_Product_expr()
  {
    return (EReference)product_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct_expr()
  {
    return product_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_expr_Feature()
  {
    return (EReference)product_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct_reconfiguration()
  {
    return product_reconfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_reconfiguration_Name()
  {
    return (EAttribute)product_reconfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_reconfiguration_Delta_id()
  {
    return (EReference)product_reconfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_reconfiguration_Update()
  {
    return (EAttribute)product_reconfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature_decl()
  {
    return feature_declEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_decl_Name()
  {
    return (EAttribute)feature_declEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_decl_Feature_decl_group()
  {
    return (EReference)feature_declEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_decl_Feature_decl_attribute()
  {
    return (EReference)feature_declEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_decl_Feature_decl_constraint()
  {
    return (EReference)feature_declEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature_decl_group()
  {
    return feature_decl_groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_decl_group_Fnode()
  {
    return (EReference)feature_decl_groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFnode()
  {
    return fnodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature_decl_attribute()
  {
    return feature_decl_attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_decl_attribute_Boundary_val()
  {
    return (EAttribute)feature_decl_attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_decl_attribute_LBoundary_int()
  {
    return (EAttribute)feature_decl_attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_decl_attribute_UBoundary_int()
  {
    return (EAttribute)feature_decl_attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature_decl_constraint()
  {
    return feature_decl_constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_decl_constraint_Mexp()
  {
    return (EReference)feature_decl_constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexp()
  {
    return mexpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexp_Value()
  {
    return (EAttribute)mexpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFextension()
  {
    return fextensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFextension_Name()
  {
    return (EAttribute)fextensionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFextension_Feature_decl_group()
  {
    return (EReference)fextensionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFextension_Feature_decl_attribute()
  {
    return (EReference)fextensionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFextension_Feature_decl_constraint()
  {
    return (EReference)fextensionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr_expr()
  {
    return or_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_expr_Left()
  {
    return (EReference)or_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_expr_Right()
  {
    return (EReference)or_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd_expr()
  {
    return and_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_expr_Left()
  {
    return (EReference)and_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_expr_Right()
  {
    return (EReference)and_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquality_expr()
  {
    return equality_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_expr_Left()
  {
    return (EReference)equality_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquality_expr_Op()
  {
    return (EAttribute)equality_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquality_expr_Right()
  {
    return (EReference)equality_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparison_expr()
  {
    return comparison_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparison_expr_Left()
  {
    return (EReference)comparison_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparison_expr_Op()
  {
    return (EAttribute)comparison_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparison_expr_Right()
  {
    return (EReference)comparison_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusOrMinus_expr()
  {
    return plusOrMinus_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlusOrMinus_expr_Left()
  {
    return (EReference)plusOrMinus_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlusOrMinus_expr_Op()
  {
    return (EAttribute)plusOrMinus_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlusOrMinus_expr_Right()
  {
    return (EReference)plusOrMinus_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulDivOrMod_expr()
  {
    return mulDivOrMod_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulDivOrMod_expr_Left()
  {
    return (EReference)mulDivOrMod_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMulDivOrMod_expr_Op()
  {
    return (EAttribute)mulDivOrMod_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulDivOrMod_expr_Right()
  {
    return (EReference)mulDivOrMod_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndGuard()
  {
    return andGuardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndGuard_Left()
  {
    return (EReference)andGuardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAndGuard_Op()
  {
    return (EAttribute)andGuardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndGuard_Right()
  {
    return (EReference)andGuardEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppOr_exp()
  {
    return appOr_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppOr_exp_Left()
  {
    return (EReference)appOr_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppOr_exp_Right()
  {
    return (EReference)appOr_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppAnd_exp()
  {
    return appAnd_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppAnd_exp_Left()
  {
    return (EReference)appAnd_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppAnd_exp_Right()
  {
    return (EReference)appAnd_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotExpression()
  {
    return notExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotExpression_Operand()
  {
    return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductOr_expr()
  {
    return productOr_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductOr_expr_Left()
  {
    return (EReference)productOr_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductOr_expr_Right()
  {
    return (EReference)productOr_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductAnd_exp()
  {
    return productAnd_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductAnd_exp_Left()
  {
    return (EReference)productAnd_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductAnd_exp_Right()
  {
    return (EReference)productAnd_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductPrimary_exp()
  {
    return productPrimary_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpOr_exp()
  {
    return mexpOr_expEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpOr_exp_Left()
  {
    return (EReference)mexpOr_expEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpOr_exp_Right()
  {
    return (EReference)mexpOr_expEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpAnd_expr()
  {
    return mexpAnd_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpAnd_expr_Left()
  {
    return (EReference)mexpAnd_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpAnd_expr_Right()
  {
    return (EReference)mexpAnd_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpImplies_expr()
  {
    return mexpImplies_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpImplies_expr_Left()
  {
    return (EReference)mexpImplies_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexpImplies_expr_Op()
  {
    return (EAttribute)mexpImplies_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpImplies_expr_Right()
  {
    return (EReference)mexpImplies_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpEquality_expr()
  {
    return mexpEquality_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpEquality_expr_Left()
  {
    return (EReference)mexpEquality_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexpEquality_expr_Op()
  {
    return (EAttribute)mexpEquality_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpEquality_expr_Right()
  {
    return (EReference)mexpEquality_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpComparison_expr()
  {
    return mexpComparison_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpComparison_expr_Left()
  {
    return (EReference)mexpComparison_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexpComparison_expr_Op()
  {
    return (EAttribute)mexpComparison_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpComparison_expr_Right()
  {
    return (EReference)mexpComparison_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpPlusOrMinus_expr()
  {
    return mexpPlusOrMinus_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpPlusOrMinus_expr_Left()
  {
    return (EReference)mexpPlusOrMinus_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexpPlusOrMinus_expr_Op()
  {
    return (EAttribute)mexpPlusOrMinus_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpPlusOrMinus_expr_Right()
  {
    return (EReference)mexpPlusOrMinus_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpMulDivOrMod_expr()
  {
    return mexpMulDivOrMod_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpMulDivOrMod_expr_Left()
  {
    return (EReference)mexpMulDivOrMod_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMexpMulDivOrMod_expr_Op()
  {
    return (EAttribute)mexpMulDivOrMod_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpMulDivOrMod_expr_Right()
  {
    return (EReference)mexpMulDivOrMod_exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMexpPrimary_expr()
  {
    return mexpPrimary_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMexpPrimary_expr_A()
  {
    return (EReference)mexpPrimary_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsFactory getAbsFactory()
  {
    return (AbsFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);

    compilation_UnitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__MODULE);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__DELTA_DECL);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__UPDATE_DECL);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__PRODUCTLINE_DECL);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__PRODUCT_DECL);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__FEATURE_DECL);
    createEReference(compilation_UnitEClass, COMPILATION_UNIT__FEXTENSION);

    module_declEClass = createEClass(MODULE_DECL);
    createEAttribute(module_declEClass, MODULE_DECL__NAME);
    createEReference(module_declEClass, MODULE_DECL__MODULE_EXPORT);
    createEReference(module_declEClass, MODULE_DECL__MODULE_IMPORT);
    createEReference(module_declEClass, MODULE_DECL__DECL);
    createEReference(module_declEClass, MODULE_DECL__MAIN_BLOCK);

    module_exportEClass = createEClass(MODULE_EXPORT);
    createEAttribute(module_exportEClass, MODULE_EXPORT__ANY_PACKAGE);
    createEAttribute(module_exportEClass, MODULE_EXPORT__IMPORTED_NAMESPACE);

    module_importEClass = createEClass(MODULE_IMPORT);
    createEAttribute(module_importEClass, MODULE_IMPORT__IMPORTED_NAMESPACE);
    createEAttribute(module_importEClass, MODULE_IMPORT__NAME);

    declEClass = createEClass(DECL);
    createEAttribute(declEClass, DECL__NAME);

    par_function_declEClass = createEClass(PAR_FUNCTION_DECL);
    createEReference(par_function_declEClass, PAR_FUNCTION_DECL__TYPE_USE);
    createEAttribute(par_function_declEClass, PAR_FUNCTION_DECL__LT);
    createEAttribute(par_function_declEClass, PAR_FUNCTION_DECL__P);
    createEAttribute(par_function_declEClass, PAR_FUNCTION_DECL__GT);
    createEReference(par_function_declEClass, PAR_FUNCTION_DECL__FUNCTIONS);
    createEReference(par_function_declEClass, PAR_FUNCTION_DECL__PARAMS);
    createEReference(par_function_declEClass, PAR_FUNCTION_DECL__E);

    function_name_listEClass = createEClass(FUNCTION_NAME_LIST);
    createEReference(function_name_listEClass, FUNCTION_NAME_LIST__FUNCTION_NAME_DECL);

    function_name_declEClass = createEClass(FUNCTION_NAME_DECL);
    createEAttribute(function_name_declEClass, FUNCTION_NAME_DECL__NAME);

    dataType_declEClass = createEClass(DATA_TYPE_DECL);
    createEAttribute(dataType_declEClass, DATA_TYPE_DECL__LT);
    createEAttribute(dataType_declEClass, DATA_TYPE_DECL__P);
    createEAttribute(dataType_declEClass, DATA_TYPE_DECL__GT);
    createEReference(dataType_declEClass, DATA_TYPE_DECL__DATA_CONSTRUCTOR);

    data_constructorEClass = createEClass(DATA_CONSTRUCTOR);
    createEAttribute(data_constructorEClass, DATA_CONSTRUCTOR__NAME);
    createEReference(data_constructorEClass, DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG);

    data_constructor_argEClass = createEClass(DATA_CONSTRUCTOR_ARG);

    annotationsEClass = createEClass(ANNOTATIONS);
    createEReference(annotationsEClass, ANNOTATIONS__ANNOTATION);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__PURE_EXP);

    type_useEClass = createEClass(TYPE_USE);
    createEAttribute(type_useEClass, TYPE_USE__NAME);
    createEReference(type_useEClass, TYPE_USE__TYPE_USE);

    pure_expEClass = createEClass(PURE_EXP);
    createEReference(pure_expEClass, PURE_EXP__FUNCTION_LIST);
    createEReference(pure_expEClass, PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST);
    createEReference(pure_expEClass, PURE_EXP__FUNCTION_EXPR);
    createEReference(pure_expEClass, PURE_EXP__VARIADIC_EXP_LIST);
    createEReference(pure_expEClass, PURE_EXP__C);
    createEReference(pure_expEClass, PURE_EXP__L);
    createEReference(pure_expEClass, PURE_EXP__ELSE);
    createEReference(pure_expEClass, PURE_EXP__CASEBRANCH);
    createEReference(pure_expEClass, PURE_EXP__TYPE_USE);
    createEAttribute(pure_expEClass, PURE_EXP__VALUE);
    createEReference(pure_expEClass, PURE_EXP__I);
    createEReference(pure_expEClass, PURE_EXP__B);
    createEReference(pure_expEClass, PURE_EXP__VAR_OR_FIELD_REF);

    var_or_field_refEClass = createEClass(VAR_OR_FIELD_REF);
    createEAttribute(var_or_field_refEClass, VAR_OR_FIELD_REF__NAME);

    case_branchEClass = createEClass(CASE_BRANCH);

    patternEClass = createEClass(PATTERN);
    createEReference(patternEClass, PATTERN__PURE_EXP);
    createEReference(patternEClass, PATTERN__PATTERN);

    pure_exp_listEClass = createEClass(PURE_EXP_LIST);
    createEReference(pure_exp_listEClass, PURE_EXP_LIST__PURE_EXP);

    function_listEClass = createEClass(FUNCTION_LIST);
    createEReference(function_listEClass, FUNCTION_LIST__FUNCTION_PARAM);

    function_paramEClass = createEClass(FUNCTION_PARAM);

    function_name_param_declEClass = createEClass(FUNCTION_NAME_PARAM_DECL);
    createEAttribute(function_name_param_declEClass, FUNCTION_NAME_PARAM_DECL__VALUE);

    anon_function_declEClass = createEClass(ANON_FUNCTION_DECL);
    createEReference(anon_function_declEClass, ANON_FUNCTION_DECL__PARAMS);
    createEReference(anon_function_declEClass, ANON_FUNCTION_DECL__PURE_EXP);

    param_listEClass = createEClass(PARAM_LIST);
    createEReference(param_listEClass, PARAM_LIST__PARAM_DECL);

    param_declEClass = createEClass(PARAM_DECL);
    createEReference(param_declEClass, PARAM_DECL__TYPE_EXP);
    createEAttribute(param_declEClass, PARAM_DECL__NAME);

    type_expEClass = createEClass(TYPE_EXP);
    createEAttribute(type_expEClass, TYPE_EXP__NAME);
    createEAttribute(type_expEClass, TYPE_EXP__LT);
    createEReference(type_expEClass, TYPE_EXP__P);
    createEAttribute(type_expEClass, TYPE_EXP__GT);

    function_declEClass = createEClass(FUNCTION_DECL);
    createEReference(function_declEClass, FUNCTION_DECL__TYPE_USE);
    createEAttribute(function_declEClass, FUNCTION_DECL__LT);
    createEAttribute(function_declEClass, FUNCTION_DECL__IMPORTED_NAMESPACE);
    createEAttribute(function_declEClass, FUNCTION_DECL__GT);
    createEReference(function_declEClass, FUNCTION_DECL__PARAMLIST);
    createEReference(function_declEClass, FUNCTION_DECL__PURE_EXP);

    typesyn_declEClass = createEClass(TYPESYN_DECL);
    createEReference(typesyn_declEClass, TYPESYN_DECL__TYPE_USE);

    exception_declEClass = createEClass(EXCEPTION_DECL);
    createEReference(exception_declEClass, EXCEPTION_DECL__TYPE);

    interface_declEClass = createEClass(INTERFACE_DECL);
    createEReference(interface_declEClass, INTERFACE_DECL__INTERFACE_NAME);
    createEReference(interface_declEClass, INTERFACE_DECL__METHODSIG);

    interface_nameEClass = createEClass(INTERFACE_NAME);
    createEAttribute(interface_nameEClass, INTERFACE_NAME__NAME);

    methodsigEClass = createEClass(METHODSIG);
    createEReference(methodsigEClass, METHODSIG__TYPE_USE);
    createEAttribute(methodsigEClass, METHODSIG__NAME);
    createEReference(methodsigEClass, METHODSIG__PARAMLIST);

    class_declEClass = createEClass(CLASS_DECL);
    createEReference(class_declEClass, CLASS_DECL__PARAMLIST);
    createEReference(class_declEClass, CLASS_DECL__INTERFACE_NAME);
    createEReference(class_declEClass, CLASS_DECL__FIELD_DECL);
    createEReference(class_declEClass, CLASS_DECL__STMT);
    createEReference(class_declEClass, CLASS_DECL__CASESTMTBRANCH);
    createEReference(class_declEClass, CLASS_DECL__TRAIT_USAGE);
    createEReference(class_declEClass, CLASS_DECL__METHOD);

    field_declEClass = createEClass(FIELD_DECL);
    createEReference(field_declEClass, FIELD_DECL__TYPE_USE);
    createEReference(field_declEClass, FIELD_DECL__NAME);
    createEReference(field_declEClass, FIELD_DECL__PURE_EXP);

    stmtEClass = createEClass(STMT);
    createEReference(stmtEClass, STMT__TYPE_EXP);
    createEAttribute(stmtEClass, STMT__NAME);
    createEReference(stmtEClass, STMT__EXP);
    createEReference(stmtEClass, STMT__VAR_OR_FIELD_REF);
    createEReference(stmtEClass, STMT__STMT);
    createEReference(stmtEClass, STMT__PURE_EXP);
    createEReference(stmtEClass, STMT__IFSTMT);
    createEReference(stmtEClass, STMT__R);
    createEReference(stmtEClass, STMT__CONDITION);
    createEReference(stmtEClass, STMT__WHILESTMT);
    createEAttribute(stmtEClass, STMT__I);
    createEReference(stmtEClass, STMT__L);
    createEReference(stmtEClass, STMT__FOREACHSTMT);
    createEReference(stmtEClass, STMT__TRYSTMT);
    createEReference(stmtEClass, STMT__CASESTMTBRANCH);
    createEReference(stmtEClass, STMT__GUARD);
    createEReference(stmtEClass, STMT__F);
    createEReference(stmtEClass, STMT__T);
    createEReference(stmtEClass, STMT__THROW_PURE_EXP);
    createEReference(stmtEClass, STMT__DIE_PURE_EXP);
    createEReference(stmtEClass, STMT__C);

    expEClass = createEClass(EXP);
    createEReference(expEClass, EXP__PURE_EXP_LIST);
    createEReference(expEClass, EXP__PURE_EXP);

    eff_exprEClass = createEClass(EFF_EXPR);
    createEAttribute(eff_exprEClass, EFF_EXPR__L);
    createEAttribute(eff_exprEClass, EFF_EXPR__C);
    createEAttribute(eff_exprEClass, EFF_EXPR__A);
    createEReference(eff_exprEClass, EFF_EXPR__O);
    createEAttribute(eff_exprEClass, EFF_EXPR__M);
    createEReference(eff_exprEClass, EFF_EXPR__D);

    delta_idEClass = createEClass(DELTA_ID);
    createEAttribute(delta_idEClass, DELTA_ID__NAME);

    guardEClass = createEClass(GUARD);
    createEReference(guardEClass, GUARD__NAME);
    createEReference(guardEClass, GUARD__MIN);
    createEReference(guardEClass, GUARD__MAX);
    createEReference(guardEClass, GUARD__E);

    casestmtbranchEClass = createEClass(CASESTMTBRANCH);
    createEReference(casestmtbranchEClass, CASESTMTBRANCH__PATTERN);
    createEReference(casestmtbranchEClass, CASESTMTBRANCH__STMT);

    trait_usageEClass = createEClass(TRAIT_USAGE);

    trait_exprEClass = createEClass(TRAIT_EXPR);
    createEReference(trait_exprEClass, TRAIT_EXPR__METHOD);
    createEReference(trait_exprEClass, TRAIT_EXPR__TRAIT_METHOD);
    createEAttribute(trait_exprEClass, TRAIT_EXPR__NAME);
    createEReference(trait_exprEClass, TRAIT_EXPR__TRAIT_EXPR);
    createEReference(trait_exprEClass, TRAIT_EXPR__TRAIT_OPER);

    trait_operEClass = createEClass(TRAIT_OPER);
    createEReference(trait_operEClass, TRAIT_OPER__METHOD);
    createEReference(trait_operEClass, TRAIT_OPER__METHODSIG);
    createEReference(trait_operEClass, TRAIT_OPER__TRAIT_EXPR);
    createEReference(trait_operEClass, TRAIT_OPER__TRAIT_EXP);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__TYPE_USE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMLIST);
    createEReference(methodEClass, METHOD__STMT);

    trait_declEClass = createEClass(TRAIT_DECL);
    createEReference(trait_declEClass, TRAIT_DECL__TRAIT_EXPR);

    main_blockEClass = createEClass(MAIN_BLOCK);
    createEReference(main_blockEClass, MAIN_BLOCK__STMT);

    delta_declEClass = createEClass(DELTA_DECL);
    createEAttribute(delta_declEClass, DELTA_DECL__NAME);
    createEReference(delta_declEClass, DELTA_DECL__P);
    createEReference(delta_declEClass, DELTA_DECL__DELTA_ACCESS);
    createEReference(delta_declEClass, DELTA_DECL__MODULE_MODIFIER);

    delta_paramEClass = createEClass(DELTA_PARAM);

    has_conditionEClass = createEClass(HAS_CONDITION);
    createEReference(has_conditionEClass, HAS_CONDITION__F);
    createEReference(has_conditionEClass, HAS_CONDITION__M);
    createEReference(has_conditionEClass, HAS_CONDITION__I);

    delta_accessEClass = createEClass(DELTA_ACCESS);
    createEAttribute(delta_accessEClass, DELTA_ACCESS__NAME);

    module_modifierEClass = createEClass(MODULE_MODIFIER);

    functional_modifierEClass = createEClass(FUNCTIONAL_MODIFIER);

    oO_modifierEClass = createEClass(OO_MODIFIER);
    createEReference(oO_modifierEClass, OO_MODIFIER__CLASS_DECL);
    createEReference(oO_modifierEClass, OO_MODIFIER__CLASS);
    createEReference(oO_modifierEClass, OO_MODIFIER__I);
    createEReference(oO_modifierEClass, OO_MODIFIER__CLASS_MODIFIER_FRAGMENT);
    createEReference(oO_modifierEClass, OO_MODIFIER__INTERFACE_DECL);
    createEReference(oO_modifierEClass, OO_MODIFIER__INTERFACE);
    createEReference(oO_modifierEClass, OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT);

    class_modifier_fragmentEClass = createEClass(CLASS_MODIFIER_FRAGMENT);
    createEReference(class_modifier_fragmentEClass, CLASS_MODIFIER_FRAGMENT__F);

    interface_modifier_fragmentEClass = createEClass(INTERFACE_MODIFIER_FRAGMENT);
    createEReference(interface_modifier_fragmentEClass, INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD);

    namespace_modifierEClass = createEClass(NAMESPACE_MODIFIER);
    createEAttribute(namespace_modifierEClass, NAMESPACE_MODIFIER__STAR);

    update_declEClass = createEClass(UPDATE_DECL);
    createEAttribute(update_declEClass, UPDATE_DECL__NAME);
    createEReference(update_declEClass, UPDATE_DECL__OBJECT_UPDATE);

    object_updateEClass = createEClass(OBJECT_UPDATE);
    createEReference(object_updateEClass, OBJECT_UPDATE__GUARD);
    createEReference(object_updateEClass, OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION);
    createEReference(object_updateEClass, OBJECT_UPDATE__PRE);
    createEReference(object_updateEClass, OBJECT_UPDATE__POST);

    update_preamble_declarationEClass = createEClass(UPDATE_PREAMBLE_DECLARATION);

    object_update_assign_stmtEClass = createEClass(OBJECT_UPDATE_ASSIGN_STMT);
    createEReference(object_update_assign_stmtEClass, OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF);
    createEReference(object_update_assign_stmtEClass, OBJECT_UPDATE_ASSIGN_STMT__EXP);

    productline_declEClass = createEClass(PRODUCTLINE_DECL);
    createEAttribute(productline_declEClass, PRODUCTLINE_DECL__NAME);
    createEReference(productline_declEClass, PRODUCTLINE_DECL__FEATURE);
    createEReference(productline_declEClass, PRODUCTLINE_DECL__DELTA_CLAUSE);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEAttribute(featureEClass, FEATURE__P);
    createEAttribute(featureEClass, FEATURE__ATTR_ASSIGNMENT);

    delta_clauseEClass = createEClass(DELTA_CLAUSE);
    createEReference(delta_clauseEClass, DELTA_CLAUSE__DELTASPEC);
    createEReference(delta_clauseEClass, DELTA_CLAUSE__AFTER_CONDITION);
    createEReference(delta_clauseEClass, DELTA_CLAUSE__FROM_CONDITION);
    createEReference(delta_clauseEClass, DELTA_CLAUSE__WHEN_CONDITION);

    deltaspecEClass = createEClass(DELTASPEC);
    createEAttribute(deltaspecEClass, DELTASPEC__NAME);
    createEAttribute(deltaspecEClass, DELTASPEC__DELTASPEC_PARAM);

    after_conditionEClass = createEClass(AFTER_CONDITION);
    createEReference(after_conditionEClass, AFTER_CONDITION__DELTA_ID);

    from_conditionEClass = createEClass(FROM_CONDITION);
    createEReference(from_conditionEClass, FROM_CONDITION__APPLICATION_CONDITION);

    when_conditionEClass = createEClass(WHEN_CONDITION);
    createEReference(when_conditionEClass, WHEN_CONDITION__APPLICATION_CONDITION);

    application_conditionEClass = createEClass(APPLICATION_CONDITION);
    createEReference(application_conditionEClass, APPLICATION_CONDITION__FEATURE);

    product_declEClass = createEClass(PRODUCT_DECL);
    createEAttribute(product_declEClass, PRODUCT_DECL__NAME);
    createEReference(product_declEClass, PRODUCT_DECL__FEATURE);
    createEReference(product_declEClass, PRODUCT_DECL__PRODUCT_RECONFIGURATION);
    createEReference(product_declEClass, PRODUCT_DECL__PRODUCT_EXPR);

    product_exprEClass = createEClass(PRODUCT_EXPR);
    createEReference(product_exprEClass, PRODUCT_EXPR__FEATURE);

    product_reconfigurationEClass = createEClass(PRODUCT_RECONFIGURATION);
    createEAttribute(product_reconfigurationEClass, PRODUCT_RECONFIGURATION__NAME);
    createEReference(product_reconfigurationEClass, PRODUCT_RECONFIGURATION__DELTA_ID);
    createEAttribute(product_reconfigurationEClass, PRODUCT_RECONFIGURATION__UPDATE);

    feature_declEClass = createEClass(FEATURE_DECL);
    createEAttribute(feature_declEClass, FEATURE_DECL__NAME);
    createEReference(feature_declEClass, FEATURE_DECL__FEATURE_DECL_GROUP);
    createEReference(feature_declEClass, FEATURE_DECL__FEATURE_DECL_ATTRIBUTE);
    createEReference(feature_declEClass, FEATURE_DECL__FEATURE_DECL_CONSTRAINT);

    feature_decl_groupEClass = createEClass(FEATURE_DECL_GROUP);
    createEReference(feature_decl_groupEClass, FEATURE_DECL_GROUP__FNODE);

    fnodeEClass = createEClass(FNODE);

    feature_decl_attributeEClass = createEClass(FEATURE_DECL_ATTRIBUTE);
    createEAttribute(feature_decl_attributeEClass, FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL);
    createEAttribute(feature_decl_attributeEClass, FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT);
    createEAttribute(feature_decl_attributeEClass, FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT);

    feature_decl_constraintEClass = createEClass(FEATURE_DECL_CONSTRAINT);
    createEReference(feature_decl_constraintEClass, FEATURE_DECL_CONSTRAINT__MEXP);

    mexpEClass = createEClass(MEXP);
    createEAttribute(mexpEClass, MEXP__VALUE);

    fextensionEClass = createEClass(FEXTENSION);
    createEAttribute(fextensionEClass, FEXTENSION__NAME);
    createEReference(fextensionEClass, FEXTENSION__FEATURE_DECL_GROUP);
    createEReference(fextensionEClass, FEXTENSION__FEATURE_DECL_ATTRIBUTE);
    createEReference(fextensionEClass, FEXTENSION__FEATURE_DECL_CONSTRAINT);

    or_exprEClass = createEClass(OR_EXPR);
    createEReference(or_exprEClass, OR_EXPR__LEFT);
    createEReference(or_exprEClass, OR_EXPR__RIGHT);

    and_exprEClass = createEClass(AND_EXPR);
    createEReference(and_exprEClass, AND_EXPR__LEFT);
    createEReference(and_exprEClass, AND_EXPR__RIGHT);

    equality_exprEClass = createEClass(EQUALITY_EXPR);
    createEReference(equality_exprEClass, EQUALITY_EXPR__LEFT);
    createEAttribute(equality_exprEClass, EQUALITY_EXPR__OP);
    createEReference(equality_exprEClass, EQUALITY_EXPR__RIGHT);

    comparison_exprEClass = createEClass(COMPARISON_EXPR);
    createEReference(comparison_exprEClass, COMPARISON_EXPR__LEFT);
    createEAttribute(comparison_exprEClass, COMPARISON_EXPR__OP);
    createEReference(comparison_exprEClass, COMPARISON_EXPR__RIGHT);

    plusOrMinus_exprEClass = createEClass(PLUS_OR_MINUS_EXPR);
    createEReference(plusOrMinus_exprEClass, PLUS_OR_MINUS_EXPR__LEFT);
    createEAttribute(plusOrMinus_exprEClass, PLUS_OR_MINUS_EXPR__OP);
    createEReference(plusOrMinus_exprEClass, PLUS_OR_MINUS_EXPR__RIGHT);

    mulDivOrMod_exprEClass = createEClass(MUL_DIV_OR_MOD_EXPR);
    createEReference(mulDivOrMod_exprEClass, MUL_DIV_OR_MOD_EXPR__LEFT);
    createEAttribute(mulDivOrMod_exprEClass, MUL_DIV_OR_MOD_EXPR__OP);
    createEReference(mulDivOrMod_exprEClass, MUL_DIV_OR_MOD_EXPR__RIGHT);

    andGuardEClass = createEClass(AND_GUARD);
    createEReference(andGuardEClass, AND_GUARD__LEFT);
    createEAttribute(andGuardEClass, AND_GUARD__OP);
    createEReference(andGuardEClass, AND_GUARD__RIGHT);

    appOr_expEClass = createEClass(APP_OR_EXP);
    createEReference(appOr_expEClass, APP_OR_EXP__LEFT);
    createEReference(appOr_expEClass, APP_OR_EXP__RIGHT);

    appAnd_expEClass = createEClass(APP_AND_EXP);
    createEReference(appAnd_expEClass, APP_AND_EXP__LEFT);
    createEReference(appAnd_expEClass, APP_AND_EXP__RIGHT);

    notExpressionEClass = createEClass(NOT_EXPRESSION);
    createEReference(notExpressionEClass, NOT_EXPRESSION__OPERAND);

    productOr_exprEClass = createEClass(PRODUCT_OR_EXPR);
    createEReference(productOr_exprEClass, PRODUCT_OR_EXPR__LEFT);
    createEReference(productOr_exprEClass, PRODUCT_OR_EXPR__RIGHT);

    productAnd_expEClass = createEClass(PRODUCT_AND_EXP);
    createEReference(productAnd_expEClass, PRODUCT_AND_EXP__LEFT);
    createEReference(productAnd_expEClass, PRODUCT_AND_EXP__RIGHT);

    productPrimary_expEClass = createEClass(PRODUCT_PRIMARY_EXP);

    mexpOr_expEClass = createEClass(MEXP_OR_EXP);
    createEReference(mexpOr_expEClass, MEXP_OR_EXP__LEFT);
    createEReference(mexpOr_expEClass, MEXP_OR_EXP__RIGHT);

    mexpAnd_exprEClass = createEClass(MEXP_AND_EXPR);
    createEReference(mexpAnd_exprEClass, MEXP_AND_EXPR__LEFT);
    createEReference(mexpAnd_exprEClass, MEXP_AND_EXPR__RIGHT);

    mexpImplies_exprEClass = createEClass(MEXP_IMPLIES_EXPR);
    createEReference(mexpImplies_exprEClass, MEXP_IMPLIES_EXPR__LEFT);
    createEAttribute(mexpImplies_exprEClass, MEXP_IMPLIES_EXPR__OP);
    createEReference(mexpImplies_exprEClass, MEXP_IMPLIES_EXPR__RIGHT);

    mexpEquality_exprEClass = createEClass(MEXP_EQUALITY_EXPR);
    createEReference(mexpEquality_exprEClass, MEXP_EQUALITY_EXPR__LEFT);
    createEAttribute(mexpEquality_exprEClass, MEXP_EQUALITY_EXPR__OP);
    createEReference(mexpEquality_exprEClass, MEXP_EQUALITY_EXPR__RIGHT);

    mexpComparison_exprEClass = createEClass(MEXP_COMPARISON_EXPR);
    createEReference(mexpComparison_exprEClass, MEXP_COMPARISON_EXPR__LEFT);
    createEAttribute(mexpComparison_exprEClass, MEXP_COMPARISON_EXPR__OP);
    createEReference(mexpComparison_exprEClass, MEXP_COMPARISON_EXPR__RIGHT);

    mexpPlusOrMinus_exprEClass = createEClass(MEXP_PLUS_OR_MINUS_EXPR);
    createEReference(mexpPlusOrMinus_exprEClass, MEXP_PLUS_OR_MINUS_EXPR__LEFT);
    createEAttribute(mexpPlusOrMinus_exprEClass, MEXP_PLUS_OR_MINUS_EXPR__OP);
    createEReference(mexpPlusOrMinus_exprEClass, MEXP_PLUS_OR_MINUS_EXPR__RIGHT);

    mexpMulDivOrMod_exprEClass = createEClass(MEXP_MUL_DIV_OR_MOD_EXPR);
    createEReference(mexpMulDivOrMod_exprEClass, MEXP_MUL_DIV_OR_MOD_EXPR__LEFT);
    createEAttribute(mexpMulDivOrMod_exprEClass, MEXP_MUL_DIV_OR_MOD_EXPR__OP);
    createEReference(mexpMulDivOrMod_exprEClass, MEXP_MUL_DIV_OR_MOD_EXPR__RIGHT);

    mexpPrimary_exprEClass = createEClass(MEXP_PRIMARY_EXPR);
    createEReference(mexpPrimary_exprEClass, MEXP_PRIMARY_EXPR__A);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compilation_UnitEClass.getESuperTypes().add(this.getDomainModel());
    module_exportEClass.getESuperTypes().add(this.getNamespace_modifier());
    module_importEClass.getESuperTypes().add(this.getNamespace_modifier());
    par_function_declEClass.getESuperTypes().add(this.getDecl());
    dataType_declEClass.getESuperTypes().add(this.getDecl());
    dataType_declEClass.getESuperTypes().add(this.getFunctional_modifier());
    type_useEClass.getESuperTypes().add(this.getData_constructor_arg());
    type_useEClass.getESuperTypes().add(this.getAnnotation());
    pure_expEClass.getESuperTypes().add(this.getExp());
    var_or_field_refEClass.getESuperTypes().add(this.getPure_exp());
    patternEClass.getESuperTypes().add(this.getCase_branch());
    function_name_param_declEClass.getESuperTypes().add(this.getFunction_param());
    anon_function_declEClass.getESuperTypes().add(this.getFunction_param());
    param_declEClass.getESuperTypes().add(this.getDelta_param());
    type_expEClass.getESuperTypes().add(this.getUpdate_preamble_declaration());
    function_declEClass.getESuperTypes().add(this.getDecl());
    function_declEClass.getESuperTypes().add(this.getFunctional_modifier());
    typesyn_declEClass.getESuperTypes().add(this.getDecl());
    typesyn_declEClass.getESuperTypes().add(this.getFunctional_modifier());
    exception_declEClass.getESuperTypes().add(this.getDecl());
    interface_declEClass.getESuperTypes().add(this.getDecl());
    methodsigEClass.getESuperTypes().add(this.getInterface_modifier_fragment());
    class_declEClass.getESuperTypes().add(this.getDecl());
    field_declEClass.getESuperTypes().add(this.getClass_modifier_fragment());
    eff_exprEClass.getESuperTypes().add(this.getExp());
    trait_exprEClass.getESuperTypes().add(this.getTrait_usage());
    trait_operEClass.getESuperTypes().add(this.getClass_modifier_fragment());
    trait_declEClass.getESuperTypes().add(this.getDecl());
    has_conditionEClass.getESuperTypes().add(this.getDelta_param());
    functional_modifierEClass.getESuperTypes().add(this.getModule_modifier());
    oO_modifierEClass.getESuperTypes().add(this.getModule_modifier());
    namespace_modifierEClass.getESuperTypes().add(this.getModule_modifier());
    feature_declEClass.getESuperTypes().add(this.getFnode());
    or_exprEClass.getESuperTypes().add(this.getPure_exp());
    and_exprEClass.getESuperTypes().add(this.getPure_exp());
    equality_exprEClass.getESuperTypes().add(this.getPure_exp());
    comparison_exprEClass.getESuperTypes().add(this.getPure_exp());
    plusOrMinus_exprEClass.getESuperTypes().add(this.getPure_exp());
    mulDivOrMod_exprEClass.getESuperTypes().add(this.getPure_exp());
    andGuardEClass.getESuperTypes().add(this.getGuard());
    appOr_expEClass.getESuperTypes().add(this.getApplication_condition());
    appAnd_expEClass.getESuperTypes().add(this.getApplication_condition());
    notExpressionEClass.getESuperTypes().add(this.getApplication_condition());
    productOr_exprEClass.getESuperTypes().add(this.getProduct_expr());
    productAnd_expEClass.getESuperTypes().add(this.getProduct_expr());
    productPrimary_expEClass.getESuperTypes().add(this.getProduct_expr());
    mexpOr_expEClass.getESuperTypes().add(this.getMexp());
    mexpAnd_exprEClass.getESuperTypes().add(this.getMexp());
    mexpImplies_exprEClass.getESuperTypes().add(this.getMexp());
    mexpEquality_exprEClass.getESuperTypes().add(this.getMexp());
    mexpComparison_exprEClass.getESuperTypes().add(this.getMexp());
    mexpPlusOrMinus_exprEClass.getESuperTypes().add(this.getMexp());
    mexpMulDivOrMod_exprEClass.getESuperTypes().add(this.getMexp());
    mexpPrimary_exprEClass.getESuperTypes().add(this.getMexp());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compilation_UnitEClass, Compilation_Unit.class, "Compilation_Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompilation_Unit_Module(), this.getModule_decl(), null, "module", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_DeltaDecl(), this.getDelta_decl(), null, "deltaDecl", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_Update_decl(), this.getUpdate_decl(), null, "update_decl", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_Productline_decl(), this.getProductline_decl(), null, "productline_decl", null, 0, 1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_Product_decl(), this.getProduct_decl(), null, "product_decl", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_Feature_decl(), this.getFeature_decl(), null, "feature_decl", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_Unit_Fextension(), this.getFextension(), null, "fextension", null, 0, -1, Compilation_Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(module_declEClass, Module_decl.class, "Module_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_decl_Module_export(), this.getModule_export(), null, "module_export", null, 0, -1, Module_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_decl_Module_import(), this.getModule_import(), null, "module_import", null, 0, -1, Module_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_decl_Decl(), this.getDecl(), null, "decl", null, 0, -1, Module_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_decl_Main_block(), this.getMain_block(), null, "main_block", null, 0, -1, Module_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(module_exportEClass, Module_export.class, "Module_export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_export_AnyPackage(), ecorePackage.getEString(), "anyPackage", null, 0, -1, Module_export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_export_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, -1, Module_export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(module_importEClass, Module_import.class, "Module_import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_import_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Module_import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModule_import_Name(), ecorePackage.getEString(), "name", null, 0, -1, Module_import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declEClass, Decl.class, "Decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(par_function_declEClass, Par_function_decl.class, "Par_function_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPar_function_decl_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPar_function_decl_Lt(), ecorePackage.getEString(), "lt", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPar_function_decl_P(), ecorePackage.getEString(), "p", null, 0, -1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPar_function_decl_Gt(), ecorePackage.getEString(), "gt", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPar_function_decl_Functions(), this.getFunction_name_list(), null, "functions", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPar_function_decl_Params(), this.getParam_list(), null, "params", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPar_function_decl_E(), this.getPure_exp(), null, "e", null, 0, 1, Par_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_name_listEClass, Function_name_list.class, "Function_name_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_name_list_Function_name_decl(), this.getFunction_name_decl(), null, "function_name_decl", null, 0, -1, Function_name_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_name_declEClass, Function_name_decl.class, "Function_name_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_name_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function_name_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataType_declEClass, DataType_decl.class, "DataType_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_decl_Lt(), ecorePackage.getEString(), "lt", null, 0, 1, DataType_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataType_decl_P(), ecorePackage.getEString(), "p", null, 0, -1, DataType_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataType_decl_Gt(), ecorePackage.getEString(), "gt", null, 0, 1, DataType_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_decl_Data_constructor(), this.getData_constructor(), null, "data_constructor", null, 0, -1, DataType_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(data_constructorEClass, Data_constructor.class, "Data_constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getData_constructor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Data_constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getData_constructor_Data_constructor_arg(), this.getData_constructor_arg(), null, "data_constructor_arg", null, 0, -1, Data_constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(data_constructor_argEClass, Data_constructor_arg.class, "Data_constructor_arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotations_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_useEClass, Type_use.class, "Type_use", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_use_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type_use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_use_Type_use(), this.getType_use(), null, "type_use", null, 0, -1, Type_use.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pure_expEClass, Pure_exp.class, "Pure_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPure_exp_Function_list(), this.getFunction_list(), null, "function_list", null, 0, -1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Partial_function_pure_exp_list(), this.getPure_exp_list(), null, "partial_function_pure_exp_list", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Function_expr(), this.getPure_exp_list(), null, "function_expr", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Variadic_exp_list(), this.getPure_exp_list(), null, "variadic_exp_list", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_C(), this.getPure_exp(), null, "c", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_L(), this.getPure_exp(), null, "l", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Else(), this.getPure_exp(), null, "else", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Casebranch(), this.getCase_branch(), null, "casebranch", null, 0, -1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPure_exp_Value(), ecorePackage.getEString(), "value", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_I(), this.getPure_exp(), null, "i", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_B(), this.getPure_exp(), null, "b", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPure_exp_Var_or_field_ref(), this.getVar_or_field_ref(), null, "var_or_field_ref", null, 0, 1, Pure_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_or_field_refEClass, Var_or_field_ref.class, "Var_or_field_ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVar_or_field_ref_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var_or_field_ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(case_branchEClass, Case_branch.class, "Case_branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPattern_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_Pattern(), this.getPattern(), null, "pattern", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pure_exp_listEClass, Pure_exp_list.class, "Pure_exp_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPure_exp_list_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, -1, Pure_exp_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_listEClass, Function_list.class, "Function_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_list_Function_param(), this.getFunction_param(), null, "function_param", null, 0, -1, Function_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_paramEClass, Function_param.class, "Function_param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(function_name_param_declEClass, Function_name_param_decl.class, "Function_name_param_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_name_param_decl_Value(), ecorePackage.getEString(), "value", null, 0, 1, Function_name_param_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anon_function_declEClass, Anon_function_decl.class, "Anon_function_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnon_function_decl_Params(), this.getParam_list(), null, "params", null, 0, 1, Anon_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnon_function_decl_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Anon_function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(param_listEClass, Param_list.class, "Param_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParam_list_Param_decl(), this.getParam_decl(), null, "param_decl", null, 0, -1, Param_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(param_declEClass, Param_decl.class, "Param_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParam_decl_Type_exp(), this.getType_exp(), null, "type_exp", null, 0, 1, Param_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_expEClass, Type_exp.class, "Type_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_exp_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_exp_Lt(), ecorePackage.getEString(), "lt", null, 0, 1, Type_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_exp_P(), this.getType_use(), null, "p", null, 0, -1, Type_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_exp_Gt(), ecorePackage.getEString(), "gt", null, 0, 1, Type_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(function_declEClass, Function_decl.class, "Function_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunction_decl_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_decl_Lt(), ecorePackage.getEString(), "lt", null, 0, 1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_decl_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, -1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_decl_Gt(), ecorePackage.getEString(), "gt", null, 0, 1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_decl_Paramlist(), this.getParam_list(), null, "paramlist", null, 0, 1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_decl_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Function_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typesyn_declEClass, Typesyn_decl.class, "Typesyn_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypesyn_decl_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Typesyn_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exception_declEClass, Exception_decl.class, "Exception_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getException_decl_Type(), this.getData_constructor_arg(), null, "type", null, 0, -1, Exception_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_declEClass, Interface_decl.class, "Interface_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_decl_Interface_name(), this.getInterface_decl(), null, "interface_name", null, 0, -1, Interface_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_decl_Methodsig(), this.getMethodsig(), null, "methodsig", null, 0, -1, Interface_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_nameEClass, Interface_name.class, "Interface_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_name_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodsigEClass, Methodsig.class, "Methodsig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodsig_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Methodsig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodsig_Name(), ecorePackage.getEString(), "name", null, 0, 1, Methodsig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodsig_Paramlist(), this.getParam_list(), null, "paramlist", null, 0, 1, Methodsig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_declEClass, Class_decl.class, "Class_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_decl_Paramlist(), this.getParam_list(), null, "paramlist", null, 0, 1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Interface_name(), this.getInterface_decl(), null, "interface_name", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Field_decl(), this.getField_decl(), null, "field_decl", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Stmt(), this.getStmt(), null, "stmt", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Casestmtbranch(), this.getCasestmtbranch(), null, "casestmtbranch", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Trait_usage(), this.getTrait_usage(), null, "trait_usage", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_decl_Method(), this.getMethod(), null, "method", null, 0, -1, Class_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_declEClass, Field_decl.class, "Field_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getField_decl_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Field_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_decl_Name(), this.getVar_or_field_ref(), null, "name", null, 0, 1, Field_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_decl_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Field_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStmt_Type_exp(), this.getType_exp(), null, "type_exp", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStmt_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Exp(), this.getExp(), null, "exp", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Var_or_field_ref(), this.getVar_or_field_ref(), null, "var_or_field_ref", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Stmt(), this.getStmt(), null, "stmt", null, 0, -1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Ifstmt(), this.getStmt(), null, "ifstmt", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_R(), this.getStmt(), null, "r", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Condition(), this.getPure_exp(), null, "condition", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Whilestmt(), this.getStmt(), null, "whilestmt", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStmt_I(), ecorePackage.getEString(), "i", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_L(), this.getPure_exp(), null, "l", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Foreachstmt(), this.getStmt(), null, "foreachstmt", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Trystmt(), this.getStmt(), null, "trystmt", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Casestmtbranch(), this.getCasestmtbranch(), null, "casestmtbranch", null, 0, -1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_Guard(), this.getGuard(), null, "guard", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_F(), this.getPure_exp(), null, "f", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_T(), this.getPure_exp(), null, "t", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_ThrowPureExp(), this.getPure_exp(), null, "throwPureExp", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_DiePureExp(), this.getPure_exp(), null, "diePureExp", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStmt_C(), this.getPure_exp(), null, "c", null, 0, 1, Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expEClass, Exp.class, "Exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExp_Pure_exp_list(), this.getPure_exp_list(), null, "pure_exp_list", null, 0, 1, Exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExp_Pure_exp(), this.getPure_exp(), null, "pure_exp", null, 0, 1, Exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eff_exprEClass, Eff_expr.class, "Eff_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEff_expr_L(), ecorePackage.getEString(), "l", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEff_expr_C(), ecorePackage.getEString(), "c", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEff_expr_A(), ecorePackage.getEString(), "a", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEff_expr_O(), this.getPure_exp(), null, "o", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEff_expr_M(), ecorePackage.getEString(), "m", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEff_expr_D(), this.getDelta_id(), null, "d", null, 0, 1, Eff_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delta_idEClass, Delta_id.class, "Delta_id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelta_id_Name(), ecorePackage.getEString(), "name", null, 0, 1, Delta_id.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guardEClass, Guard.class, "Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGuard_Name(), this.getVar_or_field_ref(), null, "name", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuard_Min(), this.getPure_exp(), null, "min", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuard_Max(), this.getPure_exp(), null, "max", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGuard_E(), this.getPure_exp(), null, "e", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(casestmtbranchEClass, Casestmtbranch.class, "Casestmtbranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCasestmtbranch_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, Casestmtbranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCasestmtbranch_Stmt(), this.getStmt(), null, "stmt", null, 0, 1, Casestmtbranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trait_usageEClass, Trait_usage.class, "Trait_usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(trait_exprEClass, Trait_expr.class, "Trait_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrait_expr_Method(), this.getMethod(), null, "method", null, 0, -1, Trait_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_expr_TraitMethod(), this.getMethod(), null, "traitMethod", null, 0, 1, Trait_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrait_expr_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trait_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_expr_Trait_expr(), this.getTrait_expr(), null, "trait_expr", null, 0, 1, Trait_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_expr_Trait_oper(), this.getTrait_oper(), null, "trait_oper", null, 0, 1, Trait_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trait_operEClass, Trait_oper.class, "Trait_oper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrait_oper_Method(), this.getMethodsig(), null, "method", null, 0, 1, Trait_oper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_oper_Methodsig(), this.getMethodsig(), null, "methodsig", null, 0, -1, Trait_oper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_oper_Trait_expr(), this.getTrait_expr(), null, "trait_expr", null, 0, 1, Trait_oper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrait_oper_Trait_exp(), this.getTrait_expr(), null, "trait_exp", null, 0, 1, Trait_oper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_Type_use(), this.getType_use(), null, "type_use", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Paramlist(), this.getParam_list(), null, "paramlist", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Stmt(), this.getStmt(), null, "stmt", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trait_declEClass, Trait_decl.class, "Trait_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrait_decl_Trait_expr(), this.getTrait_expr(), null, "trait_expr", null, 0, 1, Trait_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(main_blockEClass, Main_block.class, "Main_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMain_block_Stmt(), this.getStmt(), null, "stmt", null, 0, -1, Main_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delta_declEClass, Delta_decl.class, "Delta_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelta_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Delta_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_decl_P(), this.getDelta_param(), null, "p", null, 0, -1, Delta_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_decl_Delta_access(), this.getDelta_access(), null, "delta_access", null, 0, -1, Delta_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_decl_Module_modifier(), this.getModule_modifier(), null, "module_modifier", null, 0, -1, Delta_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delta_paramEClass, Delta_param.class, "Delta_param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(has_conditionEClass, Has_condition.class, "Has_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHas_condition_F(), this.getField_decl(), null, "f", null, 0, 1, Has_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHas_condition_M(), this.getMethodsig(), null, "m", null, 0, 1, Has_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHas_condition_I(), this.getInterface_decl(), null, "i", null, 0, 1, Has_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delta_accessEClass, Delta_access.class, "Delta_access", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelta_access_Name(), ecorePackage.getEString(), "name", null, 0, 1, Delta_access.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(module_modifierEClass, Module_modifier.class, "Module_modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functional_modifierEClass, Functional_modifier.class, "Functional_modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(oO_modifierEClass, OO_modifier.class, "OO_modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOO_modifier_Class_decl(), this.getClass_decl(), null, "class_decl", null, 0, 1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_Class(), this.getClass_decl(), null, "class", null, 0, 1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_I(), this.getInterface_name(), null, "i", null, 0, -1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_Class_modifier_fragment(), this.getClass_modifier_fragment(), null, "class_modifier_fragment", null, 0, -1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_Interface_decl(), this.getInterface_decl(), null, "interface_decl", null, 0, 1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_Interface(), this.getInterface_decl(), null, "interface", null, 0, 1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOO_modifier_Interface_modifier_fragment(), this.getInterface_modifier_fragment(), null, "interface_modifier_fragment", null, 0, -1, OO_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_modifier_fragmentEClass, Class_modifier_fragment.class, "Class_modifier_fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_modifier_fragment_F(), this.getField_decl(), null, "f", null, 0, 1, Class_modifier_fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_modifier_fragmentEClass, Interface_modifier_fragment.class, "Interface_modifier_fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterface_modifier_fragment_RemovedMethod(), this.getMethodsig(), null, "removedMethod", null, 0, 1, Interface_modifier_fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespace_modifierEClass, Namespace_modifier.class, "Namespace_modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_modifier_Star(), ecorePackage.getEString(), "star", null, 0, 1, Namespace_modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(update_declEClass, Update_decl.class, "Update_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUpdate_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Update_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdate_decl_Object_update(), this.getObject_update(), null, "object_update", null, 0, -1, Update_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(object_updateEClass, Object_update.class, "Object_update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObject_update_Guard(), this.getGuard(), null, "guard", null, 0, 1, Object_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObject_update_Update_preamble_declaration(), this.getUpdate_preamble_declaration(), null, "update_preamble_declaration", null, 0, -1, Object_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObject_update_Pre(), this.getObject_update_assign_stmt(), null, "pre", null, 0, -1, Object_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObject_update_Post(), this.getObject_update_assign_stmt(), null, "post", null, 0, -1, Object_update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(update_preamble_declarationEClass, Update_preamble_declaration.class, "Update_preamble_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(object_update_assign_stmtEClass, Object_update_assign_stmt.class, "Object_update_assign_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObject_update_assign_stmt_Var_or_field_ref(), this.getVar_or_field_ref(), null, "var_or_field_ref", null, 0, 1, Object_update_assign_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObject_update_assign_stmt_Exp(), this.getExp(), null, "exp", null, 0, 1, Object_update_assign_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productline_declEClass, Productline_decl.class, "Productline_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductline_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Productline_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductline_decl_Feature(), this.getFeature_decl(), null, "feature", null, 0, -1, Productline_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductline_decl_Delta_clause(), this.getDelta_clause(), null, "delta_clause", null, 0, -1, Productline_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_P(), ecorePackage.getEString(), "p", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Attr_assignment(), ecorePackage.getEString(), "attr_assignment", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(delta_clauseEClass, Delta_clause.class, "Delta_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelta_clause_Deltaspec(), this.getDelta_decl(), null, "deltaspec", null, 0, 1, Delta_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_clause_After_condition(), this.getAfter_condition(), null, "after_condition", null, 0, 1, Delta_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_clause_From_condition(), this.getFrom_condition(), null, "from_condition", null, 0, 1, Delta_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_clause_When_condition(), this.getWhen_condition(), null, "when_condition", null, 0, 1, Delta_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaspecEClass, Deltaspec.class, "Deltaspec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeltaspec_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deltaspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaspec_Deltaspec_param(), ecorePackage.getEString(), "deltaspec_param", null, 0, -1, Deltaspec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(after_conditionEClass, After_condition.class, "After_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAfter_condition_Delta_id(), this.getDelta_decl(), null, "delta_id", null, 0, -1, After_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(from_conditionEClass, From_condition.class, "From_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFrom_condition_Application_condition(), this.getApplication_condition(), null, "application_condition", null, 0, 1, From_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(when_conditionEClass, When_condition.class, "When_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhen_condition_Application_condition(), this.getApplication_condition(), null, "application_condition", null, 0, 1, When_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(application_conditionEClass, Application_condition.class, "Application_condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_condition_Feature(), this.getFeature_decl(), null, "feature", null, 0, -1, Application_condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(product_declEClass, Product_decl.class, "Product_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduct_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_decl_Feature(), this.getFeature(), null, "feature", null, 0, -1, Product_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_decl_Product_reconfiguration(), this.getProduct_reconfiguration(), null, "product_reconfiguration", null, 0, -1, Product_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_decl_Product_expr(), this.getProduct_expr(), null, "product_expr", null, 0, 1, Product_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(product_exprEClass, Product_expr.class, "Product_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProduct_expr_Feature(), this.getFeature(), null, "feature", null, 0, -1, Product_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(product_reconfigurationEClass, Product_reconfiguration.class, "Product_reconfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduct_reconfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product_reconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_reconfiguration_Delta_id(), this.getDelta_id(), null, "delta_id", null, 0, -1, Product_reconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProduct_reconfiguration_Update(), ecorePackage.getEString(), "update", null, 0, 1, Product_reconfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feature_declEClass, Feature_decl.class, "Feature_decl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_decl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_decl_Feature_decl_group(), this.getFeature_decl_group(), null, "feature_decl_group", null, 0, 1, Feature_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_decl_Feature_decl_attribute(), this.getFeature_decl_attribute(), null, "feature_decl_attribute", null, 0, -1, Feature_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_decl_Feature_decl_constraint(), this.getFeature_decl_constraint(), null, "feature_decl_constraint", null, 0, -1, Feature_decl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feature_decl_groupEClass, Feature_decl_group.class, "Feature_decl_group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_decl_group_Fnode(), this.getFnode(), null, "fnode", null, 0, -1, Feature_decl_group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fnodeEClass, Fnode.class, "Fnode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(feature_decl_attributeEClass, Feature_decl_attribute.class, "Feature_decl_attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_decl_attribute_Boundary_val(), ecorePackage.getEString(), "boundary_val", null, 0, -1, Feature_decl_attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_decl_attribute_LBoundary_int(), ecorePackage.getEString(), "lBoundary_int", null, 0, 1, Feature_decl_attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_decl_attribute_UBoundary_int(), ecorePackage.getEString(), "uBoundary_int", null, 0, 1, Feature_decl_attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(feature_decl_constraintEClass, Feature_decl_constraint.class, "Feature_decl_constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_decl_constraint_Mexp(), this.getMexp(), null, "mexp", null, 0, 1, Feature_decl_constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpEClass, Mexp.class, "Mexp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMexp_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Mexp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fextensionEClass, Fextension.class, "Fextension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFextension_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fextension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFextension_Feature_decl_group(), this.getFeature_decl_group(), null, "feature_decl_group", null, 0, 1, Fextension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFextension_Feature_decl_attribute(), this.getFeature_decl_attribute(), null, "feature_decl_attribute", null, 0, -1, Fextension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFextension_Feature_decl_constraint(), this.getFeature_decl_constraint(), null, "feature_decl_constraint", null, 0, -1, Fextension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(or_exprEClass, Or_expr.class, "Or_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOr_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, Or_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOr_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, Or_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(and_exprEClass, And_expr.class, "And_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnd_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, And_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnd_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, And_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equality_exprEClass, Equality_expr.class, "Equality_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquality_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, Equality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquality_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, Equality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquality_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, Equality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparison_exprEClass, Comparison_expr.class, "Comparison_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparison_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, Comparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparison_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, Comparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparison_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, Comparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusOrMinus_exprEClass, PlusOrMinus_expr.class, "PlusOrMinus_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlusOrMinus_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, PlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlusOrMinus_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, PlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlusOrMinus_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, PlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mulDivOrMod_exprEClass, MulDivOrMod_expr.class, "MulDivOrMod_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulDivOrMod_expr_Left(), this.getPure_exp(), null, "left", null, 0, 1, MulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMulDivOrMod_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulDivOrMod_expr_Right(), this.getPure_exp(), null, "right", null, 0, 1, MulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andGuardEClass, AndGuard.class, "AndGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndGuard_Left(), this.getGuard(), null, "left", null, 0, 1, AndGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAndGuard_Op(), ecorePackage.getEString(), "op", null, 0, 1, AndGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndGuard_Right(), this.getGuard(), null, "right", null, 0, 1, AndGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appOr_expEClass, AppOr_exp.class, "AppOr_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppOr_exp_Left(), this.getApplication_condition(), null, "left", null, 0, 1, AppOr_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppOr_exp_Right(), this.getApplication_condition(), null, "right", null, 0, 1, AppOr_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(appAnd_expEClass, AppAnd_exp.class, "AppAnd_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppAnd_exp_Left(), this.getApplication_condition(), null, "left", null, 0, 1, AppAnd_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppAnd_exp_Right(), this.getApplication_condition(), null, "right", null, 0, 1, AppAnd_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotExpression_Operand(), this.getApplication_condition(), null, "operand", null, 0, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productOr_exprEClass, ProductOr_expr.class, "ProductOr_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductOr_expr_Left(), this.getProduct_expr(), null, "left", null, 0, 1, ProductOr_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductOr_expr_Right(), this.getProduct_expr(), null, "right", null, 0, 1, ProductOr_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productAnd_expEClass, ProductAnd_exp.class, "ProductAnd_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductAnd_exp_Left(), this.getProduct_expr(), null, "left", null, 0, 1, ProductAnd_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductAnd_exp_Right(), this.getProduct_expr(), null, "right", null, 0, 1, ProductAnd_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productPrimary_expEClass, ProductPrimary_exp.class, "ProductPrimary_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mexpOr_expEClass, MexpOr_exp.class, "MexpOr_exp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpOr_exp_Left(), this.getMexp(), null, "left", null, 0, 1, MexpOr_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpOr_exp_Right(), this.getMexp(), null, "right", null, 0, 1, MexpOr_exp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpAnd_exprEClass, MexpAnd_expr.class, "MexpAnd_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpAnd_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpAnd_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpAnd_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpAnd_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpImplies_exprEClass, MexpImplies_expr.class, "MexpImplies_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpImplies_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpImplies_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMexpImplies_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MexpImplies_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpImplies_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpImplies_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpEquality_exprEClass, MexpEquality_expr.class, "MexpEquality_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpEquality_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpEquality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMexpEquality_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MexpEquality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpEquality_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpEquality_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpComparison_exprEClass, MexpComparison_expr.class, "MexpComparison_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpComparison_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpComparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMexpComparison_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MexpComparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpComparison_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpComparison_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpPlusOrMinus_exprEClass, MexpPlusOrMinus_expr.class, "MexpPlusOrMinus_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpPlusOrMinus_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpPlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMexpPlusOrMinus_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MexpPlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpPlusOrMinus_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpPlusOrMinus_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpMulDivOrMod_exprEClass, MexpMulDivOrMod_expr.class, "MexpMulDivOrMod_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpMulDivOrMod_expr_Left(), this.getMexp(), null, "left", null, 0, 1, MexpMulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMexpMulDivOrMod_expr_Op(), ecorePackage.getEString(), "op", null, 0, 1, MexpMulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMexpMulDivOrMod_expr_Right(), this.getMexp(), null, "right", null, 0, 1, MexpMulDivOrMod_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mexpPrimary_exprEClass, MexpPrimary_expr.class, "MexpPrimary_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMexpPrimary_expr_A(), this.getMexp(), null, "a", null, 0, 1, MexpPrimary_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AbsPackageImpl
