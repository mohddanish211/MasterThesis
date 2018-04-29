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
 *   <li>{@link org.xtext.abs.Pure_exp#getVariadic_exp_list <em>Variadic exp list</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getElse <em>Else</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getCasebranch <em>Casebranch</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getB <em>B</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getPure_exp <em>Pure exp</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getAwait <em>Await</em>}</li>
 *   <li>{@link org.xtext.abs.Pure_exp#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getPure_exp()
 * @model
 * @generated
 */
public interface Pure_exp extends Exp, Eff_expr
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
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_If()
   * @model containment="true"
   * @generated
   */
  Pure_exp getIf();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Then()
   * @model containment="true"
   * @generated
   */
  Pure_exp getThen();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Pure_exp value);

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
   * Returns the value of the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference.
   * @see #setCase(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Case()
   * @model containment="true"
   * @generated
   */
  Pure_exp getCase();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getCase <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' containment reference.
   * @see #getCase()
   * @generated
   */
  void setCase(Pure_exp value);

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
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see org.xtext.abs.AbsPackage#getPure_exp_Pure_exp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getPure_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getPure_exp <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp</em>' containment reference.
   * @see #getPure_exp()
   * @generated
   */
  void setPure_exp(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Await</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Await</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Await</em>' attribute.
   * @see #setAwait(String)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Await()
   * @model
   * @generated
   */
  String getAwait();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getAwait <em>Await</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Await</em>' attribute.
   * @see #getAwait()
   * @generated
   */
  void setAwait(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.xtext.abs.AbsPackage#getPure_exp_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.xtext.abs.Pure_exp#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

} // Pure_exp
