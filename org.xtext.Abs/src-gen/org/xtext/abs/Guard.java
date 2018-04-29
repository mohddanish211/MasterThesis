/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Guard#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getGuard_Ref()
   * @model containment="true"
   * @generated
   */
  Var_or_field_ref getRef();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Var_or_field_ref value);

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
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getGuard_Guard()
   * @model containment="true"
   * @generated
   */
  Pure_exp getGuard();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Pure_exp value);

} // Guard
