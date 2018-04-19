/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Trait_expr#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getTraitMethod <em>Trait Method</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getTrait_expr <em>Trait expr</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getTrait_oper <em>Trait oper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getTrait_expr()
 * @model
 * @generated
 */
public interface Trait_expr extends Trait_usage
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Method()
   * @model
   * @generated
   */
  EList<Method> getMethod();

  /**
   * Returns the value of the '<em><b>Trait Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Method</em>' reference.
   * @see #setTraitMethod(Method)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_TraitMethod()
   * @model
   * @generated
   */
  Method getTraitMethod();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTraitMethod <em>Trait Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait Method</em>' reference.
   * @see #getTraitMethod()
   * @generated
   */
  void setTraitMethod(Method value);

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
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Trait expr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait expr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait expr</em>' reference.
   * @see #setTrait_expr(Trait_expr)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Trait_expr()
   * @model
   * @generated
   */
  Trait_expr getTrait_expr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTrait_expr <em>Trait expr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait expr</em>' reference.
   * @see #getTrait_expr()
   * @generated
   */
  void setTrait_expr(Trait_expr value);

  /**
   * Returns the value of the '<em><b>Trait oper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait oper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait oper</em>' containment reference.
   * @see #setTrait_oper(Trait_oper)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Trait_oper()
   * @model containment="true"
   * @generated
   */
  Trait_oper getTrait_oper();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTrait_oper <em>Trait oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait oper</em>' containment reference.
   * @see #getTrait_oper()
   * @generated
   */
  void setTrait_oper(Trait_oper value);

} // Trait_expr
