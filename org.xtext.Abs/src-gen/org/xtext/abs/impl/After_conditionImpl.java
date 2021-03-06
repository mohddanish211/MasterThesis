/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.After_condition;
import org.xtext.abs.Delta_decl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.After_conditionImpl#getDelta_id <em>Delta id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class After_conditionImpl extends MinimalEObjectImpl.Container implements After_condition
{
  /**
   * The cached value of the '{@link #getDelta_id() <em>Delta id</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta_id()
   * @generated
   * @ordered
   */
  protected EList<Delta_decl> delta_id;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected After_conditionImpl()
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
    return AbsPackage.Literals.AFTER_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_decl> getDelta_id()
  {
    if (delta_id == null)
    {
      delta_id = new EObjectResolvingEList<Delta_decl>(Delta_decl.class, this, AbsPackage.AFTER_CONDITION__DELTA_ID);
    }
    return delta_id;
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
      case AbsPackage.AFTER_CONDITION__DELTA_ID:
        return getDelta_id();
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
      case AbsPackage.AFTER_CONDITION__DELTA_ID:
        getDelta_id().clear();
        getDelta_id().addAll((Collection<? extends Delta_decl>)newValue);
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
      case AbsPackage.AFTER_CONDITION__DELTA_ID:
        getDelta_id().clear();
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
      case AbsPackage.AFTER_CONDITION__DELTA_ID:
        return delta_id != null && !delta_id.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //After_conditionImpl
