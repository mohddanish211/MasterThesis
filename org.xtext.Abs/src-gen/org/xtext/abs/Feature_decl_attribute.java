/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature decl attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Feature_decl_attribute#getBoundary_val <em>Boundary val</em>}</li>
 *   <li>{@link org.xtext.abs.Feature_decl_attribute#getLBoundary_int <em>LBoundary int</em>}</li>
 *   <li>{@link org.xtext.abs.Feature_decl_attribute#getUBoundary_int <em>UBoundary int</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute()
 * @model
 * @generated
 */
public interface Feature_decl_attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Boundary val</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boundary val</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boundary val</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_Boundary_val()
   * @model unique="false"
   * @generated
   */
  EList<String> getBoundary_val();

  /**
   * Returns the value of the '<em><b>LBoundary int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LBoundary int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LBoundary int</em>' attribute.
   * @see #setLBoundary_int(String)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_LBoundary_int()
   * @model
   * @generated
   */
  String getLBoundary_int();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl_attribute#getLBoundary_int <em>LBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LBoundary int</em>' attribute.
   * @see #getLBoundary_int()
   * @generated
   */
  void setLBoundary_int(String value);

  /**
   * Returns the value of the '<em><b>UBoundary int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>UBoundary int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>UBoundary int</em>' attribute.
   * @see #setUBoundary_int(String)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_UBoundary_int()
   * @model
   * @generated
   */
  String getUBoundary_int();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl_attribute#getUBoundary_int <em>UBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>UBoundary int</em>' attribute.
   * @see #getUBoundary_int()
   * @generated
   */
  void setUBoundary_int(String value);

} // Feature_decl_attribute
