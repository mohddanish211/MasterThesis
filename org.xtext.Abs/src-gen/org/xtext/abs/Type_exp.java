/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Type_exp#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Type_exp#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getType_exp()
 * @model
 * @generated
 */
public interface Type_exp extends Update_preamble_declaration
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
   * @see org.xtext.abs.AbsPackage#getType_exp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Type_exp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Type_use}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getType_exp_P()
   * @model containment="true"
   * @generated
   */
  EList<Type_use> getP();

} // Type_exp
