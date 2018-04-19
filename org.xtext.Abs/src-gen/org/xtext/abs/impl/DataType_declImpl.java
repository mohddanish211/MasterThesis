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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.abs.AbsPackage;
import org.xtext.abs.DataType_decl;
import org.xtext.abs.Data_constructor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.abs.impl.DataType_declImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.DataType_declImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.abs.impl.DataType_declImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.xtext.abs.impl.DataType_declImpl#getData_constructor <em>Data constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataType_declImpl extends DeclImpl implements DataType_decl
{
  /**
   * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected static final String LT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected String lt = LT_EDEFAULT;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected EList<String> p;

  /**
   * The default value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected static final String GT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected String gt = GT_EDEFAULT;

  /**
   * The cached value of the '{@link #getData_constructor() <em>Data constructor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData_constructor()
   * @generated
   * @ordered
   */
  protected EList<Data_constructor> data_constructor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataType_declImpl()
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
    return AbsPackage.Literals.DATA_TYPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLt()
  {
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt(String newLt)
  {
    String oldLt = lt;
    lt = newLt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DATA_TYPE_DECL__LT, oldLt, lt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getP()
  {
    if (p == null)
    {
      p = new EDataTypeEList<String>(String.class, this, AbsPackage.DATA_TYPE_DECL__P);
    }
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGt()
  {
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt(String newGt)
  {
    String oldGt = gt;
    gt = newGt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AbsPackage.DATA_TYPE_DECL__GT, oldGt, gt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data_constructor> getData_constructor()
  {
    if (data_constructor == null)
    {
      data_constructor = new EObjectContainmentEList<Data_constructor>(Data_constructor.class, this, AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR);
    }
    return data_constructor;
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
      case AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR:
        return ((InternalEList<?>)getData_constructor()).basicRemove(otherEnd, msgs);
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
      case AbsPackage.DATA_TYPE_DECL__LT:
        return getLt();
      case AbsPackage.DATA_TYPE_DECL__P:
        return getP();
      case AbsPackage.DATA_TYPE_DECL__GT:
        return getGt();
      case AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR:
        return getData_constructor();
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
      case AbsPackage.DATA_TYPE_DECL__LT:
        setLt((String)newValue);
        return;
      case AbsPackage.DATA_TYPE_DECL__P:
        getP().clear();
        getP().addAll((Collection<? extends String>)newValue);
        return;
      case AbsPackage.DATA_TYPE_DECL__GT:
        setGt((String)newValue);
        return;
      case AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR:
        getData_constructor().clear();
        getData_constructor().addAll((Collection<? extends Data_constructor>)newValue);
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
      case AbsPackage.DATA_TYPE_DECL__LT:
        setLt(LT_EDEFAULT);
        return;
      case AbsPackage.DATA_TYPE_DECL__P:
        getP().clear();
        return;
      case AbsPackage.DATA_TYPE_DECL__GT:
        setGt(GT_EDEFAULT);
        return;
      case AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR:
        getData_constructor().clear();
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
      case AbsPackage.DATA_TYPE_DECL__LT:
        return LT_EDEFAULT == null ? lt != null : !LT_EDEFAULT.equals(lt);
      case AbsPackage.DATA_TYPE_DECL__P:
        return p != null && !p.isEmpty();
      case AbsPackage.DATA_TYPE_DECL__GT:
        return GT_EDEFAULT == null ? gt != null : !GT_EDEFAULT.equals(gt);
      case AbsPackage.DATA_TYPE_DECL__DATA_CONSTRUCTOR:
        return data_constructor != null && !data_constructor.isEmpty();
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
    result.append(" (lt: ");
    result.append(lt);
    result.append(", p: ");
    result.append(p);
    result.append(", gt: ");
    result.append(gt);
    result.append(')');
    return result.toString();
  }

} //DataType_declImpl
