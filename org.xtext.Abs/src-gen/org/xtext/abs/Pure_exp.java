/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Pure_exp#getFunction_list <em>Function list</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getPartial_function_pure_exp_list <em>Partial function pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getFunction_expr <em>Function expr</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getVariadic_exp_list <em>Variadic exp list</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getElse <em>Else</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getCasebranch <em>Casebranch</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getB <em>B</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getVar_or_field_ref <em>Var or field ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getPure_exp()
 * @model
 * @generated
 */
public interface Pure_exp extends Exp
{
  /**
   * Returns the value of the '<em><b>Function list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Function_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function list</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getPure_exp_Function_list()
   * @model containment="true"
   * @generated
   */
  EList<Function_list> getFunction_list();

  /**
   * Returns the value of the '<em><b>Partial function pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial function pure exp list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial function pure exp list</em>' containment reference.
   * @see #setPartial_function_pure_exp_list(Pure_exp_list)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Partial_function_pure_exp_list()
   * @model containment="true"
   * @generated
   */
  Pure_exp_list getPartial_function_pure_exp_list();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getPartial_function_pure_exp_list <em>Partial function pure exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial function pure exp list</em>' containment reference.
   * @see #getPartial_function_pure_exp_list()
   * @generated
   */
  void setPartial_function_pure_exp_list(Pure_exp_list value);

  /**
   * Returns the value of the '<em><b>Function expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function expr</em>' containment reference.
   * @see #setFunction_expr(Pure_exp_list)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Function_expr()
   * @model containment="true"
   * @generated
   */
  Pure_exp_list getFunction_expr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getFunction_expr <em>Function expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function expr</em>' containment reference.
   * @see #getFunction_expr()
   * @generated
   */
  void setFunction_expr(Pure_exp_list value);

  /**
   * Returns the value of the '<em><b>Variadic exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variadic exp list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variadic exp list</em>' containment reference.
   * @see #setVariadic_exp_list(Pure_exp_list)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Variadic_exp_list()
   * @model containment="true"
   * @generated
   */
  Pure_exp_list getVariadic_exp_list();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getVariadic_exp_list <em>Variadic exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variadic exp list</em>' containment reference.
   * @see #getVariadic_exp_list()
   * @generated
   */
  void setVariadic_exp_list(Pure_exp_list value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_C()
   * @model containment="true"
   * @generated
   */
  Pure_exp getC();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Pure_exp value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_L()
   * @model containment="true"
   * @generated
   */
  Pure_exp getL();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Else()
   * @model containment="true"
   * @generated
   */
  Pure_exp getElse();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Casebranch</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Case_branch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Casebranch</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Casebranch</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getPure_exp_Casebranch()
   * @model containment="true"
   * @generated
   */
  EList<Case_branch> getCasebranch();

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
   * @see org.xtext.abs.AbsPackage#getPure_exp_Type_use()
   * @model containment="true"
   * @generated
   */
  Type_use getType_use();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getType_use <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type use</em>' containment reference.
   * @see #getType_use()
   * @generated
   */
  void setType_use(Type_use value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>I</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' containment reference.
   * @see #setI(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_I()
   * @model containment="true"
   * @generated
   */
  Pure_exp getI();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getI <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' containment reference.
   * @see #getI()
   * @generated
   */
  void setI(Pure_exp value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_B()
   * @model containment="true"
   * @generated
   */
  Pure_exp getB();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Var or field ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var or field ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var or field ref</em>' reference.
   * @see #setVar_or_field_ref(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Var_or_field_ref()
   * @model
   * @generated
   */
  Var_or_field_ref getVar_or_field_ref();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getVar_or_field_ref <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var or field ref</em>' reference.
   * @see #getVar_or_field_ref()
   * @generated
   */
  void setVar_or_field_ref(Var_or_field_ref value);

} // Pure_exp
