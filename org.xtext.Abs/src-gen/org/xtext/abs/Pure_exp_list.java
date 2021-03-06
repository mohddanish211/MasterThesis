/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pure exp list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Pure_exp_list#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getPure_exp_list()
 * @model
 * @generated
 */
public interface Pure_exp_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Pure exp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Pure_exp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pure exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pure exp</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getPure_exp_list_Pure_exp()
   * @model containment="true"
   * @generated
   */
  EList<Pure_exp> getPure_exp();

} // Pure_exp_list
