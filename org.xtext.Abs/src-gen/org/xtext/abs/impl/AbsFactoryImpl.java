/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.abs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbsFactoryImpl extends EFactoryImpl implements AbsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AbsFactory init()
  {
    try
    {
      AbsFactory theAbsFactory = (AbsFactory)EPackage.Registry.INSTANCE.getEFactory(AbsPackage.eNS_URI);
      if (theAbsFactory != null)
      {
        return theAbsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AbsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AbsPackage.DOMAIN_MODEL: return createDomainModel();
      case AbsPackage.COMPILATION_UNIT: return createCompilation_Unit();
      case AbsPackage.MODULE_DECL: return createModule_decl();
      case AbsPackage.MODULE_EXPORT: return createModule_export();
      case AbsPackage.MODULE_IMPORT: return createModule_import();
      case AbsPackage.DECL: return createDecl();
      case AbsPackage.PAR_FUNCTION_DECL: return createPar_function_decl();
      case AbsPackage.FUNCTION_NAME_LIST: return createFunction_name_list();
      case AbsPackage.FUNCTION_NAME_DECL: return createFunction_name_decl();
      case AbsPackage.DATA_TYPE_DECL: return createDataType_decl();
      case AbsPackage.DATA_CONSTRUCTOR: return createData_constructor();
      case AbsPackage.DATA_CONSTRUCTOR_ARG: return createData_constructor_arg();
      case AbsPackage.ANNOTATIONS: return createAnnotations();
      case AbsPackage.ANNOTATION: return createAnnotation();
      case AbsPackage.TYPE_USE: return createType_use();
      case AbsPackage.PURE_EXP: return createPure_exp();
      case AbsPackage.VAR_OR_FIELD_REF: return createVar_or_field_ref();
      case AbsPackage.CASE_BRANCH: return createCase_branch();
      case AbsPackage.PATTERN: return createPattern();
      case AbsPackage.PURE_EXP_LIST: return createPure_exp_list();
      case AbsPackage.FUNCTION_LIST: return createFunction_list();
      case AbsPackage.FUNCTION_PARAM: return createFunction_param();
      case AbsPackage.FUNCTION_NAME_PARAM_DECL: return createFunction_name_param_decl();
      case AbsPackage.ANON_FUNCTION_DECL: return createAnon_function_decl();
      case AbsPackage.PARAM_LIST: return createParam_list();
      case AbsPackage.PARAM_DECL: return createParam_decl();
      case AbsPackage.TYPE_EXP: return createType_exp();
      case AbsPackage.FUNCTION_DECL: return createFunction_decl();
      case AbsPackage.TYPESYN_DECL: return createTypesyn_decl();
      case AbsPackage.EXCEPTION_DECL: return createException_decl();
      case AbsPackage.INTERFACE_DECL: return createInterface_decl();
      case AbsPackage.INTERFACE_NAME: return createInterface_name();
      case AbsPackage.METHODSIG: return createMethodsig();
      case AbsPackage.CLASS_DECL: return createClass_decl();
      case AbsPackage.FIELD_DECL: return createField_decl();
      case AbsPackage.STMT: return createStmt();
      case AbsPackage.EXP: return createExp();
      case AbsPackage.EFF_EXPR: return createEff_expr();
      case AbsPackage.DELTA_ID: return createDelta_id();
      case AbsPackage.GUARD: return createGuard();
      case AbsPackage.CASESTMTBRANCH: return createCasestmtbranch();
      case AbsPackage.TRAIT_USAGE: return createTrait_usage();
      case AbsPackage.TRAIT_EXPR: return createTrait_expr();
      case AbsPackage.TRAIT_OPER: return createTrait_oper();
      case AbsPackage.METHOD: return createMethod();
      case AbsPackage.TRAIT_DECL: return createTrait_decl();
      case AbsPackage.MAIN_BLOCK: return createMain_block();
      case AbsPackage.DELTA_DECL: return createDelta_decl();
      case AbsPackage.DELTA_PARAM: return createDelta_param();
      case AbsPackage.HAS_CONDITION: return createHas_condition();
      case AbsPackage.DELTA_ACCESS: return createDelta_access();
      case AbsPackage.MODULE_MODIFIER: return createModule_modifier();
      case AbsPackage.FUNCTIONAL_MODIFIER: return createFunctional_modifier();
      case AbsPackage.OO_MODIFIER: return createOO_modifier();
      case AbsPackage.CLASS_MODIFIER_FRAGMENT: return createClass_modifier_fragment();
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT: return createInterface_modifier_fragment();
      case AbsPackage.NAMESPACE_MODIFIER: return createNamespace_modifier();
      case AbsPackage.UPDATE_DECL: return createUpdate_decl();
      case AbsPackage.OBJECT_UPDATE: return createObject_update();
      case AbsPackage.UPDATE_PREAMBLE_DECLARATION: return createUpdate_preamble_declaration();
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT: return createObject_update_assign_stmt();
      case AbsPackage.PRODUCTLINE_DECL: return createProductline_decl();
      case AbsPackage.FEATURE: return createFeature();
      case AbsPackage.DELTA_CLAUSE: return createDelta_clause();
      case AbsPackage.DELTASPEC: return createDeltaspec();
      case AbsPackage.AFTER_CONDITION: return createAfter_condition();
      case AbsPackage.FROM_CONDITION: return createFrom_condition();
      case AbsPackage.WHEN_CONDITION: return createWhen_condition();
      case AbsPackage.APPLICATION_CONDITION: return createApplication_condition();
      case AbsPackage.PRODUCT_DECL: return createProduct_decl();
      case AbsPackage.PRODUCT_EXPR: return createProduct_expr();
      case AbsPackage.PRODUCT_RECONFIGURATION: return createProduct_reconfiguration();
      case AbsPackage.FEATURE_DECL: return createFeature_decl();
      case AbsPackage.FEATURE_DECL_GROUP: return createFeature_decl_group();
      case AbsPackage.FNODE: return createFnode();
      case AbsPackage.FEATURE_DECL_ATTRIBUTE: return createFeature_decl_attribute();
      case AbsPackage.FEATURE_DECL_CONSTRAINT: return createFeature_decl_constraint();
      case AbsPackage.MEXP: return createMexp();
      case AbsPackage.FEXTENSION: return createFextension();
      case AbsPackage.OR_EXPR: return createOr_expr();
      case AbsPackage.AND_EXPR: return createAnd_expr();
      case AbsPackage.EQUALITY_EXPR: return createEquality_expr();
      case AbsPackage.COMPARISON_EXPR: return createComparison_expr();
      case AbsPackage.PLUS_OR_MINUS_EXPR: return createPlusOrMinus_expr();
      case AbsPackage.MUL_DIV_OR_MOD_EXPR: return createMulDivOrMod_expr();
      case AbsPackage.AND_GUARD: return createAndGuard();
      case AbsPackage.APP_OR_EXP: return createAppOr_exp();
      case AbsPackage.APP_AND_EXP: return createAppAnd_exp();
      case AbsPackage.PRODUCT_OR_EXPR: return createProductOr_expr();
      case AbsPackage.PRODUCT_AND_EXP: return createProductAnd_exp();
      case AbsPackage.PRODUCT_MINUS_EXP: return createProductMinus_exp();
      case AbsPackage.MEXP_OR_EXP: return createMexpOr_exp();
      case AbsPackage.MEXP_AND_EXPR: return createMexpAnd_expr();
      case AbsPackage.MEXP_IMPLIES_EXPR: return createMexpImplies_expr();
      case AbsPackage.MEXP_EQUALITY_EXPR: return createMexpEquality_expr();
      case AbsPackage.MEXP_COMPARISON_EXPR: return createMexpComparison_expr();
      case AbsPackage.MEXP_PLUS_OR_MINUS_EXPR: return createMexpPlusOrMinus_expr();
      case AbsPackage.MEXP_MUL_DIV_OR_MOD_EXPR: return createMexpMulDivOrMod_expr();
      case AbsPackage.MEXP_PRIMARY_EXPR: return createMexpPrimary_expr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compilation_Unit createCompilation_Unit()
  {
    Compilation_UnitImpl compilation_Unit = new Compilation_UnitImpl();
    return compilation_Unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_decl createModule_decl()
  {
    Module_declImpl module_decl = new Module_declImpl();
    return module_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_export createModule_export()
  {
    Module_exportImpl module_export = new Module_exportImpl();
    return module_export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_import createModule_import()
  {
    Module_importImpl module_import = new Module_importImpl();
    return module_import;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Par_function_decl createPar_function_decl()
  {
    Par_function_declImpl par_function_decl = new Par_function_declImpl();
    return par_function_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_name_list createFunction_name_list()
  {
    Function_name_listImpl function_name_list = new Function_name_listImpl();
    return function_name_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_name_decl createFunction_name_decl()
  {
    Function_name_declImpl function_name_decl = new Function_name_declImpl();
    return function_name_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType_decl createDataType_decl()
  {
    DataType_declImpl dataType_decl = new DataType_declImpl();
    return dataType_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data_constructor createData_constructor()
  {
    Data_constructorImpl data_constructor = new Data_constructorImpl();
    return data_constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data_constructor_arg createData_constructor_arg()
  {
    Data_constructor_argImpl data_constructor_arg = new Data_constructor_argImpl();
    return data_constructor_arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotations createAnnotations()
  {
    AnnotationsImpl annotations = new AnnotationsImpl();
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_use createType_use()
  {
    Type_useImpl type_use = new Type_useImpl();
    return type_use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp createPure_exp()
  {
    Pure_expImpl pure_exp = new Pure_expImpl();
    return pure_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref createVar_or_field_ref()
  {
    Var_or_field_refImpl var_or_field_ref = new Var_or_field_refImpl();
    return var_or_field_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case_branch createCase_branch()
  {
    Case_branchImpl case_branch = new Case_branchImpl();
    return case_branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp_list createPure_exp_list()
  {
    Pure_exp_listImpl pure_exp_list = new Pure_exp_listImpl();
    return pure_exp_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_list createFunction_list()
  {
    Function_listImpl function_list = new Function_listImpl();
    return function_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_param createFunction_param()
  {
    Function_paramImpl function_param = new Function_paramImpl();
    return function_param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_name_param_decl createFunction_name_param_decl()
  {
    Function_name_param_declImpl function_name_param_decl = new Function_name_param_declImpl();
    return function_name_param_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anon_function_decl createAnon_function_decl()
  {
    Anon_function_declImpl anon_function_decl = new Anon_function_declImpl();
    return anon_function_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_list createParam_list()
  {
    Param_listImpl param_list = new Param_listImpl();
    return param_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param_decl createParam_decl()
  {
    Param_declImpl param_decl = new Param_declImpl();
    return param_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_exp createType_exp()
  {
    Type_expImpl type_exp = new Type_expImpl();
    return type_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function_decl createFunction_decl()
  {
    Function_declImpl function_decl = new Function_declImpl();
    return function_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Typesyn_decl createTypesyn_decl()
  {
    Typesyn_declImpl typesyn_decl = new Typesyn_declImpl();
    return typesyn_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exception_decl createException_decl()
  {
    Exception_declImpl exception_decl = new Exception_declImpl();
    return exception_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_decl createInterface_decl()
  {
    Interface_declImpl interface_decl = new Interface_declImpl();
    return interface_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_name createInterface_name()
  {
    Interface_nameImpl interface_name = new Interface_nameImpl();
    return interface_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig createMethodsig()
  {
    MethodsigImpl methodsig = new MethodsigImpl();
    return methodsig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_decl createClass_decl()
  {
    Class_declImpl class_decl = new Class_declImpl();
    return class_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_decl createField_decl()
  {
    Field_declImpl field_decl = new Field_declImpl();
    return field_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt createStmt()
  {
    StmtImpl stmt = new StmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eff_expr createEff_expr()
  {
    Eff_exprImpl eff_expr = new Eff_exprImpl();
    return eff_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_id createDelta_id()
  {
    Delta_idImpl delta_id = new Delta_idImpl();
    return delta_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Casestmtbranch createCasestmtbranch()
  {
    CasestmtbranchImpl casestmtbranch = new CasestmtbranchImpl();
    return casestmtbranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_usage createTrait_usage()
  {
    Trait_usageImpl trait_usage = new Trait_usageImpl();
    return trait_usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr createTrait_expr()
  {
    Trait_exprImpl trait_expr = new Trait_exprImpl();
    return trait_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_oper createTrait_oper()
  {
    Trait_operImpl trait_oper = new Trait_operImpl();
    return trait_oper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_decl createTrait_decl()
  {
    Trait_declImpl trait_decl = new Trait_declImpl();
    return trait_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main_block createMain_block()
  {
    Main_blockImpl main_block = new Main_blockImpl();
    return main_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_decl createDelta_decl()
  {
    Delta_declImpl delta_decl = new Delta_declImpl();
    return delta_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_param createDelta_param()
  {
    Delta_paramImpl delta_param = new Delta_paramImpl();
    return delta_param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Has_condition createHas_condition()
  {
    Has_conditionImpl has_condition = new Has_conditionImpl();
    return has_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_access createDelta_access()
  {
    Delta_accessImpl delta_access = new Delta_accessImpl();
    return delta_access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_modifier createModule_modifier()
  {
    Module_modifierImpl module_modifier = new Module_modifierImpl();
    return module_modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functional_modifier createFunctional_modifier()
  {
    Functional_modifierImpl functional_modifier = new Functional_modifierImpl();
    return functional_modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OO_modifier createOO_modifier()
  {
    OO_modifierImpl oO_modifier = new OO_modifierImpl();
    return oO_modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_modifier_fragment createClass_modifier_fragment()
  {
    Class_modifier_fragmentImpl class_modifier_fragment = new Class_modifier_fragmentImpl();
    return class_modifier_fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_modifier_fragment createInterface_modifier_fragment()
  {
    Interface_modifier_fragmentImpl interface_modifier_fragment = new Interface_modifier_fragmentImpl();
    return interface_modifier_fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace_modifier createNamespace_modifier()
  {
    Namespace_modifierImpl namespace_modifier = new Namespace_modifierImpl();
    return namespace_modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Update_decl createUpdate_decl()
  {
    Update_declImpl update_decl = new Update_declImpl();
    return update_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object_update createObject_update()
  {
    Object_updateImpl object_update = new Object_updateImpl();
    return object_update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Update_preamble_declaration createUpdate_preamble_declaration()
  {
    Update_preamble_declarationImpl update_preamble_declaration = new Update_preamble_declarationImpl();
    return update_preamble_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object_update_assign_stmt createObject_update_assign_stmt()
  {
    Object_update_assign_stmtImpl object_update_assign_stmt = new Object_update_assign_stmtImpl();
    return object_update_assign_stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Productline_decl createProductline_decl()
  {
    Productline_declImpl productline_decl = new Productline_declImpl();
    return productline_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_clause createDelta_clause()
  {
    Delta_clauseImpl delta_clause = new Delta_clauseImpl();
    return delta_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deltaspec createDeltaspec()
  {
    DeltaspecImpl deltaspec = new DeltaspecImpl();
    return deltaspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public After_condition createAfter_condition()
  {
    After_conditionImpl after_condition = new After_conditionImpl();
    return after_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From_condition createFrom_condition()
  {
    From_conditionImpl from_condition = new From_conditionImpl();
    return from_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When_condition createWhen_condition()
  {
    When_conditionImpl when_condition = new When_conditionImpl();
    return when_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application_condition createApplication_condition()
  {
    Application_conditionImpl application_condition = new Application_conditionImpl();
    return application_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_decl createProduct_decl()
  {
    Product_declImpl product_decl = new Product_declImpl();
    return product_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_expr createProduct_expr()
  {
    Product_exprImpl product_expr = new Product_exprImpl();
    return product_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Product_reconfiguration createProduct_reconfiguration()
  {
    Product_reconfigurationImpl product_reconfiguration = new Product_reconfigurationImpl();
    return product_reconfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl createFeature_decl()
  {
    Feature_declImpl feature_decl = new Feature_declImpl();
    return feature_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl_group createFeature_decl_group()
  {
    Feature_decl_groupImpl feature_decl_group = new Feature_decl_groupImpl();
    return feature_decl_group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fnode createFnode()
  {
    FnodeImpl fnode = new FnodeImpl();
    return fnode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl_attribute createFeature_decl_attribute()
  {
    Feature_decl_attributeImpl feature_decl_attribute = new Feature_decl_attributeImpl();
    return feature_decl_attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl_constraint createFeature_decl_constraint()
  {
    Feature_decl_constraintImpl feature_decl_constraint = new Feature_decl_constraintImpl();
    return feature_decl_constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mexp createMexp()
  {
    MexpImpl mexp = new MexpImpl();
    return mexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fextension createFextension()
  {
    FextensionImpl fextension = new FextensionImpl();
    return fextension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or_expr createOr_expr()
  {
    Or_exprImpl or_expr = new Or_exprImpl();
    return or_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And_expr createAnd_expr()
  {
    And_exprImpl and_expr = new And_exprImpl();
    return and_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality_expr createEquality_expr()
  {
    Equality_exprImpl equality_expr = new Equality_exprImpl();
    return equality_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison_expr createComparison_expr()
  {
    Comparison_exprImpl comparison_expr = new Comparison_exprImpl();
    return comparison_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusOrMinus_expr createPlusOrMinus_expr()
  {
    PlusOrMinus_exprImpl plusOrMinus_expr = new PlusOrMinus_exprImpl();
    return plusOrMinus_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulDivOrMod_expr createMulDivOrMod_expr()
  {
    MulDivOrMod_exprImpl mulDivOrMod_expr = new MulDivOrMod_exprImpl();
    return mulDivOrMod_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndGuard createAndGuard()
  {
    AndGuardImpl andGuard = new AndGuardImpl();
    return andGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppOr_exp createAppOr_exp()
  {
    AppOr_expImpl appOr_exp = new AppOr_expImpl();
    return appOr_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppAnd_exp createAppAnd_exp()
  {
    AppAnd_expImpl appAnd_exp = new AppAnd_expImpl();
    return appAnd_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductOr_expr createProductOr_expr()
  {
    ProductOr_exprImpl productOr_expr = new ProductOr_exprImpl();
    return productOr_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductAnd_exp createProductAnd_exp()
  {
    ProductAnd_expImpl productAnd_exp = new ProductAnd_expImpl();
    return productAnd_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductMinus_exp createProductMinus_exp()
  {
    ProductMinus_expImpl productMinus_exp = new ProductMinus_expImpl();
    return productMinus_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpOr_exp createMexpOr_exp()
  {
    MexpOr_expImpl mexpOr_exp = new MexpOr_expImpl();
    return mexpOr_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpAnd_expr createMexpAnd_expr()
  {
    MexpAnd_exprImpl mexpAnd_expr = new MexpAnd_exprImpl();
    return mexpAnd_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpImplies_expr createMexpImplies_expr()
  {
    MexpImplies_exprImpl mexpImplies_expr = new MexpImplies_exprImpl();
    return mexpImplies_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpEquality_expr createMexpEquality_expr()
  {
    MexpEquality_exprImpl mexpEquality_expr = new MexpEquality_exprImpl();
    return mexpEquality_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpComparison_expr createMexpComparison_expr()
  {
    MexpComparison_exprImpl mexpComparison_expr = new MexpComparison_exprImpl();
    return mexpComparison_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpPlusOrMinus_expr createMexpPlusOrMinus_expr()
  {
    MexpPlusOrMinus_exprImpl mexpPlusOrMinus_expr = new MexpPlusOrMinus_exprImpl();
    return mexpPlusOrMinus_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpMulDivOrMod_expr createMexpMulDivOrMod_expr()
  {
    MexpMulDivOrMod_exprImpl mexpMulDivOrMod_expr = new MexpMulDivOrMod_exprImpl();
    return mexpMulDivOrMod_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MexpPrimary_expr createMexpPrimary_expr()
  {
    MexpPrimary_exprImpl mexpPrimary_expr = new MexpPrimary_exprImpl();
    return mexpPrimary_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsPackage getAbsPackage()
  {
    return (AbsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AbsPackage getPackage()
  {
    return AbsPackage.eINSTANCE;
  }

} //AbsFactoryImpl
