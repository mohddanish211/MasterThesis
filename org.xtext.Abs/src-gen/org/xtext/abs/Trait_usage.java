/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trait usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Trait_usage#getTraitUsage <em>Trait Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getTrait_usage()
 * @model
 * @generated
 */
public interface Trait_usage extends EObject
{
  /**
   * Returns the value of the '<em><b>Trait Usage</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Trait_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trait Usage</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trait Usage</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getTrait_usage_TraitUsage()
   * @model
   * @generated
   */
  EList<Trait_decl> getTraitUsage();

} // Trait_usage
