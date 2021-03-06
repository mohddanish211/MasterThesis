/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.abs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.abs.AbsPackage
 * @generated
 */
public class AbsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AbsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AbsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbsSwitch<Adapter> modelSwitch =
    new AbsSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseCompilation_Unit(Compilation_Unit object)
      {
        return createCompilation_UnitAdapter();
      }
      @Override
      public Adapter caseModule_decl(Module_decl object)
      {
        return createModule_declAdapter();
      }
      @Override
      public Adapter caseModule_export(Module_export object)
      {
        return createModule_exportAdapter();
      }
      @Override
      public Adapter caseModule_import(Module_import object)
      {
        return createModule_importAdapter();
      }
      @Override
      public Adapter caseDecl(Decl object)
      {
        return createDeclAdapter();
      }
      @Override
      public Adapter casePar_function_decl(Par_function_decl object)
      {
        return createPar_function_declAdapter();
      }
      @Override
      public Adapter caseFunction_name_list(Function_name_list object)
      {
        return createFunction_name_listAdapter();
      }
      @Override
      public Adapter caseFunction_name_decl(Function_name_decl object)
      {
        return createFunction_name_declAdapter();
      }
      @Override
      public Adapter caseDataType_decl(DataType_decl object)
      {
        return createDataType_declAdapter();
      }
      @Override
      public Adapter caseData_constructor(Data_constructor object)
      {
        return createData_constructorAdapter();
      }
      @Override
      public Adapter caseData_constructor_arg(Data_constructor_arg object)
      {
        return createData_constructor_argAdapter();
      }
      @Override
      public Adapter caseAnnotations(Annotations object)
      {
        return createAnnotationsAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseType_use(Type_use object)
      {
        return createType_useAdapter();
      }
      @Override
      public Adapter casePure_exp(Pure_exp object)
      {
        return createPure_expAdapter();
      }
      @Override
      public Adapter caseVar_or_field_ref(Var_or_field_ref object)
      {
        return createVar_or_field_refAdapter();
      }
      @Override
      public Adapter caseCase_branch(Case_branch object)
      {
        return createCase_branchAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter casePure_exp_list(Pure_exp_list object)
      {
        return createPure_exp_listAdapter();
      }
      @Override
      public Adapter caseFunction_list(Function_list object)
      {
        return createFunction_listAdapter();
      }
      @Override
      public Adapter caseFunction_param(Function_param object)
      {
        return createFunction_paramAdapter();
      }
      @Override
      public Adapter caseFunction_name_param_decl(Function_name_param_decl object)
      {
        return createFunction_name_param_declAdapter();
      }
      @Override
      public Adapter caseAnon_function_decl(Anon_function_decl object)
      {
        return createAnon_function_declAdapter();
      }
      @Override
      public Adapter caseParam_list(Param_list object)
      {
        return createParam_listAdapter();
      }
      @Override
      public Adapter caseParam_decl(Param_decl object)
      {
        return createParam_declAdapter();
      }
      @Override
      public Adapter caseType_exp(Type_exp object)
      {
        return createType_expAdapter();
      }
      @Override
      public Adapter caseFunction_decl(Function_decl object)
      {
        return createFunction_declAdapter();
      }
      @Override
      public Adapter caseTypesyn_decl(Typesyn_decl object)
      {
        return createTypesyn_declAdapter();
      }
      @Override
      public Adapter caseException_decl(Exception_decl object)
      {
        return createException_declAdapter();
      }
      @Override
      public Adapter caseInterface_decl(Interface_decl object)
      {
        return createInterface_declAdapter();
      }
      @Override
      public Adapter caseInterface_name(Interface_name object)
      {
        return createInterface_nameAdapter();
      }
      @Override
      public Adapter caseMethodsig(Methodsig object)
      {
        return createMethodsigAdapter();
      }
      @Override
      public Adapter caseClass_decl(Class_decl object)
      {
        return createClass_declAdapter();
      }
      @Override
      public Adapter caseField_decl(Field_decl object)
      {
        return createField_declAdapter();
      }
      @Override
      public Adapter caseStmt(Stmt object)
      {
        return createStmtAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter caseEff_expr(Eff_expr object)
      {
        return createEff_exprAdapter();
      }
      @Override
      public Adapter caseDelta_id(Delta_id object)
      {
        return createDelta_idAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseCasestmtbranch(Casestmtbranch object)
      {
        return createCasestmtbranchAdapter();
      }
      @Override
      public Adapter caseTrait_usage(Trait_usage object)
      {
        return createTrait_usageAdapter();
      }
      @Override
      public Adapter caseTrait_expr(Trait_expr object)
      {
        return createTrait_exprAdapter();
      }
      @Override
      public Adapter caseTrait_oper(Trait_oper object)
      {
        return createTrait_operAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseTrait_decl(Trait_decl object)
      {
        return createTrait_declAdapter();
      }
      @Override
      public Adapter caseMain_block(Main_block object)
      {
        return createMain_blockAdapter();
      }
      @Override
      public Adapter caseDelta_decl(Delta_decl object)
      {
        return createDelta_declAdapter();
      }
      @Override
      public Adapter caseDelta_param(Delta_param object)
      {
        return createDelta_paramAdapter();
      }
      @Override
      public Adapter caseHas_condition(Has_condition object)
      {
        return createHas_conditionAdapter();
      }
      @Override
      public Adapter caseDelta_access(Delta_access object)
      {
        return createDelta_accessAdapter();
      }
      @Override
      public Adapter caseModule_modifier(Module_modifier object)
      {
        return createModule_modifierAdapter();
      }
      @Override
      public Adapter caseFunctional_modifier(Functional_modifier object)
      {
        return createFunctional_modifierAdapter();
      }
      @Override
      public Adapter caseOO_modifier(OO_modifier object)
      {
        return createOO_modifierAdapter();
      }
      @Override
      public Adapter caseClass_modifier_fragment(Class_modifier_fragment object)
      {
        return createClass_modifier_fragmentAdapter();
      }
      @Override
      public Adapter caseInterface_modifier_fragment(Interface_modifier_fragment object)
      {
        return createInterface_modifier_fragmentAdapter();
      }
      @Override
      public Adapter caseNamespace_modifier(Namespace_modifier object)
      {
        return createNamespace_modifierAdapter();
      }
      @Override
      public Adapter caseUpdate_decl(Update_decl object)
      {
        return createUpdate_declAdapter();
      }
      @Override
      public Adapter caseObject_update(Object_update object)
      {
        return createObject_updateAdapter();
      }
      @Override
      public Adapter caseUpdate_preamble_declaration(Update_preamble_declaration object)
      {
        return createUpdate_preamble_declarationAdapter();
      }
      @Override
      public Adapter caseObject_update_assign_stmt(Object_update_assign_stmt object)
      {
        return createObject_update_assign_stmtAdapter();
      }
      @Override
      public Adapter caseProductline_decl(Productline_decl object)
      {
        return createProductline_declAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseDelta_clause(Delta_clause object)
      {
        return createDelta_clauseAdapter();
      }
      @Override
      public Adapter caseDeltaspec(Deltaspec object)
      {
        return createDeltaspecAdapter();
      }
      @Override
      public Adapter caseAfter_condition(After_condition object)
      {
        return createAfter_conditionAdapter();
      }
      @Override
      public Adapter caseFrom_condition(From_condition object)
      {
        return createFrom_conditionAdapter();
      }
      @Override
      public Adapter caseWhen_condition(When_condition object)
      {
        return createWhen_conditionAdapter();
      }
      @Override
      public Adapter caseApplication_condition(Application_condition object)
      {
        return createApplication_conditionAdapter();
      }
      @Override
      public Adapter caseProduct_decl(Product_decl object)
      {
        return createProduct_declAdapter();
      }
      @Override
      public Adapter caseProduct_expr(Product_expr object)
      {
        return createProduct_exprAdapter();
      }
      @Override
      public Adapter caseProduct_reconfiguration(Product_reconfiguration object)
      {
        return createProduct_reconfigurationAdapter();
      }
      @Override
      public Adapter caseFeature_decl(Feature_decl object)
      {
        return createFeature_declAdapter();
      }
      @Override
      public Adapter caseFeature_decl_group(Feature_decl_group object)
      {
        return createFeature_decl_groupAdapter();
      }
      @Override
      public Adapter caseFnode(Fnode object)
      {
        return createFnodeAdapter();
      }
      @Override
      public Adapter caseFeature_decl_attribute(Feature_decl_attribute object)
      {
        return createFeature_decl_attributeAdapter();
      }
      @Override
      public Adapter caseFeature_decl_constraint(Feature_decl_constraint object)
      {
        return createFeature_decl_constraintAdapter();
      }
      @Override
      public Adapter caseMexp(Mexp object)
      {
        return createMexpAdapter();
      }
      @Override
      public Adapter caseFextension(Fextension object)
      {
        return createFextensionAdapter();
      }
      @Override
      public Adapter caseOr_expr(Or_expr object)
      {
        return createOr_exprAdapter();
      }
      @Override
      public Adapter caseAnd_expr(And_expr object)
      {
        return createAnd_exprAdapter();
      }
      @Override
      public Adapter caseEquality_expr(Equality_expr object)
      {
        return createEquality_exprAdapter();
      }
      @Override
      public Adapter caseComparison_expr(Comparison_expr object)
      {
        return createComparison_exprAdapter();
      }
      @Override
      public Adapter casePlusOrMinus_expr(PlusOrMinus_expr object)
      {
        return createPlusOrMinus_exprAdapter();
      }
      @Override
      public Adapter caseMulDivOrMod_expr(MulDivOrMod_expr object)
      {
        return createMulDivOrMod_exprAdapter();
      }
      @Override
      public Adapter caseAndGuard(AndGuard object)
      {
        return createAndGuardAdapter();
      }
      @Override
      public Adapter caseAppOr_exp(AppOr_exp object)
      {
        return createAppOr_expAdapter();
      }
      @Override
      public Adapter caseAppAnd_exp(AppAnd_exp object)
      {
        return createAppAnd_expAdapter();
      }
      @Override
      public Adapter caseProductOr_expr(ProductOr_expr object)
      {
        return createProductOr_exprAdapter();
      }
      @Override
      public Adapter caseProductAnd_exp(ProductAnd_exp object)
      {
        return createProductAnd_expAdapter();
      }
      @Override
      public Adapter caseProductMinus_exp(ProductMinus_exp object)
      {
        return createProductMinus_expAdapter();
      }
      @Override
      public Adapter caseMexpOr_exp(MexpOr_exp object)
      {
        return createMexpOr_expAdapter();
      }
      @Override
      public Adapter caseMexpAnd_expr(MexpAnd_expr object)
      {
        return createMexpAnd_exprAdapter();
      }
      @Override
      public Adapter caseMexpImplies_expr(MexpImplies_expr object)
      {
        return createMexpImplies_exprAdapter();
      }
      @Override
      public Adapter caseMexpEquality_expr(MexpEquality_expr object)
      {
        return createMexpEquality_exprAdapter();
      }
      @Override
      public Adapter caseMexpComparison_expr(MexpComparison_expr object)
      {
        return createMexpComparison_exprAdapter();
      }
      @Override
      public Adapter caseMexpPlusOrMinus_expr(MexpPlusOrMinus_expr object)
      {
        return createMexpPlusOrMinus_exprAdapter();
      }
      @Override
      public Adapter caseMexpMulDivOrMod_expr(MexpMulDivOrMod_expr object)
      {
        return createMexpMulDivOrMod_exprAdapter();
      }
      @Override
      public Adapter caseMexpPrimary_expr(MexpPrimary_expr object)
      {
        return createMexpPrimary_exprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Compilation_Unit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Compilation_Unit
   * @generated
   */
  public Adapter createCompilation_UnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Module_decl <em>Module decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Module_decl
   * @generated
   */
  public Adapter createModule_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Module_export <em>Module export</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Module_export
   * @generated
   */
  public Adapter createModule_exportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Module_import <em>Module import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Module_import
   * @generated
   */
  public Adapter createModule_importAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Decl
   * @generated
   */
  public Adapter createDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Par_function_decl <em>Par function decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Par_function_decl
   * @generated
   */
  public Adapter createPar_function_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_name_list <em>Function name list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_name_list
   * @generated
   */
  public Adapter createFunction_name_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_name_decl <em>Function name decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_name_decl
   * @generated
   */
  public Adapter createFunction_name_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.DataType_decl <em>Data Type decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.DataType_decl
   * @generated
   */
  public Adapter createDataType_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Data_constructor <em>Data constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Data_constructor
   * @generated
   */
  public Adapter createData_constructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Data_constructor_arg <em>Data constructor arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Data_constructor_arg
   * @generated
   */
  public Adapter createData_constructor_argAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Annotations
   * @generated
   */
  public Adapter createAnnotationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Type_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Type_use
   * @generated
   */
  public Adapter createType_useAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Pure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Pure_exp
   * @generated
   */
  public Adapter createPure_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Var_or_field_ref <em>Var or field ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Var_or_field_ref
   * @generated
   */
  public Adapter createVar_or_field_refAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Case_branch <em>Case branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Case_branch
   * @generated
   */
  public Adapter createCase_branchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Pure_exp_list <em>Pure exp list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Pure_exp_list
   * @generated
   */
  public Adapter createPure_exp_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_list <em>Function list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_list
   * @generated
   */
  public Adapter createFunction_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_param <em>Function param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_param
   * @generated
   */
  public Adapter createFunction_paramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_name_param_decl <em>Function name param decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_name_param_decl
   * @generated
   */
  public Adapter createFunction_name_param_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Anon_function_decl <em>Anon function decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Anon_function_decl
   * @generated
   */
  public Adapter createAnon_function_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Param_list <em>Param list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Param_list
   * @generated
   */
  public Adapter createParam_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Param_decl <em>Param decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Param_decl
   * @generated
   */
  public Adapter createParam_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Type_exp <em>Type exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Type_exp
   * @generated
   */
  public Adapter createType_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Function_decl <em>Function decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Function_decl
   * @generated
   */
  public Adapter createFunction_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Typesyn_decl <em>Typesyn decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Typesyn_decl
   * @generated
   */
  public Adapter createTypesyn_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Exception_decl <em>Exception decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Exception_decl
   * @generated
   */
  public Adapter createException_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Interface_decl <em>Interface decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Interface_decl
   * @generated
   */
  public Adapter createInterface_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Interface_name <em>Interface name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Interface_name
   * @generated
   */
  public Adapter createInterface_nameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Methodsig <em>Methodsig</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Methodsig
   * @generated
   */
  public Adapter createMethodsigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Class_decl <em>Class decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Class_decl
   * @generated
   */
  public Adapter createClass_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Field_decl <em>Field decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Field_decl
   * @generated
   */
  public Adapter createField_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Stmt
   * @generated
   */
  public Adapter createStmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Eff_expr <em>Eff expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Eff_expr
   * @generated
   */
  public Adapter createEff_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Delta_id <em>Delta id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Delta_id
   * @generated
   */
  public Adapter createDelta_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Casestmtbranch <em>Casestmtbranch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Casestmtbranch
   * @generated
   */
  public Adapter createCasestmtbranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Trait_usage <em>Trait usage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Trait_usage
   * @generated
   */
  public Adapter createTrait_usageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Trait_expr <em>Trait expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Trait_expr
   * @generated
   */
  public Adapter createTrait_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Trait_oper <em>Trait oper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Trait_oper
   * @generated
   */
  public Adapter createTrait_operAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Trait_decl <em>Trait decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Trait_decl
   * @generated
   */
  public Adapter createTrait_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Main_block <em>Main block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Main_block
   * @generated
   */
  public Adapter createMain_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Delta_decl <em>Delta decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Delta_decl
   * @generated
   */
  public Adapter createDelta_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Delta_param <em>Delta param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Delta_param
   * @generated
   */
  public Adapter createDelta_paramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Has_condition <em>Has condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Has_condition
   * @generated
   */
  public Adapter createHas_conditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Delta_access <em>Delta access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Delta_access
   * @generated
   */
  public Adapter createDelta_accessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Module_modifier <em>Module modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Module_modifier
   * @generated
   */
  public Adapter createModule_modifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Functional_modifier <em>Functional modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Functional_modifier
   * @generated
   */
  public Adapter createFunctional_modifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.OO_modifier <em>OO modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.OO_modifier
   * @generated
   */
  public Adapter createOO_modifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Class_modifier_fragment <em>Class modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Class_modifier_fragment
   * @generated
   */
  public Adapter createClass_modifier_fragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Interface_modifier_fragment <em>Interface modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Interface_modifier_fragment
   * @generated
   */
  public Adapter createInterface_modifier_fragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Namespace_modifier <em>Namespace modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Namespace_modifier
   * @generated
   */
  public Adapter createNamespace_modifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Update_decl <em>Update decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Update_decl
   * @generated
   */
  public Adapter createUpdate_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Object_update <em>Object update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Object_update
   * @generated
   */
  public Adapter createObject_updateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Update_preamble_declaration <em>Update preamble declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Update_preamble_declaration
   * @generated
   */
  public Adapter createUpdate_preamble_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Object_update_assign_stmt <em>Object update assign stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Object_update_assign_stmt
   * @generated
   */
  public Adapter createObject_update_assign_stmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Productline_decl <em>Productline decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Productline_decl
   * @generated
   */
  public Adapter createProductline_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Delta_clause <em>Delta clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Delta_clause
   * @generated
   */
  public Adapter createDelta_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Deltaspec <em>Deltaspec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Deltaspec
   * @generated
   */
  public Adapter createDeltaspecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.After_condition <em>After condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.After_condition
   * @generated
   */
  public Adapter createAfter_conditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.From_condition <em>From condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.From_condition
   * @generated
   */
  public Adapter createFrom_conditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.When_condition <em>When condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.When_condition
   * @generated
   */
  public Adapter createWhen_conditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Application_condition <em>Application condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Application_condition
   * @generated
   */
  public Adapter createApplication_conditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Product_decl <em>Product decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Product_decl
   * @generated
   */
  public Adapter createProduct_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Product_expr <em>Product expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Product_expr
   * @generated
   */
  public Adapter createProduct_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Product_reconfiguration <em>Product reconfiguration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Product_reconfiguration
   * @generated
   */
  public Adapter createProduct_reconfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Feature_decl <em>Feature decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Feature_decl
   * @generated
   */
  public Adapter createFeature_declAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Feature_decl_group <em>Feature decl group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Feature_decl_group
   * @generated
   */
  public Adapter createFeature_decl_groupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Fnode <em>Fnode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Fnode
   * @generated
   */
  public Adapter createFnodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Feature_decl_attribute <em>Feature decl attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Feature_decl_attribute
   * @generated
   */
  public Adapter createFeature_decl_attributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Feature_decl_constraint <em>Feature decl constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Feature_decl_constraint
   * @generated
   */
  public Adapter createFeature_decl_constraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Mexp <em>Mexp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Mexp
   * @generated
   */
  public Adapter createMexpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Fextension <em>Fextension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Fextension
   * @generated
   */
  public Adapter createFextensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Or_expr <em>Or expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Or_expr
   * @generated
   */
  public Adapter createOr_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.And_expr <em>And expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.And_expr
   * @generated
   */
  public Adapter createAnd_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Equality_expr <em>Equality expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Equality_expr
   * @generated
   */
  public Adapter createEquality_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.Comparison_expr <em>Comparison expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.Comparison_expr
   * @generated
   */
  public Adapter createComparison_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.PlusOrMinus_expr <em>Plus Or Minus expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.PlusOrMinus_expr
   * @generated
   */
  public Adapter createPlusOrMinus_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MulDivOrMod_expr <em>Mul Div Or Mod expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MulDivOrMod_expr
   * @generated
   */
  public Adapter createMulDivOrMod_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.AndGuard <em>And Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.AndGuard
   * @generated
   */
  public Adapter createAndGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.AppOr_exp <em>App Or exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.AppOr_exp
   * @generated
   */
  public Adapter createAppOr_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.AppAnd_exp <em>App And exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.AppAnd_exp
   * @generated
   */
  public Adapter createAppAnd_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.ProductOr_expr <em>Product Or expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.ProductOr_expr
   * @generated
   */
  public Adapter createProductOr_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.ProductAnd_exp <em>Product And exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.ProductAnd_exp
   * @generated
   */
  public Adapter createProductAnd_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.ProductMinus_exp <em>Product Minus exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.ProductMinus_exp
   * @generated
   */
  public Adapter createProductMinus_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpOr_exp <em>Mexp Or exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpOr_exp
   * @generated
   */
  public Adapter createMexpOr_expAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpAnd_expr <em>Mexp And expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpAnd_expr
   * @generated
   */
  public Adapter createMexpAnd_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpImplies_expr <em>Mexp Implies expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpImplies_expr
   * @generated
   */
  public Adapter createMexpImplies_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpEquality_expr <em>Mexp Equality expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpEquality_expr
   * @generated
   */
  public Adapter createMexpEquality_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpComparison_expr <em>Mexp Comparison expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpComparison_expr
   * @generated
   */
  public Adapter createMexpComparison_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpPlusOrMinus_expr <em>Mexp Plus Or Minus expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpPlusOrMinus_expr
   * @generated
   */
  public Adapter createMexpPlusOrMinus_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpMulDivOrMod_expr <em>Mexp Mul Div Or Mod expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpMulDivOrMod_expr
   * @generated
   */
  public Adapter createMexpMulDivOrMod_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.abs.MexpPrimary_expr <em>Mexp Primary expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.abs.MexpPrimary_expr
   * @generated
   */
  public Adapter createMexpPrimary_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AbsAdapterFactory
