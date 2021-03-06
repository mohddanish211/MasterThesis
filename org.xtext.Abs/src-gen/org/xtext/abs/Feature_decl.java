/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Feature_decl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Feature_decl#getFeature_decl_group <em>Feature decl group</em>}</li>
 *   <li>{@link org.xtext.abs.Feature_decl#getFeature_decl_attribute <em>Feature decl attribute</em>}</li>
 *   <li>{@link org.xtext.abs.Feature_decl#getFeature_decl_constraint <em>Feature decl constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getFeature_decl()
 * @model
 * @generated
 */
public interface Feature_decl extends Fnode
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Feature decl group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature decl group</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature decl group</em>' containment reference.
   * @see #setFeature_decl_group(Feature_decl_group)
   * @see org.xtext.abs.AbsPackage#getFeature_decl_Feature_decl_group()
   * @model containment="true"
   * @generated
   */
  Feature_decl_group getFeature_decl_group();

  /**
   * Sets the value of the '{@link org.xtext.abs.Feature_decl#getFeature_decl_group <em>Feature decl group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature decl group</em>' containment reference.
   * @see #getFeature_decl_group()
   * @generated
   */
  void setFeature_decl_group(Feature_decl_group value);

  /**
   * Returns the value of the '<em><b>Feature decl attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Feature_decl_attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature decl attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature decl attribute</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFeature_decl_Feature_decl_attribute()
   * @model containment="true"
   * @generated
   */
  EList<Feature_decl_attribute> getFeature_decl_attribute();

  /**
   * Returns the value of the '<em><b>Feature decl constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Feature_decl_constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature decl constraint</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature decl constraint</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getFeature_decl_Feature_decl_constraint()
   * @model containment="true"
   * @generated
   */
  EList<Feature_decl_constraint> getFeature_decl_constraint();

} // Feature_decl
