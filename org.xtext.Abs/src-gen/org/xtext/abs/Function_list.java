/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Function_list#getFunction_param <em>Function param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFunction_list()
 * @model
 * @generated
 */
public interface Function_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Function param</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Function_param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function param</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFunction_list_Function_param()
   * @model containment="true"
   * @generated
   */
  EList<Function_param> getFunction_param();

} // Function_list
