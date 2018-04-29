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
import org.xtext.abs.Method;
import org.xtext.abs.Trait_decl;
import org.xtext.abs.Trait_expr;
import org.xtext.abs.Trait_oper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getTraitMethod <em>Trait Method</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getTraitName <em>Trait Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getTrait_expr <em>Trait expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_exprImpl extends Class_modifier_fragmentImpl implements Trait_expr
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<Method> method;

  /**
   * The cached value of the '{@link #getTraitMethod() <em>Trait Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitMethod()
   * @generated
   * @ordered
   */
  protected Method traitMethod;

  /**
   * The cached value of the '{@link #getTraitName() <em>Trait Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitName()
   * @generated
   * @ordered
   */
  protected Trait_decl traitName;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected Trait_oper op;

  /**
   * The cached value of the '{@link #getTrait_expr() <em>Trait expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait_expr()
   * @generated
   * @ordered
   */
  protected Trait_expr trait_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Trait_exprImpl()
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
    return AbsPackage.Literals.TRAIT_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethod()
  {
    if (method == null)
    {
      method = new EObjectContainmentEList<Method>(Method.class, this, AbsPackage.TRAIT_EXPR__METHOD);
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getTraitMethod()
  {
    return traitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTraitMethod(Method newTraitMethod, NotificationChain msgs)
  {
    Method oldTraitMethod = traitMethod;
    traitMethod = newTraitMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_METHOD, oldTraitMethod, newTraitMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraitMethod(Method newTraitMethod)
  {
    if (newTraitMethod != traitMethod)
    {
      NotificationChain msgs = null;
      if (traitMethod != null)
        msgs = ((InternalEObject)traitMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_METHOD, null, msgs);
      if (newTraitMethod != null)
        msgs = ((InternalEObject)newTraitMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_METHOD, null, msgs);
      msgs = basicSetTraitMethod(newTraitMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_METHOD, newTraitMethod, newTraitMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_decl getTraitName()
  {
    if (traitName != null && traitName.eIsProxy())
    {
      InternalEObject oldTraitName = (InternalEObject)traitName;
      traitName = (Trait_decl)eResolveProxy(oldTraitName);
      if (traitName != oldTraitName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.TRAIT_EXPR__TRAIT_NAME, oldTraitName, traitName));
      }
    }
    return traitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_decl basicGetTraitName()
  {
    return traitName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraitName(Trait_decl newTraitName)
  {
    Trait_decl oldTraitName = traitName;
    traitName = newTraitName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_NAME, oldTraitName, traitName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_oper getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(Trait_oper newOp, NotificationChain msgs)
  {
    Trait_oper oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(Trait_oper newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr getTrait_expr()
  {
    return trait_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrait_expr(Trait_expr newTrait_expr, NotificationChain msgs)
  {
    Trait_expr oldTrait_expr = trait_expr;
    trait_expr = newTrait_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_EXPR, oldTrait_expr, newTrait_expr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait_expr(Trait_expr newTrait_expr)
  {
    if (newTrait_expr != trait_expr)
    {
      NotificationChain msgs = null;
      if (trait_expr != null)
        msgs = ((InternalEObject)trait_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_EXPR, null, msgs);
      if (newTrait_expr != null)
        msgs = ((InternalEObject)newTrait_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_EXPR, null, msgs);
      msgs = basicSetTrait_expr(newTrait_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_EXPR, newTrait_expr, newTrait_expr));
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
      case AbsPackage.TRAIT_EXPR__METHOD:
        return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
      case AbsPackage.TRAIT_EXPR__TRAIT_METHOD:
        return basicSetTraitMethod(null, msgs);
      case AbsPackage.TRAIT_EXPR__OP:
        return basicSetOp(null, msgs);
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        return basicSetTrait_expr(null, msgs);
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
      case AbsPackage.TRAIT_EXPR__METHOD:
        return getMethod();
      case AbsPackage.TRAIT_EXPR__TRAIT_METHOD:
        return getTraitMethod();
      case AbsPackage.TRAIT_EXPR__TRAIT_NAME:
        if (resolve) return getTraitName();
        return basicGetTraitName();
      case AbsPackage.TRAIT_EXPR__OP:
        return getOp();
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        return getTrait_expr();
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
      case AbsPackage.TRAIT_EXPR__METHOD:
        getMethod().clear();
        getMethod().addAll((Collection<? extends Method>)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_METHOD:
        setTraitMethod((Method)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_NAME:
        setTraitName((Trait_decl)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__OP:
        setOp((Trait_oper)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        setTrait_expr((Trait_expr)newValue);
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
      case AbsPackage.TRAIT_EXPR__METHOD:
        getMethod().clear();
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_METHOD:
        setTraitMethod((Method)null);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_NAME:
        setTraitName((Trait_decl)null);
        return;
      case AbsPackage.TRAIT_EXPR__OP:
        setOp((Trait_oper)null);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        setTrait_expr((Trait_expr)null);
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
      case AbsPackage.TRAIT_EXPR__METHOD:
        return method != null && !method.isEmpty();
      case AbsPackage.TRAIT_EXPR__TRAIT_METHOD:
        return traitMethod != null;
      case AbsPackage.TRAIT_EXPR__TRAIT_NAME:
        return traitName != null;
      case AbsPackage.TRAIT_EXPR__OP:
        return op != null;
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        return trait_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //Trait_exprImpl
