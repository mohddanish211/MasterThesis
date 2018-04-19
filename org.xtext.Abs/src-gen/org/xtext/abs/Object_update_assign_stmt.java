/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object update assign stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Object_update_assign_stmt#getVar_or_field_ref <em>Var or field ref</em>}</li>
 *   <li>{@link org.xtext.abs.Object_update_assign_stmt#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getObject_update_assign_stmt()
 * @model
 * @generated
 */
public interface Object_update_assign_stmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Var or field ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var or field ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var or field ref</em>' reference.
   * @see #setVar_or_field_ref(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getObject_update_assign_stmt_Var_or_field_ref()
   * @model
   * @generated
   */
  Var_or_field_ref getVar_or_field_ref();

  /**
   * Sets the value of the '{@link org.xtext.abs.Object_update_assign_stmt#getVar_or_field_ref <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var or field ref</em>' reference.
   * @see #getVar_or_field_ref()
   * @generated
   */
  void setVar_or_field_ref(Var_or_field_ref value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see org.xtext.abs.AbsPackage#getObject_update_assign_stmt_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Object_update_assign_stmt#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // Object_update_assign_stmt
