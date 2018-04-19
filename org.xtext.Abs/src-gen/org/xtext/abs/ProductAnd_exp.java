/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product And exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.ProductAnd_exp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.ProductAnd_exp#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getProductAnd_exp()
 * @model
 * @generated
 */
public interface ProductAnd_exp extends Product_expr
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
   * @see #setLeft(Product_expr)
   * @see org.xtext.abs.AbsPackage#getProductAnd_exp_Left()
   * @model containment="true"
   * @generated
   */
  Product_expr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.abs.ProductAnd_exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Product_expr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Product_expr)
   * @see org.xtext.abs.AbsPackage#getProductAnd_exp_Right()
   * @model containment="true"
   * @generated
   */
  Product_expr getRight();

  /**
   * Sets the value of the '{@link org.xtext.abs.ProductAnd_exp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Product_expr value);

} // ProductAnd_exp
