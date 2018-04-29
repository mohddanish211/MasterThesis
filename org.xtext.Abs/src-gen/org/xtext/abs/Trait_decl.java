/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Trait_decl#getTraitExpr <em>Trait Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getTrait_decl()
 * @model
 * @generated
 */
public interface Trait_decl extends Decl
{
  /**
   * Returns the value of the '<em><b>Trait Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Expr</em>' containment reference.
   * @see #setTraitExpr(Trait_expr)
   * @see org.xtext.abs.AbsPackage#getTrait_decl_TraitExpr()
   * @model containment="true"
   * @generated
   */
  Trait_expr getTraitExpr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Trait_decl#getTraitExpr <em>Trait Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trait Expr</em>' containment reference.
   * @see #getTraitExpr()
   * @generated
   */
  void setTraitExpr(Trait_expr value);

} // Trait_decl
