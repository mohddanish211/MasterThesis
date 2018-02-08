/**
 * generated by Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Module_import#getStar <em>Star</em>}</li>
 *   <li>{@link org.xtext.abs.Module_import#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.xtext.abs.Module_import#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getModule_import()
 * @model
 * @generated
 */
public interface Module_import extends EObject
{
  /**
   * Returns the value of the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Star</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Star</em>' attribute.
   * @see #setStar(String)
   * @see org.xtext.abs.AbsPackage#getModule_import_Star()
   * @model
   * @generated
   */
  String getStar();

  /**
   * Sets the value of the '{@link org.xtext.abs.Module_import#getStar <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Star</em>' attribute.
   * @see #getStar()
   * @generated
   */
  void setStar(String value);

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see org.xtext.abs.AbsPackage#getModule_import_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link org.xtext.abs.Module_import#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getModule_import_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // Module_import