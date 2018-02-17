/**
 * generated by Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Method;
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
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getTrait_expr <em>Trait expr</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Trait_exprImpl#getTrait_oper <em>Trait oper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_exprImpl extends Trait_usageImpl implements Trait_expr
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected EList<Method> method;

  /**
   * The cached value of the '{@link #getTraitMethod() <em>Trait Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitMethod()
   * @generated
   * @ordered
   */
  protected Method traitMethod;

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
   * The cached value of the '{@link #getTrait_expr() <em>Trait expr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait_expr()
   * @generated
   * @ordered
   */
  protected Trait_expr trait_expr;

  /**
   * The cached value of the '{@link #getTrait_oper() <em>Trait oper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrait_oper()
   * @generated
   * @ordered
   */
  protected Trait_oper trait_oper;

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
      method = new EObjectResolvingEList<Method>(Method.class, this, AbsPackage.TRAIT_EXPR__METHOD);
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
    if (traitMethod != null && traitMethod.eIsProxy())
    {
      InternalEObject oldTraitMethod = (InternalEObject)traitMethod;
      traitMethod = (Method)eResolveProxy(oldTraitMethod);
      if (traitMethod != oldTraitMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.TRAIT_EXPR__TRAIT_METHOD, oldTraitMethod, traitMethod));
      }
    }
    return traitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method basicGetTraitMethod()
  {
    return traitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTraitMethod(Method newTraitMethod)
  {
    Method oldTraitMethod = traitMethod;
    traitMethod = newTraitMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_METHOD, oldTraitMethod, traitMethod));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr getTrait_expr()
  {
    if (trait_expr != null && trait_expr.eIsProxy())
    {
      InternalEObject oldTrait_expr = (InternalEObject)trait_expr;
      trait_expr = (Trait_expr)eResolveProxy(oldTrait_expr);
      if (trait_expr != oldTrait_expr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.TRAIT_EXPR__TRAIT_EXPR, oldTrait_expr, trait_expr));
      }
    }
    return trait_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_expr basicGetTrait_expr()
  {
    return trait_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait_expr(Trait_expr newTrait_expr)
  {
    Trait_expr oldTrait_expr = trait_expr;
    trait_expr = newTrait_expr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_EXPR, oldTrait_expr, trait_expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait_oper getTrait_oper()
  {
    return trait_oper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrait_oper(Trait_oper newTrait_oper, NotificationChain msgs)
  {
    Trait_oper oldTrait_oper = trait_oper;
    trait_oper = newTrait_oper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_OPER, oldTrait_oper, newTrait_oper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrait_oper(Trait_oper newTrait_oper)
  {
    if (newTrait_oper != trait_oper)
    {
      NotificationChain msgs = null;
      if (trait_oper != null)
        msgs = ((InternalEObject)trait_oper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_OPER, null, msgs);
      if (newTrait_oper != null)
        msgs = ((InternalEObject)newTrait_oper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_EXPR__TRAIT_OPER, null, msgs);
      msgs = basicSetTrait_oper(newTrait_oper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_EXPR__TRAIT_OPER, newTrait_oper, newTrait_oper));
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
      case AbsPackage.TRAIT_EXPR__TRAIT_OPER:
        return basicSetTrait_oper(null, msgs);
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
        if (resolve) return getTraitMethod();
        return basicGetTraitMethod();
      case AbsPackage.TRAIT_EXPR__NAME:
        return getName();
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        if (resolve) return getTrait_expr();
        return basicGetTrait_expr();
      case AbsPackage.TRAIT_EXPR__TRAIT_OPER:
        return getTrait_oper();
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
      case AbsPackage.TRAIT_EXPR__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        setTrait_expr((Trait_expr)newValue);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_OPER:
        setTrait_oper((Trait_oper)newValue);
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
      case AbsPackage.TRAIT_EXPR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        setTrait_expr((Trait_expr)null);
        return;
      case AbsPackage.TRAIT_EXPR__TRAIT_OPER:
        setTrait_oper((Trait_oper)null);
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
      case AbsPackage.TRAIT_EXPR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.TRAIT_EXPR__TRAIT_EXPR:
        return trait_expr != null;
      case AbsPackage.TRAIT_EXPR__TRAIT_OPER:
        return trait_oper != null;
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
    result.append(')');
    return result.toString();
  }

} //Trait_exprImpl
