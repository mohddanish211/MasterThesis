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
import org.xtext.abs.Data_constructor;
import org.xtext.abs.Data_constructor_arg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Data_constructorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Data_constructorImpl#getData_constructor_arg <em>Data constructor arg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Data_constructorImpl extends MinimalEObjectImpl.Container implements Data_constructor
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
   * The cached value of the '{@link #getData_constructor_arg() <em>Data constructor arg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData_constructor_arg()
   * @generated
   * @ordered
   */
  protected EList<Data_constructor_arg> data_constructor_arg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Data_constructorImpl()
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
    return AbsPackage.Literals.DATA_CONSTRUCTOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DATA_CONSTRUCTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data_constructor_arg> getData_constructor_arg()
  {
    if (data_constructor_arg == null)
    {
      data_constructor_arg = new EObjectContainmentEList<Data_constructor_arg>(Data_constructor_arg.class, this, AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG);
    }
    return data_constructor_arg;
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
      case AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG:
        return ((InternalEList<?>)getData_constructor_arg()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.DATA_CONSTRUCTOR__NAME:
        return getName();
      case AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG:
        return getData_constructor_arg();
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
      case AbsPackage.DATA_CONSTRUCTOR__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG:
        getData_constructor_arg().clear();
        getData_constructor_arg().addAll((Collection<? extends Data_constructor_arg>)newValue);
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
      case AbsPackage.DATA_CONSTRUCTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG:
        getData_constructor_arg().clear();
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
      case AbsPackage.DATA_CONSTRUCTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.DATA_CONSTRUCTOR__DATA_CONSTRUCTOR_ARG:
        return data_constructor_arg != null && !data_constructor_arg.isEmpty();
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

} //Data_constructorImpl
