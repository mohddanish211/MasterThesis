/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.abs.Stmt#getType_exp <em>Type exp</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getVar_or_field_ref <em>Var or field ref</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getPure_exp <em>Pure exp</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getIfstmt <em>Ifstmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getElsestmt <em>Elsestmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getWhilestmt <em>Whilestmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getForeachstmt <em>Foreachstmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getTrystmt <em>Trystmt</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getCasestmtbranch <em>Casestmtbranch</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getThrowPureExp <em>Throw Pure Exp</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getDiePureExp <em>Die Pure Exp</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getMoveCogTo <em>Move Cog To</em>}</li>
 *   <li>{@link org.xtext.abs.Stmt#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.abs.AbsPackage#getStmt()
 * @model
 * @generated
 */
public interface Stmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Type exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type exp</em>' containment reference.
   * @see #setType_exp(Type_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_Type_exp()
   * @model containment="true"
   * @generated
   */
  Type_exp getType_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getType_exp <em>Type exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type exp</em>' containment reference.
   * @see #getType_exp()
   * @generated
   */
  void setType_exp(Type_exp value);

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
   * @see org.xtext.abs.AbsPackage#getStmt_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see org.xtext.abs.AbsPackage#getStmt_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

  /**
   * Returns the value of the '<em><b>Var or field ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var or field ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var or field ref</em>' containment reference.
   * @see #setVar_or_field_ref(Var_or_field_ref)
   * @see org.xtext.abs.AbsPackage#getStmt_Var_or_field_ref()
   * @model containment="true"
   * @generated
   */
  Var_or_field_ref getVar_or_field_ref();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getVar_or_field_ref <em>Var or field ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var or field ref</em>' containment reference.
   * @see #getVar_or_field_ref()
   * @generated
   */
  void setVar_or_field_ref(Var_or_field_ref value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmt();

  /**
   * Returns the value of the '<em><b>Pure exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pure exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pure exp</em>' containment reference.
   * @see #setPure_exp(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_Pure_exp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getPure_exp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getPure_exp <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pure exp</em>' containment reference.
   * @see #getPure_exp()
   * @generated
   */
  void setPure_exp(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Ifstmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifstmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifstmt</em>' containment reference.
   * @see #setIfstmt(Stmt)
   * @see org.xtext.abs.AbsPackage#getStmt_Ifstmt()
   * @model containment="true"
   * @generated
   */
  Stmt getIfstmt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getIfstmt <em>Ifstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifstmt</em>' containment reference.
   * @see #getIfstmt()
   * @generated
   */
  void setIfstmt(Stmt value);

  /**
   * Returns the value of the '<em><b>Elsestmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsestmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsestmt</em>' containment reference.
   * @see #setElsestmt(Stmt)
   * @see org.xtext.abs.AbsPackage#getStmt_Elsestmt()
   * @model containment="true"
   * @generated
   */
  Stmt getElsestmt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getElsestmt <em>Elsestmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsestmt</em>' containment reference.
   * @see #getElsestmt()
   * @generated
   */
  void setElsestmt(Stmt value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_Condition()
   * @model containment="true"
   * @generated
   */
  Pure_exp getCondition();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Whilestmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whilestmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whilestmt</em>' containment reference.
   * @see #setWhilestmt(Stmt)
   * @see org.xtext.abs.AbsPackage#getStmt_Whilestmt()
   * @model containment="true"
   * @generated
   */
  Stmt getWhilestmt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getWhilestmt <em>Whilestmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whilestmt</em>' containment reference.
   * @see #getWhilestmt()
   * @generated
   */
  void setWhilestmt(Stmt value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_L()
   * @model containment="true"
   * @generated
   */
  Pure_exp getL();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Foreachstmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreachstmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreachstmt</em>' containment reference.
   * @see #setForeachstmt(Stmt)
   * @see org.xtext.abs.AbsPackage#getStmt_Foreachstmt()
   * @model containment="true"
   * @generated
   */
  Stmt getForeachstmt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getForeachstmt <em>Foreachstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreachstmt</em>' containment reference.
   * @see #getForeachstmt()
   * @generated
   */
  void setForeachstmt(Stmt value);

  /**
   * Returns the value of the '<em><b>Trystmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trystmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trystmt</em>' containment reference.
   * @see #setTrystmt(Stmt)
   * @see org.xtext.abs.AbsPackage#getStmt_Trystmt()
   * @model containment="true"
   * @generated
   */
  Stmt getTrystmt();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getTrystmt <em>Trystmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trystmt</em>' containment reference.
   * @see #getTrystmt()
   * @generated
   */
  void setTrystmt(Stmt value);

  /**
   * Returns the value of the '<em><b>Casestmtbranch</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.abs.Casestmtbranch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Casestmtbranch</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Casestmtbranch</em>' containment reference list.
   * @see org.xtext.abs.AbsPackage#getStmt_Casestmtbranch()
   * @model containment="true"
   * @generated
   */
  EList<Casestmtbranch> getCasestmtbranch();

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(Guard)
   * @see org.xtext.abs.AbsPackage#getStmt_Ref()
   * @model containment="true"
   * @generated
   */
  Guard getRef();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Guard value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_F()
   * @model containment="true"
   * @generated
   */
  Pure_exp getF();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(Pure_exp value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_T()
   * @model containment="true"
   * @generated
   */
  Pure_exp getT();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Throw Pure Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throw Pure Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throw Pure Exp</em>' containment reference.
   * @see #setThrowPureExp(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_ThrowPureExp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getThrowPureExp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getThrowPureExp <em>Throw Pure Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throw Pure Exp</em>' containment reference.
   * @see #getThrowPureExp()
   * @generated
   */
  void setThrowPureExp(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Die Pure Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Die Pure Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Die Pure Exp</em>' containment reference.
   * @see #setDiePureExp(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_DiePureExp()
   * @model containment="true"
   * @generated
   */
  Pure_exp getDiePureExp();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getDiePureExp <em>Die Pure Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Die Pure Exp</em>' containment reference.
   * @see #getDiePureExp()
   * @generated
   */
  void setDiePureExp(Pure_exp value);

  /**
   * Returns the value of the '<em><b>Move Cog To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Move Cog To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move Cog To</em>' containment reference.
   * @see #setMoveCogTo(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_MoveCogTo()
   * @model containment="true"
   * @generated
   */
  Pure_exp getMoveCogTo();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getMoveCogTo <em>Move Cog To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move Cog To</em>' containment reference.
   * @see #getMoveCogTo()
   * @generated
   */
  void setMoveCogTo(Pure_exp value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Pure_exp)
   * @see org.xtext.abs.AbsPackage#getStmt_C()
   * @model containment="true"
   * @generated
   */
  Pure_exp getC();

  /**
   * Sets the value of the '{@link org.xtext.abs.Stmt#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Pure_exp value);

} // Stmt
