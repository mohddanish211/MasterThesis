/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Param_decl#getType_exp <em>Type exp</em>}</li>
 *   <li>{@link org.xtext.abs.Param_decl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getParam_decl()
 * @model
 * @generated
 */
public interface Param_decl extends Delta_param
{
  /**
   * Returns the value of the '<em><b>Type exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type exp</em>' containment reference.
   * @see #setType_exp(Type_exp)
   * @see org.xtext.abs.AbsPackage#getParam_decl_Type_exp()
   * @model containment="true"
   * @generated
   */
  Type_exp getType_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Param_decl#getType_exp <em>Type exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type exp</em>' containment reference.
   * @see #getType_exp()
   * @generated
   */
  void setType_exp(Type_exp value);

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
   * @see org.xtext.abs.AbsPackage#getParam_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Param_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Param_decl
