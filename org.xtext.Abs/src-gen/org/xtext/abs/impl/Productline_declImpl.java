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
import org.xtext.abs.Delta_clause;
import org.xtext.abs.Feature;
import org.xtext.abs.Productline_decl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Productline decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Productline_declImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Productline_declImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Productline_declImpl#getDelta_clause <em>Delta clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Productline_declImpl extends MinimalEObjectImpl.Container implements Productline_decl
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
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Feature> feature;

  /**
   * The cached value of the '{@link #getDelta_clause() <em>Delta clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta_clause()
   * @generated
   * @ordered
   */
  protected EList<Delta_clause> delta_clause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Productline_declImpl()
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
    return AbsPackage.Literals.PRODUCTLINE_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.PRODUCTLINE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectContainmentEList<Feature>(Feature.class, this, AbsPackage.PRODUCTLINE_DECL__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta_clause> getDelta_clause()
  {
    if (delta_clause == null)
    {
      delta_clause = new EObjectContainmentEList<Delta_clause>(Delta_clause.class, this, AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE);
    }
    return delta_clause;
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
      case AbsPackage.PRODUCTLINE_DECL__FEATURE:
        return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
      case AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE:
        return ((InternalEList<?>)getDelta_clause()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.PRODUCTLINE_DECL__NAME:
        return getName();
      case AbsPackage.PRODUCTLINE_DECL__FEATURE:
        return getFeature();
      case AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE:
        return getDelta_clause();
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
      case AbsPackage.PRODUCTLINE_DECL__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.PRODUCTLINE_DECL__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Feature>)newValue);
        return;
      case AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE:
        getDelta_clause().clear();
        getDelta_clause().addAll((Collection<? extends Delta_clause>)newValue);
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
      case AbsPackage.PRODUCTLINE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.PRODUCTLINE_DECL__FEATURE:
        getFeature().clear();
        return;
      case AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE:
        getDelta_clause().clear();
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
      case AbsPackage.PRODUCTLINE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.PRODUCTLINE_DECL__FEATURE:
        return feature != null && !feature.isEmpty();
      case AbsPackage.PRODUCTLINE_DECL__DELTA_CLAUSE:
        return delta_clause != null && !delta_clause.isEmpty();
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

} //Productline_declImpl
