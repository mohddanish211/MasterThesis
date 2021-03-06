/**
 * Author Mohd.Danish-- Xtext 2.13.0
 */
package org.xtext.abs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.Feature_decl_attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature decl attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.Feature_decl_attributeImpl#getBoundary_val <em>Boundary val</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Feature_decl_attributeImpl#getLBoundary_int <em>LBoundary int</em>}</li>
 *   <li>{@link org.xtext.abs.impl.Feature_decl_attributeImpl#getUBoundary_int <em>UBoundary int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Feature_decl_attributeImpl extends MinimalEObjectImpl.Container implements Feature_decl_attribute
{
  /**
   * The cached value of the '{@link #getBoundary_val() <em>Boundary val</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundary_val()
   * @generated
   * @ordered
   */
  protected EList<String> boundary_val;

  /**
   * The default value of the '{@link #getLBoundary_int() <em>LBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLBoundary_int()
   * @generated
   * @ordered
   */
  protected static final String LBOUNDARY_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLBoundary_int() <em>LBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLBoundary_int()
   * @generated
   * @ordered
   */
  protected String lBoundary_int = LBOUNDARY_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getUBoundary_int() <em>UBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUBoundary_int()
   * @generated
   * @ordered
   */
  protected static final String UBOUNDARY_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUBoundary_int() <em>UBoundary int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUBoundary_int()
   * @generated
   * @ordered
   */
  protected String uBoundary_int = UBOUNDARY_INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Feature_decl_attributeImpl()
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
    return AbsPackage.Literals.FEATURE_DECL_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBoundary_val()
  {
    if (boundary_val == null)
    {
      boundary_val = new EDataTypeEList<String>(String.class, this, AbsPackage.FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL);
    }
    return boundary_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLBoundary_int()
  {
    return lBoundary_int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLBoundary_int(String newLBoundary_int)
  {
    String oldLBoundary_int = lBoundary_int;
    lBoundary_int = newLBoundary_int;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT, oldLBoundary_int, lBoundary_int));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUBoundary_int()
  {
    return uBoundary_int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUBoundary_int(String newUBoundary_int)
  {
    String oldUBoundary_int = uBoundary_int;
    uBoundary_int = newUBoundary_int;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT, oldUBoundary_int, uBoundary_int));
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
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL:
        return getBoundary_val();
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT:
        return getLBoundary_int();
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT:
        return getUBoundary_int();
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
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL:
        getBoundary_val().clear();
        getBoundary_val().addAll((Collection<? extends String>)newValue);
        return;
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT:
        setLBoundary_int((String)newValue);
        return;
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT:
        setUBoundary_int((String)newValue);
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
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL:
        getBoundary_val().clear();
        return;
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT:
        setLBoundary_int(LBOUNDARY_INT_EDEFAULT);
        return;
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT:
        setUBoundary_int(UBOUNDARY_INT_EDEFAULT);
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
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__BOUNDARY_VAL:
        return boundary_val != null && !boundary_val.isEmpty();
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__LBOUNDARY_INT:
        return LBOUNDARY_INT_EDEFAULT == null ? lBoundary_int != null : !LBOUNDARY_INT_EDEFAULT.equals(lBoundary_int);
      case AbsPackage.FEATURE_DECL_ATTRIBUTE__UBOUNDARY_INT:
        return UBOUNDARY_INT_EDEFAULT == null ? uBoundary_int != null : !UBOUNDARY_INT_EDEFAULT.equals(uBoundary_int);
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
    result.append(" (boundary_val: ");
    result.append(boundary_val);
    result.append(", lBoundary_int: ");
    result.append(lBoundary_int);
    result.append(", uBoundary_int: ");
    result.append(uBoundary_int);
    result.append(')');
    return result.toString();
  }

} //Feature_decl_attributeImpl
