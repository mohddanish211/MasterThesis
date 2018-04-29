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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Case_branch;
import org.xtext.abs.Eff_expr;
import org.xtext.abs.Function_list;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getPure_exp_list <em>Pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getList <em>List</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getFunction_list <em>Function list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getPartial_function_pure_exp_list <em>Partial function pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getVariadic_exp_list <em>Variadic exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getCasebranch <em>Casebranch</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getB <em>B</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getPure_exp <em>Pure exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getAwait <em>Await</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Pure_expImpl extends ExpImpl implements Pure_exp
{
  /**
   * The default value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected static final String L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected String l = L_EDEFAULT;

  /**
   * The cached value of the '{@link #getPure_exp_list() <em>Pure exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp_list()
   * @generated
   * @ordered
   */
  protected Pure_exp_list pure_exp_list;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected EList<Pure_exp_list> list;

  /**
   * The cached value of the '{@link #getFunction_list() <em>Function list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_list()
   * @generated
   * @ordered
   */
  protected EList<Function_list> function_list;

  /**
   * The cached value of the '{@link #getPartial_function_pure_exp_list() <em>Partial function pure exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartial_function_pure_exp_list()
   * @generated
   * @ordered
   */
  protected Pure_exp_list partial_function_pure_exp_list;

  /**
   * The cached value of the '{@link #getVariadic_exp_list() <em>Variadic exp list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariadic_exp_list()
   * @generated
   * @ordered
   */
  protected Pure_exp_list variadic_exp_list;

  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected Pure_exp if_;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Pure_exp then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected Pure_exp else_;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected Pure_exp case_;

  /**
   * The cached value of the '{@link #getCasebranch() <em>Casebranch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCasebranch()
   * @generated
   * @ordered
   */
  protected EList<Case_branch> casebranch;

  /**
   * The cached value of the '{@link #getType_use() <em>Type use</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_use()
   * @generated
   * @ordered
   */
  protected Type_use type_use;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Pure_exp i;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected Pure_exp b;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

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
   * The default value of the '{@link #getAwait() <em>Await</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAwait()
   * @generated
   * @ordered
   */
  protected static final String AWAIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAwait() <em>Await</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAwait()
   * @generated
   * @ordered
   */
  protected String await = AWAIT_EDEFAULT;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pure_expImpl()
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
    return AbsPackage.Literals.PURE_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(String newL)
  {
    String oldL = l;
    l = newL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__L, oldL, l));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp_list getPure_exp_list()
  {
    return pure_exp_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp_list(Pure_exp_list newPure_exp_list, NotificationChain msgs)
  {
    Pure_exp_list oldPure_exp_list = pure_exp_list;
    pure_exp_list = newPure_exp_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PURE_EXP_LIST, oldPure_exp_list, newPure_exp_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp_list(Pure_exp_list newPure_exp_list)
  {
    if (newPure_exp_list != pure_exp_list)
    {
      NotificationChain msgs = null;
      if (pure_exp_list != null)
        msgs = ((InternalEObject)pure_exp_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PURE_EXP_LIST, null, msgs);
      if (newPure_exp_list != null)
        msgs = ((InternalEObject)newPure_exp_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PURE_EXP_LIST, null, msgs);
      msgs = basicSetPure_exp_list(newPure_exp_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PURE_EXP_LIST, newPure_exp_list, newPure_exp_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pure_exp_list> getList()
  {
    if (list == null)
    {
      list = new EObjectContainmentEList<Pure_exp_list>(Pure_exp_list.class, this, AbsPackage.PURE_EXP__LIST);
    }
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function_list> getFunction_list()
  {
    if (function_list == null)
    {
      function_list = new EObjectContainmentEList<Function_list>(Function_list.class, this, AbsPackage.PURE_EXP__FUNCTION_LIST);
    }
    return function_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp_list getPartial_function_pure_exp_list()
  {
    return partial_function_pure_exp_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartial_function_pure_exp_list(Pure_exp_list newPartial_function_pure_exp_list, NotificationChain msgs)
  {
    Pure_exp_list oldPartial_function_pure_exp_list = partial_function_pure_exp_list;
    partial_function_pure_exp_list = newPartial_function_pure_exp_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST, oldPartial_function_pure_exp_list, newPartial_function_pure_exp_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartial_function_pure_exp_list(Pure_exp_list newPartial_function_pure_exp_list)
  {
    if (newPartial_function_pure_exp_list != partial_function_pure_exp_list)
    {
      NotificationChain msgs = null;
      if (partial_function_pure_exp_list != null)
        msgs = ((InternalEObject)partial_function_pure_exp_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST, null, msgs);
      if (newPartial_function_pure_exp_list != null)
        msgs = ((InternalEObject)newPartial_function_pure_exp_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST, null, msgs);
      msgs = basicSetPartial_function_pure_exp_list(newPartial_function_pure_exp_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST, newPartial_function_pure_exp_list, newPartial_function_pure_exp_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp_list getVariadic_exp_list()
  {
    return variadic_exp_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariadic_exp_list(Pure_exp_list newVariadic_exp_list, NotificationChain msgs)
  {
    Pure_exp_list oldVariadic_exp_list = variadic_exp_list;
    variadic_exp_list = newVariadic_exp_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__VARIADIC_EXP_LIST, oldVariadic_exp_list, newVariadic_exp_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariadic_exp_list(Pure_exp_list newVariadic_exp_list)
  {
    if (newVariadic_exp_list != variadic_exp_list)
    {
      NotificationChain msgs = null;
      if (variadic_exp_list != null)
        msgs = ((InternalEObject)variadic_exp_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__VARIADIC_EXP_LIST, null, msgs);
      if (newVariadic_exp_list != null)
        msgs = ((InternalEObject)newVariadic_exp_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__VARIADIC_EXP_LIST, null, msgs);
      msgs = basicSetVariadic_exp_list(newVariadic_exp_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__VARIADIC_EXP_LIST, newVariadic_exp_list, newVariadic_exp_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(Pure_exp newIf, NotificationChain msgs)
  {
    Pure_exp oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(Pure_exp newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__IF, newIf, newIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Pure_exp newThen, NotificationChain msgs)
  {
    Pure_exp oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(Pure_exp newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(Pure_exp newElse, NotificationChain msgs)
  {
    Pure_exp oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(Pure_exp newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__ELSE, newElse, newElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCase(Pure_exp newCase, NotificationChain msgs)
  {
    Pure_exp oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__CASE, oldCase, newCase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(Pure_exp newCase)
  {
    if (newCase != case_)
    {
      NotificationChain msgs = null;
      if (case_ != null)
        msgs = ((InternalEObject)case_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__CASE, null, msgs);
      if (newCase != null)
        msgs = ((InternalEObject)newCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__CASE, null, msgs);
      msgs = basicSetCase(newCase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__CASE, newCase, newCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Case_branch> getCasebranch()
  {
    if (casebranch == null)
    {
      casebranch = new EObjectContainmentEList<Case_branch>(Case_branch.class, this, AbsPackage.PURE_EXP__CASEBRANCH);
    }
    return casebranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_use getType_use()
  {
    return type_use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_use(Type_use newType_use, NotificationChain msgs)
  {
    Type_use oldType_use = type_use;
    type_use = newType_use;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__TYPE_USE, oldType_use, newType_use);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_use(Type_use newType_use)
  {
    if (newType_use != type_use)
    {
      NotificationChain msgs = null;
      if (type_use != null)
        msgs = ((InternalEObject)type_use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__TYPE_USE, null, msgs);
      if (newType_use != null)
        msgs = ((InternalEObject)newType_use).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__TYPE_USE, null, msgs);
      msgs = basicSetType_use(newType_use, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__TYPE_USE, newType_use, newType_use));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(Pure_exp newI, NotificationChain msgs)
  {
    Pure_exp oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Pure_exp newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(Pure_exp newB, NotificationChain msgs)
  {
    Pure_exp oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(Pure_exp newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__OP, oldOp, op));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PURE_EXP, oldPure_exp, newPure_exp);
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
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__PURE_EXP, newPure_exp, newPure_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAwait()
  {
    return await;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAwait(String newAwait)
  {
    String oldAwait = await;
    await = newAwait;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__AWAIT, oldAwait, await));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__VAL, oldVal, val));
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
      case AbsPackage.PURE_EXP__PURE_EXP_LIST:
        return basicSetPure_exp_list(null, msgs);
      case AbsPackage.PURE_EXP__LIST:
        return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return ((InternalEList<?>)getFunction_list()).basicRemove(otherEnd, msgs);
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return basicSetPartial_function_pure_exp_list(null, msgs);
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return basicSetVariadic_exp_list(null, msgs);
      case AbsPackage.PURE_EXP__IF:
        return basicSetIf(null, msgs);
      case AbsPackage.PURE_EXP__THEN:
        return basicSetThen(null, msgs);
      case AbsPackage.PURE_EXP__ELSE:
        return basicSetElse(null, msgs);
      case AbsPackage.PURE_EXP__CASE:
        return basicSetCase(null, msgs);
      case AbsPackage.PURE_EXP__CASEBRANCH:
        return ((InternalEList<?>)getCasebranch()).basicRemove(otherEnd, msgs);
      case AbsPackage.PURE_EXP__TYPE_USE:
        return basicSetType_use(null, msgs);
      case AbsPackage.PURE_EXP__I:
        return basicSetI(null, msgs);
      case AbsPackage.PURE_EXP__B:
        return basicSetB(null, msgs);
      case AbsPackage.PURE_EXP__PURE_EXP:
        return basicSetPure_exp(null, msgs);
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
      case AbsPackage.PURE_EXP__L:
        return getL();
      case AbsPackage.PURE_EXP__PURE_EXP_LIST:
        return getPure_exp_list();
      case AbsPackage.PURE_EXP__LIST:
        return getList();
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return getFunction_list();
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return getPartial_function_pure_exp_list();
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return getVariadic_exp_list();
      case AbsPackage.PURE_EXP__IF:
        return getIf();
      case AbsPackage.PURE_EXP__THEN:
        return getThen();
      case AbsPackage.PURE_EXP__ELSE:
        return getElse();
      case AbsPackage.PURE_EXP__CASE:
        return getCase();
      case AbsPackage.PURE_EXP__CASEBRANCH:
        return getCasebranch();
      case AbsPackage.PURE_EXP__TYPE_USE:
        return getType_use();
      case AbsPackage.PURE_EXP__VALUE:
        return getValue();
      case AbsPackage.PURE_EXP__I:
        return getI();
      case AbsPackage.PURE_EXP__B:
        return getB();
      case AbsPackage.PURE_EXP__OP:
        return getOp();
      case AbsPackage.PURE_EXP__PURE_EXP:
        return getPure_exp();
      case AbsPackage.PURE_EXP__AWAIT:
        return getAwait();
      case AbsPackage.PURE_EXP__VAL:
        return getVal();
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
      case AbsPackage.PURE_EXP__L:
        setL((String)newValue);
        return;
      case AbsPackage.PURE_EXP__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__LIST:
        getList().clear();
        getList().addAll((Collection<? extends Pure_exp_list>)newValue);
        return;
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        getFunction_list().clear();
        getFunction_list().addAll((Collection<? extends Function_list>)newValue);
        return;
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        setPartial_function_pure_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        setVariadic_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__IF:
        setIf((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__THEN:
        setThen((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__ELSE:
        setElse((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__CASE:
        setCase((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__CASEBRANCH:
        getCasebranch().clear();
        getCasebranch().addAll((Collection<? extends Case_branch>)newValue);
        return;
      case AbsPackage.PURE_EXP__TYPE_USE:
        setType_use((Type_use)newValue);
        return;
      case AbsPackage.PURE_EXP__VALUE:
        setValue((String)newValue);
        return;
      case AbsPackage.PURE_EXP__I:
        setI((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__B:
        setB((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__OP:
        setOp((String)newValue);
        return;
      case AbsPackage.PURE_EXP__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__AWAIT:
        setAwait((String)newValue);
        return;
      case AbsPackage.PURE_EXP__VAL:
        setVal((String)newValue);
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
      case AbsPackage.PURE_EXP__L:
        setL(L_EDEFAULT);
        return;
      case AbsPackage.PURE_EXP__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__LIST:
        getList().clear();
        return;
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        getFunction_list().clear();
        return;
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        setPartial_function_pure_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        setVariadic_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__IF:
        setIf((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__THEN:
        setThen((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__ELSE:
        setElse((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__CASE:
        setCase((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__CASEBRANCH:
        getCasebranch().clear();
        return;
      case AbsPackage.PURE_EXP__TYPE_USE:
        setType_use((Type_use)null);
        return;
      case AbsPackage.PURE_EXP__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case AbsPackage.PURE_EXP__I:
        setI((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__B:
        setB((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__OP:
        setOp(OP_EDEFAULT);
        return;
      case AbsPackage.PURE_EXP__PURE_EXP:
        setPure_exp((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__AWAIT:
        setAwait(AWAIT_EDEFAULT);
        return;
      case AbsPackage.PURE_EXP__VAL:
        setVal(VAL_EDEFAULT);
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
      case AbsPackage.PURE_EXP__L:
        return L_EDEFAULT == null ? l != null : !L_EDEFAULT.equals(l);
      case AbsPackage.PURE_EXP__PURE_EXP_LIST:
        return pure_exp_list != null;
      case AbsPackage.PURE_EXP__LIST:
        return list != null && !list.isEmpty();
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return function_list != null && !function_list.isEmpty();
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return partial_function_pure_exp_list != null;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return variadic_exp_list != null;
      case AbsPackage.PURE_EXP__IF:
        return if_ != null;
      case AbsPackage.PURE_EXP__THEN:
        return then != null;
      case AbsPackage.PURE_EXP__ELSE:
        return else_ != null;
      case AbsPackage.PURE_EXP__CASE:
        return case_ != null;
      case AbsPackage.PURE_EXP__CASEBRANCH:
        return casebranch != null && !casebranch.isEmpty();
      case AbsPackage.PURE_EXP__TYPE_USE:
        return type_use != null;
      case AbsPackage.PURE_EXP__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case AbsPackage.PURE_EXP__I:
        return i != null;
      case AbsPackage.PURE_EXP__B:
        return b != null;
      case AbsPackage.PURE_EXP__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case AbsPackage.PURE_EXP__PURE_EXP:
        return pure_exp != null;
      case AbsPackage.PURE_EXP__AWAIT:
        return AWAIT_EDEFAULT == null ? await != null : !AWAIT_EDEFAULT.equals(await);
      case AbsPackage.PURE_EXP__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Eff_expr.class)
    {
      switch (derivedFeatureID)
      {
        case AbsPackage.PURE_EXP__L: return AbsPackage.EFF_EXPR__L;
        case AbsPackage.PURE_EXP__PURE_EXP_LIST: return AbsPackage.EFF_EXPR__PURE_EXP_LIST;
        case AbsPackage.PURE_EXP__LIST: return AbsPackage.EFF_EXPR__LIST;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Eff_expr.class)
    {
      switch (baseFeatureID)
      {
        case AbsPackage.EFF_EXPR__L: return AbsPackage.PURE_EXP__L;
        case AbsPackage.EFF_EXPR__PURE_EXP_LIST: return AbsPackage.PURE_EXP__PURE_EXP_LIST;
        case AbsPackage.EFF_EXPR__LIST: return AbsPackage.PURE_EXP__LIST;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (l: ");
    result.append(l);
    result.append(", value: ");
    result.append(value);
    result.append(", op: ");
    result.append(op);
    result.append(", await: ");
    result.append(await);
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //Pure_expImpl
