/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Module_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Module_decl#getModule_export <em>Module export</em>}</li>
 *   <li>{@link org.xtext.abs.Module_decl#getModule_import <em>Module import</em>}</li>
 *   <li>{@link org.xtext.abs.Module_decl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.xtext.abs.Module_decl#getMain_block <em>Main block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getModule_decl()
 * @model
 * @generated
 */
public interface Module_decl extends EObject
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
   * @see org.xtext.abs.AbsPackage#getModule_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Module_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Module export</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Module_export}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module export</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module export</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getModule_decl_Module_export()
   * @model containment="true"
   * @generated
   */
  EList<Module_export> getModule_export();

  /**
   * Returns the value of the '<em><b>Module import</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Module_import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module import</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module import</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getModule_decl_Module_import()
   * @model containment="true"
   * @generated
   */
  EList<Module_import> getModule_import();

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getModule_decl_Decl()
   * @model containment="true"
   * @generated
   */
  EList<Decl> getDecl();

  /**
   * Returns the value of the '<em><b>Main block</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Main_block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main block</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getModule_decl_Main_block()
   * @model containment="true"
   * @generated
   */
  EList<Main_block> getMain_block();

} // Module_decl
