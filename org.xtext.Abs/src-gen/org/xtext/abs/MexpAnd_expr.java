/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mexp And expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.MexpAnd_expr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.MexpAnd_expr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getMexpAnd_expr()
 * @model
 * @generated
 */
public interface MexpAnd_expr extends Mexp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Mexp)
   * @see org.xtext.abs.AbsPackage#getMexpAnd_expr_Left()
   * @model containment="true"
   * @generated
   */
  Mexp getLeft();

  /**
   * Sets the value of the '{@link org.xtext.abs.MexpAnd_expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Mexp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Mexp)
   * @see org.xtext.abs.AbsPackage#getMexpAnd_expr_Right()
   * @model containment="true"
   * @generated
   */
  Mexp getRight();

  /**
   * Sets the value of the '{@link org.xtext.abs.MexpAnd_expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Mexp value);

} // MexpAnd_expr
