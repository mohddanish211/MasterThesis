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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Methodsig;
import org.xtext.abs.Trait_expr;
import org.xtext.abs.Trait_oper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait oper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Trait_operImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_operImpl#getMethodsig <em>Methodsig</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_operImpl#getTrait_expr <em>Trait expr</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_operImpl#getTrait_exp <em>Trait exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_operImpl extends MinimalEObjectImpl.Container implements Trait_oper
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Methodsig method;

  /**
   * The cached value of the '{@link #getMethodsig() <em>Methodsig</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodsig()
   * @generated
   * @ordered
   */
  protected EList<Methodsig> methodsig;

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
   * The cached value of the '{@link #getTrait_exp() <em>Trait exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait_exp()
   * @generated
   * @ordered
   */
  protected Trait_expr trait_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Trait_operImpl()
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
    return AbsPackage.Literals.TRAIT_OPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig getMethod()
  {
    if (method != null && method.eIsProxy())
    {
      InternalEObject oldMethod = (InternalEObject)method;
      method = (Methodsig)eResolveProxy(oldMethod);
      if (method != oldMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.TRAIT_OPER__METHOD, oldMethod, method));
      }
    }
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig basicGetMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Methodsig newMethod)
  {
    Methodsig oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_OPER__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Methodsig> getMethodsig()
  {
    if (methodsig == null)
    {
      methodsig = new EObjectResolvingEList<Methodsig>(Methodsig.class, this, AbsPackage.TRAIT_OPER__METHODSIG);
    }
    return methodsig;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_OPER__TRAIT_EXPR, oldTrait_expr, newTrait_expr);
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
        msgs = ((InternalEObject)trait_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_OPER__TRAIT_EXPR, null, msgs);
      if (newTrait_expr != null)
        msgs = ((InternalEObject)newTrait_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_OPER__TRAIT_EXPR, null, msgs);
      msgs = basicSetTrait_expr(newTrait_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_OPER__TRAIT_EXPR, newTrait_expr, newTrait_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr getTrait_exp()
  {
    return trait_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrait_exp(Trait_expr newTrait_exp, NotificationChain msgs)
  {
    Trait_expr oldTrait_exp = trait_exp;
    trait_exp = newTrait_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_OPER__TRAIT_EXP, oldTrait_exp, newTrait_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait_exp(Trait_expr newTrait_exp)
  {
    if (newTrait_exp != trait_exp)
    {
      NotificationChain msgs = null;
      if (trait_exp != null)
        msgs = ((InternalEObject)trait_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_OPER__TRAIT_EXP, null, msgs);
      if (newTrait_exp != null)
        msgs = ((InternalEObject)newTrait_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_OPER__TRAIT_EXP, null, msgs);
      msgs = basicSetTrait_exp(newTrait_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_OPER__TRAIT_EXP, newTrait_exp, newTrait_exp));
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
      case AbsPackage.TRAIT_OPER__TRAIT_EXPR:
        return basicSetTrait_expr(null, msgs);
      case AbsPackage.TRAIT_OPER__TRAIT_EXP:
        return basicSetTrait_exp(null, msgs);
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
      case AbsPackage.TRAIT_OPER__METHOD:
        if (resolve) return getMethod();
        return basicGetMethod();
      case AbsPackage.TRAIT_OPER__METHODSIG:
        return getMethodsig();
      case AbsPackage.TRAIT_OPER__TRAIT_EXPR:
        return getTrait_expr();
      case AbsPackage.TRAIT_OPER__TRAIT_EXP:
        return getTrait_exp();
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
      case AbsPackage.TRAIT_OPER__METHOD:
        setMethod((Methodsig)newValue);
        return;
      case AbsPackage.TRAIT_OPER__METHODSIG:
        getMethodsig().clear();
        getMethodsig().addAll((Collection<? extends Methodsig>)newValue);
        return;
      case AbsPackage.TRAIT_OPER__TRAIT_EXPR:
        setTrait_expr((Trait_expr)newValue);
        return;
      case AbsPackage.TRAIT_OPER__TRAIT_EXP:
        setTrait_exp((Trait_expr)newValue);
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
      case AbsPackage.TRAIT_OPER__METHOD:
        setMethod((Methodsig)null);
        return;
      case AbsPackage.TRAIT_OPER__METHODSIG:
        getMethodsig().clear();
        return;
      case AbsPackage.TRAIT_OPER__TRAIT_EXPR:
        setTrait_expr((Trait_expr)null);
        return;
      case AbsPackage.TRAIT_OPER__TRAIT_EXP:
        setTrait_exp((Trait_expr)null);
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
      case AbsPackage.TRAIT_OPER__METHOD:
        return method != null;
      case AbsPackage.TRAIT_OPER__METHODSIG:
        return methodsig != null && !methodsig.isEmpty();
      case AbsPackage.TRAIT_OPER__TRAIT_EXPR:
        return trait_expr != null;
      case AbsPackage.TRAIT_OPER__TRAIT_EXP:
        return trait_exp != null;
    }
    return super.eIsSet(featureID);
  }

} //Trait_operImpl
