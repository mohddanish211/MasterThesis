/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Annotation#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
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
   * @see org.xtext.abs.AbsPackage#getAnnotation_Pure_exp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getPure_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Annotation#getPure_exp <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp</em>' containment reference.
   * @see #getPure_exp()
   * @generated
   */
  void setPure_exp(Pure_exp value);

} // Annotation
