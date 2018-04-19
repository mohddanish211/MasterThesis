/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface modifier fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Interface_modifier_fragment#getRemovedMethod <em>Removed Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getInterface_modifier_fragment()
 * @model
 * @generated
 */
public interface Interface_modifier_fragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Removed Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removed Method</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removed Method</em>' reference.
   * @see #setRemovedMethod(Methodsig)
   * @see org.xtext.abs.AbsPackage#getInterface_modifier_fragment_RemovedMethod()
   * @model
   * @generated
   */
  Methodsig getRemovedMethod();

  /**
   * Sets the value of the '{@link org.xtext.abs.Interface_modifier_fragment#getRemovedMethod <em>Removed Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Removed Method</em>' reference.
   * @see #getRemovedMethod()
   * @generated
   */
  void setRemovedMethod(Methodsig value);

} // Interface_modifier_fragment
