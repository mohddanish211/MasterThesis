/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.OO_modifier#getClass_decl <em>Class decl</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getInterface_decl <em>Interface decl</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getInteface <em>Inteface</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getRemovedInterface <em>Removed Interface</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getClass_modifier_fragment <em>Class modifier fragment</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.xtext.abs.OO_modifier#getInterface_modifier_fragment <em>Interface modifier fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getOO_modifier()
 * @model
 * @generated
 */
public interface OO_modifier extends Module_modifier
{
  /**
   * Returns the value of the '<em><b>Class decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class decl</em>' containment reference.
   * @see #setClass_decl(Class_decl)
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Class_decl()
   * @model containment="true"
   * @generated
   */
  Class_decl getClass_decl();

  /**
   * Sets the value of the '{@link org.xtext.abs.OO_modifier#getClass_decl <em>Class decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class decl</em>' containment reference.
   * @see #getClass_decl()
   * @generated
   */
  void setClass_decl(Class_decl value);

  /**
   * Returns the value of the '<em><b>Interface decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface decl</em>' containment reference.
   * @see #setInterface_decl(Interface_decl)
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Interface_decl()
   * @model containment="true"
   * @generated
   */
  Interface_decl getInterface_decl();

  /**
   * Sets the value of the '{@link org.xtext.abs.OO_modifier#getInterface_decl <em>Interface decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface decl</em>' containment reference.
   * @see #getInterface_decl()
   * @generated
   */
  void setInterface_decl(Interface_decl value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(Class_decl)
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Class()
   * @model
   * @generated
   */
  Class_decl getClass_();

  /**
   * Sets the value of the '{@link org.xtext.abs.OO_modifier#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(Class_decl value);

  /**
   * Returns the value of the '<em><b>Inteface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inteface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inteface</em>' reference.
   * @see #setInteface(Interface_decl)
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Inteface()
   * @model
   * @generated
   */
  Interface_decl getInteface();

  /**
   * Sets the value of the '{@link org.xtext.abs.OO_modifier#getInteface <em>Inteface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inteface</em>' reference.
   * @see #getInteface()
   * @generated
   */
  void setInteface(Interface_decl value);

  /**
   * Returns the value of the '<em><b>Interface Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Interface_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Name</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getOO_modifier_InterfaceName()
   * @model containment="true"
   * @generated
   */
  EList<Interface_decl> getInterfaceName();

  /**
   * Returns the value of the '<em><b>Removed Interface</b></em>' reference list.
   * The list contents are of type {@link org.xtext.abs.Interface_decl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removed Interface</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removed Interface</em>' reference list.
   * @see org.xtext.abs.AbsPackage#getOO_modifier_RemovedInterface()
   * @model
   * @generated
   */
  EList<Interface_decl> getRemovedInterface();

  /**
   * Returns the value of the '<em><b>Class modifier fragment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Class_modifier_fragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class modifier fragment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class modifier fragment</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Class_modifier_fragment()
   * @model containment="true"
   * @generated
   */
  EList<Class_modifier_fragment> getClass_modifier_fragment();

  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(Interface_decl)
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Interface()
   * @model
   * @generated
   */
  Interface_decl getInterface();

  /**
   * Sets the value of the '{@link org.xtext.abs.OO_modifier#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface_decl value);

  /**
   * Returns the value of the '<em><b>Interface modifier fragment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Interface_modifier_fragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface modifier fragment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface modifier fragment</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getOO_modifier_Interface_modifier_fragment()
   * @model containment="true"
   * @generated
   */
  EList<Interface_modifier_fragment> getInterface_modifier_fragment();

} // OO_modifier
