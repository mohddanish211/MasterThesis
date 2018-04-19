/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product reconfiguration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Product_reconfiguration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Product_reconfiguration#getDelta_id <em>Delta id</em>}</li>
 *   <li>{@link org.xtext.abs.Product_reconfiguration#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getProduct_reconfiguration()
 * @model
 * @generated
 */
public interface Product_reconfiguration extends EObject
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
   * @see org.xtext.abs.AbsPackage#getProduct_reconfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_reconfiguration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Delta id</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_id}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta id</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getProduct_reconfiguration_Delta_id()
   * @model containment="true"
   * @generated
   */
  EList<Delta_id> getDelta_id();

  /**
   * Returns the value of the '<em><b>Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update</em>' attribute.
   * @see #setUpdate(String)
   * @see org.xtext.abs.AbsPackage#getProduct_reconfiguration_Update()
   * @model
   * @generated
   */
  String getUpdate();

  /**
   * Sets the value of the '{@link org.xtext.abs.Product_reconfiguration#getUpdate <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update</em>' attribute.
   * @see #getUpdate()
   * @generated
   */
  void setUpdate(String value);

} // Product_reconfiguration
