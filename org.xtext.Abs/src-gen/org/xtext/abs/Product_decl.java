/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Product_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Product_decl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.Product_decl#getProduct_reconfiguration <em>Product reconfiguration</em>}</li>
 *   <li>{@link org.xtext.abs.Product_decl#getProduct_expr <em>Product expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getProduct_decl()
 * @model
 * @generated
 */
public interface Product_decl extends EObject
{
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
   * @see org.xtext.abs.AbsPackage#getProduct_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getProduct_decl_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

  /**
   * Returns the value of the '<em><b>Product reconfiguration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Product_reconfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product reconfiguration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product reconfiguration</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getProduct_decl_Product_reconfiguration()
   * @model containment="true"
   * @generated
   */
  EList<Product_reconfiguration> getProduct_reconfiguration();

  /**
   * Returns the value of the '<em><b>Product expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product expr</em>' containment reference.
   * @see #setProduct_expr(Product_expr)
   * @see org.xtext.abs.AbsPackage#getProduct_decl_Product_expr()
   * @model containment="true"
   * @generated
   */
  Product_expr getProduct_expr();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_decl#getProduct_expr <em>Product expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product expr</em>' containment reference.
   * @see #getProduct_expr()
   * @generated
   */
  void setProduct_expr(Product_expr value);

} // Product_decl
