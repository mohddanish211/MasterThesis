/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eff expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Eff_expr#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getO <em>O</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getM <em>M</em>}</li>
 *   <li>{@link org.xtext.abs.Eff_expr#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getEff_expr()
 * @model
 * @generated
 */
public interface Eff_expr extends Exp
{
  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(String)
   * @see org.xtext.abs.AbsPackage#getEff_expr_L()
   * @model
   * @generated
   */
  String getL();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #getL()
   * @generated
   */
  void setL(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.abs.AbsPackage#getEff_expr_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

  /**
   * Returns the value of the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute.
   * @see #setA(String)
   * @see org.xtext.abs.AbsPackage#getEff_expr_A()
   * @model
   * @generated
   */
  String getA();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getA <em>A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' attribute.
   * @see #getA()
   * @generated
   */
  void setA(String value);

  /**
   * Returns the value of the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>O</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>O</em>' containment reference.
   * @see #setO(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getEff_expr_O()
   * @model containment="true"
   * @generated
   */
  Pure_exp getO();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getO <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>O</em>' containment reference.
   * @see #getO()
   * @generated
   */
  void setO(Pure_exp value);

  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see #setM(String)
   * @see org.xtext.abs.AbsPackage#getEff_expr_M()
   * @model
   * @generated
   */
  String getM();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see #getM()
   * @generated
   */
  void setM(String value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Delta_id)
   * @see org.xtext.abs.AbsPackage#getEff_expr_D()
   * @model containment="true"
   * @generated
   */
  Delta_id getD();

  /**
   * Sets the value of the '{@link org.xtext.abs.Eff_expr#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Delta_id value);

} // Eff_expr
