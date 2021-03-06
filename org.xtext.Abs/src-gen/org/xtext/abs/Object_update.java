/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Object_update#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.abs.Object_update#getUpdate_preamble_declaration <em>Update preamble declaration</em>}</li>
 *   <li>{@link org.xtext.abs.Object_update#getPre <em>Pre</em>}</li>
 *   <li>{@link org.xtext.abs.Object_update#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getObject_update()
 * @model
 * @generated
 */
public interface Object_update extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' reference.
   * @see #setGuard(Guard)
   * @see org.xtext.abs.AbsPackage#getObject_update_Guard()
   * @model
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link org.xtext.abs.Object_update#getGuard <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Update preamble declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Update_preamble_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update preamble declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update preamble declaration</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getObject_update_Update_preamble_declaration()
   * @model containment="true"
   * @generated
   */
  EList<Update_preamble_declaration> getUpdate_preamble_declaration();

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Object_update_assign_stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getObject_update_Pre()
   * @model containment="true"
   * @generated
   */
  EList<Object_update_assign_stmt> getPre();

  /**
   * Returns the value of the '<em><b>Post</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Object_update_assign_stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getObject_update_Post()
   * @model containment="true"
   * @generated
   */
  EList<Object_update_assign_stmt> getPost();

} // Object_update
