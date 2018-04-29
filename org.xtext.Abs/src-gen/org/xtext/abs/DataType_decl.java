/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.DataType_decl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.DataType_decl#getData_constructor <em>Data constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getDataType_decl()
 * @model
 * @generated
 */
public interface DataType_decl extends Decl, Functional_modifier
{
  /**
   * Returns the value of the '<em><b>P</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getDataType_decl_P()
   * @model unique="false"
   * @generated
   */
  EList<String> getP();

  /**
   * Returns the value of the '<em><b>Data constructor</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Data_constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data constructor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data constructor</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getDataType_decl_Data_constructor()
   * @model containment="true"
   * @generated
   */
  EList<Data_constructor> getData_constructor();

} // DataType_decl
