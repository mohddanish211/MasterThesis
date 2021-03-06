/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.abs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.abs.AbsPackage
 * @generated
 */
public class AbsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AbsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AbsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AbsPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.COMPILATION_UNIT:
      {
        Compilation_Unit compilation_Unit = (Compilation_Unit)theEObject;
        T result = caseCompilation_Unit(compilation_Unit);
        if (result == null) result = caseDomainModel(compilation_Unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MODULE_DECL:
      {
        Module_decl module_decl = (Module_decl)theEObject;
        T result = caseModule_decl(module_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MODULE_EXPORT:
      {
        Module_export module_export = (Module_export)theEObject;
        T result = caseModule_export(module_export);
        if (result == null) result = caseNamespace_modifier(module_export);
        if (result == null) result = caseModule_modifier(module_export);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MODULE_IMPORT:
      {
        Module_import module_import = (Module_import)theEObject;
        T result = caseModule_import(module_import);
        if (result == null) result = caseNamespace_modifier(module_import);
        if (result == null) result = caseModule_modifier(module_import);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PAR_FUNCTION_DECL:
      {
        Par_function_decl par_function_decl = (Par_function_decl)theEObject;
        T result = casePar_function_decl(par_function_decl);
        if (result == null) result = caseDecl(par_function_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_NAME_LIST:
      {
        Function_name_list function_name_list = (Function_name_list)theEObject;
        T result = caseFunction_name_list(function_name_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_NAME_DECL:
      {
        Function_name_decl function_name_decl = (Function_name_decl)theEObject;
        T result = caseFunction_name_decl(function_name_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DATA_TYPE_DECL:
      {
        DataType_decl dataType_decl = (DataType_decl)theEObject;
        T result = caseDataType_decl(dataType_decl);
        if (result == null) result = caseDecl(dataType_decl);
        if (result == null) result = caseFunctional_modifier(dataType_decl);
        if (result == null) result = caseModule_modifier(dataType_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DATA_CONSTRUCTOR:
      {
        Data_constructor data_constructor = (Data_constructor)theEObject;
        T result = caseData_constructor(data_constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DATA_CONSTRUCTOR_ARG:
      {
        Data_constructor_arg data_constructor_arg = (Data_constructor_arg)theEObject;
        T result = caseData_constructor_arg(data_constructor_arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.ANNOTATIONS:
      {
        Annotations annotations = (Annotations)theEObject;
        T result = caseAnnotations(annotations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TYPE_USE:
      {
        Type_use type_use = (Type_use)theEObject;
        T result = caseType_use(type_use);
        if (result == null) result = caseData_constructor_arg(type_use);
        if (result == null) result = caseAnnotation(type_use);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PURE_EXP:
      {
        Pure_exp pure_exp = (Pure_exp)theEObject;
        T result = casePure_exp(pure_exp);
        if (result == null) result = caseEff_expr(pure_exp);
        if (result == null) result = caseExp(pure_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.VAR_OR_FIELD_REF:
      {
        Var_or_field_ref var_or_field_ref = (Var_or_field_ref)theEObject;
        T result = caseVar_or_field_ref(var_or_field_ref);
        if (result == null) result = casePure_exp(var_or_field_ref);
        if (result == null) result = caseEff_expr(var_or_field_ref);
        if (result == null) result = caseExp(var_or_field_ref);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.CASE_BRANCH:
      {
        Case_branch case_branch = (Case_branch)theEObject;
        T result = caseCase_branch(case_branch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = caseCase_branch(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PURE_EXP_LIST:
      {
        Pure_exp_list pure_exp_list = (Pure_exp_list)theEObject;
        T result = casePure_exp_list(pure_exp_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_LIST:
      {
        Function_list function_list = (Function_list)theEObject;
        T result = caseFunction_list(function_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_PARAM:
      {
        Function_param function_param = (Function_param)theEObject;
        T result = caseFunction_param(function_param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_NAME_PARAM_DECL:
      {
        Function_name_param_decl function_name_param_decl = (Function_name_param_decl)theEObject;
        T result = caseFunction_name_param_decl(function_name_param_decl);
        if (result == null) result = caseFunction_param(function_name_param_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.ANON_FUNCTION_DECL:
      {
        Anon_function_decl anon_function_decl = (Anon_function_decl)theEObject;
        T result = caseAnon_function_decl(anon_function_decl);
        if (result == null) result = caseFunction_param(anon_function_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PARAM_LIST:
      {
        Param_list param_list = (Param_list)theEObject;
        T result = caseParam_list(param_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PARAM_DECL:
      {
        Param_decl param_decl = (Param_decl)theEObject;
        T result = caseParam_decl(param_decl);
        if (result == null) result = caseDelta_param(param_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TYPE_EXP:
      {
        Type_exp type_exp = (Type_exp)theEObject;
        T result = caseType_exp(type_exp);
        if (result == null) result = caseUpdate_preamble_declaration(type_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTION_DECL:
      {
        Function_decl function_decl = (Function_decl)theEObject;
        T result = caseFunction_decl(function_decl);
        if (result == null) result = caseDecl(function_decl);
        if (result == null) result = caseFunctional_modifier(function_decl);
        if (result == null) result = caseModule_modifier(function_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TYPESYN_DECL:
      {
        Typesyn_decl typesyn_decl = (Typesyn_decl)theEObject;
        T result = caseTypesyn_decl(typesyn_decl);
        if (result == null) result = caseDecl(typesyn_decl);
        if (result == null) result = caseFunctional_modifier(typesyn_decl);
        if (result == null) result = caseModule_modifier(typesyn_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.EXCEPTION_DECL:
      {
        Exception_decl exception_decl = (Exception_decl)theEObject;
        T result = caseException_decl(exception_decl);
        if (result == null) result = caseDecl(exception_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.INTERFACE_DECL:
      {
        Interface_decl interface_decl = (Interface_decl)theEObject;
        T result = caseInterface_decl(interface_decl);
        if (result == null) result = caseDecl(interface_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.INTERFACE_NAME:
      {
        Interface_name interface_name = (Interface_name)theEObject;
        T result = caseInterface_name(interface_name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.METHODSIG:
      {
        Methodsig methodsig = (Methodsig)theEObject;
        T result = caseMethodsig(methodsig);
        if (result == null) result = caseClass_modifier_fragment(methodsig);
        if (result == null) result = caseInterface_modifier_fragment(methodsig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.CLASS_DECL:
      {
        Class_decl class_decl = (Class_decl)theEObject;
        T result = caseClass_decl(class_decl);
        if (result == null) result = caseDecl(class_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FIELD_DECL:
      {
        Field_decl field_decl = (Field_decl)theEObject;
        T result = caseField_decl(field_decl);
        if (result == null) result = caseClass_modifier_fragment(field_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.EFF_EXPR:
      {
        Eff_expr eff_expr = (Eff_expr)theEObject;
        T result = caseEff_expr(eff_expr);
        if (result == null) result = caseExp(eff_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTA_ID:
      {
        Delta_id delta_id = (Delta_id)theEObject;
        T result = caseDelta_id(delta_id);
        if (result == null) result = caseEff_expr(delta_id);
        if (result == null) result = caseExp(delta_id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.GUARD:
      {
        Guard guard = (Guard)theEObject;
        T result = caseGuard(guard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.CASESTMTBRANCH:
      {
        Casestmtbranch casestmtbranch = (Casestmtbranch)theEObject;
        T result = caseCasestmtbranch(casestmtbranch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TRAIT_USAGE:
      {
        Trait_usage trait_usage = (Trait_usage)theEObject;
        T result = caseTrait_usage(trait_usage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TRAIT_EXPR:
      {
        Trait_expr trait_expr = (Trait_expr)theEObject;
        T result = caseTrait_expr(trait_expr);
        if (result == null) result = caseClass_modifier_fragment(trait_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TRAIT_OPER:
      {
        Trait_oper trait_oper = (Trait_oper)theEObject;
        T result = caseTrait_oper(trait_oper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.TRAIT_DECL:
      {
        Trait_decl trait_decl = (Trait_decl)theEObject;
        T result = caseTrait_decl(trait_decl);
        if (result == null) result = caseDecl(trait_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MAIN_BLOCK:
      {
        Main_block main_block = (Main_block)theEObject;
        T result = caseMain_block(main_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTA_DECL:
      {
        Delta_decl delta_decl = (Delta_decl)theEObject;
        T result = caseDelta_decl(delta_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTA_PARAM:
      {
        Delta_param delta_param = (Delta_param)theEObject;
        T result = caseDelta_param(delta_param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.HAS_CONDITION:
      {
        Has_condition has_condition = (Has_condition)theEObject;
        T result = caseHas_condition(has_condition);
        if (result == null) result = caseDelta_param(has_condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTA_ACCESS:
      {
        Delta_access delta_access = (Delta_access)theEObject;
        T result = caseDelta_access(delta_access);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MODULE_MODIFIER:
      {
        Module_modifier module_modifier = (Module_modifier)theEObject;
        T result = caseModule_modifier(module_modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FUNCTIONAL_MODIFIER:
      {
        Functional_modifier functional_modifier = (Functional_modifier)theEObject;
        T result = caseFunctional_modifier(functional_modifier);
        if (result == null) result = caseModule_modifier(functional_modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.OO_MODIFIER:
      {
        OO_modifier oO_modifier = (OO_modifier)theEObject;
        T result = caseOO_modifier(oO_modifier);
        if (result == null) result = caseModule_modifier(oO_modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.CLASS_MODIFIER_FRAGMENT:
      {
        Class_modifier_fragment class_modifier_fragment = (Class_modifier_fragment)theEObject;
        T result = caseClass_modifier_fragment(class_modifier_fragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT:
      {
        Interface_modifier_fragment interface_modifier_fragment = (Interface_modifier_fragment)theEObject;
        T result = caseInterface_modifier_fragment(interface_modifier_fragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.NAMESPACE_MODIFIER:
      {
        Namespace_modifier namespace_modifier = (Namespace_modifier)theEObject;
        T result = caseNamespace_modifier(namespace_modifier);
        if (result == null) result = caseModule_modifier(namespace_modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.UPDATE_DECL:
      {
        Update_decl update_decl = (Update_decl)theEObject;
        T result = caseUpdate_decl(update_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.OBJECT_UPDATE:
      {
        Object_update object_update = (Object_update)theEObject;
        T result = caseObject_update(object_update);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.UPDATE_PREAMBLE_DECLARATION:
      {
        Update_preamble_declaration update_preamble_declaration = (Update_preamble_declaration)theEObject;
        T result = caseUpdate_preamble_declaration(update_preamble_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.OBJECT_UPDATE_ASSIGN_STMT:
      {
        Object_update_assign_stmt object_update_assign_stmt = (Object_update_assign_stmt)theEObject;
        T result = caseObject_update_assign_stmt(object_update_assign_stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCTLINE_DECL:
      {
        Productline_decl productline_decl = (Productline_decl)theEObject;
        T result = caseProductline_decl(productline_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTA_CLAUSE:
      {
        Delta_clause delta_clause = (Delta_clause)theEObject;
        T result = caseDelta_clause(delta_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.DELTASPEC:
      {
        Deltaspec deltaspec = (Deltaspec)theEObject;
        T result = caseDeltaspec(deltaspec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.AFTER_CONDITION:
      {
        After_condition after_condition = (After_condition)theEObject;
        T result = caseAfter_condition(after_condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FROM_CONDITION:
      {
        From_condition from_condition = (From_condition)theEObject;
        T result = caseFrom_condition(from_condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.WHEN_CONDITION:
      {
        When_condition when_condition = (When_condition)theEObject;
        T result = caseWhen_condition(when_condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.APPLICATION_CONDITION:
      {
        Application_condition application_condition = (Application_condition)theEObject;
        T result = caseApplication_condition(application_condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_DECL:
      {
        Product_decl product_decl = (Product_decl)theEObject;
        T result = caseProduct_decl(product_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_EXPR:
      {
        Product_expr product_expr = (Product_expr)theEObject;
        T result = caseProduct_expr(product_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_RECONFIGURATION:
      {
        Product_reconfiguration product_reconfiguration = (Product_reconfiguration)theEObject;
        T result = caseProduct_reconfiguration(product_reconfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEATURE_DECL:
      {
        Feature_decl feature_decl = (Feature_decl)theEObject;
        T result = caseFeature_decl(feature_decl);
        if (result == null) result = caseFnode(feature_decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEATURE_DECL_GROUP:
      {
        Feature_decl_group feature_decl_group = (Feature_decl_group)theEObject;
        T result = caseFeature_decl_group(feature_decl_group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FNODE:
      {
        Fnode fnode = (Fnode)theEObject;
        T result = caseFnode(fnode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEATURE_DECL_ATTRIBUTE:
      {
        Feature_decl_attribute feature_decl_attribute = (Feature_decl_attribute)theEObject;
        T result = caseFeature_decl_attribute(feature_decl_attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEATURE_DECL_CONSTRAINT:
      {
        Feature_decl_constraint feature_decl_constraint = (Feature_decl_constraint)theEObject;
        T result = caseFeature_decl_constraint(feature_decl_constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP:
      {
        Mexp mexp = (Mexp)theEObject;
        T result = caseMexp(mexp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.FEXTENSION:
      {
        Fextension fextension = (Fextension)theEObject;
        T result = caseFextension(fextension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.OR_EXPR:
      {
        Or_expr or_expr = (Or_expr)theEObject;
        T result = caseOr_expr(or_expr);
        if (result == null) result = casePure_exp(or_expr);
        if (result == null) result = caseEff_expr(or_expr);
        if (result == null) result = caseExp(or_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.AND_EXPR:
      {
        And_expr and_expr = (And_expr)theEObject;
        T result = caseAnd_expr(and_expr);
        if (result == null) result = casePure_exp(and_expr);
        if (result == null) result = caseEff_expr(and_expr);
        if (result == null) result = caseExp(and_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.EQUALITY_EXPR:
      {
        Equality_expr equality_expr = (Equality_expr)theEObject;
        T result = caseEquality_expr(equality_expr);
        if (result == null) result = casePure_exp(equality_expr);
        if (result == null) result = caseEff_expr(equality_expr);
        if (result == null) result = caseExp(equality_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.COMPARISON_EXPR:
      {
        Comparison_expr comparison_expr = (Comparison_expr)theEObject;
        T result = caseComparison_expr(comparison_expr);
        if (result == null) result = casePure_exp(comparison_expr);
        if (result == null) result = caseEff_expr(comparison_expr);
        if (result == null) result = caseExp(comparison_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PLUS_OR_MINUS_EXPR:
      {
        PlusOrMinus_expr plusOrMinus_expr = (PlusOrMinus_expr)theEObject;
        T result = casePlusOrMinus_expr(plusOrMinus_expr);
        if (result == null) result = casePure_exp(plusOrMinus_expr);
        if (result == null) result = caseEff_expr(plusOrMinus_expr);
        if (result == null) result = caseExp(plusOrMinus_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MUL_DIV_OR_MOD_EXPR:
      {
        MulDivOrMod_expr mulDivOrMod_expr = (MulDivOrMod_expr)theEObject;
        T result = caseMulDivOrMod_expr(mulDivOrMod_expr);
        if (result == null) result = casePure_exp(mulDivOrMod_expr);
        if (result == null) result = caseEff_expr(mulDivOrMod_expr);
        if (result == null) result = caseExp(mulDivOrMod_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.AND_GUARD:
      {
        AndGuard andGuard = (AndGuard)theEObject;
        T result = caseAndGuard(andGuard);
        if (result == null) result = caseGuard(andGuard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.APP_OR_EXP:
      {
        AppOr_exp appOr_exp = (AppOr_exp)theEObject;
        T result = caseAppOr_exp(appOr_exp);
        if (result == null) result = caseApplication_condition(appOr_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.APP_AND_EXP:
      {
        AppAnd_exp appAnd_exp = (AppAnd_exp)theEObject;
        T result = caseAppAnd_exp(appAnd_exp);
        if (result == null) result = caseApplication_condition(appAnd_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_OR_EXPR:
      {
        ProductOr_expr productOr_expr = (ProductOr_expr)theEObject;
        T result = caseProductOr_expr(productOr_expr);
        if (result == null) result = caseProduct_expr(productOr_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_AND_EXP:
      {
        ProductAnd_exp productAnd_exp = (ProductAnd_exp)theEObject;
        T result = caseProductAnd_exp(productAnd_exp);
        if (result == null) result = caseProduct_expr(productAnd_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.PRODUCT_MINUS_EXP:
      {
        ProductMinus_exp productMinus_exp = (ProductMinus_exp)theEObject;
        T result = caseProductMinus_exp(productMinus_exp);
        if (result == null) result = caseProduct_expr(productMinus_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_OR_EXP:
      {
        MexpOr_exp mexpOr_exp = (MexpOr_exp)theEObject;
        T result = caseMexpOr_exp(mexpOr_exp);
        if (result == null) result = caseMexp(mexpOr_exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_AND_EXPR:
      {
        MexpAnd_expr mexpAnd_expr = (MexpAnd_expr)theEObject;
        T result = caseMexpAnd_expr(mexpAnd_expr);
        if (result == null) result = caseMexp(mexpAnd_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_IMPLIES_EXPR:
      {
        MexpImplies_expr mexpImplies_expr = (MexpImplies_expr)theEObject;
        T result = caseMexpImplies_expr(mexpImplies_expr);
        if (result == null) result = caseMexp(mexpImplies_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_EQUALITY_EXPR:
      {
        MexpEquality_expr mexpEquality_expr = (MexpEquality_expr)theEObject;
        T result = caseMexpEquality_expr(mexpEquality_expr);
        if (result == null) result = caseMexp(mexpEquality_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_COMPARISON_EXPR:
      {
        MexpComparison_expr mexpComparison_expr = (MexpComparison_expr)theEObject;
        T result = caseMexpComparison_expr(mexpComparison_expr);
        if (result == null) result = caseMexp(mexpComparison_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_PLUS_OR_MINUS_EXPR:
      {
        MexpPlusOrMinus_expr mexpPlusOrMinus_expr = (MexpPlusOrMinus_expr)theEObject;
        T result = caseMexpPlusOrMinus_expr(mexpPlusOrMinus_expr);
        if (result == null) result = caseMexp(mexpPlusOrMinus_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_MUL_DIV_OR_MOD_EXPR:
      {
        MexpMulDivOrMod_expr mexpMulDivOrMod_expr = (MexpMulDivOrMod_expr)theEObject;
        T result = caseMexpMulDivOrMod_expr(mexpMulDivOrMod_expr);
        if (result == null) result = caseMexp(mexpMulDivOrMod_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AbsPackage.MEXP_PRIMARY_EXPR:
      {
        MexpPrimary_expr mexpPrimary_expr = (MexpPrimary_expr)theEObject;
        T result = caseMexpPrimary_expr(mexpPrimary_expr);
        if (result == null) result = caseMexp(mexpPrimary_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModel(DomainModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilation_Unit(Compilation_Unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule_decl(Module_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module export</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module export</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule_export(Module_export object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule_import(Module_import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl(Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par function decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par function decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePar_function_decl(Par_function_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function name list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function name list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_name_list(Function_name_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function name decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function name decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_name_decl(Function_name_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType_decl(DataType_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData_constructor(Data_constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data constructor arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data constructor arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData_constructor_arg(Data_constructor_arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotations(Annotations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_use(Type_use object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pure exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pure exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePure_exp(Pure_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var or field ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var or field ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar_or_field_ref(Var_or_field_ref object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase_branch(Case_branch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pure exp list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pure exp list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePure_exp_list(Pure_exp_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_list(Function_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_param(Function_param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function name param decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function name param decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_name_param_decl(Function_name_param_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anon function decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anon function decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnon_function_decl(Anon_function_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam_list(Param_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParam_decl(Param_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_exp(Type_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction_decl(Function_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typesyn decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typesyn decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypesyn_decl(Typesyn_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exception decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exception decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseException_decl(Exception_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_decl(Interface_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_name(Interface_name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Methodsig</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Methodsig</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodsig(Methodsig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_decl(Class_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField_decl(Field_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eff expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eff expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEff_expr(Eff_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta_id(Delta_id object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuard(Guard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Casestmtbranch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Casestmtbranch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCasestmtbranch(Casestmtbranch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait usage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait usage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrait_usage(Trait_usage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrait_expr(Trait_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait oper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait oper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrait_oper(Trait_oper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trait decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trait decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrait_decl(Trait_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain_block(Main_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta_decl(Delta_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta_param(Delta_param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Has condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Has condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHas_condition(Has_condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta_access(Delta_access object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule_modifier(Module_modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Functional modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Functional modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctional_modifier(Functional_modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OO modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OO modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOO_modifier(OO_modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class modifier fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class modifier fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_modifier_fragment(Class_modifier_fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface modifier fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface modifier fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_modifier_fragment(Interface_modifier_fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace_modifier(Namespace_modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdate_decl(Update_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject_update(Object_update object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update preamble declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update preamble declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdate_preamble_declaration(Update_preamble_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object update assign stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object update assign stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject_update_assign_stmt(Object_update_assign_stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Productline decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Productline decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductline_decl(Productline_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta_clause(Delta_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deltaspec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deltaspec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaspec(Deltaspec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfter_condition(After_condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrom_condition(From_condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhen_condition(When_condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication_condition(Application_condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduct_decl(Product_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduct_expr(Product_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product reconfiguration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product reconfiguration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProduct_reconfiguration(Product_reconfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature_decl(Feature_decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature decl group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature decl group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature_decl_group(Feature_decl_group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fnode</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fnode</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFnode(Fnode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature decl attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature decl attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature_decl_attribute(Feature_decl_attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature decl constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature decl constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature_decl_constraint(Feature_decl_constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexp(Mexp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fextension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fextension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFextension(Fextension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr_expr(Or_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd_expr(And_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality_expr(Equality_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison_expr(Comparison_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Or Minus expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Or Minus expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusOrMinus_expr(PlusOrMinus_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul Div Or Mod expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul Div Or Mod expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulDivOrMod_expr(MulDivOrMod_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Guard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Guard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndGuard(AndGuard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App Or exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App Or exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppOr_exp(AppOr_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>App And exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>App And exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppAnd_exp(AppAnd_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Or expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Or expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductOr_expr(ProductOr_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product And exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product And exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductAnd_exp(ProductAnd_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Minus exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Minus exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductMinus_exp(ProductMinus_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Or exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Or exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpOr_exp(MexpOr_exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp And expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp And expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpAnd_expr(MexpAnd_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Implies expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Implies expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpImplies_expr(MexpImplies_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Equality expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Equality expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpEquality_expr(MexpEquality_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Comparison expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Comparison expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpComparison_expr(MexpComparison_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Plus Or Minus expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Plus Or Minus expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpPlusOrMinus_expr(MexpPlusOrMinus_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Mul Div Or Mod expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Mul Div Or Mod expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpMulDivOrMod_expr(MexpMulDivOrMod_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mexp Primary expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mexp Primary expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMexpPrimary_expr(MexpPrimary_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AbsSwitch
