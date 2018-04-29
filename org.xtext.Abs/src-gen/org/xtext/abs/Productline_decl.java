/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Productline decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Productline_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Productline_decl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.Productline_decl#getDelta_clause <em>Delta clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getProductline_decl()
 * @model
 * @generated
 */
public interface Productline_decl extends EObject
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
   * @see org.xtext.abs.AbsPackage#getProductline_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Productline_decl#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.abs.AbsPackage#getProductline_decl_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

  /**
   * Returns the value of the '<em><b>Delta clause</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_clause}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta clause</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta clause</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getProductline_decl_Delta_clause()
   * @model containment="true"
   * @generated
   */
  EList<Delta_clause> getDelta_clause();

} // Productline_decl
