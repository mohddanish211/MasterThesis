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
import org.xtext.abs.Feature_decl_group;
import org.xtext.abs.Fnode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature decl group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Feature_decl_groupImpl#getFnode <em>Fnode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Feature_decl_groupImpl extends MinimalEObjectImpl.Container implements Feature_decl_group
{
  /**
   * The cached value of the '{@link #getFnode() <em>Fnode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFnode()
   * @generated
   * @ordered
   */
  protected EList<Fnode> fnode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Feature_decl_groupImpl()
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
    return AbsPackage.Literals.FEATURE_DECL_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fnode> getFnode()
  {
    if (fnode == null)
    {
      fnode = new EObjectContainmentEList<Fnode>(Fnode.class, this, AbsPackage.FEATURE_DECL_GROUP__FNODE);
    }
    return fnode;
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
      case AbsPackage.FEATURE_DECL_GROUP__FNODE:
        return ((InternalEList<?>)getFnode()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.FEATURE_DECL_GROUP__FNODE:
        return getFnode();
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
      case AbsPackage.FEATURE_DECL_GROUP__FNODE:
        getFnode().clear();
        getFnode().addAll((Collection<? extends Fnode>)newValue);
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
      case AbsPackage.FEATURE_DECL_GROUP__FNODE:
        getFnode().clear();
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
      case AbsPackage.FEATURE_DECL_GROUP__FNODE:
        return fnode != null && !fnode.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Feature_decl_groupImpl
