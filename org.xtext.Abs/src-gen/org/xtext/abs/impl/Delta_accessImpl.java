/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Delta_access;
import org.xtext.abs.Module_decl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Delta_accessImpl#getModule_ref <em>Module ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Delta_accessImpl extends MinimalEObjectImpl.Container implements Delta_access
{
  /**
   * The cached value of the '{@link #getModule_ref() <em>Module ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_ref()
   * @generated
   * @ordered
   */
  protected Module_decl module_ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Delta_accessImpl()
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
    return AbsPackage.Literals.DELTA_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_decl getModule_ref()
  {
    if (module_ref != null && module_ref.eIsProxy())
    {
      InternalEObject oldModule_ref = (InternalEObject)module_ref;
      module_ref = (Module_decl)eResolveProxy(oldModule_ref);
      if (module_ref != oldModule_ref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.DELTA_ACCESS__MODULE_REF, oldModule_ref, module_ref));
      }
    }
    return module_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_decl basicGetModule_ref()
  {
    return module_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule_ref(Module_decl newModule_ref)
  {
    Module_decl oldModule_ref = module_ref;
    module_ref = newModule_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_ACCESS__MODULE_REF, oldModule_ref, module_ref));
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
      case AbsPackage.DELTA_ACCESS__MODULE_REF:
        if (resolve) return getModule_ref();
        return basicGetModule_ref();
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
      case AbsPackage.DELTA_ACCESS__MODULE_REF:
        setModule_ref((Module_decl)newValue);
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
      case AbsPackage.DELTA_ACCESS__MODULE_REF:
        setModule_ref((Module_decl)null);
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
      case AbsPackage.DELTA_ACCESS__MODULE_REF:
        return module_ref != null;
    }
    return super.eIsSet(featureID);
  }

} //Delta_accessImpl
