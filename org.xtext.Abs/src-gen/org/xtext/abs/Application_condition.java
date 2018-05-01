/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Application_condition#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.xtext.abs.Application_condition#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.Application_condition#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.abs.Application_condition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getApplication_condition()
 * @model
 * @generated
 */
public interface Application_condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(Application_condition)
   * @see org.xtext.abs.AbsPackage#getApplication_condition_Operand()
   * @model containment="true"
   * @generated
   */
  Application_condition getOperand();

  /**
   * Sets the value of the '{@link org.xtext.abs.Application_condition#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Application_condition value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(Feature)
   * @see org.xtext.abs.AbsPackage#getApplication_condition_Feature()
   * @model containment="true"
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.xtext.abs.Application_condition#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

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
   * @see org.xtext.abs.AbsPackage#getApplication_condition_Left()
   * @model containment="true"
   * @generated
   */
  Application_condition getLeft();

  /**
   * Sets the value of the '{@link org.xtext.abs.Application_condition#getLeft <em>Left</em>}' containment reference.
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
   * @see org.xtext.abs.AbsPackage#getApplication_condition_Right()
   * @model containment="true"
   * @generated
   */
  Application_condition getRight();

  /**
   * Sets the value of the '{@link org.xtext.abs.Application_condition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Application_condition value);

} // Application_condition
