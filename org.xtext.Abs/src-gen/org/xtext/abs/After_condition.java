/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.After_condition#getDelta_id <em>Delta id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getAfter_condition()
 * @model
 * @generated
 */
public interface After_condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Delta id</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta id</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta id</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getAfter_condition_Delta_id()
   * @model
   * @generated
   */
  EList<Delta_decl> getDelta_id();

} // After_condition
