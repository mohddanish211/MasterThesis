/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Interface_decl;
import org.xtext.abs.Methodsig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Interface_declImpl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Interface_declImpl#getMethodsig <em>Methodsig</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Interface_declImpl extends DeclImpl implements Interface_decl
{
  /**
   * The cached value of the '{@link #getInterface_name() <em>Interface name</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface_name()
   * @generated
   * @ordered
   */
  protected EList<Interface_decl> interface_name;

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
  protected Interface_declImpl()
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
    return AbsPackage.Literals.INTERFACE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface_decl> getInterface_name()
  {
    if (interface_name == null)
    {
      interface_name = new EObjectResolvingEList<Interface_decl>(Interface_decl.class, this, AbsPackage.INTERFACE_DECL__INTERFACE_NAME);
    }
    return interface_name;
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
      methodsig = new EObjectContainmentEList<Methodsig>(Methodsig.class, this, AbsPackage.INTERFACE_DECL__METHODSIG);
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
      case AbsPackage.INTERFACE_DECL__METHODSIG:
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
      case AbsPackage.INTERFACE_DECL__INTERFACE_NAME:
        return getInterface_name();
      case AbsPackage.INTERFACE_DECL__METHODSIG:
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
      case AbsPackage.INTERFACE_DECL__INTERFACE_NAME:
        getInterface_name().clear();
        getInterface_name().addAll((Collection<? extends Interface_decl>)newValue);
        return;
      case AbsPackage.INTERFACE_DECL__METHODSIG:
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
      case AbsPackage.INTERFACE_DECL__INTERFACE_NAME:
        getInterface_name().clear();
        return;
      case AbsPackage.INTERFACE_DECL__METHODSIG:
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
      case AbsPackage.INTERFACE_DECL__INTERFACE_NAME:
        return interface_name != null && !interface_name.isEmpty();
      case AbsPackage.INTERFACE_DECL__METHODSIG:
        return methodsig != null && !methodsig.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Interface_declImpl
