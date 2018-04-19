/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class modifier fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Class_modifier_fragment#getF <em>F</em>}</li>
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
   * Returns the value of the '<em><b>F</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' reference.
   * @see #setF(Field_decl)
   * @see org.xtext.abs.AbsPackage#getClass_modifier_fragment_F()
   * @model
   * @generated
   */
  Field_decl getF();

  /**
   * Sets the value of the '{@link org.xtext.abs.Class_modifier_fragment#getF <em>F</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' reference.
   * @see #getF()
   * @generated
   */
  void setF(Field_decl value);

} // Class_modifier_fragment
