/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Function_decl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Function_decl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.Function_decl#getParamlist <em>Paramlist</em>}</li>
 *   <li>{@link org.xtext.abs.Function_decl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFunction_decl()
 * @model
 * @generated
 */
public interface Function_decl extends Decl, Functional_modifier
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
   * @see org.xtext.abs.AbsPackage#getFunction_decl_Type_use()
   * @model containment="true"
   * @generated
   */
  Type_use getType_use();

  /**
   * Sets the value of the '{@link org.xtext.abs.Function_decl#getType_use <em>Type use</em>}' containment reference.
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
   * @see org.xtext.abs.AbsPackage#getFunction_decl_P()
   * @model unique="false"
   * @generated
   */
  EList<String> getP();

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
   * @see org.xtext.abs.AbsPackage#getFunction_decl_Paramlist()
   * @model containment="true"
   * @generated
   */
  Param_list getParamlist();

  /**
   * Sets the value of the '{@link org.xtext.abs.Function_decl#getParamlist <em>Paramlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramlist</em>' containment reference.
   * @see #getParamlist()
   * @generated
   */
  void setParamlist(Param_list value);

  /**
   * Returns the value of the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pure exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pure exp</em>' containment reference.
   * @see #setPure_exp(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getFunction_decl_Pure_exp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getPure_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Function_decl#getPure_exp <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp</em>' containment reference.
   * @see #getPure_exp()
   * @generated
   */
  void setPure_exp(Pure_exp value);

} // Function_decl
