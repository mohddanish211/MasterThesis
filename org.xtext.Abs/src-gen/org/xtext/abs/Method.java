/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Method#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Method#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Method#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.Method#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type use</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type use</em>' containment reference.
   * @see #setType_use(Type_use)
   * @see org.xtext.abs.AbsPackage#getMethod_Type_use()
   * @model containment="true"
   * @generated
   */
  Type_use getType_use();

  /**
   * Sets the value of the '{@link org.xtext.abs.Method#getType_use <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type use</em>' containment reference.
   * @see #getType_use()
   * @generated
   */
  void setType_use(Type_use value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.abs.AbsPackage#getMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Method#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.abs.AbsPackage#getMethod_Paramlist()
   * @model containment="true"
   * @generated
   */
  Param_list getParamlist();

  /**
   * Sets the value of the '{@link org.xtext.abs.Method#getParamlist <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramlist</em>' containment reference.
   * @see #getParamlist()
   * @generated
   */
  void setParamlist(Param_list value);

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
   * @see org.xtext.abs.AbsPackage#getMethod_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmt();

} // Method
