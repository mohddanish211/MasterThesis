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
import org.xtext.abs.Trait_decl;
import org.xtext.abs.Trait_usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trait usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Trait_usageImpl#getTraitUsage <em>Trait Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Trait_usageImpl extends MinimalEObjectImpl.Container implements Trait_usage
{
  /**
   * The cached value of the '{@link #getTraitUsage() <em>Trait Usage</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraitUsage()
   * @generated
   * @ordered
   */
  protected EList<Trait_decl> traitUsage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Trait_usageImpl()
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
    return AbsPackage.Literals.TRAIT_USAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trait_decl> getTraitUsage()
  {
    if (traitUsage == null)
    {
      traitUsage = new EObjectResolvingEList<Trait_decl>(Trait_decl.class, this, AbsPackage.TRAIT_USAGE__TRAIT_USAGE);
    }
    return traitUsage;
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
      case AbsPackage.TRAIT_USAGE__TRAIT_USAGE:
        return getTraitUsage();
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
      case AbsPackage.TRAIT_USAGE__TRAIT_USAGE:
        getTraitUsage().clear();
        getTraitUsage().addAll((Collection<? extends Trait_decl>)newValue);
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
      case AbsPackage.TRAIT_USAGE__TRAIT_USAGE:
        getTraitUsage().clear();
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
      case AbsPackage.TRAIT_USAGE__TRAIT_USAGE:
        return traitUsage != null && !traitUsage.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Trait_usageImpl
