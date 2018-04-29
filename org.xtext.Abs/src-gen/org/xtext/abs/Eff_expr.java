/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eff expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Eff_expr#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getPure_exp_list <em>Pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getEff_expr()
 * @model
 * @generated
 */
public interface Eff_expr extends Exp
{
  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(String)
   * @see org.xtext.abs.AbsPackage#getEff_expr_L()
   * @model
   * @generated
   */
  String getL();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #getL()
   * @generated
   */
  void setL(String value);

  /**
   * Returns the value of the '<em><b>Pure exp list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pure exp list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pure exp list</em>' containment reference.
   * @see #setPure_exp_list(Pure_exp_list)
   * @see org.xtext.abs.AbsPackage#getEff_expr_Pure_exp_list()
   * @model containment="true"
   * @generated
   */
  Pure_exp_list getPure_exp_list();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getPure_exp_list <em>Pure exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp list</em>' containment reference.
   * @see #getPure_exp_list()
   * @generated
   */
  void setPure_exp_list(Pure_exp_list value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Pure_exp_list}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getEff_expr_List()
   * @model containment="true"
   * @generated
   */
  EList<Pure_exp_list> getList();

} // Eff_expr
