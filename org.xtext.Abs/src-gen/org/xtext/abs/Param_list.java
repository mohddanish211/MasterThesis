/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Param_list#getParam_decl <em>Param decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getParam_list()
 * @model
 * @generated
 */
public interface Param_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Param decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Param_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getParam_list_Param_decl()
   * @model containment="true"
   * @generated
   */
  EList<Param_decl> getParam_decl();

} // Param_list
