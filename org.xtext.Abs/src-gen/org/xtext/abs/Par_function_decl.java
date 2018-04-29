/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Par function decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Par_function_decl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Par_function_decl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.Par_function_decl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.abs.Par_function_decl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.abs.Par_function_decl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getPar_function_decl()
 * @model
 * @generated
 */
public interface Par_function_decl extends Decl
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
   * @see org.xtext.abs.AbsPackage#getPar_function_decl_Type_use()
   * @model containment="true"
   * @generated
   */
  Type_use getType_use();

  /**
   * Sets the value of the '{@link org.xtext.abs.Par_function_decl#getType_use <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type use</em>' containment reference.
   * @see #getType_use()
   * @generated
   */
  void setType_use(Type_use value);

  /**
   * Returns the value of the '<em><b>P</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getPar_function_decl_P()
   * @model unique="false"
   * @generated
   */
  EList<String> getP();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference.
   * @see #setFunctions(Function_name_list)
   * @see org.xtext.abs.AbsPackage#getPar_function_decl_Functions()
   * @model containment="true"
   * @generated
   */
  Function_name_list getFunctions();

  /**
   * Sets the value of the '{@link org.xtext.abs.Par_function_decl#getFunctions <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functions</em>' containment reference.
   * @see #getFunctions()
   * @generated
   */
  void setFunctions(Function_name_list value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(Param_list)
   * @see org.xtext.abs.AbsPackage#getPar_function_decl_Params()
   * @model containment="true"
   * @generated
   */
  Param_list getParams();

  /**
   * Sets the value of the '{@link org.xtext.abs.Par_function_decl#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(Param_list value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPar_function_decl_E()
   * @model containment="true"
   * @generated
   */
  Pure_exp getE();

  /**
   * Sets the value of the '{@link org.xtext.abs.Par_function_decl#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Pure_exp value);

} // Par_function_decl
