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
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Feature_decl_attribute;
import org.xtext.abs.Feature_decl_constraint;
import org.xtext.abs.Feature_decl_group;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Feature_declImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Feature_declImpl#getFeature_decl_group <em>Feature decl group</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Feature_declImpl#getFeature_decl_attribute <em>Feature decl attribute</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Feature_declImpl#getFeature_decl_constraint <em>Feature decl constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Feature_declImpl extends FnodeImpl implements Feature_decl
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
   * The cached value of the '{@link #getFeature_decl_group() <em>Feature decl group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature_decl_group()
   * @generated
   * @ordered
   */
  protected Feature_decl_group feature_decl_group;

  /**
   * The cached value of the '{@link #getFeature_decl_attribute() <em>Feature decl attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature_decl_attribute()
   * @generated
   * @ordered
   */
  protected EList<Feature_decl_attribute> feature_decl_attribute;

  /**
   * The cached value of the '{@link #getFeature_decl_constraint() <em>Feature decl constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature_decl_constraint()
   * @generated
   * @ordered
   */
  protected EList<Feature_decl_constraint> feature_decl_constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Feature_declImpl()
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
    return AbsPackage.Literals.FEATURE_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl_group getFeature_decl_group()
  {
    return feature_decl_group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeature_decl_group(Feature_decl_group newFeature_decl_group, NotificationChain msgs)
  {
    Feature_decl_group oldFeature_decl_group = feature_decl_group;
    feature_decl_group = newFeature_decl_group;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP, oldFeature_decl_group, newFeature_decl_group);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature_decl_group(Feature_decl_group newFeature_decl_group)
  {
    if (newFeature_decl_group != feature_decl_group)
    {
      NotificationChain msgs = null;
      if (feature_decl_group != null)
        msgs = ((InternalEObject)feature_decl_group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP, null, msgs);
      if (newFeature_decl_group != null)
        msgs = ((InternalEObject)newFeature_decl_group).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP, null, msgs);
      msgs = basicSetFeature_decl_group(newFeature_decl_group, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP, newFeature_decl_group, newFeature_decl_group));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature_decl_attribute> getFeature_decl_attribute()
  {
    if (feature_decl_attribute == null)
    {
      feature_decl_attribute = new EObjectContainmentEList<Feature_decl_attribute>(Feature_decl_attribute.class, this, AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE);
    }
    return feature_decl_attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature_decl_constraint> getFeature_decl_constraint()
  {
    if (feature_decl_constraint == null)
    {
      feature_decl_constraint = new EObjectContainmentEList<Feature_decl_constraint>(Feature_decl_constraint.class, this, AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT);
    }
    return feature_decl_constraint;
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
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP:
        return basicSetFeature_decl_group(null, msgs);
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE:
        return ((InternalEList<?>)getFeature_decl_attribute()).basicRemove(otherEnd, msgs);
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT:
        return ((InternalEList<?>)getFeature_decl_constraint()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.FEATURE_DECL__NAME:
        return getName();
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP:
        return getFeature_decl_group();
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE:
        return getFeature_decl_attribute();
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT:
        return getFeature_decl_constraint();
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
      case AbsPackage.FEATURE_DECL__NAME:
        setName((String)newValue);
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP:
        setFeature_decl_group((Feature_decl_group)newValue);
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE:
        getFeature_decl_attribute().clear();
        getFeature_decl_attribute().addAll((Collection<? extends Feature_decl_attribute>)newValue);
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT:
        getFeature_decl_constraint().clear();
        getFeature_decl_constraint().addAll((Collection<? extends Feature_decl_constraint>)newValue);
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
      case AbsPackage.FEATURE_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP:
        setFeature_decl_group((Feature_decl_group)null);
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE:
        getFeature_decl_attribute().clear();
        return;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT:
        getFeature_decl_constraint().clear();
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
      case AbsPackage.FEATURE_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_GROUP:
        return feature_decl_group != null;
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_ATTRIBUTE:
        return feature_decl_attribute != null && !feature_decl_attribute.isEmpty();
      case AbsPackage.FEATURE_DECL__FEATURE_DECL_CONSTRAINT:
        return feature_decl_constraint != null && !feature_decl_constraint.isEmpty();
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

} //Feature_declImpl
