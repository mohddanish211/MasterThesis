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
 *   <li>{@link org.xtext.abs.Trait_expr#getTraitName <em>Trait Name</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.abs.Trait_expr#getTrait_expr <em>Trait expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getTrait_expr()
 * @model
 * @generated
 */
public interface Trait_expr extends Class_modifier_fragment
{
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
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Method()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethod();

  /**
   * Returns the value of the '<em><b>Trait Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Method</em>' containment reference.
   * @see #setTraitMethod(Method)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_TraitMethod()
   * @model containment="true"
   * @generated
   */
  Method getTraitMethod();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTraitMethod <em>Trait Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait Method</em>' containment reference.
   * @see #getTraitMethod()
   * @generated
   */
  void setTraitMethod(Method value);

  /**
   * Returns the value of the '<em><b>Trait Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Name</em>' reference.
   * @see #setTraitName(Trait_decl)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_TraitName()
   * @model
   * @generated
   */
  Trait_decl getTraitName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTraitName <em>Trait Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait Name</em>' reference.
   * @see #getTraitName()
   * @generated
   */
  void setTraitName(Trait_decl value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Trait_oper)
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Op()
   * @model containment="true"
   * @generated
   */
  Trait_oper getOp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Trait_oper value);

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
   * @see org.xtext.abs.AbsPackage#getTrait_expr_Trait_expr()
   * @model containment="true"
   * @generated
   */
  Trait_expr getTrait_expr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_expr#getTrait_expr <em>Trait expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait expr</em>' containment reference.
   * @see #getTrait_expr()
   * @generated
   */
  void setTrait_expr(Trait_expr value);

} // Trait_expr
