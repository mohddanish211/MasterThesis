/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Field_decl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.Field_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Field_decl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getField_decl()
 * @model
 * @generated
 */
public interface Field_decl extends Class_modifier_fragment
{
  /**
   * Returns the value of the '<em><b>Type use</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type use</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type use</em>' containment reference.
   * @see #setType_use(Type_use)
   * @see org.xtext.abs.AbsPackage#getField_decl_Type_use()
   * @model containment="true"
   * @generated
   */
  Type_use getType_use();

  /**
   * Sets the value of the '{@link org.xtext.abs.Field_decl#getType_use <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type use</em>' containment reference.
   * @see #getType_use()
   * @generated
   */
  void setType_use(Type_use value);

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
   * @see org.xtext.abs.AbsPackage#getField_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Field_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pure exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pure exp</em>' containment reference.
   * @see #setPure_exp(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getField_decl_Pure_exp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getPure_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Field_decl#getPure_exp <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp</em>' containment reference.
   * @see #getPure_exp()
   * @generated
   */
  void setPure_exp(Pure_exp value);

} // Field_decl
