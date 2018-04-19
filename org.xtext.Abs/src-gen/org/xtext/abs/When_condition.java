/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.When_condition#getApplication_condition <em>Application condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getWhen_condition()
 * @model
 * @generated
 */
public interface When_condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Application condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application condition</em>' containment reference.
   * @see #setApplication_condition(Application_condition)
   * @see org.xtext.abs.AbsPackage#getWhen_condition_Application_condition()
   * @model containment="true"
   * @generated
   */
  Application_condition getApplication_condition();

  /**
   * Sets the value of the '{@link org.xtext.abs.When_condition#getApplication_condition <em>Application condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application condition</em>' containment reference.
   * @see #getApplication_condition()
   * @generated
   */
  void setApplication_condition(Application_condition value);

} // When_condition
