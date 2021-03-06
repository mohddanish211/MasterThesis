/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mexp Primary expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.MexpPrimary_expr#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getMexpPrimary_expr()
 * @model
 * @generated
 */
public interface MexpPrimary_expr extends Mexp
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Mexp)
   * @see org.xtext.abs.AbsPackage#getMexpPrimary_expr_A()
   * @model containment="true"
   * @generated
   */
  Mexp getA();

  /**
   * Sets the value of the '{@link org.xtext.abs.MexpPrimary_expr#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Mexp value);

} // MexpPrimary_expr
