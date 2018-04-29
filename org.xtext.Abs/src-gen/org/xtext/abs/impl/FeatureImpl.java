/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.FeatureImpl#getFeature_decl <em>Feature decl</em>}</li>
 *   <li>{@link org.xtext.abs.impl.FeatureImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.impl.FeatureImpl#getAttr_assignment <em>Attr assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The cached value of the '{@link #getFeature_decl() <em>Feature decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature_decl()
   * @generated
   * @ordered
   */
  protected Feature_decl feature_decl;

  /**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected static final String P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected String p = P_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttr_assignment() <em>Attr assignment</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr_assignment()
   * @generated
   * @ordered
   */
  protected EList<String> attr_assignment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return AbsPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl getFeature_decl()
  {
    if (feature_decl != null && feature_decl.eIsProxy())
    {
      InternalEObject oldFeature_decl = (InternalEObject)feature_decl;
      feature_decl = (Feature_decl)eResolveProxy(oldFeature_decl);
      if (feature_decl != oldFeature_decl)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbsPackage.FEATURE__FEATURE_DECL, oldFeature_decl, feature_decl));
      }
    }
    return feature_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature_decl basicGetFeature_decl()
  {
    return feature_decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature_decl(Feature_decl newFeature_decl)
  {
    Feature_decl oldFeature_decl = feature_decl;
    feature_decl = newFeature_decl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE__FEATURE_DECL, oldFeature_decl, feature_decl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(String newP)
  {
    String oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE__P, oldP, p));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttr_assignment()
  {
    if (attr_assignment == null)
    {
      attr_assignment = new EDataTypeEList<String>(String.class, this, AbsPackage.FEATURE__ATTR_ASSIGNMENT);
    }
    return attr_assignment;
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
      case AbsPackage.FEATURE__FEATURE_DECL:
        if (resolve) return getFeature_decl();
        return basicGetFeature_decl();
      case AbsPackage.FEATURE__P:
        return getP();
      case AbsPackage.FEATURE__ATTR_ASSIGNMENT:
        return getAttr_assignment();
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
      case AbsPackage.FEATURE__FEATURE_DECL:
        setFeature_decl((Feature_decl)newValue);
        return;
      case AbsPackage.FEATURE__P:
        setP((String)newValue);
        return;
      case AbsPackage.FEATURE__ATTR_ASSIGNMENT:
        getAttr_assignment().clear();
        getAttr_assignment().addAll((Collection<? extends String>)newValue);
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
      case AbsPackage.FEATURE__FEATURE_DECL:
        setFeature_decl((Feature_decl)null);
        return;
      case AbsPackage.FEATURE__P:
        setP(P_EDEFAULT);
        return;
      case AbsPackage.FEATURE__ATTR_ASSIGNMENT:
        getAttr_assignment().clear();
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
      case AbsPackage.FEATURE__FEATURE_DECL:
        return feature_decl != null;
      case AbsPackage.FEATURE__P:
        return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
      case AbsPackage.FEATURE__ATTR_ASSIGNMENT:
        return attr_assignment != null && !attr_assignment.isEmpty();
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
    result.append(" (p: ");
    result.append(p);
    result.append(", attr_assignment: ");
    result.append(attr_assignment);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
