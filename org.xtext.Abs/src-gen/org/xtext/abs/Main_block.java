/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Main_block#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getMain_block()
 * @model
 * @generated
 */
public interface Main_block extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getMain_block_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmt();

} // Main_block
