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
import org.xtext.abs.Data_constructor_arg;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data constructor arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Data_constructor_argImpl#getType_use <em>Type use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Data_constructor_argImpl extends MinimalEObjectImpl.Container implements Data_constructor_arg
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Data_constructor_argImpl()
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
    return AbsPackage.Literals.DATA_CONSTRUCTOR_ARG;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE, oldType_use, newType_use);
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
        msgs = ((InternalEObject)type_use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE, null, msgs);
      if (newType_use != null)
        msgs = ((InternalEObject)newType_use).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE, null, msgs);
      msgs = basicSetType_use(newType_use, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE, newType_use, newType_use));
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
      case AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE:
        return basicSetType_use(null, msgs);
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
      case AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE:
        return getType_use();
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
      case AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE:
        setType_use((Type_use)newValue);
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
      case AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE:
        setType_use((Type_use)null);
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
      case AbsPackage.DATA_CONSTRUCTOR_ARG__TYPE_USE:
        return type_use != null;
    }
    return super.eIsSet(featureID);
  }

} //Data_constructor_argImpl