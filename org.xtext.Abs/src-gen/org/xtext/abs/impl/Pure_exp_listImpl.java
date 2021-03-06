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
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Pure_exp_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pure exp list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Pure_exp_listImpl#getPure_exp <em>Pure exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Pure_exp_listImpl extends MinimalEObjectImpl.Container implements Pure_exp_list
{
  /**
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected EList<Pure_exp> pure_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pure_exp_listImpl()
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
    return AbsPackage.Literals.PURE_EXP_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pure_exp> getPure_exp()
  {
    if (pure_exp == null)
    {
      pure_exp = new EObjectContainmentEList<Pure_exp>(Pure_exp.class, this, AbsPackage.PURE_EXP_LIST__PURE_EXP);
    }
    return pure_exp;
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
      case AbsPackage.PURE_EXP_LIST__PURE_EXP:
        return ((InternalEList<?>)getPure_exp()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.PURE_EXP_LIST__PURE_EXP:
        return getPure_exp();
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
      case AbsPackage.PURE_EXP_LIST__PURE_EXP:
        getPure_exp().clear();
        getPure_exp().addAll((Collection<? extends Pure_exp>)newValue);
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
      case AbsPackage.PURE_EXP_LIST__PURE_EXP:
        getPure_exp().clear();
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
      case AbsPackage.PURE_EXP_LIST__PURE_EXP:
        return pure_exp != null && !pure_exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Pure_exp_listImpl
