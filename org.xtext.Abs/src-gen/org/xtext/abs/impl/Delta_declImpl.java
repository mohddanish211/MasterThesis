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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Delta_access;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Delta_param;
import org.xtext.abs.Module_modifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Delta_declImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_declImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_declImpl#getDelta_access <em>Delta access</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Delta_declImpl#getModule_modifier <em>Module modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Delta_declImpl extends MinimalEObjectImpl.Container implements Delta_decl
{
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
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected EList<Delta_param> p;

  /**
   * The cached value of the '{@link #getDelta_access() <em>Delta access</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta_access()
   * @generated
   * @ordered
   */
  protected EList<Delta_access> delta_access;

  /**
   * The cached value of the '{@link #getModule_modifier() <em>Module modifier</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_modifier()
   * @generated
   * @ordered
   */
  protected EList<Module_modifier> module_modifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Delta_declImpl()
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
    return AbsPackage.Literals.DELTA_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DELTA_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_param> getP()
  {
    if (p == null)
    {
      p = new EObjectContainmentEList<Delta_param>(Delta_param.class, this, AbsPackage.DELTA_DECL__P);
    }
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_access> getDelta_access()
  {
    if (delta_access == null)
    {
      delta_access = new EObjectContainmentEList<Delta_access>(Delta_access.class, this, AbsPackage.DELTA_DECL__DELTA_ACCESS);
    }
    return delta_access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module_modifier> getModule_modifier()
  {
    if (module_modifier == null)
    {
      module_modifier = new EObjectContainmentEList<Module_modifier>(Module_modifier.class, this, AbsPackage.DELTA_DECL__MODULE_MODIFIER);
    }
    return module_modifier;
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
      case AbsPackage.DELTA_DECL__P:
        return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
      case AbsPackage.DELTA_DECL__DELTA_ACCESS:
        return ((InternalEList<?>)getDelta_access()).basicRemove(otherEnd, msgs);
      case AbsPackage.DELTA_DECL__MODULE_MODIFIER:
        return ((InternalEList<?>)getModule_modifier()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.DELTA_DECL__NAME:
        return getName();
      case AbsPackage.DELTA_DECL__P:
        return getP();
      case AbsPackage.DELTA_DECL__DELTA_ACCESS:
        return getDelta_access();
      case AbsPackage.DELTA_DECL__MODULE_MODIFIER:
        return getModule_modifier();
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
      case AbsPackage.DELTA_DECL__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.DELTA_DECL__P:
        getP().clear();
        getP().addAll((Collection<? extends Delta_param>)newValue);
        return;
      case AbsPackage.DELTA_DECL__DELTA_ACCESS:
        getDelta_access().clear();
        getDelta_access().addAll((Collection<? extends Delta_access>)newValue);
        return;
      case AbsPackage.DELTA_DECL__MODULE_MODIFIER:
        getModule_modifier().clear();
        getModule_modifier().addAll((Collection<? extends Module_modifier>)newValue);
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
      case AbsPackage.DELTA_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.DELTA_DECL__P:
        getP().clear();
        return;
      case AbsPackage.DELTA_DECL__DELTA_ACCESS:
        getDelta_access().clear();
        return;
      case AbsPackage.DELTA_DECL__MODULE_MODIFIER:
        getModule_modifier().clear();
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
      case AbsPackage.DELTA_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.DELTA_DECL__P:
        return p != null && !p.isEmpty();
      case AbsPackage.DELTA_DECL__DELTA_ACCESS:
        return delta_access != null && !delta_access.isEmpty();
      case AbsPackage.DELTA_DECL__MODULE_MODIFIER:
        return module_modifier != null && !module_modifier.isEmpty();
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

} //Delta_declImpl
