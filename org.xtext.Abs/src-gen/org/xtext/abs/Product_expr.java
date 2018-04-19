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
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getProduct_expr_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

} // Product_expr
