/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Module_export#getAnyPackage <em>Any Package</em>}</li>
 *   <li>{@link org.xtext.abs.Module_export#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getModule_export()
 * @model
 * @generated
 */
public interface Module_export extends Namespace_modifier
{
  /**
   * Returns the value of the '<em><b>Any Package</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Package</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Package</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getModule_export_AnyPackage()
   * @model unique="false"
   * @generated
   */
  EList<String> getAnyPackage();

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getModule_export_ImportedNamespace()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportedNamespace();

} // Module_export
