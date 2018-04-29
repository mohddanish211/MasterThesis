/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class modifier fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Class_modifier_fragment#getMethodsig <em>Methodsig</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getClass_modifier_fragment()
 * @model
 * @generated
 */
public interface Class_modifier_fragment extends EObject
{
  /**
   * Returns the value of the '<em><b>Methodsig</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Methodsig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodsig</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodsig</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getClass_modifier_fragment_Methodsig()
   * @model containment="true"
   * @generated
   */
  EList<Methodsig> getMethodsig();

} // Class_modifier_fragment
