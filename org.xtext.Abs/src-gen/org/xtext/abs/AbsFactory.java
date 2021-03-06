/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.abs.AbsPackage
 * @generated
 */
public interface AbsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AbsFactory eINSTANCE = org.xtext.abs.impl.AbsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  Compilation_Unit createCompilation_Unit();

  /**
   * Returns a new object of class '<em>Module decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module decl</em>'.
   * @generated
   */
  Module_decl createModule_decl();

  /**
   * Returns a new object of class '<em>Module export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module export</em>'.
   * @generated
   */
  Module_export createModule_export();

  /**
   * Returns a new object of class '<em>Module import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module import</em>'.
   * @generated
   */
  Module_import createModule_import();

  /**
   * Returns a new object of class '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decl</em>'.
   * @generated
   */
  Decl createDecl();

  /**
   * Returns a new object of class '<em>Par function decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par function decl</em>'.
   * @generated
   */
  Par_function_decl createPar_function_decl();

  /**
   * Returns a new object of class '<em>Function name list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function name list</em>'.
   * @generated
   */
  Function_name_list createFunction_name_list();

  /**
   * Returns a new object of class '<em>Function name decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function name decl</em>'.
   * @generated
   */
  Function_name_decl createFunction_name_decl();

  /**
   * Returns a new object of class '<em>Data Type decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type decl</em>'.
   * @generated
   */
  DataType_decl createDataType_decl();

  /**
   * Returns a new object of class '<em>Data constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data constructor</em>'.
   * @generated
   */
  Data_constructor createData_constructor();

  /**
   * Returns a new object of class '<em>Data constructor arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data constructor arg</em>'.
   * @generated
   */
  Data_constructor_arg createData_constructor_arg();

  /**
   * Returns a new object of class '<em>Annotations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotations</em>'.
   * @generated
   */
  Annotations createAnnotations();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Type use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type use</em>'.
   * @generated
   */
  Type_use createType_use();

  /**
   * Returns a new object of class '<em>Pure exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pure exp</em>'.
   * @generated
   */
  Pure_exp createPure_exp();

  /**
   * Returns a new object of class '<em>Var or field ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var or field ref</em>'.
   * @generated
   */
  Var_or_field_ref createVar_or_field_ref();

  /**
   * Returns a new object of class '<em>Case branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case branch</em>'.
   * @generated
   */
  Case_branch createCase_branch();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Pure exp list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pure exp list</em>'.
   * @generated
   */
  Pure_exp_list createPure_exp_list();

  /**
   * Returns a new object of class '<em>Function list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function list</em>'.
   * @generated
   */
  Function_list createFunction_list();

  /**
   * Returns a new object of class '<em>Function param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function param</em>'.
   * @generated
   */
  Function_param createFunction_param();

  /**
   * Returns a new object of class '<em>Function name param decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function name param decl</em>'.
   * @generated
   */
  Function_name_param_decl createFunction_name_param_decl();

  /**
   * Returns a new object of class '<em>Anon function decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anon function decl</em>'.
   * @generated
   */
  Anon_function_decl createAnon_function_decl();

  /**
   * Returns a new object of class '<em>Param list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param list</em>'.
   * @generated
   */
  Param_list createParam_list();

  /**
   * Returns a new object of class '<em>Param decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param decl</em>'.
   * @generated
   */
  Param_decl createParam_decl();

  /**
   * Returns a new object of class '<em>Type exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type exp</em>'.
   * @generated
   */
  Type_exp createType_exp();

  /**
   * Returns a new object of class '<em>Function decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function decl</em>'.
   * @generated
   */
  Function_decl createFunction_decl();

  /**
   * Returns a new object of class '<em>Typesyn decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typesyn decl</em>'.
   * @generated
   */
  Typesyn_decl createTypesyn_decl();

  /**
   * Returns a new object of class '<em>Exception decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exception decl</em>'.
   * @generated
   */
  Exception_decl createException_decl();

  /**
   * Returns a new object of class '<em>Interface decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface decl</em>'.
   * @generated
   */
  Interface_decl createInterface_decl();

  /**
   * Returns a new object of class '<em>Interface name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface name</em>'.
   * @generated
   */
  Interface_name createInterface_name();

  /**
   * Returns a new object of class '<em>Methodsig</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Methodsig</em>'.
   * @generated
   */
  Methodsig createMethodsig();

  /**
   * Returns a new object of class '<em>Class decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class decl</em>'.
   * @generated
   */
  Class_decl createClass_decl();

  /**
   * Returns a new object of class '<em>Field decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field decl</em>'.
   * @generated
   */
  Field_decl createField_decl();

  /**
   * Returns a new object of class '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stmt</em>'.
   * @generated
   */
  Stmt createStmt();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Eff expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eff expr</em>'.
   * @generated
   */
  Eff_expr createEff_expr();

  /**
   * Returns a new object of class '<em>Delta id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta id</em>'.
   * @generated
   */
  Delta_id createDelta_id();

  /**
   * Returns a new object of class '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guard</em>'.
   * @generated
   */
  Guard createGuard();

  /**
   * Returns a new object of class '<em>Casestmtbranch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Casestmtbranch</em>'.
   * @generated
   */
  Casestmtbranch createCasestmtbranch();

  /**
   * Returns a new object of class '<em>Trait usage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait usage</em>'.
   * @generated
   */
  Trait_usage createTrait_usage();

  /**
   * Returns a new object of class '<em>Trait expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait expr</em>'.
   * @generated
   */
  Trait_expr createTrait_expr();

  /**
   * Returns a new object of class '<em>Trait oper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait oper</em>'.
   * @generated
   */
  Trait_oper createTrait_oper();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Trait decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trait decl</em>'.
   * @generated
   */
  Trait_decl createTrait_decl();

  /**
   * Returns a new object of class '<em>Main block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main block</em>'.
   * @generated
   */
  Main_block createMain_block();

  /**
   * Returns a new object of class '<em>Delta decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta decl</em>'.
   * @generated
   */
  Delta_decl createDelta_decl();

  /**
   * Returns a new object of class '<em>Delta param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta param</em>'.
   * @generated
   */
  Delta_param createDelta_param();

  /**
   * Returns a new object of class '<em>Has condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Has condition</em>'.
   * @generated
   */
  Has_condition createHas_condition();

  /**
   * Returns a new object of class '<em>Delta access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta access</em>'.
   * @generated
   */
  Delta_access createDelta_access();

  /**
   * Returns a new object of class '<em>Module modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module modifier</em>'.
   * @generated
   */
  Module_modifier createModule_modifier();

  /**
   * Returns a new object of class '<em>Functional modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Functional modifier</em>'.
   * @generated
   */
  Functional_modifier createFunctional_modifier();

  /**
   * Returns a new object of class '<em>OO modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OO modifier</em>'.
   * @generated
   */
  OO_modifier createOO_modifier();

  /**
   * Returns a new object of class '<em>Class modifier fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class modifier fragment</em>'.
   * @generated
   */
  Class_modifier_fragment createClass_modifier_fragment();

  /**
   * Returns a new object of class '<em>Interface modifier fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface modifier fragment</em>'.
   * @generated
   */
  Interface_modifier_fragment createInterface_modifier_fragment();

  /**
   * Returns a new object of class '<em>Namespace modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace modifier</em>'.
   * @generated
   */
  Namespace_modifier createNamespace_modifier();

  /**
   * Returns a new object of class '<em>Update decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update decl</em>'.
   * @generated
   */
  Update_decl createUpdate_decl();

  /**
   * Returns a new object of class '<em>Object update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object update</em>'.
   * @generated
   */
  Object_update createObject_update();

  /**
   * Returns a new object of class '<em>Update preamble declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update preamble declaration</em>'.
   * @generated
   */
  Update_preamble_declaration createUpdate_preamble_declaration();

  /**
   * Returns a new object of class '<em>Object update assign stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object update assign stmt</em>'.
   * @generated
   */
  Object_update_assign_stmt createObject_update_assign_stmt();

  /**
   * Returns a new object of class '<em>Productline decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Productline decl</em>'.
   * @generated
   */
  Productline_decl createProductline_decl();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Delta clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta clause</em>'.
   * @generated
   */
  Delta_clause createDelta_clause();

  /**
   * Returns a new object of class '<em>Deltaspec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deltaspec</em>'.
   * @generated
   */
  Deltaspec createDeltaspec();

  /**
   * Returns a new object of class '<em>After condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After condition</em>'.
   * @generated
   */
  After_condition createAfter_condition();

  /**
   * Returns a new object of class '<em>From condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From condition</em>'.
   * @generated
   */
  From_condition createFrom_condition();

  /**
   * Returns a new object of class '<em>When condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When condition</em>'.
   * @generated
   */
  When_condition createWhen_condition();

  /**
   * Returns a new object of class '<em>Application condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application condition</em>'.
   * @generated
   */
  Application_condition createApplication_condition();

  /**
   * Returns a new object of class '<em>Product decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product decl</em>'.
   * @generated
   */
  Product_decl createProduct_decl();

  /**
   * Returns a new object of class '<em>Product expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product expr</em>'.
   * @generated
   */
  Product_expr createProduct_expr();

  /**
   * Returns a new object of class '<em>Product reconfiguration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product reconfiguration</em>'.
   * @generated
   */
  Product_reconfiguration createProduct_reconfiguration();

  /**
   * Returns a new object of class '<em>Feature decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature decl</em>'.
   * @generated
   */
  Feature_decl createFeature_decl();

  /**
   * Returns a new object of class '<em>Feature decl group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature decl group</em>'.
   * @generated
   */
  Feature_decl_group createFeature_decl_group();

  /**
   * Returns a new object of class '<em>Fnode</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fnode</em>'.
   * @generated
   */
  Fnode createFnode();

  /**
   * Returns a new object of class '<em>Feature decl attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature decl attribute</em>'.
   * @generated
   */
  Feature_decl_attribute createFeature_decl_attribute();

  /**
   * Returns a new object of class '<em>Feature decl constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature decl constraint</em>'.
   * @generated
   */
  Feature_decl_constraint createFeature_decl_constraint();

  /**
   * Returns a new object of class '<em>Mexp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp</em>'.
   * @generated
   */
  Mexp createMexp();

  /**
   * Returns a new object of class '<em>Fextension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fextension</em>'.
   * @generated
   */
  Fextension createFextension();

  /**
   * Returns a new object of class '<em>Or expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or expr</em>'.
   * @generated
   */
  Or_expr createOr_expr();

  /**
   * Returns a new object of class '<em>And expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And expr</em>'.
   * @generated
   */
  And_expr createAnd_expr();

  /**
   * Returns a new object of class '<em>Equality expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality expr</em>'.
   * @generated
   */
  Equality_expr createEquality_expr();

  /**
   * Returns a new object of class '<em>Comparison expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison expr</em>'.
   * @generated
   */
  Comparison_expr createComparison_expr();

  /**
   * Returns a new object of class '<em>Plus Or Minus expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Or Minus expr</em>'.
   * @generated
   */
  PlusOrMinus_expr createPlusOrMinus_expr();

  /**
   * Returns a new object of class '<em>Mul Div Or Mod expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Div Or Mod expr</em>'.
   * @generated
   */
  MulDivOrMod_expr createMulDivOrMod_expr();

  /**
   * Returns a new object of class '<em>And Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Guard</em>'.
   * @generated
   */
  AndGuard createAndGuard();

  /**
   * Returns a new object of class '<em>App Or exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>App Or exp</em>'.
   * @generated
   */
  AppOr_exp createAppOr_exp();

  /**
   * Returns a new object of class '<em>App And exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>App And exp</em>'.
   * @generated
   */
  AppAnd_exp createAppAnd_exp();

  /**
   * Returns a new object of class '<em>Product Or expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Or expr</em>'.
   * @generated
   */
  ProductOr_expr createProductOr_expr();

  /**
   * Returns a new object of class '<em>Product And exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product And exp</em>'.
   * @generated
   */
  ProductAnd_exp createProductAnd_exp();

  /**
   * Returns a new object of class '<em>Product Minus exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Minus exp</em>'.
   * @generated
   */
  ProductMinus_exp createProductMinus_exp();

  /**
   * Returns a new object of class '<em>Mexp Or exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Or exp</em>'.
   * @generated
   */
  MexpOr_exp createMexpOr_exp();

  /**
   * Returns a new object of class '<em>Mexp And expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp And expr</em>'.
   * @generated
   */
  MexpAnd_expr createMexpAnd_expr();

  /**
   * Returns a new object of class '<em>Mexp Implies expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Implies expr</em>'.
   * @generated
   */
  MexpImplies_expr createMexpImplies_expr();

  /**
   * Returns a new object of class '<em>Mexp Equality expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Equality expr</em>'.
   * @generated
   */
  MexpEquality_expr createMexpEquality_expr();

  /**
   * Returns a new object of class '<em>Mexp Comparison expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Comparison expr</em>'.
   * @generated
   */
  MexpComparison_expr createMexpComparison_expr();

  /**
   * Returns a new object of class '<em>Mexp Plus Or Minus expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Plus Or Minus expr</em>'.
   * @generated
   */
  MexpPlusOrMinus_expr createMexpPlusOrMinus_expr();

  /**
   * Returns a new object of class '<em>Mexp Mul Div Or Mod expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Mul Div Or Mod expr</em>'.
   * @generated
   */
  MexpMulDivOrMod_expr createMexpMulDivOrMod_expr();

  /**
   * Returns a new object of class '<em>Mexp Primary expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mexp Primary expr</em>'.
   * @generated
   */
  MexpPrimary_expr createMexpPrimary_expr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AbsPackage getAbsPackage();

} //AbsFactory
