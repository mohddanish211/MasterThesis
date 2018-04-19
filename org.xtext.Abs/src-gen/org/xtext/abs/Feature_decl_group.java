/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature decl group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Feature_decl_group#getFnode <em>Fnode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFeature_decl_group()
 * @model
 * @generated
 */
public interface Feature_decl_group extends EObject
{
  /**
   * Returns the value of the '<em><b>Fnode</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Fnode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fnode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fnode</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFeature_decl_group_Fnode()
   * @model containment="true"
   * @generated
   */
  EList<Fnode> getFnode();

} // Feature_decl_group
