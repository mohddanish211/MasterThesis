/**
 * generated by Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Function_param#getFunction_param <em>Function param</em>}</li>
 *   <li>{@link org.xtext.abs.Function_param#getAnon_param <em>Anon param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFunction_param()
 * @model
 * @generated
 */
public interface Function_param extends EObject
{
  /**
   * Returns the value of the '<em><b>Function param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function param</em>' containment reference.
   * @see #setFunction_param(Function_name_param_decl)
   * @see org.xtext.abs.AbsPackage#getFunction_param_Function_param()
   * @model containment="true"
   * @generated
   */
  Function_name_param_decl getFunction_param();

  /**
   * Sets the value of the '{@link org.xtext.abs.Function_param#getFunction_param <em>Function param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function param</em>' containment reference.
   * @see #getFunction_param()
   * @generated
   */
  void setFunction_param(Function_name_param_decl value);

  /**
   * Returns the value of the '<em><b>Anon param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anon param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anon param</em>' containment reference.
   * @see #setAnon_param(Anon_function_decl)
   * @see org.xtext.abs.AbsPackage#getFunction_param_Anon_param()
   * @model containment="true"
   * @generated
   */
  Anon_function_decl getAnon_param();

  /**
   * Sets the value of the '{@link org.xtext.abs.Function_param#getAnon_param <em>Anon param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anon param</em>' containment reference.
   * @see #getAnon_param()
   * @generated
   */
  void setAnon_param(Anon_function_decl value);

} // Function_param
