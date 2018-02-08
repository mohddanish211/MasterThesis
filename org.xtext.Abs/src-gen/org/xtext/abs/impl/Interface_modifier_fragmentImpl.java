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
import org.xtext.abs.Interface_modifier_fragment;
import org.xtext.abs.Methodsig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface modifier fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Interface_modifier_fragmentImpl#getAddMethodsig <em>Add Methodsig</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Interface_modifier_fragmentImpl#getRemovedMethod <em>Removed Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Interface_modifier_fragmentImpl extends MinimalEObjectImpl.Container implements Interface_modifier_fragment
{
  /**
   * The cached value of the '{@link #getAddMethodsig() <em>Add Methodsig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddMethodsig()
   * @generated
   * @ordered
   */
  protected Methodsig addMethodsig;

  /**
   * The cached value of the '{@link #getRemovedMethod() <em>Removed Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovedMethod()
   * @generated
   * @ordered
   */
  protected Methodsig removedMethod;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Interface_modifier_fragmentImpl()
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
    return AbsPackage.Literals.INTERFACE_MODIFIER_FRAGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig getAddMethodsig()
  {
    return addMethodsig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddMethodsig(Methodsig newAddMethodsig, NotificationChain msgs)
  {
    Methodsig oldAddMethodsig = addMethodsig;
    addMethodsig = newAddMethodsig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG, oldAddMethodsig, newAddMethodsig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddMethodsig(Methodsig newAddMethodsig)
  {
    if (newAddMethodsig != addMethodsig)
    {
      NotificationChain msgs = null;
      if (addMethodsig != null)
        msgs = ((InternalEObject)addMethodsig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG, null, msgs);
      if (newAddMethodsig != null)
        msgs = ((InternalEObject)newAddMethodsig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG, null, msgs);
      msgs = basicSetAddMethodsig(newAddMethodsig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG, newAddMethodsig, newAddMethodsig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig getRemovedMethod()
  {
    if (removedMethod != null && removedMethod.eIsProxy())
    {
      InternalEObject oldRemovedMethod = (InternalEObject)removedMethod;
      removedMethod = (Methodsig)eResolveProxy(oldRemovedMethod);
      if (removedMethod != oldRemovedMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD, oldRemovedMethod, removedMethod));
      }
    }
    return removedMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Methodsig basicGetRemovedMethod()
  {
    return removedMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemovedMethod(Methodsig newRemovedMethod)
  {
    Methodsig oldRemovedMethod = removedMethod;
    removedMethod = newRemovedMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD, oldRemovedMethod, removedMethod));
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
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG:
        return basicSetAddMethodsig(null, msgs);
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
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG:
        return getAddMethodsig();
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD:
        if (resolve) return getRemovedMethod();
        return basicGetRemovedMethod();
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
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG:
        setAddMethodsig((Methodsig)newValue);
        return;
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD:
        setRemovedMethod((Methodsig)newValue);
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
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG:
        setAddMethodsig((Methodsig)null);
        return;
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD:
        setRemovedMethod((Methodsig)null);
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
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__ADD_METHODSIG:
        return addMethodsig != null;
      case AbsPackage.INTERFACE_MODIFIER_FRAGMENT__REMOVED_METHOD:
        return removedMethod != null;
    }
    return super.eIsSet(featureID);
  }

} //Interface_modifier_fragmentImpl