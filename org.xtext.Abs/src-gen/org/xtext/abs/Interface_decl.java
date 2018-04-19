/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Interface_decl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link org.xtext.abs.Interface_decl#getMethodsig <em>Methodsig</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getInterface_decl()
 * @model
 * @generated
 */
public interface Interface_decl extends Decl
{
  /**
   * Returns the value of the '<em><b>Interface name</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Interface_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface name</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface name</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getInterface_decl_Interface_name()
   * @model
   * @generated
   */
  EList<Interface_decl> getInterface_name();

  /**
   * Returns the value of the '<em><b>Methodsig</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Methodsig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodsig</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodsig</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getInterface_decl_Methodsig()
   * @model containment="true"
   * @generated
   */
  EList<Methodsig> getMethodsig();

} // Interface_decl
