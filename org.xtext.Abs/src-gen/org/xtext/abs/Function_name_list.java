/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function name list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Function_name_list#getFunction_name_decl <em>Function name decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFunction_name_list()
 * @model
 * @generated
 */
public interface Function_name_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Function name decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Function_name_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function name decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function name decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFunction_name_list_Function_name_decl()
   * @model containment="true"
   * @generated
   */
  EList<Function_name_decl> getFunction_name_decl();

} // Function_name_list
