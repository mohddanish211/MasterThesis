/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var or field ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Var_or_field_ref#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Var_or_field_ref#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getVar_or_field_ref()
 * @model
 * @generated
 */
public interface Var_or_field_ref extends Pure_exp
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
   * @see org.xtext.abs.AbsPackage#getVar_or_field_ref_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Var_or_field_ref#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Field_decl)
   * @see org.xtext.abs.AbsPackage#getVar_or_field_ref_Ref()
   * @model
   * @generated
   */
  Field_decl getRef();

  /**
   * Sets the value of the '{@link org.xtext.abs.Var_or_field_ref#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Field_decl value);

} // Var_or_field_ref
