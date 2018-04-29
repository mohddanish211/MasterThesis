/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Feature#getFeature_decl <em>Feature decl</em>}</li>
 *   <li>{@link org.xtext.abs.Feature#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.Feature#getAttr_assignment <em>Attr assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature decl</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature decl</em>' reference.
   * @see #setFeature_decl(Feature_decl)
   * @see org.xtext.abs.AbsPackage#getFeature_Feature_decl()
   * @model
   * @generated
   */
  Feature_decl getFeature_decl();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature#getFeature_decl <em>Feature decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature decl</em>' reference.
   * @see #getFeature_decl()
   * @generated
   */
  void setFeature_decl(Feature_decl value);

  /**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(String)
   * @see org.xtext.abs.AbsPackage#getFeature_P()
   * @model
   * @generated
   */
  String getP();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(String value);

  /**
   * Returns the value of the '<em><b>Attr assignment</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr assignment</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr assignment</em>' attribute list.
   * @see org.xtext.abs.AbsPackage#getFeature_Attr_assignment()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttr_assignment();

} // Feature
