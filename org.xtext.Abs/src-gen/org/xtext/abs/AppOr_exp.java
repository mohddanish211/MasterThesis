/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Or exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.AppOr_exp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.AppOr_exp#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getAppOr_exp()
 * @model
 * @generated
 */
public interface AppOr_exp extends Application_condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Application_condition)
   * @see org.xtext.abs.AbsPackage#getAppOr_exp_Left()
   * @model containment="true"
   * @generated
   */
  Application_condition getLeft();

  /**
   * Sets the value of the '{@link org.xtext.abs.AppOr_exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Application_condition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Application_condition)
   * @see org.xtext.abs.AbsPackage#getAppOr_exp_Right()
   * @model containment="true"
   * @generated
   */
  Application_condition getRight();

  /**
   * Sets the value of the '{@link org.xtext.abs.AppOr_exp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Application_condition value);

} // AppOr_exp
