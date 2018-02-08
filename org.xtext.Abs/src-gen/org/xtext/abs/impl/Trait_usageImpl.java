/**
 * generated by Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Trait_expr;
import org.xtext.abs.Trait_usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Trait_usageImpl#getTrait_expr <em>Trait expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_usageImpl extends MinimalEObjectImpl.Container implements Trait_usage
{
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
  protected Trait_usageImpl()
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
    return AbsPackage.Literals.TRAIT_USAGE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_USAGE__TRAIT_EXPR, oldTrait_expr, newTrait_expr);
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
        msgs = ((InternalEObject)trait_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_USAGE__TRAIT_EXPR, null, msgs);
      if (newTrait_expr != null)
        msgs = ((InternalEObject)newTrait_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TRAIT_USAGE__TRAIT_EXPR, null, msgs);
      msgs = basicSetTrait_expr(newTrait_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TRAIT_USAGE__TRAIT_EXPR, newTrait_expr, newTrait_expr));
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
      case AbsPackage.TRAIT_USAGE__TRAIT_EXPR:
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
      case AbsPackage.TRAIT_USAGE__TRAIT_EXPR:
        return getTrait_expr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AbsPackage.TRAIT_USAGE__TRAIT_EXPR:
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
      case AbsPackage.TRAIT_USAGE__TRAIT_EXPR:
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
      case AbsPackage.TRAIT_USAGE__TRAIT_EXPR:
        return trait_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //Trait_usageImpl
