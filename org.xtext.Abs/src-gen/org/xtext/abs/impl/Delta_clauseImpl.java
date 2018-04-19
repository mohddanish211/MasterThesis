/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.After_condition;
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.From_condition;
import org.xtext.abs.When_condition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Delta_clauseImpl#getDeltaspec <em>Deltaspec</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_clauseImpl#getAfter_condition <em>After condition</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_clauseImpl#getFrom_condition <em>From condition</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_clauseImpl#getWhen_condition <em>When condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Delta_clauseImpl extends MinimalEObjectImpl.Container implements Delta_clause
{
  /**
   * The cached value of the '{@link #getDeltaspec() <em>Deltaspec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaspec()
   * @generated
   * @ordered
   */
  protected Delta_decl deltaspec;

  /**
   * The cached value of the '{@link #getAfter_condition() <em>After condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter_condition()
   * @generated
   * @ordered
   */
  protected After_condition after_condition;

  /**
   * The cached value of the '{@link #getFrom_condition() <em>From condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom_condition()
   * @generated
   * @ordered
   */
  protected From_condition from_condition;

  /**
   * The cached value of the '{@link #getWhen_condition() <em>When condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen_condition()
   * @generated
   * @ordered
   */
  protected When_condition when_condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Delta_clauseImpl()
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
    return AbsPackage.Literals.DELTA_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_decl getDeltaspec()
  {
    if (deltaspec != null && deltaspec.eIsProxy())
    {
      InternalEObject oldDeltaspec = (InternalEObject)deltaspec;
      deltaspec = (Delta_decl)eResolveProxy(oldDeltaspec);
      if (deltaspec != oldDeltaspec)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.DELTA_CLAUSE__DELTASPEC, oldDeltaspec, deltaspec));
      }
    }
    return deltaspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta_decl basicGetDeltaspec()
  {
    return deltaspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeltaspec(Delta_decl newDeltaspec)
  {
    Delta_decl oldDeltaspec = deltaspec;
    deltaspec = newDeltaspec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__DELTASPEC, oldDeltaspec, deltaspec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public After_condition getAfter_condition()
  {
    return after_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfter_condition(After_condition newAfter_condition, NotificationChain msgs)
  {
    After_condition oldAfter_condition = after_condition;
    after_condition = newAfter_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__AFTER_CONDITION, oldAfter_condition, newAfter_condition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter_condition(After_condition newAfter_condition)
  {
    if (newAfter_condition != after_condition)
    {
      NotificationChain msgs = null;
      if (after_condition != null)
        msgs = ((InternalEObject)after_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__AFTER_CONDITION, null, msgs);
      if (newAfter_condition != null)
        msgs = ((InternalEObject)newAfter_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__AFTER_CONDITION, null, msgs);
      msgs = basicSetAfter_condition(newAfter_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__AFTER_CONDITION, newAfter_condition, newAfter_condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From_condition getFrom_condition()
  {
    return from_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom_condition(From_condition newFrom_condition, NotificationChain msgs)
  {
    From_condition oldFrom_condition = from_condition;
    from_condition = newFrom_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__FROM_CONDITION, oldFrom_condition, newFrom_condition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom_condition(From_condition newFrom_condition)
  {
    if (newFrom_condition != from_condition)
    {
      NotificationChain msgs = null;
      if (from_condition != null)
        msgs = ((InternalEObject)from_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__FROM_CONDITION, null, msgs);
      if (newFrom_condition != null)
        msgs = ((InternalEObject)newFrom_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__FROM_CONDITION, null, msgs);
      msgs = basicSetFrom_condition(newFrom_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__FROM_CONDITION, newFrom_condition, newFrom_condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When_condition getWhen_condition()
  {
    return when_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen_condition(When_condition newWhen_condition, NotificationChain msgs)
  {
    When_condition oldWhen_condition = when_condition;
    when_condition = newWhen_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__WHEN_CONDITION, oldWhen_condition, newWhen_condition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen_condition(When_condition newWhen_condition)
  {
    if (newWhen_condition != when_condition)
    {
      NotificationChain msgs = null;
      if (when_condition != null)
        msgs = ((InternalEObject)when_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__WHEN_CONDITION, null, msgs);
      if (newWhen_condition != null)
        msgs = ((InternalEObject)newWhen_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DELTA_CLAUSE__WHEN_CONDITION, null, msgs);
      msgs = basicSetWhen_condition(newWhen_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_CLAUSE__WHEN_CONDITION, newWhen_condition, newWhen_condition));
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
      case AbsPackage.DELTA_CLAUSE__AFTER_CONDITION:
        return basicSetAfter_condition(null, msgs);
      case AbsPackage.DELTA_CLAUSE__FROM_CONDITION:
        return basicSetFrom_condition(null, msgs);
      case AbsPackage.DELTA_CLAUSE__WHEN_CONDITION:
        return basicSetWhen_condition(null, msgs);
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
      case AbsPackage.DELTA_CLAUSE__DELTASPEC:
        if (resolve) return getDeltaspec();
        return basicGetDeltaspec();
      case AbsPackage.DELTA_CLAUSE__AFTER_CONDITION:
        return getAfter_condition();
      case AbsPackage.DELTA_CLAUSE__FROM_CONDITION:
        return getFrom_condition();
      case AbsPackage.DELTA_CLAUSE__WHEN_CONDITION:
        return getWhen_condition();
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
      case AbsPackage.DELTA_CLAUSE__DELTASPEC:
        setDeltaspec((Delta_decl)newValue);
        return;
      case AbsPackage.DELTA_CLAUSE__AFTER_CONDITION:
        setAfter_condition((After_condition)newValue);
        return;
      case AbsPackage.DELTA_CLAUSE__FROM_CONDITION:
        setFrom_condition((From_condition)newValue);
        return;
      case AbsPackage.DELTA_CLAUSE__WHEN_CONDITION:
        setWhen_condition((When_condition)newValue);
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
      case AbsPackage.DELTA_CLAUSE__DELTASPEC:
        setDeltaspec((Delta_decl)null);
        return;
      case AbsPackage.DELTA_CLAUSE__AFTER_CONDITION:
        setAfter_condition((After_condition)null);
        return;
      case AbsPackage.DELTA_CLAUSE__FROM_CONDITION:
        setFrom_condition((From_condition)null);
        return;
      case AbsPackage.DELTA_CLAUSE__WHEN_CONDITION:
        setWhen_condition((When_condition)null);
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
      case AbsPackage.DELTA_CLAUSE__DELTASPEC:
        return deltaspec != null;
      case AbsPackage.DELTA_CLAUSE__AFTER_CONDITION:
        return after_condition != null;
      case AbsPackage.DELTA_CLAUSE__FROM_CONDITION:
        return from_condition != null;
      case AbsPackage.DELTA_CLAUSE__WHEN_CONDITION:
        return when_condition != null;
    }
    return super.eIsSet(featureID);
  }

} //Delta_clauseImpl
