/**
 * generated by Xtext 2.13.0
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
   * Returns the value of the '<em><b>Boundary val</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Boundary_val}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boundary val</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boundary val</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_Boundary_val()
   * @model containment="true"
   * @generated
   */
  EList<Boundary_val> getBoundary_val();

  /**
   * Returns the value of the '<em><b>LBoundary int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LBoundary int</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LBoundary int</em>' containment reference.
   * @see #setLBoundary_int(Boundary_int)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_LBoundary_int()
   * @model containment="true"
   * @generated
   */
  Boundary_int getLBoundary_int();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl_attribute#getLBoundary_int <em>LBoundary int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LBoundary int</em>' containment reference.
   * @see #getLBoundary_int()
   * @generated
   */
  void setLBoundary_int(Boundary_int value);

  /**
   * Returns the value of the '<em><b>UBoundary int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>UBoundary int</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>UBoundary int</em>' containment reference.
   * @see #setUBoundary_int(Boundary_int)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_attribute_UBoundary_int()
   * @model containment="true"
   * @generated
   */
  Boundary_int getUBoundary_int();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl_attribute#getUBoundary_int <em>UBoundary int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>UBoundary int</em>' containment reference.
   * @see #getUBoundary_int()
   * @generated
   */
  void setUBoundary_int(Boundary_int value);

} // Feature_decl_attribute
