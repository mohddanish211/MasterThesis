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
import org.xtext.abs.Class_modifier_fragment;
import org.xtext.abs.Methodsig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class modifier fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Class_modifier_fragmentImpl#getMethodsig <em>Methodsig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class_modifier_fragmentImpl extends MinimalEObjectImpl.Container implements Class_modifier_fragment
{
  /**
   * The cached value of the '{@link #getMethodsig() <em>Methodsig</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodsig()
   * @generated
   * @ordered
   */
  protected EList<Methodsig> methodsig;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_modifier_fragmentImpl()
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
    return AbsPackage.Literals.CLASS_MODIFIER_FRAGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Methodsig> getMethodsig()
  {
    if (methodsig == null)
    {
      methodsig = new EObjectContainmentEList<Methodsig>(Methodsig.class, this, AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG);
    }
    return methodsig;
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
      case AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG:
        return ((InternalEList<?>)getMethodsig()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG:
        return getMethodsig();
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
      case AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG:
        getMethodsig().clear();
        getMethodsig().addAll((Collection<? extends Methodsig>)newValue);
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
      case AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG:
        getMethodsig().clear();
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
      case AbsPackage.CLASS_MODIFIER_FRAGMENT__METHODSIG:
        return methodsig != null && !methodsig.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Class_modifier_fragmentImpl
