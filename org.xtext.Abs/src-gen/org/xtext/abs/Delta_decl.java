/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Delta_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_decl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_decl#getDelta_access <em>Delta access</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_decl#getModule_modifier <em>Module modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getDelta_decl()
 * @model
 * @generated
 */
public interface Delta_decl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.abs.AbsPackage#getDelta_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Delta_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getDelta_decl_P()
   * @model containment="true"
   * @generated
   */
  EList<Delta_param> getP();

  /**
   * Returns the value of the '<em><b>Delta access</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_access}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta access</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta access</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getDelta_decl_Delta_access()
   * @model containment="true"
   * @generated
   */
  EList<Delta_access> getDelta_access();

  /**
   * Returns the value of the '<em><b>Module modifier</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Module_modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module modifier</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module modifier</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getDelta_decl_Module_modifier()
   * @model containment="true"
   * @generated
   */
  EList<Module_modifier> getModule_modifier();

} // Delta_decl
