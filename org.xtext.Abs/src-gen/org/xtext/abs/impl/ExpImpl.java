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
import org.xtext.abs.Exp;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.ExpImpl#getPure_exp_list <em>Pure exp list</em>}</li>
 *   <li>{@link org.xtext.abs.impl.ExpImpl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpImpl extends MinimalEObjectImpl.Container implements Exp
{
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
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected Pure_exp pure_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpImpl()
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
    return AbsPackage.Literals.EXP;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.EXP__PURE_EXP_LIST, oldPure_exp_list, newPure_exp_list);
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
        msgs = ((InternalEObject)pure_exp_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EXP__PURE_EXP_LIST, null, msgs);
      if (newPure_exp_list != null)
        msgs = ((InternalEObject)newPure_exp_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EXP__PURE_EXP_LIST, null, msgs);
      msgs = basicSetPure_exp_list(newPure_exp_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EXP__PURE_EXP_LIST, newPure_exp_list, newPure_exp_list));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.EXP__PURE_EXP, oldPure_exp, newPure_exp);
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
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EXP__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.EXP__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.EXP__PURE_EXP, newPure_exp, newPure_exp));
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
      case AbsPackage.EXP__PURE_EXP_LIST:
        return basicSetPure_exp_list(null, msgs);
      case AbsPackage.EXP__PURE_EXP:
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
      case AbsPackage.EXP__PURE_EXP_LIST:
        return getPure_exp_list();
      case AbsPackage.EXP__PURE_EXP:
        return getPure_exp();
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
      case AbsPackage.EXP__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)newValue);
        return;
      case AbsPackage.EXP__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
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
      case AbsPackage.EXP__PURE_EXP_LIST:
        setPure_exp_list((Pure_exp_list)null);
        return;
      case AbsPackage.EXP__PURE_EXP:
        setPure_exp((Pure_exp)null);
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
      case AbsPackage.EXP__PURE_EXP_LIST:
        return pure_exp_list != null;
      case AbsPackage.EXP__PURE_EXP:
        return pure_exp != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpImpl
