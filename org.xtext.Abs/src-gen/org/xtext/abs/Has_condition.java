/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Has_condition#getField <em>Field</em>}</li>
 *   <li>{@link org.xtext.abs.Has_condition#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.Has_condition#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getHas_condition()
 * @model
 * @generated
 */
public interface Has_condition extends Delta_param
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field_decl)
   * @see org.xtext.abs.AbsPackage#getHas_condition_Field()
   * @model
   * @generated
   */
  Field_decl getField();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field_decl value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' reference.
   * @see #setMethod(Methodsig)
   * @see org.xtext.abs.AbsPackage#getHas_condition_Method()
   * @model
   * @generated
   */
  Methodsig getMethod();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getMethod <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(Methodsig value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(Interface_decl)
   * @see org.xtext.abs.AbsPackage#getHas_condition_Interface()
   * @model
   * @generated
   */
  Interface_decl getInterface();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface_decl value);

} // Has_condition
