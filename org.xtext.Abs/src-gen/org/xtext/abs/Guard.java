/**
 * generated by Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Guard#getVar_or_field_ref <em>Var or field ref</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getUpdate_preamble_declaration <em>Update preamble declaration</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getPre <em>Pre</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends Object_update
{
  /**
   * Returns the value of the '<em><b>Var or field ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var or field ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var or field ref</em>' reference.
   * @see #setVar_or_field_ref(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getGuard_Var_or_field_ref()
   * @model
   * @generated
   */
  Var_or_field_ref getVar_or_field_ref();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getVar_or_field_ref <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var or field ref</em>' reference.
   * @see #getVar_or_field_ref()
   * @generated
   */
  void setVar_or_field_ref(Var_or_field_ref value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getGuard_Min()
   * @model containment="true"
   * @generated
   */
  Pure_exp getMin();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getGuard_Max()
   * @model containment="true"
   * @generated
   */
  Pure_exp getMax();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(Pure_exp value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getGuard_E()
   * @model containment="true"
   * @generated
   */
  Pure_exp getE();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Update preamble declaration</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Update_preamble_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update preamble declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update preamble declaration</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getGuard_Update_preamble_declaration()
   * @model containment="true"
   * @generated
   */
  EList<Update_preamble_declaration> getUpdate_preamble_declaration();

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Object_update_assign_stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getGuard_Pre()
   * @model containment="true"
   * @generated
   */
  EList<Object_update_assign_stmt> getPre();

  /**
   * Returns the value of the '<em><b>Post</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Object_update_assign_stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getGuard_Post()
   * @model containment="true"
   * @generated
   */
  EList<Object_update_assign_stmt> getPost();

} // Guard
