/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.abs.AbsFactory
 * @model kind="package"
 * @generated
 */
public interface AbsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "abs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Abs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "abs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AbsPackage eINSTANCE = org.xtext.abs.impl.AbsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.DomainModelImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Compilation_UnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Compilation_UnitImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getCompilation_Unit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__MODULE = DOMAIN_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delta Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__DELTA_DECL = DOMAIN_MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Update decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__UPDATE_DECL = DOMAIN_MODEL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Productline decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PRODUCTLINE_DECL = DOMAIN_MODEL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Product decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PRODUCT_DECL = DOMAIN_MODEL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Feature decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__FEATURE_DECL = DOMAIN_MODEL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Fextension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__FEXTENSION = DOMAIN_MODEL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = DOMAIN_MODEL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Module_declImpl <em>Module decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Module_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getModule_decl()
   * @generated
   */
  int MODULE_DECL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Module export</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL__MODULE_EXPORT = 1;

  /**
   * The feature id for the '<em><b>Module import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL__MODULE_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL__DECL = 3;

  /**
   * The feature id for the '<em><b>Main block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL__MAIN_BLOCK = 4;

  /**
   * The number of structural features of the '<em>Module decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DECL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Module_modifierImpl <em>Module modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Module_modifierImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getModule_modifier()
   * @generated
   */
  int MODULE_MODIFIER = 51;

  /**
   * The number of structural features of the '<em>Module modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_MODIFIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Namespace_modifierImpl <em>Namespace modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Namespace_modifierImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getNamespace_modifier()
   * @generated
   */
  int NAMESPACE_MODIFIER = 56;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_MODIFIER__STAR = MODULE_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Namespace modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_MODIFIER_FEATURE_COUNT = MODULE_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Module_exportImpl <em>Module export</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Module_exportImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getModule_export()
   * @generated
   */
  int MODULE_EXPORT = 3;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_EXPORT__STAR = NAMESPACE_MODIFIER__STAR;

  /**
   * The feature id for the '<em><b>Any Package</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_EXPORT__ANY_PACKAGE = NAMESPACE_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_EXPORT__IMPORTED_NAMESPACE = NAMESPACE_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Module export</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_EXPORT_FEATURE_COUNT = NAMESPACE_MODIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Module_importImpl <em>Module import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Module_importImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getModule_import()
   * @generated
   */
  int MODULE_IMPORT = 4;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_IMPORT__STAR = NAMESPACE_MODIFIER__STAR;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_IMPORT__IMPORTED_NAMESPACE = NAMESPACE_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_IMPORT__NAME = NAMESPACE_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Module import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_IMPORT_FEATURE_COUNT = NAMESPACE_MODIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.DeclImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDecl()
   * @generated
   */
  int DECL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Par_function_declImpl <em>Par function decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Par_function_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getPar_function_decl()
   * @generated
   */
  int PAR_FUNCTION_DECL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__TYPE_USE = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__P = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__FUNCTIONS = DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__PARAMS = DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL__E = DECL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Par function decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_FUNCTION_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_name_listImpl <em>Function name list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_name_listImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_list()
   * @generated
   */
  int FUNCTION_NAME_LIST = 7;

  /**
   * The feature id for the '<em><b>Function name decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_LIST__FUNCTION_NAME_DECL = 0;

  /**
   * The number of structural features of the '<em>Function name list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_name_declImpl <em>Function name decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_name_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_decl()
   * @generated
   */
  int FUNCTION_NAME_DECL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Function name decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.DataType_declImpl <em>Data Type decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.DataType_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDataType_decl()
   * @generated
   */
  int DATA_TYPE_DECL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL__P = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data constructor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL__DATA_CONSTRUCTOR = DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Data_constructorImpl <em>Data constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Data_constructorImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getData_constructor()
   * @generated
   */
  int DATA_CONSTRUCTOR = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTRUCTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Data constructor arg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG = 1;

  /**
   * The number of structural features of the '<em>Data constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTRUCTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Data_constructor_argImpl <em>Data constructor arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Data_constructor_argImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getData_constructor_arg()
   * @generated
   */
  int DATA_CONSTRUCTOR_ARG = 11;

  /**
   * The number of structural features of the '<em>Data constructor arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTRUCTOR_ARG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.AnnotationsImpl <em>Annotations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.AnnotationsImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAnnotations()
   * @generated
   */
  int ANNOTATIONS = 12;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS__ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Annotations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.AnnotationImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 13;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__PURE_EXP = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Type_useImpl <em>Type use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Type_useImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getType_use()
   * @generated
   */
  int TYPE_USE = 14;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE__PURE_EXP = DATA_CONSTRUCTOR_ARG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE__NAME = DATA_CONSTRUCTOR_ARG_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE__TYPE_USE = DATA_CONSTRUCTOR_ARG_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE_FEATURE_COUNT = DATA_CONSTRUCTOR_ARG_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.ExpImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getExp()
   * @generated
   */
  int EXP = 36;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Pure_expImpl <em>Pure exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Pure_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getPure_exp()
   * @generated
   */
  int PURE_EXP = 15;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__L = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__PURE_EXP_LIST = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__LIST = EXP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__FUNCTION_LIST = EXP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST = EXP_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__VARIADIC_EXP_LIST = EXP_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__IF = EXP_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__THEN = EXP_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__ELSE = EXP_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__CASE = EXP_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__CASEBRANCH = EXP_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__TYPE_USE = EXP_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__VALUE = EXP_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__I = EXP_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__B = EXP_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__OP = EXP_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__PURE_EXP = EXP_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__AWAIT = EXP_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP__VAL = EXP_FEATURE_COUNT + 18;

  /**
   * The number of structural features of the '<em>Pure exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 19;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Var_or_field_refImpl <em>Var or field ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Var_or_field_refImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getVar_or_field_ref()
   * @generated
   */
  int VAR_OR_FIELD_REF = 16;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__NAME = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF__REF = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var or field ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_OR_FIELD_REF_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Case_branchImpl <em>Case branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Case_branchImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getCase_branch()
   * @generated
   */
  int CASE_BRANCH = 17;

  /**
   * The number of structural features of the '<em>Case branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_BRANCH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.PatternImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 18;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PURE_EXP = CASE_BRANCH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PATTERN = CASE_BRANCH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = CASE_BRANCH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Pure_exp_listImpl <em>Pure exp list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Pure_exp_listImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getPure_exp_list()
   * @generated
   */
  int PURE_EXP_LIST = 19;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP_LIST__PURE_EXP = 0;

  /**
   * The number of structural features of the '<em>Pure exp list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PURE_EXP_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_listImpl <em>Function list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_listImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_list()
   * @generated
   */
  int FUNCTION_LIST = 20;

  /**
   * The feature id for the '<em><b>Function param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LIST__FUNCTION_PARAM = 0;

  /**
   * The number of structural features of the '<em>Function list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_paramImpl <em>Function param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_paramImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_param()
   * @generated
   */
  int FUNCTION_PARAM = 21;

  /**
   * The number of structural features of the '<em>Function param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_name_param_declImpl <em>Function name param decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_name_param_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_param_decl()
   * @generated
   */
  int FUNCTION_NAME_PARAM_DECL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_PARAM_DECL__VALUE = FUNCTION_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function name param decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_NAME_PARAM_DECL_FEATURE_COUNT = FUNCTION_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Anon_function_declImpl <em>Anon function decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Anon_function_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAnon_function_decl()
   * @generated
   */
  int ANON_FUNCTION_DECL = 23;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_DECL__PARAMS = FUNCTION_PARAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_DECL__PURE_EXP = FUNCTION_PARAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anon function decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANON_FUNCTION_DECL_FEATURE_COUNT = FUNCTION_PARAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Param_listImpl <em>Param list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Param_listImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getParam_list()
   * @generated
   */
  int PARAM_LIST = 24;

  /**
   * The feature id for the '<em><b>Param decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_LIST__PARAM_DECL = 0;

  /**
   * The number of structural features of the '<em>Param list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Delta_paramImpl <em>Delta param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Delta_paramImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_param()
   * @generated
   */
  int DELTA_PARAM = 48;

  /**
   * The number of structural features of the '<em>Delta param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Param_declImpl <em>Param decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Param_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getParam_decl()
   * @generated
   */
  int PARAM_DECL = 25;

  /**
   * The feature id for the '<em><b>Type exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL__TYPE_EXP = DELTA_PARAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL__NAME = DELTA_PARAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Param decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL_FEATURE_COUNT = DELTA_PARAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Update_preamble_declarationImpl <em>Update preamble declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Update_preamble_declarationImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getUpdate_preamble_declaration()
   * @generated
   */
  int UPDATE_PREAMBLE_DECLARATION = 59;

  /**
   * The number of structural features of the '<em>Update preamble declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_PREAMBLE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Type_expImpl <em>Type exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Type_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getType_exp()
   * @generated
   */
  int TYPE_EXP = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXP__NAME = UPDATE_PREAMBLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXP__P = UPDATE_PREAMBLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_EXP_FEATURE_COUNT = UPDATE_PREAMBLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Function_declImpl <em>Function decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Function_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_decl()
   * @generated
   */
  int FUNCTION_DECL = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__TYPE_USE = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__P = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__PARAMLIST = DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL__PURE_EXP = DECL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Function decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Typesyn_declImpl <em>Typesyn decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Typesyn_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getTypesyn_decl()
   * @generated
   */
  int TYPESYN_DECL = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESYN_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESYN_DECL__TYPE_USE = DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typesyn decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPESYN_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Exception_declImpl <em>Exception decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Exception_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getException_decl()
   * @generated
   */
  int EXCEPTION_DECL = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECL__TYPE = DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exception decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Interface_declImpl <em>Interface decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Interface_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_decl()
   * @generated
   */
  int INTERFACE_DECL = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Interface name</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__INTERFACE_NAME = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL__METHODSIG = DECL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Interface_nameImpl <em>Interface name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Interface_nameImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_name()
   * @generated
   */
  int INTERFACE_NAME = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Interface name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Class_modifier_fragmentImpl <em>Class modifier fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Class_modifier_fragmentImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getClass_modifier_fragment()
   * @generated
   */
  int CLASS_MODIFIER_FRAGMENT = 54;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MODIFIER_FRAGMENT__METHODSIG = 0;

  /**
   * The number of structural features of the '<em>Class modifier fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MethodsigImpl <em>Methodsig</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MethodsigImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMethodsig()
   * @generated
   */
  int METHODSIG = 32;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODSIG__METHODSIG = CLASS_MODIFIER_FRAGMENT__METHODSIG;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODSIG__TYPE_USE = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODSIG__NAME = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODSIG__PARAMLIST = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Methodsig</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODSIG_FEATURE_COUNT = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Class_declImpl <em>Class decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Class_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getClass_decl()
   * @generated
   */
  int CLASS_DECL = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__PARAMLIST = DECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface name</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__INTERFACE_NAME = DECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__FIELD_DECL = DECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__STMT = DECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Casestmtbranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__CASESTMTBRANCH = DECL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Trait usage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__TRAIT_USAGE = DECL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL__METHOD = DECL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Class decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Field_declImpl <em>Field decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Field_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getField_decl()
   * @generated
   */
  int FIELD_DECL = 34;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__METHODSIG = CLASS_MODIFIER_FRAGMENT__METHODSIG;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__TYPE_USE = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__NAME = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__PURE_EXP = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Field decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL_FEATURE_COUNT = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.StmtImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getStmt()
   * @generated
   */
  int STMT = 35;

  /**
   * The feature id for the '<em><b>Type exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__TYPE_EXP = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__NAME = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__EXP = 2;

  /**
   * The feature id for the '<em><b>Var or field ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__VAR_OR_FIELD_REF = 3;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__STMT = 4;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__PURE_EXP = 5;

  /**
   * The feature id for the '<em><b>Ifstmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__IFSTMT = 6;

  /**
   * The feature id for the '<em><b>Elsestmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__ELSESTMT = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__CONDITION = 8;

  /**
   * The feature id for the '<em><b>Whilestmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__WHILESTMT = 9;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__L = 10;

  /**
   * The feature id for the '<em><b>Foreachstmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__FOREACHSTMT = 11;

  /**
   * The feature id for the '<em><b>Trystmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__TRYSTMT = 12;

  /**
   * The feature id for the '<em><b>Casestmtbranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__CASESTMTBRANCH = 13;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__REF = 14;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__F = 15;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__T = 16;

  /**
   * The feature id for the '<em><b>Throw Pure Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__THROW_PURE_EXP = 17;

  /**
   * The feature id for the '<em><b>Die Pure Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__DIE_PURE_EXP = 18;

  /**
   * The feature id for the '<em><b>Move Cog To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__MOVE_COG_TO = 19;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT__C = 20;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 21;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Eff_exprImpl <em>Eff expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Eff_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getEff_expr()
   * @generated
   */
  int EFF_EXPR = 37;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFF_EXPR__L = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFF_EXPR__PURE_EXP_LIST = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFF_EXPR__LIST = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Eff expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFF_EXPR_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Delta_idImpl <em>Delta id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Delta_idImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_id()
   * @generated
   */
  int DELTA_ID = 38;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ID__L = EFF_EXPR__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ID__PURE_EXP_LIST = EFF_EXPR__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ID__LIST = EFF_EXPR__LIST;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ID__NAME = EFF_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delta id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ID_FEATURE_COUNT = EFF_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.GuardImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 39;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__REF = 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__MIN = 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__MAX = 2;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__GUARD = 3;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.CasestmtbranchImpl <em>Casestmtbranch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.CasestmtbranchImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getCasestmtbranch()
   * @generated
   */
  int CASESTMTBRANCH = 40;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASESTMTBRANCH__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASESTMTBRANCH__STMT = 1;

  /**
   * The number of structural features of the '<em>Casestmtbranch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASESTMTBRANCH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Trait_usageImpl <em>Trait usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Trait_usageImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_usage()
   * @generated
   */
  int TRAIT_USAGE = 41;

  /**
   * The feature id for the '<em><b>Trait Usage</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_USAGE__TRAIT_USAGE = 0;

  /**
   * The number of structural features of the '<em>Trait usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_USAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Trait_exprImpl <em>Trait expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Trait_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_expr()
   * @generated
   */
  int TRAIT_EXPR = 42;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__METHODSIG = CLASS_MODIFIER_FRAGMENT__METHODSIG;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__METHOD = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trait Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__TRAIT_METHOD = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Trait Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__TRAIT_NAME = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__OP = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Trait expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR__TRAIT_EXPR = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Trait expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_EXPR_FEATURE_COUNT = CLASS_MODIFIER_FRAGMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Trait_operImpl <em>Trait oper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Trait_operImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_oper()
   * @generated
   */
  int TRAIT_OPER = 43;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPER__METHOD = 0;

  /**
   * The feature id for the '<em><b>Methodsig</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPER__METHODSIG = 1;

  /**
   * The feature id for the '<em><b>Trait expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPER__TRAIT_EXPR = 2;

  /**
   * The feature id for the '<em><b>Trait exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPER__TRAIT_EXP = 3;

  /**
   * The number of structural features of the '<em>Trait oper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MethodImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 44;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE_USE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMLIST = 2;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__STMT = 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Trait_declImpl <em>Trait decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Trait_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_decl()
   * @generated
   */
  int TRAIT_DECL = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_DECL__NAME = DECL__NAME;

  /**
   * The feature id for the '<em><b>Trait Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_DECL__TRAIT_EXPR = DECL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Trait decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Main_blockImpl <em>Main block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Main_blockImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMain_block()
   * @generated
   */
  int MAIN_BLOCK = 46;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BLOCK__STMT = 0;

  /**
   * The number of structural features of the '<em>Main block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Delta_declImpl <em>Delta decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Delta_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_decl()
   * @generated
   */
  int DELTA_DECL = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_DECL__P = 1;

  /**
   * The feature id for the '<em><b>Delta access</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_DECL__DELTA_ACCESS = 2;

  /**
   * The feature id for the '<em><b>Module modifier</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_DECL__MODULE_MODIFIER = 3;

  /**
   * The number of structural features of the '<em>Delta decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Has_conditionImpl <em>Has condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Has_conditionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getHas_condition()
   * @generated
   */
  int HAS_CONDITION = 49;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CONDITION__FIELD = DELTA_PARAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CONDITION__METHOD = DELTA_PARAM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CONDITION__INTERFACE = DELTA_PARAM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_CONDITION_FEATURE_COUNT = DELTA_PARAM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Delta_accessImpl <em>Delta access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Delta_accessImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_access()
   * @generated
   */
  int DELTA_ACCESS = 50;

  /**
   * The feature id for the '<em><b>Module ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ACCESS__MODULE_REF = 0;

  /**
   * The number of structural features of the '<em>Delta access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ACCESS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Functional_modifierImpl <em>Functional modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Functional_modifierImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFunctional_modifier()
   * @generated
   */
  int FUNCTIONAL_MODIFIER = 52;

  /**
   * The number of structural features of the '<em>Functional modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_MODIFIER_FEATURE_COUNT = MODULE_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.OO_modifierImpl <em>OO modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.OO_modifierImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getOO_modifier()
   * @generated
   */
  int OO_MODIFIER = 53;

  /**
   * The feature id for the '<em><b>Class decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__CLASS_DECL = MODULE_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__INTERFACE_DECL = MODULE_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__CLASS = MODULE_MODIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Inteface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__INTEFACE = MODULE_MODIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Interface Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__INTERFACE_NAME = MODULE_MODIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Removed Interface</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__REMOVED_INTERFACE = MODULE_MODIFIER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Class modifier fragment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__CLASS_MODIFIER_FRAGMENT = MODULE_MODIFIER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__INTERFACE = MODULE_MODIFIER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Interface modifier fragment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT = MODULE_MODIFIER_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>OO modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OO_MODIFIER_FEATURE_COUNT = MODULE_MODIFIER_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Interface_modifier_fragmentImpl <em>Interface modifier fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Interface_modifier_fragmentImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_modifier_fragment()
   * @generated
   */
  int INTERFACE_MODIFIER_FRAGMENT = 55;

  /**
   * The number of structural features of the '<em>Interface modifier fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_MODIFIER_FRAGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Update_declImpl <em>Update decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Update_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getUpdate_decl()
   * @generated
   */
  int UPDATE_DECL = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Object update</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DECL__OBJECT_UPDATE = 1;

  /**
   * The number of structural features of the '<em>Update decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Object_updateImpl <em>Object update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Object_updateImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getObject_update()
   * @generated
   */
  int OBJECT_UPDATE = 58;

  /**
   * The feature id for the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE__GUARD = 0;

  /**
   * The feature id for the '<em><b>Update preamble declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE__PRE = 2;

  /**
   * The feature id for the '<em><b>Post</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE__POST = 3;

  /**
   * The number of structural features of the '<em>Object update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Object_update_assign_stmtImpl <em>Object update assign stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Object_update_assign_stmtImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getObject_update_assign_stmt()
   * @generated
   */
  int OBJECT_UPDATE_ASSIGN_STMT = 60;

  /**
   * The feature id for the '<em><b>Var or field ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE_ASSIGN_STMT__EXP = 1;

  /**
   * The number of structural features of the '<em>Object update assign stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UPDATE_ASSIGN_STMT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Productline_declImpl <em>Productline decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Productline_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProductline_decl()
   * @generated
   */
  int PRODUCTLINE_DECL = 61;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTLINE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTLINE_DECL__FEATURE = 1;

  /**
   * The feature id for the '<em><b>Delta clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTLINE_DECL__DELTA_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Productline decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTLINE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.FeatureImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 62;

  /**
   * The feature id for the '<em><b>Feature decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURE_DECL = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__P = 1;

  /**
   * The feature id for the '<em><b>Attr assignment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ATTR_ASSIGNMENT = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Delta_clauseImpl <em>Delta clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Delta_clauseImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_clause()
   * @generated
   */
  int DELTA_CLAUSE = 63;

  /**
   * The feature id for the '<em><b>Deltaspec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CLAUSE__DELTASPEC = 0;

  /**
   * The feature id for the '<em><b>After condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CLAUSE__AFTER_CONDITION = 1;

  /**
   * The feature id for the '<em><b>From condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CLAUSE__FROM_CONDITION = 2;

  /**
   * The feature id for the '<em><b>When condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CLAUSE__WHEN_CONDITION = 3;

  /**
   * The number of structural features of the '<em>Delta clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_CLAUSE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.DeltaspecImpl <em>Deltaspec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.DeltaspecImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getDeltaspec()
   * @generated
   */
  int DELTASPEC = 64;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTASPEC__NAME = 0;

  /**
   * The feature id for the '<em><b>Deltaspec param</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTASPEC__DELTASPEC_PARAM = 1;

  /**
   * The number of structural features of the '<em>Deltaspec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTASPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.After_conditionImpl <em>After condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.After_conditionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAfter_condition()
   * @generated
   */
  int AFTER_CONDITION = 65;

  /**
   * The feature id for the '<em><b>Delta id</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_CONDITION__DELTA_ID = 0;

  /**
   * The number of structural features of the '<em>After condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.From_conditionImpl <em>From condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.From_conditionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFrom_condition()
   * @generated
   */
  int FROM_CONDITION = 66;

  /**
   * The feature id for the '<em><b>Application condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CONDITION__APPLICATION_CONDITION = 0;

  /**
   * The number of structural features of the '<em>From condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.When_conditionImpl <em>When condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.When_conditionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getWhen_condition()
   * @generated
   */
  int WHEN_CONDITION = 67;

  /**
   * The feature id for the '<em><b>Application condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CONDITION__APPLICATION_CONDITION = 0;

  /**
   * The number of structural features of the '<em>When condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Application_conditionImpl <em>Application condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Application_conditionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getApplication_condition()
   * @generated
   */
  int APPLICATION_CONDITION = 68;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION__OPERAND = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION__FEATURE = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION__LEFT = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION__RIGHT = 3;

  /**
   * The number of structural features of the '<em>Application condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Product_declImpl <em>Product decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Product_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_decl()
   * @generated
   */
  int PRODUCT_DECL = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_DECL__FEATURE = 1;

  /**
   * The feature id for the '<em><b>Product reconfiguration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_DECL__PRODUCT_RECONFIGURATION = 2;

  /**
   * The feature id for the '<em><b>Product expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_DECL__PRODUCT_EXPR = 3;

  /**
   * The number of structural features of the '<em>Product decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Product_exprImpl <em>Product expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Product_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_expr()
   * @generated
   */
  int PRODUCT_EXPR = 70;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_EXPR__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Product Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_EXPR__PRODUCT_DECL = 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_EXPR__LEFT = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_EXPR__RIGHT = 3;

  /**
   * The number of structural features of the '<em>Product expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_EXPR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Product_reconfigurationImpl <em>Product reconfiguration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Product_reconfigurationImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_reconfiguration()
   * @generated
   */
  int PRODUCT_RECONFIGURATION = 71;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_RECONFIGURATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Delta id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_RECONFIGURATION__DELTA_ID = 1;

  /**
   * The feature id for the '<em><b>Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_RECONFIGURATION__UPDATE = 2;

  /**
   * The number of structural features of the '<em>Product reconfiguration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_RECONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.FnodeImpl <em>Fnode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.FnodeImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFnode()
   * @generated
   */
  int FNODE = 74;

  /**
   * The number of structural features of the '<em>Fnode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FNODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Feature_declImpl <em>Feature decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Feature_declImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl()
   * @generated
   */
  int FEATURE_DECL = 72;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__NAME = FNODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature decl group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__FEATURE_DECL_GROUP = FNODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Feature decl attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__FEATURE_DECL_ATTRIBUTE = FNODE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Feature decl constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL__FEATURE_DECL_CONSTRAINT = FNODE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Feature decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_FEATURE_COUNT = FNODE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Feature_decl_groupImpl <em>Feature decl group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Feature_decl_groupImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_group()
   * @generated
   */
  int FEATURE_DECL_GROUP = 73;

  /**
   * The feature id for the '<em><b>Fnode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_GROUP__FNODE = 0;

  /**
   * The number of structural features of the '<em>Feature decl group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Feature_decl_attributeImpl <em>Feature decl attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Feature_decl_attributeImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_attribute()
   * @generated
   */
  int FEATURE_DECL_ATTRIBUTE = 75;

  /**
   * The feature id for the '<em><b>Boundary val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL = 0;

  /**
   * The feature id for the '<em><b>LBoundary int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT = 1;

  /**
   * The feature id for the '<em><b>UBoundary int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT = 2;

  /**
   * The number of structural features of the '<em>Feature decl attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Feature_decl_constraintImpl <em>Feature decl constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Feature_decl_constraintImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_constraint()
   * @generated
   */
  int FEATURE_DECL_CONSTRAINT = 76;

  /**
   * The feature id for the '<em><b>Mexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_CONSTRAINT__MEXP = 0;

  /**
   * The number of structural features of the '<em>Feature decl constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DECL_CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpImpl <em>Mexp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexp()
   * @generated
   */
  int MEXP = 77;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP__VALUE = 0;

  /**
   * The number of structural features of the '<em>Mexp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.FextensionImpl <em>Fextension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.FextensionImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getFextension()
   * @generated
   */
  int FEXTENSION = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEXTENSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Feature decl group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEXTENSION__FEATURE_DECL_GROUP = 1;

  /**
   * The feature id for the '<em><b>Feature decl attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEXTENSION__FEATURE_DECL_ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Feature decl constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEXTENSION__FEATURE_DECL_CONSTRAINT = 3;

  /**
   * The number of structural features of the '<em>Fextension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEXTENSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Or_exprImpl <em>Or expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Or_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getOr_expr()
   * @generated
   */
  int OR_EXPR = 79;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.And_exprImpl <em>And expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.And_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAnd_expr()
   * @generated
   */
  int AND_EXPR = 80;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Equality_exprImpl <em>Equality expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Equality_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getEquality_expr()
   * @generated
   */
  int EQUALITY_EXPR = 81;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equality expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.Comparison_exprImpl <em>Comparison expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.Comparison_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getComparison_expr()
   * @generated
   */
  int COMPARISON_EXPR = 82;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Comparison expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.PlusOrMinus_exprImpl <em>Plus Or Minus expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.PlusOrMinus_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getPlusOrMinus_expr()
   * @generated
   */
  int PLUS_OR_MINUS_EXPR = 83;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus Or Minus expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MulDivOrMod_exprImpl <em>Mul Div Or Mod expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MulDivOrMod_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMulDivOrMod_expr()
   * @generated
   */
  int MUL_DIV_OR_MOD_EXPR = 84;

  /**
   * The feature id for the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__L = PURE_EXP__L;

  /**
   * The feature id for the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__PURE_EXP_LIST = PURE_EXP__PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__LIST = PURE_EXP__LIST;

  /**
   * The feature id for the '<em><b>Function list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__FUNCTION_LIST = PURE_EXP__FUNCTION_LIST;

  /**
   * The feature id for the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__PARTIAL_FUNCTION_PURE_EXP_LIST = PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST;

  /**
   * The feature id for the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__VARIADIC_EXP_LIST = PURE_EXP__VARIADIC_EXP_LIST;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__IF = PURE_EXP__IF;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__THEN = PURE_EXP__THEN;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__ELSE = PURE_EXP__ELSE;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__CASE = PURE_EXP__CASE;

  /**
   * The feature id for the '<em><b>Casebranch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__CASEBRANCH = PURE_EXP__CASEBRANCH;

  /**
   * The feature id for the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__TYPE_USE = PURE_EXP__TYPE_USE;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__VALUE = PURE_EXP__VALUE;

  /**
   * The feature id for the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__I = PURE_EXP__I;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__B = PURE_EXP__B;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__OP = PURE_EXP__OP;

  /**
   * The feature id for the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__PURE_EXP = PURE_EXP__PURE_EXP;

  /**
   * The feature id for the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__AWAIT = PURE_EXP__AWAIT;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__VAL = PURE_EXP__VAL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__LEFT = PURE_EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR__RIGHT = PURE_EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mul Div Or Mod expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_DIV_OR_MOD_EXPR_FEATURE_COUNT = PURE_EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.AndGuardImpl <em>And Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.AndGuardImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAndGuard()
   * @generated
   */
  int AND_GUARD = 85;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__REF = GUARD__REF;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__MIN = GUARD__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__MAX = GUARD__MAX;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__GUARD = GUARD__GUARD;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__LEFT = GUARD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__OP = GUARD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD__RIGHT = GUARD_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.AppOr_expImpl <em>App Or exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.AppOr_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAppOr_exp()
   * @generated
   */
  int APP_OR_EXP = 86;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_OR_EXP__OPERAND = APPLICATION_CONDITION__OPERAND;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_OR_EXP__FEATURE = APPLICATION_CONDITION__FEATURE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_OR_EXP__LEFT = APPLICATION_CONDITION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_OR_EXP__RIGHT = APPLICATION_CONDITION__RIGHT;

  /**
   * The number of structural features of the '<em>App Or exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_OR_EXP_FEATURE_COUNT = APPLICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.AppAnd_expImpl <em>App And exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.AppAnd_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getAppAnd_exp()
   * @generated
   */
  int APP_AND_EXP = 87;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_AND_EXP__OPERAND = APPLICATION_CONDITION__OPERAND;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_AND_EXP__FEATURE = APPLICATION_CONDITION__FEATURE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_AND_EXP__LEFT = APPLICATION_CONDITION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_AND_EXP__RIGHT = APPLICATION_CONDITION__RIGHT;

  /**
   * The number of structural features of the '<em>App And exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APP_AND_EXP_FEATURE_COUNT = APPLICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.ProductOr_exprImpl <em>Product Or expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.ProductOr_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProductOr_expr()
   * @generated
   */
  int PRODUCT_OR_EXPR = 88;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_OR_EXPR__FEATURE = PRODUCT_EXPR__FEATURE;

  /**
   * The feature id for the '<em><b>Product Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_OR_EXPR__PRODUCT_DECL = PRODUCT_EXPR__PRODUCT_DECL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_OR_EXPR__LEFT = PRODUCT_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_OR_EXPR__RIGHT = PRODUCT_EXPR__RIGHT;

  /**
   * The number of structural features of the '<em>Product Or expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_OR_EXPR_FEATURE_COUNT = PRODUCT_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.ProductAnd_expImpl <em>Product And exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.ProductAnd_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProductAnd_exp()
   * @generated
   */
  int PRODUCT_AND_EXP = 89;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_AND_EXP__FEATURE = PRODUCT_EXPR__FEATURE;

  /**
   * The feature id for the '<em><b>Product Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_AND_EXP__PRODUCT_DECL = PRODUCT_EXPR__PRODUCT_DECL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_AND_EXP__LEFT = PRODUCT_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_AND_EXP__RIGHT = PRODUCT_EXPR__RIGHT;

  /**
   * The number of structural features of the '<em>Product And exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_AND_EXP_FEATURE_COUNT = PRODUCT_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.ProductMinus_expImpl <em>Product Minus exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.ProductMinus_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getProductMinus_exp()
   * @generated
   */
  int PRODUCT_MINUS_EXP = 90;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_MINUS_EXP__FEATURE = PRODUCT_EXPR__FEATURE;

  /**
   * The feature id for the '<em><b>Product Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_MINUS_EXP__PRODUCT_DECL = PRODUCT_EXPR__PRODUCT_DECL;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_MINUS_EXP__LEFT = PRODUCT_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_MINUS_EXP__RIGHT = PRODUCT_EXPR__RIGHT;

  /**
   * The number of structural features of the '<em>Product Minus exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_MINUS_EXP_FEATURE_COUNT = PRODUCT_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpOr_expImpl <em>Mexp Or exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpOr_expImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpOr_exp()
   * @generated
   */
  int MEXP_OR_EXP = 91;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_OR_EXP__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_OR_EXP__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_OR_EXP__RIGHT = MEXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mexp Or exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_OR_EXP_FEATURE_COUNT = MEXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpAnd_exprImpl <em>Mexp And expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpAnd_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpAnd_expr()
   * @generated
   */
  int MEXP_AND_EXPR = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_AND_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_AND_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_AND_EXPR__RIGHT = MEXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mexp And expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_AND_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpImplies_exprImpl <em>Mexp Implies expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpImplies_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpImplies_expr()
   * @generated
   */
  int MEXP_IMPLIES_EXPR = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_IMPLIES_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_IMPLIES_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_IMPLIES_EXPR__OP = MEXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_IMPLIES_EXPR__RIGHT = MEXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mexp Implies expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_IMPLIES_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpEquality_exprImpl <em>Mexp Equality expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpEquality_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpEquality_expr()
   * @generated
   */
  int MEXP_EQUALITY_EXPR = 94;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_EQUALITY_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_EQUALITY_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_EQUALITY_EXPR__OP = MEXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_EQUALITY_EXPR__RIGHT = MEXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mexp Equality expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_EQUALITY_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpComparison_exprImpl <em>Mexp Comparison expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpComparison_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpComparison_expr()
   * @generated
   */
  int MEXP_COMPARISON_EXPR = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_COMPARISON_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_COMPARISON_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_COMPARISON_EXPR__OP = MEXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_COMPARISON_EXPR__RIGHT = MEXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mexp Comparison expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_COMPARISON_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpPlusOrMinus_exprImpl <em>Mexp Plus Or Minus expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpPlusOrMinus_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpPlusOrMinus_expr()
   * @generated
   */
  int MEXP_PLUS_OR_MINUS_EXPR = 96;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PLUS_OR_MINUS_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PLUS_OR_MINUS_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PLUS_OR_MINUS_EXPR__OP = MEXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PLUS_OR_MINUS_EXPR__RIGHT = MEXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mexp Plus Or Minus expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PLUS_OR_MINUS_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpMulDivOrMod_exprImpl <em>Mexp Mul Div Or Mod expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpMulDivOrMod_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpMulDivOrMod_expr()
   * @generated
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR = 97;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR__LEFT = MEXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR__OP = MEXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR__RIGHT = MEXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mexp Mul Div Or Mod expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_MUL_DIV_OR_MOD_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.abs.impl.MexpPrimary_exprImpl <em>Mexp Primary expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.abs.impl.MexpPrimary_exprImpl
   * @see org.xtext.abs.impl.AbsPackageImpl#getMexpPrimary_expr()
   * @generated
   */
  int MEXP_PRIMARY_EXPR = 98;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PRIMARY_EXPR__VALUE = MEXP__VALUE;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PRIMARY_EXPR__A = MEXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mexp Primary expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEXP_PRIMARY_EXPR_FEATURE_COUNT = MEXP_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.abs.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.xtext.abs.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Compilation_Unit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see org.xtext.abs.Compilation_Unit
   * @generated
   */
  EClass getCompilation_Unit();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module</em>'.
   * @see org.xtext.abs.Compilation_Unit#getModule()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Module();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getDeltaDecl <em>Delta Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Delta Decl</em>'.
   * @see org.xtext.abs.Compilation_Unit#getDeltaDecl()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_DeltaDecl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getUpdate_decl <em>Update decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update decl</em>'.
   * @see org.xtext.abs.Compilation_Unit#getUpdate_decl()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Update_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Compilation_Unit#getProductline_decl <em>Productline decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Productline decl</em>'.
   * @see org.xtext.abs.Compilation_Unit#getProductline_decl()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Productline_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getProduct_decl <em>Product decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Product decl</em>'.
   * @see org.xtext.abs.Compilation_Unit#getProduct_decl()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Product_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getFeature_decl <em>Feature decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature decl</em>'.
   * @see org.xtext.abs.Compilation_Unit#getFeature_decl()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Feature_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Compilation_Unit#getFextension <em>Fextension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fextension</em>'.
   * @see org.xtext.abs.Compilation_Unit#getFextension()
   * @see #getCompilation_Unit()
   * @generated
   */
  EReference getCompilation_Unit_Fextension();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Module_decl <em>Module decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module decl</em>'.
   * @see org.xtext.abs.Module_decl
   * @generated
   */
  EClass getModule_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Module_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Module_decl#getName()
   * @see #getModule_decl()
   * @generated
   */
  EAttribute getModule_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Module_decl#getModule_export <em>Module export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module export</em>'.
   * @see org.xtext.abs.Module_decl#getModule_export()
   * @see #getModule_decl()
   * @generated
   */
  EReference getModule_decl_Module_export();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Module_decl#getModule_import <em>Module import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module import</em>'.
   * @see org.xtext.abs.Module_decl#getModule_import()
   * @see #getModule_decl()
   * @generated
   */
  EReference getModule_decl_Module_import();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Module_decl#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decl</em>'.
   * @see org.xtext.abs.Module_decl#getDecl()
   * @see #getModule_decl()
   * @generated
   */
  EReference getModule_decl_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Module_decl#getMain_block <em>Main block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Main block</em>'.
   * @see org.xtext.abs.Module_decl#getMain_block()
   * @see #getModule_decl()
   * @generated
   */
  EReference getModule_decl_Main_block();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Module_export <em>Module export</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module export</em>'.
   * @see org.xtext.abs.Module_export
   * @generated
   */
  EClass getModule_export();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Module_export#getAnyPackage <em>Any Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any Package</em>'.
   * @see org.xtext.abs.Module_export#getAnyPackage()
   * @see #getModule_export()
   * @generated
   */
  EAttribute getModule_export_AnyPackage();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Module_export#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Imported Namespace</em>'.
   * @see org.xtext.abs.Module_export#getImportedNamespace()
   * @see #getModule_export()
   * @generated
   */
  EAttribute getModule_export_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Module_import <em>Module import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module import</em>'.
   * @see org.xtext.abs.Module_import
   * @generated
   */
  EClass getModule_import();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Module_import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.abs.Module_import#getImportedNamespace()
   * @see #getModule_import()
   * @generated
   */
  EAttribute getModule_import_ImportedNamespace();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Module_import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.xtext.abs.Module_import#getName()
   * @see #getModule_import()
   * @generated
   */
  EAttribute getModule_import_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see org.xtext.abs.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Decl#getName()
   * @see #getDecl()
   * @generated
   */
  EAttribute getDecl_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Par_function_decl <em>Par function decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Par function decl</em>'.
   * @see org.xtext.abs.Par_function_decl
   * @generated
   */
  EClass getPar_function_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Par_function_decl#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Par_function_decl#getType_use()
   * @see #getPar_function_decl()
   * @generated
   */
  EReference getPar_function_decl_Type_use();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Par_function_decl#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>P</em>'.
   * @see org.xtext.abs.Par_function_decl#getP()
   * @see #getPar_function_decl()
   * @generated
   */
  EAttribute getPar_function_decl_P();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Par_function_decl#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functions</em>'.
   * @see org.xtext.abs.Par_function_decl#getFunctions()
   * @see #getPar_function_decl()
   * @generated
   */
  EReference getPar_function_decl_Functions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Par_function_decl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.xtext.abs.Par_function_decl#getParams()
   * @see #getPar_function_decl()
   * @generated
   */
  EReference getPar_function_decl_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Par_function_decl#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.xtext.abs.Par_function_decl#getE()
   * @see #getPar_function_decl()
   * @generated
   */
  EReference getPar_function_decl_E();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_name_list <em>Function name list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function name list</em>'.
   * @see org.xtext.abs.Function_name_list
   * @generated
   */
  EClass getFunction_name_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Function_name_list#getFunction_name_decl <em>Function name decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function name decl</em>'.
   * @see org.xtext.abs.Function_name_list#getFunction_name_decl()
   * @see #getFunction_name_list()
   * @generated
   */
  EReference getFunction_name_list_Function_name_decl();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_name_decl <em>Function name decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function name decl</em>'.
   * @see org.xtext.abs.Function_name_decl
   * @generated
   */
  EClass getFunction_name_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Function_name_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Function_name_decl#getName()
   * @see #getFunction_name_decl()
   * @generated
   */
  EAttribute getFunction_name_decl_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.DataType_decl <em>Data Type decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type decl</em>'.
   * @see org.xtext.abs.DataType_decl
   * @generated
   */
  EClass getDataType_decl();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.DataType_decl#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>P</em>'.
   * @see org.xtext.abs.DataType_decl#getP()
   * @see #getDataType_decl()
   * @generated
   */
  EAttribute getDataType_decl_P();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.DataType_decl#getData_constructor <em>Data constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data constructor</em>'.
   * @see org.xtext.abs.DataType_decl#getData_constructor()
   * @see #getDataType_decl()
   * @generated
   */
  EReference getDataType_decl_Data_constructor();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Data_constructor <em>Data constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data constructor</em>'.
   * @see org.xtext.abs.Data_constructor
   * @generated
   */
  EClass getData_constructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Data_constructor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Data_constructor#getName()
   * @see #getData_constructor()
   * @generated
   */
  EAttribute getData_constructor_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Data_constructor#getData_constructor_arg <em>Data constructor arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data constructor arg</em>'.
   * @see org.xtext.abs.Data_constructor#getData_constructor_arg()
   * @see #getData_constructor()
   * @generated
   */
  EReference getData_constructor_Data_constructor_arg();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Data_constructor_arg <em>Data constructor arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data constructor arg</em>'.
   * @see org.xtext.abs.Data_constructor_arg
   * @generated
   */
  EClass getData_constructor_arg();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotations</em>'.
   * @see org.xtext.abs.Annotations
   * @generated
   */
  EClass getAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Annotations#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.xtext.abs.Annotations#getAnnotation()
   * @see #getAnnotations()
   * @generated
   */
  EReference getAnnotations_Annotation();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.xtext.abs.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Annotation#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Annotation#getPure_exp()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Pure_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Type_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type use</em>'.
   * @see org.xtext.abs.Type_use
   * @generated
   */
  EClass getType_use();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Type_use#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Type_use#getName()
   * @see #getType_use()
   * @generated
   */
  EAttribute getType_use_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Type_use#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type use</em>'.
   * @see org.xtext.abs.Type_use#getType_use()
   * @see #getType_use()
   * @generated
   */
  EReference getType_use_Type_use();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Pure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pure exp</em>'.
   * @see org.xtext.abs.Pure_exp
   * @generated
   */
  EClass getPure_exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Pure_exp#getFunction_list <em>Function list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function list</em>'.
   * @see org.xtext.abs.Pure_exp#getFunction_list()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Function_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getPartial_function_pure_exp_list <em>Partial function pure exp list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Partial function pure exp list</em>'.
   * @see org.xtext.abs.Pure_exp#getPartial_function_pure_exp_list()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Partial_function_pure_exp_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getVariadic_exp_list <em>Variadic exp list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variadic exp list</em>'.
   * @see org.xtext.abs.Pure_exp#getVariadic_exp_list()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Variadic_exp_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.abs.Pure_exp#getIf()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_If();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.abs.Pure_exp#getThen()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.xtext.abs.Pure_exp#getElse()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Else();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see org.xtext.abs.Pure_exp#getCase()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Case();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Pure_exp#getCasebranch <em>Casebranch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casebranch</em>'.
   * @see org.xtext.abs.Pure_exp#getCasebranch()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Casebranch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Pure_exp#getType_use()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Type_use();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Pure_exp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.abs.Pure_exp#getValue()
   * @see #getPure_exp()
   * @generated
   */
  EAttribute getPure_exp_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>I</em>'.
   * @see org.xtext.abs.Pure_exp#getI()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_I();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.xtext.abs.Pure_exp#getB()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_B();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Pure_exp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.Pure_exp#getOp()
   * @see #getPure_exp()
   * @generated
   */
  EAttribute getPure_exp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pure_exp#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Pure_exp#getPure_exp()
   * @see #getPure_exp()
   * @generated
   */
  EReference getPure_exp_Pure_exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Pure_exp#getAwait <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Await</em>'.
   * @see org.xtext.abs.Pure_exp#getAwait()
   * @see #getPure_exp()
   * @generated
   */
  EAttribute getPure_exp_Await();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Pure_exp#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.abs.Pure_exp#getVal()
   * @see #getPure_exp()
   * @generated
   */
  EAttribute getPure_exp_Val();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Var_or_field_ref <em>Var or field ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var or field ref</em>'.
   * @see org.xtext.abs.Var_or_field_ref
   * @generated
   */
  EClass getVar_or_field_ref();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Var_or_field_ref#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Var_or_field_ref#getName()
   * @see #getVar_or_field_ref()
   * @generated
   */
  EAttribute getVar_or_field_ref_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Var_or_field_ref#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.abs.Var_or_field_ref#getRef()
   * @see #getVar_or_field_ref()
   * @generated
   */
  EReference getVar_or_field_ref_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Case_branch <em>Case branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case branch</em>'.
   * @see org.xtext.abs.Case_branch
   * @generated
   */
  EClass getCase_branch();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see org.xtext.abs.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Pattern#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Pattern#getPure_exp()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Pure_exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Pattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pattern</em>'.
   * @see org.xtext.abs.Pattern#getPattern()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Pattern();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Pure_exp_list <em>Pure exp list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pure exp list</em>'.
   * @see org.xtext.abs.Pure_exp_list
   * @generated
   */
  EClass getPure_exp_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Pure_exp_list#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pure exp</em>'.
   * @see org.xtext.abs.Pure_exp_list#getPure_exp()
   * @see #getPure_exp_list()
   * @generated
   */
  EReference getPure_exp_list_Pure_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_list <em>Function list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function list</em>'.
   * @see org.xtext.abs.Function_list
   * @generated
   */
  EClass getFunction_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Function_list#getFunction_param <em>Function param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function param</em>'.
   * @see org.xtext.abs.Function_list#getFunction_param()
   * @see #getFunction_list()
   * @generated
   */
  EReference getFunction_list_Function_param();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_param <em>Function param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function param</em>'.
   * @see org.xtext.abs.Function_param
   * @generated
   */
  EClass getFunction_param();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_name_param_decl <em>Function name param decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function name param decl</em>'.
   * @see org.xtext.abs.Function_name_param_decl
   * @generated
   */
  EClass getFunction_name_param_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Function_name_param_decl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.abs.Function_name_param_decl#getValue()
   * @see #getFunction_name_param_decl()
   * @generated
   */
  EAttribute getFunction_name_param_decl_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Anon_function_decl <em>Anon function decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anon function decl</em>'.
   * @see org.xtext.abs.Anon_function_decl
   * @generated
   */
  EClass getAnon_function_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Anon_function_decl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.xtext.abs.Anon_function_decl#getParams()
   * @see #getAnon_function_decl()
   * @generated
   */
  EReference getAnon_function_decl_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Anon_function_decl#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Anon_function_decl#getPure_exp()
   * @see #getAnon_function_decl()
   * @generated
   */
  EReference getAnon_function_decl_Pure_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Param_list <em>Param list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param list</em>'.
   * @see org.xtext.abs.Param_list
   * @generated
   */
  EClass getParam_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Param_list#getParam_decl <em>Param decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param decl</em>'.
   * @see org.xtext.abs.Param_list#getParam_decl()
   * @see #getParam_list()
   * @generated
   */
  EReference getParam_list_Param_decl();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Param_decl <em>Param decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param decl</em>'.
   * @see org.xtext.abs.Param_decl
   * @generated
   */
  EClass getParam_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Param_decl#getType_exp <em>Type exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type exp</em>'.
   * @see org.xtext.abs.Param_decl#getType_exp()
   * @see #getParam_decl()
   * @generated
   */
  EReference getParam_decl_Type_exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Param_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Param_decl#getName()
   * @see #getParam_decl()
   * @generated
   */
  EAttribute getParam_decl_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Type_exp <em>Type exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type exp</em>'.
   * @see org.xtext.abs.Type_exp
   * @generated
   */
  EClass getType_exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Type_exp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Type_exp#getName()
   * @see #getType_exp()
   * @generated
   */
  EAttribute getType_exp_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Type_exp#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P</em>'.
   * @see org.xtext.abs.Type_exp#getP()
   * @see #getType_exp()
   * @generated
   */
  EReference getType_exp_P();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Function_decl <em>Function decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function decl</em>'.
   * @see org.xtext.abs.Function_decl
   * @generated
   */
  EClass getFunction_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Function_decl#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Function_decl#getType_use()
   * @see #getFunction_decl()
   * @generated
   */
  EReference getFunction_decl_Type_use();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Function_decl#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>P</em>'.
   * @see org.xtext.abs.Function_decl#getP()
   * @see #getFunction_decl()
   * @generated
   */
  EAttribute getFunction_decl_P();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Function_decl#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see org.xtext.abs.Function_decl#getParamlist()
   * @see #getFunction_decl()
   * @generated
   */
  EReference getFunction_decl_Paramlist();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Function_decl#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Function_decl#getPure_exp()
   * @see #getFunction_decl()
   * @generated
   */
  EReference getFunction_decl_Pure_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Typesyn_decl <em>Typesyn decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typesyn decl</em>'.
   * @see org.xtext.abs.Typesyn_decl
   * @generated
   */
  EClass getTypesyn_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Typesyn_decl#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Typesyn_decl#getType_use()
   * @see #getTypesyn_decl()
   * @generated
   */
  EReference getTypesyn_decl_Type_use();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Exception_decl <em>Exception decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception decl</em>'.
   * @see org.xtext.abs.Exception_decl
   * @generated
   */
  EClass getException_decl();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Exception_decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see org.xtext.abs.Exception_decl#getType()
   * @see #getException_decl()
   * @generated
   */
  EReference getException_decl_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Interface_decl <em>Interface decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface decl</em>'.
   * @see org.xtext.abs.Interface_decl
   * @generated
   */
  EClass getInterface_decl();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Interface_decl#getInterface_name <em>Interface name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interface name</em>'.
   * @see org.xtext.abs.Interface_decl#getInterface_name()
   * @see #getInterface_decl()
   * @generated
   */
  EReference getInterface_decl_Interface_name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Interface_decl#getMethodsig <em>Methodsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methodsig</em>'.
   * @see org.xtext.abs.Interface_decl#getMethodsig()
   * @see #getInterface_decl()
   * @generated
   */
  EReference getInterface_decl_Methodsig();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Interface_name <em>Interface name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface name</em>'.
   * @see org.xtext.abs.Interface_name
   * @generated
   */
  EClass getInterface_name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Interface_name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Interface_name#getName()
   * @see #getInterface_name()
   * @generated
   */
  EAttribute getInterface_name_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Methodsig <em>Methodsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methodsig</em>'.
   * @see org.xtext.abs.Methodsig
   * @generated
   */
  EClass getMethodsig();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Methodsig#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Methodsig#getType_use()
   * @see #getMethodsig()
   * @generated
   */
  EReference getMethodsig_Type_use();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Methodsig#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Methodsig#getName()
   * @see #getMethodsig()
   * @generated
   */
  EAttribute getMethodsig_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Methodsig#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see org.xtext.abs.Methodsig#getParamlist()
   * @see #getMethodsig()
   * @generated
   */
  EReference getMethodsig_Paramlist();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Class_decl <em>Class decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class decl</em>'.
   * @see org.xtext.abs.Class_decl
   * @generated
   */
  EClass getClass_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Class_decl#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see org.xtext.abs.Class_decl#getParamlist()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Paramlist();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Class_decl#getInterface_name <em>Interface name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Interface name</em>'.
   * @see org.xtext.abs.Class_decl#getInterface_name()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Interface_name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_decl#getField_decl <em>Field decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field decl</em>'.
   * @see org.xtext.abs.Class_decl#getField_decl()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Field_decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_decl#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.xtext.abs.Class_decl#getStmt()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Stmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_decl#getCasestmtbranch <em>Casestmtbranch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casestmtbranch</em>'.
   * @see org.xtext.abs.Class_decl#getCasestmtbranch()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Casestmtbranch();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_decl#getTrait_usage <em>Trait usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trait usage</em>'.
   * @see org.xtext.abs.Class_decl#getTrait_usage()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Trait_usage();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_decl#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see org.xtext.abs.Class_decl#getMethod()
   * @see #getClass_decl()
   * @generated
   */
  EReference getClass_decl_Method();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Field_decl <em>Field decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field decl</em>'.
   * @see org.xtext.abs.Field_decl
   * @generated
   */
  EClass getField_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Field_decl#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Field_decl#getType_use()
   * @see #getField_decl()
   * @generated
   */
  EReference getField_decl_Type_use();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Field_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Field_decl#getName()
   * @see #getField_decl()
   * @generated
   */
  EAttribute getField_decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Field_decl#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Field_decl#getPure_exp()
   * @see #getField_decl()
   * @generated
   */
  EReference getField_decl_Pure_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see org.xtext.abs.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getType_exp <em>Type exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type exp</em>'.
   * @see org.xtext.abs.Stmt#getType_exp()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Type_exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Stmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Stmt#getName()
   * @see #getStmt()
   * @generated
   */
  EAttribute getStmt_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.abs.Stmt#getExp()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getVar_or_field_ref <em>Var or field ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var or field ref</em>'.
   * @see org.xtext.abs.Stmt#getVar_or_field_ref()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Var_or_field_ref();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Stmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.xtext.abs.Stmt#getStmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Stmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getPure_exp <em>Pure exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp</em>'.
   * @see org.xtext.abs.Stmt#getPure_exp()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Pure_exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getIfstmt <em>Ifstmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifstmt</em>'.
   * @see org.xtext.abs.Stmt#getIfstmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Ifstmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getElsestmt <em>Elsestmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsestmt</em>'.
   * @see org.xtext.abs.Stmt#getElsestmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Elsestmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.abs.Stmt#getCondition()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getWhilestmt <em>Whilestmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whilestmt</em>'.
   * @see org.xtext.abs.Stmt#getWhilestmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Whilestmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.abs.Stmt#getL()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getForeachstmt <em>Foreachstmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Foreachstmt</em>'.
   * @see org.xtext.abs.Stmt#getForeachstmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Foreachstmt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getTrystmt <em>Trystmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trystmt</em>'.
   * @see org.xtext.abs.Stmt#getTrystmt()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Trystmt();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Stmt#getCasestmtbranch <em>Casestmtbranch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casestmtbranch</em>'.
   * @see org.xtext.abs.Stmt#getCasestmtbranch()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Casestmtbranch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.abs.Stmt#getRef()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.xtext.abs.Stmt#getF()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_F();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.xtext.abs.Stmt#getT()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_T();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getThrowPureExp <em>Throw Pure Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throw Pure Exp</em>'.
   * @see org.xtext.abs.Stmt#getThrowPureExp()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_ThrowPureExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getDiePureExp <em>Die Pure Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Die Pure Exp</em>'.
   * @see org.xtext.abs.Stmt#getDiePureExp()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_DiePureExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getMoveCogTo <em>Move Cog To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Move Cog To</em>'.
   * @see org.xtext.abs.Stmt#getMoveCogTo()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_MoveCogTo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Stmt#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.xtext.abs.Stmt#getC()
   * @see #getStmt()
   * @generated
   */
  EReference getStmt_C();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see org.xtext.abs.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Eff_expr <em>Eff expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eff expr</em>'.
   * @see org.xtext.abs.Eff_expr
   * @generated
   */
  EClass getEff_expr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Eff_expr#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>L</em>'.
   * @see org.xtext.abs.Eff_expr#getL()
   * @see #getEff_expr()
   * @generated
   */
  EAttribute getEff_expr_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Eff_expr#getPure_exp_list <em>Pure exp list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pure exp list</em>'.
   * @see org.xtext.abs.Eff_expr#getPure_exp_list()
   * @see #getEff_expr()
   * @generated
   */
  EReference getEff_expr_Pure_exp_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Eff_expr#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see org.xtext.abs.Eff_expr#getList()
   * @see #getEff_expr()
   * @generated
   */
  EReference getEff_expr_List();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Delta_id <em>Delta id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta id</em>'.
   * @see org.xtext.abs.Delta_id
   * @generated
   */
  EClass getDelta_id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Delta_id#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Delta_id#getName()
   * @see #getDelta_id()
   * @generated
   */
  EAttribute getDelta_id_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see org.xtext.abs.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Guard#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.abs.Guard#getRef()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Guard#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see org.xtext.abs.Guard#getMin()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Min();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Guard#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see org.xtext.abs.Guard#getMax()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Max();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Guard#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.xtext.abs.Guard#getGuard()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Guard();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Casestmtbranch <em>Casestmtbranch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Casestmtbranch</em>'.
   * @see org.xtext.abs.Casestmtbranch
   * @generated
   */
  EClass getCasestmtbranch();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Casestmtbranch#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.xtext.abs.Casestmtbranch#getPattern()
   * @see #getCasestmtbranch()
   * @generated
   */
  EReference getCasestmtbranch_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Casestmtbranch#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see org.xtext.abs.Casestmtbranch#getStmt()
   * @see #getCasestmtbranch()
   * @generated
   */
  EReference getCasestmtbranch_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Trait_usage <em>Trait usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait usage</em>'.
   * @see org.xtext.abs.Trait_usage
   * @generated
   */
  EClass getTrait_usage();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Trait_usage#getTraitUsage <em>Trait Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Trait Usage</em>'.
   * @see org.xtext.abs.Trait_usage#getTraitUsage()
   * @see #getTrait_usage()
   * @generated
   */
  EReference getTrait_usage_TraitUsage();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Trait_expr <em>Trait expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait expr</em>'.
   * @see org.xtext.abs.Trait_expr
   * @generated
   */
  EClass getTrait_expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Trait_expr#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see org.xtext.abs.Trait_expr#getMethod()
   * @see #getTrait_expr()
   * @generated
   */
  EReference getTrait_expr_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_expr#getTraitMethod <em>Trait Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait Method</em>'.
   * @see org.xtext.abs.Trait_expr#getTraitMethod()
   * @see #getTrait_expr()
   * @generated
   */
  EReference getTrait_expr_TraitMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Trait_expr#getTraitName <em>Trait Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trait Name</em>'.
   * @see org.xtext.abs.Trait_expr#getTraitName()
   * @see #getTrait_expr()
   * @generated
   */
  EReference getTrait_expr_TraitName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see org.xtext.abs.Trait_expr#getOp()
   * @see #getTrait_expr()
   * @generated
   */
  EReference getTrait_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_expr#getTrait_expr <em>Trait expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait expr</em>'.
   * @see org.xtext.abs.Trait_expr#getTrait_expr()
   * @see #getTrait_expr()
   * @generated
   */
  EReference getTrait_expr_Trait_expr();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Trait_oper <em>Trait oper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait oper</em>'.
   * @see org.xtext.abs.Trait_oper
   * @generated
   */
  EClass getTrait_oper();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Trait_oper#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.xtext.abs.Trait_oper#getMethod()
   * @see #getTrait_oper()
   * @generated
   */
  EReference getTrait_oper_Method();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Trait_oper#getMethodsig <em>Methodsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Methodsig</em>'.
   * @see org.xtext.abs.Trait_oper#getMethodsig()
   * @see #getTrait_oper()
   * @generated
   */
  EReference getTrait_oper_Methodsig();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_oper#getTrait_expr <em>Trait expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait expr</em>'.
   * @see org.xtext.abs.Trait_oper#getTrait_expr()
   * @see #getTrait_oper()
   * @generated
   */
  EReference getTrait_oper_Trait_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_oper#getTrait_exp <em>Trait exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait exp</em>'.
   * @see org.xtext.abs.Trait_oper#getTrait_exp()
   * @see #getTrait_oper()
   * @generated
   */
  EReference getTrait_oper_Trait_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.abs.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Method#getType_use <em>Type use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type use</em>'.
   * @see org.xtext.abs.Method#getType_use()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type_use();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Method#getParamlist <em>Paramlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paramlist</em>'.
   * @see org.xtext.abs.Method#getParamlist()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Paramlist();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Method#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.xtext.abs.Method#getStmt()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Trait_decl <em>Trait decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait decl</em>'.
   * @see org.xtext.abs.Trait_decl
   * @generated
   */
  EClass getTrait_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Trait_decl#getTraitExpr <em>Trait Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trait Expr</em>'.
   * @see org.xtext.abs.Trait_decl#getTraitExpr()
   * @see #getTrait_decl()
   * @generated
   */
  EReference getTrait_decl_TraitExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Main_block <em>Main block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main block</em>'.
   * @see org.xtext.abs.Main_block
   * @generated
   */
  EClass getMain_block();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Main_block#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmt</em>'.
   * @see org.xtext.abs.Main_block#getStmt()
   * @see #getMain_block()
   * @generated
   */
  EReference getMain_block_Stmt();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Delta_decl <em>Delta decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta decl</em>'.
   * @see org.xtext.abs.Delta_decl
   * @generated
   */
  EClass getDelta_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Delta_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Delta_decl#getName()
   * @see #getDelta_decl()
   * @generated
   */
  EAttribute getDelta_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Delta_decl#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P</em>'.
   * @see org.xtext.abs.Delta_decl#getP()
   * @see #getDelta_decl()
   * @generated
   */
  EReference getDelta_decl_P();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Delta_decl#getDelta_access <em>Delta access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Delta access</em>'.
   * @see org.xtext.abs.Delta_decl#getDelta_access()
   * @see #getDelta_decl()
   * @generated
   */
  EReference getDelta_decl_Delta_access();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Delta_decl#getModule_modifier <em>Module modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module modifier</em>'.
   * @see org.xtext.abs.Delta_decl#getModule_modifier()
   * @see #getDelta_decl()
   * @generated
   */
  EReference getDelta_decl_Module_modifier();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Delta_param <em>Delta param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta param</em>'.
   * @see org.xtext.abs.Delta_param
   * @generated
   */
  EClass getDelta_param();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Has_condition <em>Has condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has condition</em>'.
   * @see org.xtext.abs.Has_condition
   * @generated
   */
  EClass getHas_condition();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Has_condition#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see org.xtext.abs.Has_condition#getField()
   * @see #getHas_condition()
   * @generated
   */
  EReference getHas_condition_Field();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Has_condition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Method</em>'.
   * @see org.xtext.abs.Has_condition#getMethod()
   * @see #getHas_condition()
   * @generated
   */
  EReference getHas_condition_Method();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Has_condition#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see org.xtext.abs.Has_condition#getInterface()
   * @see #getHas_condition()
   * @generated
   */
  EReference getHas_condition_Interface();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Delta_access <em>Delta access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta access</em>'.
   * @see org.xtext.abs.Delta_access
   * @generated
   */
  EClass getDelta_access();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Delta_access#getModule_ref <em>Module ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module ref</em>'.
   * @see org.xtext.abs.Delta_access#getModule_ref()
   * @see #getDelta_access()
   * @generated
   */
  EReference getDelta_access_Module_ref();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Module_modifier <em>Module modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module modifier</em>'.
   * @see org.xtext.abs.Module_modifier
   * @generated
   */
  EClass getModule_modifier();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Functional_modifier <em>Functional modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional modifier</em>'.
   * @see org.xtext.abs.Functional_modifier
   * @generated
   */
  EClass getFunctional_modifier();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.OO_modifier <em>OO modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OO modifier</em>'.
   * @see org.xtext.abs.OO_modifier
   * @generated
   */
  EClass getOO_modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.OO_modifier#getClass_decl <em>Class decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class decl</em>'.
   * @see org.xtext.abs.OO_modifier#getClass_decl()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Class_decl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.OO_modifier#getInterface_decl <em>Interface decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface decl</em>'.
   * @see org.xtext.abs.OO_modifier#getInterface_decl()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Interface_decl();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.OO_modifier#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class</em>'.
   * @see org.xtext.abs.OO_modifier#getClass_()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Class();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.OO_modifier#getInteface <em>Inteface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inteface</em>'.
   * @see org.xtext.abs.OO_modifier#getInteface()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Inteface();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.OO_modifier#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface Name</em>'.
   * @see org.xtext.abs.OO_modifier#getInterfaceName()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_InterfaceName();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.OO_modifier#getRemovedInterface <em>Removed Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Removed Interface</em>'.
   * @see org.xtext.abs.OO_modifier#getRemovedInterface()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_RemovedInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.OO_modifier#getClass_modifier_fragment <em>Class modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class modifier fragment</em>'.
   * @see org.xtext.abs.OO_modifier#getClass_modifier_fragment()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Class_modifier_fragment();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.OO_modifier#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see org.xtext.abs.OO_modifier#getInterface()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Interface();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.OO_modifier#getInterface_modifier_fragment <em>Interface modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface modifier fragment</em>'.
   * @see org.xtext.abs.OO_modifier#getInterface_modifier_fragment()
   * @see #getOO_modifier()
   * @generated
   */
  EReference getOO_modifier_Interface_modifier_fragment();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Class_modifier_fragment <em>Class modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class modifier fragment</em>'.
   * @see org.xtext.abs.Class_modifier_fragment
   * @generated
   */
  EClass getClass_modifier_fragment();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Class_modifier_fragment#getMethodsig <em>Methodsig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methodsig</em>'.
   * @see org.xtext.abs.Class_modifier_fragment#getMethodsig()
   * @see #getClass_modifier_fragment()
   * @generated
   */
  EReference getClass_modifier_fragment_Methodsig();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Interface_modifier_fragment <em>Interface modifier fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface modifier fragment</em>'.
   * @see org.xtext.abs.Interface_modifier_fragment
   * @generated
   */
  EClass getInterface_modifier_fragment();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Namespace_modifier <em>Namespace modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace modifier</em>'.
   * @see org.xtext.abs.Namespace_modifier
   * @generated
   */
  EClass getNamespace_modifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Namespace_modifier#getStar <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Star</em>'.
   * @see org.xtext.abs.Namespace_modifier#getStar()
   * @see #getNamespace_modifier()
   * @generated
   */
  EAttribute getNamespace_modifier_Star();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Update_decl <em>Update decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update decl</em>'.
   * @see org.xtext.abs.Update_decl
   * @generated
   */
  EClass getUpdate_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Update_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Update_decl#getName()
   * @see #getUpdate_decl()
   * @generated
   */
  EAttribute getUpdate_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Update_decl#getObject_update <em>Object update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object update</em>'.
   * @see org.xtext.abs.Update_decl#getObject_update()
   * @see #getUpdate_decl()
   * @generated
   */
  EReference getUpdate_decl_Object_update();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Object_update <em>Object update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object update</em>'.
   * @see org.xtext.abs.Object_update
   * @generated
   */
  EClass getObject_update();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Object_update#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Guard</em>'.
   * @see org.xtext.abs.Object_update#getGuard()
   * @see #getObject_update()
   * @generated
   */
  EReference getObject_update_Guard();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Object_update#getUpdate_preamble_declaration <em>Update preamble declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Update preamble declaration</em>'.
   * @see org.xtext.abs.Object_update#getUpdate_preamble_declaration()
   * @see #getObject_update()
   * @generated
   */
  EReference getObject_update_Update_preamble_declaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Object_update#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pre</em>'.
   * @see org.xtext.abs.Object_update#getPre()
   * @see #getObject_update()
   * @generated
   */
  EReference getObject_update_Pre();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Object_update#getPost <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post</em>'.
   * @see org.xtext.abs.Object_update#getPost()
   * @see #getObject_update()
   * @generated
   */
  EReference getObject_update_Post();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Update_preamble_declaration <em>Update preamble declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update preamble declaration</em>'.
   * @see org.xtext.abs.Update_preamble_declaration
   * @generated
   */
  EClass getUpdate_preamble_declaration();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Object_update_assign_stmt <em>Object update assign stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object update assign stmt</em>'.
   * @see org.xtext.abs.Object_update_assign_stmt
   * @generated
   */
  EClass getObject_update_assign_stmt();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Object_update_assign_stmt#getVar_or_field_ref <em>Var or field ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var or field ref</em>'.
   * @see org.xtext.abs.Object_update_assign_stmt#getVar_or_field_ref()
   * @see #getObject_update_assign_stmt()
   * @generated
   */
  EReference getObject_update_assign_stmt_Var_or_field_ref();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Object_update_assign_stmt#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.abs.Object_update_assign_stmt#getExp()
   * @see #getObject_update_assign_stmt()
   * @generated
   */
  EReference getObject_update_assign_stmt_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Productline_decl <em>Productline decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Productline decl</em>'.
   * @see org.xtext.abs.Productline_decl
   * @generated
   */
  EClass getProductline_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Productline_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Productline_decl#getName()
   * @see #getProductline_decl()
   * @generated
   */
  EAttribute getProductline_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Productline_decl#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature</em>'.
   * @see org.xtext.abs.Productline_decl#getFeature()
   * @see #getProductline_decl()
   * @generated
   */
  EReference getProductline_decl_Feature();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Productline_decl#getDelta_clause <em>Delta clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Delta clause</em>'.
   * @see org.xtext.abs.Productline_decl#getDelta_clause()
   * @see #getProductline_decl()
   * @generated
   */
  EReference getProductline_decl_Delta_clause();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.abs.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Feature#getFeature_decl <em>Feature decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature decl</em>'.
   * @see org.xtext.abs.Feature#getFeature_decl()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Feature_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Feature#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P</em>'.
   * @see org.xtext.abs.Feature#getP()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_P();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Feature#getAttr_assignment <em>Attr assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attr assignment</em>'.
   * @see org.xtext.abs.Feature#getAttr_assignment()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Attr_assignment();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Delta_clause <em>Delta clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta clause</em>'.
   * @see org.xtext.abs.Delta_clause
   * @generated
   */
  EClass getDelta_clause();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Delta_clause#getDeltaspec <em>Deltaspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Deltaspec</em>'.
   * @see org.xtext.abs.Delta_clause#getDeltaspec()
   * @see #getDelta_clause()
   * @generated
   */
  EReference getDelta_clause_Deltaspec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Delta_clause#getAfter_condition <em>After condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>After condition</em>'.
   * @see org.xtext.abs.Delta_clause#getAfter_condition()
   * @see #getDelta_clause()
   * @generated
   */
  EReference getDelta_clause_After_condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Delta_clause#getFrom_condition <em>From condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From condition</em>'.
   * @see org.xtext.abs.Delta_clause#getFrom_condition()
   * @see #getDelta_clause()
   * @generated
   */
  EReference getDelta_clause_From_condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Delta_clause#getWhen_condition <em>When condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When condition</em>'.
   * @see org.xtext.abs.Delta_clause#getWhen_condition()
   * @see #getDelta_clause()
   * @generated
   */
  EReference getDelta_clause_When_condition();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Deltaspec <em>Deltaspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deltaspec</em>'.
   * @see org.xtext.abs.Deltaspec
   * @generated
   */
  EClass getDeltaspec();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Deltaspec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Deltaspec#getName()
   * @see #getDeltaspec()
   * @generated
   */
  EAttribute getDeltaspec_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Deltaspec#getDeltaspec_param <em>Deltaspec param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Deltaspec param</em>'.
   * @see org.xtext.abs.Deltaspec#getDeltaspec_param()
   * @see #getDeltaspec()
   * @generated
   */
  EAttribute getDeltaspec_Deltaspec_param();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.After_condition <em>After condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After condition</em>'.
   * @see org.xtext.abs.After_condition
   * @generated
   */
  EClass getAfter_condition();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.After_condition#getDelta_id <em>Delta id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Delta id</em>'.
   * @see org.xtext.abs.After_condition#getDelta_id()
   * @see #getAfter_condition()
   * @generated
   */
  EReference getAfter_condition_Delta_id();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.From_condition <em>From condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From condition</em>'.
   * @see org.xtext.abs.From_condition
   * @generated
   */
  EClass getFrom_condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.From_condition#getApplication_condition <em>Application condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application condition</em>'.
   * @see org.xtext.abs.From_condition#getApplication_condition()
   * @see #getFrom_condition()
   * @generated
   */
  EReference getFrom_condition_Application_condition();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.When_condition <em>When condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When condition</em>'.
   * @see org.xtext.abs.When_condition
   * @generated
   */
  EClass getWhen_condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.When_condition#getApplication_condition <em>Application condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application condition</em>'.
   * @see org.xtext.abs.When_condition#getApplication_condition()
   * @see #getWhen_condition()
   * @generated
   */
  EReference getWhen_condition_Application_condition();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Application_condition <em>Application condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application condition</em>'.
   * @see org.xtext.abs.Application_condition
   * @generated
   */
  EClass getApplication_condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Application_condition#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see org.xtext.abs.Application_condition#getOperand()
   * @see #getApplication_condition()
   * @generated
   */
  EReference getApplication_condition_Operand();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Application_condition#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see org.xtext.abs.Application_condition#getFeature()
   * @see #getApplication_condition()
   * @generated
   */
  EReference getApplication_condition_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Application_condition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.Application_condition#getLeft()
   * @see #getApplication_condition()
   * @generated
   */
  EReference getApplication_condition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Application_condition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.Application_condition#getRight()
   * @see #getApplication_condition()
   * @generated
   */
  EReference getApplication_condition_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Product_decl <em>Product decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product decl</em>'.
   * @see org.xtext.abs.Product_decl
   * @generated
   */
  EClass getProduct_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Product_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Product_decl#getName()
   * @see #getProduct_decl()
   * @generated
   */
  EAttribute getProduct_decl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Product_decl#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature</em>'.
   * @see org.xtext.abs.Product_decl#getFeature()
   * @see #getProduct_decl()
   * @generated
   */
  EReference getProduct_decl_Feature();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Product_decl#getProduct_reconfiguration <em>Product reconfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Product reconfiguration</em>'.
   * @see org.xtext.abs.Product_decl#getProduct_reconfiguration()
   * @see #getProduct_decl()
   * @generated
   */
  EReference getProduct_decl_Product_reconfiguration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Product_decl#getProduct_expr <em>Product expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product expr</em>'.
   * @see org.xtext.abs.Product_decl#getProduct_expr()
   * @see #getProduct_decl()
   * @generated
   */
  EReference getProduct_decl_Product_expr();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Product_expr <em>Product expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product expr</em>'.
   * @see org.xtext.abs.Product_expr
   * @generated
   */
  EClass getProduct_expr();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.abs.Product_expr#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Feature</em>'.
   * @see org.xtext.abs.Product_expr#getFeature()
   * @see #getProduct_expr()
   * @generated
   */
  EReference getProduct_expr_Feature();

  /**
   * Returns the meta object for the reference '{@link org.xtext.abs.Product_expr#getProductDecl <em>Product Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Product Decl</em>'.
   * @see org.xtext.abs.Product_expr#getProductDecl()
   * @see #getProduct_expr()
   * @generated
   */
  EReference getProduct_expr_ProductDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Product_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.Product_expr#getLeft()
   * @see #getProduct_expr()
   * @generated
   */
  EReference getProduct_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Product_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.Product_expr#getRight()
   * @see #getProduct_expr()
   * @generated
   */
  EReference getProduct_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Product_reconfiguration <em>Product reconfiguration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product reconfiguration</em>'.
   * @see org.xtext.abs.Product_reconfiguration
   * @generated
   */
  EClass getProduct_reconfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Product_reconfiguration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Product_reconfiguration#getName()
   * @see #getProduct_reconfiguration()
   * @generated
   */
  EAttribute getProduct_reconfiguration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Product_reconfiguration#getDelta_id <em>Delta id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Delta id</em>'.
   * @see org.xtext.abs.Product_reconfiguration#getDelta_id()
   * @see #getProduct_reconfiguration()
   * @generated
   */
  EReference getProduct_reconfiguration_Delta_id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Product_reconfiguration#getUpdate <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Update</em>'.
   * @see org.xtext.abs.Product_reconfiguration#getUpdate()
   * @see #getProduct_reconfiguration()
   * @generated
   */
  EAttribute getProduct_reconfiguration_Update();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Feature_decl <em>Feature decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature decl</em>'.
   * @see org.xtext.abs.Feature_decl
   * @generated
   */
  EClass getFeature_decl();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Feature_decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Feature_decl#getName()
   * @see #getFeature_decl()
   * @generated
   */
  EAttribute getFeature_decl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Feature_decl#getFeature_decl_group <em>Feature decl group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature decl group</em>'.
   * @see org.xtext.abs.Feature_decl#getFeature_decl_group()
   * @see #getFeature_decl()
   * @generated
   */
  EReference getFeature_decl_Feature_decl_group();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Feature_decl#getFeature_decl_attribute <em>Feature decl attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature decl attribute</em>'.
   * @see org.xtext.abs.Feature_decl#getFeature_decl_attribute()
   * @see #getFeature_decl()
   * @generated
   */
  EReference getFeature_decl_Feature_decl_attribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Feature_decl#getFeature_decl_constraint <em>Feature decl constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature decl constraint</em>'.
   * @see org.xtext.abs.Feature_decl#getFeature_decl_constraint()
   * @see #getFeature_decl()
   * @generated
   */
  EReference getFeature_decl_Feature_decl_constraint();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Feature_decl_group <em>Feature decl group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature decl group</em>'.
   * @see org.xtext.abs.Feature_decl_group
   * @generated
   */
  EClass getFeature_decl_group();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Feature_decl_group#getFnode <em>Fnode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fnode</em>'.
   * @see org.xtext.abs.Feature_decl_group#getFnode()
   * @see #getFeature_decl_group()
   * @generated
   */
  EReference getFeature_decl_group_Fnode();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Fnode <em>Fnode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fnode</em>'.
   * @see org.xtext.abs.Fnode
   * @generated
   */
  EClass getFnode();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Feature_decl_attribute <em>Feature decl attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature decl attribute</em>'.
   * @see org.xtext.abs.Feature_decl_attribute
   * @generated
   */
  EClass getFeature_decl_attribute();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.abs.Feature_decl_attribute#getBoundary_val <em>Boundary val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Boundary val</em>'.
   * @see org.xtext.abs.Feature_decl_attribute#getBoundary_val()
   * @see #getFeature_decl_attribute()
   * @generated
   */
  EAttribute getFeature_decl_attribute_Boundary_val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Feature_decl_attribute#getLBoundary_int <em>LBoundary int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LBoundary int</em>'.
   * @see org.xtext.abs.Feature_decl_attribute#getLBoundary_int()
   * @see #getFeature_decl_attribute()
   * @generated
   */
  EAttribute getFeature_decl_attribute_LBoundary_int();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Feature_decl_attribute#getUBoundary_int <em>UBoundary int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>UBoundary int</em>'.
   * @see org.xtext.abs.Feature_decl_attribute#getUBoundary_int()
   * @see #getFeature_decl_attribute()
   * @generated
   */
  EAttribute getFeature_decl_attribute_UBoundary_int();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Feature_decl_constraint <em>Feature decl constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature decl constraint</em>'.
   * @see org.xtext.abs.Feature_decl_constraint
   * @generated
   */
  EClass getFeature_decl_constraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Feature_decl_constraint#getMexp <em>Mexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mexp</em>'.
   * @see org.xtext.abs.Feature_decl_constraint#getMexp()
   * @see #getFeature_decl_constraint()
   * @generated
   */
  EReference getFeature_decl_constraint_Mexp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Mexp <em>Mexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp</em>'.
   * @see org.xtext.abs.Mexp
   * @generated
   */
  EClass getMexp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Mexp#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.abs.Mexp#getValue()
   * @see #getMexp()
   * @generated
   */
  EAttribute getMexp_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Fextension <em>Fextension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fextension</em>'.
   * @see org.xtext.abs.Fextension
   * @generated
   */
  EClass getFextension();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.Fextension#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.abs.Fextension#getName()
   * @see #getFextension()
   * @generated
   */
  EAttribute getFextension_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Fextension#getFeature_decl_group <em>Feature decl group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature decl group</em>'.
   * @see org.xtext.abs.Fextension#getFeature_decl_group()
   * @see #getFextension()
   * @generated
   */
  EReference getFextension_Feature_decl_group();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Fextension#getFeature_decl_attribute <em>Feature decl attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature decl attribute</em>'.
   * @see org.xtext.abs.Fextension#getFeature_decl_attribute()
   * @see #getFextension()
   * @generated
   */
  EReference getFextension_Feature_decl_attribute();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.abs.Fextension#getFeature_decl_constraint <em>Feature decl constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature decl constraint</em>'.
   * @see org.xtext.abs.Fextension#getFeature_decl_constraint()
   * @see #getFextension()
   * @generated
   */
  EReference getFextension_Feature_decl_constraint();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Or_expr <em>Or expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or expr</em>'.
   * @see org.xtext.abs.Or_expr
   * @generated
   */
  EClass getOr_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Or_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.Or_expr#getLeft()
   * @see #getOr_expr()
   * @generated
   */
  EReference getOr_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Or_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.Or_expr#getRight()
   * @see #getOr_expr()
   * @generated
   */
  EReference getOr_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.And_expr <em>And expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And expr</em>'.
   * @see org.xtext.abs.And_expr
   * @generated
   */
  EClass getAnd_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.And_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.And_expr#getLeft()
   * @see #getAnd_expr()
   * @generated
   */
  EReference getAnd_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.And_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.And_expr#getRight()
   * @see #getAnd_expr()
   * @generated
   */
  EReference getAnd_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Equality_expr <em>Equality expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality expr</em>'.
   * @see org.xtext.abs.Equality_expr
   * @generated
   */
  EClass getEquality_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Equality_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.Equality_expr#getLeft()
   * @see #getEquality_expr()
   * @generated
   */
  EReference getEquality_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Equality_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.Equality_expr#getRight()
   * @see #getEquality_expr()
   * @generated
   */
  EReference getEquality_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.Comparison_expr <em>Comparison expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison expr</em>'.
   * @see org.xtext.abs.Comparison_expr
   * @generated
   */
  EClass getComparison_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Comparison_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.Comparison_expr#getLeft()
   * @see #getComparison_expr()
   * @generated
   */
  EReference getComparison_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.Comparison_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.Comparison_expr#getRight()
   * @see #getComparison_expr()
   * @generated
   */
  EReference getComparison_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.PlusOrMinus_expr <em>Plus Or Minus expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Or Minus expr</em>'.
   * @see org.xtext.abs.PlusOrMinus_expr
   * @generated
   */
  EClass getPlusOrMinus_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.PlusOrMinus_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.PlusOrMinus_expr#getLeft()
   * @see #getPlusOrMinus_expr()
   * @generated
   */
  EReference getPlusOrMinus_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.PlusOrMinus_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.PlusOrMinus_expr#getRight()
   * @see #getPlusOrMinus_expr()
   * @generated
   */
  EReference getPlusOrMinus_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MulDivOrMod_expr <em>Mul Div Or Mod expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Div Or Mod expr</em>'.
   * @see org.xtext.abs.MulDivOrMod_expr
   * @generated
   */
  EClass getMulDivOrMod_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MulDivOrMod_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MulDivOrMod_expr#getLeft()
   * @see #getMulDivOrMod_expr()
   * @generated
   */
  EReference getMulDivOrMod_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MulDivOrMod_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MulDivOrMod_expr#getRight()
   * @see #getMulDivOrMod_expr()
   * @generated
   */
  EReference getMulDivOrMod_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.AndGuard <em>And Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Guard</em>'.
   * @see org.xtext.abs.AndGuard
   * @generated
   */
  EClass getAndGuard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.AndGuard#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.AndGuard#getLeft()
   * @see #getAndGuard()
   * @generated
   */
  EReference getAndGuard_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.AndGuard#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.AndGuard#getOp()
   * @see #getAndGuard()
   * @generated
   */
  EAttribute getAndGuard_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.AndGuard#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.AndGuard#getRight()
   * @see #getAndGuard()
   * @generated
   */
  EReference getAndGuard_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.AppOr_exp <em>App Or exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>App Or exp</em>'.
   * @see org.xtext.abs.AppOr_exp
   * @generated
   */
  EClass getAppOr_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.AppAnd_exp <em>App And exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>App And exp</em>'.
   * @see org.xtext.abs.AppAnd_exp
   * @generated
   */
  EClass getAppAnd_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.ProductOr_expr <em>Product Or expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product Or expr</em>'.
   * @see org.xtext.abs.ProductOr_expr
   * @generated
   */
  EClass getProductOr_expr();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.ProductAnd_exp <em>Product And exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product And exp</em>'.
   * @see org.xtext.abs.ProductAnd_exp
   * @generated
   */
  EClass getProductAnd_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.ProductMinus_exp <em>Product Minus exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product Minus exp</em>'.
   * @see org.xtext.abs.ProductMinus_exp
   * @generated
   */
  EClass getProductMinus_exp();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpOr_exp <em>Mexp Or exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Or exp</em>'.
   * @see org.xtext.abs.MexpOr_exp
   * @generated
   */
  EClass getMexpOr_exp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpOr_exp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpOr_exp#getLeft()
   * @see #getMexpOr_exp()
   * @generated
   */
  EReference getMexpOr_exp_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpOr_exp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpOr_exp#getRight()
   * @see #getMexpOr_exp()
   * @generated
   */
  EReference getMexpOr_exp_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpAnd_expr <em>Mexp And expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp And expr</em>'.
   * @see org.xtext.abs.MexpAnd_expr
   * @generated
   */
  EClass getMexpAnd_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpAnd_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpAnd_expr#getLeft()
   * @see #getMexpAnd_expr()
   * @generated
   */
  EReference getMexpAnd_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpAnd_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpAnd_expr#getRight()
   * @see #getMexpAnd_expr()
   * @generated
   */
  EReference getMexpAnd_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpImplies_expr <em>Mexp Implies expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Implies expr</em>'.
   * @see org.xtext.abs.MexpImplies_expr
   * @generated
   */
  EClass getMexpImplies_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpImplies_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpImplies_expr#getLeft()
   * @see #getMexpImplies_expr()
   * @generated
   */
  EReference getMexpImplies_expr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.MexpImplies_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.MexpImplies_expr#getOp()
   * @see #getMexpImplies_expr()
   * @generated
   */
  EAttribute getMexpImplies_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpImplies_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpImplies_expr#getRight()
   * @see #getMexpImplies_expr()
   * @generated
   */
  EReference getMexpImplies_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpEquality_expr <em>Mexp Equality expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Equality expr</em>'.
   * @see org.xtext.abs.MexpEquality_expr
   * @generated
   */
  EClass getMexpEquality_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpEquality_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpEquality_expr#getLeft()
   * @see #getMexpEquality_expr()
   * @generated
   */
  EReference getMexpEquality_expr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.MexpEquality_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.MexpEquality_expr#getOp()
   * @see #getMexpEquality_expr()
   * @generated
   */
  EAttribute getMexpEquality_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpEquality_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpEquality_expr#getRight()
   * @see #getMexpEquality_expr()
   * @generated
   */
  EReference getMexpEquality_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpComparison_expr <em>Mexp Comparison expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Comparison expr</em>'.
   * @see org.xtext.abs.MexpComparison_expr
   * @generated
   */
  EClass getMexpComparison_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpComparison_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpComparison_expr#getLeft()
   * @see #getMexpComparison_expr()
   * @generated
   */
  EReference getMexpComparison_expr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.MexpComparison_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.MexpComparison_expr#getOp()
   * @see #getMexpComparison_expr()
   * @generated
   */
  EAttribute getMexpComparison_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpComparison_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpComparison_expr#getRight()
   * @see #getMexpComparison_expr()
   * @generated
   */
  EReference getMexpComparison_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpPlusOrMinus_expr <em>Mexp Plus Or Minus expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Plus Or Minus expr</em>'.
   * @see org.xtext.abs.MexpPlusOrMinus_expr
   * @generated
   */
  EClass getMexpPlusOrMinus_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpPlusOrMinus_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpPlusOrMinus_expr#getLeft()
   * @see #getMexpPlusOrMinus_expr()
   * @generated
   */
  EReference getMexpPlusOrMinus_expr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.MexpPlusOrMinus_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.MexpPlusOrMinus_expr#getOp()
   * @see #getMexpPlusOrMinus_expr()
   * @generated
   */
  EAttribute getMexpPlusOrMinus_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpPlusOrMinus_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpPlusOrMinus_expr#getRight()
   * @see #getMexpPlusOrMinus_expr()
   * @generated
   */
  EReference getMexpPlusOrMinus_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpMulDivOrMod_expr <em>Mexp Mul Div Or Mod expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Mul Div Or Mod expr</em>'.
   * @see org.xtext.abs.MexpMulDivOrMod_expr
   * @generated
   */
  EClass getMexpMulDivOrMod_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpMulDivOrMod_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.abs.MexpMulDivOrMod_expr#getLeft()
   * @see #getMexpMulDivOrMod_expr()
   * @generated
   */
  EReference getMexpMulDivOrMod_expr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.abs.MexpMulDivOrMod_expr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.abs.MexpMulDivOrMod_expr#getOp()
   * @see #getMexpMulDivOrMod_expr()
   * @generated
   */
  EAttribute getMexpMulDivOrMod_expr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpMulDivOrMod_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.abs.MexpMulDivOrMod_expr#getRight()
   * @see #getMexpMulDivOrMod_expr()
   * @generated
   */
  EReference getMexpMulDivOrMod_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.abs.MexpPrimary_expr <em>Mexp Primary expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mexp Primary expr</em>'.
   * @see org.xtext.abs.MexpPrimary_expr
   * @generated
   */
  EClass getMexpPrimary_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.abs.MexpPrimary_expr#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.xtext.abs.MexpPrimary_expr#getA()
   * @see #getMexpPrimary_expr()
   * @generated
   */
  EReference getMexpPrimary_expr_A();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AbsFactory getAbsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.DomainModelImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Compilation_UnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Compilation_UnitImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getCompilation_Unit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilation_Unit();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__MODULE = eINSTANCE.getCompilation_Unit_Module();

    /**
     * The meta object literal for the '<em><b>Delta Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__DELTA_DECL = eINSTANCE.getCompilation_Unit_DeltaDecl();

    /**
     * The meta object literal for the '<em><b>Update decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__UPDATE_DECL = eINSTANCE.getCompilation_Unit_Update_decl();

    /**
     * The meta object literal for the '<em><b>Productline decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__PRODUCTLINE_DECL = eINSTANCE.getCompilation_Unit_Productline_decl();

    /**
     * The meta object literal for the '<em><b>Product decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__PRODUCT_DECL = eINSTANCE.getCompilation_Unit_Product_decl();

    /**
     * The meta object literal for the '<em><b>Feature decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__FEATURE_DECL = eINSTANCE.getCompilation_Unit_Feature_decl();

    /**
     * The meta object literal for the '<em><b>Fextension</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__FEXTENSION = eINSTANCE.getCompilation_Unit_Fextension();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Module_declImpl <em>Module decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Module_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getModule_decl()
     * @generated
     */
    EClass MODULE_DECL = eINSTANCE.getModule_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_DECL__NAME = eINSTANCE.getModule_decl_Name();

    /**
     * The meta object literal for the '<em><b>Module export</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECL__MODULE_EXPORT = eINSTANCE.getModule_decl_Module_export();

    /**
     * The meta object literal for the '<em><b>Module import</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECL__MODULE_IMPORT = eINSTANCE.getModule_decl_Module_import();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECL__DECL = eINSTANCE.getModule_decl_Decl();

    /**
     * The meta object literal for the '<em><b>Main block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_DECL__MAIN_BLOCK = eINSTANCE.getModule_decl_Main_block();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Module_exportImpl <em>Module export</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Module_exportImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getModule_export()
     * @generated
     */
    EClass MODULE_EXPORT = eINSTANCE.getModule_export();

    /**
     * The meta object literal for the '<em><b>Any Package</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_EXPORT__ANY_PACKAGE = eINSTANCE.getModule_export_AnyPackage();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_EXPORT__IMPORTED_NAMESPACE = eINSTANCE.getModule_export_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Module_importImpl <em>Module import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Module_importImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getModule_import()
     * @generated
     */
    EClass MODULE_IMPORT = eINSTANCE.getModule_import();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getModule_import_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_IMPORT__NAME = eINSTANCE.getModule_import_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.DeclImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__NAME = eINSTANCE.getDecl_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Par_function_declImpl <em>Par function decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Par_function_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getPar_function_decl()
     * @generated
     */
    EClass PAR_FUNCTION_DECL = eINSTANCE.getPar_function_decl();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_FUNCTION_DECL__TYPE_USE = eINSTANCE.getPar_function_decl_Type_use();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAR_FUNCTION_DECL__P = eINSTANCE.getPar_function_decl_P();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_FUNCTION_DECL__FUNCTIONS = eINSTANCE.getPar_function_decl_Functions();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_FUNCTION_DECL__PARAMS = eINSTANCE.getPar_function_decl_Params();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_FUNCTION_DECL__E = eINSTANCE.getPar_function_decl_E();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_name_listImpl <em>Function name list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_name_listImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_list()
     * @generated
     */
    EClass FUNCTION_NAME_LIST = eINSTANCE.getFunction_name_list();

    /**
     * The meta object literal for the '<em><b>Function name decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_NAME_LIST__FUNCTION_NAME_DECL = eINSTANCE.getFunction_name_list_Function_name_decl();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_name_declImpl <em>Function name decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_name_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_decl()
     * @generated
     */
    EClass FUNCTION_NAME_DECL = eINSTANCE.getFunction_name_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_NAME_DECL__NAME = eINSTANCE.getFunction_name_decl_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.DataType_declImpl <em>Data Type decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.DataType_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDataType_decl()
     * @generated
     */
    EClass DATA_TYPE_DECL = eINSTANCE.getDataType_decl();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_DECL__P = eINSTANCE.getDataType_decl_P();

    /**
     * The meta object literal for the '<em><b>Data constructor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_DECL__DATA_CONSTRUCTOR = eINSTANCE.getDataType_decl_Data_constructor();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Data_constructorImpl <em>Data constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Data_constructorImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getData_constructor()
     * @generated
     */
    EClass DATA_CONSTRUCTOR = eINSTANCE.getData_constructor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_CONSTRUCTOR__NAME = eINSTANCE.getData_constructor_Name();

    /**
     * The meta object literal for the '<em><b>Data constructor arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG = eINSTANCE.getData_constructor_Data_constructor_arg();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Data_constructor_argImpl <em>Data constructor arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Data_constructor_argImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getData_constructor_arg()
     * @generated
     */
    EClass DATA_CONSTRUCTOR_ARG = eINSTANCE.getData_constructor_arg();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.AnnotationsImpl <em>Annotations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.AnnotationsImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAnnotations()
     * @generated
     */
    EClass ANNOTATIONS = eINSTANCE.getAnnotations();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATIONS__ANNOTATION = eINSTANCE.getAnnotations_Annotation();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.AnnotationImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__PURE_EXP = eINSTANCE.getAnnotation_Pure_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Type_useImpl <em>Type use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Type_useImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getType_use()
     * @generated
     */
    EClass TYPE_USE = eINSTANCE.getType_use();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_USE__NAME = eINSTANCE.getType_use_Name();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_USE__TYPE_USE = eINSTANCE.getType_use_Type_use();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Pure_expImpl <em>Pure exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Pure_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getPure_exp()
     * @generated
     */
    EClass PURE_EXP = eINSTANCE.getPure_exp();

    /**
     * The meta object literal for the '<em><b>Function list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__FUNCTION_LIST = eINSTANCE.getPure_exp_Function_list();

    /**
     * The meta object literal for the '<em><b>Partial function pure exp list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST = eINSTANCE.getPure_exp_Partial_function_pure_exp_list();

    /**
     * The meta object literal for the '<em><b>Variadic exp list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__VARIADIC_EXP_LIST = eINSTANCE.getPure_exp_Variadic_exp_list();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__IF = eINSTANCE.getPure_exp_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__THEN = eINSTANCE.getPure_exp_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__ELSE = eINSTANCE.getPure_exp_Else();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__CASE = eINSTANCE.getPure_exp_Case();

    /**
     * The meta object literal for the '<em><b>Casebranch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__CASEBRANCH = eINSTANCE.getPure_exp_Casebranch();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__TYPE_USE = eINSTANCE.getPure_exp_Type_use();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURE_EXP__VALUE = eINSTANCE.getPure_exp_Value();

    /**
     * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__I = eINSTANCE.getPure_exp_I();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__B = eINSTANCE.getPure_exp_B();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURE_EXP__OP = eINSTANCE.getPure_exp_Op();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP__PURE_EXP = eINSTANCE.getPure_exp_Pure_exp();

    /**
     * The meta object literal for the '<em><b>Await</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURE_EXP__AWAIT = eINSTANCE.getPure_exp_Await();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PURE_EXP__VAL = eINSTANCE.getPure_exp_Val();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Var_or_field_refImpl <em>Var or field ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Var_or_field_refImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getVar_or_field_ref()
     * @generated
     */
    EClass VAR_OR_FIELD_REF = eINSTANCE.getVar_or_field_ref();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_OR_FIELD_REF__NAME = eINSTANCE.getVar_or_field_ref_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_OR_FIELD_REF__REF = eINSTANCE.getVar_or_field_ref_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Case_branchImpl <em>Case branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Case_branchImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getCase_branch()
     * @generated
     */
    EClass CASE_BRANCH = eINSTANCE.getCase_branch();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.PatternImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PURE_EXP = eINSTANCE.getPattern_Pure_exp();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__PATTERN = eINSTANCE.getPattern_Pattern();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Pure_exp_listImpl <em>Pure exp list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Pure_exp_listImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getPure_exp_list()
     * @generated
     */
    EClass PURE_EXP_LIST = eINSTANCE.getPure_exp_list();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PURE_EXP_LIST__PURE_EXP = eINSTANCE.getPure_exp_list_Pure_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_listImpl <em>Function list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_listImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_list()
     * @generated
     */
    EClass FUNCTION_LIST = eINSTANCE.getFunction_list();

    /**
     * The meta object literal for the '<em><b>Function param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_LIST__FUNCTION_PARAM = eINSTANCE.getFunction_list_Function_param();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_paramImpl <em>Function param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_paramImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_param()
     * @generated
     */
    EClass FUNCTION_PARAM = eINSTANCE.getFunction_param();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_name_param_declImpl <em>Function name param decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_name_param_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_name_param_decl()
     * @generated
     */
    EClass FUNCTION_NAME_PARAM_DECL = eINSTANCE.getFunction_name_param_decl();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_NAME_PARAM_DECL__VALUE = eINSTANCE.getFunction_name_param_decl_Value();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Anon_function_declImpl <em>Anon function decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Anon_function_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAnon_function_decl()
     * @generated
     */
    EClass ANON_FUNCTION_DECL = eINSTANCE.getAnon_function_decl();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_FUNCTION_DECL__PARAMS = eINSTANCE.getAnon_function_decl_Params();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANON_FUNCTION_DECL__PURE_EXP = eINSTANCE.getAnon_function_decl_Pure_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Param_listImpl <em>Param list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Param_listImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getParam_list()
     * @generated
     */
    EClass PARAM_LIST = eINSTANCE.getParam_list();

    /**
     * The meta object literal for the '<em><b>Param decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_LIST__PARAM_DECL = eINSTANCE.getParam_list_Param_decl();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Param_declImpl <em>Param decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Param_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getParam_decl()
     * @generated
     */
    EClass PARAM_DECL = eINSTANCE.getParam_decl();

    /**
     * The meta object literal for the '<em><b>Type exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_DECL__TYPE_EXP = eINSTANCE.getParam_decl_Type_exp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_DECL__NAME = eINSTANCE.getParam_decl_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Type_expImpl <em>Type exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Type_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getType_exp()
     * @generated
     */
    EClass TYPE_EXP = eINSTANCE.getType_exp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_EXP__NAME = eINSTANCE.getType_exp_Name();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_EXP__P = eINSTANCE.getType_exp_P();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Function_declImpl <em>Function decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Function_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunction_decl()
     * @generated
     */
    EClass FUNCTION_DECL = eINSTANCE.getFunction_decl();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__TYPE_USE = eINSTANCE.getFunction_decl_Type_use();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECL__P = eINSTANCE.getFunction_decl_P();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__PARAMLIST = eINSTANCE.getFunction_decl_Paramlist();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECL__PURE_EXP = eINSTANCE.getFunction_decl_Pure_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Typesyn_declImpl <em>Typesyn decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Typesyn_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getTypesyn_decl()
     * @generated
     */
    EClass TYPESYN_DECL = eINSTANCE.getTypesyn_decl();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPESYN_DECL__TYPE_USE = eINSTANCE.getTypesyn_decl_Type_use();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Exception_declImpl <em>Exception decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Exception_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getException_decl()
     * @generated
     */
    EClass EXCEPTION_DECL = eINSTANCE.getException_decl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_DECL__TYPE = eINSTANCE.getException_decl_Type();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Interface_declImpl <em>Interface decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Interface_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_decl()
     * @generated
     */
    EClass INTERFACE_DECL = eINSTANCE.getInterface_decl();

    /**
     * The meta object literal for the '<em><b>Interface name</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__INTERFACE_NAME = eINSTANCE.getInterface_decl_Interface_name();

    /**
     * The meta object literal for the '<em><b>Methodsig</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECL__METHODSIG = eINSTANCE.getInterface_decl_Methodsig();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Interface_nameImpl <em>Interface name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Interface_nameImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_name()
     * @generated
     */
    EClass INTERFACE_NAME = eINSTANCE.getInterface_name();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_NAME__NAME = eINSTANCE.getInterface_name_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MethodsigImpl <em>Methodsig</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MethodsigImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMethodsig()
     * @generated
     */
    EClass METHODSIG = eINSTANCE.getMethodsig();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODSIG__TYPE_USE = eINSTANCE.getMethodsig_Type_use();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODSIG__NAME = eINSTANCE.getMethodsig_Name();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODSIG__PARAMLIST = eINSTANCE.getMethodsig_Paramlist();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Class_declImpl <em>Class decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Class_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getClass_decl()
     * @generated
     */
    EClass CLASS_DECL = eINSTANCE.getClass_decl();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__PARAMLIST = eINSTANCE.getClass_decl_Paramlist();

    /**
     * The meta object literal for the '<em><b>Interface name</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__INTERFACE_NAME = eINSTANCE.getClass_decl_Interface_name();

    /**
     * The meta object literal for the '<em><b>Field decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__FIELD_DECL = eINSTANCE.getClass_decl_Field_decl();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__STMT = eINSTANCE.getClass_decl_Stmt();

    /**
     * The meta object literal for the '<em><b>Casestmtbranch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__CASESTMTBRANCH = eINSTANCE.getClass_decl_Casestmtbranch();

    /**
     * The meta object literal for the '<em><b>Trait usage</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__TRAIT_USAGE = eINSTANCE.getClass_decl_Trait_usage();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECL__METHOD = eINSTANCE.getClass_decl_Method();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Field_declImpl <em>Field decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Field_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getField_decl()
     * @generated
     */
    EClass FIELD_DECL = eINSTANCE.getField_decl();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECL__TYPE_USE = eINSTANCE.getField_decl_Type_use();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECL__NAME = eINSTANCE.getField_decl_Name();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECL__PURE_EXP = eINSTANCE.getField_decl_Pure_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.StmtImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '<em><b>Type exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__TYPE_EXP = eINSTANCE.getStmt_Type_exp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STMT__NAME = eINSTANCE.getStmt_Name();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__EXP = eINSTANCE.getStmt_Exp();

    /**
     * The meta object literal for the '<em><b>Var or field ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__VAR_OR_FIELD_REF = eINSTANCE.getStmt_Var_or_field_ref();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__STMT = eINSTANCE.getStmt_Stmt();

    /**
     * The meta object literal for the '<em><b>Pure exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__PURE_EXP = eINSTANCE.getStmt_Pure_exp();

    /**
     * The meta object literal for the '<em><b>Ifstmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__IFSTMT = eINSTANCE.getStmt_Ifstmt();

    /**
     * The meta object literal for the '<em><b>Elsestmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__ELSESTMT = eINSTANCE.getStmt_Elsestmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__CONDITION = eINSTANCE.getStmt_Condition();

    /**
     * The meta object literal for the '<em><b>Whilestmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__WHILESTMT = eINSTANCE.getStmt_Whilestmt();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__L = eINSTANCE.getStmt_L();

    /**
     * The meta object literal for the '<em><b>Foreachstmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__FOREACHSTMT = eINSTANCE.getStmt_Foreachstmt();

    /**
     * The meta object literal for the '<em><b>Trystmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__TRYSTMT = eINSTANCE.getStmt_Trystmt();

    /**
     * The meta object literal for the '<em><b>Casestmtbranch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__CASESTMTBRANCH = eINSTANCE.getStmt_Casestmtbranch();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__REF = eINSTANCE.getStmt_Ref();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__F = eINSTANCE.getStmt_F();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__T = eINSTANCE.getStmt_T();

    /**
     * The meta object literal for the '<em><b>Throw Pure Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__THROW_PURE_EXP = eINSTANCE.getStmt_ThrowPureExp();

    /**
     * The meta object literal for the '<em><b>Die Pure Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__DIE_PURE_EXP = eINSTANCE.getStmt_DiePureExp();

    /**
     * The meta object literal for the '<em><b>Move Cog To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__MOVE_COG_TO = eINSTANCE.getStmt_MoveCogTo();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STMT__C = eINSTANCE.getStmt_C();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.ExpImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Eff_exprImpl <em>Eff expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Eff_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getEff_expr()
     * @generated
     */
    EClass EFF_EXPR = eINSTANCE.getEff_expr();

    /**
     * The meta object literal for the '<em><b>L</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFF_EXPR__L = eINSTANCE.getEff_expr_L();

    /**
     * The meta object literal for the '<em><b>Pure exp list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFF_EXPR__PURE_EXP_LIST = eINSTANCE.getEff_expr_Pure_exp_list();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFF_EXPR__LIST = eINSTANCE.getEff_expr_List();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Delta_idImpl <em>Delta id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Delta_idImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_id()
     * @generated
     */
    EClass DELTA_ID = eINSTANCE.getDelta_id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_ID__NAME = eINSTANCE.getDelta_id_Name();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.GuardImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__REF = eINSTANCE.getGuard_Ref();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__MIN = eINSTANCE.getGuard_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__MAX = eINSTANCE.getGuard_Max();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__GUARD = eINSTANCE.getGuard_Guard();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.CasestmtbranchImpl <em>Casestmtbranch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.CasestmtbranchImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getCasestmtbranch()
     * @generated
     */
    EClass CASESTMTBRANCH = eINSTANCE.getCasestmtbranch();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASESTMTBRANCH__PATTERN = eINSTANCE.getCasestmtbranch_Pattern();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASESTMTBRANCH__STMT = eINSTANCE.getCasestmtbranch_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Trait_usageImpl <em>Trait usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Trait_usageImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_usage()
     * @generated
     */
    EClass TRAIT_USAGE = eINSTANCE.getTrait_usage();

    /**
     * The meta object literal for the '<em><b>Trait Usage</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_USAGE__TRAIT_USAGE = eINSTANCE.getTrait_usage_TraitUsage();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Trait_exprImpl <em>Trait expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Trait_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_expr()
     * @generated
     */
    EClass TRAIT_EXPR = eINSTANCE.getTrait_expr();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPR__METHOD = eINSTANCE.getTrait_expr_Method();

    /**
     * The meta object literal for the '<em><b>Trait Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPR__TRAIT_METHOD = eINSTANCE.getTrait_expr_TraitMethod();

    /**
     * The meta object literal for the '<em><b>Trait Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPR__TRAIT_NAME = eINSTANCE.getTrait_expr_TraitName();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPR__OP = eINSTANCE.getTrait_expr_Op();

    /**
     * The meta object literal for the '<em><b>Trait expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_EXPR__TRAIT_EXPR = eINSTANCE.getTrait_expr_Trait_expr();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Trait_operImpl <em>Trait oper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Trait_operImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_oper()
     * @generated
     */
    EClass TRAIT_OPER = eINSTANCE.getTrait_oper();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_OPER__METHOD = eINSTANCE.getTrait_oper_Method();

    /**
     * The meta object literal for the '<em><b>Methodsig</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_OPER__METHODSIG = eINSTANCE.getTrait_oper_Methodsig();

    /**
     * The meta object literal for the '<em><b>Trait expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_OPER__TRAIT_EXPR = eINSTANCE.getTrait_oper_Trait_expr();

    /**
     * The meta object literal for the '<em><b>Trait exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_OPER__TRAIT_EXP = eINSTANCE.getTrait_oper_Trait_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MethodImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type use</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE_USE = eINSTANCE.getMethod_Type_use();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Paramlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMLIST = eINSTANCE.getMethod_Paramlist();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__STMT = eINSTANCE.getMethod_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Trait_declImpl <em>Trait decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Trait_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getTrait_decl()
     * @generated
     */
    EClass TRAIT_DECL = eINSTANCE.getTrait_decl();

    /**
     * The meta object literal for the '<em><b>Trait Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRAIT_DECL__TRAIT_EXPR = eINSTANCE.getTrait_decl_TraitExpr();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Main_blockImpl <em>Main block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Main_blockImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMain_block()
     * @generated
     */
    EClass MAIN_BLOCK = eINSTANCE.getMain_block();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_BLOCK__STMT = eINSTANCE.getMain_block_Stmt();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Delta_declImpl <em>Delta decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Delta_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_decl()
     * @generated
     */
    EClass DELTA_DECL = eINSTANCE.getDelta_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_DECL__NAME = eINSTANCE.getDelta_decl_Name();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_DECL__P = eINSTANCE.getDelta_decl_P();

    /**
     * The meta object literal for the '<em><b>Delta access</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_DECL__DELTA_ACCESS = eINSTANCE.getDelta_decl_Delta_access();

    /**
     * The meta object literal for the '<em><b>Module modifier</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_DECL__MODULE_MODIFIER = eINSTANCE.getDelta_decl_Module_modifier();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Delta_paramImpl <em>Delta param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Delta_paramImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_param()
     * @generated
     */
    EClass DELTA_PARAM = eINSTANCE.getDelta_param();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Has_conditionImpl <em>Has condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Has_conditionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getHas_condition()
     * @generated
     */
    EClass HAS_CONDITION = eINSTANCE.getHas_condition();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_CONDITION__FIELD = eINSTANCE.getHas_condition_Field();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_CONDITION__METHOD = eINSTANCE.getHas_condition_Method();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_CONDITION__INTERFACE = eINSTANCE.getHas_condition_Interface();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Delta_accessImpl <em>Delta access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Delta_accessImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_access()
     * @generated
     */
    EClass DELTA_ACCESS = eINSTANCE.getDelta_access();

    /**
     * The meta object literal for the '<em><b>Module ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_ACCESS__MODULE_REF = eINSTANCE.getDelta_access_Module_ref();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Module_modifierImpl <em>Module modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Module_modifierImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getModule_modifier()
     * @generated
     */
    EClass MODULE_MODIFIER = eINSTANCE.getModule_modifier();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Functional_modifierImpl <em>Functional modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Functional_modifierImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFunctional_modifier()
     * @generated
     */
    EClass FUNCTIONAL_MODIFIER = eINSTANCE.getFunctional_modifier();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.OO_modifierImpl <em>OO modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.OO_modifierImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getOO_modifier()
     * @generated
     */
    EClass OO_MODIFIER = eINSTANCE.getOO_modifier();

    /**
     * The meta object literal for the '<em><b>Class decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__CLASS_DECL = eINSTANCE.getOO_modifier_Class_decl();

    /**
     * The meta object literal for the '<em><b>Interface decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__INTERFACE_DECL = eINSTANCE.getOO_modifier_Interface_decl();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__CLASS = eINSTANCE.getOO_modifier_Class();

    /**
     * The meta object literal for the '<em><b>Inteface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__INTEFACE = eINSTANCE.getOO_modifier_Inteface();

    /**
     * The meta object literal for the '<em><b>Interface Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__INTERFACE_NAME = eINSTANCE.getOO_modifier_InterfaceName();

    /**
     * The meta object literal for the '<em><b>Removed Interface</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__REMOVED_INTERFACE = eINSTANCE.getOO_modifier_RemovedInterface();

    /**
     * The meta object literal for the '<em><b>Class modifier fragment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__CLASS_MODIFIER_FRAGMENT = eINSTANCE.getOO_modifier_Class_modifier_fragment();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__INTERFACE = eINSTANCE.getOO_modifier_Interface();

    /**
     * The meta object literal for the '<em><b>Interface modifier fragment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OO_MODIFIER__INTERFACE_MODIFIER_FRAGMENT = eINSTANCE.getOO_modifier_Interface_modifier_fragment();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Class_modifier_fragmentImpl <em>Class modifier fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Class_modifier_fragmentImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getClass_modifier_fragment()
     * @generated
     */
    EClass CLASS_MODIFIER_FRAGMENT = eINSTANCE.getClass_modifier_fragment();

    /**
     * The meta object literal for the '<em><b>Methodsig</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_MODIFIER_FRAGMENT__METHODSIG = eINSTANCE.getClass_modifier_fragment_Methodsig();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Interface_modifier_fragmentImpl <em>Interface modifier fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Interface_modifier_fragmentImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getInterface_modifier_fragment()
     * @generated
     */
    EClass INTERFACE_MODIFIER_FRAGMENT = eINSTANCE.getInterface_modifier_fragment();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Namespace_modifierImpl <em>Namespace modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Namespace_modifierImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getNamespace_modifier()
     * @generated
     */
    EClass NAMESPACE_MODIFIER = eINSTANCE.getNamespace_modifier();

    /**
     * The meta object literal for the '<em><b>Star</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_MODIFIER__STAR = eINSTANCE.getNamespace_modifier_Star();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Update_declImpl <em>Update decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Update_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getUpdate_decl()
     * @generated
     */
    EClass UPDATE_DECL = eINSTANCE.getUpdate_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATE_DECL__NAME = eINSTANCE.getUpdate_decl_Name();

    /**
     * The meta object literal for the '<em><b>Object update</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_DECL__OBJECT_UPDATE = eINSTANCE.getUpdate_decl_Object_update();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Object_updateImpl <em>Object update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Object_updateImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getObject_update()
     * @generated
     */
    EClass OBJECT_UPDATE = eINSTANCE.getObject_update();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE__GUARD = eINSTANCE.getObject_update_Guard();

    /**
     * The meta object literal for the '<em><b>Update preamble declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE__UPDATE_PREAMBLE_DECLARATION = eINSTANCE.getObject_update_Update_preamble_declaration();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE__PRE = eINSTANCE.getObject_update_Pre();

    /**
     * The meta object literal for the '<em><b>Post</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE__POST = eINSTANCE.getObject_update_Post();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Update_preamble_declarationImpl <em>Update preamble declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Update_preamble_declarationImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getUpdate_preamble_declaration()
     * @generated
     */
    EClass UPDATE_PREAMBLE_DECLARATION = eINSTANCE.getUpdate_preamble_declaration();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Object_update_assign_stmtImpl <em>Object update assign stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Object_update_assign_stmtImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getObject_update_assign_stmt()
     * @generated
     */
    EClass OBJECT_UPDATE_ASSIGN_STMT = eINSTANCE.getObject_update_assign_stmt();

    /**
     * The meta object literal for the '<em><b>Var or field ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE_ASSIGN_STMT__VAR_OR_FIELD_REF = eINSTANCE.getObject_update_assign_stmt_Var_or_field_ref();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_UPDATE_ASSIGN_STMT__EXP = eINSTANCE.getObject_update_assign_stmt_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Productline_declImpl <em>Productline decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Productline_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProductline_decl()
     * @generated
     */
    EClass PRODUCTLINE_DECL = eINSTANCE.getProductline_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCTLINE_DECL__NAME = eINSTANCE.getProductline_decl_Name();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTLINE_DECL__FEATURE = eINSTANCE.getProductline_decl_Feature();

    /**
     * The meta object literal for the '<em><b>Delta clause</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCTLINE_DECL__DELTA_CLAUSE = eINSTANCE.getProductline_decl_Delta_clause();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.FeatureImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Feature decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__FEATURE_DECL = eINSTANCE.getFeature_Feature_decl();

    /**
     * The meta object literal for the '<em><b>P</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__P = eINSTANCE.getFeature_P();

    /**
     * The meta object literal for the '<em><b>Attr assignment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__ATTR_ASSIGNMENT = eINSTANCE.getFeature_Attr_assignment();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Delta_clauseImpl <em>Delta clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Delta_clauseImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDelta_clause()
     * @generated
     */
    EClass DELTA_CLAUSE = eINSTANCE.getDelta_clause();

    /**
     * The meta object literal for the '<em><b>Deltaspec</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_CLAUSE__DELTASPEC = eINSTANCE.getDelta_clause_Deltaspec();

    /**
     * The meta object literal for the '<em><b>After condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_CLAUSE__AFTER_CONDITION = eINSTANCE.getDelta_clause_After_condition();

    /**
     * The meta object literal for the '<em><b>From condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_CLAUSE__FROM_CONDITION = eINSTANCE.getDelta_clause_From_condition();

    /**
     * The meta object literal for the '<em><b>When condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_CLAUSE__WHEN_CONDITION = eINSTANCE.getDelta_clause_When_condition();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.DeltaspecImpl <em>Deltaspec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.DeltaspecImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getDeltaspec()
     * @generated
     */
    EClass DELTASPEC = eINSTANCE.getDeltaspec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTASPEC__NAME = eINSTANCE.getDeltaspec_Name();

    /**
     * The meta object literal for the '<em><b>Deltaspec param</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTASPEC__DELTASPEC_PARAM = eINSTANCE.getDeltaspec_Deltaspec_param();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.After_conditionImpl <em>After condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.After_conditionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAfter_condition()
     * @generated
     */
    EClass AFTER_CONDITION = eINSTANCE.getAfter_condition();

    /**
     * The meta object literal for the '<em><b>Delta id</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFTER_CONDITION__DELTA_ID = eINSTANCE.getAfter_condition_Delta_id();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.From_conditionImpl <em>From condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.From_conditionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFrom_condition()
     * @generated
     */
    EClass FROM_CONDITION = eINSTANCE.getFrom_condition();

    /**
     * The meta object literal for the '<em><b>Application condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CONDITION__APPLICATION_CONDITION = eINSTANCE.getFrom_condition_Application_condition();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.When_conditionImpl <em>When condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.When_conditionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getWhen_condition()
     * @generated
     */
    EClass WHEN_CONDITION = eINSTANCE.getWhen_condition();

    /**
     * The meta object literal for the '<em><b>Application condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CONDITION__APPLICATION_CONDITION = eINSTANCE.getWhen_condition_Application_condition();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Application_conditionImpl <em>Application condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Application_conditionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getApplication_condition()
     * @generated
     */
    EClass APPLICATION_CONDITION = eINSTANCE.getApplication_condition();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_CONDITION__OPERAND = eINSTANCE.getApplication_condition_Operand();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_CONDITION__FEATURE = eINSTANCE.getApplication_condition_Feature();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_CONDITION__LEFT = eINSTANCE.getApplication_condition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_CONDITION__RIGHT = eINSTANCE.getApplication_condition_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Product_declImpl <em>Product decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Product_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_decl()
     * @generated
     */
    EClass PRODUCT_DECL = eINSTANCE.getProduct_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_DECL__NAME = eINSTANCE.getProduct_decl_Name();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_DECL__FEATURE = eINSTANCE.getProduct_decl_Feature();

    /**
     * The meta object literal for the '<em><b>Product reconfiguration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_DECL__PRODUCT_RECONFIGURATION = eINSTANCE.getProduct_decl_Product_reconfiguration();

    /**
     * The meta object literal for the '<em><b>Product expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_DECL__PRODUCT_EXPR = eINSTANCE.getProduct_decl_Product_expr();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Product_exprImpl <em>Product expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Product_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_expr()
     * @generated
     */
    EClass PRODUCT_EXPR = eINSTANCE.getProduct_expr();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_EXPR__FEATURE = eINSTANCE.getProduct_expr_Feature();

    /**
     * The meta object literal for the '<em><b>Product Decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_EXPR__PRODUCT_DECL = eINSTANCE.getProduct_expr_ProductDecl();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_EXPR__LEFT = eINSTANCE.getProduct_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_EXPR__RIGHT = eINSTANCE.getProduct_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Product_reconfigurationImpl <em>Product reconfiguration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Product_reconfigurationImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProduct_reconfiguration()
     * @generated
     */
    EClass PRODUCT_RECONFIGURATION = eINSTANCE.getProduct_reconfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_RECONFIGURATION__NAME = eINSTANCE.getProduct_reconfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Delta id</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_RECONFIGURATION__DELTA_ID = eINSTANCE.getProduct_reconfiguration_Delta_id();

    /**
     * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_RECONFIGURATION__UPDATE = eINSTANCE.getProduct_reconfiguration_Update();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Feature_declImpl <em>Feature decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Feature_declImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl()
     * @generated
     */
    EClass FEATURE_DECL = eINSTANCE.getFeature_decl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_DECL__NAME = eINSTANCE.getFeature_decl_Name();

    /**
     * The meta object literal for the '<em><b>Feature decl group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__FEATURE_DECL_GROUP = eINSTANCE.getFeature_decl_Feature_decl_group();

    /**
     * The meta object literal for the '<em><b>Feature decl attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__FEATURE_DECL_ATTRIBUTE = eINSTANCE.getFeature_decl_Feature_decl_attribute();

    /**
     * The meta object literal for the '<em><b>Feature decl constraint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL__FEATURE_DECL_CONSTRAINT = eINSTANCE.getFeature_decl_Feature_decl_constraint();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Feature_decl_groupImpl <em>Feature decl group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Feature_decl_groupImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_group()
     * @generated
     */
    EClass FEATURE_DECL_GROUP = eINSTANCE.getFeature_decl_group();

    /**
     * The meta object literal for the '<em><b>Fnode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL_GROUP__FNODE = eINSTANCE.getFeature_decl_group_Fnode();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.FnodeImpl <em>Fnode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.FnodeImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFnode()
     * @generated
     */
    EClass FNODE = eINSTANCE.getFnode();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Feature_decl_attributeImpl <em>Feature decl attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Feature_decl_attributeImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_attribute()
     * @generated
     */
    EClass FEATURE_DECL_ATTRIBUTE = eINSTANCE.getFeature_decl_attribute();

    /**
     * The meta object literal for the '<em><b>Boundary val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL = eINSTANCE.getFeature_decl_attribute_Boundary_val();

    /**
     * The meta object literal for the '<em><b>LBoundary int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT = eINSTANCE.getFeature_decl_attribute_LBoundary_int();

    /**
     * The meta object literal for the '<em><b>UBoundary int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT = eINSTANCE.getFeature_decl_attribute_UBoundary_int();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Feature_decl_constraintImpl <em>Feature decl constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Feature_decl_constraintImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFeature_decl_constraint()
     * @generated
     */
    EClass FEATURE_DECL_CONSTRAINT = eINSTANCE.getFeature_decl_constraint();

    /**
     * The meta object literal for the '<em><b>Mexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_DECL_CONSTRAINT__MEXP = eINSTANCE.getFeature_decl_constraint_Mexp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpImpl <em>Mexp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexp()
     * @generated
     */
    EClass MEXP = eINSTANCE.getMexp();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP__VALUE = eINSTANCE.getMexp_Value();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.FextensionImpl <em>Fextension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.FextensionImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getFextension()
     * @generated
     */
    EClass FEXTENSION = eINSTANCE.getFextension();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEXTENSION__NAME = eINSTANCE.getFextension_Name();

    /**
     * The meta object literal for the '<em><b>Feature decl group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEXTENSION__FEATURE_DECL_GROUP = eINSTANCE.getFextension_Feature_decl_group();

    /**
     * The meta object literal for the '<em><b>Feature decl attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEXTENSION__FEATURE_DECL_ATTRIBUTE = eINSTANCE.getFextension_Feature_decl_attribute();

    /**
     * The meta object literal for the '<em><b>Feature decl constraint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEXTENSION__FEATURE_DECL_CONSTRAINT = eINSTANCE.getFextension_Feature_decl_constraint();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Or_exprImpl <em>Or expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Or_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getOr_expr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOr_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOr_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOr_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.And_exprImpl <em>And expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.And_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAnd_expr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAnd_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAnd_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHT = eINSTANCE.getAnd_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Equality_exprImpl <em>Equality expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Equality_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getEquality_expr()
     * @generated
     */
    EClass EQUALITY_EXPR = eINSTANCE.getEquality_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPR__LEFT = eINSTANCE.getEquality_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPR__RIGHT = eINSTANCE.getEquality_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.Comparison_exprImpl <em>Comparison expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.Comparison_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getComparison_expr()
     * @generated
     */
    EClass COMPARISON_EXPR = eINSTANCE.getComparison_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__LEFT = eINSTANCE.getComparison_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__RIGHT = eINSTANCE.getComparison_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.PlusOrMinus_exprImpl <em>Plus Or Minus expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.PlusOrMinus_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getPlusOrMinus_expr()
     * @generated
     */
    EClass PLUS_OR_MINUS_EXPR = eINSTANCE.getPlusOrMinus_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_OR_MINUS_EXPR__LEFT = eINSTANCE.getPlusOrMinus_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_OR_MINUS_EXPR__RIGHT = eINSTANCE.getPlusOrMinus_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MulDivOrMod_exprImpl <em>Mul Div Or Mod expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MulDivOrMod_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMulDivOrMod_expr()
     * @generated
     */
    EClass MUL_DIV_OR_MOD_EXPR = eINSTANCE.getMulDivOrMod_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_DIV_OR_MOD_EXPR__LEFT = eINSTANCE.getMulDivOrMod_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_DIV_OR_MOD_EXPR__RIGHT = eINSTANCE.getMulDivOrMod_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.AndGuardImpl <em>And Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.AndGuardImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAndGuard()
     * @generated
     */
    EClass AND_GUARD = eINSTANCE.getAndGuard();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_GUARD__LEFT = eINSTANCE.getAndGuard_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_GUARD__OP = eINSTANCE.getAndGuard_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_GUARD__RIGHT = eINSTANCE.getAndGuard_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.AppOr_expImpl <em>App Or exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.AppOr_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAppOr_exp()
     * @generated
     */
    EClass APP_OR_EXP = eINSTANCE.getAppOr_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.AppAnd_expImpl <em>App And exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.AppAnd_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getAppAnd_exp()
     * @generated
     */
    EClass APP_AND_EXP = eINSTANCE.getAppAnd_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.ProductOr_exprImpl <em>Product Or expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.ProductOr_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProductOr_expr()
     * @generated
     */
    EClass PRODUCT_OR_EXPR = eINSTANCE.getProductOr_expr();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.ProductAnd_expImpl <em>Product And exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.ProductAnd_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProductAnd_exp()
     * @generated
     */
    EClass PRODUCT_AND_EXP = eINSTANCE.getProductAnd_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.ProductMinus_expImpl <em>Product Minus exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.ProductMinus_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getProductMinus_exp()
     * @generated
     */
    EClass PRODUCT_MINUS_EXP = eINSTANCE.getProductMinus_exp();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpOr_expImpl <em>Mexp Or exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpOr_expImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpOr_exp()
     * @generated
     */
    EClass MEXP_OR_EXP = eINSTANCE.getMexpOr_exp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_OR_EXP__LEFT = eINSTANCE.getMexpOr_exp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_OR_EXP__RIGHT = eINSTANCE.getMexpOr_exp_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpAnd_exprImpl <em>Mexp And expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpAnd_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpAnd_expr()
     * @generated
     */
    EClass MEXP_AND_EXPR = eINSTANCE.getMexpAnd_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_AND_EXPR__LEFT = eINSTANCE.getMexpAnd_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_AND_EXPR__RIGHT = eINSTANCE.getMexpAnd_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpImplies_exprImpl <em>Mexp Implies expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpImplies_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpImplies_expr()
     * @generated
     */
    EClass MEXP_IMPLIES_EXPR = eINSTANCE.getMexpImplies_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_IMPLIES_EXPR__LEFT = eINSTANCE.getMexpImplies_expr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP_IMPLIES_EXPR__OP = eINSTANCE.getMexpImplies_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_IMPLIES_EXPR__RIGHT = eINSTANCE.getMexpImplies_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpEquality_exprImpl <em>Mexp Equality expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpEquality_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpEquality_expr()
     * @generated
     */
    EClass MEXP_EQUALITY_EXPR = eINSTANCE.getMexpEquality_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_EQUALITY_EXPR__LEFT = eINSTANCE.getMexpEquality_expr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP_EQUALITY_EXPR__OP = eINSTANCE.getMexpEquality_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_EQUALITY_EXPR__RIGHT = eINSTANCE.getMexpEquality_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpComparison_exprImpl <em>Mexp Comparison expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpComparison_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpComparison_expr()
     * @generated
     */
    EClass MEXP_COMPARISON_EXPR = eINSTANCE.getMexpComparison_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_COMPARISON_EXPR__LEFT = eINSTANCE.getMexpComparison_expr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP_COMPARISON_EXPR__OP = eINSTANCE.getMexpComparison_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_COMPARISON_EXPR__RIGHT = eINSTANCE.getMexpComparison_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpPlusOrMinus_exprImpl <em>Mexp Plus Or Minus expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpPlusOrMinus_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpPlusOrMinus_expr()
     * @generated
     */
    EClass MEXP_PLUS_OR_MINUS_EXPR = eINSTANCE.getMexpPlusOrMinus_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_PLUS_OR_MINUS_EXPR__LEFT = eINSTANCE.getMexpPlusOrMinus_expr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP_PLUS_OR_MINUS_EXPR__OP = eINSTANCE.getMexpPlusOrMinus_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_PLUS_OR_MINUS_EXPR__RIGHT = eINSTANCE.getMexpPlusOrMinus_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpMulDivOrMod_exprImpl <em>Mexp Mul Div Or Mod expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpMulDivOrMod_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpMulDivOrMod_expr()
     * @generated
     */
    EClass MEXP_MUL_DIV_OR_MOD_EXPR = eINSTANCE.getMexpMulDivOrMod_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_MUL_DIV_OR_MOD_EXPR__LEFT = eINSTANCE.getMexpMulDivOrMod_expr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEXP_MUL_DIV_OR_MOD_EXPR__OP = eINSTANCE.getMexpMulDivOrMod_expr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_MUL_DIV_OR_MOD_EXPR__RIGHT = eINSTANCE.getMexpMulDivOrMod_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.abs.impl.MexpPrimary_exprImpl <em>Mexp Primary expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.abs.impl.MexpPrimary_exprImpl
     * @see org.xtext.abs.impl.AbsPackageImpl#getMexpPrimary_expr()
     * @generated
     */
    EClass MEXP_PRIMARY_EXPR = eINSTANCE.getMexpPrimary_expr();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEXP_PRIMARY_EXPR__A = eINSTANCE.getMexpPrimary_expr_A();

  }

} //AbsPackage
