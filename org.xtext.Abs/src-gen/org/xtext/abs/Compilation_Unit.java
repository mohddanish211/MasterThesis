/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getModule <em>Module</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getDeltaDecl <em>Delta Decl</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getUpdate_decl <em>Update decl</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getProductline_decl <em>Productline decl</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getProduct_decl <em>Product decl</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getFeature_decl <em>Feature decl</em>}</li>
 *   <li>{@link org.xtext.abs.Compilation_Unit#getFextension <em>Fextension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getCompilation_Unit()
 * @model
 * @generated
 */
public interface Compilation_Unit extends DomainModel
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Module_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Module()
   * @model containment="true"
   * @generated
   */
  EList<Module_decl> getModule();

  /**
   * Returns the value of the '<em><b>Delta Decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Delta_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta Decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_DeltaDecl()
   * @model containment="true"
   * @generated
   */
  EList<Delta_decl> getDeltaDecl();

  /**
   * Returns the value of the '<em><b>Update decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Update_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Update_decl()
   * @model containment="true"
   * @generated
   */
  EList<Update_decl> getUpdate_decl();

  /**
   * Returns the value of the '<em><b>Productline decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Productline decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Productline decl</em>' containment reference.
   * @see #setProductline_decl(Productline_decl)
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Productline_decl()
   * @model containment="true"
   * @generated
   */
  Productline_decl getProductline_decl();

  /**
   * Sets the value of the '{@link org.xtext.abs.Compilation_Unit#getProductline_decl <em>Productline decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Productline decl</em>' containment reference.
   * @see #getProductline_decl()
   * @generated
   */
  void setProductline_decl(Productline_decl value);

  /**
   * Returns the value of the '<em><b>Product decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Product_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Product_decl()
   * @model containment="true"
   * @generated
   */
  EList<Product_decl> getProduct_decl();

  /**
   * Returns the value of the '<em><b>Feature decl</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Feature_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature decl</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Feature_decl()
   * @model containment="true"
   * @generated
   */
  EList<Feature_decl> getFeature_decl();

  /**
   * Returns the value of the '<em><b>Fextension</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Fextension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fextension</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fextension</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getCompilation_Unit_Fextension()
   * @model containment="true"
   * @generated
   */
  EList<Fextension> getFextension();

} // Compilation_Unit
