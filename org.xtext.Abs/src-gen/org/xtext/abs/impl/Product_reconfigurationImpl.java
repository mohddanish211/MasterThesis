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
import org.xtext.abs.Delta_id;
import org.xtext.abs.Product_reconfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product reconfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Product_reconfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_reconfigurationImpl#getDelta_id <em>Delta id</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Product_reconfigurationImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Product_reconfigurationImpl extends MinimalEObjectImpl.Container implements Product_reconfiguration
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
   * The cached value of the '{@link #getDelta_id() <em>Delta id</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta_id()
   * @generated
   * @ordered
   */
  protected EList<Delta_id> delta_id;

  /**
   * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected static final String UPDATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected String update = UPDATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Product_reconfigurationImpl()
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
    return AbsPackage.Literals.PRODUCT_RECONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_RECONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_id> getDelta_id()
  {
    if (delta_id == null)
    {
      delta_id = new EObjectContainmentEList<Delta_id>(Delta_id.class, this, AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID);
    }
    return delta_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpdate()
  {
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdate(String newUpdate)
  {
    String oldUpdate = update;
    update = newUpdate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCT_RECONFIGURATION__UPDATE, oldUpdate, update));
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
      case AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID:
        return ((InternalEList<?>)getDelta_id()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.PRODUCT_RECONFIGURATION__NAME:
        return getName();
      case AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID:
        return getDelta_id();
      case AbsPackage.PRODUCT_RECONFIGURATION__UPDATE:
        return getUpdate();
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
      case AbsPackage.PRODUCT_RECONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID:
        getDelta_id().clear();
        getDelta_id().addAll((Collection<? extends Delta_id>)newValue);
        return;
      case AbsPackage.PRODUCT_RECONFIGURATION__UPDATE:
        setUpdate((String)newValue);
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
      case AbsPackage.PRODUCT_RECONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID:
        getDelta_id().clear();
        return;
      case AbsPackage.PRODUCT_RECONFIGURATION__UPDATE:
        setUpdate(UPDATE_EDEFAULT);
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
      case AbsPackage.PRODUCT_RECONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.PRODUCT_RECONFIGURATION__DELTA_ID:
        return delta_id != null && !delta_id.isEmpty();
      case AbsPackage.PRODUCT_RECONFIGURATION__UPDATE:
        return UPDATE_EDEFAULT == null ? update != null : !UPDATE_EDEFAULT.equals(update);
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
    result.append(", update: ");
    result.append(update);
    result.append(')');
    return result.toString();
  }

} //Product_reconfigurationImpl
