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
import org.xtext.abs.Application_condition;
import org.xtext.abs.From_condition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.From_conditionImpl#getApplication_condition <em>Application condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class From_conditionImpl extends MinimalEObjectImpl.Container implements From_condition
{
  /**
   * The cached value of the '{@link #getApplication_condition() <em>Application condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication_condition()
   * @generated
   * @ordered
   */
  protected Application_condition application_condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected From_conditionImpl()
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
    return AbsPackage.Literals.FROM_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application_condition getApplication_condition()
  {
    return application_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplication_condition(Application_condition newApplication_condition, NotificationChain msgs)
  {
    Application_condition oldApplication_condition = application_condition;
    application_condition = newApplication_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FROM_CONDITION__APPLICATION_CONDITION, oldApplication_condition, newApplication_condition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication_condition(Application_condition newApplication_condition)
  {
    if (newApplication_condition != application_condition)
    {
      NotificationChain msgs = null;
      if (application_condition != null)
        msgs = ((InternalEObject)application_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FROM_CONDITION__APPLICATION_CONDITION, null, msgs);
      if (newApplication_condition != null)
        msgs = ((InternalEObject)newApplication_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FROM_CONDITION__APPLICATION_CONDITION, null, msgs);
      msgs = basicSetApplication_condition(newApplication_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FROM_CONDITION__APPLICATION_CONDITION, newApplication_condition, newApplication_condition));
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
      case AbsPackage.FROM_CONDITION__APPLICATION_CONDITION:
        return basicSetApplication_condition(null, msgs);
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
      case AbsPackage.FROM_CONDITION__APPLICATION_CONDITION:
        return getApplication_condition();
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
      case AbsPackage.FROM_CONDITION__APPLICATION_CONDITION:
        setApplication_condition((Application_condition)newValue);
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
      case AbsPackage.FROM_CONDITION__APPLICATION_CONDITION:
        setApplication_condition((Application_condition)null);
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
      case AbsPackage.FROM_CONDITION__APPLICATION_CONDITION:
        return application_condition != null;
    }
    return super.eIsSet(featureID);
  }

} //From_conditionImpl
