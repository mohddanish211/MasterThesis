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
 *   <li>{@link org.xtext.abs.Has_condition#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.abs.Has_condition#getM <em>M</em>}</li>
 *   <li>{@link org.xtext.abs.Has_condition#getI <em>I</em>}</li>
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
   * Returns the value of the '<em><b>F</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' reference.
   * @see #setF(Field_decl)
   * @see org.xtext.abs.AbsPackage#getHas_condition_F()
   * @model
   * @generated
   */
  Field_decl getF();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getF <em>F</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' reference.
   * @see #getF()
   * @generated
   */
  void setF(Field_decl value);

  /**
   * Returns the value of the '<em><b>M</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' reference.
   * @see #setM(Methodsig)
   * @see org.xtext.abs.AbsPackage#getHas_condition_M()
   * @model
   * @generated
   */
  Methodsig getM();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getM <em>M</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' reference.
   * @see #getM()
   * @generated
   */
  void setM(Methodsig value);

  /**
   * Returns the value of the '<em><b>I</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' reference.
   * @see #setI(Interface_decl)
   * @see org.xtext.abs.AbsPackage#getHas_condition_I()
   * @model
   * @generated
   */
  Interface_decl getI();

  /**
   * Sets the value of the '{@link org.xtext.abs.Has_condition#getI <em>I</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' reference.
   * @see #getI()
   * @generated
   */
  void setI(Interface_decl value);

} // Has_condition
