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
import org.xtext.abs.Function_name_decl;
import org.xtext.abs.Function_name_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function name list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Function_name_listImpl#getFunction_name_decl <em>Function name decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Function_name_listImpl extends MinimalEObjectImpl.Container implements Function_name_list
{
  /**
   * The cached value of the '{@link #getFunction_name_decl() <em>Function name decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_name_decl()
   * @generated
   * @ordered
   */
  protected EList<Function_name_decl> function_name_decl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Function_name_listImpl()
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
    return AbsPackage.Literals.FUNCTION_NAME_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function_name_decl> getFunction_name_decl()
  {
    if (function_name_decl == null)
    {
      function_name_decl = new EObjectContainmentEList<Function_name_decl>(Function_name_decl.class, this, AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL);
    }
    return function_name_decl;
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
      case AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL:
        return ((InternalEList<?>)getFunction_name_decl()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL:
        return getFunction_name_decl();
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
      case AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL:
        getFunction_name_decl().clear();
        getFunction_name_decl().addAll((Collection<? extends Function_name_decl>)newValue);
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
      case AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL:
        getFunction_name_decl().clear();
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
      case AbsPackage.FUNCTION_NAME_LIST__FUNCTION_NAME_DECL:
        return function_name_decl != null && !function_name_decl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Function_name_listImpl
