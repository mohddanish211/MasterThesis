/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Function_list;
import org.xtext.abs.Function_param;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Function_listImpl#getFunction_param <em>Function param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Function_listImpl extends MinimalEObjectImpl.Container implements Function_list
{
  /**
   * The cached value of the '{@link #getFunction_param() <em>Function param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_param()
   * @generated
   * @ordered
   */
  protected EList<Function_param> function_param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Function_listImpl()
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
    return AbsPackage.Literals.FUNCTION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function_param> getFunction_param()
  {
    if (function_param == null)
    {
      function_param = new EObjectContainmentEList<Function_param>(Function_param.class, this, AbsPackage.FUNCTION_LIST__FUNCTION_PARAM);
    }
    return function_param;
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
      case AbsPackage.FUNCTION_LIST__FUNCTION_PARAM:
        return ((InternalEList<?>)getFunction_param()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.FUNCTION_LIST__FUNCTION_PARAM:
        return getFunction_param();
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
      case AbsPackage.FUNCTION_LIST__FUNCTION_PARAM:
        getFunction_param().clear();
        getFunction_param().addAll((Collection<? extends Function_param>)newValue);
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
      case AbsPackage.FUNCTION_LIST__FUNCTION_PARAM:
        getFunction_param().clear();
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
      case AbsPackage.FUNCTION_LIST__FUNCTION_PARAM:
        return function_param != null && !function_param.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Function_listImpl
