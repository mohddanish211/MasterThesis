/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait oper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Trait_oper#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_oper#getMethodsig <em>Methodsig</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_oper#getTrait_expr <em>Trait expr</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_oper#getTrait_exp <em>Trait exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getTrait_oper()
 * @model
 * @generated
 */
public interface Trait_oper extends Class_modifier_fragment
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(Methodsig)
   * @see org.xtext.abs.AbsPackage#getTrait_oper_Method()
   * @model containment="true"
   * @generated
   */
  Methodsig getMethod();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_oper#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Methodsig value);

  /**
   * Returns the value of the '<em><b>Methodsig</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Methodsig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodsig</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodsig</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getTrait_oper_Methodsig()
   * @model containment="true"
   * @generated
   */
  EList<Methodsig> getMethodsig();

  /**
   * Returns the value of the '<em><b>Trait expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait expr</em>' containment reference.
   * @see #setTrait_expr(Trait_expr)
   * @see org.xtext.abs.AbsPackage#getTrait_oper_Trait_expr()
   * @model containment="true"
   * @generated
   */
  Trait_expr getTrait_expr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_oper#getTrait_expr <em>Trait expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait expr</em>' containment reference.
   * @see #getTrait_expr()
   * @generated
   */
  void setTrait_expr(Trait_expr value);

  /**
   * Returns the value of the '<em><b>Trait exp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait exp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait exp</em>' reference.
   * @see #setTrait_exp(Trait_expr)
   * @see org.xtext.abs.AbsPackage#getTrait_oper_Trait_exp()
   * @model
   * @generated
   */
  Trait_expr getTrait_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_oper#getTrait_exp <em>Trait exp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait exp</em>' reference.
   * @see #getTrait_exp()
   * @generated
   */
  void setTrait_exp(Trait_expr value);

} // Trait_oper
