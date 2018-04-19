/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Data_constructor#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Data_constructor#getData_constructor_arg <em>Data constructor arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getData_constructor()
 * @model
 * @generated
 */
public interface Data_constructor extends EObject
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
   * @see org.xtext.abs.AbsPackage#getData_constructor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Data_constructor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data constructor arg</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Data_constructor_arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data constructor arg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data constructor arg</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getData_constructor_Data_constructor_arg()
   * @model containment="true"
   * @generated
   */
  EList<Data_constructor_arg> getData_constructor_arg();

} // Data_constructor
