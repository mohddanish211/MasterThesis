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
import org.xtext.abs.Function_list;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;
import org.xtext.abs.Type_use;
import org.xtext.abs.Var_or_field_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getFunction_list <em>Function list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getPartial_function_pure_exp_list <em>Partial function pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getFunction_expr <em>Function expr</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getVariadic_exp_list <em>Variadic exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getElse <em>Else</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getCasebranch <em>Casebranch</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getType_use <em>Type use</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getB <em>B</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Pure_expImpl#getVar_or_field_ref <em>Var or field ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Pure_expImpl extends ExpImpl implements Pure_exp
{
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
   * The cached value of the '{@link #getFunction_expr() <em>Function expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_expr()
   * @generated
   * @ordered
   */
  protected Pure_exp_list function_expr;

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
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Pure_exp c;

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
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected Pure_exp else_;

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
   * The cached value of the '{@link #getVar_or_field_ref() <em>Var or field ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar_or_field_ref()
   * @generated
   * @ordered
   */
  protected Var_or_field_ref var_or_field_ref;

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
  public Pure_exp_list getFunction_expr()
  {
    return function_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction_expr(Pure_exp_list newFunction_expr, NotificationChain msgs)
  {
    Pure_exp_list oldFunction_expr = function_expr;
    function_expr = newFunction_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__FUNCTION_EXPR, oldFunction_expr, newFunction_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction_expr(Pure_exp_list newFunction_expr)
  {
    if (newFunction_expr != function_expr)
    {
      NotificationChain msgs = null;
      if (function_expr != null)
        msgs = ((InternalEObject)function_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__FUNCTION_EXPR, null, msgs);
      if (newFunction_expr != null)
        msgs = ((InternalEObject)newFunction_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__FUNCTION_EXPR, null, msgs);
      msgs = basicSetFunction_expr(newFunction_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__FUNCTION_EXPR, newFunction_expr, newFunction_expr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__C, oldC, newC);
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
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__C, newC, newC));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__L, oldL, newL);
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
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.PURE_EXP__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__L, newL, newL));
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
  public Var_or_field_ref getVar_or_field_ref()
  {
    if (var_or_field_ref != null && var_or_field_ref.eIsProxy())
    {
      InternalEObject oldVar_or_field_ref = (InternalEObject)var_or_field_ref;
      var_or_field_ref = (Var_or_field_ref)eResolveProxy(oldVar_or_field_ref);
      if (var_or_field_ref != oldVar_or_field_ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.PURE_EXP__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PURE_EXP__VAR_OR_FIELD_REF, oldVar_or_field_ref, var_or_field_ref));
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
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return ((InternalEList<?>)getFunction_list()).basicRemove(otherEnd, msgs);
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return basicSetPartial_function_pure_exp_list(null, msgs);
      case AbsPackage.PURE_EXP__FUNCTION_EXPR:
        return basicSetFunction_expr(null, msgs);
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return basicSetVariadic_exp_list(null, msgs);
      case AbsPackage.PURE_EXP__C:
        return basicSetC(null, msgs);
      case AbsPackage.PURE_EXP__L:
        return basicSetL(null, msgs);
      case AbsPackage.PURE_EXP__ELSE:
        return basicSetElse(null, msgs);
      case AbsPackage.PURE_EXP__CASEBRANCH:
        return ((InternalEList<?>)getCasebranch()).basicRemove(otherEnd, msgs);
      case AbsPackage.PURE_EXP__TYPE_USE:
        return basicSetType_use(null, msgs);
      case AbsPackage.PURE_EXP__I:
        return basicSetI(null, msgs);
      case AbsPackage.PURE_EXP__B:
        return basicSetB(null, msgs);
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
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return getFunction_list();
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return getPartial_function_pure_exp_list();
      case AbsPackage.PURE_EXP__FUNCTION_EXPR:
        return getFunction_expr();
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return getVariadic_exp_list();
      case AbsPackage.PURE_EXP__C:
        return getC();
      case AbsPackage.PURE_EXP__L:
        return getL();
      case AbsPackage.PURE_EXP__ELSE:
        return getElse();
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
      case AbsPackage.PURE_EXP__VAR_OR_FIELD_REF:
        if (resolve) return getVar_or_field_ref();
        return basicGetVar_or_field_ref();
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
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        getFunction_list().clear();
        getFunction_list().addAll((Collection<? extends Function_list>)newValue);
        return;
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        setPartial_function_pure_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__FUNCTION_EXPR:
        setFunction_expr((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        setVariadic_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.PURE_EXP__C:
        setC((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__L:
        setL((Pure_exp)newValue);
        return;
      case AbsPackage.PURE_EXP__ELSE:
        setElse((Pure_exp)newValue);
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
      case AbsPackage.PURE_EXP__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)newValue);
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
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        getFunction_list().clear();
        return;
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        setPartial_function_pure_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__FUNCTION_EXPR:
        setFunction_expr((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        setVariadic_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.PURE_EXP__C:
        setC((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__L:
        setL((Pure_exp)null);
        return;
      case AbsPackage.PURE_EXP__ELSE:
        setElse((Pure_exp)null);
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
      case AbsPackage.PURE_EXP__VAR_OR_FIELD_REF:
        setVar_or_field_ref((Var_or_field_ref)null);
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
      case AbsPackage.PURE_EXP__FUNCTION_LIST:
        return function_list != null && !function_list.isEmpty();
      case AbsPackage.PURE_EXP__PARTIAL_FUNCTION_PURE_EXP_LIST:
        return partial_function_pure_exp_list != null;
      case AbsPackage.PURE_EXP__FUNCTION_EXPR:
        return function_expr != null;
      case AbsPackage.PURE_EXP__VARIADIC_EXP_LIST:
        return variadic_exp_list != null;
      case AbsPackage.PURE_EXP__C:
        return c != null;
      case AbsPackage.PURE_EXP__L:
        return l != null;
      case AbsPackage.PURE_EXP__ELSE:
        return else_ != null;
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
      case AbsPackage.PURE_EXP__VAR_OR_FIELD_REF:
        return var_or_field_ref != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //Pure_expImpl
