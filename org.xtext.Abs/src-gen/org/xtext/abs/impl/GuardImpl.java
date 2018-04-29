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
import org.xtext.abs.Guard;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Var_or_field_ref;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.GuardImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.abs.impl.GuardImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.xtext.abs.impl.GuardImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.xtext.abs.impl.GuardImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends MinimalEObjectImpl.Container implements Guard
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Var_or_field_ref ref;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected Pure_exp min;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected Pure_exp max;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Pure_exp guard;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardImpl()
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
    return AbsPackage.Literals.GUARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var_or_field_ref getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(Var_or_field_ref newRef, NotificationChain msgs)
  {
    Var_or_field_ref oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Var_or_field_ref newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin(Pure_exp newMin, NotificationChain msgs)
  {
    Pure_exp oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(Pure_exp newMin)
  {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__MIN, newMin, newMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax(Pure_exp newMax, NotificationChain msgs)
  {
    Pure_exp oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(Pure_exp newMax)
  {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__MAX, newMax, newMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(Pure_exp newGuard, NotificationChain msgs)
  {
    Pure_exp oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Pure_exp newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.GUARD__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.GUARD__GUARD, newGuard, newGuard));
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
      case AbsPackage.GUARD__REF:
        return basicSetRef(null, msgs);
      case AbsPackage.GUARD__MIN:
        return basicSetMin(null, msgs);
      case AbsPackage.GUARD__MAX:
        return basicSetMax(null, msgs);
      case AbsPackage.GUARD__GUARD:
        return basicSetGuard(null, msgs);
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
      case AbsPackage.GUARD__REF:
        return getRef();
      case AbsPackage.GUARD__MIN:
        return getMin();
      case AbsPackage.GUARD__MAX:
        return getMax();
      case AbsPackage.GUARD__GUARD:
        return getGuard();
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
      case AbsPackage.GUARD__REF:
        setRef((Var_or_field_ref)newValue);
        return;
      case AbsPackage.GUARD__MIN:
        setMin((Pure_exp)newValue);
        return;
      case AbsPackage.GUARD__MAX:
        setMax((Pure_exp)newValue);
        return;
      case AbsPackage.GUARD__GUARD:
        setGuard((Pure_exp)newValue);
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
      case AbsPackage.GUARD__REF:
        setRef((Var_or_field_ref)null);
        return;
      case AbsPackage.GUARD__MIN:
        setMin((Pure_exp)null);
        return;
      case AbsPackage.GUARD__MAX:
        setMax((Pure_exp)null);
        return;
      case AbsPackage.GUARD__GUARD:
        setGuard((Pure_exp)null);
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
      case AbsPackage.GUARD__REF:
        return ref != null;
      case AbsPackage.GUARD__MIN:
        return min != null;
      case AbsPackage.GUARD__MAX:
        return max != null;
      case AbsPackage.GUARD__GUARD:
        return guard != null;
    }
    return super.eIsSet(featureID);
  }

} //GuardImpl
