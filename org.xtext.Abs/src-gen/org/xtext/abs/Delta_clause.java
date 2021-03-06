/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Delta_clause#getDeltaspec <em>Deltaspec</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_clause#getAfter_condition <em>After condition</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_clause#getFrom_condition <em>From condition</em>}</li>
 *   <li>{@link org.xtext.abs.Delta_clause#getWhen_condition <em>When condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getDelta_clause()
 * @model
 * @generated
 */
public interface Delta_clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Deltaspec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deltaspec</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deltaspec</em>' reference.
   * @see #setDeltaspec(Delta_decl)
   * @see org.xtext.abs.AbsPackage#getDelta_clause_Deltaspec()
   * @model
   * @generated
   */
  Delta_decl getDeltaspec();

  /**
   * Sets the value of the '{@link org.xtext.abs.Delta_clause#getDeltaspec <em>Deltaspec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deltaspec</em>' reference.
   * @see #getDeltaspec()
   * @generated
   */
  void setDeltaspec(Delta_decl value);

  /**
   * Returns the value of the '<em><b>After condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After condition</em>' containment reference.
   * @see #setAfter_condition(After_condition)
   * @see org.xtext.abs.AbsPackage#getDelta_clause_After_condition()
   * @model containment="true"
   * @generated
   */
  After_condition getAfter_condition();

  /**
   * Sets the value of the '{@link org.xtext.abs.Delta_clause#getAfter_condition <em>After condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After condition</em>' containment reference.
   * @see #getAfter_condition()
   * @generated
   */
  void setAfter_condition(After_condition value);

  /**
   * Returns the value of the '<em><b>From condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From condition</em>' containment reference.
   * @see #setFrom_condition(From_condition)
   * @see org.xtext.abs.AbsPackage#getDelta_clause_From_condition()
   * @model containment="true"
   * @generated
   */
  From_condition getFrom_condition();

  /**
   * Sets the value of the '{@link org.xtext.abs.Delta_clause#getFrom_condition <em>From condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From condition</em>' containment reference.
   * @see #getFrom_condition()
   * @generated
   */
  void setFrom_condition(From_condition value);

  /**
   * Returns the value of the '<em><b>When condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When condition</em>' containment reference.
   * @see #setWhen_condition(When_condition)
   * @see org.xtext.abs.AbsPackage#getDelta_clause_When_condition()
   * @model containment="true"
   * @generated
   */
  When_condition getWhen_condition();

  /**
   * Sets the value of the '{@link org.xtext.abs.Delta_clause#getWhen_condition <em>When condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When condition</em>' containment reference.
   * @see #getWhen_condition()
   * @generated
   */
  void setWhen_condition(When_condition value);

} // Delta_clause
