/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Class_decl#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getField_decl <em>Field decl</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getCasestmtbranch <em>Casestmtbranch</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getTrait_usage <em>Trait usage</em>}</li>
 *   <li>{@link org.xtext.abs.Class_decl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getClass_decl()
 * @model
 * @generated
 */
public interface Class_decl extends Decl
{
  /**
   * Returns the value of the '<em><b>Paramlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramlist</em>' containment reference.
   * @see #setParamlist(Param_list)
   * @see org.xtext.abs.AbsPackage#getClass_decl_Paramlist()
   * @model containment="true"
   * @generated
   */
  Param_list getParamlist();

  /**
   * Sets the value of the '{@link org.xtext.abs.Class_decl#getParamlist <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramlist</em>' containment reference.
   * @see #getParamlist()
   * @generated
   */
  void setParamlist(Param_list value);

  /**
   * Returns the value of the '<em><b>Interface name</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Interface_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface name</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface name</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Interface_name()
   * @model
   * @generated
   */
  EList<Interface_decl> getInterface_name();

  /**
   * Returns the value of the '<em><b>Field decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Field_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Field_decl()
   * @model containment="true"
   * @generated
   */
  EList<Field_decl> getField_decl();

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmt();

  /**
   * Returns the value of the '<em><b>Casestmtbranch</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Casestmtbranch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Casestmtbranch</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Casestmtbranch</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Casestmtbranch()
   * @model containment="true"
   * @generated
   */
  EList<Casestmtbranch> getCasestmtbranch();

  /**
   * Returns the value of the '<em><b>Trait usage</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Trait_usage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait usage</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait usage</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Trait_usage()
   * @model containment="true"
   * @generated
   */
  EList<Trait_usage> getTrait_usage();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_decl_Method()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethod();

} // Class_decl
