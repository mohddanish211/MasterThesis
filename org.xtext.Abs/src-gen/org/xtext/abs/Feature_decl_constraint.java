/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature decl constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Feature_decl_constraint#getMexp <em>Mexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFeature_decl_constraint()
 * @model
 * @generated
 */
public interface Feature_decl_constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Mexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mexp</em>' containment reference.
   * @see #setMexp(Mexp)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_constraint_Mexp()
   * @model containment="true"
   * @generated
   */
  Mexp getMexp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl_constraint#getMexp <em>Mexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mexp</em>' containment reference.
   * @see #getMexp()
   * @generated
   */
  void setMexp(Mexp value);

} // Feature_decl_constraint
