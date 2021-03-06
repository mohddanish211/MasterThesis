/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Namespace_modifier#getStar <em>Star</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getNamespace_modifier()
 * @model
 * @generated
 */
public interface Namespace_modifier extends Module_modifier
{
  /**
   * Returns the value of the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Star</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Star</em>' attribute.
   * @see #setStar(String)
   * @see org.xtext.abs.AbsPackage#getNamespace_modifier_Star()
   * @model
   * @generated
   */
  String getStar();

  /**
   * Sets the value of the '{@link org.xtext.abs.Namespace_modifier#getStar <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Star</em>' attribute.
   * @see #getStar()
   * @generated
   */
  void setStar(String value);

} // Namespace_modifier
