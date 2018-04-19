/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Casestmtbranch;
import org.xtext.abs.Exp;
import org.xtext.abs.Guard;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Stmt;
import org.xtext.abs.Type_exp;
import org.xtext.abs.Var_or_field_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getType_exp <em>Type exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getVar_or_field_ref <em>Var or field ref</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getPure_exp <em>Pure exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getIfstmt <em>Ifstmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getWhilestmt <em>Whilestmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getForeachstmt <em>Foreachstmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getTrystmt <em>Trystmt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getCasestmtbranch <em>Casestmtbranch</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getThrowPureExp <em>Throw Pure Exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getDiePureExp <em>Die Pure Exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.StmtImpl#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StmtImpl extends MinimalEObjectImpl.Container implements Stmt
{
  /**
   * The cached value of the '{@link #getType_exp() <em>Type exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_exp()
   * @generated
   * @ordered
   */
  protected Type_exp type_exp;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Exp exp;

  /**
   * The cached value of the '{@link #getVar_or_field_ref() <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_or_field_ref()
   * @generated
   * @ordered
   */
  protected Var_or_field_ref var_or_field_ref;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected EList<Stmt> stmt;

  /**
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected Pure_exp pure_exp;

  /**
   * The cached value of the '{@link #getIfstmt() <em>Ifstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfstmt()
   * @generated
   * @ordered
   */
  protected Stmt ifstmt;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected Stmt r;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Pure_exp condition;

  /**
   * The cached value of the '{@link #getWhilestmt() <em>Whilestmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhilestmt()
   * @generated
   * @ordered
   */
  protected Stmt whilestmt;

  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final String I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected String i = I_EDEFAULT;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected Pure_exp l;

  /**
   * The cached value of the '{@link #getForeachstmt() <em>Foreachstmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeachstmt()
   * @generated
   * @ordered
   */
  protected Stmt foreachstmt;

  /**
   * The cached value of the '{@link #getTrystmt() <em>Trystmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrystmt()
   * @generated
   * @ordered
   */
  protected Stmt trystmt;

  /**
   * The cached value of the '{@link #getCasestmtbranch() <em>Casestmtbranch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCasestmtbranch()
   * @generated
   * @ordered
   */
  protected EList<Casestmtbranch> casestmtbranch;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Guard guard;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected Pure_exp f;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Pure_exp t;

  /**
   * The cached value of the '{@link #getThrowPureExp() <em>Throw Pure Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrowPureExp()
   * @generated
   * @ordered
   */
  protected Pure_exp throwPureExp;

  /**
   * The cached value of the '{@link #getDiePureExp() <em>Die Pure Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiePureExp()
   * @generated
   * @ordered
   */
  protected Pure_exp diePureExp;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Pure_exp c;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StmtImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AbsPackage.Literals.STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_exp getType_exp()
  {
    return type_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_exp(Type_exp newType_exp, NotificationChain msgs)
  {
    Type_exp oldType_exp = type_exp;
    type_exp = newType_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__TYPE_EXP, oldType_exp, newType_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_exp(Type_exp newType_exp)
  {
    if (newType_exp != type_exp)
    {
      NotificationChain msgs = null;
      if (type_exp != null)
        msgs = ((InternalEObject)type_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__TYPE_EXP, null, msgs);
      if (newType_exp != null)
        msgs = ((InternalEObject)newType_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__TYPE_EXP, null, msgs);
      msgs = basicSetType_exp(newType_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__TYPE_EXP, newType_exp, newType_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Exp newExp, NotificationChain msgs)
  {
    Exp oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(Exp newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref getVar_or_field_ref()
  {
    if (var_or_field_ref != null && var_or_field_ref.eIsProxy())
    {
      InternalEObject oldVar_or_field_ref = (InternalEObject)var_or_field_ref;
      var_or_field_ref = (Var_or_field_ref)eResolveProxy(oldVar_or_field_ref);
      if (var_or_field_ref != oldVar_or_field_ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.STMT__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
      }
    }
    return var_or_field_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref basicGetVar_or_field_ref()
  {
    return var_or_field_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar_or_field_ref(Var_or_field_ref newVar_or_field_ref)
  {
    Var_or_field_ref oldVar_or_field_ref = var_or_field_ref;
    var_or_field_ref = newVar_or_field_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stmt> getStmt()
  {
    if (stmt == null)
    {
      stmt = new EObjectContainmentEList<Stmt>(Stmt.class, this, AbsPackage.STMT__STMT);
    }
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getPure_exp()
  {
    return pure_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp(Pure_exp newPure_exp, NotificationChain msgs)
  {
    Pure_exp oldPure_exp = pure_exp;
    pure_exp = newPure_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__PURE_EXP, oldPure_exp, newPure_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp(Pure_exp newPure_exp)
  {
    if (newPure_exp != pure_exp)
    {
      NotificationChain msgs = null;
      if (pure_exp != null)
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__PURE_EXP, newPure_exp, newPure_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getIfstmt()
  {
    return ifstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfstmt(Stmt newIfstmt, NotificationChain msgs)
  {
    Stmt oldIfstmt = ifstmt;
    ifstmt = newIfstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__IFSTMT, oldIfstmt, newIfstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfstmt(Stmt newIfstmt)
  {
    if (newIfstmt != ifstmt)
    {
      NotificationChain msgs = null;
      if (ifstmt != null)
        msgs = ((InternalEObject)ifstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__IFSTMT, null, msgs);
      if (newIfstmt != null)
        msgs = ((InternalEObject)newIfstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__IFSTMT, null, msgs);
      msgs = basicSetIfstmt(newIfstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__IFSTMT, newIfstmt, newIfstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(Stmt newR, NotificationChain msgs)
  {
    Stmt oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__R, oldR, newR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(Stmt newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__R, newR, newR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Pure_exp newCondition, NotificationChain msgs)
  {
    Pure_exp oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Pure_exp newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getWhilestmt()
  {
    return whilestmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhilestmt(Stmt newWhilestmt, NotificationChain msgs)
  {
    Stmt oldWhilestmt = whilestmt;
    whilestmt = newWhilestmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__WHILESTMT, oldWhilestmt, newWhilestmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhilestmt(Stmt newWhilestmt)
  {
    if (newWhilestmt != whilestmt)
    {
      NotificationChain msgs = null;
      if (whilestmt != null)
        msgs = ((InternalEObject)whilestmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__WHILESTMT, null, msgs);
      if (newWhilestmt != null)
        msgs = ((InternalEObject)newWhilestmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__WHILESTMT, null, msgs);
      msgs = basicSetWhilestmt(newWhilestmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__WHILESTMT, newWhilestmt, newWhilestmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(String newI)
  {
    String oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(Pure_exp newL, NotificationChain msgs)
  {
    Pure_exp oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(Pure_exp newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getForeachstmt()
  {
    return foreachstmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForeachstmt(Stmt newForeachstmt, NotificationChain msgs)
  {
    Stmt oldForeachstmt = foreachstmt;
    foreachstmt = newForeachstmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__FOREACHSTMT, oldForeachstmt, newForeachstmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeachstmt(Stmt newForeachstmt)
  {
    if (newForeachstmt != foreachstmt)
    {
      NotificationChain msgs = null;
      if (foreachstmt != null)
        msgs = ((InternalEObject)foreachstmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__FOREACHSTMT, null, msgs);
      if (newForeachstmt != null)
        msgs = ((InternalEObject)newForeachstmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__FOREACHSTMT, null, msgs);
      msgs = basicSetForeachstmt(newForeachstmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__FOREACHSTMT, newForeachstmt, newForeachstmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getTrystmt()
  {
    return trystmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrystmt(Stmt newTrystmt, NotificationChain msgs)
  {
    Stmt oldTrystmt = trystmt;
    trystmt = newTrystmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__TRYSTMT, oldTrystmt, newTrystmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrystmt(Stmt newTrystmt)
  {
    if (newTrystmt != trystmt)
    {
      NotificationChain msgs = null;
      if (trystmt != null)
        msgs = ((InternalEObject)trystmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__TRYSTMT, null, msgs);
      if (newTrystmt != null)
        msgs = ((InternalEObject)newTrystmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__TRYSTMT, null, msgs);
      msgs = basicSetTrystmt(newTrystmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__TRYSTMT, newTrystmt, newTrystmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Casestmtbranch> getCasestmtbranch()
  {
    if (casestmtbranch == null)
    {
      casestmtbranch = new EObjectContainmentEList<Casestmtbranch>(Casestmtbranch.class, this, AbsPackage.STMT__CASESTMTBRANCH);
    }
    return casestmtbranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard getGuard()
  {
    if (guard != null && guard.eIsProxy())
    {
      InternalEObject oldGuard = (InternalEObject)guard;
      guard = (Guard)eResolveProxy(oldGuard);
      if (guard != oldGuard)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.STMT__GUARD, oldGuard, guard));
      }
    }
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard basicGetGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Guard newGuard)
  {
    Guard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(Pure_exp newF, NotificationChain msgs)
  {
    Pure_exp oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(Pure_exp newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Pure_exp newT, NotificationChain msgs)
  {
    Pure_exp oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Pure_exp newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getThrowPureExp()
  {
    return throwPureExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrowPureExp(Pure_exp newThrowPureExp, NotificationChain msgs)
  {
    Pure_exp oldThrowPureExp = throwPureExp;
    throwPureExp = newThrowPureExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__THROW_PURE_EXP, oldThrowPureExp, newThrowPureExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrowPureExp(Pure_exp newThrowPureExp)
  {
    if (newThrowPureExp != throwPureExp)
    {
      NotificationChain msgs = null;
      if (throwPureExp != null)
        msgs = ((InternalEObject)throwPureExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__THROW_PURE_EXP, null, msgs);
      if (newThrowPureExp != null)
        msgs = ((InternalEObject)newThrowPureExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__THROW_PURE_EXP, null, msgs);
      msgs = basicSetThrowPureExp(newThrowPureExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__THROW_PURE_EXP, newThrowPureExp, newThrowPureExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getDiePureExp()
  {
    return diePureExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiePureExp(Pure_exp newDiePureExp, NotificationChain msgs)
  {
    Pure_exp oldDiePureExp = diePureExp;
    diePureExp = newDiePureExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__DIE_PURE_EXP, oldDiePureExp, newDiePureExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiePureExp(Pure_exp newDiePureExp)
  {
    if (newDiePureExp != diePureExp)
    {
      NotificationChain msgs = null;
      if (diePureExp != null)
        msgs = ((InternalEObject)diePureExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__DIE_PURE_EXP, null, msgs);
      if (newDiePureExp != null)
        msgs = ((InternalEObject)newDiePureExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__DIE_PURE_EXP, null, msgs);
      msgs = basicSetDiePureExp(newDiePureExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__DIE_PURE_EXP, newDiePureExp, newDiePureExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Pure_exp newC, NotificationChain msgs)
  {
    Pure_exp oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Pure_exp newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.STMT__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.STMT__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AbsPackage.STMT__TYPE_EXP:
        return basicSetType_exp(null, msgs);
      case AbsPackage.STMT__EXP:
        return basicSetExp(null, msgs);
      case AbsPackage.STMT__STMT:
        return ((InternalEList<?>)getStmt()).basicRemove(otherEnd, msgs);
      case AbsPackage.STMT__PURE_EXP:
        return basicSetPure_exp(null, msgs);
      case AbsPackage.STMT__IFSTMT:
        return basicSetIfstmt(null, msgs);
      case AbsPackage.STMT__R:
        return basicSetR(null, msgs);
      case AbsPackage.STMT__CONDITION:
        return basicSetCondition(null, msgs);
      case AbsPackage.STMT__WHILESTMT:
        return basicSetWhilestmt(null, msgs);
      case AbsPackage.STMT__L:
        return basicSetL(null, msgs);
      case AbsPackage.STMT__FOREACHSTMT:
        return basicSetForeachstmt(null, msgs);
      case AbsPackage.STMT__TRYSTMT:
        return basicSetTrystmt(null, msgs);
      case AbsPackage.STMT__CASESTMTBRANCH:
        return ((InternalEList<?>)getCasestmtbranch()).basicRemove(otherEnd, msgs);
      case AbsPackage.STMT__F:
        return basicSetF(null, msgs);
      case AbsPackage.STMT__T:
        return basicSetT(null, msgs);
      case AbsPackage.STMT__THROW_PURE_EXP:
        return basicSetThrowPureExp(null, msgs);
      case AbsPackage.STMT__DIE_PURE_EXP:
        return basicSetDiePureExp(null, msgs);
      case AbsPackage.STMT__C:
        return basicSetC(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AbsPackage.STMT__TYPE_EXP:
        return getType_exp();
      case AbsPackage.STMT__NAME:
        return getName();
      case AbsPackage.STMT__EXP:
        return getExp();
      case AbsPackage.STMT__VAR_OR_FIELD_REF:
        if (resolve) return getVar_or_field_ref();
        return basicGetVar_or_field_ref();
      case AbsPackage.STMT__STMT:
        return getStmt();
      case AbsPackage.STMT__PURE_EXP:
        return getPure_exp();
      case AbsPackage.STMT__IFSTMT:
        return getIfstmt();
      case AbsPackage.STMT__R:
        return getR();
      case AbsPackage.STMT__CONDITION:
        return getCondition();
      case AbsPackage.STMT__WHILESTMT:
        return getWhilestmt();
      case AbsPackage.STMT__I:
        return getI();
      case AbsPackage.STMT__L:
        return getL();
      case AbsPackage.STMT__FOREACHSTMT:
        return getForeachstmt();
      case AbsPackage.STMT__TRYSTMT:
        return getTrystmt();
      case AbsPackage.STMT__CASESTMTBRANCH:
        return getCasestmtbranch();
      case AbsPackage.STMT__GUARD:
        if (resolve) return getGuard();
        return basicGetGuard();
      case AbsPackage.STMT__F:
        return getF();
      case AbsPackage.STMT__T:
        return getT();
      case AbsPackage.STMT__THROW_PURE_EXP:
        return getThrowPureExp();
      case AbsPackage.STMT__DIE_PURE_EXP:
        return getDiePureExp();
      case AbsPackage.STMT__C:
        return getC();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AbsPackage.STMT__TYPE_EXP:
        setType_exp((Type_exp)newValue);
        return;
      case AbsPackage.STMT__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.STMT__EXP:
        setExp((Exp)newValue);
        return;
      case AbsPackage.STMT__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)newValue);
        return;
      case AbsPackage.STMT__STMT:
        getStmt().clear();
        getStmt().addAll((Collection<? extends Stmt>)newValue);
        return;
      case AbsPackage.STMT__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__IFSTMT:
        setIfstmt((Stmt)newValue);
        return;
      case AbsPackage.STMT__R:
        setR((Stmt)newValue);
        return;
      case AbsPackage.STMT__CONDITION:
        setCondition((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__WHILESTMT:
        setWhilestmt((Stmt)newValue);
        return;
      case AbsPackage.STMT__I:
        setI((String)newValue);
        return;
      case AbsPackage.STMT__L:
        setL((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__FOREACHSTMT:
        setForeachstmt((Stmt)newValue);
        return;
      case AbsPackage.STMT__TRYSTMT:
        setTrystmt((Stmt)newValue);
        return;
      case AbsPackage.STMT__CASESTMTBRANCH:
        getCasestmtbranch().clear();
        getCasestmtbranch().addAll((Collection<? extends Casestmtbranch>)newValue);
        return;
      case AbsPackage.STMT__GUARD:
        setGuard((Guard)newValue);
        return;
      case AbsPackage.STMT__F:
        setF((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__T:
        setT((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__THROW_PURE_EXP:
        setThrowPureExp((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__DIE_PURE_EXP:
        setDiePureExp((Pure_exp)newValue);
        return;
      case AbsPackage.STMT__C:
        setC((Pure_exp)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AbsPackage.STMT__TYPE_EXP:
        setType_exp((Type_exp)null);
        return;
      case AbsPackage.STMT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.STMT__EXP:
        setExp((Exp)null);
        return;
      case AbsPackage.STMT__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)null);
        return;
      case AbsPackage.STMT__STMT:
        getStmt().clear();
        return;
      case AbsPackage.STMT__PURE_EXP:
        setPure_exp((Pure_exp)null);
        return;
      case AbsPackage.STMT__IFSTMT:
        setIfstmt((Stmt)null);
        return;
      case AbsPackage.STMT__R:
        setR((Stmt)null);
        return;
      case AbsPackage.STMT__CONDITION:
        setCondition((Pure_exp)null);
        return;
      case AbsPackage.STMT__WHILESTMT:
        setWhilestmt((Stmt)null);
        return;
      case AbsPackage.STMT__I:
        setI(I_EDEFAULT);
        return;
      case AbsPackage.STMT__L:
        setL((Pure_exp)null);
        return;
      case AbsPackage.STMT__FOREACHSTMT:
        setForeachstmt((Stmt)null);
        return;
      case AbsPackage.STMT__TRYSTMT:
        setTrystmt((Stmt)null);
        return;
      case AbsPackage.STMT__CASESTMTBRANCH:
        getCasestmtbranch().clear();
        return;
      case AbsPackage.STMT__GUARD:
        setGuard((Guard)null);
        return;
      case AbsPackage.STMT__F:
        setF((Pure_exp)null);
        return;
      case AbsPackage.STMT__T:
        setT((Pure_exp)null);
        return;
      case AbsPackage.STMT__THROW_PURE_EXP:
        setThrowPureExp((Pure_exp)null);
        return;
      case AbsPackage.STMT__DIE_PURE_EXP:
        setDiePureExp((Pure_exp)null);
        return;
      case AbsPackage.STMT__C:
        setC((Pure_exp)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AbsPackage.STMT__TYPE_EXP:
        return type_exp != null;
      case AbsPackage.STMT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.STMT__EXP:
        return exp != null;
      case AbsPackage.STMT__VAR_OR_FIELD_REF:
        return var_or_field_ref != null;
      case AbsPackage.STMT__STMT:
        return stmt != null && !stmt.isEmpty();
      case AbsPackage.STMT__PURE_EXP:
        return pure_exp != null;
      case AbsPackage.STMT__IFSTMT:
        return ifstmt != null;
      case AbsPackage.STMT__R:
        return r != null;
      case AbsPackage.STMT__CONDITION:
        return condition != null;
      case AbsPackage.STMT__WHILESTMT:
        return whilestmt != null;
      case AbsPackage.STMT__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
      case AbsPackage.STMT__L:
        return l != null;
      case AbsPackage.STMT__FOREACHSTMT:
        return foreachstmt != null;
      case AbsPackage.STMT__TRYSTMT:
        return trystmt != null;
      case AbsPackage.STMT__CASESTMTBRANCH:
        return casestmtbranch != null && !casestmtbranch.isEmpty();
      case AbsPackage.STMT__GUARD:
        return guard != null;
      case AbsPackage.STMT__F:
        return f != null;
      case AbsPackage.STMT__T:
        return t != null;
      case AbsPackage.STMT__THROW_PURE_EXP:
        return throwPureExp != null;
      case AbsPackage.STMT__DIE_PURE_EXP:
        return diePureExp != null;
      case AbsPackage.STMT__C:
        return c != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", i: ");
    result.append(i);
    result.append(')');
    return result.toString();
  }

} //StmtImpl
