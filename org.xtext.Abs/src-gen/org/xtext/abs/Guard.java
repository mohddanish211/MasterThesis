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
 *   <li>{@link org.xtext.abs.Guard#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.abs.Guard#getE <em>E</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getGuard_Name()
   * @model
   * @generated
   */
  Var_or_field_ref getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Guard#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Var_or_field_ref value);

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

} // Guard
