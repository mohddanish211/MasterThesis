/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Product_expr#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.Product_expr#getProductDecl <em>Product Decl</em>}</li>
 *   <li>{@link org.xtext.abs.Product_expr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.Product_expr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getProduct_expr()
 * @model
 * @generated
 */
public interface Product_expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Feature_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getProduct_expr_Feature()
   * @model
   * @generated
   */
  EList<Feature_decl> getFeature();

  /**
   * Returns the value of the '<em><b>Product Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Decl</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Decl</em>' reference.
   * @see #setProductDecl(Product_decl)
   * @see org.xtext.abs.AbsPackage#getProduct_expr_ProductDecl()
   * @model
   * @generated
   */
  Product_decl getProductDecl();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_expr#getProductDecl <em>Product Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Decl</em>' reference.
   * @see #getProductDecl()
   * @generated
   */
  void setProductDecl(Product_decl value);

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
   * @see org.xtext.abs.AbsPackage#getProduct_expr_Left()
   * @model containment="true"
   * @generated
   */
  Product_expr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_expr#getLeft <em>Left</em>}' containment reference.
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
   * @see org.xtext.abs.AbsPackage#getProduct_expr_Right()
   * @model containment="true"
   * @generated
   */
  Product_expr getRight();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Product_expr value);

} // Product_expr
