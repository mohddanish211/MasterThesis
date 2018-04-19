/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Type_exp#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Type_exp#getLt <em>Lt</em>}</li>
 *   <li>{@link org.xtext.abs.Type_exp#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.Type_exp#getGt <em>Gt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getType_exp()
 * @model
 * @generated
 */
public interface Type_exp extends Update_preamble_declaration
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
   * @see org.xtext.abs.AbsPackage#getType_exp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Type_exp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lt</em>' attribute.
   * @see #setLt(String)
   * @see org.xtext.abs.AbsPackage#getType_exp_Lt()
   * @model
   * @generated
   */
  String getLt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Type_exp#getLt <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lt</em>' attribute.
   * @see #getLt()
   * @generated
   */
  void setLt(String value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Type_use}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getType_exp_P()
   * @model containment="true"
   * @generated
   */
  EList<Type_use> getP();

  /**
   * Returns the value of the '<em><b>Gt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gt</em>' attribute.
   * @see #setGt(String)
   * @see org.xtext.abs.AbsPackage#getType_exp_Gt()
   * @model
   * @generated
   */
  String getGt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Type_exp#getGt <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gt</em>' attribute.
   * @see #getGt()
   * @generated
   */
  void setGt(String value);

} // Type_exp
