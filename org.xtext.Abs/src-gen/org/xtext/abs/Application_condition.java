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
 *   <li>{@link org.xtext.abs.Application_condition#getFeature <em>Feature</em>}</li>
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

} // Application_condition
