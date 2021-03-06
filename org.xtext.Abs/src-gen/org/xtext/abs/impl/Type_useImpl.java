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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Annotation;
import org.xtext.abs.Pure_exp;
import org.xtext.abs.Type_use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Type_useImpl#getPure_exp <em>Pure exp</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Type_useImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Type_useImpl#getType_use <em>Type use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Type_useImpl extends Data_constructor_argImpl implements Type_use
{
  /**
   * The cached value of the '{@link #getPure_exp() <em>Pure exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPure_exp()
   * @generated
   * @ordered
   */
  protected Pure_exp pure_exp;

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
   * The cached value of the '{@link #getType_use() <em>Type use</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_use()
   * @generated
   * @ordered
   */
  protected EList<Type_use> type_use;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Type_useImpl()
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
    return AbsPackage.Literals.TYPE_USE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pure_exp getPure_exp()
  {
    return pure_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPure_exp(Pure_exp newPure_exp, NotificationChain msgs)
  {
    Pure_exp oldPure_exp = pure_exp;
    pure_exp = newPure_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_USE__PURE_EXP, oldPure_exp, newPure_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPure_exp(Pure_exp newPure_exp)
  {
    if (newPure_exp != pure_exp)
    {
      NotificationChain msgs = null;
      if (pure_exp != null)
        msgs = ((InternalEObject)pure_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TYPE_USE__PURE_EXP, null, msgs);
      if (newPure_exp != null)
        msgs = ((InternalEObject)newPure_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.TYPE_USE__PURE_EXP, null, msgs);
      msgs = basicSetPure_exp(newPure_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_USE__PURE_EXP, newPure_exp, newPure_exp));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.TYPE_USE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type_use> getType_use()
  {
    if (type_use == null)
    {
      type_use = new EObjectContainmentEList<Type_use>(Type_use.class, this, AbsPackage.TYPE_USE__TYPE_USE);
    }
    return type_use;
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
      case AbsPackage.TYPE_USE__PURE_EXP:
        return basicSetPure_exp(null, msgs);
      case AbsPackage.TYPE_USE__TYPE_USE:
        return ((InternalEList<?>)getType_use()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.TYPE_USE__PURE_EXP:
        return getPure_exp();
      case AbsPackage.TYPE_USE__NAME:
        return getName();
      case AbsPackage.TYPE_USE__TYPE_USE:
        return getType_use();
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
      case AbsPackage.TYPE_USE__PURE_EXP:
        setPure_exp((Pure_exp)newValue);
        return;
      case AbsPackage.TYPE_USE__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.TYPE_USE__TYPE_USE:
        getType_use().clear();
        getType_use().addAll((Collection<? extends Type_use>)newValue);
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
      case AbsPackage.TYPE_USE__PURE_EXP:
        setPure_exp((Pure_exp)null);
        return;
      case AbsPackage.TYPE_USE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.TYPE_USE__TYPE_USE:
        getType_use().clear();
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
      case AbsPackage.TYPE_USE__PURE_EXP:
        return pure_exp != null;
      case AbsPackage.TYPE_USE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.TYPE_USE__TYPE_USE:
        return type_use != null && !type_use.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Annotation.class)
    {
      switch (derivedFeatureID)
      {
        case AbsPackage.TYPE_USE__PURE_EXP: return AbsPackage.ANNOTATION__PURE_EXP;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Annotation.class)
    {
      switch (baseFeatureID)
      {
        case AbsPackage.ANNOTATION__PURE_EXP: return AbsPackage.TYPE_USE__PURE_EXP;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //Type_useImpl
